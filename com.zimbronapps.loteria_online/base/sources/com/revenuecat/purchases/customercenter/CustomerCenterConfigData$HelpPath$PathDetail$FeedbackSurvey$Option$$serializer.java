package com.revenuecat.purchases.customercenter;

import Ca.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
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
public final class CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer implements E {
    public static final CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer = new CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option", customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer, 3);
        k0Var.o("id", false);
        k0Var.o("title", false);
        k0Var.o("promotional_offer", true);
        descriptor = k0Var;
    }

    private CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer() {
    }

    public b[] childSerializers() {
        b p = a.p(CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE);
        x0 x0Var = x0.a;
        return new b[]{x0Var, x0Var, p};
    }

    public CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option deserialize(rb.e eVar) {
        int i;
        String str;
        String str2;
        CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        String str3 = null;
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            String o2 = b.o(descriptor2, 1);
            str = o;
            promotionalOffer = (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) b.A(descriptor2, 2, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, (Object) null);
            str2 = o2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    str3 = b.o(descriptor2, 0);
                    i2 |= 1;
                } else if (v == 1) {
                    str4 = b.o(descriptor2, 1);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    promotionalOffer2 = (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) b.A(descriptor2, 2, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, promotionalOffer2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            promotionalOffer = promotionalOffer2;
        }
        b.c(descriptor2);
        return new CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option(i, str, str2, promotionalOffer, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option option) {
        t.g(fVar, "encoder");
        t.g(option, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option.write$Self$purchases_defaultsBc8Release(option, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
