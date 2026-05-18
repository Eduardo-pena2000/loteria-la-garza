package com.revenuecat.purchases.ui.revenuecatui.components.pkg;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.style.PackageComponentStyle;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.pkg.PackageComponentViewKt$PackageComponentView$1$1", f = "PackageComponentView.kt", l = {27}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PackageComponentViewKt$PackageComponentView$1$1 extends l implements p {
    final /* synthetic */ p $clickHandler;
    final /* synthetic */ PackageComponentStyle $style;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageComponentViewKt$PackageComponentView$1$1(PackageComponentStyle packageComponentStyle, p pVar, e eVar) {
        super(2, eVar);
        this.$style = packageComponentStyle;
        this.$clickHandler = pVar;
    }

    public final e create(Object obj, e eVar) {
        PackageComponentViewKt$PackageComponentView$1$1 packageComponentViewKt$PackageComponentView$1$1 = new PackageComponentViewKt$PackageComponentView$1$1(this.$style, this.$clickHandler, eVar);
        packageComponentViewKt$PackageComponentView$1$1.L$0 = obj;
        return packageComponentViewKt$PackageComponentView$1$1;
    }

    public final Object invoke(PaywallAction paywallAction, e eVar) {
        return ((PackageComponentViewKt$PackageComponentView$1$1) create(paywallAction, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            PaywallAction paywallAction = (PaywallAction) this.L$0;
            if (!this.$style.isSelectable()) {
                p pVar = this.$clickHandler;
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
