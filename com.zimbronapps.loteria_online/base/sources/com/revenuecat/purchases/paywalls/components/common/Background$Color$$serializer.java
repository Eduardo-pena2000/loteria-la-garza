package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
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
public final class Background$Color$$serializer implements E {
    public static final Background$Color$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        Background$Color$$serializer background$Color$$serializer = new Background$Color$$serializer();
        INSTANCE = background$Color$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.common.Background.Color", background$Color$$serializer, 1);
        k0Var.o("value", false);
        descriptor = k0Var;
    }

    private Background$Color$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{ColorScheme$$serializer.INSTANCE};
    }

    public Background.Color deserialize(rb.e eVar) {
        ColorScheme colorScheme;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i = 1;
        if (b.m()) {
            colorScheme = (ColorScheme) b.e(descriptor2, 0, ColorScheme$$serializer.INSTANCE, (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            colorScheme = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    colorScheme = (ColorScheme) b.e(descriptor2, 0, ColorScheme$$serializer.INSTANCE, colorScheme);
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new Background.Color(i, colorScheme, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, Background.Color color) {
        t.g(fVar, "encoder");
        t.g(color, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        Background.Color.write$Self$purchases_defaultsBc8Release(color, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
