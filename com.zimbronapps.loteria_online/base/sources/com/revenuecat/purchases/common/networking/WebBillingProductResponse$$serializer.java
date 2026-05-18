package com.revenuecat.purchases.common.networking;

import Ca.e;
import java.util.Map;
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
public final class WebBillingProductResponse$$serializer implements E {
    public static final WebBillingProductResponse$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        WebBillingProductResponse$$serializer webBillingProductResponse$$serializer = new WebBillingProductResponse$$serializer();
        INSTANCE = webBillingProductResponse$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.common.networking.WebBillingProductResponse", webBillingProductResponse$$serializer, 6);
        k0Var.o("identifier", false);
        k0Var.o("product_type", false);
        k0Var.o("title", false);
        k0Var.o("description", true);
        k0Var.o("default_purchase_option_id", true);
        k0Var.o("purchase_options", false);
        descriptor = k0Var;
    }

    private WebBillingProductResponse$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = WebBillingProductResponse.access$get$childSerializers$cp();
        b bVar = x0.a;
        return new b[]{bVar, bVar, bVar, a.p(bVar), a.p(bVar), access$get$childSerializers$cp[5]};
    }

    public WebBillingProductResponse deserialize(rb.e eVar) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Map map;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = WebBillingProductResponse.access$get$childSerializers$cp();
        String str6 = null;
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            String o2 = b.o(descriptor2, 1);
            String o3 = b.o(descriptor2, 2);
            x0 x0Var = x0.a;
            String str7 = (String) b.A(descriptor2, 3, x0Var, (Object) null);
            String str8 = (String) b.A(descriptor2, 4, x0Var, (Object) null);
            map = (Map) b.e(descriptor2, 5, access$get$childSerializers$cp[5], (Object) null);
            str = o;
            str4 = str7;
            str5 = str8;
            str3 = o3;
            i = 63;
            str2 = o2;
        } else {
            boolean z = true;
            int i2 = 0;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            Map map2 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str6 = b.o(descriptor2, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        str9 = b.o(descriptor2, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        str10 = b.o(descriptor2, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str11 = (String) b.A(descriptor2, 3, x0.a, str11);
                        i2 |= 8;
                        break;
                    case 4:
                        str12 = (String) b.A(descriptor2, 4, x0.a, str12);
                        i2 |= 16;
                        break;
                    case 5:
                        map2 = (Map) b.e(descriptor2, 5, access$get$childSerializers$cp[5], map2);
                        i2 |= 32;
                        break;
                    default:
                        throw new m(v);
                }
            }
            i = i2;
            str = str6;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            str5 = str12;
            map = map2;
        }
        b.c(descriptor2);
        return new WebBillingProductResponse(i, str, str2, str3, str4, str5, map, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, WebBillingProductResponse webBillingProductResponse) {
        t.g(fVar, "encoder");
        t.g(webBillingProductResponse, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        WebBillingProductResponse.write$Self$purchases_defaultsBc8Release(webBillingProductResponse, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
