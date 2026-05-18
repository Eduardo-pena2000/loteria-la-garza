package y5;

import y5.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class f extends p {
    public final s a;
    public final p.b b;

    public static final class b extends p.a {
        public s a;
        public p.b b;

        public p a() {
            return new f(this.a, this.b, null);
        }

        public p.a b(s sVar) {
            this.a = sVar;
            return this;
        }

        public p.a c(p.b bVar) {
            this.b = bVar;
            return this;
        }
    }

    public /* synthetic */ f(s sVar, p.b bVar, a aVar) {
        this(sVar, bVar);
    }

    public s b() {
        return this.a;
    }

    public p.b c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        s sVar = this.a;
        if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
            p.b bVar = this.b;
            if (bVar == null) {
                if (pVar.c() == null) {
                    return true;
                }
            } else if (bVar.equals(pVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.a;
        int hashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + this.b + "}";
    }

    public f(s sVar, p.b bVar) {
        this.a = sVar;
        this.b = bVar;
    }
}
