package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import rb.d;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ExitOffers {
    public static final Companion Companion = new Companion(null);
    private final ExitOffer dismiss;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return ExitOffers$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ExitOffers() {
        this((ExitOffer) null, 1, (k) null);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ExitOffers exitOffers, d dVar, e eVar) {
        if (!dVar.e(eVar, 0) && exitOffers.dismiss == null) {
            return;
        }
        dVar.j(eVar, 0, ExitOffer$$serializer.INSTANCE, exitOffers.dismiss);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExitOffers) && t.c(this.dismiss, ((ExitOffers) obj).dismiss);
    }

    public final ExitOffer getDismiss() {
        return this.dismiss;
    }

    public int hashCode() {
        ExitOffer exitOffer = this.dismiss;
        if (exitOffer == null) {
            return 0;
        }
        return exitOffer.hashCode();
    }

    public String toString() {
        return "ExitOffers(dismiss=" + this.dismiss + ')';
    }

    @Ca.e
    public /* synthetic */ ExitOffers(int i, ExitOffer exitOffer, t0 t0Var) {
        if ((i & 1) == 0) {
            this.dismiss = null;
        } else {
            this.dismiss = exitOffer;
        }
    }

    public ExitOffers(ExitOffer exitOffer) {
        this.dismiss = exitOffer;
    }

    public /* synthetic */ ExitOffers(ExitOffer exitOffer, int i, k kVar) {
        this((i & 1) != 0 ? null : exitOffer);
    }
}
