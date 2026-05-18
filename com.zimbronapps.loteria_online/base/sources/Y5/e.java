package y5;

import y5.o;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e extends o {
    public final o.b a;
    public final y5.a b;

    public static final class b extends o.a {
        public o.b a;
        public y5.a b;

        public o a() {
            return new e(this.a, this.b, null);
        }

        public o.a b(y5.a aVar) {
            this.b = aVar;
            return this;
        }

        public o.a c(o.b bVar) {
            this.a = bVar;
            return this;
        }
    }

    public /* synthetic */ e(o.b bVar, y5.a aVar, a aVar2) {
        this(bVar, aVar);
    }

    public y5.a b() {
        return this.b;
    }

    public o.b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.a;
        if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
            y5.a aVar = this.b;
            if (aVar == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (aVar.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        y5.a aVar = this.b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }

    public e(o.b bVar, y5.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }
}
