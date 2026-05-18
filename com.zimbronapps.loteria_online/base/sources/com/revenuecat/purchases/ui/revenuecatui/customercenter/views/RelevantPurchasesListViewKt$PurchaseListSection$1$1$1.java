package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RelevantPurchasesListViewKt$PurchaseListSection$1$1$1 extends u implements Qa.a {
    final /* synthetic */ PurchaseInformation $info;
    final /* synthetic */ l $onPurchaseSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelevantPurchasesListViewKt$PurchaseListSection$1$1$1(l lVar, PurchaseInformation purchaseInformation) {
        super(0);
        this.$onPurchaseSelect = lVar;
        this.$info = purchaseInformation;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$onPurchaseSelect.invoke(this.$info);
    }
}
