package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Children_Extend_Over_Parent$1$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentViewKt$StackComponentView_Preview_Children_Extend_Over_Parent$1$1 extends l implements p {
    int label;

    public StackComponentViewKt$StackComponentView_Preview_Children_Extend_Over_Parent$1$1(e eVar) {
        super(2, eVar);
    }

    public final e create(Object obj, e eVar) {
        return new StackComponentViewKt$StackComponentView_Preview_Children_Extend_Over_Parent$1$1(eVar);
    }

    public final Object invoke(PaywallAction paywallAction, e eVar) {
        return ((StackComponentViewKt$StackComponentView_Preview_Children_Extend_Over_Parent$1$1) create(paywallAction, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        return I.a;
    }
}
