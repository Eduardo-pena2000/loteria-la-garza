package j0;

import Ca.I;
import b0.B1;
import b0.d1;
import b0.g1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.V;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements b {
    public final int a;
    public final boolean b;
    public Object c;
    public d1 d;
    public List e;

    public /* synthetic */ class a extends kotlin.jvm.internal.a implements Qa.p {
        public a(Object obj) {
            super(2, obj, h.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }

        public final void a(b0.m mVar, int i) {
            ((h) ((kotlin.jvm.internal.a) this).receiver).g(mVar, i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }
    }

    public h(int i, boolean z, Object obj) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    public static /* synthetic */ I a(h hVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, b0.m mVar, int i2) {
        return r(hVar, obj, obj2, obj3, obj4, obj5, i, mVar, i2);
    }

    public static /* synthetic */ I b(h hVar, Object obj, Object obj2, Object obj3, int i, b0.m mVar, int i2) {
        return p(hVar, obj, obj2, obj3, i, mVar, i2);
    }

    public static /* synthetic */ I c(h hVar, Object obj, Object obj2, int i, b0.m mVar, int i2) {
        return o(hVar, obj, obj2, i, mVar, i2);
    }

    public static /* synthetic */ I e(h hVar, Object obj, Object obj2, Object obj3, Object obj4, int i, b0.m mVar, int i2) {
        return q(hVar, obj, obj2, obj3, obj4, i, mVar, i2);
    }

    public static /* synthetic */ I f(h hVar, Object obj, int i, b0.m mVar, int i2) {
        return n(hVar, obj, i, mVar, i2);
    }

    public static final I n(h hVar, Object obj, int i, b0.m mVar, int i2) {
        hVar.i(obj, mVar, g1.a(i) | 1);
        return I.a;
    }

    public static final I o(h hVar, Object obj, Object obj2, int i, b0.m mVar, int i2) {
        hVar.j(obj, obj2, mVar, g1.a(i) | 1);
        return I.a;
    }

    public static final I p(h hVar, Object obj, Object obj2, Object obj3, int i, b0.m mVar, int i2) {
        hVar.k(obj, obj2, obj3, mVar, g1.a(i) | 1);
        return I.a;
    }

    public static final I q(h hVar, Object obj, Object obj2, Object obj3, Object obj4, int i, b0.m mVar, int i2) {
        hVar.l(obj, obj2, obj3, obj4, mVar, g1.a(i) | 1);
        return I.a;
    }

    public static final I r(h hVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, b0.m mVar, int i2) {
        hVar.m(obj, obj2, obj3, obj4, obj5, mVar, g1.a(i) | 1);
        return I.a;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return m(obj, obj2, obj3, obj4, obj5, (b0.m) obj6, ((Number) obj7).intValue());
    }

    public Object g(b0.m mVar, int i) {
        b0.m i2 = mVar.i(this.a);
        s(i2);
        int c = i | (i2.U(this) ? i.c(0) : i.f(0));
        Object obj = this.c;
        kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Qa.p) V.e(obj, 2)).invoke(i2, Integer.valueOf(c));
        B1 l = i2.l();
        if (l != null) {
            l.a(new a(this));
        }
        return invoke;
    }

    public Object i(Object obj, b0.m mVar, int i) {
        b0.m i2 = mVar.i(this.a);
        s(i2);
        int c = i2.U(this) ? i.c(1) : i.f(1);
        Object obj2 = this.c;
        kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Qa.q) V.e(obj2, 3)).invoke(obj, i2, Integer.valueOf(c | i));
        B1 l = i2.l();
        if (l != null) {
            l.a(new e(this, obj, i));
        }
        return invoke;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return g((b0.m) obj, ((Number) obj2).intValue());
    }

    public Object j(Object obj, Object obj2, b0.m mVar, int i) {
        b0.m i2 = mVar.i(this.a);
        s(i2);
        int c = i2.U(this) ? i.c(2) : i.f(2);
        Object obj3 = this.c;
        kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Qa.r) V.e(obj3, 4)).invoke(obj, obj2, i2, Integer.valueOf(c | i));
        B1 l = i2.l();
        if (l != null) {
            l.a(new c(this, obj, obj2, i));
        }
        return invoke;
    }

    public Object k(Object obj, Object obj2, Object obj3, b0.m mVar, int i) {
        b0.m i2 = mVar.i(this.a);
        s(i2);
        int c = i2.U(this) ? i.c(3) : i.f(3);
        Object obj4 = this.c;
        kotlin.jvm.internal.t.e(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Qa.s) V.e(obj4, 5)).invoke(obj, obj2, obj3, i2, Integer.valueOf(c | i));
        B1 l = i2.l();
        if (l != null) {
            l.a(new d(this, obj, obj2, obj3, i));
        }
        return invoke;
    }

    public Object l(Object obj, Object obj2, Object obj3, Object obj4, b0.m mVar, int i) {
        b0.m i2 = mVar.i(this.a);
        s(i2);
        int c = i2.U(this) ? i.c(4) : i.f(4);
        Object obj5 = this.c;
        kotlin.jvm.internal.t.e(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Qa.t) V.e(obj5, 6)).invoke(obj, obj2, obj3, obj4, i2, Integer.valueOf(c | i));
        B1 l = i2.l();
        if (l != null) {
            l.a(new g(this, obj, obj2, obj3, obj4, i));
        }
        return invoke;
    }

    public Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, b0.m mVar, int i) {
        b0.m i2 = mVar.i(this.a);
        s(i2);
        int c = i2.U(this) ? i.c(5) : i.f(5);
        Object obj6 = this.c;
        kotlin.jvm.internal.t.e(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object d = ((Qa.u) V.e(obj6, 7)).d(obj, obj2, obj3, obj4, obj5, i2, Integer.valueOf(i | c));
        B1 l = i2.l();
        if (l != null) {
            l.a(new f(this, obj, obj2, obj3, obj4, obj5, i));
        }
        return d;
    }

    public final void s(b0.m mVar) {
        d1 z;
        if (!this.b || (z = mVar.z()) == null) {
            return;
        }
        mVar.L(z);
        if (i.e(this.d, z)) {
            this.d = z;
            return;
        }
        List list = this.e;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            arrayList.add(z);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i.e((d1) list.get(i), z)) {
                list.set(i, z);
                return;
            }
        }
        list.add(z);
    }

    public final void t() {
        if (this.b) {
            d1 d1Var = this.d;
            if (d1Var != null) {
                d1Var.invalidate();
                this.d = null;
            }
            List list = this.e;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((d1) list.get(i)).invalidate();
                }
                list.clear();
            }
        }
    }

    public final void u(Object obj) {
        if (kotlin.jvm.internal.t.c(this.c, obj)) {
            return;
        }
        boolean z = this.c == null;
        this.c = obj;
        if (z) {
            return;
        }
        t();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return i(obj, (b0.m) obj2, ((Number) obj3).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return j(obj, obj2, (b0.m) obj3, ((Number) obj4).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return k(obj, obj2, obj3, (b0.m) obj4, ((Number) obj5).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return l(obj, obj2, obj3, obj4, (b0.m) obj5, ((Number) obj6).intValue());
    }
}
