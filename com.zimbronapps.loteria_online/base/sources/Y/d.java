package y;

import Ca.I;
import androidx.compose.ui.layout.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements M0.B {
    public final g a;
    public boolean b;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(1);
            this.a = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                q.a.P(aVar, (androidx.compose.ui.layout.q) list.get(i), 0, 0, 0.0f, 4, null);
            }
        }
    }

    public d(g gVar) {
        this.a = gVar;
    }

    public int maxIntrinsicHeight(M0.m mVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((M0.l) list.get(0)).J(i));
            int p = Da.v.p(list);
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

    public int maxIntrinsicWidth(M0.m mVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((M0.l) list.get(0)).B0(i));
            int p = Da.v.p(list);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v24 */
    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((M0.A) list.get(i)).C0(j));
        }
        androidx.compose.ui.layout.q qVar = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int W0 = ((androidx.compose.ui.layout.q) obj).W0();
            int p = Da.v.p(arrayList);
            if (1 <= p) {
                int i2 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i2);
                    int W02 = ((androidx.compose.ui.layout.q) obj2).W0();
                    if (W0 < W02) {
                        obj = obj2;
                        W0 = W02;
                    }
                    if (i2 == p) {
                        break;
                    }
                    i2++;
                }
            }
        }
        androidx.compose.ui.layout.q qVar2 = (androidx.compose.ui.layout.q) obj;
        int W03 = qVar2 != null ? qVar2.W0() : 0;
        if (!arrayList.isEmpty()) {
            ?? r12 = arrayList.get(0);
            int P0 = ((androidx.compose.ui.layout.q) r12).P0();
            int p2 = Da.v.p(arrayList);
            if (1 <= p2) {
                int i3 = 1;
                boolean z = r12;
                while (true) {
                    Object obj3 = arrayList.get(i3);
                    int P02 = ((androidx.compose.ui.layout.q) obj3).P0();
                    r12 = z;
                    if (P0 < P02) {
                        r12 = obj3;
                        P0 = P02;
                    }
                    if (i3 == p2) {
                        break;
                    }
                    i3++;
                    z = r12;
                }
            }
            qVar = r12;
        }
        androidx.compose.ui.layout.q qVar3 = qVar;
        int P03 = qVar3 != null ? qVar3.P0() : 0;
        if (lVar.h0()) {
            this.b = true;
            this.a.a().setValue(n1.r.b(n1.s.a(W03, P03)));
        } else if (!this.b) {
            this.a.a().setValue(n1.r.b(n1.s.a(W03, P03)));
        }
        return androidx.compose.ui.layout.l.O0(lVar, W03, P03, null, new a(arrayList), 4, null);
    }

    public int minIntrinsicHeight(M0.m mVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((M0.l) list.get(0)).q0(i));
            int p = Da.v.p(list);
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

    public int minIntrinsicWidth(M0.m mVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((M0.l) list.get(0)).A0(i));
            int p = Da.v.p(list);
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
