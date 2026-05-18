package w5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class a extends d {
    public final Integer a;
    public final Object b;
    public final f c;
    public final g d;

    public a(Integer num, Object obj, f fVar, g gVar, e eVar) {
        this.a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = obj;
        if (fVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.c = fVar;
        this.d = gVar;
    }

    public Integer a() {
        return this.a;
    }

    public e b() {
        return null;
    }

    public Object c() {
        return this.b;
    }

    public f d() {
        return this.c;
    }

    public g e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        g gVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        Integer num = this.a;
        if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
            if (this.b.equals(dVar.c()) && this.c.equals(dVar.d()) && ((gVar = this.d) != null ? gVar.equals(dVar.e()) : dVar.e() == null)) {
                dVar.b();
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        g gVar = this.d;
        return (hashCode ^ (gVar != null ? gVar.hashCode() : 0)) * 1000003;
    }

    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + ", eventContext=" + ((Object) null) + "}";
    }
}
