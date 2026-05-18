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
public final class ExitOffer {
    public static final Companion Companion = new Companion(null);
    private final String offeringId;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return ExitOffer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ ExitOffer(int i, String str, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, ExitOffer$$serializer.INSTANCE.getDescriptor());
        }
        this.offeringId = str;
    }

    public static /* synthetic */ void getOfferingId$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ExitOffer exitOffer, d dVar, qb.e eVar) {
        dVar.v(eVar, 0, exitOffer.offeringId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExitOffer) && t.c(this.offeringId, ((ExitOffer) obj).offeringId);
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public int hashCode() {
        return this.offeringId.hashCode();
    }

    public String toString() {
        return "ExitOffer(offeringId=" + this.offeringId + ')';
    }

    public ExitOffer(String str) {
        t.g(str, "offeringId");
        this.offeringId = str;
    }
}
