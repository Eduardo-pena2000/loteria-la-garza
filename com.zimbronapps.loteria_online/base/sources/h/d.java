package H;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements F {
    public final Qa.p a;
    public long b = n1.c.b(0, 0, 0, 0, 15, null);
    public float c;
    public E d;

    public d(Qa.p pVar) {
        this.a = pVar;
    }

    public E a(n1.d dVar, long j) {
        if (this.d != null && n1.b.f(this.b, j) && this.c == dVar.getDensity()) {
            E e = this.d;
            kotlin.jvm.internal.t.d(e);
            return e;
        }
        this.b = j;
        this.c = dVar.getDensity();
        E e2 = (E) this.a.invoke(dVar, n1.b.a(j));
        this.d = e2;
        return e2;
    }
}
