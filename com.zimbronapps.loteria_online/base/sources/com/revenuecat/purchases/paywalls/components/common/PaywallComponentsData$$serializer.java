package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.J;
import sb.k0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallComponentsData$$serializer implements E {
    public static final PaywallComponentsData$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallComponentsData$$serializer paywallComponentsData$$serializer = new PaywallComponentsData$$serializer();
        INSTANCE = paywallComponentsData$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData", paywallComponentsData$$serializer, 10);
        k0Var.o("id", true);
        k0Var.o("template_name", false);
        k0Var.o("asset_base_url", false);
        k0Var.o("components_config", false);
        k0Var.o("components_localizations", false);
        k0Var.o("default_locale", false);
        k0Var.o("revision", true);
        k0Var.o("zero_decimal_place_countries", true);
        k0Var.o("exit_offers", true);
        k0Var.o("play_store_product_change_mode", true);
        descriptor = k0Var;
    }

    private PaywallComponentsData$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = PaywallComponentsData.access$get$childSerializers$cp();
        b bVar = x0.a;
        return new b[]{a.p(bVar), bVar, URLSerializer.INSTANCE, ComponentsConfig$$serializer.INSTANCE, access$get$childSerializers$cp[4], LocaleId$$serializer.INSTANCE, J.a, GoogleListSerializer.INSTANCE, a.p(ExitOffers$$serializer.INSTANCE), a.p(ProductChangeConfigSerializer.INSTANCE)};
    }

    public PaywallComponentsData deserialize(rb.e eVar) {
        Map map;
        URL url;
        int i;
        ExitOffers exitOffers;
        ComponentsConfig componentsConfig;
        List list;
        ProductChangeConfig productChangeConfig;
        String str;
        int i2;
        String str2;
        String str3;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = PaywallComponentsData.access$get$childSerializers$cp();
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        ProductChangeConfig productChangeConfig2 = null;
        if (b.m()) {
            String str4 = (String) b.A(descriptor2, 0, x0.a, (Object) null);
            String o = b.o(descriptor2, 1);
            URL url2 = (URL) b.e(descriptor2, 2, URLSerializer.INSTANCE, (Object) null);
            ComponentsConfig componentsConfig2 = (ComponentsConfig) b.e(descriptor2, 3, ComponentsConfig$$serializer.INSTANCE, (Object) null);
            Map map2 = (Map) b.e(descriptor2, 4, access$get$childSerializers$cp[4], (Object) null);
            LocaleId localeId = (LocaleId) b.e(descriptor2, 5, LocaleId$$serializer.INSTANCE, (Object) null);
            String str5 = localeId != null ? localeId.unbox-impl() : null;
            int h = b.h(descriptor2, 6);
            List list2 = (List) b.e(descriptor2, 7, GoogleListSerializer.INSTANCE, (Object) null);
            ExitOffers exitOffers2 = (ExitOffers) b.A(descriptor2, 8, ExitOffers$$serializer.INSTANCE, (Object) null);
            map = map2;
            str = str4;
            productChangeConfig = (ProductChangeConfig) b.A(descriptor2, 9, ProductChangeConfigSerializer.INSTANCE, (Object) null);
            list = list2;
            i2 = h;
            str2 = str5;
            componentsConfig = componentsConfig2;
            exitOffers = exitOffers2;
            url = url2;
            i = 1023;
            str3 = o;
        } else {
            boolean z = true;
            int i6 = 0;
            int i7 = 0;
            Map map3 = null;
            ExitOffers exitOffers3 = null;
            ComponentsConfig componentsConfig3 = null;
            List list3 = null;
            String str6 = null;
            String str7 = null;
            URL url3 = null;
            String str8 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        i3 = 9;
                        i5 = 6;
                    case 0:
                        str6 = (String) b.A(descriptor2, 0, x0.a, str6);
                        i6 |= 1;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                    case 1:
                        str8 = b.o(descriptor2, 1);
                        i6 |= 2;
                        i3 = 9;
                        i4 = 7;
                    case 2:
                        url3 = (URL) b.e(descriptor2, 2, URLSerializer.INSTANCE, url3);
                        i6 |= 4;
                        i3 = 9;
                        i4 = 7;
                    case 3:
                        componentsConfig3 = (ComponentsConfig) b.e(descriptor2, 3, ComponentsConfig$$serializer.INSTANCE, componentsConfig3);
                        i6 |= 8;
                        i3 = 9;
                    case 4:
                        map3 = (Map) b.e(descriptor2, 4, access$get$childSerializers$cp[4], map3);
                        i6 |= 16;
                        i3 = 9;
                    case 5:
                        LocaleId localeId2 = (LocaleId) b.e(descriptor2, 5, LocaleId$$serializer.INSTANCE, str7 != null ? LocaleId.box-impl(str7) : null);
                        str7 = localeId2 != null ? localeId2.unbox-impl() : null;
                        i6 |= 32;
                        i3 = 9;
                    case 6:
                        i7 = b.h(descriptor2, i5);
                        i6 |= 64;
                    case 7:
                        list3 = (List) b.e(descriptor2, i4, GoogleListSerializer.INSTANCE, list3);
                        i6 |= 128;
                    case 8:
                        exitOffers3 = (ExitOffers) b.A(descriptor2, 8, ExitOffers$$serializer.INSTANCE, exitOffers3);
                        i6 |= 256;
                    case 9:
                        productChangeConfig2 = (ProductChangeConfig) b.A(descriptor2, i3, ProductChangeConfigSerializer.INSTANCE, productChangeConfig2);
                        i6 |= 512;
                    default:
                        throw new m(v);
                }
            }
            map = map3;
            url = url3;
            i = i6;
            exitOffers = exitOffers3;
            componentsConfig = componentsConfig3;
            list = list3;
            productChangeConfig = productChangeConfig2;
            str = str6;
            i2 = i7;
            str2 = str7;
            str3 = str8;
        }
        b.c(descriptor2);
        return new PaywallComponentsData(i, str, str3, url, componentsConfig, map, str2, i2, list, exitOffers, productChangeConfig, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallComponentsData paywallComponentsData) {
        t.g(fVar, "encoder");
        t.g(paywallComponentsData, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallComponentsData.write$Self$purchases_defaultsBc8Release(paywallComponentsData, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
