package com.revenuecat.purchases.common.caching;

import Ca.e;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.ReceiptInfo$$serializer;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData$$serializer;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.t0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LocalTransactionMetadata$$serializer implements E {
    public static final LocalTransactionMetadata$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        LocalTransactionMetadata$$serializer localTransactionMetadata$$serializer = new LocalTransactionMetadata$$serializer();
        INSTANCE = localTransactionMetadata$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.common.caching.LocalTransactionMetadata", localTransactionMetadata$$serializer, 4);
        k0Var.o("token", false);
        k0Var.o("receipt_info", false);
        k0Var.o("paywall_data", true);
        k0Var.o("purchases_are_completed_by", false);
        descriptor = k0Var;
    }

    private LocalTransactionMetadata$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{x0.a, ReceiptInfo$$serializer.INSTANCE, a.p(PaywallPostReceiptData$$serializer.INSTANCE), LocalTransactionMetadata.access$get$childSerializers$cp()[3]};
    }

    public LocalTransactionMetadata deserialize(rb.e eVar) {
        int i;
        String str;
        ReceiptInfo receiptInfo;
        PaywallPostReceiptData paywallPostReceiptData;
        PurchasesAreCompletedBy purchasesAreCompletedBy;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = LocalTransactionMetadata.access$get$childSerializers$cp();
        String str2 = null;
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            ReceiptInfo receiptInfo2 = (ReceiptInfo) b.e(descriptor2, 1, ReceiptInfo$$serializer.INSTANCE, (Object) null);
            PaywallPostReceiptData paywallPostReceiptData2 = (PaywallPostReceiptData) b.A(descriptor2, 2, PaywallPostReceiptData$$serializer.INSTANCE, (Object) null);
            purchasesAreCompletedBy = (PurchasesAreCompletedBy) b.e(descriptor2, 3, access$get$childSerializers$cp[3], (Object) null);
            str = o;
            paywallPostReceiptData = paywallPostReceiptData2;
            i = 15;
            receiptInfo = receiptInfo2;
        } else {
            boolean z = true;
            int i2 = 0;
            ReceiptInfo receiptInfo3 = null;
            PaywallPostReceiptData paywallPostReceiptData3 = null;
            PurchasesAreCompletedBy purchasesAreCompletedBy2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    str2 = b.o(descriptor2, 0);
                    i2 |= 1;
                } else if (v == 1) {
                    receiptInfo3 = (ReceiptInfo) b.e(descriptor2, 1, ReceiptInfo$$serializer.INSTANCE, receiptInfo3);
                    i2 |= 2;
                } else if (v == 2) {
                    paywallPostReceiptData3 = (PaywallPostReceiptData) b.A(descriptor2, 2, PaywallPostReceiptData$$serializer.INSTANCE, paywallPostReceiptData3);
                    i2 |= 4;
                } else {
                    if (v != 3) {
                        throw new m(v);
                    }
                    purchasesAreCompletedBy2 = (PurchasesAreCompletedBy) b.e(descriptor2, 3, access$get$childSerializers$cp[3], purchasesAreCompletedBy2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str2;
            receiptInfo = receiptInfo3;
            paywallPostReceiptData = paywallPostReceiptData3;
            purchasesAreCompletedBy = purchasesAreCompletedBy2;
        }
        b.c(descriptor2);
        return new LocalTransactionMetadata(i, str, receiptInfo, paywallPostReceiptData, purchasesAreCompletedBy, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, LocalTransactionMetadata localTransactionMetadata) {
        t.g(fVar, "encoder");
        t.g(localTransactionMetadata, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        LocalTransactionMetadata.write$Self$purchases_defaultsBc8Release(localTransactionMetadata, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
