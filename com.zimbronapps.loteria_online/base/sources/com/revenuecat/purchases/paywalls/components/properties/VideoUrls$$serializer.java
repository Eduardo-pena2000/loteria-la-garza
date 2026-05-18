package com.revenuecat.purchases.paywalls.components.properties;

import Ca.A;
import Ca.e;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.models.Checksum$$serializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.H0;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class VideoUrls$$serializer implements E {
    public static final VideoUrls$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        VideoUrls$$serializer videoUrls$$serializer = new VideoUrls$$serializer();
        INSTANCE = videoUrls$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.properties.VideoUrls", videoUrls$$serializer, 6);
        k0Var.o("width", false);
        k0Var.o("height", false);
        k0Var.o("url", false);
        k0Var.o("checksum", true);
        k0Var.o("url_low_res", true);
        k0Var.o("checksum_low_res", true);
        descriptor = k0Var;
    }

    private VideoUrls$$serializer() {
    }

    public b[] childSerializers() {
        b bVar = URLSerializer.INSTANCE;
        Checksum$$serializer checksum$$serializer = Checksum$$serializer.INSTANCE;
        b p = a.p(checksum$$serializer);
        b p2 = a.p(bVar);
        b p3 = a.p(checksum$$serializer);
        H0 h0 = H0.a;
        return new b[]{h0, h0, bVar, p, p2, p3};
    }

    public VideoUrls deserialize(rb.e eVar) {
        int i;
        A a;
        A a2;
        URL url;
        Checksum checksum;
        URL url2;
        Checksum checksum2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i2 = 5;
        A a3 = null;
        if (b.m()) {
            H0 h0 = H0.a;
            A a4 = (A) b.e(descriptor2, 0, h0, (Object) null);
            A a5 = (A) b.e(descriptor2, 1, h0, (Object) null);
            URLSerializer uRLSerializer = URLSerializer.INSTANCE;
            URL url3 = (URL) b.e(descriptor2, 2, uRLSerializer, (Object) null);
            Checksum$$serializer checksum$$serializer = Checksum$$serializer.INSTANCE;
            Checksum checksum3 = (Checksum) b.A(descriptor2, 3, checksum$$serializer, (Object) null);
            URL url4 = (URL) b.A(descriptor2, 4, uRLSerializer, (Object) null);
            a2 = a5;
            checksum2 = (Checksum) b.A(descriptor2, 5, checksum$$serializer, (Object) null);
            checksum = checksum3;
            url2 = url4;
            url = url3;
            i = 63;
            a = a4;
        } else {
            boolean z = true;
            int i3 = 0;
            A a6 = null;
            URL url5 = null;
            Checksum checksum4 = null;
            URL url6 = null;
            Checksum checksum5 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        a3 = (A) b.e(descriptor2, 0, H0.a, a3);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        a6 = (A) b.e(descriptor2, 1, H0.a, a6);
                        i3 |= 2;
                    case 2:
                        url5 = (URL) b.e(descriptor2, 2, URLSerializer.INSTANCE, url5);
                        i3 |= 4;
                    case 3:
                        checksum4 = (Checksum) b.A(descriptor2, 3, Checksum$$serializer.INSTANCE, checksum4);
                        i3 |= 8;
                    case 4:
                        url6 = (URL) b.A(descriptor2, 4, URLSerializer.INSTANCE, url6);
                        i3 |= 16;
                    case 5:
                        checksum5 = (Checksum) b.A(descriptor2, i2, Checksum$$serializer.INSTANCE, checksum5);
                        i3 |= 32;
                    default:
                        throw new m(v);
                }
            }
            i = i3;
            a = a3;
            a2 = a6;
            url = url5;
            checksum = checksum4;
            url2 = url6;
            checksum2 = checksum5;
        }
        b.c(descriptor2);
        return new VideoUrls(i, a, a2, url, checksum, url2, checksum2, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, VideoUrls videoUrls) {
        t.g(fVar, "encoder");
        t.g(videoUrls, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        VideoUrls.write$Self$purchases_defaultsBc8Release(videoUrls, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
