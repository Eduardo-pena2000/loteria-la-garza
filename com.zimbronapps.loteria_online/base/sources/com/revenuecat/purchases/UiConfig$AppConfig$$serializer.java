package com.revenuecat.purchases;

import com.revenuecat.purchases.UiConfig;
import java.util.Map;
import kotlin.jvm.internal.t;
import sb.E;
import sb.k0;
import sb.t0;

@Ca.e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UiConfig$AppConfig$$serializer implements E {
    public static final UiConfig$AppConfig$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        UiConfig$AppConfig$$serializer uiConfig$AppConfig$$serializer = new UiConfig$AppConfig$$serializer();
        INSTANCE = uiConfig$AppConfig$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.UiConfig.AppConfig", uiConfig$AppConfig$$serializer, 2);
        k0Var.o("colors", true);
        k0Var.o("fonts", true);
        descriptor = k0Var;
    }

    private UiConfig$AppConfig$$serializer() {
    }

    public ob.b[] childSerializers() {
        ob.b[] access$get$childSerializers$cp = UiConfig.AppConfig.access$get$childSerializers$cp();
        return new ob.b[]{access$get$childSerializers$cp[0], access$get$childSerializers$cp[1]};
    }

    public UiConfig.AppConfig deserialize(rb.e eVar) {
        Map map;
        Map map2;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        rb.c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = UiConfig.AppConfig.access$get$childSerializers$cp();
        if (b.m()) {
            map2 = (Map) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
            map = (Map) b.e(descriptor2, 1, access$get$childSerializers$cp[1], (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Map map3 = null;
            Map map4 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    map4 = (Map) b.e(descriptor2, 0, access$get$childSerializers$cp[0], map4);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new ob.m(v);
                    }
                    map3 = (Map) b.e(descriptor2, 1, access$get$childSerializers$cp[1], map3);
                    i2 |= 2;
                }
            }
            map = map3;
            map2 = map4;
            i = i2;
        }
        b.c(descriptor2);
        return new UiConfig.AppConfig(i, map2, map, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(rb.f fVar, UiConfig.AppConfig appConfig) {
        t.g(fVar, "encoder");
        t.g(appConfig, "value");
        qb.e descriptor2 = getDescriptor();
        rb.d b = fVar.b(descriptor2);
        UiConfig.AppConfig.write$Self$purchases_defaultsBc8Release(appConfig, b, descriptor2);
        b.c(descriptor2);
    }

    public ob.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
