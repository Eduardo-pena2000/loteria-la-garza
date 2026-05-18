package com.revenuecat.purchases.common.networking;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import rb.d;
import sb.t0;
import sb.x0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class WebBillingPhase {
    public static final Companion Companion = new Companion(null);
    private final int cycleCount;
    private final String periodDuration;
    private final WebBillingPrice price;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return WebBillingPhase$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WebBillingPhase() {
        this((WebBillingPrice) null, (String) null, 0, 7, (k) null);
    }

    public static /* synthetic */ WebBillingPhase copy$default(WebBillingPhase webBillingPhase, WebBillingPrice webBillingPrice, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            webBillingPrice = webBillingPhase.price;
        }
        if ((i2 & 2) != 0) {
            str = webBillingPhase.periodDuration;
        }
        if ((i2 & 4) != 0) {
            i = webBillingPhase.cycleCount;
        }
        return webBillingPhase.copy(webBillingPrice, str, i);
    }

    public static /* synthetic */ void getCycleCount$annotations() {
    }

    public static /* synthetic */ void getPeriodDuration$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(WebBillingPhase webBillingPhase, d dVar, e eVar) {
        if (dVar.e(eVar, 0) || webBillingPhase.price != null) {
            dVar.j(eVar, 0, WebBillingPrice$$serializer.INSTANCE, webBillingPhase.price);
        }
        if (dVar.e(eVar, 1) || webBillingPhase.periodDuration != null) {
            dVar.j(eVar, 1, x0.a, webBillingPhase.periodDuration);
        }
        if (!dVar.e(eVar, 2) && webBillingPhase.cycleCount == 1) {
            return;
        }
        dVar.n(eVar, 2, webBillingPhase.cycleCount);
    }

    public final WebBillingPrice component1() {
        return this.price;
    }

    public final String component2() {
        return this.periodDuration;
    }

    public final int component3() {
        return this.cycleCount;
    }

    public final WebBillingPhase copy(WebBillingPrice webBillingPrice, String str, int i) {
        return new WebBillingPhase(webBillingPrice, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebBillingPhase)) {
            return false;
        }
        WebBillingPhase webBillingPhase = (WebBillingPhase) obj;
        return t.c(this.price, webBillingPhase.price) && t.c(this.periodDuration, webBillingPhase.periodDuration) && this.cycleCount == webBillingPhase.cycleCount;
    }

    public final int getCycleCount() {
        return this.cycleCount;
    }

    public final String getPeriodDuration() {
        return this.periodDuration;
    }

    public final WebBillingPrice getPrice() {
        return this.price;
    }

    public int hashCode() {
        WebBillingPrice webBillingPrice = this.price;
        int hashCode = (webBillingPrice == null ? 0 : webBillingPrice.hashCode()) * 31;
        String str = this.periodDuration;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.cycleCount);
    }

    public String toString() {
        return "WebBillingPhase(price=" + this.price + ", periodDuration=" + this.periodDuration + ", cycleCount=" + this.cycleCount + ')';
    }

    @Ca.e
    public /* synthetic */ WebBillingPhase(int i, WebBillingPrice webBillingPrice, String str, int i2, t0 t0Var) {
        if ((i & 1) == 0) {
            this.price = null;
        } else {
            this.price = webBillingPrice;
        }
        if ((i & 2) == 0) {
            this.periodDuration = null;
        } else {
            this.periodDuration = str;
        }
        if ((i & 4) == 0) {
            this.cycleCount = 1;
        } else {
            this.cycleCount = i2;
        }
    }

    public WebBillingPhase(WebBillingPrice webBillingPrice, String str, int i) {
        this.price = webBillingPrice;
        this.periodDuration = str;
        this.cycleCount = i;
    }

    public /* synthetic */ WebBillingPhase(WebBillingPrice webBillingPrice, String str, int i, int i2, k kVar) {
        this((i2 & 1) != 0 ? null : webBillingPrice, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 1 : i);
    }
}
