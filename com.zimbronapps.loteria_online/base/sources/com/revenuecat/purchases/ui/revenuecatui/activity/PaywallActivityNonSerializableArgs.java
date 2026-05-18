package com.revenuecat.purchases.ui.revenuecatui.activity;

import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallActivityNonSerializableArgs {
    public static final int $stable = 0;
    private final PaywallListener listener;
    private final PaywallPurchaseLogic purchaseLogic;

    public PaywallActivityNonSerializableArgs() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ PaywallActivityNonSerializableArgs copy$default(PaywallActivityNonSerializableArgs paywallActivityNonSerializableArgs, PaywallPurchaseLogic paywallPurchaseLogic, PaywallListener paywallListener, int i, Object obj) {
        if ((i & 1) != 0) {
            paywallPurchaseLogic = paywallActivityNonSerializableArgs.purchaseLogic;
        }
        if ((i & 2) != 0) {
            paywallListener = paywallActivityNonSerializableArgs.listener;
        }
        return paywallActivityNonSerializableArgs.copy(paywallPurchaseLogic, paywallListener);
    }

    public final PaywallPurchaseLogic component1() {
        return this.purchaseLogic;
    }

    public final PaywallListener component2() {
        return this.listener;
    }

    public final PaywallActivityNonSerializableArgs copy(PaywallPurchaseLogic paywallPurchaseLogic, PaywallListener paywallListener) {
        return new PaywallActivityNonSerializableArgs(paywallPurchaseLogic, paywallListener);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallActivityNonSerializableArgs)) {
            return false;
        }
        PaywallActivityNonSerializableArgs paywallActivityNonSerializableArgs = (PaywallActivityNonSerializableArgs) obj;
        return t.c(this.purchaseLogic, paywallActivityNonSerializableArgs.purchaseLogic) && t.c(this.listener, paywallActivityNonSerializableArgs.listener);
    }

    public final PaywallListener getListener() {
        return this.listener;
    }

    public final PaywallPurchaseLogic getPurchaseLogic() {
        return this.purchaseLogic;
    }

    public int hashCode() {
        PaywallPurchaseLogic paywallPurchaseLogic = this.purchaseLogic;
        int hashCode = (paywallPurchaseLogic == null ? 0 : paywallPurchaseLogic.hashCode()) * 31;
        PaywallListener paywallListener = this.listener;
        return hashCode + (paywallListener != null ? paywallListener.hashCode() : 0);
    }

    public String toString() {
        return "PaywallActivityNonSerializableArgs(purchaseLogic=" + this.purchaseLogic + ", listener=" + this.listener + ')';
    }

    public PaywallActivityNonSerializableArgs(PaywallPurchaseLogic paywallPurchaseLogic, PaywallListener paywallListener) {
        this.purchaseLogic = paywallPurchaseLogic;
        this.listener = paywallListener;
    }

    public /* synthetic */ PaywallActivityNonSerializableArgs(PaywallPurchaseLogic paywallPurchaseLogic, PaywallListener paywallListener, int i, k kVar) {
        this((i & 1) != 0 ? null : paywallPurchaseLogic, (i & 2) != 0 ? null : paywallListener);
    }
}
