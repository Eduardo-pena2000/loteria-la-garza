package z1;

import java.util.Iterator;
import y1.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class i extends d {

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

    public i(y1.g gVar) {
        super(gVar, g.d.HORIZONTAL_CHAIN);
    }

    public void apply() {
        Iterator it = this.o0.iterator();
        while (it.hasNext()) {
            this.m0.d(it.next()).u();
        }
        Iterator it2 = this.o0.iterator();
        y1.a aVar = null;
        y1.a aVar2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            y1.a d = this.m0.d(next);
            if (aVar2 == null) {
                Object obj = this.O;
                if (obj != null) {
                    d.i0(obj).J(this.m).L(this.s);
                } else {
                    Object obj2 = this.P;
                    if (obj2 != null) {
                        d.h0(obj2).J(this.m).L(this.s);
                    } else {
                        Object obj3 = this.K;
                        if (obj3 != null) {
                            d.i0(obj3).J(this.k).L(this.q);
                        } else {
                            Object obj4 = this.L;
                            if (obj4 != null) {
                                d.h0(obj4).J(this.k).L(this.q);
                            } else {
                                String obj5 = d.getKey().toString();
                                d.i0(y1.g.k).K(Float.valueOf(B0(obj5))).M(Float.valueOf(A0(obj5)));
                            }
                        }
                    }
                }
                aVar2 = d;
            }
            if (aVar != null) {
                String obj6 = aVar.getKey().toString();
                String obj7 = d.getKey().toString();
                aVar.A(d.getKey()).K(Float.valueOf(z0(obj6))).M(Float.valueOf(y0(obj6)));
                d.h0(aVar.getKey()).K(Float.valueOf(B0(obj7))).M(Float.valueOf(A0(obj7)));
            }
            float C0 = C0(next.toString());
            if (C0 != -1.0f) {
                d.a0(C0);
            }
            aVar = d;
        }
        if (aVar != null) {
            Object obj8 = this.Q;
            if (obj8 != null) {
                aVar.A(obj8).J(this.n).L(this.t);
            } else {
                Object obj9 = this.R;
                if (obj9 != null) {
                    aVar.z(obj9).J(this.n).L(this.t);
                } else {
                    Object obj10 = this.M;
                    if (obj10 != null) {
                        aVar.A(obj10).J(this.l).L(this.r);
                    } else {
                        Object obj11 = this.N;
                        if (obj11 != null) {
                            aVar.z(obj11).J(this.l).L(this.r);
                        } else {
                            String obj12 = aVar.getKey().toString();
                            aVar.z(y1.g.k).K(Float.valueOf(z0(obj12))).M(Float.valueOf(y0(obj12)));
                        }
                    }
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f = this.q0;
        if (f != 0.5f) {
            aVar2.F(f);
        }
        int i = a.a[this.w0.ordinal()];
        if (i == 1) {
            aVar2.Z(0);
        } else if (i == 2) {
            aVar2.Z(1);
        } else {
            if (i != 3) {
                return;
            }
            aVar2.Z(2);
        }
    }
}
