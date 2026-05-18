package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CornerRadiusesSerializer implements b {
    public static final CornerRadiusesSerializer INSTANCE = new CornerRadiusesSerializer();
    private static final e descriptor;
    private static final b serializer;

    static {
        b serializer2 = CornerRadiuses.Dp.Companion.serializer();
        serializer = serializer2;
        descriptor = serializer2.getDescriptor();
    }

    private CornerRadiusesSerializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CornerRadiuses cornerRadiuses) {
        t.g(fVar, "encoder");
        t.g(cornerRadiuses, "value");
    }

    public CornerRadiuses deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        return (CornerRadiuses) eVar.p(serializer);
    }
}
