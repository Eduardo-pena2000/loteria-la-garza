package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class M0 extends p0 implements ob.b {
    public static final M0 c = new M0();

    public M0() {
        super(pb.a.t(Ca.F.b));
    }

    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((Ca.G) obj).t());
    }

    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((Ca.G) obj).t());
    }

    public /* bridge */ /* synthetic */ Object r() {
        return Ca.G.a(w());
    }

    public /* bridge */ /* synthetic */ void u(rb.d dVar, Object obj, int i) {
        z(dVar, ((Ca.G) obj).t(), i);
    }

    public int v(short[] collectionSize) {
        kotlin.jvm.internal.t.g(collectionSize, "$this$collectionSize");
        return Ca.G.n(collectionSize);
    }

    public short[] w() {
        return Ca.G.b(0);
    }

    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(rb.c decoder, int i, L0 builder, boolean z) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        builder.e(Ca.F.b(decoder.D(getDescriptor(), i).s()));
    }

    public L0 y(short[] toBuilder) {
        kotlin.jvm.internal.t.g(toBuilder, "$this$toBuilder");
        return new L0(toBuilder, null);
    }

    public void z(rb.d encoder, short[] content, int i) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.r(getDescriptor(), i2).t(Ca.G.k(content, i2));
        }
    }
}
