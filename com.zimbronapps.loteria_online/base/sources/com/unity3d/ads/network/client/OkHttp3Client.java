package com.unity3d.ads.network.client;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.b;
import Ha.c;
import Ia.f;
import Ia.h;
import Ia.l;
import Qa.p;
import cb.O;
import cb.i;
import com.unity3d.ads.network.HttpClient;
import com.unity3d.ads.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.ads.network.model.HttpResponse;
import com.unity3d.services.core.domain.ISDKDispatchers;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OkHttp3Client implements HttpClient {
    private final OkHttpClient client;
    private final ISDKDispatchers dispatchers;

    @f(c = "com.unity3d.ads.network.client.OkHttp3Client$execute$2", f = "OkHttp3Client.kt", l = {35}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ HttpRequest $request;
        int label;
        final /* synthetic */ OkHttp3Client this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(HttpRequest httpRequest, OkHttp3Client okHttp3Client, e eVar) {
            super(2, eVar);
            this.$request = httpRequest;
            this.this$0 = okHttp3Client;
        }

        public final e create(Object obj, e eVar) {
            return new 2(this.$request, this.this$0, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                Request okHttpRequest = HttpRequestToOkHttpRequestKt.toOkHttpRequest(this.$request);
                OkHttp3Client okHttp3Client = this.this$0;
                long connectTimeout = this.$request.getConnectTimeout();
                long readTimeout = this.$request.getReadTimeout();
                this.label = 1;
                obj = OkHttp3Client.access$makeRequest(okHttp3Client, okHttpRequest, connectTimeout, readTimeout, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            Response response = (Response) obj;
            int f2 = response.f();
            Map g = response.r().g();
            String httpUrl = response.A().j().toString();
            ResponseBody a = response.a();
            String f3 = a != null ? a.f() : null;
            if (f3 == null) {
                f3 = "";
            }
            kotlin.jvm.internal.t.f(g, "toMultimap()");
            kotlin.jvm.internal.t.f(httpUrl, "toString()");
            return new HttpResponse(f3, f2, g, httpUrl);
        }
    }

    public OkHttp3Client(ISDKDispatchers dispatchers, OkHttpClient client) {
        kotlin.jvm.internal.t.g(dispatchers, "dispatchers");
        kotlin.jvm.internal.t.g(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    public static final /* synthetic */ OkHttpClient access$getClient$p(OkHttp3Client okHttp3Client) {
        return okHttp3Client.client;
    }

    public static final /* synthetic */ Object access$makeRequest(OkHttp3Client okHttp3Client, Request request, long j, long j2, e eVar) {
        return okHttp3Client.makeRequest(request, j, j2, eVar);
    }

    private final Object makeRequest(Request request, long j, long j2, e eVar) {
        cb.p pVar = new cb.p(b.c(eVar), 1);
        pVar.E();
        OkHttpClient.Builder x = access$getClient$p(this).x();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x.b(j, timeUnit).G(j2, timeUnit).a().a(request).N0(new OkHttp3Client$makeRequest$2$1(pVar));
        Object w = pVar.w();
        if (w == c.f()) {
            h.c(eVar);
        }
        return w;
    }

    public Object execute(HttpRequest httpRequest, e eVar) {
        return i.g(this.dispatchers.getIo(), new 2(httpRequest, this, null), eVar);
    }
}
