package sb;

import qb.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Q implements ob.b {
    public static final Q a = new Q();
    public static final qb.e b = new q0("kotlin.Long", d.g.a);

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(rb.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return Long.valueOf(decoder.l());
    }

    public void b(rb.f encoder, long j) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.p(j);
    }

    public qb.e getDescriptor() {
        return b;
    }

    public /* bridge */ /* synthetic */ void serialize(rb.f fVar, Object obj) {
        b(fVar, ((Number) obj).longValue());
    }
}
