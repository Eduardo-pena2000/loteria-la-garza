package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.l;
import W0.B;
import W0.D;
import Z0.e;
import b0.C0;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchaseButtonKt$PurchaseButton$3$1$1 extends u implements l {
    final /* synthetic */ C0 $selectedPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseButtonKt$PurchaseButton$3$1$1(C0 c0) {
        super(1);
        this.$selectedPackage = c0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((D) obj);
        return I.a;
    }

    public final void invoke(D semantics) {
        t.g(semantics, "$this$semantics");
        TemplateConfiguration.PackageInfo packageInfo = (TemplateConfiguration.PackageInfo) this.$selectedPackage.getValue();
        B.i0(semantics, new e(IntroEligibilityStateViewKt.introEligibilityText(PackageExtensionsKt.getOfferEligibility(packageInfo), packageInfo.getLocalization().getCallToActionWithIntroOffer(), packageInfo.getLocalization().getCallToActionWithMultipleIntroOffers(), packageInfo.getLocalization().getCallToAction()), (List) null, (List) null, 6, (k) null));
    }
}
