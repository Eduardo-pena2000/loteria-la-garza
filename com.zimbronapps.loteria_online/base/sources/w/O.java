package W;

import A.N;
import E.o;
import b0.h2;
import cb.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class o implements N {
    public final boolean a;
    public final u b;

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ h2 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h2 h2Var) {
            super(0);
            this.a = h2Var;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return (g) this.a.getValue();
        }
    }

    public o(boolean z, h2 h2Var) {
        this.a = z;
        this.b = new u(z, new a(h2Var));
    }

    public abstract void b(o.b bVar, O o);

    public final void d(x0.f fVar, float f, long j) {
        this.b.b(fVar, Float.isNaN(f) ? i.a(fVar, this.a, fVar.e()) : fVar.j1(f), j);
    }

    public abstract void f(o.b bVar);

    public final void h(E.j jVar, O o) {
        this.b.c(jVar, o);
    }
}
