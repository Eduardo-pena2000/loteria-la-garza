package com.unity3d.ads.core.data.repository;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.b;
import Ia.d;
import Ia.f;
import Ia.l;
import Na.m;
import Qa.p;
import Ya.r;
import Za.E;
import android.content.Context;
import cb.K;
import cb.N;
import cb.N0;
import cb.O;
import cb.P;
import cb.i;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import fb.z;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.q;
import org.json.JSONArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidCacheRepository implements CacheRepository {
    private final File cacheDir;
    private final CleanupDirectory cleanupDirectory;
    private final Context context;
    private final CreateFile createFile;
    private final DownloadPriorityQueue downloadPriorityQueue;
    private final GetCacheDirectory getCacheDirectory;
    private final CacheDataSource localCacheDataSource;
    private final CacheDataSource remoteCacheDataSource;
    private final O scope;
    private final SessionRepository sessionRepository;
    private final File webviewCacheDir;

    @f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        int label;

        public 2(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return AndroidCacheRepository.this.new 2(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            boolean cleanCache = AndroidCacheRepository.access$getSessionRepository$p(AndroidCacheRepository.this).getNativeConfiguration().getDebugSettings().getCleanCache();
            if (cleanCache || !AndroidCacheRepository.access$getSessionRepository$p(AndroidCacheRepository.this).getNativeConfiguration().hasCachedAssetsConfiguration()) {
                File[] listFiles = AndroidCacheRepository.access$getCacheDir$p(AndroidCacheRepository.this).listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        file.delete();
                    }
                }
            } else {
                NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = AndroidCacheRepository.access$getSessionRepository$p(AndroidCacheRepository.this).getNativeConfiguration().getCachedAssetsConfiguration();
                AndroidCacheRepository.access$getCleanupDirectory$p(AndroidCacheRepository.this).invoke(AndroidCacheRepository.access$getCacheDir$p(AndroidCacheRepository.this), cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
            }
            if (!cleanCache && AndroidCacheRepository.access$getSessionRepository$p(AndroidCacheRepository.this).getNativeConfiguration().hasCachedWebviewFilesConfiguration()) {
                NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = AndroidCacheRepository.access$getSessionRepository$p(AndroidCacheRepository.this).getNativeConfiguration().getCachedWebviewFilesConfiguration();
                AndroidCacheRepository.access$getCleanupDirectory$p(AndroidCacheRepository.this).invoke(AndroidCacheRepository.access$getWebviewCacheDir$p(AndroidCacheRepository.this), cachedWebviewFilesConfiguration.getMaxCachedAssetSizeMb(), cachedWebviewFilesConfiguration.getMaxCachedAssetAgeMs());
                return I.a;
            }
            File[] listFiles2 = AndroidCacheRepository.access$getWebviewCacheDir$p(AndroidCacheRepository.this).listFiles();
            if (listFiles2 == null) {
                return null;
            }
            for (File file2 : listFiles2) {
                file2.delete();
            }
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository", f = "AndroidCacheRepository.kt", l = {100}, m = "doesFileExist")
    public static final class 1 extends d {
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidCacheRepository.this.doesFileExist(null, this);
        }
    }

    @f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        int label;

        public /* synthetic */ class 1 extends q implements Qa.l {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(1, File.class, "isFile", "isFile()Z", 0);
            }

            public final Boolean invoke(File p0) {
                kotlin.jvm.internal.t.g(p0, "p0");
                return Boolean.valueOf(p0.isFile());
            }
        }

        public 2(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return AndroidCacheRepository.this.new 2(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Iterator it = r.r(m.r(AndroidCacheRepository.access$getCacheDir$p(AndroidCacheRepository.this), null, 1, null), 1.INSTANCE).iterator();
            long j = 0;
            while (it.hasNext()) {
                j += ((File) it.next()).length();
            }
            return b.e(j);
        }
    }

    @f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", f = "AndroidCacheRepository.kt", l = {70, 77, 89}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ int $priority;
        final /* synthetic */ String $url;
        Object L$0;
        int label;

        @f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", f = "AndroidCacheRepository.kt", l = {79, 85}, m = "invokeSuspend")
        public static final class 1 extends l implements Qa.l {
            final /* synthetic */ File $cacheDirectory;
            final /* synthetic */ z $fileResult;
            final /* synthetic */ String $filename;
            final /* synthetic */ int $priority;
            final /* synthetic */ String $url;
            int label;
            final /* synthetic */ AndroidCacheRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, int i, z zVar, e eVar) {
                super(1, eVar);
                this.this$0 = androidCacheRepository;
                this.$cacheDirectory = file;
                this.$filename = str;
                this.$url = str2;
                this.$priority = i;
                this.$fileResult = zVar;
            }

            public final e create(e eVar) {
                return new 1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, eVar);
            }

            public final Object invoke(e eVar) {
                return ((1) create(eVar)).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object value;
                CacheResult cacheResult;
                z zVar;
                Object value2;
                Object f = c.f();
                int i = this.label;
                if (i == 0) {
                    t.b(obj);
                    CacheDataSource access$getLocalCacheDataSource$p = AndroidCacheRepository.access$getLocalCacheDataSource$p(this.this$0);
                    File file = this.$cacheDirectory;
                    String str = this.$filename;
                    String str2 = this.$url;
                    Integer d = b.d(this.$priority);
                    this.label = 1;
                    obj = access$getLocalCacheDataSource$p.getFile(file, str, str2, d, this);
                    if (obj == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                        cacheResult = (CacheResult) obj;
                        zVar = this.$fileResult;
                        do {
                            value2 = zVar.getValue();
                        } while (!zVar.e(value2, cacheResult));
                        return I.a;
                    }
                    t.b(obj);
                }
                CacheResult cacheResult2 = (CacheResult) obj;
                if (cacheResult2 instanceof CacheResult.Success) {
                    z zVar2 = this.$fileResult;
                    do {
                        value = zVar2.getValue();
                    } while (!zVar2.e(value, cacheResult2));
                    return I.a;
                }
                CacheDataSource access$getRemoteCacheDataSource$p = AndroidCacheRepository.access$getRemoteCacheDataSource$p(this.this$0);
                File file2 = this.$cacheDirectory;
                String str3 = this.$filename;
                String str4 = this.$url;
                Integer d2 = b.d(this.$priority);
                this.label = 2;
                obj = access$getRemoteCacheDataSource$p.getFile(file2, str3, str4, d2, this);
                if (obj == f) {
                    return f;
                }
                cacheResult = (CacheResult) obj;
                zVar = this.$fileResult;
                do {
                    value2 = zVar.getValue();
                } while (!zVar.e(value2, cacheResult));
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, File file, int i, e eVar) {
            super(2, eVar);
            this.$url = str;
            this.$cacheDirectory = file;
            this.$priority = i;
        }

        public final e create(Object obj, e eVar) {
            return AndroidCacheRepository.this.new 2(this.$url, this.$cacheDirectory, this.$priority, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x009f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r6 = r19
                java.lang.Object r7 = Ha.c.f()
                int r0 = r6.label
                r8 = 0
                r9 = 3
                r10 = 2
                r1 = 1
                if (r0 == 0) goto L36
                if (r0 == r1) goto L2b
                if (r0 == r10) goto L23
                if (r0 != r9) goto L1b
                Ca.t.b(r20)
                r0 = r20
                goto La0
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L23:
                java.lang.Object r0 = r6.L$0
                fb.z r0 = (fb.z) r0
                Ca.t.b(r20)
                goto L91
            L2b:
                java.lang.Object r0 = r6.L$0
                java.lang.String r0 = (java.lang.String) r0
                Ca.t.b(r20)
                r14 = r0
                r0 = r20
                goto L61
            L36:
                Ca.t.b(r20)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                java.lang.String r2 = r6.$url
                java.lang.String r11 = r0.getFilename(r2)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r0)
                java.io.File r2 = r6.$cacheDirectory
                java.lang.String r3 = r6.$url
                int r4 = r6.$priority
                java.lang.Integer r4 = Ia.b.d(r4)
                r6.L$0 = r11
                r6.label = r1
                r1 = r2
                r2 = r11
                r5 = r19
                java.lang.Object r0 = r0.getFile(r1, r2, r3, r4, r5)
                if (r0 != r7) goto L60
                return r7
            L60:
                r14 = r11
            L61:
                com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
                boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                if (r1 == 0) goto L68
                return r0
            L68:
                fb.z r0 = fb.P.a(r8)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r1 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                com.unity3d.ads.core.domain.work.DownloadPriorityQueue r1 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getDownloadPriorityQueue$p(r1)
                int r2 = r6.$priority
                com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1 r3 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r12 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                java.io.File r13 = r6.$cacheDirectory
                java.lang.String r15 = r6.$url
                r18 = 0
                r11 = r3
                r16 = r2
                r17 = r0
                r11.<init>(r12, r13, r14, r15, r16, r17, r18)
                r6.L$0 = r0
                r6.label = r10
                java.lang.Object r1 = r1.invoke(r2, r3, r6)
                if (r1 != r7) goto L91
                return r7
            L91:
                fb.e r0 = fb.g.r(r0)
                r6.L$0 = r8
                r6.label = r9
                java.lang.Object r0 = fb.g.s(r0, r6)
                if (r0 != r7) goto La0
                return r7
            La0:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.getFileInternal.2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidCacheRepository(K ioDispatcher, GetCacheDirectory getCacheDirectory, CacheDataSource localCacheDataSource, CacheDataSource remoteCacheDataSource, Context context, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, DownloadPriorityQueue downloadPriorityQueue, CreateFile createFile) {
        kotlin.jvm.internal.t.g(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.t.g(getCacheDirectory, "getCacheDirectory");
        kotlin.jvm.internal.t.g(localCacheDataSource, "localCacheDataSource");
        kotlin.jvm.internal.t.g(remoteCacheDataSource, "remoteCacheDataSource");
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.t.g(cleanupDirectory, "cleanupDirectory");
        kotlin.jvm.internal.t.g(downloadPriorityQueue, "downloadPriorityQueue");
        kotlin.jvm.internal.t.g(createFile, "createFile");
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = localCacheDataSource;
        this.remoteCacheDataSource = remoteCacheDataSource;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.downloadPriorityQueue = downloadPriorityQueue;
        this.createFile = createFile;
        this.scope = P.h(P.h(P.a(ioDispatcher), new N("CacheRepository")), N0.a);
        this.cacheDir = initCacheDir("UnityAdsCache");
        this.webviewCacheDir = initCacheDir("webview_cache");
    }

    public static final /* synthetic */ File access$getCacheDir$p(AndroidCacheRepository androidCacheRepository) {
        return androidCacheRepository.cacheDir;
    }

    public static final /* synthetic */ CleanupDirectory access$getCleanupDirectory$p(AndroidCacheRepository androidCacheRepository) {
        return androidCacheRepository.cleanupDirectory;
    }

    public static final /* synthetic */ DownloadPriorityQueue access$getDownloadPriorityQueue$p(AndroidCacheRepository androidCacheRepository) {
        return androidCacheRepository.downloadPriorityQueue;
    }

    public static final /* synthetic */ Object access$getFileInternal(AndroidCacheRepository androidCacheRepository, File file, String str, JSONArray jSONArray, int i, e eVar) {
        return androidCacheRepository.getFileInternal(file, str, jSONArray, i, eVar);
    }

    public static final /* synthetic */ CacheDataSource access$getLocalCacheDataSource$p(AndroidCacheRepository androidCacheRepository) {
        return androidCacheRepository.localCacheDataSource;
    }

    public static final /* synthetic */ CacheDataSource access$getRemoteCacheDataSource$p(AndroidCacheRepository androidCacheRepository) {
        return androidCacheRepository.remoteCacheDataSource;
    }

    public static final /* synthetic */ SessionRepository access$getSessionRepository$p(AndroidCacheRepository androidCacheRepository) {
        return androidCacheRepository.sessionRepository;
    }

    public static final /* synthetic */ File access$getWebviewCacheDir$p(AndroidCacheRepository androidCacheRepository) {
        return androidCacheRepository.webviewCacheDir;
    }

    private final Object getFileInternal(File file, String str, JSONArray jSONArray, int i, e eVar) {
        return i.g(this.scope.getCoroutineContext(), new 2(str, file, i, null), eVar);
    }

    private final File initCacheDir(String str) {
        GetCacheDirectory getCacheDirectory = this.getCacheDirectory;
        File cacheDir = this.context.getCacheDir();
        kotlin.jvm.internal.t.f(cacheDir, "context.cacheDir");
        File invoke = getCacheDirectory.invoke(cacheDir, str);
        invoke.mkdirs();
        return invoke;
    }

    public Object clearCache(e eVar) {
        return i.g(this.scope.getCoroutineContext(), new 2(null), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doesFileExist(java.lang.String r5, Ga.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidCacheRepository.doesFileExist.1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = (com.unity3d.ads.core.data.repository.AndroidCacheRepository.doesFileExist.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Ca.t.b(r6)
            r0.label = r3
            java.lang.Object r6 = r4.retrieveFile(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            boolean r5 = r6 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            java.lang.Boolean r5 = Ia.b.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.doesFileExist(java.lang.String, Ga.e):java.lang.Object");
    }

    public Object getCacheSize(e eVar) {
        return i.g(this.scope.getCoroutineContext(), new 2(null), eVar);
    }

    public Object getFile(String str, JSONArray jSONArray, int i, e eVar) {
        return getFileInternal(this.cacheDir, str, jSONArray, i, eVar);
    }

    public final String getFilename(String url) {
        kotlin.jvm.internal.t.g(url, "url");
        return StringExtensionsKt.getSHA256Hash(url) + '.' + E.Y0(url, '.', null, 2, null);
    }

    public Object getWebviewFile(String str, String str2, e eVar) {
        File invoke = this.createFile.invoke(this.webviewCacheDir, str2);
        invoke.mkdirs();
        return getFileInternal(invoke, str, null, 0, eVar);
    }

    public boolean removeFile(CachedFile cachedFile) {
        kotlin.jvm.internal.t.g(cachedFile, "cachedFile");
        File file = cachedFile.getFile();
        if (file != null) {
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                return file.delete();
            }
        }
        return false;
    }

    public Object retrieveFile(String str, e eVar) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, this.cacheDir, str, null, null, eVar, 12, null);
    }
}
