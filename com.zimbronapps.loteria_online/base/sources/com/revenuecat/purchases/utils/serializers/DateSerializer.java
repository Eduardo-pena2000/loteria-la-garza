package com.revenuecat.purchases.utils.serializers;

import java.util.Date;
import kotlin.jvm.internal.t;
import ob.b;
import qb.d;
import qb.e;
import qb.k;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DateSerializer implements b {
    public static final DateSerializer INSTANCE = new DateSerializer();

    private DateSerializer() {
    }

    public e getDescriptor() {
        return k.b("Date", d.g.a);
    }

    public Date deserialize(rb.e decoder) {
        t.g(decoder, "decoder");
        return new Date(decoder.l());
    }

    public void serialize(f encoder, Date value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        encoder.p(value.getTime());
    }
}
