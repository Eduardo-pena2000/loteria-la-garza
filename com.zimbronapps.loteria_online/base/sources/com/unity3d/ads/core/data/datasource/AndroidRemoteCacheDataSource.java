package com.unity3d.ads.core.data.datasource;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.l;
import Na.n;
import Qa.p;
import cb.K;
import cb.O;
import cb.i;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidRemoteCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;
    private final HttpClient httpClient;
    private final K ioDispatcher;

    @f(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource", f = "AndroidRemoteCacheDataSource.kt", l = {57, 65}, m = "getFile")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidRemoteCacheDataSource.this.getFile(null, null, null, null, this);
        }
    }

    @f(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$saveToCache$2", f = "AndroidRemoteCacheDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ Object $body;
        final /* synthetic */ File $dest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Object obj, File file, e eVar) {
            super(2, eVar);
            this.$body = obj;
            this.$dest = file;
        }

        public final e create(Object obj, e eVar) {
            return new 2(this.$body, this.$dest, eVar);
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
            Object obj2 = this.$body;
            if (obj2 instanceof File) {
                n.t((File) obj2, this.$dest, true, 0, 4, null);
                return Ia.b.a(((File) this.$body).delete());
            }
            if (obj2 instanceof byte[]) {
                this.$dest.createNewFile();
                Na.l.m(this.$dest, (byte[]) this.$body);
                return I.a;
            }
            if (obj2 instanceof String) {
                this.$dest.createNewFile();
                Na.l.o(this.$dest, (String) this.$body, null, 2, null);
                return I.a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown body type ");
            Object obj3 = this.$body;
            sb.append(obj3 != null ? obj3.getClass().getSimpleName() : null);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public AndroidRemoteCacheDataSource(K ioDispatcher, CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl, HttpClient httpClient) {
        kotlin.jvm.internal.t.g(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.t.g(createFile, "createFile");
        kotlin.jvm.internal.t.g(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        kotlin.jvm.internal.t.g(httpClient, "httpClient");
        this.ioDispatcher = ioDispatcher;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClient = httpClient;
    }

    public static final /* synthetic */ Object access$downloadFile(AndroidRemoteCacheDataSource androidRemoteCacheDataSource, String str, Integer num, e eVar) {
        return androidRemoteCacheDataSource.downloadFile(str, num, eVar);
    }

    public static final /* synthetic */ Object access$saveToCache(AndroidRemoteCacheDataSource androidRemoteCacheDataSource, File file, Object obj, e eVar) {
        return androidRemoteCacheDataSource.saveToCache(file, obj, eVar);
    }

    private final Object downloadFile(String str, Integer num, e eVar) {
        return this.httpClient.execute(new HttpRequest(str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, num != null ? num.intValue() : Integer.MAX_VALUE, 65534, null), eVar);
    }

    private final Object saveToCache(File file, Object obj, e eVar) {
        Object g = i.g(this.ioDispatcher, new 2(obj, file, null), eVar);
        return g == c.f() ? g : I.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getFile(java.io.File r18, java.lang.String r19, java.lang.String r20, java.lang.Integer r21, Ga.e r22) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFile(java.io.File, java.lang.String, java.lang.String, java.lang.Integer, Ga.e):java.lang.Object");
    }
}
