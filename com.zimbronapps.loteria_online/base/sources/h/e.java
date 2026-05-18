package H;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements I.g {
    public final I a;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, List list) {
            super(1);
            this.a = z;
            this.b = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Integer invoke(int i) {
            return Integer.valueOf(this.a ? ((k) this.b.get(i)).g() : ((k) this.b.get(i)).b());
        }
    }

    public e(I i) {
        this.a = i;
    }

    public Object a(Qa.p pVar, Ga.e eVar) {
        Object f = C.y.f(this.a, null, pVar, eVar, 1, null);
        return f == Ha.c.f() ? f : Ca.I.a;
    }

    public int b() {
        k kVar = (k) Da.D.q0(this.a.s().h());
        if (kVar != null) {
            return kVar.getIndex();
        }
        return 0;
    }

    public float c(int i) {
        Object obj;
        s s = this.a.s();
        if (s.h().isEmpty()) {
            return 0.0f;
        }
        List h = s.h();
        int size = h.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = h.get(i2);
            if (((k) obj).getIndex() == i) {
                break;
            }
            i2++;
        }
        if (((k) obj) != null) {
            return s.getOrientation() == C.q.Vertical ? n1.n.l(r5.n()) : n1.n.k(r5.n());
        }
        int B = this.a.B();
        return (f(s) * (((i - e()) + ((B - 1) * (i < e() ? -1 : 1))) / B)) - g();
    }

    public void d(C.u uVar, int i, int i2) {
        this.a.I(i, i2, true);
    }

    public int e() {
        return this.a.o();
    }

    public final int f(s sVar) {
        boolean z = sVar.getOrientation() == C.q.Vertical;
        List h = sVar.h();
        a aVar = new a(z, h);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < h.size()) {
            int intValue = ((Number) aVar.invoke(Integer.valueOf(i))).intValue();
            if (intValue == -1) {
                i++;
            } else {
                int i4 = 0;
                while (i < h.size() && ((Number) aVar.invoke(Integer.valueOf(i))).intValue() == intValue) {
                    i4 = Math.max(i4, z ? n1.r.f(((k) h.get(i)).a()) : n1.r.g(((k) h.get(i)).a()));
                    i++;
                }
                i2 += i4;
                i3++;
            }
        }
        return (i2 / i3) + sVar.g();
    }

    public int g() {
        return this.a.p();
    }
}
