package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import Qa.q;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import y.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template5Kt$AnimatedPackages$1$1 extends u implements q {
    final /* synthetic */ PaywallState.Loaded.Legacy $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template5Kt$AnimatedPackages$1$1(PaywallState.Loaded.Legacy legacy) {
        super(3);
        this.$state = legacy;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((f) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(f AnimatedVisibility, m mVar, int i) {
        t.g(AnimatedVisibility, "$this$AnimatedVisibility");
        if (w.L()) {
            w.U(-505917510, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.AnimatedPackages.<anonymous>.<anonymous> (Template5.kt:341)");
        }
        OfferDetailsKt.OfferDetails(this.$state, null, mVar, 0, 2);
        if (w.L()) {
            w.T();
        }
    }
}
