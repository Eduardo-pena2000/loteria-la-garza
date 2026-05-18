package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class G0 extends p0 implements ob.b {
    public static final G0 c = new G0();

    public G0() {
        super(pb.a.r(Ca.A.b));
    }

    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((Ca.B) obj).t());
    }

    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((Ca.B) obj).t());
    }

    public /* bridge */ /* synthetic */ Object r() {
        return Ca.B.a(w());
    }

    public /* bridge */ /* synthetic */ void u(rb.d dVar, Object obj, int i) {
        z(dVar, ((Ca.B) obj).t(), i);
    }

    public int v(int[] collectionSize) {
        kotlin.jvm.internal.t.g(collectionSize, "$this$collectionSize");
        return Ca.B.n(collectionSize);
    }

    public int[] w() {
        return Ca.B.b(0);
    }

    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(rb.c decoder, int i, F0 builder, boolean z) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        builder.e(Ca.A.b(decoder.D(getDescriptor(), i).j()));
    }

    public F0 y(int[] toBuilder) {
        kotlin.jvm.internal.t.g(toBuilder, "$this$toBuilder");
        return new F0(toBuilder, null);
    }

    public void z(rb.d encoder, int[] content, int i) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.r(getDescriptor(), i2).D(Ca.B.k(content, i2));
        }
    }
}
