package com.revenuecat.purchases.utils.serializers;

import java.util.UUID;
import kotlin.jvm.internal.t;
import ob.b;
import qb.d;
import qb.e;
import qb.k;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UUIDSerializer implements b {
    public static final UUIDSerializer INSTANCE = new UUIDSerializer();
    private static final e descriptor = k.b("UUID", d.i.a);

    private UUIDSerializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public UUID deserialize(rb.e decoder) {
        t.g(decoder, "decoder");
        UUID fromString = UUID.fromString(decoder.B());
        t.f(fromString, "fromString(decoder.decodeString())");
        return fromString;
    }

    public void serialize(f encoder, UUID value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        String uuid = value.toString();
        t.f(uuid, "value.toString()");
        encoder.F(uuid);
    }
}
