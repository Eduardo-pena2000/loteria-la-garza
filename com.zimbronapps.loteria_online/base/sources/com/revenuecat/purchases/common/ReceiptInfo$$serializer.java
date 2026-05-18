package com.revenuecat.purchases.common;

import Ca.e;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PresentedOfferingContextSerializer;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.ReplacementModeSerializer;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.PeriodSerializer;
import java.util.List;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.Q;
import sb.h;
import sb.k0;
import sb.t;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ReceiptInfo$$serializer implements E {
    public static final ReceiptInfo$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ReceiptInfo$$serializer receiptInfo$$serializer = new ReceiptInfo$$serializer();
        INSTANCE = receiptInfo$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.common.ReceiptInfo", receiptInfo$$serializer, 14);
        k0Var.o("productIDs", false);
        k0Var.o("purchaseTime", true);
        k0Var.o("presentedOfferingContext", true);
        k0Var.o("price", true);
        k0Var.o("formattedPrice", true);
        k0Var.o("currency", true);
        k0Var.o("period", true);
        k0Var.o("pricingPhases", true);
        k0Var.o("replacementMode", true);
        k0Var.o("platformProductIds", true);
        k0Var.o("sdkOriginated", true);
        k0Var.o("storeUserID", true);
        k0Var.o("marketplace", true);
        k0Var.o("duration", true);
        descriptor = k0Var;
    }

    private ReceiptInfo$$serializer() {
    }

    public ob.b[] childSerializers() {
        ob.b[] access$get$childSerializers$cp = ReceiptInfo.access$get$childSerializers$cp();
        ob.b bVar = access$get$childSerializers$cp[0];
        ob.b p = pb.a.p(Q.a);
        ob.b p2 = pb.a.p(PresentedOfferingContextSerializer.INSTANCE);
        ob.b p3 = pb.a.p(t.a);
        x0 x0Var = x0.a;
        return new ob.b[]{bVar, p, p2, p3, pb.a.p(x0Var), pb.a.p(x0Var), pb.a.p(PeriodSerializer.INSTANCE), pb.a.p(access$get$childSerializers$cp[7]), pb.a.p(ReplacementModeSerializer.INSTANCE), access$get$childSerializers$cp[9], h.a, pb.a.p(x0Var), pb.a.p(x0Var), pb.a.p(x0Var)};
    }

    public ReceiptInfo deserialize(rb.e eVar) {
        List list;
        Long l;
        Double d;
        int i;
        ReplacementMode replacementMode;
        List list2;
        String str;
        String str2;
        Period period;
        String str3;
        String str4;
        List list3;
        PresentedOfferingContext presentedOfferingContext;
        String str5;
        boolean z;
        PresentedOfferingContext presentedOfferingContext2;
        String str6;
        PresentedOfferingContext presentedOfferingContext3;
        ob.a[] aVarArr;
        kotlin.jvm.internal.t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = ReceiptInfo.access$get$childSerializers$cp();
        if (b.m()) {
            List list4 = (List) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
            Long l2 = (Long) b.A(descriptor2, 1, Q.a, (Object) null);
            PresentedOfferingContext presentedOfferingContext4 = (PresentedOfferingContext) b.A(descriptor2, 2, PresentedOfferingContextSerializer.INSTANCE, (Object) null);
            Double d2 = (Double) b.A(descriptor2, 3, t.a, (Object) null);
            x0 x0Var = x0.a;
            String str7 = (String) b.A(descriptor2, 4, x0Var, (Object) null);
            String str8 = (String) b.A(descriptor2, 5, x0Var, (Object) null);
            Period period2 = (Period) b.A(descriptor2, 6, PeriodSerializer.INSTANCE, (Object) null);
            List list5 = (List) b.A(descriptor2, 7, access$get$childSerializers$cp[7], (Object) null);
            ReplacementMode replacementMode2 = (ReplacementMode) b.A(descriptor2, 8, ReplacementModeSerializer.INSTANCE, (Object) null);
            List list6 = (List) b.e(descriptor2, 9, access$get$childSerializers$cp[9], (Object) null);
            boolean q = b.q(descriptor2, 10);
            String str9 = (String) b.A(descriptor2, 11, x0Var, (Object) null);
            String str10 = (String) b.A(descriptor2, 12, x0Var, (Object) null);
            str5 = (String) b.A(descriptor2, 13, x0Var, (Object) null);
            list = list4;
            l = l2;
            presentedOfferingContext = presentedOfferingContext4;
            i = 16383;
            period = period2;
            list2 = list5;
            str = str8;
            d = d2;
            replacementMode = replacementMode2;
            str3 = str7;
            z = q;
            str2 = str9;
            str4 = str10;
            list3 = list6;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            String str11 = null;
            Double d3 = null;
            Long l3 = null;
            ReplacementMode replacementMode3 = null;
            List list7 = null;
            String str12 = null;
            String str13 = null;
            Period period3 = null;
            String str14 = null;
            String str15 = null;
            List list8 = null;
            List list9 = null;
            PresentedOfferingContext presentedOfferingContext5 = null;
            int i2 = 0;
            while (z2) {
                Long l4 = l3;
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        str6 = str11;
                        presentedOfferingContext3 = presentedOfferingContext5;
                        aVarArr = access$get$childSerializers$cp;
                        l3 = l4;
                        z2 = false;
                        presentedOfferingContext5 = presentedOfferingContext3;
                        str11 = str6;
                        access$get$childSerializers$cp = aVarArr;
                    case 0:
                        str6 = str11;
                        presentedOfferingContext3 = presentedOfferingContext5;
                        aVarArr = access$get$childSerializers$cp;
                        list9 = (List) b.e(descriptor2, 0, access$get$childSerializers$cp[0], list9);
                        i2 |= 1;
                        l3 = l4;
                        presentedOfferingContext5 = presentedOfferingContext3;
                        str11 = str6;
                        access$get$childSerializers$cp = aVarArr;
                    case 1:
                        i2 |= 2;
                        l3 = (Long) b.A(descriptor2, 1, Q.a, l4);
                        presentedOfferingContext5 = presentedOfferingContext5;
                        str11 = str11;
                    case 2:
                        presentedOfferingContext5 = (PresentedOfferingContext) b.A(descriptor2, 2, PresentedOfferingContextSerializer.INSTANCE, presentedOfferingContext5);
                        i2 |= 4;
                        str11 = str11;
                        l3 = l4;
                    case 3:
                        presentedOfferingContext2 = presentedOfferingContext5;
                        d3 = (Double) b.A(descriptor2, 3, t.a, d3);
                        i2 |= 8;
                        l3 = l4;
                        presentedOfferingContext5 = presentedOfferingContext2;
                    case 4:
                        presentedOfferingContext2 = presentedOfferingContext5;
                        str14 = (String) b.A(descriptor2, 4, x0.a, str14);
                        i2 |= 16;
                        l3 = l4;
                        presentedOfferingContext5 = presentedOfferingContext2;
                    case 5:
                        presentedOfferingContext2 = presentedOfferingContext5;
                        str12 = (String) b.A(descriptor2, 5, x0.a, str12);
                        i2 |= 32;
                        l3 = l4;
                        presentedOfferingContext5 = presentedOfferingContext2;
                    case 6:
                        presentedOfferingContext2 = presentedOfferingContext5;
                        period3 = (Period) b.A(descriptor2, 6, PeriodSerializer.INSTANCE, period3);
                        i2 |= 64;
                        l3 = l4;
                        presentedOfferingContext5 = presentedOfferingContext2;
                    case 7:
                        presentedOfferingContext2 = presentedOfferingContext5;
                        list7 = (List) b.A(descriptor2, 7, access$get$childSerializers$cp[7], list7);
                        i2 |= 128;
                        l3 = l4;
                        presentedOfferingContext5 = presentedOfferingContext2;
                    case 8:
                        presentedOfferingContext2 = presentedOfferingContext5;
                        replacementMode3 = (ReplacementMode) b.A(descriptor2, 8, ReplacementModeSerializer.INSTANCE, replacementMode3);
                        i2 |= 256;
                        l3 = l4;
                        presentedOfferingContext5 = presentedOfferingContext2;
                    case 9:
                        presentedOfferingContext2 = presentedOfferingContext5;
                        list8 = (List) b.e(descriptor2, 9, access$get$childSerializers$cp[9], list8);
                        i2 |= 512;
                        l3 = l4;
                        presentedOfferingContext5 = presentedOfferingContext2;
                    case 10:
                        presentedOfferingContext2 = presentedOfferingContext5;
                        z3 = b.q(descriptor2, 10);
                        i2 |= 1024;
                        l3 = l4;
                        presentedOfferingContext5 = presentedOfferingContext2;
                    case 11:
                        presentedOfferingContext2 = presentedOfferingContext5;
                        str13 = (String) b.A(descriptor2, 11, x0.a, str13);
                        i2 |= 2048;
                        l3 = l4;
                        presentedOfferingContext5 = presentedOfferingContext2;
                    case 12:
                        presentedOfferingContext2 = presentedOfferingContext5;
                        str15 = (String) b.A(descriptor2, 12, x0.a, str15);
                        i2 |= 4096;
                        l3 = l4;
                        presentedOfferingContext5 = presentedOfferingContext2;
                    case 13:
                        presentedOfferingContext2 = presentedOfferingContext5;
                        str11 = (String) b.A(descriptor2, 13, x0.a, str11);
                        i2 |= 8192;
                        l3 = l4;
                        presentedOfferingContext5 = presentedOfferingContext2;
                    default:
                        throw new m(v);
                }
            }
            list = list9;
            l = l3;
            d = d3;
            i = i2;
            replacementMode = replacementMode3;
            list2 = list7;
            str = str12;
            str2 = str13;
            period = period3;
            str3 = str14;
            str4 = str15;
            list3 = list8;
            presentedOfferingContext = presentedOfferingContext5;
            str5 = str11;
            z = z3;
        }
        b.c(descriptor2);
        return new ReceiptInfo(i, list, l, presentedOfferingContext, d, str3, str, period, list2, replacementMode, list3, z, str2, str4, str5, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ReceiptInfo receiptInfo) {
        kotlin.jvm.internal.t.g(fVar, "encoder");
        kotlin.jvm.internal.t.g(receiptInfo, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ReceiptInfo.write$Self$purchases_defaultsBc8Release(receiptInfo, b, descriptor2);
        b.c(descriptor2);
    }

    public ob.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
