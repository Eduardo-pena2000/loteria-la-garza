package sb;

import qb.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class x0 implements ob.b {
    public static final x0 a = new x0();
    public static final qb.e b = new q0("kotlin.String", d.i.a);

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(rb.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return decoder.B();
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(rb.f encoder, String value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        encoder.F(value);
    }

    public qb.e getDescriptor() {
        return b;
    }
}
