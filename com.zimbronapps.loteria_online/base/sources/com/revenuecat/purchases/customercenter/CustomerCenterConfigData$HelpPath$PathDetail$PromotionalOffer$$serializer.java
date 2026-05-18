package com.revenuecat.purchases.customercenter;

import Ca.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.Map;
import kotlin.jvm.internal.t;
import ob.a;
import ob.b;
import ob.m;
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
public final class CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer implements E {
    public static final CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer = new CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer", customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer, 6);
        k0Var.o("android_offer_id", false);
        k0Var.o("eligible", false);
        k0Var.o("title", false);
        k0Var.o("subtitle", false);
        k0Var.o("product_mapping", false);
        k0Var.o("cross_product_promotions", true);
        descriptor = k0Var;
    }

    private CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.access$get$childSerializers$cp();
        b bVar = access$get$childSerializers$cp[4];
        b bVar2 = access$get$childSerializers$cp[5];
        x0 x0Var = x0.a;
        return new b[]{x0Var, h.a, x0Var, x0Var, bVar, bVar2};
    }

    public CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer deserialize(rb.e eVar) {
        int i;
        boolean z;
        String str;
        String str2;
        String str3;
        Map map;
        Map map2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        a[] access$get$childSerializers$cp = CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.access$get$childSerializers$cp();
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            boolean q = b.q(descriptor2, 1);
            String o2 = b.o(descriptor2, 2);
            String o3 = b.o(descriptor2, 3);
            Map map3 = (Map) b.e(descriptor2, 4, access$get$childSerializers$cp[4], (Object) null);
            map2 = (Map) b.e(descriptor2, 5, access$get$childSerializers$cp[5], (Object) null);
            str = o;
            str3 = o3;
            str2 = o2;
            i = 63;
            map = map3;
            z = q;
        } else {
            boolean z2 = true;
            int i2 = 0;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Map map4 = null;
            Map map5 = null;
            boolean z3 = false;
            while (z2) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        str4 = b.o(descriptor2, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        z3 = b.q(descriptor2, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        str5 = b.o(descriptor2, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str6 = b.o(descriptor2, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        map4 = (Map) b.e(descriptor2, 4, access$get$childSerializers$cp[4], map4);
                        i2 |= 16;
                        break;
                    case 5:
                        map5 = (Map) b.e(descriptor2, 5, access$get$childSerializers$cp[5], map5);
                        i2 |= 32;
                        break;
                    default:
                        throw new m(v);
                }
            }
            i = i2;
            z = z3;
            str = str4;
            str2 = str5;
            str3 = str6;
            map = map4;
            map2 = map5;
        }
        b.c(descriptor2);
        return new CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer(i, str, z, str2, str3, map, map2, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer) {
        t.g(fVar, "encoder");
        t.g(promotionalOffer, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.write$Self$purchases_defaultsBc8Release(promotionalOffer, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
