package com.unity3d.services.core.network.core;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import cb.i;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.mapper.HttpRequestToWebRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.request.WebRequest;
import java.util.Map;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LegacyHttpClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String NETWORK_CLIENT_LEGACY = "legacy";
    private final ISDKDispatchers dispatchers;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.unity3d.services.core.network.core.LegacyHttpClient$execute$2", f = "LegacyHttpClient.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(HttpRequest httpRequest, e eVar) {
            super(2, eVar);
            this.$request = httpRequest;
        }

        public final e create(Object obj, e eVar) {
            return new 2(this.$request, eVar);
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
            WebRequest webRequest = HttpRequestToWebRequestKt.toWebRequest(this.$request);
            String makeRequest = webRequest.makeRequest();
            int responseCode = webRequest.getResponseCode();
            Map headers = webRequest.getHeaders();
            String url = webRequest.getUrl().toString();
            if (makeRequest == null) {
                makeRequest = "";
            }
            kotlin.jvm.internal.t.f(headers, "headers");
            kotlin.jvm.internal.t.f(url, "toString()");
            return new HttpResponse(makeRequest, responseCode, headers, url, null, "legacy", 0L, 80, null);
        }
    }

    @f(c = "com.unity3d.services.core.network.core.LegacyHttpClient$executeBlocking$1", f = "LegacyHttpClient.kt", l = {26}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(HttpRequest httpRequest, e eVar) {
            super(2, eVar);
            this.$request = httpRequest;
        }

        public final e create(Object obj, e eVar) {
            return LegacyHttpClient.this.new 1(this.$request, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                LegacyHttpClient legacyHttpClient = LegacyHttpClient.this;
                HttpRequest httpRequest = this.$request;
                this.label = 1;
                obj = legacyHttpClient.execute(httpRequest, this);
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

    public LegacyHttpClient(ISDKDispatchers dispatchers) {
        kotlin.jvm.internal.t.g(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    public Object execute(HttpRequest httpRequest, e eVar) {
        return i.g(this.dispatchers.getIo(), new 2(httpRequest, null), eVar);
    }

    public HttpResponse executeBlocking(HttpRequest request) {
        kotlin.jvm.internal.t.g(request, "request");
        return (HttpResponse) i.e(this.dispatchers.getIo(), new 1(request, null));
    }
}
