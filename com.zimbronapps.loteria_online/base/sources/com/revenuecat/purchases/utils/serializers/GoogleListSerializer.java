package com.revenuecat.purchases.utils.serializers;

import Da.v;
import Da.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import ob.b;
import qb.d;
import qb.e;
import qb.k;
import rb.f;
import tb.c;
import tb.h;
import tb.i;
import tb.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GoogleListSerializer implements b {
    public static final GoogleListSerializer INSTANCE = new GoogleListSerializer();
    private static final e descriptor = k.b("GoogleList", d.i.a);

    private GoogleListSerializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public List deserialize(rb.e decoder) {
        t.g(decoder, "decoder");
        h hVar = decoder instanceof h ? (h) decoder : null;
        if (hVar == null) {
            throw new IllegalStateException("This serializer can be used only with JSON format");
        }
        i iVar = (i) j.n(hVar.i()).get("google");
        c m = iVar != null ? j.m(iVar) : null;
        if (m == null) {
            return v.n();
        }
        ArrayList arrayList = new ArrayList(w.y(m, 10));
        Iterator it = m.iterator();
        while (it.hasNext()) {
            arrayList.add(j.o((i) it.next()).a());
        }
        return arrayList;
    }

    public void serialize(f encoder, List value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
