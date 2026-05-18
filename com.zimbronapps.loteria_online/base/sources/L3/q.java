package L3;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class q extends S2.g implements k {
    public k e;
    public long f;

    public int a(long j) {
        return ((k) P2.a.e(this.e)).a(j - this.f);
    }

    public List b(long j) {
        return ((k) P2.a.e(this.e)).b(j - this.f);
    }

    public long c(int i) {
        return ((k) P2.a.e(this.e)).c(i) + this.f;
    }

    public int d() {
        return ((k) P2.a.e(this.e)).d();
    }

    public void f() {
        super.f();
        this.e = null;
    }

    public void p(long j, k kVar, long j2) {
        this.b = j;
        this.e = kVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f = j;
    }
}
