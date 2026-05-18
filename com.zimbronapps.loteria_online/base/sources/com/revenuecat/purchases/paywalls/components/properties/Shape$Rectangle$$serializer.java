package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Shape$Rectangle$$serializer implements E {
    public static final Shape$Rectangle$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        Shape$Rectangle$$serializer shape$Rectangle$$serializer = new Shape$Rectangle$$serializer();
        INSTANCE = shape$Rectangle$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.properties.Shape.Rectangle", shape$Rectangle$$serializer, 1);
        k0Var.o("corners", true);
        descriptor = k0Var;
    }

    private Shape$Rectangle$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{a.p(CornerRadiusesSerializer.INSTANCE)};
    }

    public Shape.Rectangle deserialize(rb.e eVar) {
        CornerRadiuses cornerRadiuses;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i = 1;
        if (b.m()) {
            cornerRadiuses = (CornerRadiuses) b.A(descriptor2, 0, CornerRadiusesSerializer.INSTANCE, (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            cornerRadiuses = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    cornerRadiuses = (CornerRadiuses) b.A(descriptor2, 0, CornerRadiusesSerializer.INSTANCE, cornerRadiuses);
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new Shape.Rectangle(i, cornerRadiuses, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, Shape.Rectangle rectangle) {
        t.g(fVar, "encoder");
        t.g(rectangle, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        Shape.Rectangle.write$Self$purchases_defaultsBc8Release(rectangle, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
