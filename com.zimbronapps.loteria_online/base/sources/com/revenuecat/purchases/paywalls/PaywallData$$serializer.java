package com.revenuecat.purchases.paywalls;

import Ca.e;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
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
import sb.J;
import sb.k0;
import sb.t0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallData$$serializer implements E {
    public static final PaywallData$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallData$$serializer paywallData$$serializer = new PaywallData$$serializer();
        INSTANCE = paywallData$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.PaywallData", paywallData$$serializer, 9);
        k0Var.o("id", true);
        k0Var.o("template_name", false);
        k0Var.o("config", false);
        k0Var.o("asset_base_url", false);
        k0Var.o("revision", true);
        k0Var.o("localized_strings", false);
        k0Var.o("localized_strings_by_tier", true);
        k0Var.o("zero_decimal_place_countries", true);
        k0Var.o("default_locale", true);
        descriptor = k0Var;
    }

    private PaywallData$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = PaywallData.access$get$childSerializers$cp();
        b bVar = x0.a;
        return new b[]{pb.a.p(bVar), bVar, PaywallData$Configuration$$serializer.INSTANCE, URLSerializer.INSTANCE, J.a, access$get$childSerializers$cp[5], access$get$childSerializers$cp[6], GoogleListSerializer.INSTANCE, pb.a.p(bVar)};
    }

    public PaywallData deserialize(rb.e eVar) {
        int i;
        Map map;
        List list;
        Map map2;
        String str;
        URL url;
        PaywallData.Configuration configuration;
        int i2;
        String str2;
        String str3;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = PaywallData.access$get$childSerializers$cp();
        int i3 = 7;
        int i4 = 8;
        if (b.m()) {
            x0 x0Var = x0.a;
            String str4 = (String) b.A(descriptor2, 0, x0Var, (Object) null);
            String o = b.o(descriptor2, 1);
            PaywallData.Configuration configuration2 = (PaywallData.Configuration) b.e(descriptor2, 2, PaywallData$Configuration$$serializer.INSTANCE, (Object) null);
            URL url2 = (URL) b.e(descriptor2, 3, URLSerializer.INSTANCE, (Object) null);
            int h = b.h(descriptor2, 4);
            Map map3 = (Map) b.e(descriptor2, 5, access$get$childSerializers$cp[5], (Object) null);
            Map map4 = (Map) b.e(descriptor2, 6, access$get$childSerializers$cp[6], (Object) null);
            List list2 = (List) b.e(descriptor2, 7, GoogleListSerializer.INSTANCE, (Object) null);
            map = map4;
            str = (String) b.A(descriptor2, 8, x0Var, (Object) null);
            list = list2;
            url = url2;
            i = 511;
            i2 = h;
            configuration = configuration2;
            map2 = map3;
            str3 = o;
            str2 = str4;
        } else {
            boolean z = true;
            int i5 = 0;
            Map map5 = null;
            List list3 = null;
            Map map6 = null;
            String str5 = null;
            URL url3 = null;
            String str6 = null;
            String str7 = null;
            PaywallData.Configuration configuration3 = null;
            int i6 = 0;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        i4 = 8;
                    case 0:
                        str6 = (String) b.A(descriptor2, 0, x0.a, str6);
                        i5 |= 1;
                        i3 = 7;
                        i4 = 8;
                    case 1:
                        str7 = b.o(descriptor2, 1);
                        i5 |= 2;
                        i3 = 7;
                        i4 = 8;
                    case 2:
                        configuration3 = (PaywallData.Configuration) b.e(descriptor2, 2, PaywallData$Configuration$$serializer.INSTANCE, configuration3);
                        i5 |= 4;
                        i3 = 7;
                        i4 = 8;
                    case 3:
                        url3 = (URL) b.e(descriptor2, 3, URLSerializer.INSTANCE, url3);
                        i5 |= 8;
                        i3 = 7;
                        i4 = 8;
                    case 4:
                        i6 = b.h(descriptor2, 4);
                        i5 |= 16;
                        i3 = 7;
                        i4 = 8;
                    case 5:
                        map6 = (Map) b.e(descriptor2, 5, access$get$childSerializers$cp[5], map6);
                        i5 |= 32;
                        i3 = 7;
                        i4 = 8;
                    case 6:
                        map5 = (Map) b.e(descriptor2, 6, access$get$childSerializers$cp[6], map5);
                        i5 |= 64;
                        i3 = 7;
                    case 7:
                        list3 = (List) b.e(descriptor2, i3, GoogleListSerializer.INSTANCE, list3);
                        i5 |= 128;
                    case 8:
                        str5 = (String) b.A(descriptor2, i4, x0.a, str5);
                        i5 |= 256;
                    default:
                        throw new m(v);
                }
            }
            i = i5;
            map = map5;
            list = list3;
            map2 = map6;
            str = str5;
            url = url3;
            configuration = configuration3;
            i2 = i6;
            str2 = str6;
            str3 = str7;
        }
        b.c(descriptor2);
        return new PaywallData(i, str2, str3, configuration, url, i2, map2, map, list, str, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallData paywallData) {
        t.g(fVar, "encoder");
        t.g(paywallData, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallData.write$Self$purchases_defaultsBc8Release(paywallData, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
