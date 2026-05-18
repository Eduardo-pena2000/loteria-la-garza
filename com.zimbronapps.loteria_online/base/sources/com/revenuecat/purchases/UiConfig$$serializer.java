package com.revenuecat.purchases;

import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.components.common.LocalizedVariableLocalizationKeyMapSerializer;
import java.util.Map;
import kotlin.jvm.internal.t;
import sb.E;
import sb.k0;
import sb.t0;

@Ca.e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UiConfig$$serializer implements E {
    public static final UiConfig$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        UiConfig$$serializer uiConfig$$serializer = new UiConfig$$serializer();
        INSTANCE = uiConfig$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.UiConfig", uiConfig$$serializer, 4);
        k0Var.o("app", true);
        k0Var.o("localizations", true);
        k0Var.o("variable_config", true);
        k0Var.o("custom_variables", true);
        descriptor = k0Var;
    }

    private UiConfig$$serializer() {
    }

    public ob.b[] childSerializers() {
        return new ob.b[]{UiConfig$AppConfig$$serializer.INSTANCE, LocalizedVariableLocalizationKeyMapSerializer.INSTANCE, UiConfig$VariableConfig$$serializer.INSTANCE, UiConfig.access$get$childSerializers$cp()[3]};
    }

    public UiConfig deserialize(rb.e eVar) {
        int i;
        UiConfig.AppConfig appConfig;
        Map map;
        UiConfig.VariableConfig variableConfig;
        Map map2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        rb.c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = UiConfig.access$get$childSerializers$cp();
        UiConfig.AppConfig appConfig2 = null;
        if (b.m()) {
            UiConfig.AppConfig appConfig3 = (UiConfig.AppConfig) b.e(descriptor2, 0, UiConfig$AppConfig$$serializer.INSTANCE, (Object) null);
            Map map3 = (Map) b.e(descriptor2, 1, LocalizedVariableLocalizationKeyMapSerializer.INSTANCE, (Object) null);
            UiConfig.VariableConfig variableConfig2 = (UiConfig.VariableConfig) b.e(descriptor2, 2, UiConfig$VariableConfig$$serializer.INSTANCE, (Object) null);
            map2 = (Map) b.e(descriptor2, 3, access$get$childSerializers$cp[3], (Object) null);
            appConfig = appConfig3;
            variableConfig = variableConfig2;
            i = 15;
            map = map3;
        } else {
            boolean z = true;
            int i2 = 0;
            Map map4 = null;
            UiConfig.VariableConfig variableConfig3 = null;
            Map map5 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    appConfig2 = (UiConfig.AppConfig) b.e(descriptor2, 0, UiConfig$AppConfig$$serializer.INSTANCE, appConfig2);
                    i2 |= 1;
                } else if (v == 1) {
                    map4 = (Map) b.e(descriptor2, 1, LocalizedVariableLocalizationKeyMapSerializer.INSTANCE, map4);
                    i2 |= 2;
                } else if (v == 2) {
                    variableConfig3 = (UiConfig.VariableConfig) b.e(descriptor2, 2, UiConfig$VariableConfig$$serializer.INSTANCE, variableConfig3);
                    i2 |= 4;
                } else {
                    if (v != 3) {
                        throw new ob.m(v);
                    }
                    map5 = (Map) b.e(descriptor2, 3, access$get$childSerializers$cp[3], map5);
                    i2 |= 8;
                }
            }
            i = i2;
            appConfig = appConfig2;
            map = map4;
            variableConfig = variableConfig3;
            map2 = map5;
        }
        b.c(descriptor2);
        return new UiConfig(i, appConfig, map, variableConfig, map2, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(rb.f fVar, UiConfig uiConfig) {
        t.g(fVar, "encoder");
        t.g(uiConfig, "value");
        qb.e descriptor2 = getDescriptor();
        rb.d b = fVar.b(descriptor2);
        UiConfig.write$Self$purchases_defaultsBc8Release(uiConfig, b, descriptor2);
        b.c(descriptor2);
    }

    public ob.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
