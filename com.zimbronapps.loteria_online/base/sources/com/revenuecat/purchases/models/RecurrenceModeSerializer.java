package com.revenuecat.purchases.models;

import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import qb.k;
import rb.c;
import rb.d;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class RecurrenceModeSerializer implements b {
    public static final RecurrenceModeSerializer INSTANCE = new RecurrenceModeSerializer();
    private static final e descriptor = k.c("RecurrenceMode", new e[0], RecurrenceModeSerializer$descriptor$1.INSTANCE);

    private RecurrenceModeSerializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public RecurrenceMode deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        String str = "";
        while (true) {
            RecurrenceModeSerializer recurrenceModeSerializer = INSTANCE;
            int v = b.v(recurrenceModeSerializer.getDescriptor());
            if (v == -1) {
                RecurrenceMode valueOf = RecurrenceMode.valueOf(str);
                b.c(descriptor2);
                return valueOf;
            }
            if (v != 0) {
                throw new IllegalStateException(("Unexpected index: " + v).toString());
            }
            str = b.o(recurrenceModeSerializer.getDescriptor(), 0);
        }
    }

    public void serialize(f fVar, RecurrenceMode recurrenceMode) {
        t.g(fVar, "encoder");
        t.g(recurrenceMode, "value");
        e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        b.v(INSTANCE.getDescriptor(), 0, recurrenceMode.name());
        b.c(descriptor2);
    }
}
