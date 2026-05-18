package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PromotionalOfferData;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PromotionalOfferScreenKt$PromotionalOfferScreen$1$1$1 extends u implements Qa.a {
    final /* synthetic */ l $onAccept;
    final /* synthetic */ PromotionalOfferData $promotionalOfferData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionalOfferScreenKt$PromotionalOfferScreen$1$1$1(l lVar, PromotionalOfferData promotionalOfferData) {
        super(0);
        this.$onAccept = lVar;
        this.$promotionalOfferData = promotionalOfferData;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$onAccept.invoke(this.$promotionalOfferData.getSubscriptionOption());
    }
}
