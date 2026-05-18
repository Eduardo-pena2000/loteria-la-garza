package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import android.content.Context;
import cb.O;
import com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt$DefaultPaywallView$1$1$bitmap$1", f = "DefaultPaywallView.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultPaywallViewKt$DefaultPaywallView$1$1$bitmap$1 extends l implements p {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaywallViewKt$DefaultPaywallView$1$1$bitmap$1(Context context, e eVar) {
        super(2, eVar);
        this.$context = context;
    }

    public final e create(Object obj, e eVar) {
        return new DefaultPaywallViewKt$DefaultPaywallView$1$1$bitmap$1(this.$context, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((DefaultPaywallViewKt$DefaultPaywallView$1$1$bitmap$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        return AppStyleExtractor.INSTANCE.getAppIconBitmap(this.$context);
    }
}
