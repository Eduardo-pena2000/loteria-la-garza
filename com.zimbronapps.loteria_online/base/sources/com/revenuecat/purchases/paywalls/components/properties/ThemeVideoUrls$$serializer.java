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

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ThemeVideoUrls$$serializer implements E {
    public static final ThemeVideoUrls$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ThemeVideoUrls$$serializer themeVideoUrls$$serializer = new ThemeVideoUrls$$serializer();
        INSTANCE = themeVideoUrls$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls", themeVideoUrls$$serializer, 2);
        k0Var.o("light", false);
        k0Var.o("dark", false);
        descriptor = k0Var;
    }

    private ThemeVideoUrls$$serializer() {
    }

    public b[] childSerializers() {
        b bVar = VideoUrls$$serializer.INSTANCE;
        return new b[]{bVar, a.p(bVar)};
    }

    public ThemeVideoUrls deserialize(rb.e eVar) {
        VideoUrls videoUrls;
        int i;
        VideoUrls videoUrls2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            VideoUrls$$serializer videoUrls$$serializer = VideoUrls$$serializer.INSTANCE;
            videoUrls2 = (VideoUrls) b.e(descriptor2, 0, videoUrls$$serializer, (Object) null);
            videoUrls = (VideoUrls) b.A(descriptor2, 1, videoUrls$$serializer, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            videoUrls = null;
            VideoUrls videoUrls3 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    videoUrls3 = (VideoUrls) b.e(descriptor2, 0, VideoUrls$$serializer.INSTANCE, videoUrls3);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    videoUrls = (VideoUrls) b.A(descriptor2, 1, VideoUrls$$serializer.INSTANCE, videoUrls);
                    i2 |= 2;
                }
            }
            i = i2;
            videoUrls2 = videoUrls3;
        }
        b.c(descriptor2);
        return new ThemeVideoUrls(i, videoUrls2, videoUrls, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ThemeVideoUrls themeVideoUrls) {
        t.g(fVar, "encoder");
        t.g(themeVideoUrls, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ThemeVideoUrls.write$Self$purchases_defaultsBc8Release(themeVideoUrls, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
