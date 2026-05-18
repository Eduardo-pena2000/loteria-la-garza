package com.unity3d.services.core.network.core;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import cb.i;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import kotlin.jvm.internal.k;
import okhttp3.OkHttpClient;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RefactoredOkHttp3Client implements HttpClient {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";
    private final OkHttpClient client;
    private final ISDKDispatchers dispatchers;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.unity3d.services.core.network.core.RefactoredOkHttp3Client", f = "RefactoredOkHttp3Client.kt", l = {119}, m = "execute")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RefactoredOkHttp3Client.this.execute(null, this);
        }
    }

    @f(c = "com.unity3d.services.core.network.core.RefactoredOkHttp3Client$executeBlocking$1", f = "RefactoredOkHttp3Client.kt", l = {37}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(HttpRequest httpRequest, e eVar) {
            super(2, eVar);
            this.$request = httpRequest;
        }

        public final e create(Object obj, e eVar) {
            return RefactoredOkHttp3Client.this.new 1(this.$request, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                RefactoredOkHttp3Client refactoredOkHttp3Client = RefactoredOkHttp3Client.this;
                HttpRequest httpRequest = this.$request;
                this.label = 1;
                obj = refactoredOkHttp3Client.execute(httpRequest, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return obj;
        }
    }

    public RefactoredOkHttp3Client(ISDKDispatchers dispatchers, OkHttpClient client) {
        kotlin.jvm.internal.t.g(dispatchers, "dispatchers");
        kotlin.jvm.internal.t.g(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object execute(com.unity3d.services.core.network.model.HttpRequest r11, Ga.e r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.unity3d.services.core.network.core.RefactoredOkHttp3Client.execute.1
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$1 r0 = (com.unity3d.services.core.network.core.RefactoredOkHttp3Client.execute.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$1 r0 = new com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r11 = r0.L$2
            okhttp3.OkHttpClient r11 = (okhttp3.OkHttpClient) r11
            java.lang.Object r11 = r0.L$1
            okhttp3.Request r11 = (okhttp3.Request) r11
            java.lang.Object r11 = r0.L$0
            com.unity3d.services.core.network.model.HttpRequest r11 = (com.unity3d.services.core.network.model.HttpRequest) r11
            Ca.t.b(r12)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            goto La3
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            Ca.t.b(r12)
            okhttp3.Request r12 = com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(r11)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            okhttp3.OkHttpClient r2 = r10.client     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            okhttp3.OkHttpClient$Builder r2 = r2.x()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            int r4 = r11.getConnectTimeout()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            long r4 = (long) r4     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            okhttp3.OkHttpClient$Builder r2 = r2.b(r4, r6)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            int r4 = r11.getReadTimeout()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            long r4 = (long) r4     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            okhttp3.OkHttpClient$Builder r2 = r2.G(r4, r6)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            int r4 = r11.getWriteTimeout()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            long r4 = (long) r4     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            okhttp3.OkHttpClient$Builder r2 = r2.K(r4, r6)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            okhttp3.OkHttpClient r2 = r2.a()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            r0.L$0 = r11     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            r0.L$1 = r12     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            r0.L$2 = r2     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            r0.label = r3     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            cb.p r4 = new cb.p     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            Ga.e r5 = Ha.b.c(r0)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            r4.<init>(r5, r3)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            r4.E()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            okhttp3.Call r12 = r2.a(r12)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$2$1 r2 = new com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$2$1     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            r2.<init>(r12)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            r4.z(r2)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$2$2 r2 = new com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$2$2     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            r2.<init>(r4)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            r12.N0(r2)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            java.lang.Object r12 = r4.w()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            java.lang.Object r2 = Ha.c.f()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
            if (r12 != r2) goto La0
            Ia.h.c(r0)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lba
        La0:
            if (r12 != r1) goto La3
            return r1
        La3:
            return r12
        La4:
            com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException r12 = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException
            java.lang.String r4 = r11.getBaseURL()
            r8 = 54
            r9 = 0
            java.lang.String r1 = "Network request failed"
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "refactored-okhttp"
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            throw r12
        Lba:
            com.unity3d.ads.core.data.model.exception.NetworkTimeoutException r12 = new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException
            java.lang.String r4 = r11.getBaseURL()
            r8 = 54
            r9 = 0
            java.lang.String r1 = "Network request timeout"
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "refactored-okhttp"
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.RefactoredOkHttp3Client.execute(com.unity3d.services.core.network.model.HttpRequest, Ga.e):java.lang.Object");
    }

    public HttpResponse executeBlocking(HttpRequest request) {
        kotlin.jvm.internal.t.g(request, "request");
        return (HttpResponse) i.e(this.dispatchers.getIo(), new 1(request, null));
    }
}
