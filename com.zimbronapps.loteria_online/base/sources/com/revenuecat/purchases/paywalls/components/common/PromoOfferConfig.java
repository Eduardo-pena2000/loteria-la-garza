package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PromoOfferConfig {
    public static final Companion Companion = new Companion(null);
    private final String offerId;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PromoOfferConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ PromoOfferConfig(int i, String str, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, PromoOfferConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.offerId = str;
    }

    public static /* synthetic */ void getOfferId$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PromoOfferConfig promoOfferConfig, d dVar, qb.e eVar) {
        dVar.v(eVar, 0, promoOfferConfig.offerId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PromoOfferConfig) && t.c(this.offerId, ((PromoOfferConfig) obj).offerId);
    }

    public final /* synthetic */ String getOfferId() {
        return this.offerId;
    }

    public int hashCode() {
        return this.offerId.hashCode();
    }

    public String toString() {
        return "PromoOfferConfig(offerId=" + this.offerId + ')';
    }

    public PromoOfferConfig(String str) {
        t.g(str, "offerId");
        this.offerId = str;
    }
}
