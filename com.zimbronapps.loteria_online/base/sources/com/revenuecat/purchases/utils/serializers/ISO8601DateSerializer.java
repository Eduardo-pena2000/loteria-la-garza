package com.revenuecat.purchases.utils.serializers;

import com.revenuecat.purchases.utils.Iso8601Utils;
import java.util.Date;
import kotlin.jvm.internal.t;
import ob.b;
import qb.d;
import qb.e;
import qb.k;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ISO8601DateSerializer implements b {
    public static final ISO8601DateSerializer INSTANCE = new ISO8601DateSerializer();

    private ISO8601DateSerializer() {
    }

    public e getDescriptor() {
        return k.b("ISO8601Date", d.i.a);
    }

    public Date deserialize(rb.e decoder) {
        t.g(decoder, "decoder");
        Date parse = Iso8601Utils.parse(decoder.B());
        t.f(parse, "parse(isoDateString)");
        return parse;
    }

    public void serialize(f encoder, Date value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        String isoDateString = Iso8601Utils.format(value);
        t.f(isoDateString, "isoDateString");
        encoder.F(isoDateString);
    }
}
