package J;

import b0.C0;
import b0.U1;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b extends C {
    public static final c L = new c(null);
    public static final k0.v M = k0.b.b(a.a, b.a);
    public C0 K;

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public static final a a = new a();

        public a() {
            super(2);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(k0.z zVar, b bVar) {
            return Da.v.q(new Object[]{Integer.valueOf(bVar.v()), Float.valueOf(Wa.n.l(bVar.w(), -0.5f, 0.5f)), Integer.valueOf(bVar.F())});
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public static final b a = new b();

        public static final class a extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ List a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list) {
                super(0);
                this.a = list;
            }

            public final Integer invoke() {
                Object obj = this.a.get(2);
                kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            }
        }

        public b() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(List list) {
            Object obj = list.get(0);
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new b(intValue, ((Float) obj2).floatValue(), new a(list));
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final k0.v a() {
            return b.l0();
        }

        public c() {
        }
    }

    public b(int i, float f, Qa.a aVar) {
        super(i, f);
        this.K = U1.i(aVar, null, 2, null);
    }

    public static final /* synthetic */ k0.v l0() {
        return M;
    }

    public int F() {
        return ((Number) ((Qa.a) this.K.getValue()).invoke()).intValue();
    }

    public final C0 m0() {
        return this.K;
    }
}
