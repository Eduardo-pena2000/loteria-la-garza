package y4;

import Ca.I;
import Ca.t;
import Ha.c;
import Ia.l;
import Qa.p;
import S1.b;
import cb.B0;
import cb.O;
import cb.P;
import cb.Q;
import cb.i;
import cb.t0;
import fb.e;
import fb.f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public final ReentrantLock a = new ReentrantLock();
    public final Map b = new LinkedHashMap();

    public static final class a extends l implements p {
        public int a;
        public final /* synthetic */ e b;
        public final /* synthetic */ b c;

        public static final class a implements f {
            public final /* synthetic */ b a;

            public a(b bVar) {
                this.a = bVar;
            }

            public final Object emit(Object obj, Ga.e eVar) {
                this.a.accept(obj);
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, b bVar, Ga.e eVar2) {
            super(2, eVar2);
            this.b = eVar;
            this.c = bVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new a(this.b, this.c, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.a;
            if (i == 0) {
                t.b(obj);
                e eVar = this.b;
                a aVar = new a(this.c);
                this.a = 1;
                if (eVar.collect(aVar, this) == f) {
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

    public final void a(Executor executor, b bVar, e eVar) {
        kotlin.jvm.internal.t.g(executor, "executor");
        kotlin.jvm.internal.t.g(bVar, "consumer");
        kotlin.jvm.internal.t.g(eVar, "flow");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (this.b.get(bVar) == null) {
                this.b.put(bVar, i.d(P.a(t0.b(executor)), (Ga.i) null, (Q) null, new a(eVar, bVar, null), 3, (Object) null));
            }
            I i = I.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(b bVar) {
        kotlin.jvm.internal.t.g(bVar, "consumer");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            B0 b0 = (B0) this.b.get(bVar);
            if (b0 != null) {
                B0.a.b(b0, (CancellationException) null, 1, (Object) null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
