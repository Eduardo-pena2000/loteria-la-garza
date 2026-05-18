package A4;

import Ca.I;
import Ca.t;
import Qa.p;
import android.app.Activity;
import android.content.Context;
import cb.e0;
import eb.v;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i implements f {
    public final m b;
    public final B4.a c;

    public static final class a extends Ia.l implements p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Context d;

        public static final class a extends u implements Qa.a {
            public final /* synthetic */ i a;
            public final /* synthetic */ S1.b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, S1.b bVar) {
                super(0);
                this.a = iVar;
                this.b = bVar;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                i.c(this.a).b(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Ga.e eVar) {
            super(2, eVar);
            this.d = context;
        }

        public static /* synthetic */ void a(v vVar, k kVar) {
            i(vVar, kVar);
        }

        public static final void i(v vVar, k kVar) {
            vVar.i(kVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            a aVar = i.this.new a(this.d, eVar);
            aVar.b = obj;
            return aVar;
        }

        public final Object invoke(v vVar, Ga.e eVar) {
            return create(vVar, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                t.b(obj);
                v vVar = (v) this.b;
                h hVar = new h(vVar);
                i.c(i.this).a(this.d, new c4.k(), hVar);
                a aVar = new a(i.this, hVar);
                this.a = 1;
                if (eb.t.a(vVar, aVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    public static final class b extends Ia.l implements p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Activity d;

        public static final class a extends u implements Qa.a {
            public final /* synthetic */ i a;
            public final /* synthetic */ S1.b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, S1.b bVar) {
                super(0);
                this.a = iVar;
                this.b = bVar;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                i.c(this.a).b(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, Ga.e eVar) {
            super(2, eVar);
            this.d = activity;
        }

        public static /* synthetic */ void a(v vVar, k kVar) {
            i(vVar, kVar);
        }

        private static final void i(v vVar, k kVar) {
            vVar.i(kVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            b bVar = i.this.new b(this.d, eVar);
            bVar.b = obj;
            return bVar;
        }

        public final Object invoke(v vVar, Ga.e eVar) {
            return create(vVar, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                t.b(obj);
                v vVar = (v) this.b;
                j jVar = new j(vVar);
                i.c(i.this).a(this.d, new c4.k(), jVar);
                a aVar = new a(i.this, jVar);
                this.a = 1;
                if (eb.t.a(vVar, aVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    public i(m mVar, B4.a aVar) {
        kotlin.jvm.internal.t.g(mVar, "windowMetricsCalculator");
        kotlin.jvm.internal.t.g(aVar, "windowBackend");
        this.b = mVar;
        this.c = aVar;
    }

    public static final /* synthetic */ B4.a c(i iVar) {
        return iVar.c;
    }

    public fb.e a(Activity activity) {
        kotlin.jvm.internal.t.g(activity, "activity");
        return fb.g.y(fb.g.e(new b(activity, null)), e0.c());
    }

    public fb.e b(Context context) {
        kotlin.jvm.internal.t.g(context, "context");
        return fb.g.y(fb.g.e(new a(context, null)), e0.c());
    }
}
