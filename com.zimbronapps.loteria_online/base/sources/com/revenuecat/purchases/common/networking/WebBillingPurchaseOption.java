package com.revenuecat.purchases.common.networking;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import rb.d;
import sb.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class WebBillingPurchaseOption {
    public static final Companion Companion = new Companion(null);
    private final WebBillingPhase base;
    private final WebBillingPrice basePrice;
    private final WebBillingPhase introPrice;
    private final WebBillingPhase trial;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return WebBillingPurchaseOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WebBillingPurchaseOption() {
        this((WebBillingPrice) null, (WebBillingPhase) null, (WebBillingPhase) null, (WebBillingPhase) null, 15, (k) null);
    }

    public static /* synthetic */ WebBillingPurchaseOption copy$default(WebBillingPurchaseOption webBillingPurchaseOption, WebBillingPrice webBillingPrice, WebBillingPhase webBillingPhase, WebBillingPhase webBillingPhase2, WebBillingPhase webBillingPhase3, int i, Object obj) {
        if ((i & 1) != 0) {
            webBillingPrice = webBillingPurchaseOption.basePrice;
        }
        if ((i & 2) != 0) {
            webBillingPhase = webBillingPurchaseOption.base;
        }
        if ((i & 4) != 0) {
            webBillingPhase2 = webBillingPurchaseOption.trial;
        }
        if ((i & 8) != 0) {
            webBillingPhase3 = webBillingPurchaseOption.introPrice;
        }
        return webBillingPurchaseOption.copy(webBillingPrice, webBillingPhase, webBillingPhase2, webBillingPhase3);
    }

    public static /* synthetic */ void getBasePrice$annotations() {
    }

    public static /* synthetic */ void getIntroPrice$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(WebBillingPurchaseOption webBillingPurchaseOption, d dVar, e eVar) {
        if (dVar.e(eVar, 0) || webBillingPurchaseOption.basePrice != null) {
            dVar.j(eVar, 0, WebBillingPrice$$serializer.INSTANCE, webBillingPurchaseOption.basePrice);
        }
        if (dVar.e(eVar, 1) || webBillingPurchaseOption.base != null) {
            dVar.j(eVar, 1, WebBillingPhase$$serializer.INSTANCE, webBillingPurchaseOption.base);
        }
        if (dVar.e(eVar, 2) || webBillingPurchaseOption.trial != null) {
            dVar.j(eVar, 2, WebBillingPhase$$serializer.INSTANCE, webBillingPurchaseOption.trial);
        }
        if (!dVar.e(eVar, 3) && webBillingPurchaseOption.introPrice == null) {
            return;
        }
        dVar.j(eVar, 3, WebBillingPhase$$serializer.INSTANCE, webBillingPurchaseOption.introPrice);
    }

    public final WebBillingPrice component1() {
        return this.basePrice;
    }

    public final WebBillingPhase component2() {
        return this.base;
    }

    public final WebBillingPhase component3() {
        return this.trial;
    }

    public final WebBillingPhase component4() {
        return this.introPrice;
    }

    public final WebBillingPurchaseOption copy(WebBillingPrice webBillingPrice, WebBillingPhase webBillingPhase, WebBillingPhase webBillingPhase2, WebBillingPhase webBillingPhase3) {
        return new WebBillingPurchaseOption(webBillingPrice, webBillingPhase, webBillingPhase2, webBillingPhase3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebBillingPurchaseOption)) {
            return false;
        }
        WebBillingPurchaseOption webBillingPurchaseOption = (WebBillingPurchaseOption) obj;
        return t.c(this.basePrice, webBillingPurchaseOption.basePrice) && t.c(this.base, webBillingPurchaseOption.base) && t.c(this.trial, webBillingPurchaseOption.trial) && t.c(this.introPrice, webBillingPurchaseOption.introPrice);
    }

    public final WebBillingPhase getBase() {
        return this.base;
    }

    public final WebBillingPrice getBasePrice() {
        return this.basePrice;
    }

    public final WebBillingPhase getIntroPrice() {
        return this.introPrice;
    }

    public final WebBillingPhase getTrial() {
        return this.trial;
    }

    public int hashCode() {
        WebBillingPrice webBillingPrice = this.basePrice;
        int hashCode = (webBillingPrice == null ? 0 : webBillingPrice.hashCode()) * 31;
        WebBillingPhase webBillingPhase = this.base;
        int hashCode2 = (hashCode + (webBillingPhase == null ? 0 : webBillingPhase.hashCode())) * 31;
        WebBillingPhase webBillingPhase2 = this.trial;
        int hashCode3 = (hashCode2 + (webBillingPhase2 == null ? 0 : webBillingPhase2.hashCode())) * 31;
        WebBillingPhase webBillingPhase3 = this.introPrice;
        return hashCode3 + (webBillingPhase3 != null ? webBillingPhase3.hashCode() : 0);
    }

    public String toString() {
        return "WebBillingPurchaseOption(basePrice=" + this.basePrice + ", base=" + this.base + ", trial=" + this.trial + ", introPrice=" + this.introPrice + ')';
    }

    @Ca.e
    public /* synthetic */ WebBillingPurchaseOption(int i, WebBillingPrice webBillingPrice, WebBillingPhase webBillingPhase, WebBillingPhase webBillingPhase2, WebBillingPhase webBillingPhase3, t0 t0Var) {
        if ((i & 1) == 0) {
            this.basePrice = null;
        } else {
            this.basePrice = webBillingPrice;
        }
        if ((i & 2) == 0) {
            this.base = null;
        } else {
            this.base = webBillingPhase;
        }
        if ((i & 4) == 0) {
            this.trial = null;
        } else {
            this.trial = webBillingPhase2;
        }
        if ((i & 8) == 0) {
            this.introPrice = null;
        } else {
            this.introPrice = webBillingPhase3;
        }
    }

    public WebBillingPurchaseOption(WebBillingPrice webBillingPrice, WebBillingPhase webBillingPhase, WebBillingPhase webBillingPhase2, WebBillingPhase webBillingPhase3) {
        this.basePrice = webBillingPrice;
        this.base = webBillingPhase;
        this.trial = webBillingPhase2;
        this.introPrice = webBillingPhase3;
    }

    public /* synthetic */ WebBillingPurchaseOption(WebBillingPrice webBillingPrice, WebBillingPhase webBillingPhase, WebBillingPhase webBillingPhase2, WebBillingPhase webBillingPhase3, int i, k kVar) {
        this((i & 1) != 0 ? null : webBillingPrice, (i & 2) != 0 ? null : webBillingPhase, (i & 4) != 0 ? null : webBillingPhase2, (i & 8) != 0 ? null : webBillingPhase3);
    }
}
