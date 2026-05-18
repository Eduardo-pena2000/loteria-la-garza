package com.revenuecat.purchases.utils.serializers;

import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.t;
import ob.b;
import pb.a;
import qb.d;
import qb.e;
import qb.k;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OptionalURLSerializer implements b {
    public static final OptionalURLSerializer INSTANCE = new OptionalURLSerializer();
    private static final b delegate = a.p(URLSerializer.INSTANCE);
    private static final e descriptor = k.b("URL?", d.i.a);

    private OptionalURLSerializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public URL deserialize(rb.e decoder) {
        t.g(decoder, "decoder");
        try {
            return (URL) delegate.deserialize(decoder);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public void serialize(f encoder, URL url) {
        t.g(encoder, "encoder");
        if (url == null) {
            encoder.F("");
        } else {
            delegate.serialize(encoder, url);
        }
    }
}
