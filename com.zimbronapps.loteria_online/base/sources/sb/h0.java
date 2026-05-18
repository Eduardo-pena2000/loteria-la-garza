package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class H0 implements ob.b {
    public static final H0 a = new H0();
    public static final qb.e b = G.a("kotlin.UInt", pb.a.C(kotlin.jvm.internal.s.a));

    public int a(rb.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return Ca.A.b(decoder.f(getDescriptor()).j());
    }

    public void b(rb.f encoder, int i) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.f(getDescriptor()).D(i);
    }

    public /* bridge */ /* synthetic */ Object deserialize(rb.e eVar) {
        return Ca.A.a(a(eVar));
    }

    public qb.e getDescriptor() {
        return b;
    }

    public /* bridge */ /* synthetic */ void serialize(rb.f fVar, Object obj) {
        b(fVar, ((Ca.A) obj).f());
    }
}
