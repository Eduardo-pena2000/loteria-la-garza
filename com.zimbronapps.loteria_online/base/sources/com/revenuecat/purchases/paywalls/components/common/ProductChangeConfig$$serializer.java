package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.paywalls.components.common.serializers.DowngradeReplacementModeDeserializer;
import com.revenuecat.purchases.paywalls.components.common.serializers.UpgradeReplacementModeDeserializer;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ProductChangeConfig$$serializer implements E {
    public static final ProductChangeConfig$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ProductChangeConfig$$serializer productChangeConfig$$serializer = new ProductChangeConfig$$serializer();
        INSTANCE = productChangeConfig$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig", productChangeConfig$$serializer, 2);
        k0Var.o("upgrade_replacement_mode", true);
        k0Var.o("downgrade_replacement_mode", true);
        descriptor = k0Var;
    }

    private ProductChangeConfig$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{UpgradeReplacementModeDeserializer.INSTANCE, DowngradeReplacementModeDeserializer.INSTANCE};
    }

    public ProductChangeConfig deserialize(rb.e eVar) {
        GoogleReplacementMode googleReplacementMode;
        GoogleReplacementMode googleReplacementMode2;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            googleReplacementMode = (GoogleReplacementMode) b.e(descriptor2, 0, UpgradeReplacementModeDeserializer.INSTANCE, (Object) null);
            googleReplacementMode2 = (GoogleReplacementMode) b.e(descriptor2, 1, DowngradeReplacementModeDeserializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            googleReplacementMode = null;
            GoogleReplacementMode googleReplacementMode3 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    googleReplacementMode = (GoogleReplacementMode) b.e(descriptor2, 0, UpgradeReplacementModeDeserializer.INSTANCE, googleReplacementMode);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    googleReplacementMode3 = (GoogleReplacementMode) b.e(descriptor2, 1, DowngradeReplacementModeDeserializer.INSTANCE, googleReplacementMode3);
                    i2 |= 2;
                }
            }
            googleReplacementMode2 = googleReplacementMode3;
            i = i2;
        }
        b.c(descriptor2);
        return new ProductChangeConfig(i, googleReplacementMode, googleReplacementMode2, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ProductChangeConfig productChangeConfig) {
        t.g(fVar, "encoder");
        t.g(productChangeConfig, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ProductChangeConfig.write$Self$purchases_defaultsBc8Release(productChangeConfig, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
