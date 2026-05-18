package M0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements A {
    public final l a;
    public final n b;
    public final o c;

    public h(l lVar, n nVar, o oVar) {
        this.a = lVar;
        this.b = nVar;
        this.c = oVar;
    }

    public int A0(int i) {
        return this.a.A0(i);
    }

    public int B0(int i) {
        return this.a.B0(i);
    }

    public androidx.compose.ui.layout.q C0(long j) {
        if (this.c == o.a) {
            return new j(this.b == n.b ? this.a.B0(n1.b.k(j)) : this.a.A0(n1.b.k(j)), n1.b.g(j) ? n1.b.k(j) : 32767);
        }
        return new j(n1.b.h(j) ? n1.b.l(j) : 32767, this.b == n.b ? this.a.J(n1.b.l(j)) : this.a.q0(n1.b.l(j)));
    }

    public int J(int i) {
        return this.a.J(i);
    }

    public Object j() {
        return this.a.j();
    }

    public int q0(int i) {
        return this.a.q0(i);
    }
}
