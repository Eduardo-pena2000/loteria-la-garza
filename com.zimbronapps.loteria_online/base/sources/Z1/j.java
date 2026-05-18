package z1;

import java.util.Iterator;
import y1.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class j extends d {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.a.values().length];
            a = iArr;
            try {
                iArr[g.a.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.a.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(y1.g gVar) {
        super(gVar, g.d.VERTICAL_CHAIN);
    }

    public void apply() {
        Iterator it = this.o0.iterator();
        while (it.hasNext()) {
            this.m0.d(it.next()).v();
        }
        Iterator it2 = this.o0.iterator();
        y1.a aVar = null;
        y1.a aVar2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            y1.a d = this.m0.d(next);
            if (aVar2 == null) {
                Object obj = this.S;
                if (obj != null) {
                    d.m0(obj).J(this.o).L(this.u);
                } else {
                    Object obj2 = this.T;
                    if (obj2 != null) {
                        d.l0(obj2).J(this.o).L(this.u);
                    } else {
                        String obj3 = d.getKey().toString();
                        d.m0(y1.g.k).K(Float.valueOf(B0(obj3))).M(Float.valueOf(A0(obj3)));
                    }
                }
                aVar2 = d;
            }
            if (aVar != null) {
                String obj4 = aVar.getKey().toString();
                String obj5 = d.getKey().toString();
                aVar.q(d.getKey()).K(Float.valueOf(z0(obj4))).M(Float.valueOf(y0(obj4)));
                d.l0(aVar.getKey()).K(Float.valueOf(B0(obj5))).M(Float.valueOf(A0(obj5)));
            }
            float C0 = C0(next.toString());
            if (C0 != -1.0f) {
                d.d0(C0);
            }
            aVar = d;
        }
        if (aVar != null) {
            Object obj6 = this.V;
            if (obj6 != null) {
                aVar.q(obj6).J(this.p).L(this.v);
            } else {
                Object obj7 = this.W;
                if (obj7 != null) {
                    aVar.p(obj7).J(this.p).L(this.v);
                } else {
                    String obj8 = aVar.getKey().toString();
                    aVar.p(y1.g.k).K(Float.valueOf(z0(obj8))).M(Float.valueOf(y0(obj8)));
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f = this.q0;
        if (f != 0.5f) {
            aVar2.q0(f);
        }
        int i = a.a[this.w0.ordinal()];
        if (i == 1) {
            aVar2.c0(0);
        } else if (i == 2) {
            aVar2.c0(1);
        } else {
            if (i != 3) {
                return;
            }
            aVar2.c0(2);
        }
    }
}
