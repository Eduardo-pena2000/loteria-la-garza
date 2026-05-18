package G4;

import Ca.I;
import cb.B0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k implements x7.e {
    public final B0 a;
    public final R4.c b;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.a;
        }

        public final void invoke(Throwable th) {
            if (th == null) {
                if (!k.a(k.this).isDone()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                if (th instanceof CancellationException) {
                    k.a(k.this).cancel(true);
                    return;
                }
                R4.c a = k.a(k.this);
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                a.p(th);
            }
        }
    }

    public k(B0 b0, R4.c cVar) {
        kotlin.jvm.internal.t.g(b0, "job");
        kotlin.jvm.internal.t.g(cVar, "underlying");
        this.a = b0;
        this.b = cVar;
        b0.invokeOnCompletion(new a());
    }

    public static final /* synthetic */ R4.c a(k kVar) {
        return kVar.b;
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.b.addListener(runnable, executor);
    }

    public final void b(Object obj) {
        this.b.o(obj);
    }

    public boolean cancel(boolean z) {
        return this.b.cancel(z);
    }

    public Object get() {
        return this.b.get();
    }

    public boolean isCancelled() {
        return this.b.isCancelled();
    }

    public boolean isDone() {
        return this.b.isDone();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k(B0 b0, R4.c cVar, int i, kotlin.jvm.internal.k kVar) {
        if ((i & 2) != 0) {
            cVar = R4.c.s();
            kotlin.jvm.internal.t.f(cVar, "create()");
        }
        this(b0, cVar);
    }
}
