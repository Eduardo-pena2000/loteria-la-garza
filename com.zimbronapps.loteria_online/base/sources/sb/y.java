package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Y implements ob.b {
    public static final Y a = new Y();
    public static final qb.e b = X.a;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void deserialize(rb.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        throw new ob.j("'kotlin.Nothing' does not have instances");
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(rb.f encoder, Void value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        throw new ob.j("'kotlin.Nothing' cannot be serialized");
    }

    public qb.e getDescriptor() {
        return b;
    }
}
