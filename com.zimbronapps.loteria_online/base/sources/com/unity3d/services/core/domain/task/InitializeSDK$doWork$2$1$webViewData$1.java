package com.unity3d.services.core.domain.task;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;

@f(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2$1$webViewData$1", f = "InitializeSDK.kt", l = {84}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeSDK$doWork$2$1$webViewData$1 extends l implements p {
    final /* synthetic */ Object $configResult;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2$1$webViewData$1(InitializeSDK initializeSDK, Object obj, e eVar) {
        super(2, eVar);
        this.this$0 = initializeSDK;
        this.$configResult = obj;
    }

    public final e create(Object obj, e eVar) {
        return new InitializeSDK$doWork$2$1$webViewData$1(this.this$0, this.$configResult, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((InitializeSDK$doWork$2$1$webViewData$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            InitializeStateLoadWeb access$getInitializeStateLoadWeb$p = InitializeSDK.access$getInitializeStateLoadWeb$p(this.this$0);
            Object obj2 = this.$configResult;
            t.b(obj2);
            InitializeStateLoadWeb.Params params = new InitializeStateLoadWeb.Params((Configuration) obj2);
            this.label = 1;
            if (access$getInitializeStateLoadWeb$p.invoke-gIAlu-s(params, this) == f) {
                return f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            ((s) obj).j();
        }
        return I.a;
    }
}
