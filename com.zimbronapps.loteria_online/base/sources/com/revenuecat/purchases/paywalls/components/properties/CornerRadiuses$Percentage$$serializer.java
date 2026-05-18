package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.J;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CornerRadiuses$Percentage$$serializer implements E {
    public static final CornerRadiuses$Percentage$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CornerRadiuses$Percentage$$serializer cornerRadiuses$Percentage$$serializer = new CornerRadiuses$Percentage$$serializer();
        INSTANCE = cornerRadiuses$Percentage$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Percentage", cornerRadiuses$Percentage$$serializer, 4);
        k0Var.o("top_leading", false);
        k0Var.o("top_trailing", false);
        k0Var.o("bottom_leading", false);
        k0Var.o("bottom_trailing", false);
        descriptor = k0Var;
    }

    private CornerRadiuses$Percentage$$serializer() {
    }

    public b[] childSerializers() {
        J j = J.a;
        return new b[]{j, j, j, j};
    }

    public CornerRadiuses.Percentage deserialize(rb.e eVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            int h = b.h(descriptor2, 0);
            int h2 = b.h(descriptor2, 1);
            int h3 = b.h(descriptor2, 2);
            i = h;
            i2 = b.h(descriptor2, 3);
            i3 = h3;
            i4 = h2;
            i5 = 15;
        } else {
            boolean z = true;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    i6 = b.h(descriptor2, 0);
                    i10 |= 1;
                } else if (v == 1) {
                    i9 = b.h(descriptor2, 1);
                    i10 |= 2;
                } else if (v == 2) {
                    i8 = b.h(descriptor2, 2);
                    i10 |= 4;
                } else {
                    if (v != 3) {
                        throw new m(v);
                    }
                    i7 = b.h(descriptor2, 3);
                    i10 |= 8;
                }
            }
            i = i6;
            i2 = i7;
            i3 = i8;
            i4 = i9;
            i5 = i10;
        }
        b.c(descriptor2);
        return new CornerRadiuses.Percentage(i5, i, i4, i3, i2, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CornerRadiuses.Percentage percentage) {
        t.g(fVar, "encoder");
        t.g(percentage, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CornerRadiuses.Percentage.write$Self$purchases_defaultsBc8Release(percentage, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
