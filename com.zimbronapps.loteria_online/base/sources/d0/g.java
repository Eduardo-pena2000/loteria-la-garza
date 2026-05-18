package d0;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import w.P;
import w.Q;
import w.d0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {
    public static final void a(P p, Object obj, Object obj2) {
        int n = p.n(obj);
        boolean z = n < 0;
        Object obj3 = z ? null : p.c[n];
        if (obj3 != null) {
            if (obj3 instanceof Q) {
                t.e(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                ((Q) obj3).h(obj2);
            } else if (obj3 != obj2) {
                Q q = new Q(0, 1, null);
                t.e(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                q.h(obj3);
                q.h(obj2);
                obj2 = q;
            }
            obj2 = obj3;
        }
        if (!z) {
            p.c[n] = obj2;
            return;
        }
        int i = ~n;
        p.b[i] = obj;
        p.c[i] = obj2;
    }

    public static final void b(P p) {
        p.k();
    }

    public static /* synthetic */ P d(P p, int i, k kVar) {
        if ((i & 1) != 0) {
            p = d0.b();
        }
        return c(p);
    }

    public static final boolean e(P p, Object obj) {
        return p.c(obj);
    }

    public static final int f(P p) {
        return p.g();
    }

    public static final boolean g(P p, Object obj, Object obj2) {
        Object e = p.e(obj);
        if (e == null) {
            return false;
        }
        if (!(e instanceof Q)) {
            if (!t.c(e, obj2)) {
                return false;
            }
            p.u(obj);
            return true;
        }
        Q q = (Q) e;
        boolean y = q.y(obj2);
        if (y && q.d()) {
            p.u(obj);
        }
        return y;
    }

    public static final void h(P p, Object obj) {
        boolean z;
        long[] jArr = p.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = p.b[i4];
                        Object obj3 = p.c[i4];
                        if (obj3 instanceof Q) {
                            t.e(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            Q q = (Q) obj3;
                            q.y(obj);
                            z = q.d();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            p.v(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void i(P p, Object obj, Object obj2) {
        p.x(obj, obj2);
    }

    public static P c(P p) {
        return p;
    }
}
