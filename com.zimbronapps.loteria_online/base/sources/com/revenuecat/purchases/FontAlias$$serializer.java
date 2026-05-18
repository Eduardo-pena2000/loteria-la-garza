package com.revenuecat.purchases;

import kotlin.jvm.internal.t;
import sb.E;
import sb.F;
import sb.x0;

@Ca.e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FontAlias$$serializer implements E {
    public static final FontAlias$$serializer INSTANCE;
    private static final /* synthetic */ F descriptor;

    static {
        FontAlias$$serializer fontAlias$$serializer = new FontAlias$$serializer();
        INSTANCE = fontAlias$$serializer;
        F f = new F("com.revenuecat.purchases.FontAlias", fontAlias$$serializer);
        f.o("value", false);
        descriptor = f;
    }

    private FontAlias$$serializer() {
    }

    public ob.b[] childSerializers() {
        return new ob.b[]{x0.a};
    }

    public /* bridge */ /* synthetic */ Object deserialize(rb.e eVar) {
        return FontAlias.box-impl(deserialize-zxJdh0Q(eVar));
    }

    public String deserialize-zxJdh0Q(rb.e eVar) {
        t.g(eVar, "decoder");
        return FontAlias.constructor-impl(eVar.f(getDescriptor()).B());
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public /* bridge */ /* synthetic */ void serialize(rb.f fVar, Object obj) {
        serialize-pDyximM(fVar, ((FontAlias) obj).unbox-impl());
    }

    public void serialize-pDyximM(rb.f fVar, String str) {
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
