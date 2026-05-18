package sb;

import qb.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class J implements ob.b {
    public static final J a = new J();
    public static final qb.e b = new q0("kotlin.Int", d.f.a);

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(rb.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return Integer.valueOf(decoder.j());
    }

    public void b(rb.f encoder, int i) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.D(i);
    }

    public qb.e getDescriptor() {
        return b;
    }

    public /* bridge */ /* synthetic */ void serialize(rb.f fVar, Object obj) {
        b(fVar, ((Number) obj).intValue());
    }
}
