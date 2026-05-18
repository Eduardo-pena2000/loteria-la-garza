package com.revenuecat.purchases.utils.serializers;

import java.net.URL;
import kotlin.jvm.internal.t;
import ob.b;
import qb.d;
import qb.e;
import qb.k;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class URLSerializer implements b {
    public static final URLSerializer INSTANCE = new URLSerializer();
    private static final e descriptor = k.b("URL", d.i.a);

    private URLSerializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public URL deserialize(rb.e decoder) {
        t.g(decoder, "decoder");
        return new URL(decoder.B());
    }

    public void serialize(f encoder, URL value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        String url = value.toString();
        t.f(url, "value.toString()");
        encoder.F(url);
    }
}
