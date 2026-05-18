package T2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b1 implements y0 {
    public final P2.c a;
    public boolean b;
    public long c;
    public long d;
    public M2.B e = M2.B.d;

    public b1(P2.c cVar) {
        this.a = cVar;
    }

    public long H() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long b = this.a.b() - this.d;
        M2.B b2 = this.e;
        return j + (b2.a == 1.0f ? P2.K.K0(b) : b2.a(b));
    }

    public void a(long j) {
        this.c = j;
        if (this.b) {
            this.d = this.a.b();
        }
    }

    public void b() {
        if (this.b) {
            return;
        }
        this.d = this.a.b();
        this.b = true;
    }

    public M2.B c() {
        return this.e;
    }

    public void d(M2.B b) {
        if (this.b) {
            a(H());
        }
        this.e = b;
    }

    public void e() {
        if (this.b) {
            a(H());
            this.b = false;
        }
    }
}
