package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.PromoOfferConfig;
import com.revenuecat.purchases.paywalls.components.common.ResilientPromoOfferConfigSerializer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PackageComponent implements PaywallComponent {
    public static final Companion Companion = new Companion(null);
    private final boolean isSelectedByDefault;
    private final String packageId;
    private final PromoOfferConfig playStoreOffer;
    private final StackComponent stack;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PackageComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ PackageComponent(int i, String str, boolean z, StackComponent stackComponent, PromoOfferConfig promoOfferConfig, t0 t0Var) {
        if (7 != (i & 7)) {
            f0.a(i, 7, PackageComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.packageId = str;
        this.isSelectedByDefault = z;
        this.stack = stackComponent;
        if ((i & 8) == 0) {
            this.playStoreOffer = null;
        } else {
            this.playStoreOffer = promoOfferConfig;
        }
    }

    public static /* synthetic */ void getPackageId$annotations() {
    }

    public static /* synthetic */ void getPlayStoreOffer$annotations() {
    }

    public static /* synthetic */ void isSelectedByDefault$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PackageComponent packageComponent, d dVar, qb.e eVar) {
        dVar.v(eVar, 0, packageComponent.packageId);
        dVar.B(eVar, 1, packageComponent.isSelectedByDefault);
        dVar.k(eVar, 2, StackComponent$$serializer.INSTANCE, packageComponent.stack);
        if (!dVar.e(eVar, 3) && packageComponent.playStoreOffer == null) {
            return;
        }
        dVar.j(eVar, 3, ResilientPromoOfferConfigSerializer.INSTANCE, packageComponent.playStoreOffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageComponent)) {
            return false;
        }
        PackageComponent packageComponent = (PackageComponent) obj;
        return t.c(this.packageId, packageComponent.packageId) && this.isSelectedByDefault == packageComponent.isSelectedByDefault && t.c(this.stack, packageComponent.stack) && t.c(this.playStoreOffer, packageComponent.playStoreOffer);
    }

    public final /* synthetic */ String getPackageId() {
        return this.packageId;
    }

    public final /* synthetic */ PromoOfferConfig getPlayStoreOffer() {
        return this.playStoreOffer;
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public int hashCode() {
        int hashCode = ((((this.packageId.hashCode() * 31) + Boolean.hashCode(this.isSelectedByDefault)) * 31) + this.stack.hashCode()) * 31;
        PromoOfferConfig promoOfferConfig = this.playStoreOffer;
        return hashCode + (promoOfferConfig == null ? 0 : promoOfferConfig.hashCode());
    }

    public final /* synthetic */ boolean isSelectedByDefault() {
        return this.isSelectedByDefault;
    }

    public String toString() {
        return "PackageComponent(packageId=" + this.packageId + ", isSelectedByDefault=" + this.isSelectedByDefault + ", stack=" + this.stack + ", playStoreOffer=" + this.playStoreOffer + ')';
    }

    public PackageComponent(String str, boolean z, StackComponent stackComponent, PromoOfferConfig promoOfferConfig) {
        t.g(str, "packageId");
        t.g(stackComponent, "stack");
        this.packageId = str;
        this.isSelectedByDefault = z;
        this.stack = stackComponent;
        this.playStoreOffer = promoOfferConfig;
    }

    public /* synthetic */ PackageComponent(String str, boolean z, StackComponent stackComponent, PromoOfferConfig promoOfferConfig, int i, k kVar) {
        this(str, z, stackComponent, (i & 8) != 0 ? null : promoOfferConfig);
    }
}
