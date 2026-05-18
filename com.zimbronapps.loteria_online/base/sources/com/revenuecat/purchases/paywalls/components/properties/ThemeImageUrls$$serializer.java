package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
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
public final class ThemeImageUrls$$serializer implements E {
    public static final ThemeImageUrls$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ThemeImageUrls$$serializer themeImageUrls$$serializer = new ThemeImageUrls$$serializer();
        INSTANCE = themeImageUrls$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls", themeImageUrls$$serializer, 2);
        k0Var.o("light", false);
        k0Var.o("dark", true);
        descriptor = k0Var;
    }

    private ThemeImageUrls$$serializer() {
    }

    public b[] childSerializers() {
        b bVar = ImageUrls$$serializer.INSTANCE;
        return new b[]{bVar, a.p(bVar)};
    }

    public ThemeImageUrls deserialize(rb.e eVar) {
        ImageUrls imageUrls;
        int i;
        ImageUrls imageUrls2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            ImageUrls$$serializer imageUrls$$serializer = ImageUrls$$serializer.INSTANCE;
            imageUrls2 = (ImageUrls) b.e(descriptor2, 0, imageUrls$$serializer, (Object) null);
            imageUrls = (ImageUrls) b.A(descriptor2, 1, imageUrls$$serializer, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            imageUrls = null;
            ImageUrls imageUrls3 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    imageUrls3 = (ImageUrls) b.e(descriptor2, 0, ImageUrls$$serializer.INSTANCE, imageUrls3);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    imageUrls = (ImageUrls) b.A(descriptor2, 1, ImageUrls$$serializer.INSTANCE, imageUrls);
                    i2 |= 2;
                }
            }
            i = i2;
            imageUrls2 = imageUrls3;
        }
        b.c(descriptor2);
        return new ThemeImageUrls(i, imageUrls2, imageUrls, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ThemeImageUrls themeImageUrls) {
        t.g(fVar, "encoder");
        t.g(themeImageUrls, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ThemeImageUrls.write$Self$purchases_defaultsBc8Release(themeImageUrls, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
