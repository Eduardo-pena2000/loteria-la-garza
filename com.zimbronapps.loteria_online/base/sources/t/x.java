package T;

import T.k;
import Z0.T0;
import Z0.W0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class x {

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ kotlin.jvm.internal.J a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.internal.J j) {
            super(1);
            this.a = j;
        }

        public final void a(j jVar) {
            if (jVar.c().length() > 0) {
                this.a.a = false;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((j) obj);
            return Ca.I.a;
        }
    }

    public static final /* synthetic */ l1.i a(T0 t0, int i) {
        return b(t0, i);
    }

    public static final l1.i b(T0 t0, int i) {
        return e(t0, i) ? t0.y(i) : t0.c(i);
    }

    public static final w c(T0 t0, int i, int i2, int i3, long j, boolean z, boolean z2) {
        return new D(z2, 1, 1, z ? null : new k(new k.a(b(t0, W0.n(j)), W0.n(j), 1L), new k.a(b(t0, W0.i(j)), W0.i(j), 1L), W0.m(j)), new j(1L, 1, i, i2, i3, t0));
    }

    public static final boolean d(k kVar, w wVar) {
        if (kVar == null || wVar == null) {
            return true;
        }
        if (kVar.e().d() == kVar.c().d()) {
            return kVar.e().c() == kVar.c().c();
        }
        if ((kVar.d() ? kVar.e() : kVar.c()).c() != 0) {
            return false;
        }
        if (wVar.c().l() != (kVar.d() ? kVar.c() : kVar.e()).c()) {
            return false;
        }
        kotlin.jvm.internal.J j = new kotlin.jvm.internal.J();
        j.a = true;
        wVar.k(new a(j));
        return j.a;
    }

    public static final boolean e(T0 t0, int i) {
        if (t0.l().j().length() == 0) {
            return true;
        }
        int q = t0.q(i);
        return (i == 0 || q != t0.q(i + (-1))) && (i == t0.l().j().length() || q != t0.q(i + 1));
    }
}
