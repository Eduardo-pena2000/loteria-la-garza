package I0;

import androidx.compose.ui.e;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public final M0.p a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final w.L f = new w.L(0, 1, null);
    public final n g = new n();
    public final w.I h = new w.I(10);

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ e.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e.c cVar) {
            super(0);
            this.b = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            e.a(e.this, this.b);
        }
    }

    public e(M0.p pVar) {
        this.a = pVar;
    }

    public static final /* synthetic */ void a(e eVar, e.c cVar) {
        eVar.g(cVar);
    }

    public final void b(long j, List list, boolean z) {
        Object obj;
        n nVar = this.g;
        this.h.g();
        int size = list.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            e.c cVar = (e.c) list.get(i);
            if (cVar.isAttached()) {
                cVar.setDetachedListener$ui_release(new a(cVar));
                if (z2) {
                    d0.c g = nVar.g();
                    Object[] objArr = g.a;
                    int m = g.m();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= m) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i2];
                        if (kotlin.jvm.internal.t.c(((m) obj).k(), cVar)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    m mVar = (m) obj;
                    if (mVar != null) {
                        mVar.n();
                        mVar.l().a(j);
                        w.I i3 = this.h;
                        Object b = i3.b(j);
                        if (b == null) {
                            b = new w.L(0, 1, null);
                            i3.o(j, b);
                        }
                        ((w.L) b).k(mVar);
                        nVar = mVar;
                    } else {
                        z2 = false;
                    }
                }
                m mVar2 = new m(cVar);
                mVar2.l().a(j);
                w.I i4 = this.h;
                Object b2 = i4.b(j);
                if (b2 == null) {
                    b2 = new w.L(0, 1, null);
                    i4.o(j, b2);
                }
                ((w.L) b2).k(mVar2);
                nVar.g().b(mVar2);
                nVar = mVar2;
            }
        }
        if (!z) {
            return;
        }
        w.I i5 = this.h;
        long[] jArr = i5.b;
        Object[] objArr2 = i5.c;
        long[] jArr2 = i5.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j2 = jArr2[i6];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j2) < 128) {
                        int i9 = (i6 << 3) + i8;
                        f(jArr[i9], (w.L) objArr2[i9]);
                    }
                    j2 >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    public final void c() {
        if (this.d) {
            this.d = true;
        } else {
            this.g.c();
        }
    }

    public final boolean d(g gVar, boolean z) {
        if (!this.g.a(gVar.b(), this.a, gVar, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        boolean f = this.g.f(gVar.b(), this.a, gVar, z);
        if (!this.g.e(gVar) && !f) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            int d = this.f.d();
            for (int i = 0; i < d; i++) {
                g((e.c) this.f.c(i));
            }
            this.f.n();
        }
        if (this.c) {
            this.c = false;
            e();
        }
        if (this.d) {
            this.d = false;
            c();
        }
        return z2;
    }

    public final void e() {
        if (this.b) {
            this.c = true;
        } else {
            this.g.d();
            c();
        }
    }

    public final void f(long j, w.L l) {
        this.g.h(j, l);
    }

    public final void g(e.c cVar) {
        if (!this.b) {
            this.g.i(cVar);
        } else {
            this.e = true;
            this.f.k(cVar);
        }
    }
}
