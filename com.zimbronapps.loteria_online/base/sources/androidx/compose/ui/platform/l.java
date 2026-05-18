package androidx.compose.ui.platform;

import Ca.I;
import Ca.t;
import P0.n0;
import Qa.p;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.k;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import b0.H;
import b0.b0;
import b0.c1;
import b0.m;
import b0.w;
import b0.x;
import cb.O;
import java.util.Set;
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l implements x, o {
    public final AndroidComposeView a;
    public final x b;
    public boolean c;
    public androidx.lifecycle.k d;
    public p e = n0.a.a();

    public static final class a extends u implements Qa.l {
        public final /* synthetic */ p b;

        public static final class a extends u implements p {
            public final /* synthetic */ l a;
            public final /* synthetic */ p b;

            public static final class a extends Ia.l implements p {
                public int a;
                public final /* synthetic */ l b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(l lVar, Ga.e eVar) {
                    super(2, eVar);
                    this.b = lVar;
                }

                public final Ga.e create(Object obj, Ga.e eVar) {
                    return new a(this.b, eVar);
                }

                public final Object invoke(O o, Ga.e eVar) {
                    return create(o, eVar).invokeSuspend(I.a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f = Ha.c.f();
                    int i = this.a;
                    if (i == 0) {
                        t.b(obj);
                        AndroidComposeView F = this.b.F();
                        this.a = 1;
                        if (F.n0(this) == f) {
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
                public final /* synthetic */ l b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(l lVar, Ga.e eVar) {
                    super(2, eVar);
                    this.b = lVar;
                }

                public final Ga.e create(Object obj, Ga.e eVar) {
                    return new b(this.b, eVar);
                }

                public final Object invoke(O o, Ga.e eVar) {
                    return create(o, eVar).invokeSuspend(I.a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f = Ha.c.f();
                    int i = this.a;
                    if (i == 0) {
                        t.b(obj);
                        AndroidComposeView F = this.b.F();
                        this.a = 1;
                        if (F.o0(this) == f) {
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

            public static final class c extends u implements p {
                public final /* synthetic */ l a;
                public final /* synthetic */ p b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(l lVar, p pVar) {
                    super(2);
                    this.a = lVar;
                    this.b = pVar;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((m) obj, ((Number) obj2).intValue());
                    return I.a;
                }

                public final void invoke(m mVar, int i) {
                    if (!mVar.o((i & 3) != 2, i & 1)) {
                        mVar.M();
                        return;
                    }
                    if (w.L()) {
                        w.U(-280240369, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:139)");
                    }
                    AndroidCompositionLocals_androidKt.a(this.a.F(), this.b, mVar, 0);
                    if (w.L()) {
                        w.T();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, p pVar) {
                super(2);
                this.a = lVar;
                this.b = pVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((m) obj, ((Number) obj2).intValue());
                return I.a;
            }

            public final void invoke(m mVar, int i) {
                if (!mVar.o((i & 3) != 2, i & 1)) {
                    mVar.M();
                    return;
                }
                if (w.L()) {
                    w.U(1330788943, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:123)");
                }
                Object tag = this.a.F().getTag(o0.l.K);
                Set set = V.n(tag) ? (Set) tag : null;
                if (set == null) {
                    View parent = this.a.F().getParent();
                    View view = parent instanceof View ? parent : null;
                    Object tag2 = view != null ? view.getTag(o0.l.K) : null;
                    set = V.n(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(mVar.D());
                    mVar.y();
                }
                AndroidComposeView F = this.a.F();
                boolean E = mVar.E(this.a);
                l lVar = this.a;
                Object C = mVar.C();
                if (E || C == m.a.a()) {
                    C = new a(lVar, null);
                    mVar.t(C);
                }
                b0.d(F, (p) C, mVar, 0);
                AndroidComposeView F2 = this.a.F();
                boolean E2 = mVar.E(this.a);
                l lVar2 = this.a;
                Object C2 = mVar.C();
                if (E2 || C2 == m.a.a()) {
                    C2 = new b(lVar2, null);
                    mVar.t(C2);
                }
                b0.d(F2, (p) C2, mVar, 0);
                H.c(n0.o.c().d(set), j0.i.d(-280240369, true, new c(this.a, this.b), mVar, 54), mVar, c1.i | 48);
                if (w.L()) {
                    w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar) {
            super(1);
            this.b = pVar;
        }

        public final void a(AndroidComposeView.b bVar) {
            if (l.B(l.this)) {
                return;
            }
            androidx.lifecycle.k lifecycle = bVar.a().getLifecycle();
            l.D(l.this, this.b);
            if (l.m(l.this) == null) {
                l.C(l.this, lifecycle);
                lifecycle.addObserver(l.this);
            } else if (lifecycle.getCurrentState().b(k.b.c)) {
                l.this.E().y(j0.i.b(1330788943, true, new a(l.this, this.b)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AndroidComposeView.b) obj);
            return I.a;
        }
    }

    public l(AndroidComposeView androidComposeView, x xVar) {
        this.a = androidComposeView;
        this.b = xVar;
    }

    public static final /* synthetic */ boolean B(l lVar) {
        return lVar.c;
    }

    public static final /* synthetic */ void C(l lVar, androidx.lifecycle.k kVar) {
        lVar.d = kVar;
    }

    public static final /* synthetic */ void D(l lVar, p pVar) {
        lVar.e = pVar;
    }

    public static final /* synthetic */ androidx.lifecycle.k m(l lVar) {
        return lVar.d;
    }

    public final x E() {
        return this.b;
    }

    public final AndroidComposeView F() {
        return this.a;
    }

    public void dispose() {
        if (!this.c) {
            this.c = true;
            this.a.getView().setTag(o0.l.L, (Object) null);
            androidx.lifecycle.k kVar = this.d;
            if (kVar != null) {
                kVar.removeObserver(this);
            }
        }
        this.b.dispose();
    }

    public void onStateChanged(r rVar, k.a aVar) {
        if (aVar == k.a.ON_DESTROY) {
            dispose();
        } else {
            if (aVar != k.a.ON_CREATE || this.c) {
                return;
            }
            y(this.e);
        }
    }

    public void y(p pVar) {
        this.a.setOnViewTreeOwnersAvailable(new a(pVar));
    }
}
