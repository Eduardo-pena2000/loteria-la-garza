package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import Qa.q;
import X.E;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template4Kt$Template4MainContent$1$1$2 extends u implements q {
    final /* synthetic */ TemplateConfiguration.Colors $colors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template4Kt$Template4MainContent$1$1$2(TemplateConfiguration.Colors colors) {
        super(3);
        this.$colors = colors;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((TemplateConfiguration.PackageInfo) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(TemplateConfiguration.PackageInfo it, m mVar, int i) {
        int i2;
        t.g(it, "it");
        if ((i & 6) == 0) {
            i2 = i | (mVar.U(it) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(-1316875667, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4MainContent.<anonymous>.<anonymous>.<anonymous> (Template4.kt:190)");
        }
        IntroEligibilityStateViewKt.IntroEligibilityStateView-QETHhvg(it.getLocalization().getOfferDetails(), it.getLocalization().getOfferDetailsWithIntroOffer(), it.getLocalization().getOfferDetailsWithMultipleIntroOffers(), PackageExtensionsKt.getOfferEligibility(it), this.$colors.getText1-0d7_KjU(), E.a.c(mVar, E.b).c(), null, j.h(j.b.a()), false, g.h(e.a, 0.0f, 1, (Object) null), mVar, 805306368, 320);
        if (w.L()) {
            w.T();
        }
    }
}
