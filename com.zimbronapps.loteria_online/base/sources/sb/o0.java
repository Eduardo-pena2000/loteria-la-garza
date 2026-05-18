package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class O0 implements ob.b {
    public static final O0 b = new O0();
    public final /* synthetic */ c0 a = new c0("kotlin.Unit", Ca.I.a);

    public void a(rb.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        this.a.deserialize(decoder);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(rb.f encoder, Ca.I value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        this.a.serialize(encoder, value);
    }

    public /* bridge */ /* synthetic */ Object deserialize(rb.e eVar) {
        a(eVar);
        return Ca.I.a;
    }

    public qb.e getDescriptor() {
        return this.a.getDescriptor();
    }
}
