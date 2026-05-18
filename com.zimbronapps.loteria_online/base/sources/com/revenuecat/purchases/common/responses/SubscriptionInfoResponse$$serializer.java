package com.revenuecat.purchases.common.responses;

import Ca.e;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.StoreSerializer;
import com.revenuecat.purchases.common.responses.SubscriptionInfoResponse;
import com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer;
import java.util.Date;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.h;
import sb.k0;
import sb.t0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriptionInfoResponse$$serializer implements E {
    public static final SubscriptionInfoResponse$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        SubscriptionInfoResponse$$serializer subscriptionInfoResponse$$serializer = new SubscriptionInfoResponse$$serializer();
        INSTANCE = subscriptionInfoResponse$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.common.responses.SubscriptionInfoResponse", subscriptionInfoResponse$$serializer, 17);
        k0Var.o("purchase_date", false);
        k0Var.o("original_purchase_date", true);
        k0Var.o("expires_date", true);
        k0Var.o("store", false);
        k0Var.o("is_sandbox", false);
        k0Var.o("unsubscribe_detected_at", true);
        k0Var.o("billing_issues_detected_at", true);
        k0Var.o("grace_period_expires_date", true);
        k0Var.o("ownership_type", true);
        k0Var.o("period_type", false);
        k0Var.o("refunded_at", true);
        k0Var.o("store_transaction_id", true);
        k0Var.o("auto_resume_date", true);
        k0Var.o("display_name", true);
        k0Var.o("price", true);
        k0Var.o("product_plan_identifier", true);
        k0Var.o("management_url", true);
        descriptor = k0Var;
    }

    private SubscriptionInfoResponse$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = SubscriptionInfoResponse.access$get$childSerializers$cp();
        b bVar = ISO8601DateSerializer.INSTANCE;
        b p = a.p(bVar);
        b p2 = a.p(bVar);
        b p3 = a.p(bVar);
        b p4 = a.p(bVar);
        b p5 = a.p(bVar);
        b bVar2 = access$get$childSerializers$cp[8];
        b bVar3 = access$get$childSerializers$cp[9];
        b p6 = a.p(bVar);
        x0 x0Var = x0.a;
        return new b[]{bVar, p, p2, StoreSerializer.INSTANCE, h.a, p3, p4, p5, bVar2, bVar3, p6, a.p(x0Var), a.p(bVar), a.p(x0Var), a.p(SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE), a.p(x0Var), a.p(x0Var)};
    }

    public SubscriptionInfoResponse deserialize(rb.e eVar) {
        Date date;
        String str;
        Date date2;
        String str2;
        String str3;
        String str4;
        int i;
        SubscriptionInfoResponse.PriceResponse priceResponse;
        Date date3;
        PeriodType periodType;
        OwnershipType ownershipType;
        Date date4;
        Date date5;
        Date date6;
        Store store;
        Date date7;
        Date date8;
        boolean z;
        Date date9;
        int i2;
        ob.a[] aVarArr;
        Date date10;
        Date date11;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = SubscriptionInfoResponse.access$get$childSerializers$cp();
        if (b.m()) {
            ISO8601DateSerializer iSO8601DateSerializer = ISO8601DateSerializer.INSTANCE;
            Date date12 = (Date) b.e(descriptor2, 0, iSO8601DateSerializer, (Object) null);
            Date date13 = (Date) b.A(descriptor2, 1, iSO8601DateSerializer, (Object) null);
            Date date14 = (Date) b.A(descriptor2, 2, iSO8601DateSerializer, (Object) null);
            Store store2 = (Store) b.e(descriptor2, 3, StoreSerializer.INSTANCE, (Object) null);
            boolean q = b.q(descriptor2, 4);
            Date date15 = (Date) b.A(descriptor2, 5, iSO8601DateSerializer, (Object) null);
            Date date16 = (Date) b.A(descriptor2, 6, iSO8601DateSerializer, (Object) null);
            Date date17 = (Date) b.A(descriptor2, 7, iSO8601DateSerializer, (Object) null);
            OwnershipType ownershipType2 = (OwnershipType) b.e(descriptor2, 8, access$get$childSerializers$cp[8], (Object) null);
            PeriodType periodType2 = (PeriodType) b.e(descriptor2, 9, access$get$childSerializers$cp[9], (Object) null);
            Date date18 = (Date) b.A(descriptor2, 10, iSO8601DateSerializer, (Object) null);
            x0 x0Var = x0.a;
            String str5 = (String) b.A(descriptor2, 11, x0Var, (Object) null);
            Date date19 = (Date) b.A(descriptor2, 12, iSO8601DateSerializer, (Object) null);
            String str6 = (String) b.A(descriptor2, 13, x0Var, (Object) null);
            SubscriptionInfoResponse.PriceResponse priceResponse2 = (SubscriptionInfoResponse.PriceResponse) b.A(descriptor2, 14, SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE, (Object) null);
            String str7 = (String) b.A(descriptor2, 15, x0Var, (Object) null);
            str3 = (String) b.A(descriptor2, 16, x0Var, (Object) null);
            str4 = str7;
            date3 = date18;
            ownershipType = ownershipType2;
            date5 = date13;
            date = date12;
            i = 131071;
            store = store2;
            date4 = date17;
            date8 = date16;
            date7 = date15;
            z = q;
            date6 = date14;
            priceResponse = priceResponse2;
            date2 = date19;
            str = str6;
            str2 = str5;
            periodType = periodType2;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            String str8 = null;
            Date date20 = null;
            String str9 = null;
            String str10 = null;
            SubscriptionInfoResponse.PriceResponse priceResponse3 = null;
            Date date21 = null;
            PeriodType periodType3 = null;
            OwnershipType ownershipType3 = null;
            Date date22 = null;
            Date date23 = null;
            Date date24 = null;
            Date date25 = null;
            Date date26 = null;
            Date date27 = null;
            Store store3 = null;
            String str11 = null;
            int i3 = 0;
            while (z2) {
                Date date28 = date23;
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        aVarArr = access$get$childSerializers$cp;
                        z2 = false;
                        date23 = date28;
                        access$get$childSerializers$cp = aVarArr;
                    case 0:
                        aVarArr = access$get$childSerializers$cp;
                        date10 = date22;
                        date11 = date28;
                        date25 = (Date) b.e(descriptor2, 0, ISO8601DateSerializer.INSTANCE, date25);
                        i3 |= 1;
                        date26 = date26;
                        date23 = date11;
                        date22 = date10;
                        access$get$childSerializers$cp = aVarArr;
                    case 1:
                        aVarArr = access$get$childSerializers$cp;
                        date10 = date22;
                        date11 = date28;
                        date26 = (Date) b.A(descriptor2, 1, ISO8601DateSerializer.INSTANCE, date26);
                        i3 |= 2;
                        date27 = date27;
                        date23 = date11;
                        date22 = date10;
                        access$get$childSerializers$cp = aVarArr;
                    case 2:
                        aVarArr = access$get$childSerializers$cp;
                        date10 = date22;
                        date11 = date28;
                        date27 = (Date) b.A(descriptor2, 2, ISO8601DateSerializer.INSTANCE, date27);
                        i3 |= 4;
                        store3 = store3;
                        date23 = date11;
                        date22 = date10;
                        access$get$childSerializers$cp = aVarArr;
                    case 3:
                        aVarArr = access$get$childSerializers$cp;
                        date10 = date22;
                        date11 = date28;
                        store3 = (Store) b.e(descriptor2, 3, StoreSerializer.INSTANCE, store3);
                        i3 |= 8;
                        date23 = date11;
                        date22 = date10;
                        access$get$childSerializers$cp = aVarArr;
                    case 4:
                        aVarArr = access$get$childSerializers$cp;
                        date10 = date22;
                        z3 = b.q(descriptor2, 4);
                        i3 |= 16;
                        date23 = date28;
                        date22 = date10;
                        access$get$childSerializers$cp = aVarArr;
                    case 5:
                        aVarArr = access$get$childSerializers$cp;
                        date10 = date22;
                        date23 = (Date) b.A(descriptor2, 5, ISO8601DateSerializer.INSTANCE, date28);
                        i3 |= 32;
                        date22 = date10;
                        access$get$childSerializers$cp = aVarArr;
                    case 6:
                        i3 |= 64;
                        date22 = (Date) b.A(descriptor2, 6, ISO8601DateSerializer.INSTANCE, date22);
                        access$get$childSerializers$cp = access$get$childSerializers$cp;
                        date23 = date28;
                    case 7:
                        date9 = date22;
                        date24 = (Date) b.A(descriptor2, 7, ISO8601DateSerializer.INSTANCE, date24);
                        i3 |= 128;
                        date23 = date28;
                        date22 = date9;
                    case 8:
                        date9 = date22;
                        ownershipType3 = (OwnershipType) b.e(descriptor2, 8, access$get$childSerializers$cp[8], ownershipType3);
                        i3 |= 256;
                        date23 = date28;
                        date22 = date9;
                    case 9:
                        date9 = date22;
                        periodType3 = (PeriodType) b.e(descriptor2, 9, access$get$childSerializers$cp[9], periodType3);
                        i3 |= 512;
                        date23 = date28;
                        date22 = date9;
                    case 10:
                        date9 = date22;
                        date21 = (Date) b.A(descriptor2, 10, ISO8601DateSerializer.INSTANCE, date21);
                        i3 |= 1024;
                        date23 = date28;
                        date22 = date9;
                    case 11:
                        date9 = date22;
                        str9 = (String) b.A(descriptor2, 11, x0.a, str9);
                        i3 |= 2048;
                        date23 = date28;
                        date22 = date9;
                    case 12:
                        date9 = date22;
                        date20 = (Date) b.A(descriptor2, 12, ISO8601DateSerializer.INSTANCE, date20);
                        i3 |= 4096;
                        date23 = date28;
                        date22 = date9;
                    case 13:
                        date9 = date22;
                        str8 = (String) b.A(descriptor2, 13, x0.a, str8);
                        i3 |= 8192;
                        date23 = date28;
                        date22 = date9;
                    case 14:
                        date9 = date22;
                        priceResponse3 = (SubscriptionInfoResponse.PriceResponse) b.A(descriptor2, 14, SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE, priceResponse3);
                        i3 |= 16384;
                        date23 = date28;
                        date22 = date9;
                    case 15:
                        date9 = date22;
                        str11 = (String) b.A(descriptor2, 15, x0.a, str11);
                        i2 = 32768;
                        i3 |= i2;
                        date23 = date28;
                        date22 = date9;
                    case 16:
                        date9 = date22;
                        str10 = (String) b.A(descriptor2, 16, x0.a, str10);
                        i2 = 65536;
                        i3 |= i2;
                        date23 = date28;
                        date22 = date9;
                    default:
                        throw new m(v);
                }
            }
            date = date25;
            str = str8;
            date2 = date20;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            i = i3;
            priceResponse = priceResponse3;
            date3 = date21;
            periodType = periodType3;
            ownershipType = ownershipType3;
            date4 = date24;
            date5 = date26;
            date6 = date27;
            store = store3;
            date7 = date23;
            date8 = date22;
            z = z3;
        }
        b.c(descriptor2);
        return new SubscriptionInfoResponse(i, date, date5, date6, store, z, date7, date8, date4, ownershipType, periodType, date3, str2, date2, str, priceResponse, str4, str3, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, SubscriptionInfoResponse subscriptionInfoResponse) {
        t.g(fVar, "encoder");
        t.g(subscriptionInfoResponse, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        SubscriptionInfoResponse.write$Self$purchases_defaultsBc8Release(subscriptionInfoResponse, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
