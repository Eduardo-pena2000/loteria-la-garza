package com.revenuecat.purchases.common.caching;

import Ca.e;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.ReceiptInfo$$serializer;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData$$serializer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.A;
import sb.f0;
import sb.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LocalTransactionMetadata {
    private final PaywallPostReceiptData paywallPostReceiptData;
    private final PurchasesAreCompletedBy purchasesAreCompletedBy;
    private final ReceiptInfo receiptInfo;
    private final String token;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, A.b("com.revenuecat.purchases.PurchasesAreCompletedBy", PurchasesAreCompletedBy.values())};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return LocalTransactionMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ LocalTransactionMetadata(int i, String str, ReceiptInfo receiptInfo, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy, t0 t0Var) {
        if (11 != (i & 11)) {
            f0.a(i, 11, LocalTransactionMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.token = str;
        this.receiptInfo = receiptInfo;
        if ((i & 4) == 0) {
            this.paywallPostReceiptData = null;
        } else {
            this.paywallPostReceiptData = paywallPostReceiptData;
        }
        this.purchasesAreCompletedBy = purchasesAreCompletedBy;
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ LocalTransactionMetadata copy$default(LocalTransactionMetadata localTransactionMetadata, String str, ReceiptInfo receiptInfo, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localTransactionMetadata.token;
        }
        if ((i & 2) != 0) {
            receiptInfo = localTransactionMetadata.receiptInfo;
        }
        if ((i & 4) != 0) {
            paywallPostReceiptData = localTransactionMetadata.paywallPostReceiptData;
        }
        if ((i & 8) != 0) {
            purchasesAreCompletedBy = localTransactionMetadata.purchasesAreCompletedBy;
        }
        return localTransactionMetadata.copy(str, receiptInfo, paywallPostReceiptData, purchasesAreCompletedBy);
    }

    public static /* synthetic */ void getPaywallPostReceiptData$annotations() {
    }

    public static /* synthetic */ void getPurchasesAreCompletedBy$annotations() {
    }

    public static /* synthetic */ void getReceiptInfo$annotations() {
    }

    public static /* synthetic */ void getToken$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(LocalTransactionMetadata localTransactionMetadata, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        dVar.v(eVar, 0, localTransactionMetadata.token);
        dVar.k(eVar, 1, ReceiptInfo$$serializer.INSTANCE, localTransactionMetadata.receiptInfo);
        if (dVar.e(eVar, 2) || localTransactionMetadata.paywallPostReceiptData != null) {
            dVar.j(eVar, 2, PaywallPostReceiptData$$serializer.INSTANCE, localTransactionMetadata.paywallPostReceiptData);
        }
        dVar.k(eVar, 3, kVarArr[3], localTransactionMetadata.purchasesAreCompletedBy);
    }

    public final String component1() {
        return this.token;
    }

    public final ReceiptInfo component2() {
        return this.receiptInfo;
    }

    public final PaywallPostReceiptData component3() {
        return this.paywallPostReceiptData;
    }

    public final PurchasesAreCompletedBy component4() {
        return this.purchasesAreCompletedBy;
    }

    public final LocalTransactionMetadata copy(String str, ReceiptInfo receiptInfo, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy) {
        t.g(str, "token");
        t.g(receiptInfo, "receiptInfo");
        t.g(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        return new LocalTransactionMetadata(str, receiptInfo, paywallPostReceiptData, purchasesAreCompletedBy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalTransactionMetadata)) {
            return false;
        }
        LocalTransactionMetadata localTransactionMetadata = (LocalTransactionMetadata) obj;
        return t.c(this.token, localTransactionMetadata.token) && t.c(this.receiptInfo, localTransactionMetadata.receiptInfo) && t.c(this.paywallPostReceiptData, localTransactionMetadata.paywallPostReceiptData) && this.purchasesAreCompletedBy == localTransactionMetadata.purchasesAreCompletedBy;
    }

    public final PaywallPostReceiptData getPaywallPostReceiptData() {
        return this.paywallPostReceiptData;
    }

    public final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    public final ReceiptInfo getReceiptInfo() {
        return this.receiptInfo;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode = ((this.token.hashCode() * 31) + this.receiptInfo.hashCode()) * 31;
        PaywallPostReceiptData paywallPostReceiptData = this.paywallPostReceiptData;
        return ((hashCode + (paywallPostReceiptData == null ? 0 : paywallPostReceiptData.hashCode())) * 31) + this.purchasesAreCompletedBy.hashCode();
    }

    public String toString() {
        return "LocalTransactionMetadata(token=" + this.token + ", receiptInfo=" + this.receiptInfo + ", paywallPostReceiptData=" + this.paywallPostReceiptData + ", purchasesAreCompletedBy=" + this.purchasesAreCompletedBy + ')';
    }

    public LocalTransactionMetadata(String str, ReceiptInfo receiptInfo, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy) {
        t.g(str, "token");
        t.g(receiptInfo, "receiptInfo");
        t.g(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        this.token = str;
        this.receiptInfo = receiptInfo;
        this.paywallPostReceiptData = paywallPostReceiptData;
        this.purchasesAreCompletedBy = purchasesAreCompletedBy;
    }

    public /* synthetic */ LocalTransactionMetadata(String str, ReceiptInfo receiptInfo, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy, int i, k kVar) {
        this(str, receiptInfo, (i & 4) != 0 ? null : paywallPostReceiptData, purchasesAreCompletedBy);
    }
}
