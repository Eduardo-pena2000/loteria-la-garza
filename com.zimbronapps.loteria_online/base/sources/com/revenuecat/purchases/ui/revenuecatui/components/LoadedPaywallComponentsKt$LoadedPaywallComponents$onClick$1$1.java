package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1", f = "LoadedPaywallComponents.kt", l = {78}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LoadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1 extends l implements p {
    final /* synthetic */ p $clickHandler;
    final /* synthetic */ PaywallState.Loaded.Components $state;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1(PaywallState.Loaded.Components components, p pVar, e eVar) {
        super(2, eVar);
        this.$state = components;
        this.$clickHandler = pVar;
    }

    public final e create(Object obj, e eVar) {
        LoadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1 loadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1 = new LoadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1(this.$state, this.$clickHandler, eVar);
        loadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1.L$0 = obj;
        return loadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1;
    }

    public final Object invoke(PaywallAction paywallAction, e eVar) {
        return ((LoadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1) create(paywallAction, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            PaywallAction paywallAction = (PaywallAction) this.L$0;
            PaywallState.Loaded.Components components = this.$state;
            p pVar = this.$clickHandler;
            this.label = 1;
            if (LoadedPaywallComponentsKt.access$handleClick(paywallAction, components, pVar, this) == f) {
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
