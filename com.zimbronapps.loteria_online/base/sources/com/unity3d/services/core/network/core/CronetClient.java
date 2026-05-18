package com.unity3d.services.core.network.core;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.b;
import Ha.c;
import Ia.f;
import Ia.h;
import Ia.l;
import Qa.p;
import Za.A;
import Za.E;
import cb.O;
import cb.i;
import cb.t0;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CronetClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String MSG_CONNECTION_FAILED = "Network request failed";
    private static final String MSG_CONNECTION_TIMEOUT = "Network request timed out";
    private static final String NETWORK_CLIENT_CRONET = "cronet";
    private final ISDKDispatchers dispatchers;
    private final CronetEngine engine;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.unity3d.services.core.network.core.CronetClient$executeBlocking$1", f = "CronetClient.kt", l = {31}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(HttpRequest httpRequest, e eVar) {
            super(2, eVar);
            this.$request = httpRequest;
        }

        public final e create(Object obj, e eVar) {
            return CronetClient.this.new 1(this.$request, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                CronetClient cronetClient = CronetClient.this;
                HttpRequest httpRequest = this.$request;
                this.label = 1;
                obj = cronetClient.execute(httpRequest, this);
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

    public CronetClient(CronetEngine engine, ISDKDispatchers dispatchers) {
        kotlin.jvm.internal.t.g(engine, "engine");
        kotlin.jvm.internal.t.g(dispatchers, "dispatchers");
        this.engine = engine;
        this.dispatchers = dispatchers;
    }

    public static final /* synthetic */ String access$buildUrl(CronetClient cronetClient, HttpRequest httpRequest) {
        return cronetClient.buildUrl(httpRequest);
    }

    public static final /* synthetic */ long access$getContentSize(CronetClient cronetClient, UrlResponseInfo urlResponseInfo) {
        return cronetClient.getContentSize(urlResponseInfo);
    }

    public static final /* synthetic */ ISDKDispatchers access$getDispatchers$p(CronetClient cronetClient) {
        return cronetClient.dispatchers;
    }

    public static final /* synthetic */ CronetEngine access$getEngine$p(CronetClient cronetClient) {
        return cronetClient.engine;
    }

    public static final /* synthetic */ int access$getPriority(CronetClient cronetClient, int i) {
        return cronetClient.getPriority(i);
    }

    private final String buildUrl(HttpRequest httpRequest) {
        return E.C0(E.k1(httpRequest.getBaseURL(), '/') + '/' + E.k1(httpRequest.getPath(), '/'), "/");
    }

    private final long getContentSize(UrlResponseInfo urlResponseInfo) {
        String str;
        Long r;
        List list = (List) urlResponseInfo.getAllHeaders().get("Content-Length");
        if (list == null || (str = (String) list.get(0)) == null || (r = A.r(str)) == null) {
            return -1L;
        }
        return r.longValue();
    }

    private final int getPriority(int i) {
        if (i == 0) {
            return 4;
        }
        if (i != 1) {
            return i != 2 ? 1 : 2;
        }
        return 3;
    }

    public Object execute(HttpRequest httpRequest, e eVar) {
        byte[] bArr;
        cb.p pVar = new cb.p(b.c(eVar), 1);
        pVar.E();
        CronetClient$execute$2$callback$1 cronetClient$execute$2$callback$1 = new CronetClient$execute$2$callback$1(pVar, this, access$getDispatchers$p(this), httpRequest.getReadTimeout());
        UrlRequest.Builder newUrlRequestBuilder = access$getEngine$p(this).newUrlRequestBuilder(access$buildUrl(this, httpRequest), cronetClient$execute$2$callback$1, t0.a(access$getDispatchers$p(this).getIo()));
        for (Map.Entry entry : httpRequest.getHeaders().entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                newUrlRequestBuilder.addHeader(str, (String) it.next());
            }
        }
        if (httpRequest.getMethod() == RequestType.POST) {
            Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bArr = (byte[]) httpRequest.getBody();
            } else if (body instanceof String) {
                bArr = ((String) httpRequest.getBody()).getBytes(Za.c.b);
                kotlin.jvm.internal.t.f(bArr, "this as java.lang.String).getBytes(charset)");
            } else {
                bArr = new byte[0];
            }
            newUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bArr), t0.a(access$getDispatchers$p(this).getIo()));
        }
        UrlRequest req = newUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(access$getPriority(this, httpRequest.getPriority())).build();
        pVar.z(new CronetClient$execute$2$2(req));
        kotlin.jvm.internal.t.f(req, "req");
        cronetClient$execute$2$callback$1.startTimer(req);
        req.start();
        Object w = pVar.w();
        if (w == c.f()) {
            h.c(eVar);
        }
        return w;
    }

    public HttpResponse executeBlocking(HttpRequest request) {
        kotlin.jvm.internal.t.g(request, "request");
        return (HttpResponse) i.e(this.dispatchers.getIo(), new 1(request, null));
    }

    public final void shutdown() {
        this.engine.shutdown();
    }
}
