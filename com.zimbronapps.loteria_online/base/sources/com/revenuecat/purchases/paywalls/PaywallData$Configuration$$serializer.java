package com.revenuecat.purchases.paywalls;

import Ca.e;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
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
public final class PaywallData$Configuration$$serializer implements E {
    public static final PaywallData$Configuration$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallData$Configuration$$serializer paywallData$Configuration$$serializer = new PaywallData$Configuration$$serializer();
        INSTANCE = paywallData$Configuration$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.PaywallData.Configuration", paywallData$Configuration$$serializer, 13);
        k0Var.o("packages", true);
        k0Var.o("default_package", true);
        k0Var.o("images_webp", true);
        k0Var.o("images", true);
        k0Var.o("images_by_tier", true);
        k0Var.o("blurred_background_image", true);
        k0Var.o("display_restore_purchases", true);
        k0Var.o("tos_url", true);
        k0Var.o("privacy_url", true);
        k0Var.o("colors", false);
        k0Var.o("colors_by_tier", true);
        k0Var.o("tiers", true);
        k0Var.o("default_tier", true);
        descriptor = k0Var;
    }

    private PaywallData$Configuration$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = PaywallData.Configuration.access$get$childSerializers$cp();
        b bVar = access$get$childSerializers$cp[0];
        x0 x0Var = x0.a;
        b p = pb.a.p(x0Var);
        PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = PaywallData$Configuration$Images$$serializer.INSTANCE;
        b p2 = pb.a.p(paywallData$Configuration$Images$$serializer);
        b p3 = pb.a.p(paywallData$Configuration$Images$$serializer);
        b p4 = pb.a.p(access$get$childSerializers$cp[4]);
        OptionalURLSerializer optionalURLSerializer = OptionalURLSerializer.INSTANCE;
        b p5 = pb.a.p(optionalURLSerializer);
        b p6 = pb.a.p(optionalURLSerializer);
        b p7 = pb.a.p(access$get$childSerializers$cp[10]);
        b p8 = pb.a.p(access$get$childSerializers$cp[11]);
        b p9 = pb.a.p(x0Var);
        h hVar = h.a;
        return new b[]{bVar, p, p2, p3, p4, hVar, hVar, p5, p6, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, p7, p8, p9};
    }

    public PaywallData.Configuration deserialize(rb.e eVar) {
        List list;
        String str;
        String str2;
        Map map;
        PaywallData.Configuration.ColorInformation colorInformation;
        URL url;
        Map map2;
        List list2;
        PaywallData.Configuration.Images images;
        int i;
        URL url2;
        PaywallData.Configuration.Images images2;
        boolean z;
        boolean z2;
        ob.a[] aVarArr;
        boolean z3;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = PaywallData.Configuration.access$get$childSerializers$cp();
        if (b.m()) {
            List list3 = (List) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
            x0 x0Var = x0.a;
            String str3 = (String) b.A(descriptor2, 1, x0Var, (Object) null);
            PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = PaywallData$Configuration$Images$$serializer.INSTANCE;
            PaywallData.Configuration.Images images3 = (PaywallData.Configuration.Images) b.A(descriptor2, 2, paywallData$Configuration$Images$$serializer, (Object) null);
            PaywallData.Configuration.Images images4 = (PaywallData.Configuration.Images) b.A(descriptor2, 3, paywallData$Configuration$Images$$serializer, (Object) null);
            Map map3 = (Map) b.A(descriptor2, 4, access$get$childSerializers$cp[4], (Object) null);
            boolean q = b.q(descriptor2, 5);
            boolean q2 = b.q(descriptor2, 6);
            OptionalURLSerializer optionalURLSerializer = OptionalURLSerializer.INSTANCE;
            URL url3 = (URL) b.A(descriptor2, 7, optionalURLSerializer, (Object) null);
            URL url4 = (URL) b.A(descriptor2, 8, optionalURLSerializer, (Object) null);
            PaywallData.Configuration.ColorInformation colorInformation2 = (PaywallData.Configuration.ColorInformation) b.e(descriptor2, 9, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, (Object) null);
            Map map4 = (Map) b.A(descriptor2, 10, access$get$childSerializers$cp[10], (Object) null);
            list2 = (List) b.A(descriptor2, 11, access$get$childSerializers$cp[11], (Object) null);
            map = map4;
            str2 = (String) b.A(descriptor2, 12, x0Var, (Object) null);
            colorInformation = colorInformation2;
            url2 = url3;
            z = q2;
            z2 = q;
            images = images4;
            url = url4;
            images2 = images3;
            i = 8191;
            map2 = map3;
            str = str3;
            list = list3;
        } else {
            boolean z4 = false;
            int i2 = 0;
            String str4 = null;
            Map map5 = null;
            PaywallData.Configuration.ColorInformation colorInformation3 = null;
            URL url5 = null;
            Map map6 = null;
            List list4 = null;
            PaywallData.Configuration.Images images5 = null;
            URL url6 = null;
            List list5 = null;
            boolean z5 = true;
            String str5 = null;
            PaywallData.Configuration.Images images6 = null;
            boolean z6 = false;
            while (true) {
                boolean z7 = z4;
                if (z5) {
                    int v = b.v(descriptor2);
                    switch (v) {
                        case -1:
                            aVarArr = access$get$childSerializers$cp;
                            z3 = z6;
                            z5 = false;
                            access$get$childSerializers$cp = aVarArr;
                            z4 = z7;
                            z6 = z3;
                        case 0:
                            z3 = z6;
                            aVarArr = access$get$childSerializers$cp;
                            list5 = (List) b.e(descriptor2, 0, access$get$childSerializers$cp[0], list5);
                            i2 |= 1;
                            access$get$childSerializers$cp = aVarArr;
                            z4 = z7;
                            z6 = z3;
                        case 1:
                            z3 = z6;
                            str5 = (String) b.A(descriptor2, 1, x0.a, str5);
                            i2 |= 2;
                            z4 = z7;
                            z6 = z3;
                        case 2:
                            z3 = z6;
                            images6 = (PaywallData.Configuration.Images) b.A(descriptor2, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, images6);
                            i2 |= 4;
                            z4 = z7;
                            z6 = z3;
                        case 3:
                            z3 = z6;
                            images5 = (PaywallData.Configuration.Images) b.A(descriptor2, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, images5);
                            i2 |= 8;
                            z4 = z7;
                            z6 = z3;
                        case 4:
                            z3 = z6;
                            map6 = (Map) b.A(descriptor2, 4, access$get$childSerializers$cp[4], map6);
                            i2 |= 16;
                            z4 = z7;
                            z6 = z3;
                        case 5:
                            i2 |= 32;
                            z6 = b.q(descriptor2, 5);
                            z4 = z7;
                        case 6:
                            z3 = z6;
                            i2 |= 64;
                            z4 = b.q(descriptor2, 6);
                            z6 = z3;
                        case 7:
                            z3 = z6;
                            url6 = (URL) b.A(descriptor2, 7, OptionalURLSerializer.INSTANCE, url6);
                            i2 |= 128;
                            z4 = z7;
                            z6 = z3;
                        case 8:
                            z3 = z6;
                            url5 = (URL) b.A(descriptor2, 8, OptionalURLSerializer.INSTANCE, url5);
                            i2 |= 256;
                            z4 = z7;
                            z6 = z3;
                        case 9:
                            z3 = z6;
                            colorInformation3 = (PaywallData.Configuration.ColorInformation) b.e(descriptor2, 9, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, colorInformation3);
                            i2 |= 512;
                            z4 = z7;
                            z6 = z3;
                        case 10:
                            z3 = z6;
                            map5 = (Map) b.A(descriptor2, 10, access$get$childSerializers$cp[10], map5);
                            i2 |= 1024;
                            z4 = z7;
                            z6 = z3;
                        case 11:
                            z3 = z6;
                            list4 = (List) b.A(descriptor2, 11, access$get$childSerializers$cp[11], list4);
                            i2 |= 2048;
                            z4 = z7;
                            z6 = z3;
                        case 12:
                            z3 = z6;
                            str4 = (String) b.A(descriptor2, 12, x0.a, str4);
                            i2 |= 4096;
                            z4 = z7;
                            z6 = z3;
                        default:
                            throw new m(v);
                    }
                } else {
                    list = list5;
                    str = str5;
                    str2 = str4;
                    map = map5;
                    colorInformation = colorInformation3;
                    url = url5;
                    map2 = map6;
                    list2 = list4;
                    images = images5;
                    i = i2;
                    url2 = url6;
                    images2 = images6;
                    z = z7;
                    z2 = z6;
                }
            }
        }
        b.c(descriptor2);
        return new PaywallData.Configuration(i, list, str, images2, images, map2, z2, z, url2, url, colorInformation, map, list2, str2, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallData.Configuration configuration) {
        t.g(fVar, "encoder");
        t.g(configuration, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallData.Configuration.write$Self$purchases_defaultsBc8Release(configuration, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
