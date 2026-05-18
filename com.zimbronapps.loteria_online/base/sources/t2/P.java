package T2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p {
    public final String a;
    public final M2.q b;
    public final M2.q c;
    public final int d;
    public final int e;

    public p(String str, M2.q qVar, M2.q qVar2, int i, int i2) {
        P2.a.a(i == 0 || i2 == 0);
        this.a = P2.a.d(str);
        this.b = (M2.q) P2.a.e(qVar);
        this.c = (M2.q) P2.a.e(qVar2);
        this.d = i;
        this.e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.d == pVar.d && this.e == pVar.e && this.a.equals(pVar.a) && this.b.equals(pVar.b) && this.c.equals(pVar.c);
    }

    public int hashCode() {
        return ((((((((527 + this.d) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
