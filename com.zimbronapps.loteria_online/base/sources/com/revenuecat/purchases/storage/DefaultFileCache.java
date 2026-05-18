package com.revenuecat.purchases.storage;

import Ca.I;
import Ca.l;
import Ca.m;
import Da.r;
import Na.b;
import Na.c;
import Na.n;
import Za.E;
import android.content.Context;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.models.ChecksumKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DefaultFileCache implements LocalFileCache {
    private static final int BUFFER_SIZE = 262144;
    public static final Companion Companion = new Companion(null);
    private final l cacheDir$delegate;
    private final Context context;
    private final l md$delegate;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

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

    public DefaultFileCache(Context context) {
        t.g(context, "context");
        this.context = context;
        this.md$delegate = m.b(DefaultFileCache$md$2.INSTANCE);
        this.cacheDir$delegate = m.b(new DefaultFileCache$cacheDir$2(this));
    }

    public static final /* synthetic */ Context access$getContext$p(DefaultFileCache defaultFileCache) {
        return defaultFileCache.context;
    }

    private final File getCacheDir() {
        return (File) this.cacheDir$delegate.getValue();
    }

    private final MessageDigest getMd() {
        Object value = this.md$delegate.getValue();
        t.f(value, "<get-md>(...)");
        return (MessageDigest) value;
    }

    private final boolean isFalse(boolean z) {
        return !z;
    }

    private final String md5Hex(byte[] bArr) {
        byte[] digest = getMd().digest(bArr);
        t.f(digest, "md.digest(bytes)");
        return r.w0(digest, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, 1.INSTANCE, 30, (Object) null);
    }

    private final void streamToFile(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            b.a(inputStream, fileOutputStream, 262144);
            c.a(fileOutputStream, (Throwable) null);
        } finally {
        }
    }

    private final boolean streamToFileAndCompareChecksum(InputStream inputStream, File file, Checksum checksum) throws IOException {
        MessageDigest messageDigest = MessageDigest.getInstance(checksum.getAlgorithm().getAlgorithmName());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[262144];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.flush();
                    I i = I.a;
                    c.a(fileOutputStream, (Throwable) null);
                    byte[] digest = messageDigest.digest();
                    Checksum.Algorithm algorithm = checksum.getAlgorithm();
                    t.f(digest, "hash");
                    return t.c(checksum, new Checksum(algorithm, ChecksumKt.toHexString(digest)));
                }
                messageDigest.update(bArr, 0, read);
                fileOutputStream.write(bArr, 0, read);
            }
        } finally {
        }
    }

    public boolean cachedContentExists(URI uri) {
        t.g(uri, "uri");
        return new File(uri).exists();
    }

    public URI generateLocalFilesystemURI(URL url, Checksum checksum) {
        String str;
        t.g(url, "remoteURL");
        String url2 = url.toString();
        t.f(url2, "remoteURL.toString()");
        byte[] bytes = url2.getBytes(Za.c.b);
        t.f(bytes, "getBytes(...)");
        String md5Hex = md5Hex(bytes);
        StringBuilder sb = new StringBuilder();
        sb.append(new File(md5Hex).getName());
        if (checksum == null || (str = checksum.getValue()) == null) {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (sb2.length() == 0) {
            return null;
        }
        String path = url.getPath();
        t.f(path, "remoteURL.path");
        return new File(getCacheDir(), sb2 + '.' + E.W0(path, '.', "")).toURI();
    }

    public void saveData(InputStream inputStream, URI uri, Checksum checksum) {
        t.g(inputStream, "inputStream");
        t.g(uri, "uri");
        File file = new File(uri);
        File createTempFile = File.createTempFile("rc_download_", ".tmp", file.getParentFile());
        try {
            if (checksum != null) {
                t.f(createTempFile, "tempFile");
                if (isFalse(streamToFileAndCompareChecksum(inputStream, createTempFile, checksum))) {
                    return;
                }
            } else {
                t.f(createTempFile, "tempFile");
                streamToFile(inputStream, createTempFile);
            }
            if (!createTempFile.renameTo(file)) {
                try {
                    n.t(createTempFile, file, true, 0, 4, (Object) null);
                } catch (Exception e) {
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), "Failed to copy temp file to final file: " + e.getMessage());
                    }
                    file.delete();
                }
            }
        } finally {
            createTempFile.delete();
        }
    }
}
