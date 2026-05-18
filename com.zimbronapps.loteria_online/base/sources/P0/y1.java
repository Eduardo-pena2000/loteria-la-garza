package P0;

import android.view.View;
import cb.B0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y1 {
    public static final y1 a = new y1();
    public static final AtomicReference b = new AtomicReference(x1.a.c());
    public static final int c = 8;

    public static final class b extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ b0.o1 b;
        public final /* synthetic */ View c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0.o1 o1Var, View view, Ga.e eVar) {
            super(2, eVar);
            this.b = o1Var;
            this.c = view;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new b(this.b, this.c, eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            View view;
            Object f = Ha.c.f();
            int i = this.a;
            try {
                if (i == 0) {
                    Ca.t.b(obj);
                    b0.o1 o1Var = this.b;
                    this.a = 1;
                    if (o1Var.t0(this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                }
                if (z1.f(view) == this.b) {
                    z1.i(this.c, null);
                }
                return Ca.I.a;
            } finally {
                if (z1.f(this.c) == this.b) {
                    z1.i(this.c, null);
                }
            }
        }
    }

    public final b0.o1 a(View view) {
        b0.o1 a2 = ((x1) b.get()).a(view);
        z1.i(view, a2);
        view.addOnAttachStateChangeListener(new a(cb.i.d(cb.u0.a, db.g.b(view.getHandler(), "windowRecomposer cleanup").J(), (cb.Q) null, new b(a2, view, null), 2, (Object) null)));
        return a2;
    }

    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ cb.B0 a;

        public a(cb.B0 b0) {
            this.a = b0;
        }

        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            B0.a.b(this.a, (CancellationException) null, 1, (Object) null);
        }

        public void onViewAttachedToWindow(View view) {
        }
    }
}
