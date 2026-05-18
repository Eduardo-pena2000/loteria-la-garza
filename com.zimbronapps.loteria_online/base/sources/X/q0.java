package X;

import b0.W0;
import b0.z0;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q0 {
    public static final c d = new c(null);
    public static final k0.v e = k0.b.b(a.a, b.a);
    public final z0 a;
    public final z0 b;
    public z0 c;

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public static final a a = new a();

        public a() {
            super(2);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(k0.z zVar, q0 q0Var) {
            return Da.v.q(new Float[]{Float.valueOf(q0Var.e()), Float.valueOf(q0Var.d()), Float.valueOf(q0Var.c())});
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q0 invoke(List list) {
            return new q0(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final k0.v a() {
            return q0.a();
        }

        public c() {
        }
    }

    public q0(float f, float f2, float f3) {
        this.a = W0.a(f);
        this.b = W0.a(f3);
        this.c = W0.a(f2);
    }

    public static final /* synthetic */ k0.v a() {
        return e;
    }

    public final float b() {
        if (e() == 0.0f) {
            return 0.0f;
        }
        return d() / e();
    }

    public final float c() {
        return this.b.b();
    }

    public final float d() {
        return this.c.b();
    }

    public final float e() {
        return this.a.b();
    }

    public final float f() {
        if (e() == 0.0f) {
            return 0.0f;
        }
        return 1 - (Wa.n.l(e() - c(), e(), 0.0f) / e());
    }

    public final void g(float f) {
        this.b.q(f);
    }

    public final void h(float f) {
        this.c.q(Wa.n.l(f, e(), 0.0f));
    }

    public final void i(float f) {
        this.a.q(f);
    }
}
