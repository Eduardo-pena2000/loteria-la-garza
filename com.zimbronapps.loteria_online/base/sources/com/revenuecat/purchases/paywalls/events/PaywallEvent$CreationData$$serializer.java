package com.revenuecat.purchases.paywalls.events;

import Ca.e;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.utils.serializers.DateSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallEvent$CreationData$$serializer implements E {
    public static final PaywallEvent$CreationData$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallEvent$CreationData$$serializer paywallEvent$CreationData$$serializer = new PaywallEvent$CreationData$$serializer();
        INSTANCE = paywallEvent$CreationData$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData", paywallEvent$CreationData$$serializer, 2);
        k0Var.o("id", false);
        k0Var.o("date", false);
        descriptor = k0Var;
    }

    private PaywallEvent$CreationData$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{UUIDSerializer.INSTANCE, DateSerializer.INSTANCE};
    }

    public PaywallEvent.CreationData deserialize(rb.e eVar) {
        UUID uuid;
        Date date;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            uuid = (UUID) b.e(descriptor2, 0, UUIDSerializer.INSTANCE, (Object) null);
            date = (Date) b.e(descriptor2, 1, DateSerializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            uuid = null;
            Date date2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    uuid = (UUID) b.e(descriptor2, 0, UUIDSerializer.INSTANCE, uuid);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    date2 = (Date) b.e(descriptor2, 1, DateSerializer.INSTANCE, date2);
                    i2 |= 2;
                }
            }
            date = date2;
            i = i2;
        }
        b.c(descriptor2);
        return new PaywallEvent.CreationData(i, uuid, date, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallEvent.CreationData creationData) {
        t.g(fVar, "encoder");
        t.g(creationData, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallEvent.CreationData.write$Self$purchases_defaultsBc8Release(creationData, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
