package com.revenuecat.purchases.paywalls;

import Ca.e;
import com.revenuecat.purchases.paywalls.PaywallData;
import java.util.List;
import java.util.Map;
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
public final class PaywallData$LocalizedConfiguration$$serializer implements E {
    public static final PaywallData$LocalizedConfiguration$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = new PaywallData$LocalizedConfiguration$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration", paywallData$LocalizedConfiguration$$serializer, 12);
        k0Var.o("title", false);
        k0Var.o("subtitle", true);
        k0Var.o("call_to_action", false);
        k0Var.o("call_to_action_with_intro_offer", true);
        k0Var.o("call_to_action_with_multiple_intro_offers", true);
        k0Var.o("offer_details", true);
        k0Var.o("offer_details_with_intro_offer", true);
        k0Var.o("offer_details_with_multiple_intro_offers", true);
        k0Var.o("offer_name", true);
        k0Var.o("features", true);
        k0Var.o("tier_name", true);
        k0Var.o("offer_overrides", true);
        descriptor = k0Var;
    }

    private PaywallData$LocalizedConfiguration$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = PaywallData.LocalizedConfiguration.access$get$childSerializers$cp();
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        b p = pb.a.p(emptyStringToNullSerializer);
        b p2 = pb.a.p(emptyStringToNullSerializer);
        b p3 = pb.a.p(emptyStringToNullSerializer);
        b p4 = pb.a.p(emptyStringToNullSerializer);
        b p5 = pb.a.p(emptyStringToNullSerializer);
        b p6 = pb.a.p(emptyStringToNullSerializer);
        b p7 = pb.a.p(emptyStringToNullSerializer);
        b bVar = access$get$childSerializers$cp[9];
        b p8 = pb.a.p(emptyStringToNullSerializer);
        b bVar2 = access$get$childSerializers$cp[11];
        x0 x0Var = x0.a;
        return new b[]{x0Var, p, x0Var, p2, p3, p4, p5, p6, p7, bVar, p8, bVar2};
    }

    public PaywallData.LocalizedConfiguration deserialize(rb.e eVar) {
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        Map map;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = PaywallData.LocalizedConfiguration.access$get$childSerializers$cp();
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
            String str12 = (String) b.A(descriptor2, 1, emptyStringToNullSerializer, (Object) null);
            String o2 = b.o(descriptor2, 2);
            String str13 = (String) b.A(descriptor2, 3, emptyStringToNullSerializer, (Object) null);
            String str14 = (String) b.A(descriptor2, 4, emptyStringToNullSerializer, (Object) null);
            String str15 = (String) b.A(descriptor2, 5, emptyStringToNullSerializer, (Object) null);
            String str16 = (String) b.A(descriptor2, 6, emptyStringToNullSerializer, (Object) null);
            String str17 = (String) b.A(descriptor2, 7, emptyStringToNullSerializer, (Object) null);
            String str18 = (String) b.A(descriptor2, 8, emptyStringToNullSerializer, (Object) null);
            List list2 = (List) b.e(descriptor2, 9, access$get$childSerializers$cp[9], (Object) null);
            String str19 = (String) b.A(descriptor2, 10, emptyStringToNullSerializer, (Object) null);
            map = (Map) b.e(descriptor2, 11, access$get$childSerializers$cp[11], (Object) null);
            str10 = o;
            list = list2;
            str2 = str17;
            str5 = str16;
            str3 = str15;
            str7 = str13;
            str = str18;
            str6 = str14;
            str9 = o2;
            i = 4095;
            str4 = str19;
            str8 = str12;
        } else {
            String str20 = null;
            List list3 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            Map map2 = null;
            String str27 = null;
            boolean z = true;
            String str28 = null;
            int i2 = 0;
            String str29 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                    case 0:
                        i2 |= 1;
                        str20 = b.o(descriptor2, 0);
                    case 1:
                        str11 = str20;
                        str29 = (String) b.A(descriptor2, 1, EmptyStringToNullSerializer.INSTANCE, str29);
                        i2 |= 2;
                        str20 = str11;
                    case 2:
                        str11 = str20;
                        str27 = b.o(descriptor2, 2);
                        i2 |= 4;
                        str20 = str11;
                    case 3:
                        str11 = str20;
                        str28 = (String) b.A(descriptor2, 3, EmptyStringToNullSerializer.INSTANCE, str28);
                        i2 |= 8;
                        str20 = str11;
                    case 4:
                        str11 = str20;
                        str26 = (String) b.A(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, str26);
                        i2 |= 16;
                        str20 = str11;
                    case 5:
                        str11 = str20;
                        str23 = (String) b.A(descriptor2, 5, EmptyStringToNullSerializer.INSTANCE, str23);
                        i2 |= 32;
                        str20 = str11;
                    case 6:
                        str11 = str20;
                        str25 = (String) b.A(descriptor2, 6, EmptyStringToNullSerializer.INSTANCE, str25);
                        i2 |= 64;
                        str20 = str11;
                    case 7:
                        str11 = str20;
                        str22 = (String) b.A(descriptor2, 7, EmptyStringToNullSerializer.INSTANCE, str22);
                        i2 |= 128;
                        str20 = str11;
                    case 8:
                        str11 = str20;
                        str21 = (String) b.A(descriptor2, 8, EmptyStringToNullSerializer.INSTANCE, str21);
                        i2 |= 256;
                        str20 = str11;
                    case 9:
                        str11 = str20;
                        list3 = (List) b.e(descriptor2, 9, access$get$childSerializers$cp[9], list3);
                        i2 |= 512;
                        str20 = str11;
                    case 10:
                        str11 = str20;
                        str24 = (String) b.A(descriptor2, 10, EmptyStringToNullSerializer.INSTANCE, str24);
                        i2 |= 1024;
                        str20 = str11;
                    case 11:
                        map2 = (Map) b.e(descriptor2, 11, access$get$childSerializers$cp[11], map2);
                        i2 |= 2048;
                        str20 = str20;
                    default:
                        throw new m(v);
                }
            }
            list = list3;
            str = str21;
            str2 = str22;
            str3 = str23;
            str4 = str24;
            str5 = str25;
            str6 = str26;
            i = i2;
            map = map2;
            str7 = str28;
            str8 = str29;
            str9 = str27;
            str10 = str20;
        }
        b.c(descriptor2);
        return new PaywallData.LocalizedConfiguration(i, str10, str8, str9, str7, str6, str3, str5, str2, str, list, str4, map, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallData.LocalizedConfiguration localizedConfiguration) {
        t.g(fVar, "encoder");
        t.g(localizedConfiguration, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallData.LocalizedConfiguration.write$Self$purchases_defaultsBc8Release(localizedConfiguration, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
