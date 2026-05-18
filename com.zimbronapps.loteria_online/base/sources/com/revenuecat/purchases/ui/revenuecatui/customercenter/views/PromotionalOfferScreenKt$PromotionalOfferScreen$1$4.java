package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import F.V;
import Qa.l;
import Qa.q;
import X.m0;
import Z0.Y0;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import d1.H;
import d1.L;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PromotionalOfferScreenKt$PromotionalOfferScreen$1$4 extends u implements q {
    final /* synthetic */ CustomerCenterConfigData.Localization $localization;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionalOfferScreenKt$PromotionalOfferScreen$1$4(CustomerCenterConfigData.Localization localization) {
        super(3);
        this.$localization = localization;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((V) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(V TextButton, m mVar, int i) {
        t.g(TextButton, "$this$TextButton");
        if ((i & 17) == 16 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(-257431476, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PromotionalOfferScreen.<anonymous>.<anonymous> (PromotionalOfferScreen.kt:97)");
        }
        m0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.NO_THANKS), (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, j.h(j.b.a()), 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 130558);
        if (w.L()) {
            w.T();
        }
    }
}
