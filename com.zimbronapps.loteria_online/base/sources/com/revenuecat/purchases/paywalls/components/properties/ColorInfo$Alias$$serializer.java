package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import com.revenuecat.purchases.ColorAlias;
import com.revenuecat.purchases.ColorAlias$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ColorInfo$Alias$$serializer implements E {
    public static final ColorInfo$Alias$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ColorInfo$Alias$$serializer colorInfo$Alias$$serializer = new ColorInfo$Alias$$serializer();
        INSTANCE = colorInfo$Alias$$serializer;
        k0 k0Var = new k0("alias", colorInfo$Alias$$serializer, 1);
        k0Var.o("value", false);
        descriptor = k0Var;
    }

    private ColorInfo$Alias$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{ColorAlias$$serializer.INSTANCE};
    }

    public ColorInfo.Alias deserialize(rb.e eVar) {
        String str;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i = 1;
        if (b.m()) {
            ColorAlias colorAlias = (ColorAlias) b.e(descriptor2, 0, ColorAlias$$serializer.INSTANCE, (Object) null);
            str = colorAlias != null ? colorAlias.unbox-impl() : null;
        } else {
            boolean z = true;
            int i2 = 0;
            str = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    ColorAlias colorAlias2 = (ColorAlias) b.e(descriptor2, 0, ColorAlias$$serializer.INSTANCE, str != null ? ColorAlias.box-impl(str) : null);
                    str = colorAlias2 != null ? colorAlias2.unbox-impl() : null;
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new ColorInfo.Alias(i, str, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ColorInfo.Alias alias) {
        t.g(fVar, "encoder");
        t.g(alias, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ColorInfo.Alias.write$Self$purchases_defaultsBc8Release(alias, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
