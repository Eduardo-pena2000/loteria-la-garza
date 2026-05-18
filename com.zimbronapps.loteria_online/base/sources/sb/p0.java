package sb;

import qb.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class P0 implements ob.b {
    public static final P0 a = new P0();
    public static final qb.e b = new q0("kotlin.uuid.Uuid", d.i.a);

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bb.b deserialize(rb.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return bb.b.c.c(decoder.B());
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(rb.f encoder, bb.b value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        encoder.F(value.toString());
    }

    public qb.e getDescriptor() {
        return b;
    }
}
