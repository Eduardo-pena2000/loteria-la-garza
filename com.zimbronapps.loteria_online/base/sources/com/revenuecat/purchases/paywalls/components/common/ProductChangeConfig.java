package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.paywalls.components.common.serializers.DowngradeReplacementModeDeserializer;
import com.revenuecat.purchases.paywalls.components.common.serializers.UpgradeReplacementModeDeserializer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import rb.d;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ProductChangeConfig {
    public static final Companion Companion = new Companion(null);
    private final GoogleReplacementMode downgradeReplacementMode;
    private final GoogleReplacementMode upgradeReplacementMode;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return ProductChangeConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ProductChangeConfig() {
        this((GoogleReplacementMode) null, (GoogleReplacementMode) null, 3, (k) null);
    }

    public static /* synthetic */ void getDowngradeReplacementMode$annotations() {
    }

    public static /* synthetic */ void getUpgradeReplacementMode$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ProductChangeConfig productChangeConfig, d dVar, e eVar) {
        if (dVar.e(eVar, 0) || productChangeConfig.upgradeReplacementMode != GoogleReplacementMode.CHARGE_PRORATED_PRICE) {
            dVar.k(eVar, 0, UpgradeReplacementModeDeserializer.INSTANCE, productChangeConfig.upgradeReplacementMode);
        }
        if (!dVar.e(eVar, 1) && productChangeConfig.downgradeReplacementMode == GoogleReplacementMode.DEFERRED) {
            return;
        }
        dVar.k(eVar, 1, DowngradeReplacementModeDeserializer.INSTANCE, productChangeConfig.downgradeReplacementMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductChangeConfig)) {
            return false;
        }
        ProductChangeConfig productChangeConfig = (ProductChangeConfig) obj;
        return this.upgradeReplacementMode == productChangeConfig.upgradeReplacementMode && this.downgradeReplacementMode == productChangeConfig.downgradeReplacementMode;
    }

    public final /* synthetic */ GoogleReplacementMode getDowngradeReplacementMode() {
        return this.downgradeReplacementMode;
    }

    public final /* synthetic */ GoogleReplacementMode getUpgradeReplacementMode() {
        return this.upgradeReplacementMode;
    }

    public int hashCode() {
        return (this.upgradeReplacementMode.hashCode() * 31) + this.downgradeReplacementMode.hashCode();
    }

    public String toString() {
        return "ProductChangeConfig(upgradeReplacementMode=" + this.upgradeReplacementMode + ", downgradeReplacementMode=" + this.downgradeReplacementMode + ')';
    }

    @Ca.e
    public /* synthetic */ ProductChangeConfig(int i, GoogleReplacementMode googleReplacementMode, GoogleReplacementMode googleReplacementMode2, t0 t0Var) {
        this.upgradeReplacementMode = (i & 1) == 0 ? GoogleReplacementMode.CHARGE_PRORATED_PRICE : googleReplacementMode;
        if ((i & 2) == 0) {
            this.downgradeReplacementMode = GoogleReplacementMode.DEFERRED;
        } else {
            this.downgradeReplacementMode = googleReplacementMode2;
        }
    }

    public ProductChangeConfig(GoogleReplacementMode googleReplacementMode, GoogleReplacementMode googleReplacementMode2) {
        t.g(googleReplacementMode, "upgradeReplacementMode");
        t.g(googleReplacementMode2, "downgradeReplacementMode");
        this.upgradeReplacementMode = googleReplacementMode;
        this.downgradeReplacementMode = googleReplacementMode2;
    }

    public /* synthetic */ ProductChangeConfig(GoogleReplacementMode googleReplacementMode, GoogleReplacementMode googleReplacementMode2, int i, k kVar) {
        this((i & 1) != 0 ? GoogleReplacementMode.CHARGE_PRORATED_PRICE : googleReplacementMode, (i & 2) != 0 ? GoogleReplacementMode.DEFERRED : googleReplacementMode2);
    }
}
