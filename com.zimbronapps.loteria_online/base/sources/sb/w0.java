package sb;

import qb.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class w0 implements ob.b {
    public static final w0 a = new w0();
    public static final qb.e b = new q0("kotlin.Short", d.h.a);

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(rb.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return Short.valueOf(decoder.s());
    }

    public void b(rb.f encoder, short s) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.t(s);
    }

    public qb.e getDescriptor() {
        return b;
    }

    public /* bridge */ /* synthetic */ void serialize(rb.f fVar, Object obj) {
        b(fVar, ((Number) obj).shortValue());
    }
}
