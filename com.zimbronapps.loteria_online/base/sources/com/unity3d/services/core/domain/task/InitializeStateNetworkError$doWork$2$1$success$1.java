package com.unity3d.services.core.domain.task;

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

@f(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2$1$success$1", f = "InitializeStateNetworkError.kt", l = {82}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateNetworkError$doWork$2$1$success$1 extends l implements p {
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$2$1$success$1(InitializeStateNetworkError initializeStateNetworkError, e eVar) {
        super(2, eVar);
        this.this$0 = initializeStateNetworkError;
    }

    public final e create(Object obj, e eVar) {
        return new InitializeStateNetworkError$doWork$2$1$success$1(this.this$0, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((InitializeStateNetworkError$doWork$2$1$success$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            InitializeStateNetworkError initializeStateNetworkError = this.this$0;
            this.L$0 = initializeStateNetworkError;
            this.label = 1;
            cb.p pVar = new cb.p(b.c(this), 1);
            pVar.E();
            InitializeStateNetworkError.access$startListening(initializeStateNetworkError, pVar);
            Object w = pVar.w();
            if (w == c.f()) {
                h.c(this);
            }
            if (w == f) {
                return f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return I.a;
    }
}
