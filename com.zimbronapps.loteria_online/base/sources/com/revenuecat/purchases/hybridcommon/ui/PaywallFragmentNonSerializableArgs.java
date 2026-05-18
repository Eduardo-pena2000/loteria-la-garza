package com.revenuecat.purchases.hybridcommon.ui;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallFragmentNonSerializableArgs {
    private final PaywallListenerWrapper paywallListener;
    private final HybridPurchaseLogicBridge purchaseLogic;

    public PaywallFragmentNonSerializableArgs() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ PaywallFragmentNonSerializableArgs copy$default(PaywallFragmentNonSerializableArgs paywallFragmentNonSerializableArgs, PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge, int i, Object obj) {
        if ((i & 1) != 0) {
            paywallListenerWrapper = paywallFragmentNonSerializableArgs.paywallListener;
        }
        if ((i & 2) != 0) {
            hybridPurchaseLogicBridge = paywallFragmentNonSerializableArgs.purchaseLogic;
        }
        return paywallFragmentNonSerializableArgs.copy(paywallListenerWrapper, hybridPurchaseLogicBridge);
    }

    public final PaywallListenerWrapper component1() {
        return this.paywallListener;
    }

    public final HybridPurchaseLogicBridge component2() {
        return this.purchaseLogic;
    }

    public final PaywallFragmentNonSerializableArgs copy(PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge) {
        return new PaywallFragmentNonSerializableArgs(paywallListenerWrapper, hybridPurchaseLogicBridge);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallFragmentNonSerializableArgs)) {
            return false;
        }
        PaywallFragmentNonSerializableArgs paywallFragmentNonSerializableArgs = (PaywallFragmentNonSerializableArgs) obj;
        return t.c(this.paywallListener, paywallFragmentNonSerializableArgs.paywallListener) && t.c(this.purchaseLogic, paywallFragmentNonSerializableArgs.purchaseLogic);
    }

    public final PaywallListenerWrapper getPaywallListener() {
        return this.paywallListener;
    }

    public final HybridPurchaseLogicBridge getPurchaseLogic() {
        return this.purchaseLogic;
    }

    public int hashCode() {
        PaywallListenerWrapper paywallListenerWrapper = this.paywallListener;
        int hashCode = (paywallListenerWrapper == null ? 0 : paywallListenerWrapper.hashCode()) * 31;
        HybridPurchaseLogicBridge hybridPurchaseLogicBridge = this.purchaseLogic;
        return hashCode + (hybridPurchaseLogicBridge != null ? hybridPurchaseLogicBridge.hashCode() : 0);
    }

    public String toString() {
        return "PaywallFragmentNonSerializableArgs(paywallListener=" + this.paywallListener + ", purchaseLogic=" + this.purchaseLogic + ')';
    }

    public PaywallFragmentNonSerializableArgs(PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge) {
        this.paywallListener = paywallListenerWrapper;
        this.purchaseLogic = hybridPurchaseLogicBridge;
    }

    public /* synthetic */ PaywallFragmentNonSerializableArgs(PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge, int i, k kVar) {
        this((i & 1) != 0 ? null : paywallListenerWrapper, (i & 2) != 0 ? null : hybridPurchaseLogicBridge);
    }
}
