package J3;

import P2.z;
import o3.I;
import o3.O;
import o3.p;
import o3.q;
import o3.r;
import o3.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d implements p {
    public static final u d = new c();
    public r a;
    public i b;
    public boolean c;

    public static /* synthetic */ p[] c() {
        return f();
    }

    private static /* synthetic */ p[] f() {
        return new p[]{new d()};
    }

    public static z h(z zVar) {
        zVar.T(0);
        return zVar;
    }

    public void a(long j, long j2) {
        i iVar = this.b;
        if (iVar != null) {
            iVar.m(j, j2);
        }
    }

    public void b(r rVar) {
        this.a = rVar;
    }

    public boolean d(q qVar) {
        try {
            return i(qVar);
        } catch (M2.z unused) {
            return false;
        }
    }

    public int e(q qVar, I i) {
        P2.a.h(this.a);
        if (this.b == null) {
            if (!i(qVar)) {
                throw M2.z.a("Failed to determine bitstream type", null);
            }
            qVar.f();
        }
        if (!this.c) {
            O e = this.a.e(0, 1);
            this.a.s();
            this.b.d(this.a, e);
            this.c = true;
        }
        return this.b.g(qVar, i);
    }

    public final boolean i(q qVar) {
        f fVar = new f();
        if (fVar.a(qVar, true) && (fVar.b & 2) == 2) {
            int min = Math.min(fVar.i, 8);
            z zVar = new z(min);
            qVar.p(zVar.e(), 0, min);
            if (b.p(h(zVar))) {
                this.b = new b();
            } else if (j.r(h(zVar))) {
                this.b = new j();
            } else if (h.o(h(zVar))) {
                this.b = new h();
            }
            return true;
        }
        return false;
    }

    public void release() {
    }
}
