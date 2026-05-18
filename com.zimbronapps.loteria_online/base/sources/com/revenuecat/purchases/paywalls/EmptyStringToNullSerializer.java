package com.revenuecat.purchases.paywalls;

import Za.E;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.t;
import ob.b;
import qb.d;
import qb.e;
import qb.k;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EmptyStringToNullSerializer implements b {
    public static final EmptyStringToNullSerializer INSTANCE = new EmptyStringToNullSerializer();
    private static final b delegate = pb.a.p(pb.a.F(U.a));
    private static final e descriptor = k.b("EmptyStringToNullSerializer", d.i.a);

    private EmptyStringToNullSerializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public String deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        String str = (String) delegate.deserialize(eVar);
        if (str == null || E.h0(str)) {
            return null;
        }
        return str;
    }

    public void serialize(f fVar, String str) {
        t.g(fVar, "encoder");
        if (str == null) {
            fVar.F("");
        } else {
            fVar.F(str);
        }
    }
}
