package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.common.PromoOfferConfig;
import com.revenuecat.purchases.paywalls.components.common.ResilientPromoOfferConfigSerializer;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
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
public final class PackageComponent$$serializer implements E {
    public static final PackageComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PackageComponent$$serializer packageComponent$$serializer = new PackageComponent$$serializer();
        INSTANCE = packageComponent$$serializer;
        k0 k0Var = new k0("package", packageComponent$$serializer, 4);
        k0Var.o("package_id", false);
        k0Var.o("is_selected_by_default", false);
        k0Var.o("stack", false);
        k0Var.o("play_store_offer", true);
        descriptor = k0Var;
    }

    private PackageComponent$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{x0.a, h.a, StackComponent$$serializer.INSTANCE, a.p(ResilientPromoOfferConfigSerializer.INSTANCE)};
    }

    public PackageComponent deserialize(rb.e eVar) {
        boolean z;
        int i;
        String str;
        StackComponent stackComponent;
        PromoOfferConfig promoOfferConfig;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            boolean q = b.q(descriptor2, 1);
            StackComponent stackComponent2 = (StackComponent) b.e(descriptor2, 2, StackComponent$$serializer.INSTANCE, (Object) null);
            str = o;
            promoOfferConfig = (PromoOfferConfig) b.A(descriptor2, 3, ResilientPromoOfferConfigSerializer.INSTANCE, (Object) null);
            stackComponent = stackComponent2;
            z = q;
            i = 15;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            String str2 = null;
            StackComponent stackComponent3 = null;
            PromoOfferConfig promoOfferConfig2 = null;
            int i2 = 0;
            while (z2) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z2 = false;
                } else if (v == 0) {
                    str2 = b.o(descriptor2, 0);
                    i2 |= 1;
                } else if (v == 1) {
                    z3 = b.q(descriptor2, 1);
                    i2 |= 2;
                } else if (v == 2) {
                    stackComponent3 = (StackComponent) b.e(descriptor2, 2, StackComponent$$serializer.INSTANCE, stackComponent3);
                    i2 |= 4;
                } else {
                    if (v != 3) {
                        throw new m(v);
                    }
                    promoOfferConfig2 = (PromoOfferConfig) b.A(descriptor2, 3, ResilientPromoOfferConfigSerializer.INSTANCE, promoOfferConfig2);
                    i2 |= 8;
                }
            }
            z = z3;
            i = i2;
            str = str2;
            stackComponent = stackComponent3;
            promoOfferConfig = promoOfferConfig2;
        }
        b.c(descriptor2);
        return new PackageComponent(i, str, z, stackComponent, promoOfferConfig, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PackageComponent packageComponent) {
        t.g(fVar, "encoder");
        t.g(packageComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PackageComponent.write$Self$purchases_defaultsBc8Release(packageComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
