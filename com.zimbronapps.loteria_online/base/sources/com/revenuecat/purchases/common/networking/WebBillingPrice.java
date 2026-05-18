package com.revenuecat.purchases.common.networking;

import Ca.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class WebBillingPrice {
    public static final Companion Companion = new Companion(null);
    private final long amountMicros;
    private final String currency;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return WebBillingPrice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ WebBillingPrice(int i, long j, String str, t0 t0Var) {
        if (3 != (i & 3)) {
            f0.a(i, 3, WebBillingPrice$$serializer.INSTANCE.getDescriptor());
        }
        this.amountMicros = j;
        this.currency = str;
    }

    public static /* synthetic */ WebBillingPrice copy$default(WebBillingPrice webBillingPrice, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = webBillingPrice.amountMicros;
        }
        if ((i & 2) != 0) {
            str = webBillingPrice.currency;
        }
        return webBillingPrice.copy(j, str);
    }

    public static /* synthetic */ void getAmountMicros$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(WebBillingPrice webBillingPrice, d dVar, qb.e eVar) {
        dVar.o(eVar, 0, webBillingPrice.amountMicros);
        dVar.v(eVar, 1, webBillingPrice.currency);
    }

    public final long component1() {
        return this.amountMicros;
    }

    public final String component2() {
        return this.currency;
    }

    public final WebBillingPrice copy(long j, String str) {
        t.g(str, "currency");
        return new WebBillingPrice(j, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebBillingPrice)) {
            return false;
        }
        WebBillingPrice webBillingPrice = (WebBillingPrice) obj;
        return this.amountMicros == webBillingPrice.amountMicros && t.c(this.currency, webBillingPrice.currency);
    }

    public final long getAmountMicros() {
        return this.amountMicros;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (Long.hashCode(this.amountMicros) * 31) + this.currency.hashCode();
    }

    public String toString() {
        return "WebBillingPrice(amountMicros=" + this.amountMicros + ", currency=" + this.currency + ')';
    }

    public WebBillingPrice(long j, String str) {
        t.g(str, "currency");
        this.amountMicros = j;
        this.currency = str;
    }
}
