package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
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
public final class CountdownComponent$$serializer implements E {
    public static final CountdownComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CountdownComponent$$serializer countdownComponent$$serializer = new CountdownComponent$$serializer();
        INSTANCE = countdownComponent$$serializer;
        k0 k0Var = new k0("countdown", countdownComponent$$serializer, 5);
        k0Var.o("style", false);
        k0Var.o("count_from", true);
        k0Var.o("countdown_stack", false);
        k0Var.o("end_stack", true);
        k0Var.o("fallback", true);
        descriptor = k0Var;
    }

    private CountdownComponent$$serializer() {
    }

    public b[] childSerializers() {
        b bVar = CountdownComponent.access$get$childSerializers$cp()[1];
        b bVar2 = StackComponent$$serializer.INSTANCE;
        return new b[]{CountdownComponent$CountdownStyle$$serializer.INSTANCE, bVar, bVar2, a.p(bVar2), a.p(bVar2)};
    }

    public CountdownComponent deserialize(rb.e eVar) {
        int i;
        CountdownComponent.CountdownStyle countdownStyle;
        CountdownComponent.CountFrom countFrom;
        StackComponent stackComponent;
        StackComponent stackComponent2;
        StackComponent stackComponent3;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = CountdownComponent.access$get$childSerializers$cp();
        CountdownComponent.CountdownStyle countdownStyle2 = null;
        if (b.m()) {
            CountdownComponent.CountdownStyle countdownStyle3 = (CountdownComponent.CountdownStyle) b.e(descriptor2, 0, CountdownComponent$CountdownStyle$$serializer.INSTANCE, (Object) null);
            CountdownComponent.CountFrom countFrom2 = (CountdownComponent.CountFrom) b.e(descriptor2, 1, access$get$childSerializers$cp[1], (Object) null);
            StackComponent$$serializer stackComponent$$serializer = StackComponent$$serializer.INSTANCE;
            StackComponent stackComponent4 = (StackComponent) b.e(descriptor2, 2, stackComponent$$serializer, (Object) null);
            countFrom = countFrom2;
            countdownStyle = countdownStyle3;
            stackComponent2 = (StackComponent) b.A(descriptor2, 3, stackComponent$$serializer, (Object) null);
            stackComponent3 = (StackComponent) b.A(descriptor2, 4, stackComponent$$serializer, (Object) null);
            stackComponent = stackComponent4;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            CountdownComponent.CountFrom countFrom3 = null;
            StackComponent stackComponent5 = null;
            StackComponent stackComponent6 = null;
            StackComponent stackComponent7 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    countdownStyle2 = (CountdownComponent.CountdownStyle) b.e(descriptor2, 0, CountdownComponent$CountdownStyle$$serializer.INSTANCE, countdownStyle2);
                    i2 |= 1;
                } else if (v == 1) {
                    countFrom3 = (CountdownComponent.CountFrom) b.e(descriptor2, 1, access$get$childSerializers$cp[1], countFrom3);
                    i2 |= 2;
                } else if (v == 2) {
                    stackComponent5 = (StackComponent) b.e(descriptor2, 2, StackComponent$$serializer.INSTANCE, stackComponent5);
                    i2 |= 4;
                } else if (v == 3) {
                    stackComponent6 = (StackComponent) b.A(descriptor2, 3, StackComponent$$serializer.INSTANCE, stackComponent6);
                    i2 |= 8;
                } else {
                    if (v != 4) {
                        throw new m(v);
                    }
                    stackComponent7 = (StackComponent) b.A(descriptor2, 4, StackComponent$$serializer.INSTANCE, stackComponent7);
                    i2 |= 16;
                }
            }
            i = i2;
            countdownStyle = countdownStyle2;
            countFrom = countFrom3;
            stackComponent = stackComponent5;
            stackComponent2 = stackComponent6;
            stackComponent3 = stackComponent7;
        }
        b.c(descriptor2);
        return new CountdownComponent(i, countdownStyle, countFrom, stackComponent, stackComponent2, stackComponent3, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CountdownComponent countdownComponent) {
        t.g(fVar, "encoder");
        t.g(countdownComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CountdownComponent.write$Self$purchases_defaultsBc8Release(countdownComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
