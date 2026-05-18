package M7;

import M7.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class o implements ScheduledExecutorService {
    public final ExecutorService a;
    public final ScheduledExecutorService b;

    public o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.a = executorService;
        this.b = scheduledExecutorService;
    }

    public static /* synthetic */ void C(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.a(e);
            throw e;
        }
    }

    public static /* synthetic */ void M(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    public static /* synthetic */ ScheduledFuture a(o oVar, Callable callable, long j, TimeUnit timeUnit, p.b bVar) {
        return oVar.B(callable, j, timeUnit, bVar);
    }

    public static /* synthetic */ ScheduledFuture b(o oVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, p.b bVar) {
        return oVar.L(runnable, j, j2, timeUnit, bVar);
    }

    public static /* synthetic */ ScheduledFuture d(o oVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, p.b bVar) {
        return oVar.G(runnable, j, j2, timeUnit, bVar);
    }

    public static /* synthetic */ void f(Callable callable, p.b bVar) {
        z(callable, bVar);
    }

    public static /* synthetic */ void h(Runnable runnable, p.b bVar) {
        C(runnable, bVar);
    }

    public static /* synthetic */ void k(o oVar, Runnable runnable, p.b bVar) {
        oVar.E(runnable, bVar);
    }

    public static /* synthetic */ Future m(o oVar, Callable callable, p.b bVar) {
        return oVar.A(callable, bVar);
    }

    public static /* synthetic */ void o(Runnable runnable, p.b bVar) {
        M(runnable, bVar);
    }

    public static /* synthetic */ void r(o oVar, Runnable runnable, p.b bVar) {
        oVar.x(runnable, bVar);
    }

    public static /* synthetic */ void s(Runnable runnable, p.b bVar) {
        v(runnable, bVar);
    }

    public static /* synthetic */ void t(o oVar, Runnable runnable, p.b bVar) {
        oVar.J(runnable, bVar);
    }

    public static /* synthetic */ ScheduledFuture u(o oVar, Runnable runnable, long j, TimeUnit timeUnit, p.b bVar) {
        return oVar.y(runnable, j, timeUnit, bVar);
    }

    public static /* synthetic */ void v(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    public static /* synthetic */ void z(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    public final /* synthetic */ Future A(Callable callable, p.b bVar) {
        return this.a.submit(new n(callable, bVar));
    }

    public final /* synthetic */ ScheduledFuture B(Callable callable, long j, TimeUnit timeUnit, p.b bVar) {
        return this.b.schedule(new k(this, callable, bVar), j, timeUnit);
    }

    public final /* synthetic */ void E(Runnable runnable, p.b bVar) {
        this.a.execute(new d(runnable, bVar));
    }

    public final /* synthetic */ ScheduledFuture G(Runnable runnable, long j, long j2, TimeUnit timeUnit, p.b bVar) {
        return this.b.scheduleAtFixedRate(new i(this, runnable, bVar), j, j2, timeUnit);
    }

    public final /* synthetic */ void J(Runnable runnable, p.b bVar) {
        this.a.execute(new e(runnable, bVar));
    }

    public final /* synthetic */ ScheduledFuture L(Runnable runnable, long j, long j2, TimeUnit timeUnit, p.b bVar) {
        return this.b.scheduleWithFixedDelay(new l(this, runnable, bVar), j, j2, timeUnit);
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    public List invokeAll(Collection collection) {
        return this.a.invokeAll(collection);
    }

    public Object invokeAny(Collection collection) {
        return this.a.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.a.isShutdown();
    }

    public boolean isTerminated() {
        return this.a.isTerminated();
    }

    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new p(new c(this, runnable, j, timeUnit));
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new p(new f(this, runnable, j, j2, timeUnit));
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new p(new g(this, runnable, j, j2, timeUnit));
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public Future submit(Callable callable) {
        return this.a.submit(callable);
    }

    public final /* synthetic */ void x(Runnable runnable, p.b bVar) {
        this.a.execute(new m(runnable, bVar));
    }

    public final /* synthetic */ ScheduledFuture y(Runnable runnable, long j, TimeUnit timeUnit, p.b bVar) {
        return this.b.schedule(new j(this, runnable, bVar), j, timeUnit);
    }

    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }

    public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return new p(new h(this, callable, j, timeUnit));
    }

    public Future submit(Runnable runnable, Object obj) {
        return this.a.submit(runnable, obj);
    }

    public Future submit(Runnable runnable) {
        return this.a.submit(runnable);
    }
}
