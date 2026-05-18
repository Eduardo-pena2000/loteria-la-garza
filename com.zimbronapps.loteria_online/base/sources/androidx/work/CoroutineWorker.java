package androidx.work;

import Ca.I;
import Ca.t;
import G4.d;
import G4.f;
import G4.k;
import Ga.e;
import Ia.h;
import Ia.l;
import Qa.p;
import android.content.Context;
import androidx.work.ListenableWorker;
import cb.A;
import cb.B0;
import cb.E0;
import cb.K;
import cb.O;
import cb.P;
import cb.Q;
import cb.e0;
import cb.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final K coroutineContext;
    private final R4.c future;
    private final A job;

    public static final class a implements Runnable {
        public a() {
        }

        public final void run() {
            if (CoroutineWorker.this.getFuture$work_runtime_ktx_release().isCancelled()) {
                B0.a.b(CoroutineWorker.this.getJob$work_runtime_ktx_release(), (CancellationException) null, 1, (Object) null);
            }
        }
    }

    public static final class b extends l implements p {
        public Object a;
        public int b;
        public final /* synthetic */ k c;
        public final /* synthetic */ CoroutineWorker d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, CoroutineWorker coroutineWorker, e eVar) {
            super(2, eVar);
            this.c = kVar;
            this.d = coroutineWorker;
        }

        public final e create(Object obj, e eVar) {
            return new b(this.c, this.d, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            k kVar;
            Object f = Ha.c.f();
            int i = this.b;
            if (i == 0) {
                t.b(obj);
                k kVar2 = this.c;
                CoroutineWorker coroutineWorker = this.d;
                this.a = kVar2;
                this.b = 1;
                Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                if (foregroundInfo == f) {
                    return f;
                }
                kVar = kVar2;
                obj = foregroundInfo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = (k) this.a;
                t.b(obj);
            }
            kVar.b(obj);
            return I.a;
        }
    }

    public static final class c extends l implements p {
        public int a;

        public c(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return CoroutineWorker.this.new c(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            try {
                if (i == 0) {
                    t.b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.a = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().o((ListenableWorker.a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().p(th);
            }
            return I.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.t.g(context, "appContext");
        kotlin.jvm.internal.t.g(workerParameters, "params");
        this.job = E0.b((B0) null, 1, (Object) null);
        R4.c s = R4.c.s();
        kotlin.jvm.internal.t.f(s, "create()");
        this.future = s;
        s.addListener(new a(), getTaskExecutor().getBackgroundExecutor());
        this.coroutineContext = e0.a();
    }

    @Ca.e
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, e eVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(e eVar);

    public K getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(e eVar) {
        return getForegroundInfo$suspendImpl(this, eVar);
    }

    public final x7.e getForegroundInfoAsync() {
        A b2 = E0.b((B0) null, 1, (Object) null);
        O a2 = P.a(getCoroutineContext().plus(b2));
        k kVar = new k(b2, null, 2, null);
        i.d(a2, (Ga.i) null, (Q) null, new b(kVar, this, null), 3, (Object) null);
        return kVar;
    }

    public final R4.c getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final A getJob$work_runtime_ktx_release() {
        return this.job;
    }

    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(f fVar, e eVar) {
        Object obj;
        x7.e foregroundAsync = setForegroundAsync(fVar);
        kotlin.jvm.internal.t.f(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                obj = foregroundAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            cb.p pVar = new cb.p(Ha.b.c(eVar), 1);
            pVar.E();
            foregroundAsync.addListener(new G4.l(pVar, foregroundAsync), d.INSTANCE);
            obj = pVar.w();
            if (obj == Ha.c.f()) {
                h.c(eVar);
            }
        }
        return obj == Ha.c.f() ? obj : I.a;
    }

    public final Object setProgress(androidx.work.b bVar, e eVar) {
        Object obj;
        x7.e progressAsync = setProgressAsync(bVar);
        kotlin.jvm.internal.t.f(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                obj = progressAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            cb.p pVar = new cb.p(Ha.b.c(eVar), 1);
            pVar.E();
            progressAsync.addListener(new G4.l(pVar, progressAsync), d.INSTANCE);
            obj = pVar.w();
            if (obj == Ha.c.f()) {
                h.c(eVar);
            }
        }
        return obj == Ha.c.f() ? obj : I.a;
    }

    public final x7.e startWork() {
        i.d(P.a(getCoroutineContext().plus(this.job)), (Ga.i) null, (Q) null, new c(null), 3, (Object) null);
        return this.future;
    }
}
