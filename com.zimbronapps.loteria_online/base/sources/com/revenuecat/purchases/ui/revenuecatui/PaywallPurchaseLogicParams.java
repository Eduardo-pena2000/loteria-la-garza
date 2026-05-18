package com.revenuecat.purchases.ui.revenuecatui;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.SubscriptionOption;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallPurchaseLogicParams {
    public static final int $stable = 8;
    private final ProductChange productChange;
    private final Package rcPackage;
    private final SubscriptionOption subscriptionOption;

    public static final class Builder {
        public static final int $stable = 8;
        private String oldProductId;
        private final Package rcPackage;
        private ReplacementMode replacementMode;
        private SubscriptionOption subscriptionOption;

        public Builder(Package rcPackage) {
            t.g(rcPackage, "rcPackage");
            this.rcPackage = rcPackage;
        }

        public final PaywallPurchaseLogicParams build() {
            Package r0 = this.rcPackage;
            String str = this.oldProductId;
            return new PaywallPurchaseLogicParams(r0, str != null ? new ProductChange(str, this.replacementMode) : null, this.subscriptionOption);
        }

        public final Builder oldProductId(String oldProductId) {
            t.g(oldProductId, "oldProductId");
            this.oldProductId = oldProductId;
            return this;
        }

        public final Builder replacementMode(ReplacementMode replacementMode) {
            this.replacementMode = replacementMode;
            return this;
        }

        public final Builder subscriptionOption(SubscriptionOption subscriptionOption) {
            this.subscriptionOption = subscriptionOption;
            return this;
        }
    }

    public PaywallPurchaseLogicParams(Package rcPackage, ProductChange productChange, SubscriptionOption subscriptionOption) {
        t.g(rcPackage, "rcPackage");
        this.rcPackage = rcPackage;
        this.productChange = productChange;
        this.subscriptionOption = subscriptionOption;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallPurchaseLogicParams)) {
            return false;
        }
        PaywallPurchaseLogicParams paywallPurchaseLogicParams = (PaywallPurchaseLogicParams) obj;
        return t.c(this.rcPackage, paywallPurchaseLogicParams.rcPackage) && t.c(this.productChange, paywallPurchaseLogicParams.productChange) && t.c(this.subscriptionOption, paywallPurchaseLogicParams.subscriptionOption);
    }

    public final String getOldProductId() {
        ProductChange productChange = this.productChange;
        if (productChange != null) {
            return productChange.getOldProductId();
        }
        return null;
    }

    public final ProductChange getProductChange$revenuecatui_defaultsBc8Release() {
        return this.productChange;
    }

    public final Package getRcPackage() {
        return this.rcPackage;
    }

    public final ReplacementMode getReplacementMode() {
        ProductChange productChange = this.productChange;
        if (productChange != null) {
            return productChange.getReplacementMode();
        }
        return null;
    }

    public final SubscriptionOption getSubscriptionOption() {
        return this.subscriptionOption;
    }

    public int hashCode() {
        int hashCode = this.rcPackage.hashCode() * 31;
        ProductChange productChange = this.productChange;
        int hashCode2 = (hashCode + (productChange == null ? 0 : productChange.hashCode())) * 31;
        SubscriptionOption subscriptionOption = this.subscriptionOption;
        return hashCode2 + (subscriptionOption != null ? subscriptionOption.hashCode() : 0);
    }

    public String toString() {
        return "PaywallPurchaseLogicParams(rcPackage=" + this.rcPackage + ", productChange=" + this.productChange + ", subscriptionOption=" + this.subscriptionOption + ')';
    }
}
