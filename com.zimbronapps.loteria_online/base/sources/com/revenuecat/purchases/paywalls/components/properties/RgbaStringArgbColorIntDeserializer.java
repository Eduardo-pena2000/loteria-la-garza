package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.paywalls.ColorUtilsKt;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import ob.b;
import pb.a;
import qb.e;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class RgbaStringArgbColorIntDeserializer implements b {
    public static final RgbaStringArgbColorIntDeserializer INSTANCE = new RgbaStringArgbColorIntDeserializer();
    private static final e descriptor = a.C(s.a).getDescriptor();

    private RgbaStringArgbColorIntDeserializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public /* bridge */ /* synthetic */ void serialize(f fVar, Object obj) {
        serialize(fVar, ((Number) obj).intValue());
    }

    public Integer deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        return Integer.valueOf(ColorUtilsKt.parseRGBAColor(eVar.B()));
    }

    public void serialize(f fVar, int i) {
        t.g(fVar, "encoder");
        throw new IllegalStateException("Serialization is not implemented as it is not (yet) needed.");
    }
}
