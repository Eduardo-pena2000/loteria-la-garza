package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class v0 extends p0 implements ob.b {
    public static final v0 c = new v0();

    public v0() {
        super(pb.a.E(kotlin.jvm.internal.S.a));
    }

    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(short[] sArr) {
        kotlin.jvm.internal.t.g(sArr, "<this>");
        return sArr.length;
    }

    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public short[] r() {
        return new short[0];
    }

    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(rb.c decoder, int i, u0 builder, boolean z) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        builder.e(decoder.g(getDescriptor(), i));
    }

    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public u0 k(short[] sArr) {
        kotlin.jvm.internal.t.g(sArr, "<this>");
        return new u0(sArr);
    }

    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(rb.d encoder, short[] content, int i) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.m(getDescriptor(), i2, content[i2]);
        }
    }
}
