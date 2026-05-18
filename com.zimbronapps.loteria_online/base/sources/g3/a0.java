package g3;

import g3.w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a0 extends h {
    public static final Void l = null;
    public final w k;

    public a0(w wVar) {
        this.k = wVar;
    }

    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final w.b F(Void r1, w.b bVar) {
        return M(bVar);
    }

    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final long G(Void r1, long j, w.b bVar) {
        return O(j, bVar);
    }

    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int H(Void r1, int i) {
        return Q(i);
    }

    public abstract void S(M2.G g);

    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void J(Void r1, w wVar, M2.G g) {
        S(g);
    }

    public final void U() {
        K(l, this.k);
    }

    public void V() {
        U();
    }

    public void e(M2.u uVar) {
        this.k.e(uVar);
    }

    public M2.u f() {
        return this.k.f();
    }

    public boolean o() {
        return this.k.o();
    }

    public M2.G p() {
        return this.k.p();
    }

    public final void z(R2.x xVar) {
        super.z(xVar);
        V();
    }

    public w.b M(w.b bVar) {
        return bVar;
    }

    public int Q(int i) {
        return i;
    }

    public long O(long j, w.b bVar) {
        return j;
    }
}
