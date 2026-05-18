package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Z implements ob.b {
    public final ob.b a;
    public final qb.e b;

    public Z(ob.b serializer) {
        kotlin.jvm.internal.t.g(serializer, "serializer");
        this.a = serializer;
        this.b = new s0(serializer.getDescriptor());
    }

    public Object deserialize(rb.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return decoder.E() ? decoder.p(this.a) : decoder.k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Z.class == obj.getClass() && kotlin.jvm.internal.t.c(this.a, ((Z) obj).a);
    }

    public qb.e getDescriptor() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void serialize(rb.f encoder, Object obj) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        if (obj == null) {
            encoder.s();
        } else {
            encoder.y();
            encoder.l(this.a, obj);
        }
    }
}
