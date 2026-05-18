package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class N0 implements ob.b {
    public static final N0 a = new N0();
    public static final qb.e b = G.a("kotlin.UShort", pb.a.E(kotlin.jvm.internal.S.a));

    public short a(rb.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return Ca.F.b(decoder.f(getDescriptor()).s());
    }

    public void b(rb.f encoder, short s) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.f(getDescriptor()).t(s);
    }

    public /* bridge */ /* synthetic */ Object deserialize(rb.e eVar) {
        return Ca.F.a(a(eVar));
    }

    public qb.e getDescriptor() {
        return b;
    }

    public /* bridge */ /* synthetic */ void serialize(rb.f fVar, Object obj) {
        b(fVar, ((Ca.F) obj).f());
    }
}
