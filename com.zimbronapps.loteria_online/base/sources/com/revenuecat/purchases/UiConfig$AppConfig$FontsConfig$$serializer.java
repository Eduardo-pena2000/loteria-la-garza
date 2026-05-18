package com.revenuecat.purchases;

import com.revenuecat.purchases.UiConfig;
import kotlin.jvm.internal.t;
import sb.E;
import sb.k0;

@Ca.e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UiConfig$AppConfig$FontsConfig$$serializer implements E {
    public static final UiConfig$AppConfig$FontsConfig$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        UiConfig$AppConfig$FontsConfig$$serializer uiConfig$AppConfig$FontsConfig$$serializer = new UiConfig$AppConfig$FontsConfig$$serializer();
        INSTANCE = uiConfig$AppConfig$FontsConfig$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig", uiConfig$AppConfig$FontsConfig$$serializer, 1);
        k0Var.o("android", false);
        descriptor = k0Var;
    }

    private UiConfig$AppConfig$FontsConfig$$serializer() {
    }

    public ob.b[] childSerializers() {
        return new ob.b[]{UiConfig.AppConfig.FontsConfig.access$get$childSerializers$cp()[0]};
    }

    public UiConfig.AppConfig.FontsConfig deserialize(rb.e eVar) {
        UiConfig.AppConfig.FontsConfig.FontInfo fontInfo;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        rb.c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = UiConfig.AppConfig.FontsConfig.access$get$childSerializers$cp();
        int i = 1;
        if (b.m()) {
            fontInfo = (UiConfig.AppConfig.FontsConfig.FontInfo) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            UiConfig.AppConfig.FontsConfig.FontInfo fontInfo2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new ob.m(v);
                    }
                    fontInfo2 = (UiConfig.AppConfig.FontsConfig.FontInfo) b.e(descriptor2, 0, access$get$childSerializers$cp[0], fontInfo2);
                    i2 = 1;
                }
            }
            fontInfo = fontInfo2;
            i = i2;
        }
        b.c(descriptor2);
        return new UiConfig.AppConfig.FontsConfig(i, fontInfo, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(rb.f fVar, UiConfig.AppConfig.FontsConfig fontsConfig) {
        t.g(fVar, "encoder");
        t.g(fontsConfig, "value");
        qb.e descriptor2 = getDescriptor();
        rb.d b = fVar.b(descriptor2);
        UiConfig.AppConfig.FontsConfig.write$Self$purchases_defaultsBc8Release(fontsConfig, b, descriptor2);
        b.c(descriptor2);
    }

    public ob.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
