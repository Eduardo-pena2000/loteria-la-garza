package com.unity3d.services.core.domain.task;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1", f = "InitializeStateLoadWeb.kt", l = {71}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateLoadWeb$doWork$2$1$webViewData$1 extends l implements p {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2$1$webViewData$1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, e eVar) {
        super(2, eVar);
        this.this$0 = initializeStateLoadWeb;
        this.$request = httpRequest;
    }

    public final e create(Object obj, e eVar) {
        return new InitializeStateLoadWeb$doWork$2$1$webViewData$1(this.this$0, this.$request, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((InitializeStateLoadWeb$doWork$2$1$webViewData$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            HttpClient access$getHttpClient$p = InitializeStateLoadWeb.access$getHttpClient$p(this.this$0);
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            obj = access$getHttpClient$p.execute(httpRequest, this);
            if (obj == f) {
                return f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return ((HttpResponse) obj).getBody().toString();
    }
}
