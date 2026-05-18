package com.revenuecat.purchases.amazon;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AmazonBilling$shouldFinishTransactions$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$shouldFinishTransactions$$inlined$log$1(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    public final String invoke() {
        return D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null) + " Attempting to interact with the Amazon App Store while RevenueCat is configured not to complete purchases won't do anything. (See AmazonConfiguration.Builder.purchasesAreCompletedBy().) Please use syncAmazonPurchase to send purchases to RevenueCat instead.";
    }
}
