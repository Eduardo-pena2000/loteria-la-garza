package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.composables.SimpleSheetState;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$show$1$1$1", f = "LoadedPaywallComponents.kt", l = {147}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LoadedPaywallComponentsKt$show$1$1$1 extends l implements p {
    final /* synthetic */ p $onClick;
    final /* synthetic */ SimpleSheetState $this_show;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadedPaywallComponentsKt$show$1$1$1(SimpleSheetState simpleSheetState, p pVar, e eVar) {
        super(2, eVar);
        this.$this_show = simpleSheetState;
        this.$onClick = pVar;
    }

    public final e create(Object obj, e eVar) {
        LoadedPaywallComponentsKt$show$1$1$1 loadedPaywallComponentsKt$show$1$1$1 = new LoadedPaywallComponentsKt$show$1$1$1(this.$this_show, this.$onClick, eVar);
        loadedPaywallComponentsKt$show$1$1$1.L$0 = obj;
        return loadedPaywallComponentsKt$show$1$1$1;
    }

    public final Object invoke(PaywallAction paywallAction, e eVar) {
        return ((LoadedPaywallComponentsKt$show$1$1$1) create(paywallAction, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            PaywallAction paywallAction = (PaywallAction) this.L$0;
            if (paywallAction instanceof PaywallAction.External.NavigateBack) {
                this.$this_show.hide();
            } else {
                p pVar = this.$onClick;
                this.label = 1;
                if (pVar.invoke(paywallAction, this) == f) {
                    return f;
                }
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
