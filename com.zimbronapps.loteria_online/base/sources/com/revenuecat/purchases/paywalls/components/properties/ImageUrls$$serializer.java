package com.revenuecat.purchases.paywalls.components.properties;

import Ca.A;
import Ca.e;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.H0;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ImageUrls$$serializer implements E {
    public static final ImageUrls$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ImageUrls$$serializer imageUrls$$serializer = new ImageUrls$$serializer();
        INSTANCE = imageUrls$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.properties.ImageUrls", imageUrls$$serializer, 5);
        k0Var.o("original", false);
        k0Var.o("webp", false);
        k0Var.o("webp_low_res", false);
        k0Var.o("width", false);
        k0Var.o("height", false);
        descriptor = k0Var;
    }

    private ImageUrls$$serializer() {
    }

    public b[] childSerializers() {
        URLSerializer uRLSerializer = URLSerializer.INSTANCE;
        H0 h0 = H0.a;
        return new b[]{uRLSerializer, uRLSerializer, uRLSerializer, h0, h0};
    }

    public ImageUrls deserialize(rb.e eVar) {
        int i;
        URL url;
        URL url2;
        URL url3;
        A a;
        A a2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        URL url4 = null;
        if (b.m()) {
            URLSerializer uRLSerializer = URLSerializer.INSTANCE;
            URL url5 = (URL) b.e(descriptor2, 0, uRLSerializer, (Object) null);
            URL url6 = (URL) b.e(descriptor2, 1, uRLSerializer, (Object) null);
            URL url7 = (URL) b.e(descriptor2, 2, uRLSerializer, (Object) null);
            H0 h0 = H0.a;
            url3 = url7;
            a = (A) b.e(descriptor2, 3, h0, (Object) null);
            a2 = (A) b.e(descriptor2, 4, h0, (Object) null);
            i = 31;
            url2 = url6;
            url = url5;
        } else {
            boolean z = true;
            int i2 = 0;
            URL url8 = null;
            URL url9 = null;
            A a3 = null;
            A a4 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    url4 = (URL) b.e(descriptor2, 0, URLSerializer.INSTANCE, url4);
                    i2 |= 1;
                } else if (v == 1) {
                    url8 = (URL) b.e(descriptor2, 1, URLSerializer.INSTANCE, url8);
                    i2 |= 2;
                } else if (v == 2) {
                    url9 = (URL) b.e(descriptor2, 2, URLSerializer.INSTANCE, url9);
                    i2 |= 4;
                } else if (v == 3) {
                    a3 = (A) b.e(descriptor2, 3, H0.a, a3);
                    i2 |= 8;
                } else {
                    if (v != 4) {
                        throw new m(v);
                    }
                    a4 = (A) b.e(descriptor2, 4, H0.a, a4);
                    i2 |= 16;
                }
            }
            i = i2;
            url = url4;
            url2 = url8;
            url3 = url9;
            a = a3;
            a2 = a4;
        }
        b.c(descriptor2);
        return new ImageUrls(i, url, url2, url3, a, a2, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ImageUrls imageUrls) {
        t.g(fVar, "encoder");
        t.g(imageUrls, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ImageUrls.write$Self$purchases_defaultsBc8Release(imageUrls, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
