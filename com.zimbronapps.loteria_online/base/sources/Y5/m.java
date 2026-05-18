package y5;

import y5.w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m extends w {
    public final w.c a;
    public final w.b b;

    public static final class b extends w.a {
        public w.c a;
        public w.b b;

        public w a() {
            return new m(this.a, this.b, null);
        }

        public w.a b(w.b bVar) {
            this.b = bVar;
            return this;
        }

        public w.a c(w.c cVar) {
            this.a = cVar;
            return this;
        }
    }

    public /* synthetic */ m(w.c cVar, w.b bVar, a aVar) {
        this(cVar, bVar);
    }

    public w.b b() {
        return this.b;
    }

    public w.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        w.c cVar = this.a;
        if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
            w.b bVar = this.b;
            if (bVar == null) {
                if (wVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(wVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }

    public m(w.c cVar, w.b bVar) {
        this.a = cVar;
        this.b = bVar;
    }
}
