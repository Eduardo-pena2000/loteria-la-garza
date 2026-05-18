package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class J0 extends p0 implements ob.b {
    public static final J0 c = new J0();

    public J0() {
        super(pb.a.s(Ca.C.b));
    }

    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((Ca.D) obj).t());
    }

    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((Ca.D) obj).t());
    }

    public /* bridge */ /* synthetic */ Object r() {
        return Ca.D.a(w());
    }

    public /* bridge */ /* synthetic */ void u(rb.d dVar, Object obj, int i) {
        z(dVar, ((Ca.D) obj).t(), i);
    }

    public int v(long[] collectionSize) {
        kotlin.jvm.internal.t.g(collectionSize, "$this$collectionSize");
        return Ca.D.n(collectionSize);
    }

    public long[] w() {
        return Ca.D.b(0);
    }

    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(rb.c decoder, int i, I0 builder, boolean z) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        builder.e(Ca.C.b(decoder.D(getDescriptor(), i).l()));
    }

    public I0 y(long[] toBuilder) {
        kotlin.jvm.internal.t.g(toBuilder, "$this$toBuilder");
        return new I0(toBuilder, null);
    }

    public void z(rb.d encoder, long[] content, int i) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.r(getDescriptor(), i2).p(Ca.D.k(content, i2));
        }
    }
}
