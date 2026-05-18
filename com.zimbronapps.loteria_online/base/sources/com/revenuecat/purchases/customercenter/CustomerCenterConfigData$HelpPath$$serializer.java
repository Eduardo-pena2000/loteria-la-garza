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
public final class CustomerCenterConfigData$HelpPath$$serializer implements E {
    public static final CustomerCenterConfigData$HelpPath$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$$serializer customerCenterConfigData$HelpPath$$serializer = new CustomerCenterConfigData$HelpPath$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath", customerCenterConfigData$HelpPath$$serializer, 8);
        k0Var.o("id", false);
        k0Var.o("title", false);
        k0Var.o("type", false);
        k0Var.o("promotional_offer", true);
        k0Var.o("feedback_survey", true);
        k0Var.o("url", true);
        k0Var.o("open_method", true);
        k0Var.o("action_identifier", true);
        descriptor = k0Var;
    }

    private CustomerCenterConfigData$HelpPath$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = CustomerCenterConfigData.HelpPath.access$get$childSerializers$cp();
        b bVar = x0.a;
        return new b[]{bVar, bVar, access$get$childSerializers$cp[2], a.p(CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE), a.p(CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE), a.p(bVar), a.p(access$get$childSerializers$cp[6]), a.p(bVar)};
    }

    public CustomerCenterConfigData.HelpPath deserialize(rb.e eVar) {
        int i;
        String str;
        CustomerCenterConfigData.HelpPath.OpenMethod openMethod;
        String str2;
        CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey;
        String str3;
        String str4;
        CustomerCenterConfigData.HelpPath.PathType pathType;
        CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = CustomerCenterConfigData.HelpPath.access$get$childSerializers$cp();
        int i2 = 7;
        String str5 = null;
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            String o2 = b.o(descriptor2, 1);
            CustomerCenterConfigData.HelpPath.PathType pathType2 = (CustomerCenterConfigData.HelpPath.PathType) b.e(descriptor2, 2, access$get$childSerializers$cp[2], (Object) null);
            CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer2 = (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) b.A(descriptor2, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, (Object) null);
            CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey2 = (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) b.A(descriptor2, 4, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, (Object) null);
            x0 x0Var = x0.a;
            String str6 = (String) b.A(descriptor2, 5, x0Var, (Object) null);
            openMethod = (CustomerCenterConfigData.HelpPath.OpenMethod) b.A(descriptor2, 6, access$get$childSerializers$cp[6], (Object) null);
            str3 = o;
            str = (String) b.A(descriptor2, 7, x0Var, (Object) null);
            str2 = str6;
            promotionalOffer = promotionalOffer2;
            feedbackSurvey = feedbackSurvey2;
            i = 255;
            pathType = pathType2;
            str4 = o2;
        } else {
            boolean z = true;
            int i3 = 0;
            String str7 = null;
            CustomerCenterConfigData.HelpPath.OpenMethod openMethod2 = null;
            String str8 = null;
            CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey3 = null;
            String str9 = null;
            CustomerCenterConfigData.HelpPath.PathType pathType3 = null;
            CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer3 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        i2 = 7;
                    case 0:
                        i3 |= 1;
                        str5 = b.o(descriptor2, 0);
                        i2 = 7;
                    case 1:
                        str9 = b.o(descriptor2, 1);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        pathType3 = (CustomerCenterConfigData.HelpPath.PathType) b.e(descriptor2, 2, access$get$childSerializers$cp[2], pathType3);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        promotionalOffer3 = (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) b.A(descriptor2, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, promotionalOffer3);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        feedbackSurvey3 = (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) b.A(descriptor2, 4, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, feedbackSurvey3);
                        i3 |= 16;
                        i2 = 7;
                    case 5:
                        str8 = (String) b.A(descriptor2, 5, x0.a, str8);
                        i3 |= 32;
                    case 6:
                        openMethod2 = (CustomerCenterConfigData.HelpPath.OpenMethod) b.A(descriptor2, 6, access$get$childSerializers$cp[6], openMethod2);
                        i3 |= 64;
                    case 7:
                        str7 = (String) b.A(descriptor2, i2, x0.a, str7);
                        i3 |= 128;
                    default:
                        throw new m(v);
                }
            }
            i = i3;
            str = str7;
            openMethod = openMethod2;
            str2 = str8;
            feedbackSurvey = feedbackSurvey3;
            str3 = str5;
            str4 = str9;
            pathType = pathType3;
            promotionalOffer = promotionalOffer3;
        }
        b.c(descriptor2);
        return new CustomerCenterConfigData.HelpPath(i, str3, str4, pathType, promotionalOffer, feedbackSurvey, str2, openMethod, str, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterConfigData.HelpPath helpPath) {
        t.g(fVar, "encoder");
        t.g(helpPath, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterConfigData.HelpPath.write$Self$purchases_defaultsBc8Release(helpPath, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
