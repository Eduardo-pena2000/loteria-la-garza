package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseButtonComponent$CustomUrl$$serializer implements E {
    public static final PurchaseButtonComponent$CustomUrl$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PurchaseButtonComponent$CustomUrl$$serializer purchaseButtonComponent$CustomUrl$$serializer = new PurchaseButtonComponent$CustomUrl$$serializer();
        INSTANCE = purchaseButtonComponent$CustomUrl$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl", purchaseButtonComponent$CustomUrl$$serializer, 2);
        k0Var.o("url_lid", false);
        k0Var.o("package_param", true);
        descriptor = k0Var;
    }

    private PurchaseButtonComponent$CustomUrl$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{LocalizationKey$$serializer.INSTANCE, a.p(x0.a)};
    }

    public PurchaseButtonComponent.CustomUrl deserialize(rb.e eVar) {
        String str;
        String str2;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            LocalizationKey localizationKey = (LocalizationKey) b.e(descriptor2, 0, LocalizationKey$$serializer.INSTANCE, (Object) null);
            str = localizationKey != null ? localizationKey.unbox-impl() : null;
            str2 = (String) b.A(descriptor2, 1, x0.a, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            String str3 = null;
            String str4 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    LocalizationKey localizationKey2 = (LocalizationKey) b.e(descriptor2, 0, LocalizationKey$$serializer.INSTANCE, str3 != null ? LocalizationKey.box-impl(str3) : null);
                    str3 = localizationKey2 != null ? localizationKey2.unbox-impl() : null;
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    str4 = (String) b.A(descriptor2, 1, x0.a, str4);
                    i2 |= 2;
                }
            }
            str = str3;
            str2 = str4;
            i = i2;
        }
        b.c(descriptor2);
        return new PurchaseButtonComponent.CustomUrl(i, str, str2, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PurchaseButtonComponent.CustomUrl customUrl) {
        t.g(fVar, "encoder");
        t.g(customUrl, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PurchaseButtonComponent.CustomUrl.write$Self$purchases_defaultsBc8Release(customUrl, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
