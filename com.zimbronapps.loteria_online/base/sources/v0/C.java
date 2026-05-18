package V0;

import Ca.I;
import W0.t;
import W0.y;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import cb.N0;
import cb.O;
import cb.P;
import cb.Q;
import java.util.function.Consumer;
import kotlin.jvm.internal.u;
import n1.p;
import v0.s1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements ScrollCaptureCallback {
    public final t a;
    public final p b;
    public final a c;
    public final View d;
    public final O e;
    public final g f;
    public int g;

    public interface a {
        void a();

        void b();
    }

    public static final class b extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ Runnable c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable, Ga.e eVar) {
            super(2, eVar);
            this.c = runnable;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return c.this.new b(this.c, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                g c = c.c(c.this);
                this.a = 1;
                if (c.g(0.0f, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            c.a(c.this).b();
            this.c.run();
            return I.a;
        }
    }

    public static final class c extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ ScrollCaptureSession c;
        public final /* synthetic */ Rect d;
        public final /* synthetic */ Consumer e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, Ga.e eVar) {
            super(2, eVar);
            this.c = scrollCaptureSession;
            this.d = rect;
            this.e = consumer;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return c.this.new c(this.c, this.d, this.e, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                c cVar = c.this;
                ScrollCaptureSession scrollCaptureSession = this.c;
                p d = s1.d(this.d);
                this.a = 1;
                obj = c.d(cVar, scrollCaptureSession, d, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            this.e.accept(s1.a((p) obj));
            return I.a;
        }
    }

    public static final class d extends Ia.d {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public /* synthetic */ Object e;
        public int g;

        public d(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return c.d(c.this, null, null, this);
        }
    }

    public static final class f extends Ia.l implements Qa.p {
        public boolean a;
        public int b;
        public /* synthetic */ float c;

        public f(Ga.e eVar) {
            super(2, eVar);
        }

        public final Object a(float f, Ga.e eVar) {
            return create(Float.valueOf(f), eVar).invokeSuspend(I.a);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            f fVar = c.this.new f(eVar);
            fVar.c = ((Number) obj).floatValue();
            return fVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).floatValue(), (Ga.e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object f = Ha.c.f();
            int i = this.b;
            if (i == 0) {
                Ca.t.b(obj);
                float f2 = this.c;
                Qa.p c = m.c(c.b(c.this));
                if (c == null) {
                    L0.a.c("Required value was null.");
                    throw new Ca.i();
                }
                boolean b = ((W0.j) c.b(c.this).y().h(y.a.O())).b();
                if (b) {
                    f2 = -f2;
                }
                u0.f d = u0.f.d(u0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)));
                this.a = b;
                this.b = 1;
                obj = c.invoke(d, this);
                if (obj == f) {
                    return f;
                }
                z = b;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.a;
                Ca.t.b(obj);
            }
            long u = ((u0.f) obj).u();
            return Ia.b.c(z ? -Float.intBitsToFloat((int) (u & 4294967295L)) : Float.intBitsToFloat((int) (u & 4294967295L)));
        }
    }

    public c(t tVar, p pVar, O o, a aVar, View view) {
        this.a = tVar;
        this.b = pVar;
        this.c = aVar;
        this.d = view;
        this.e = P.h(o, V0.f.a);
        this.f = new g(pVar.e(), new f(null));
    }

    public static final /* synthetic */ a a(c cVar) {
        return cVar.c;
    }

    public static final /* synthetic */ t b(c cVar) {
        return cVar.a;
    }

    public static final /* synthetic */ g c(c cVar) {
        return cVar.f;
    }

    public static final /* synthetic */ Object d(c cVar, ScrollCaptureSession scrollCaptureSession, p pVar, Ga.e eVar) {
        return cVar.e(scrollCaptureSession, pVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.view.ScrollCaptureSession r9, n1.p r10, Ga.e r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.c.e(android.view.ScrollCaptureSession, n1.p, Ga.e):java.lang.Object");
    }

    public void onScrollCaptureEnd(Runnable runnable) {
        cb.i.d(this.e, N0.a, (Q) null, new b(runnable, null), 2, (Object) null);
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        V0.e.b(this.e, cancellationSignal, new c(scrollCaptureSession, rect, consumer, null));
    }

    public void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(s1.a(this.b));
    }

    public void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.d();
        this.g = 0;
        this.c.a();
        runnable.run();
    }

    public static final class e extends u implements Qa.l {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return I.a;
        }

        public final void a(long j) {
        }
    }
}
