package com.revenuecat.purchases.storage;

import Ca.I;
import Ca.q;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.a;
import Qa.p;
import android.content.Context;
import cb.N0;
import cb.O;
import cb.P;
import cb.Q;
import cb.W;
import cb.e0;
import cb.i;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.utils.DefaultUrlConnectionFactory;
import com.revenuecat.purchases.utils.UrlConnection;
import com.revenuecat.purchases.utils.UrlConnectionFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DefaultFileRepository implements FileRepository {
    private final LocalFileCache fileCacheManager;
    private final O ioScope;
    private final LogHandler logHandler;
    private final KeyedDeferredValueStore store;
    private final UrlConnectionFactory urlConnectionFactory;

    public static final class CacheKey {
        private final Checksum checksum;
        private final URL url;

        public CacheKey(URL url, Checksum checksum) {
            t.g(url, "url");
            this.url = url;
            this.checksum = checksum;
        }

        public static /* synthetic */ CacheKey copy$default(CacheKey cacheKey, URL url, Checksum checksum, int i, Object obj) {
            if ((i & 1) != 0) {
                url = cacheKey.url;
            }
            if ((i & 2) != 0) {
                checksum = cacheKey.checksum;
            }
            return cacheKey.copy(url, checksum);
        }

        public final URL component1() {
            return this.url;
        }

        public final Checksum component2() {
            return this.checksum;
        }

        public final CacheKey copy(URL url, Checksum checksum) {
            t.g(url, "url");
            return new CacheKey(url, checksum);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CacheKey)) {
                return false;
            }
            CacheKey cacheKey = (CacheKey) obj;
            return t.c(this.url, cacheKey.url) && t.c(this.checksum, cacheKey.checksum);
        }

        public final Checksum getChecksum() {
            return this.checksum;
        }

        public final URL getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            Checksum checksum = this.checksum;
            return hashCode + (checksum == null ? 0 : checksum.hashCode());
        }

        public String toString() {
            return "CacheKey(url=" + this.url + ", checksum=" + this.checksum + ')';
        }
    }

    public static abstract class Error extends IOException {

        public static final class ChecksumValidationFailed extends Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChecksumValidationFailed(String str) {
                super(str, null);
                t.g(str, "message");
            }
        }

        public static final class FailedToCreateCacheDirectory extends Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FailedToCreateCacheDirectory(String str) {
                super("Failed to create cache directory for " + str, null);
                t.g(str, "url");
            }
        }

        public static final class FailedToFetchFileFromRemoteSource extends Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FailedToFetchFileFromRemoteSource(String str) {
                super(str, null);
                t.g(str, "message");
            }
        }

        public static final class FailedToSaveCachedFile extends Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FailedToSaveCachedFile(String str) {
                super(str, null);
                t.g(str, "message");
            }
        }

        public /* synthetic */ Error(String str, k kVar) {
            this(str);
        }

        private Error(String str) {
            super(str);
        }
    }

    @f(c = "com.revenuecat.purchases.storage.DefaultFileRepository", f = "DefaultFileRepository.kt", l = {131}, m = "downloadFile")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultFileRepository.access$downloadFile(DefaultFileRepository.this, null, this);
        }
    }

    @f(c = "com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$2", f = "DefaultFileRepository.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ URL $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(URL url, e eVar) {
            super(2, eVar);
            this.$url = url;
        }

        public final e create(Object obj, e eVar) {
            return DefaultFileRepository.this.new 2(this.$url, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            URL url = this.$url;
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Downloading remote file from " + url);
            }
            UrlConnectionFactory access$getUrlConnectionFactory$p = DefaultFileRepository.access$getUrlConnectionFactory$p(DefaultFileRepository.this);
            String url2 = this.$url.toString();
            t.f(url2, "url.toString()");
            UrlConnection createConnection$default = UrlConnectionFactory.createConnection$default(access$getUrlConnectionFactory$p, url2, (String) null, 2, (Object) null);
            if (createConnection$default.getResponseCode() == 200) {
                return createConnection$default;
            }
            createConnection$default.disconnect();
            throw new IOException("HTTP " + createConnection$default.getResponseCode() + " when downloading file at: " + this.$url);
        }
    }

    public static final class 2 extends u implements a {
        final /* synthetic */ Checksum $checksum;
        final /* synthetic */ URL $url;

        @f(c = "com.revenuecat.purchases.storage.DefaultFileRepository$generateOrGetCachedFileURL$2$1", f = "DefaultFileRepository.kt", l = {118}, m = "invokeSuspend")
        public static final class 1 extends l implements p {
            final /* synthetic */ Checksum $checksum;
            final /* synthetic */ URL $url;
            Object L$0;
            int label;
            final /* synthetic */ DefaultFileRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(DefaultFileRepository defaultFileRepository, URL url, Checksum checksum, e eVar) {
                super(2, eVar);
                this.this$0 = defaultFileRepository;
                this.$url = url;
                this.$checksum = checksum;
            }

            public final e create(Object obj, e eVar) {
                return new 1(this.this$0, this.$url, this.$checksum, eVar);
            }

            public final Object invoke(O o, e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                URI uri;
                Object f = c.f();
                int i = this.label;
                if (i == 0) {
                    Ca.t.b(obj);
                    URI generateLocalFilesystemURI = DefaultFileRepository.access$getFileCacheManager$p(this.this$0).generateLocalFilesystemURI(this.$url, this.$checksum);
                    if (generateLocalFilesystemURI == null) {
                        String url = this.$url.toString();
                        t.f(url, "url.toString()");
                        Throwable failedToCreateCacheDirectory = new Error.FailedToCreateCacheDirectory(url);
                        DefaultFileRepository.access$getLogHandler$p(this.this$0).e("FileRepository", "Failed to create cache directory for " + this.$url, failedToCreateCacheDirectory);
                        throw failedToCreateCacheDirectory;
                    }
                    if (DefaultFileRepository.access$getFileCacheManager$p(this.this$0).cachedContentExists(generateLocalFilesystemURI)) {
                        return generateLocalFilesystemURI;
                    }
                    DefaultFileRepository defaultFileRepository = this.this$0;
                    URL url2 = this.$url;
                    this.L$0 = generateLocalFilesystemURI;
                    this.label = 1;
                    Object access$downloadFile = DefaultFileRepository.access$downloadFile(defaultFileRepository, url2, this);
                    if (access$downloadFile == f) {
                        return f;
                    }
                    uri = generateLocalFilesystemURI;
                    obj = access$downloadFile;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uri = (URI) this.L$0;
                    Ca.t.b(obj);
                }
                DefaultFileRepository.access$saveCachedFile(this.this$0, uri, (UrlConnection) obj, this.$checksum);
                return uri;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(URL url, Checksum checksum) {
            super(0);
            this.$url = url;
            this.$checksum = checksum;
        }

        public final W invoke() {
            return i.b(DefaultFileRepository.access$getIoScope$p(DefaultFileRepository.this), (Ga.i) null, (Q) null, new 1(DefaultFileRepository.this, this.$url, this.$checksum, null), 3, (Object) null);
        }
    }

    @f(c = "com.revenuecat.purchases.storage.DefaultFileRepository$prefetch$1", f = "DefaultFileRepository.kt", l = {94}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ List $urls;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ DefaultFileRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(List list, DefaultFileRepository defaultFileRepository, e eVar) {
            super(2, eVar);
            this.$urls = list;
            this.this$0 = defaultFileRepository;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$urls, this.this$0, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0059 -> B:7:0x0032). Please report as a decompilation issue!!! */
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            DefaultFileRepository defaultFileRepository;
            URL url;
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                Ca.t.b(obj);
                List list = this.$urls;
                DefaultFileRepository defaultFileRepository2 = this.this$0;
                it = list.iterator();
                defaultFileRepository = defaultFileRepository2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                url = (URL) this.L$2;
                it = (Iterator) this.L$1;
                defaultFileRepository = (DefaultFileRepository) this.L$0;
                try {
                    Ca.t.b(obj);
                } catch (IOException e) {
                    DefaultFileRepository.access$getLogHandler$p(defaultFileRepository).e("FileRepository", "Prefetch failed for " + url + ": " + e, e);
                }
            }
            while (it.hasNext()) {
                q qVar = (q) it.next();
                url = (URL) qVar.a();
                Checksum checksum = (Checksum) qVar.b();
                this.L$0 = defaultFileRepository;
                this.L$1 = it;
                this.L$2 = url;
                this.label = 1;
                if (defaultFileRepository.generateOrGetCachedFileURL(url, checksum, this) == f) {
                    return f;
                }
            }
            return I.a;
        }
    }

    public DefaultFileRepository(KeyedDeferredValueStore keyedDeferredValueStore, LocalFileCache localFileCache, O o, LogHandler logHandler, UrlConnectionFactory urlConnectionFactory) {
        t.g(keyedDeferredValueStore, "store");
        t.g(localFileCache, "fileCacheManager");
        t.g(o, "ioScope");
        t.g(logHandler, "logHandler");
        t.g(urlConnectionFactory, "urlConnectionFactory");
        this.store = keyedDeferredValueStore;
        this.fileCacheManager = localFileCache;
        this.ioScope = o;
        this.logHandler = logHandler;
        this.urlConnectionFactory = urlConnectionFactory;
    }

    public static final /* synthetic */ Object access$downloadFile(DefaultFileRepository defaultFileRepository, URL url, e eVar) {
        return defaultFileRepository.downloadFile(url, eVar);
    }

    public static final /* synthetic */ LocalFileCache access$getFileCacheManager$p(DefaultFileRepository defaultFileRepository) {
        return defaultFileRepository.fileCacheManager;
    }

    public static final /* synthetic */ O access$getIoScope$p(DefaultFileRepository defaultFileRepository) {
        return defaultFileRepository.ioScope;
    }

    public static final /* synthetic */ LogHandler access$getLogHandler$p(DefaultFileRepository defaultFileRepository) {
        return defaultFileRepository.logHandler;
    }

    public static final /* synthetic */ UrlConnectionFactory access$getUrlConnectionFactory$p(DefaultFileRepository defaultFileRepository) {
        return defaultFileRepository.urlConnectionFactory;
    }

    public static final /* synthetic */ void access$saveCachedFile(DefaultFileRepository defaultFileRepository, URI uri, UrlConnection urlConnection, Checksum checksum) {
        defaultFileRepository.saveCachedFile(uri, urlConnection, checksum);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object downloadFile(java.net.URL r6, Ga.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.revenuecat.purchases.storage.DefaultFileRepository.downloadFile.1
            if (r0 == 0) goto L13
            r0 = r7
            com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$1 r0 = (com.revenuecat.purchases.storage.DefaultFileRepository.downloadFile.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$1 r0 = new com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            java.net.URL r6 = (java.net.URL) r6
            java.lang.Object r0 = r0.L$0
            com.revenuecat.purchases.storage.DefaultFileRepository r0 = (com.revenuecat.purchases.storage.DefaultFileRepository) r0
            Ca.t.b(r7)     // Catch: java.io.IOException -> L31
            goto L56
        L31:
            r7 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            Ca.t.b(r7)
            cb.K r7 = cb.e0.b()     // Catch: java.io.IOException -> L59
            com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$2 r2 = new com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$2     // Catch: java.io.IOException -> L59
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.io.IOException -> L59
            r0.L$0 = r5     // Catch: java.io.IOException -> L59
            r0.L$1 = r6     // Catch: java.io.IOException -> L59
            r0.label = r3     // Catch: java.io.IOException -> L59
            java.lang.Object r7 = cb.i.g(r7, r2, r0)     // Catch: java.io.IOException -> L59
            if (r7 != r1) goto L55
            return r1
        L55:
            r0 = r5
        L56:
            com.revenuecat.purchases.utils.UrlConnection r7 = (com.revenuecat.purchases.utils.UrlConnection) r7     // Catch: java.io.IOException -> L31
            return r7
        L59:
            r7 = move-exception
            r0 = r5
        L5b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to fetch file from remote source: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = ". Error: "
            r1.append(r6)
            java.lang.String r6 = r7.getLocalizedMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.revenuecat.purchases.LogHandler r0 = r0.logHandler
            java.lang.String r1 = "FileRepository"
            r0.e(r1, r6, r7)
            com.revenuecat.purchases.storage.DefaultFileRepository$Error$FailedToFetchFileFromRemoteSource r7 = new com.revenuecat.purchases.storage.DefaultFileRepository$Error$FailedToFetchFileFromRemoteSource
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.storage.DefaultFileRepository.downloadFile(java.net.URL, Ga.e):java.lang.Object");
    }

    private final void saveCachedFile(URI uri, UrlConnection urlConnection, Checksum checksum) {
        try {
            try {
                InputStream inputStream = urlConnection.getInputStream();
                try {
                    this.fileCacheManager.saveData(inputStream, uri, checksum);
                    I i = I.a;
                    Na.c.a(inputStream, (Throwable) null);
                } finally {
                }
            } finally {
                urlConnection.disconnect();
            }
        } catch (IOException e) {
            String str = "Failed to save cached file: " + uri + ". Error: " + e.getLocalizedMessage();
            this.logHandler.e("FileRepository", str, e);
            throw new Error.FailedToSaveCachedFile(str);
        } catch (Checksum.ChecksumValidationException e2) {
            String str2 = "Checksum validation failed for " + uri + ": " + e2.getMessage();
            this.logHandler.e("FileRepository", str2, e2);
            throw new Error.ChecksumValidationFailed(str2);
        }
    }

    public Object generateOrGetCachedFileURL(URL url, Checksum checksum, e eVar) {
        return this.store.getOrPut(new CacheKey(url, checksum), new 2(url, checksum)).await(eVar);
    }

    public URI getFile(URL url, Checksum checksum) {
        t.g(url, "url");
        URI generateLocalFilesystemURI = this.fileCacheManager.generateLocalFilesystemURI(url, checksum);
        if (generateLocalFilesystemURI == null) {
            return null;
        }
        if (!this.fileCacheManager.cachedContentExists(generateLocalFilesystemURI)) {
            generateLocalFilesystemURI = null;
        }
        return generateLocalFilesystemURI;
    }

    public final KeyedDeferredValueStore getStore$purchases_defaultsBc8Release() {
        return this.store;
    }

    public void prefetch(List list) {
        t.g(list, "urls");
        i.d(this.ioScope, (Ga.i) null, (Q) null, new 1(list, this, null), 3, (Object) null);
    }

    public /* synthetic */ DefaultFileRepository(KeyedDeferredValueStore keyedDeferredValueStore, LocalFileCache localFileCache, O o, LogHandler logHandler, UrlConnectionFactory urlConnectionFactory, int i, k kVar) {
        this((i & 1) != 0 ? new KeyedDeferredValueStore(null, 1, null) : keyedDeferredValueStore, localFileCache, (i & 4) != 0 ? P.a(e0.b().plus(N0.a)) : o, (i & 8) != 0 ? LogWrapperKt.getCurrentLogHandler() : logHandler, (i & 16) != 0 ? new DefaultUrlConnectionFactory() : urlConnectionFactory);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultFileRepository(Context context) {
        this(null, new DefaultFileCache(context), null, null, null, 29, null);
        t.g(context, "context");
    }
}
