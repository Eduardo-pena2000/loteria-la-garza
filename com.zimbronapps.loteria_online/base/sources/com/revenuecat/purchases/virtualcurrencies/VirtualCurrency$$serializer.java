package com.revenuecat.purchases.virtualcurrencies;

import Ca.e;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.J;
import sb.k0;
import sb.t0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VirtualCurrency$$serializer implements E {
    public static final VirtualCurrency$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        VirtualCurrency$$serializer virtualCurrency$$serializer = new VirtualCurrency$$serializer();
        INSTANCE = virtualCurrency$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.virtualcurrencies.VirtualCurrency", virtualCurrency$$serializer, 4);
        k0Var.o("balance", false);
        k0Var.o("name", false);
        k0Var.o("code", false);
        k0Var.o("description", true);
        descriptor = k0Var;
    }

    private VirtualCurrency$$serializer() {
    }

    public b[] childSerializers() {
        x0 x0Var = x0.a;
        return new b[]{J.a, x0Var, x0Var, a.p(x0Var)};
    }

    public VirtualCurrency deserialize(rb.e decoder) {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        t.g(decoder, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.m()) {
            int h = b.h(descriptor2, 0);
            String o = b.o(descriptor2, 1);
            String o2 = b.o(descriptor2, 2);
            i = h;
            str3 = (String) b.A(descriptor2, 3, x0.a, null);
            str2 = o2;
            str = o;
            i2 = 15;
        } else {
            boolean z = true;
            int i3 = 0;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            int i4 = 0;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    i3 = b.h(descriptor2, 0);
                    i4 |= 1;
                } else if (v == 1) {
                    str4 = b.o(descriptor2, 1);
                    i4 |= 2;
                } else if (v == 2) {
                    str5 = b.o(descriptor2, 2);
                    i4 |= 4;
                } else {
                    if (v != 3) {
                        throw new m(v);
                    }
                    str6 = (String) b.A(descriptor2, 3, x0.a, str6);
                    i4 |= 8;
                }
            }
            i = i3;
            i2 = i4;
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        b.c(descriptor2);
        return new VirtualCurrency(i2, i, str, str2, str3, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f encoder, VirtualCurrency value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        qb.e descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        VirtualCurrency.write$Self$purchases_defaultsBc8Release(value, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
