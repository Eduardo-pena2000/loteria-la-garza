package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class I extends p0 implements ob.b {
    public static final I c = new I();

    public I() {
        super(pb.a.C(kotlin.jvm.internal.s.a));
    }

    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(int[] iArr) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        return iArr.length;
    }

    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int[] r() {
        return new int[0];
    }

    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(rb.c decoder, int i, H builder, boolean z) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        builder.e(decoder.h(getDescriptor(), i));
    }

    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public H k(int[] iArr) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        return new H(iArr);
    }

    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(rb.d encoder, int[] content, int i) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.n(getDescriptor(), i2, content[i2]);
        }
    }
}
