package eb;

import hb.A;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class m extends A {
    public final e e;
    public final /* synthetic */ AtomicReferenceArray f;

    public m(long j, m mVar, e eVar, int i) {
        super(j, mVar, i);
        this.e = eVar;
        this.f = new AtomicReferenceArray(f.b * 2);
    }

    public final Object A(int i) {
        return z().get(i * 2);
    }

    public final Object B(int i) {
        return z().get((i * 2) + 1);
    }

    public final void C(int i, boolean z) {
        if (z) {
            y().r1((this.c * f.b) + i);
        }
        t();
    }

    public final Object D(int i) {
        Object A = A(i);
        w(i);
        return A;
    }

    public final void E(int i, Object obj) {
        z().set(i * 2, obj);
    }

    public final void F(int i, Object obj) {
        z().set((i * 2) + 1, obj);
    }

    public final void G(int i, Object obj) {
        E(i, obj);
    }

    public int r() {
        return f.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:
    
        w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0068, code lost:
    
        r4 = y().b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:
    
        hb.w.a(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(int r4, java.lang.Throwable r5, Ga.i r6) {
        /*
            r3 = this;
            int r5 = eb.f.b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.A(r4)
        Le:
            java.lang.Object r1 = r3.B(r4)
            boolean r2 = r1 instanceof cb.g1
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof eb.z
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            hb.D r2 = eb.f.j()
            if (r1 == r2) goto L63
            hb.D r2 = eb.f.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            hb.D r2 = eb.f.p()
            if (r1 == r2) goto Le
            hb.D r2 = eb.f.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            hb.D r4 = eb.f.f()
            if (r1 == r4) goto L62
            hb.D r4 = eb.f.d
            if (r1 != r4) goto L40
            goto L62
        L40:
            hb.D r4 = eb.f.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.w(r4)
            if (r0 == 0) goto L73
            eb.e r4 = r3.y()
            Qa.l r4 = r4.b
            if (r4 == 0) goto L73
            hb.w.a(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            hb.D r2 = eb.f.j()
            goto L7f
        L7b:
            hb.D r2 = eb.f.i()
        L7f:
            boolean r1 = r3.v(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.w(r4)
            r1 = r0 ^ 1
            r3.C(r4, r1)
            if (r0 == 0) goto L9a
            eb.e r4 = r3.y()
            Qa.l r4 = r4.b
            if (r4 == 0) goto L9a
            hb.w.a(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.m.s(int, java.lang.Throwable, Ga.i):void");
    }

    public final boolean v(int i, Object obj, Object obj2) {
        return l.a(z(), (i * 2) + 1, obj, obj2);
    }

    public final void w(int i) {
        E(i, null);
    }

    public final Object x(int i, Object obj) {
        return z().getAndSet((i * 2) + 1, obj);
    }

    public final e y() {
        e eVar = this.e;
        kotlin.jvm.internal.t.d(eVar);
        return eVar;
    }

    public final /* synthetic */ AtomicReferenceArray z() {
        return this.f;
    }
}
