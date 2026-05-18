package com.revenuecat.purchases.customercenter;

import Ca.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer implements E {
    public static final CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer = new CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.CrossProductPromotion", customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer, 2);
        k0Var.o("store_offer_identifier", false);
        k0Var.o("target_product_id", false);
        descriptor = k0Var;
    }

    private CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer() {
    }

    public b[] childSerializers() {
        x0 x0Var = x0.a;
        return new b[]{x0Var, x0Var};
    }

    public CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.CrossProductPromotion deserialize(rb.e eVar) {
        String str;
        String str2;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            str = b.o(descriptor2, 0);
            str2 = b.o(descriptor2, 1);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            str = null;
            String str3 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    str = b.o(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    str3 = b.o(descriptor2, 1);
                    i2 |= 2;
                }
            }
            str2 = str3;
            i = i2;
        }
        b.c(descriptor2);
        return new CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.CrossProductPromotion(i, str, str2, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.CrossProductPromotion crossProductPromotion) {
        t.g(fVar, "encoder");
        t.g(crossProductPromotion, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.CrossProductPromotion.write$Self$purchases_defaultsBc8Release(crossProductPromotion, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
