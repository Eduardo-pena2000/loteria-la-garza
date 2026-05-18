package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import b0.C0;
import cb.O;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.TransitionViewKt$AnimatedVisibility$1$1", f = "TransitionView.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TransitionViewKt$AnimatedVisibility$1$1 extends l implements p {
    final /* synthetic */ C0 $shouldShow$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionViewKt$AnimatedVisibility$1$1(C0 c0, e eVar) {
        super(2, eVar);
        this.$shouldShow$delegate = c0;
    }

    public final e create(Object obj, e eVar) {
        return new TransitionViewKt$AnimatedVisibility$1$1(this.$shouldShow$delegate, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((TransitionViewKt$AnimatedVisibility$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        TransitionViewKt.access$AnimatedVisibility$lambda$4(this.$shouldShow$delegate, true);
        return I.a;
    }
}
