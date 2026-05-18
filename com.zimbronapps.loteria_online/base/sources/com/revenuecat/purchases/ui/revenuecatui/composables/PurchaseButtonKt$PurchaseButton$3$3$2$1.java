package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.q;
import X.E;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import b0.h2;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import d1.L;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import n1.h;
import s0.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchaseButtonKt$PurchaseButton$3$3$2$1 extends u implements q {
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ h2 $labelOpacity$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseButtonKt$PurchaseButton$3$3$2$1(TemplateConfiguration.Colors colors, h2 h2Var) {
        super(3);
        this.$colors = colors;
        this.$labelOpacity$delegate = h2Var;
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
            w.U(98081200, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButton.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PurchaseButton.kt:140)");
        }
        ProcessedLocalizedConfiguration localization = it.getLocalization();
        IntroEligibilityStateViewKt.IntroEligibilityStateView-QETHhvg(localization.getCallToAction(), localization.getCallToActionWithIntroOffer(), localization.getCallToActionWithMultipleIntroOffers(), PackageExtensionsKt.getOfferEligibility(it), this.$colors.getCallToActionForeground-0d7_KjU(), E.a.c(mVar, E.b).o(), L.b.h(), j.h(j.b.a()), false, a.a(f.k(e.a, 0.0f, h.g(h.g(UIConstant.INSTANCE.getDefaultVerticalSpacing-D9Ej5fM() * 2) / 3), 1, (Object) null), PurchaseButtonKt.access$PurchaseButton_WH_ejsw$lambda$6$lambda$0(this.$labelOpacity$delegate)), mVar, 102236160, 0);
        if (w.L()) {
            w.T();
        }
    }
}
