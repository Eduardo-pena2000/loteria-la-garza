package com.revenuecat.purchases.customercenter;

import Ca.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.List;
import kotlin.jvm.internal.t;
import ob.a;
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
public final class CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer implements E {
    public static final CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer = new CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey", customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer, 2);
        k0Var.o("title", false);
        k0Var.o("options", false);
        descriptor = k0Var;
    }

    private CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{x0.a, CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.access$get$childSerializers$cp()[1]};
    }

    public CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey deserialize(rb.e eVar) {
        List list;
        String str;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        a[] access$get$childSerializers$cp = CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.access$get$childSerializers$cp();
        if (b.m()) {
            str = b.o(descriptor2, 0);
            list = (List) b.e(descriptor2, 1, access$get$childSerializers$cp[1], (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            String str2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    str2 = b.o(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    list2 = (List) b.e(descriptor2, 1, access$get$childSerializers$cp[1], list2);
                    i2 |= 2;
                }
            }
            list = list2;
            str = str2;
            i = i2;
        }
        b.c(descriptor2);
        return new CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey(i, str, list, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey) {
        t.g(fVar, "encoder");
        t.g(feedbackSurvey, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.write$Self$purchases_defaultsBc8Release(feedbackSurvey, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
