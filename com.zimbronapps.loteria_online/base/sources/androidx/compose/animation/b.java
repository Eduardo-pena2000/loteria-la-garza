package androidx.compose.animation;

import Ca.I;
import Da.v;
import M0.B;
import M0.m;
import Qa.l;
import androidx.compose.ui.layout.q;
import java.util.List;
import kotlin.jvm.internal.u;
import n1.n;
import n1.s;
import n1.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements B {
    public final d a;

    public static final class a extends u implements l {
        public final /* synthetic */ q[] a;
        public final /* synthetic */ b b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q[] qVarArr, b bVar, int i, int i2) {
            super(1);
            this.a = qVarArr;
            this.b = bVar;
            this.c = i;
            this.d = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            q[] qVarArr = this.a;
            b bVar = this.b;
            int i = this.c;
            int i2 = this.d;
            for (q qVar : qVarArr) {
                if (qVar != null) {
                    long a = bVar.a().g().a(s.a(qVar.W0(), qVar.P0()), s.a(i, i2), t.a);
                    q.a.P(aVar, qVar, n.k(a), n.l(a), 0.0f, 4, null);
                }
            }
        }
    }

    public b(d dVar) {
        this.a = dVar;
    }

    public final d a() {
        return this.a;
    }

    public int maxIntrinsicHeight(m mVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((M0.l) list.get(0)).J(i));
            int p = v.p(list);
            int i2 = 1;
            if (1 <= p) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((M0.l) list.get(i2)).J(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == p) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public int maxIntrinsicWidth(m mVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((M0.l) list.get(0)).B0(i));
            int p = v.p(list);
            int i2 = 1;
            if (1 <= p) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((M0.l) list.get(i2)).B0(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == p) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l r21, java.util.List r22, long r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.b.measure-3p2s80s(androidx.compose.ui.layout.l, java.util.List, long):M0.C");
    }

    public int minIntrinsicHeight(m mVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((M0.l) list.get(0)).q0(i));
            int p = v.p(list);
            int i2 = 1;
            if (1 <= p) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((M0.l) list.get(i2)).q0(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == p) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public int minIntrinsicWidth(m mVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((M0.l) list.get(0)).A0(i));
            int p = v.p(list);
            int i2 = 1;
            if (1 <= p) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((M0.l) list.get(i2)).A0(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == p) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
