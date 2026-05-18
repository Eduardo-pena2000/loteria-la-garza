package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer;
import java.util.Date;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CountdownComponent$CountdownStyle$$serializer implements E {
    public static final CountdownComponent$CountdownStyle$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CountdownComponent$CountdownStyle$$serializer countdownComponent$CountdownStyle$$serializer = new CountdownComponent$CountdownStyle$$serializer();
        INSTANCE = countdownComponent$CountdownStyle$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.CountdownComponent.CountdownStyle", countdownComponent$CountdownStyle$$serializer, 2);
        k0Var.o("type", false);
        k0Var.o("date", false);
        descriptor = k0Var;
    }

    private CountdownComponent$CountdownStyle$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{x0.a, ISO8601DateSerializer.INSTANCE};
    }

    public CountdownComponent.CountdownStyle deserialize(rb.e eVar) {
        String str;
        Date date;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            str = b.o(descriptor2, 0);
            date = (Date) b.e(descriptor2, 1, ISO8601DateSerializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            str = null;
            Date date2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    str = b.o(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    date2 = (Date) b.e(descriptor2, 1, ISO8601DateSerializer.INSTANCE, date2);
                    i2 |= 2;
                }
            }
            date = date2;
            i = i2;
        }
        b.c(descriptor2);
        return new CountdownComponent.CountdownStyle(i, str, date, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CountdownComponent.CountdownStyle countdownStyle) {
        t.g(fVar, "encoder");
        t.g(countdownStyle, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CountdownComponent.CountdownStyle.write$Self$purchases_defaultsBc8Release(countdownStyle, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
