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
public final class LocaleId$$serializer implements E {
    public static final LocaleId$$serializer INSTANCE;
    private static final /* synthetic */ F descriptor;

    static {
        LocaleId$$serializer localeId$$serializer = new LocaleId$$serializer();
        INSTANCE = localeId$$serializer;
        F f = new F("com.revenuecat.purchases.paywalls.components.common.LocaleId", localeId$$serializer);
        f.o("value", false);
        descriptor = f;
    }

    private LocaleId$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{x0.a};
    }

    public /* bridge */ /* synthetic */ Object deserialize(rb.e eVar) {
        return LocaleId.box-impl(deserialize-8pYHj4M(eVar));
    }

    public String deserialize-8pYHj4M(rb.e eVar) {
        t.g(eVar, "decoder");
        return LocaleId.constructor-impl(eVar.f(getDescriptor()).B());
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public /* bridge */ /* synthetic */ void serialize(f fVar, Object obj) {
        serialize-64pKzr8(fVar, ((LocaleId) obj).unbox-impl());
    }

    public void serialize-64pKzr8(f fVar, String str) {
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
