package d1;

import J1.h;
import android.content.Context;
import android.graphics.Typeface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {

    public static final class a extends h.e {
        public final /* synthetic */ cb.n a;
        public final /* synthetic */ f0 b;

        public a(cb.n nVar, f0 f0Var) {
            this.a = nVar;
            this.b = f0Var;
        }

        public void h(int i) {
            this.a.cancel(new IllegalStateException("Unable to load font " + this.b + " (reason=" + i + ')'));
        }

        public void i(Typeface typeface) {
            this.a.resumeWith(Ca.s.b(typeface));
        }
    }

    public static final /* synthetic */ Typeface a(f0 f0Var, Context context) {
        return c(f0Var, context);
    }

    public static final /* synthetic */ Object b(f0 f0Var, Context context, Ga.e eVar) {
        return d(f0Var, context, eVar);
    }

    public static final Typeface c(f0 f0Var, Context context) {
        Typeface f = J1.h.f(context, f0Var.d());
        kotlin.jvm.internal.t.d(f);
        return f;
    }

    public static final Object d(f0 f0Var, Context context, Ga.e eVar) {
        cb.p pVar = new cb.p(Ha.b.c(eVar), 1);
        pVar.E();
        J1.h.h(context, f0Var.d(), new a(pVar, f0Var), null);
        Object w = pVar.w();
        if (w == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return w;
    }
}
