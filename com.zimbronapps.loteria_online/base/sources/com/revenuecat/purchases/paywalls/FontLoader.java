package com.revenuecat.purchases.paywalls;

import Ca.I;
import Ca.l;
import Ca.m;
import Ca.n;
import Ca.o;
import Ca.s;
import Da.D;
import Da.Y;
import Da.r;
import Ga.e;
import Ha.c;
import Ia.f;
import Qa.p;
import Za.B;
import Za.E;
import android.content.Context;
import cb.B0;
import cb.O;
import cb.P;
import cb.Q;
import cb.W0;
import cb.e0;
import cb.i;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfoKt;
import com.revenuecat.purchases.utils.DefaultUrlConnectionFactory;
import com.revenuecat.purchases.utils.Result;
import com.revenuecat.purchases.utils.UrlConnection;
import com.revenuecat.purchases.utils.UrlConnectionFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FontLoader {
    private final l cacheDirectory$delegate;
    private final Map cachedFontFamilyByFamilyName;
    private final Map cachedFontFamilyByFontInfo;
    private final Context context;
    private final Map fontInfosForHash;
    private AtomicBoolean hasCheckedFoldersExist;
    private final O ioScope;
    private final Object lock;
    private final l md$delegate;
    private final File providedCacheDir;
    private final UrlConnectionFactory urlConnectionFactory;

    public static final class 1 extends u implements Qa.l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final CharSequence invoke(byte b) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            t.f(format, "format(...)");
            return format;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).byteValue());
        }
    }

    @f(c = "com.revenuecat.purchases.paywalls.FontLoader$startFontDownload$1", f = "FontLoader.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        final /* synthetic */ String $expectedMd5;
        final /* synthetic */ DownloadableFontInfo $fontInfo;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, String str2, DownloadableFontInfo downloadableFontInfo, e eVar) {
            super(2, eVar);
            this.$url = str;
            this.$expectedMd5 = str2;
            this.$fontInfo = downloadableFontInfo;
        }

        public final e create(Object obj, e eVar) {
            return FontLoader.this.new 1(this.$url, this.$expectedMd5, this.$fontInfo, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object access$getLock$p;
            FontLoader fontLoader;
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            File access$getCacheDirectory = FontLoader.access$getCacheDirectory(FontLoader.this);
            if (access$getCacheDirectory == null) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Cannot download font: cache directory is not available", null);
                return I.a;
            }
            if (!FontLoader.access$ensureFoldersExist(FontLoader.this, access$getCacheDirectory)) {
                return I.a;
            }
            FontLoader fontLoader2 = FontLoader.this;
            byte[] bytes = this.$url.getBytes(Za.c.b);
            t.f(bytes, "getBytes(...)");
            String access$md5Hex = FontLoader.access$md5Hex(fontLoader2, bytes);
            String W0 = E.W0(this.$url, '.', "");
            File file = new File(access$getCacheDirectory, access$md5Hex + '.' + W0);
            Object access$getLock$p2 = FontLoader.access$getLock$p(FontLoader.this);
            FontLoader fontLoader3 = FontLoader.this;
            DownloadableFontInfo downloadableFontInfo = this.$fontInfo;
            String str = this.$url;
            synchronized (access$getLock$p2) {
                Set set = (Set) FontLoader.access$getFontInfosForHash$p(fontLoader3).get(access$md5Hex);
                if (set != null) {
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), "Font download already in progress for " + str);
                    }
                    set.add(downloadableFontInfo);
                    return I.a;
                }
                FontLoader.access$getFontInfosForHash$p(fontLoader3).put(access$md5Hex, Y.c(new DownloadableFontInfo[]{downloadableFontInfo}));
                I i = I.a;
                if (file.exists()) {
                    FontLoader.access$addFileToCache(FontLoader.this, access$md5Hex, file);
                    return I.a;
                }
                try {
                    Object obj2 = FontLoader.access$performDownloadAndCache-yxL6bBk(FontLoader.this, this.$url, this.$expectedMd5, access$md5Hex, W0, access$getCacheDirectory);
                    FontLoader fontLoader4 = FontLoader.this;
                    if (s.h(obj2)) {
                        FontLoader.access$addFileToCache(fontLoader4, access$md5Hex, (File) obj2);
                    }
                    DownloadableFontInfo downloadableFontInfo2 = this.$fontInfo;
                    if (s.e(obj2) != null) {
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to download font for " + downloadableFontInfo2.getFamily(), null);
                    }
                    access$getLock$p = FontLoader.access$getLock$p(FontLoader.this);
                    fontLoader = FontLoader.this;
                } catch (Throwable th) {
                    try {
                        String str2 = this.$url;
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error downloading remote font from " + str2, th);
                        access$getLock$p = FontLoader.access$getLock$p(FontLoader.this);
                        FontLoader fontLoader5 = FontLoader.this;
                        synchronized (access$getLock$p) {
                        }
                    } catch (Throwable th2) {
                        Object access$getLock$p3 = FontLoader.access$getLock$p(FontLoader.this);
                        FontLoader fontLoader6 = FontLoader.this;
                        synchronized (access$getLock$p3) {
                            throw th2;
                        }
                    }
                }
                synchronized (access$getLock$p) {
                    return I.a;
                }
            }
        }
    }

    public FontLoader(Context context, File file, O o, UrlConnectionFactory urlConnectionFactory) {
        t.g(context, "context");
        t.g(o, "ioScope");
        t.g(urlConnectionFactory, "urlConnectionFactory");
        this.context = context;
        this.providedCacheDir = file;
        this.ioScope = o;
        this.urlConnectionFactory = urlConnectionFactory;
        this.hasCheckedFoldersExist = new AtomicBoolean(false);
        this.cacheDirectory$delegate = m.a(n.a, new FontLoader$cacheDirectory$2(this));
        this.md$delegate = m.b(FontLoader$md$2.INSTANCE);
        this.fontInfosForHash = new LinkedHashMap();
        this.lock = new Object();
        this.cachedFontFamilyByFontInfo = new LinkedHashMap();
        this.cachedFontFamilyByFamilyName = new LinkedHashMap();
    }

    public static final /* synthetic */ void access$addFileToCache(FontLoader fontLoader, String str, File file) {
        fontLoader.addFileToCache(str, file);
    }

    public static final /* synthetic */ boolean access$ensureFoldersExist(FontLoader fontLoader, File file) {
        return fontLoader.ensureFoldersExist(file);
    }

    public static final /* synthetic */ File access$getCacheDirectory(FontLoader fontLoader) {
        return fontLoader.getCacheDirectory();
    }

    public static final /* synthetic */ Context access$getContext$p(FontLoader fontLoader) {
        return fontLoader.context;
    }

    public static final /* synthetic */ Map access$getFontInfosForHash$p(FontLoader fontLoader) {
        return fontLoader.fontInfosForHash;
    }

    public static final /* synthetic */ Object access$getLock$p(FontLoader fontLoader) {
        return fontLoader.lock;
    }

    public static final /* synthetic */ File access$getProvidedCacheDir$p(FontLoader fontLoader) {
        return fontLoader.providedCacheDir;
    }

    public static final /* synthetic */ String access$md5Hex(FontLoader fontLoader, byte[] bArr) {
        return fontLoader.md5Hex(bArr);
    }

    public static final /* synthetic */ Object access$performDownloadAndCache-yxL6bBk(FontLoader fontLoader, String str, String str2, String str3, String str4, File file) {
        return fontLoader.performDownloadAndCache-yxL6bBk(str, str2, str3, str4, file);
    }

    private final void addFileToCache(String str, File file) {
        synchronized (this.lock) {
            try {
                Set<DownloadableFontInfo> set = (Set) this.fontInfosForHash.get(str);
                if (set == null) {
                    set = Y.b();
                }
                for (DownloadableFontInfo downloadableFontInfo : set) {
                    String family = downloadableFontInfo.getFamily();
                    if (this.cachedFontFamilyByFontInfo.get(downloadableFontInfo) != null) {
                        LogLevel logLevel = LogLevel.VERBOSE;
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.v("[Purchases] - " + logLevel.name(), "Font already cached for " + family + ". Skipping download.");
                        }
                    } else {
                        DownloadedFontFamily downloadedFontFamily = (DownloadedFontFamily) this.cachedFontFamilyByFamilyName.get(family);
                        if (downloadedFontFamily != null) {
                            this.cachedFontFamilyByFamilyName.put(family, new DownloadedFontFamily(downloadedFontFamily.getFamily(), D.w0(downloadedFontFamily.getFonts(), new DownloadedFont(downloadableFontInfo.getWeight(), downloadableFontInfo.getStyle(), file))));
                            this.cachedFontFamilyByFontInfo.put(downloadableFontInfo, family);
                        } else {
                            DownloadedFontFamily downloadedFontFamily2 = new DownloadedFontFamily(family, Da.u.e(new DownloadedFont(downloadableFontInfo.getWeight(), downloadableFontInfo.getStyle(), file)));
                            this.cachedFontFamilyByFontInfo.put(downloadableFontInfo, family);
                            this.cachedFontFamilyByFamilyName.put(family, downloadedFontFamily2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void downloadToFile(String str, File file) throws IOException {
        UrlConnection createConnection$default;
        LogLevel logLevel = LogLevel.VERBOSE;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v("[Purchases] - " + logLevel.name(), "Downloading remote font from " + str);
        }
        UrlConnection urlConnection = null;
        try {
            createConnection$default = UrlConnectionFactory.createConnection$default(this.urlConnectionFactory, str, (String) null, 2, (Object) null);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (createConnection$default.getResponseCode() != 200) {
                throw new IOException("HTTP " + createConnection$default.getResponseCode() + " when downloading paywall font: " + str);
            }
            InputStream inputStream = createConnection$default.getInputStream();
            try {
                writeStream(inputStream, file);
                I i = I.a;
                Na.c.a(inputStream, (Throwable) null);
                createConnection$default.disconnect();
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
            urlConnection = createConnection$default;
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            throw th;
        }
    }

    private final boolean ensureFoldersExist(File file) {
        boolean z = true;
        if (this.hasCheckedFoldersExist.get()) {
            return true;
        }
        if (file.exists() || file.mkdirs()) {
            if (!file.isDirectory()) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Remote fonts cache path exists but is not a directory: " + file.getAbsolutePath(), null);
            }
            this.hasCheckedFoldersExist.set(z);
            return z;
        }
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unable to create cache directory for remote fonts: " + file.getAbsolutePath(), null);
        z = false;
        this.hasCheckedFoldersExist.set(z);
        return z;
    }

    private final File getCacheDirectory() {
        return (File) this.cacheDirectory$delegate.getValue();
    }

    private final MessageDigest getMd() {
        Object value = this.md$delegate.getValue();
        t.f(value, "<get-md>(...)");
        return (MessageDigest) value;
    }

    private final String md5Hex(byte[] bArr) {
        byte[] digest = getMd().digest(bArr);
        t.f(digest, "digest");
        return r.w0(digest, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, 1.INSTANCE, 30, (Object) null);
    }

    private final Object performDownloadAndCache-yxL6bBk(String str, String str2, String str3, String str4, File file) throws IOException {
        File file2 = new File(file, str3 + '.' + str4);
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        sb.append(str4);
        File createTempFile = File.createTempFile("rc_paywall_font_download_", sb.toString(), file);
        try {
            t.f(createTempFile, "tempFile");
            downloadToFile(str, createTempFile);
            String md5Hex = md5Hex(Na.l.g(createTempFile));
            if (B.z(md5Hex, str2, true)) {
                if (!createTempFile.renameTo(file2)) {
                    Na.n.t(createTempFile, file2, true, 0, 4, (Object) null);
                    createTempFile.delete();
                }
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Font downloaded successfully from " + str);
                }
                return s.b(file2);
            }
            createTempFile.delete();
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Downloaded font file is corrupt for " + str + ". expected=" + str2 + ", actual=" + md5Hex, null);
            s.a aVar = s.b;
            return s.b(Ca.t.a(new IOException("Downloaded font file is corrupt for " + str)));
        } catch (IOException e) {
            if (createTempFile.exists()) {
                createTempFile.delete();
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error downloading font from " + str + ": " + e.getMessage(), null);
            s.a aVar2 = s.b;
            return s.b(Ca.t.a(e));
        }
    }

    private final void startFontDownload(DownloadableFontInfo downloadableFontInfo) {
        i.d(this.ioScope, (Ga.i) null, (Q) null, new 1(downloadableFontInfo.getUrl(), downloadableFontInfo.getExpectedMd5(), downloadableFontInfo, null), 3, (Object) null);
    }

    private final void writeStream(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    I i = I.a;
                    Na.c.a(fileOutputStream, (Throwable) null);
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } finally {
        }
    }

    public final DownloadedFontFamily getCachedFontFamilyOrStartDownload(UiConfig.AppConfig.FontsConfig.FontInfo.Name name) {
        t.g(name, "fontInfo");
        Result.Success downloadableFontInfo = DownloadableFontInfoKt.toDownloadableFontInfo(name);
        if (!(downloadableFontInfo instanceof Result.Success)) {
            if (!(downloadableFontInfo instanceof Result.Error)) {
                throw new o();
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) ((Result.Error) downloadableFontInfo).getValue(), null);
            return null;
        }
        DownloadableFontInfo downloadableFontInfo2 = (DownloadableFontInfo) downloadableFontInfo.getValue();
        synchronized (this.lock) {
            DownloadedFontFamily downloadedFontFamily = (DownloadedFontFamily) this.cachedFontFamilyByFamilyName.get((String) this.cachedFontFamilyByFontInfo.get(downloadableFontInfo2));
            if (downloadedFontFamily != null) {
                return downloadedFontFamily;
            }
            I i = I.a;
            startFontDownload(downloadableFontInfo2);
            return null;
        }
    }

    public /* synthetic */ FontLoader(Context context, File file, O o, UrlConnectionFactory urlConnectionFactory, int i, k kVar) {
        this(context, (i & 2) != 0 ? null : file, (i & 4) != 0 ? P.a(W0.b((B0) null, 1, (Object) null).plus(e0.b())) : o, (i & 8) != 0 ? new DefaultUrlConnectionFactory() : urlConnectionFactory);
    }
}
