package com.revenuecat.purchases.customercenter;

import Ca.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.PaywallColor;
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

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerCenterConfigData$Appearance$ColorInformation$$serializer implements E {
    public static final CustomerCenterConfigData$Appearance$ColorInformation$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterConfigData$Appearance$ColorInformation$$serializer customerCenterConfigData$Appearance$ColorInformation$$serializer = new CustomerCenterConfigData$Appearance$ColorInformation$$serializer();
        INSTANCE = customerCenterConfigData$Appearance$ColorInformation$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance.ColorInformation", customerCenterConfigData$Appearance$ColorInformation$$serializer, 5);
        k0Var.o("accent_color", true);
        k0Var.o("text_color", true);
        k0Var.o("background_color", true);
        k0Var.o("button_text_color", true);
        k0Var.o("button_background_color", true);
        descriptor = k0Var;
    }

    private CustomerCenterConfigData$Appearance$ColorInformation$$serializer() {
    }

    public b[] childSerializers() {
        PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
        return new b[]{a.p(serializer), a.p(serializer), a.p(serializer), a.p(serializer), a.p(serializer)};
    }

    public CustomerCenterConfigData.Appearance.ColorInformation deserialize(rb.e eVar) {
        int i;
        PaywallColor paywallColor;
        PaywallColor paywallColor2;
        PaywallColor paywallColor3;
        PaywallColor paywallColor4;
        PaywallColor paywallColor5;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        PaywallColor paywallColor6 = null;
        if (b.m()) {
            PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
            PaywallColor paywallColor7 = (PaywallColor) b.A(descriptor2, 0, serializer, (Object) null);
            PaywallColor paywallColor8 = (PaywallColor) b.A(descriptor2, 1, serializer, (Object) null);
            PaywallColor paywallColor9 = (PaywallColor) b.A(descriptor2, 2, serializer, (Object) null);
            PaywallColor paywallColor10 = (PaywallColor) b.A(descriptor2, 3, serializer, (Object) null);
            paywallColor5 = (PaywallColor) b.A(descriptor2, 4, serializer, (Object) null);
            paywallColor4 = paywallColor10;
            i = 31;
            paywallColor3 = paywallColor9;
            paywallColor2 = paywallColor8;
            paywallColor = paywallColor7;
        } else {
            boolean z = true;
            int i2 = 0;
            PaywallColor paywallColor11 = null;
            PaywallColor paywallColor12 = null;
            PaywallColor paywallColor13 = null;
            PaywallColor paywallColor14 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    paywallColor6 = (PaywallColor) b.A(descriptor2, 0, PaywallColor.Serializer.INSTANCE, paywallColor6);
                    i2 |= 1;
                } else if (v == 1) {
                    paywallColor11 = (PaywallColor) b.A(descriptor2, 1, PaywallColor.Serializer.INSTANCE, paywallColor11);
                    i2 |= 2;
                } else if (v == 2) {
                    paywallColor12 = (PaywallColor) b.A(descriptor2, 2, PaywallColor.Serializer.INSTANCE, paywallColor12);
                    i2 |= 4;
                } else if (v == 3) {
                    paywallColor13 = (PaywallColor) b.A(descriptor2, 3, PaywallColor.Serializer.INSTANCE, paywallColor13);
                    i2 |= 8;
                } else {
                    if (v != 4) {
                        throw new m(v);
                    }
                    paywallColor14 = (PaywallColor) b.A(descriptor2, 4, PaywallColor.Serializer.INSTANCE, paywallColor14);
                    i2 |= 16;
                }
            }
            i = i2;
            paywallColor = paywallColor6;
            paywallColor2 = paywallColor11;
            paywallColor3 = paywallColor12;
            paywallColor4 = paywallColor13;
            paywallColor5 = paywallColor14;
        }
        b.c(descriptor2);
        return new CustomerCenterConfigData.Appearance.ColorInformation(i, paywallColor, paywallColor2, paywallColor3, paywallColor4, paywallColor5, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterConfigData.Appearance.ColorInformation colorInformation) {
        t.g(fVar, "encoder");
        t.g(colorInformation, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterConfigData.Appearance.ColorInformation.write$Self$purchases_defaultsBc8Release(colorInformation, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
