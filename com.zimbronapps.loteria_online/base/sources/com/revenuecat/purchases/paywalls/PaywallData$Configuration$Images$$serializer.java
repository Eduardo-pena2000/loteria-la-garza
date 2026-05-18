package com.revenuecat.purchases.paywalls;

import Ca.e;
import com.revenuecat.purchases.paywalls.PaywallData;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallData$Configuration$Images$$serializer implements E {
    public static final PaywallData$Configuration$Images$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = new PaywallData$Configuration$Images$$serializer();
        INSTANCE = paywallData$Configuration$Images$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images", paywallData$Configuration$Images$$serializer, 3);
        k0Var.o("header", true);
        k0Var.o("background", true);
        k0Var.o("icon", true);
        descriptor = k0Var;
    }

    private PaywallData$Configuration$Images$$serializer() {
    }

    public b[] childSerializers() {
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        return new b[]{pb.a.p(emptyStringToNullSerializer), pb.a.p(emptyStringToNullSerializer), pb.a.p(emptyStringToNullSerializer)};
    }

    public PaywallData.Configuration.Images deserialize(rb.e eVar) {
        int i;
        String str;
        String str2;
        String str3;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        String str4 = null;
        if (b.m()) {
            EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
            String str5 = (String) b.A(descriptor2, 0, emptyStringToNullSerializer, (Object) null);
            String str6 = (String) b.A(descriptor2, 1, emptyStringToNullSerializer, (Object) null);
            str3 = (String) b.A(descriptor2, 2, emptyStringToNullSerializer, (Object) null);
            i = 7;
            str2 = str6;
            str = str5;
        } else {
            boolean z = true;
            int i2 = 0;
            String str7 = null;
            String str8 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    str4 = (String) b.A(descriptor2, 0, EmptyStringToNullSerializer.INSTANCE, str4);
                    i2 |= 1;
                } else if (v == 1) {
                    str7 = (String) b.A(descriptor2, 1, EmptyStringToNullSerializer.INSTANCE, str7);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    str8 = (String) b.A(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, str8);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str4;
            str2 = str7;
            str3 = str8;
        }
        b.c(descriptor2);
        return new PaywallData.Configuration.Images(i, str, str2, str3, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallData.Configuration.Images images) {
        t.g(fVar, "encoder");
        t.g(images, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallData.Configuration.Images.write$Self$purchases_defaultsBc8Release(images, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
