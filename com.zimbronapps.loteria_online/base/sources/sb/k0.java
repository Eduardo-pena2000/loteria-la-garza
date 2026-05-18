package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class K0 implements ob.b {
    public static final K0 a = new K0();
    public static final qb.e b = G.a("kotlin.ULong", pb.a.D(kotlin.jvm.internal.v.a));

    public long a(rb.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return Ca.C.b(decoder.f(getDescriptor()).l());
    }

    public void b(rb.f encoder, long j) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.f(getDescriptor()).p(j);
    }

    public /* bridge */ /* synthetic */ Object deserialize(rb.e eVar) {
        return Ca.C.a(a(eVar));
    }

    public qb.e getDescriptor() {
        return b;
    }

    public /* bridge */ /* synthetic */ void serialize(rb.f fVar, Object obj) {
        b(fVar, ((Ca.C) obj).g());
    }
}
