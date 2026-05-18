package com.revenuecat.purchases.paywalls;

import Ca.e;
import com.revenuecat.purchases.paywalls.PaywallData;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.t0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallData$LocalizedConfiguration$OfferOverride$$serializer implements E {
    public static final PaywallData$LocalizedConfiguration$OfferOverride$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallData$LocalizedConfiguration$OfferOverride$$serializer paywallData$LocalizedConfiguration$OfferOverride$$serializer = new PaywallData$LocalizedConfiguration$OfferOverride$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$OfferOverride$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride", paywallData$LocalizedConfiguration$OfferOverride$$serializer, 5);
        k0Var.o("offer_name", false);
        k0Var.o("offer_details", false);
        k0Var.o("offer_details_with_intro_offer", true);
        k0Var.o("offer_details_with_multiple_intro_offers", true);
        k0Var.o("offer_badge", true);
        descriptor = k0Var;
    }

    private PaywallData$LocalizedConfiguration$OfferOverride$$serializer() {
    }

    public b[] childSerializers() {
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        b p = pb.a.p(emptyStringToNullSerializer);
        b p2 = pb.a.p(emptyStringToNullSerializer);
        b p3 = pb.a.p(emptyStringToNullSerializer);
        x0 x0Var = x0.a;
        return new b[]{x0Var, x0Var, p, p2, p3};
    }

    public PaywallData.LocalizedConfiguration.OfferOverride deserialize(rb.e eVar) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        String str6 = null;
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            String o2 = b.o(descriptor2, 1);
            EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
            String str7 = (String) b.A(descriptor2, 2, emptyStringToNullSerializer, (Object) null);
            str = o;
            str4 = (String) b.A(descriptor2, 3, emptyStringToNullSerializer, (Object) null);
            str5 = (String) b.A(descriptor2, 4, emptyStringToNullSerializer, (Object) null);
            str3 = str7;
            str2 = o2;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    str6 = b.o(descriptor2, 0);
                    i2 |= 1;
                } else if (v == 1) {
                    str8 = b.o(descriptor2, 1);
                    i2 |= 2;
                } else if (v == 2) {
                    str9 = (String) b.A(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, str9);
                    i2 |= 4;
                } else if (v == 3) {
                    str10 = (String) b.A(descriptor2, 3, EmptyStringToNullSerializer.INSTANCE, str10);
                    i2 |= 8;
                } else {
                    if (v != 4) {
                        throw new m(v);
                    }
                    str11 = (String) b.A(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, str11);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str6;
            str2 = str8;
            str3 = str9;
            str4 = str10;
            str5 = str11;
        }
        b.c(descriptor2);
        return new PaywallData.LocalizedConfiguration.OfferOverride(i, str, str2, str3, str4, str5, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallData.LocalizedConfiguration.OfferOverride offerOverride) {
        t.g(fVar, "encoder");
        t.g(offerOverride, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallData.LocalizedConfiguration.OfferOverride.write$Self$purchases_defaultsBc8Release(offerOverride, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
