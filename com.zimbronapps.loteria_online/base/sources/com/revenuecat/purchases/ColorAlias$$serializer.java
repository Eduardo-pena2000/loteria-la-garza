package com.revenuecat.purchases;

import kotlin.jvm.internal.t;
import sb.E;
import sb.F;
import sb.x0;

@Ca.e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ColorAlias$$serializer implements E {
    public static final ColorAlias$$serializer INSTANCE;
    private static final /* synthetic */ F descriptor;

    static {
        ColorAlias$$serializer colorAlias$$serializer = new ColorAlias$$serializer();
        INSTANCE = colorAlias$$serializer;
        F f = new F("com.revenuecat.purchases.ColorAlias", colorAlias$$serializer);
        f.o("value", false);
        descriptor = f;
    }

    private ColorAlias$$serializer() {
    }

    public ob.b[] childSerializers() {
        return new ob.b[]{x0.a};
    }

    public /* bridge */ /* synthetic */ Object deserialize(rb.e eVar) {
        return ColorAlias.box-impl(deserialize-QzpnlxU(eVar));
    }

    public String deserialize-QzpnlxU(rb.e eVar) {
        t.g(eVar, "decoder");
        return ColorAlias.constructor-impl(eVar.f(getDescriptor()).B());
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public /* bridge */ /* synthetic */ void serialize(rb.f fVar, Object obj) {
        serialize-vLxeDZI(fVar, ((ColorAlias) obj).unbox-impl());
    }

    public void serialize-vLxeDZI(rb.f fVar, String str) {
        t.g(fVar, "encoder");
        t.g(str, "value");
        rb.f f = fVar.f(getDescriptor());
        if (f == null) {
            return;
        }
        f.F(str);
    }

    public ob.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
