package com.revenuecat.purchases.paywalls.events;

import Ca.e;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rb.d;
import sb.f0;
import sb.t0;
import sb.x0;
import tb.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallPostReceiptData {
    public static final Companion Companion = new Companion(null);
    private static final b.a json = b.d;
    private final boolean darkMode;
    private final String displayMode;
    private final String localeIdentifier;
    private final String offeringId;
    private final String paywallID;
    private final int revision;
    private final String sessionID;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b.a getJson() {
            return PaywallPostReceiptData.access$getJson$cp();
        }

        public final ob.b serializer() {
            return PaywallPostReceiptData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ PaywallPostReceiptData(int i, String str, String str2, int i2, String str3, boolean z, String str4, String str5, t0 t0Var) {
        if (127 != (i & 127)) {
            f0.a(i, 127, PaywallPostReceiptData$$serializer.INSTANCE.getDescriptor());
        }
        this.paywallID = str;
        this.sessionID = str2;
        this.revision = i2;
        this.displayMode = str3;
        this.darkMode = z;
        this.localeIdentifier = str4;
        this.offeringId = str5;
    }

    public static final /* synthetic */ b.a access$getJson$cp() {
        return json;
    }

    public static /* synthetic */ PaywallPostReceiptData copy$default(PaywallPostReceiptData paywallPostReceiptData, String str, String str2, int i, String str3, boolean z, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paywallPostReceiptData.paywallID;
        }
        if ((i2 & 2) != 0) {
            str2 = paywallPostReceiptData.sessionID;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            i = paywallPostReceiptData.revision;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = paywallPostReceiptData.displayMode;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            z = paywallPostReceiptData.darkMode;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            str4 = paywallPostReceiptData.localeIdentifier;
        }
        String str8 = str4;
        if ((i2 & 64) != 0) {
            str5 = paywallPostReceiptData.offeringId;
        }
        return paywallPostReceiptData.copy(str, str6, i3, str7, z2, str8, str5);
    }

    public static /* synthetic */ void getDarkMode$annotations() {
    }

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public static /* synthetic */ void getLocaleIdentifier$annotations() {
    }

    public static /* synthetic */ void getOfferingId$annotations() {
    }

    public static /* synthetic */ void getPaywallID$annotations() {
    }

    public static /* synthetic */ void getRevision$annotations() {
    }

    public static /* synthetic */ void getSessionID$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PaywallPostReceiptData paywallPostReceiptData, d dVar, qb.e eVar) {
        dVar.j(eVar, 0, x0.a, paywallPostReceiptData.paywallID);
        dVar.v(eVar, 1, paywallPostReceiptData.sessionID);
        dVar.n(eVar, 2, paywallPostReceiptData.revision);
        dVar.v(eVar, 3, paywallPostReceiptData.displayMode);
        dVar.B(eVar, 4, paywallPostReceiptData.darkMode);
        dVar.v(eVar, 5, paywallPostReceiptData.localeIdentifier);
        dVar.v(eVar, 6, paywallPostReceiptData.offeringId);
    }

    public final String component1() {
        return this.paywallID;
    }

    public final String component2() {
        return this.sessionID;
    }

    public final int component3() {
        return this.revision;
    }

    public final String component4() {
        return this.displayMode;
    }

    public final boolean component5() {
        return this.darkMode;
    }

    public final String component6() {
        return this.localeIdentifier;
    }

    public final String component7() {
        return this.offeringId;
    }

    public final PaywallPostReceiptData copy(String str, String str2, int i, String str3, boolean z, String str4, String str5) {
        t.g(str2, "sessionID");
        t.g(str3, "displayMode");
        t.g(str4, "localeIdentifier");
        t.g(str5, "offeringId");
        return new PaywallPostReceiptData(str, str2, i, str3, z, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallPostReceiptData)) {
            return false;
        }
        PaywallPostReceiptData paywallPostReceiptData = (PaywallPostReceiptData) obj;
        return t.c(this.paywallID, paywallPostReceiptData.paywallID) && t.c(this.sessionID, paywallPostReceiptData.sessionID) && this.revision == paywallPostReceiptData.revision && t.c(this.displayMode, paywallPostReceiptData.displayMode) && this.darkMode == paywallPostReceiptData.darkMode && t.c(this.localeIdentifier, paywallPostReceiptData.localeIdentifier) && t.c(this.offeringId, paywallPostReceiptData.offeringId);
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final String getPaywallID() {
        return this.paywallID;
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public int hashCode() {
        String str = this.paywallID;
        return ((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.sessionID.hashCode()) * 31) + Integer.hashCode(this.revision)) * 31) + this.displayMode.hashCode()) * 31) + Boolean.hashCode(this.darkMode)) * 31) + this.localeIdentifier.hashCode()) * 31) + this.offeringId.hashCode();
    }

    public final Map toMap() {
        b.a aVar = json;
        aVar.a();
        Map asMap = JsonElementExtensionsKt.asMap(aVar.e(Companion.serializer(), this));
        if (asMap == null) {
            return null;
        }
        return MapExtensionsKt.filterNotNullValues(asMap);
    }

    public String toString() {
        return "PaywallPostReceiptData(paywallID=" + this.paywallID + ", sessionID=" + this.sessionID + ", revision=" + this.revision + ", displayMode=" + this.displayMode + ", darkMode=" + this.darkMode + ", localeIdentifier=" + this.localeIdentifier + ", offeringId=" + this.offeringId + ')';
    }

    public PaywallPostReceiptData(String str, String str2, int i, String str3, boolean z, String str4, String str5) {
        t.g(str2, "sessionID");
        t.g(str3, "displayMode");
        t.g(str4, "localeIdentifier");
        t.g(str5, "offeringId");
        this.paywallID = str;
        this.sessionID = str2;
        this.revision = i;
        this.displayMode = str3;
        this.darkMode = z;
        this.localeIdentifier = str4;
        this.offeringId = str5;
    }
}
