package com.revenuecat.purchases.ui.revenuecatui.activity;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallActivityLauncher$wrappedHandler$1 implements PaywallResultHandler {
    final /* synthetic */ PaywallResultHandler $resultHandler;
    final /* synthetic */ PaywallActivityLauncher this$0;

    public PaywallActivityLauncher$wrappedHandler$1(PaywallActivityLauncher paywallActivityLauncher, PaywallResultHandler paywallResultHandler) {
        this.this$0 = paywallActivityLauncher;
        this.$resultHandler = paywallResultHandler;
    }

    public void onActivityResult(PaywallResult result) {
        t.g(result, "result");
        Integer access$getCurrentNonSerializableArgsKey$p = PaywallActivityLauncher.access$getCurrentNonSerializableArgsKey$p(this.this$0);
        if (access$getCurrentNonSerializableArgsKey$p != null) {
            PaywallActivityLauncher paywallActivityLauncher = this.this$0;
            PaywallActivityNonSerializableArgsStore.INSTANCE.remove(access$getCurrentNonSerializableArgsKey$p.intValue());
            PaywallActivityLauncher.access$setCurrentNonSerializableArgsKey$p(paywallActivityLauncher, null);
        }
        this.$resultHandler.onActivityResult(result);
    }
}
