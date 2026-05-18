package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class P extends p0 implements ob.b {
    public static final P c = new P();

    public P() {
        super(pb.a.D(kotlin.jvm.internal.v.a));
    }

    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(long[] jArr) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        return jArr.length;
    }

    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public long[] r() {
        return new long[0];
    }

    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(rb.c decoder, int i, O builder, boolean z) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        builder.e(decoder.F(getDescriptor(), i));
    }

    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public O k(long[] jArr) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        return new O(jArr);
    }

    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(rb.d encoder, long[] content, int i) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.o(getDescriptor(), i2, content[i2]);
        }
    }
}
