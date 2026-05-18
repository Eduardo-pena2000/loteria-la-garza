package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import kotlin.jvm.internal.t;
import ob.b;
import rb.f;
import sb.E;
import sb.F;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LocalizationKey$$serializer implements E {
    public static final LocalizationKey$$serializer INSTANCE;
    private static final /* synthetic */ F descriptor;

    static {
        LocalizationKey$$serializer localizationKey$$serializer = new LocalizationKey$$serializer();
        INSTANCE = localizationKey$$serializer;
        F f = new F("com.revenuecat.purchases.paywalls.components.common.LocalizationKey", localizationKey$$serializer);
        f.o("value", false);
        descriptor = f;
    }

    private LocalizationKey$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{x0.a};
    }

    public /* bridge */ /* synthetic */ Object deserialize(rb.e eVar) {
        return LocalizationKey.box-impl(deserialize-4Zn71J0(eVar));
    }

    public String deserialize-4Zn71J0(rb.e eVar) {
        t.g(eVar, "decoder");
        return LocalizationKey.constructor-impl(eVar.f(getDescriptor()).B());
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public /* bridge */ /* synthetic */ void serialize(f fVar, Object obj) {
        serialize-7v81vok(fVar, ((LocalizationKey) obj).unbox-impl());
    }

    public void serialize-7v81vok(f fVar, String str) {
        t.g(fVar, "encoder");
        t.g(str, "value");
        f f = fVar.f(getDescriptor());
        if (f == null) {
            return;
        }
        f.F(str);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
