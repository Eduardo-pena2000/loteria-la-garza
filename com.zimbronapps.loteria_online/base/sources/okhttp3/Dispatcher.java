package okhttp3;

import Ca.I;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Dispatcher {
    public Runnable c;
    public ExecutorService d;
    public int a = 64;
    public int b = 5;
    public final ArrayDeque e = new ArrayDeque();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public final synchronized void a() {
        try {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((RealCall.AsyncCall) it.next()).b().cancel();
            }
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                ((RealCall.AsyncCall) it2.next()).b().cancel();
            }
            Iterator it3 = this.g.iterator();
            while (it3.hasNext()) {
                ((RealCall) it3.next()).cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(RealCall.AsyncCall call) {
        RealCall.AsyncCall e;
        t.g(call, "call");
        synchronized (this) {
            try {
                this.e.add(call);
                if (!call.b().m() && (e = e(call.d())) != null) {
                    call.e(e);
                }
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        l();
    }

    public final synchronized void c(RealCall call) {
        t.g(call, "call");
        this.g.add(call);
    }

    public final synchronized ExecutorService d() {
        ExecutorService executorService;
        try {
            if (this.d == null) {
                this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.N(t.o(Util.i, " Dispatcher"), false));
            }
            executorService = this.d;
            t.d(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final RealCall.AsyncCall e(String str) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
            if (t.c(asyncCall.d(), str)) {
                return asyncCall;
            }
        }
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            RealCall.AsyncCall asyncCall2 = (RealCall.AsyncCall) it2.next();
            if (t.c(asyncCall2.d(), str)) {
                return asyncCall2;
            }
        }
        return null;
    }

    public final void f(Deque deque, Object obj) {
        Runnable i;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            i = i();
            I i2 = I.a;
        }
        if (l() || i == null) {
            return;
        }
        i.run();
    }

    public final void g(RealCall.AsyncCall call) {
        t.g(call, "call");
        call.c().decrementAndGet();
        f(this.f, call);
    }

    public final void h(RealCall call) {
        t.g(call, "call");
        f(this.g, call);
    }

    public final synchronized Runnable i() {
        return this.c;
    }

    public final synchronized int j() {
        return this.a;
    }

    public final synchronized int k() {
        return this.b;
    }

    public final boolean l() {
        int i;
        boolean z;
        if (Util.h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.e.iterator();
                t.f(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
                    if (this.f.size() >= j()) {
                        break;
                    }
                    if (asyncCall.c().get() < k()) {
                        it.remove();
                        asyncCall.c().incrementAndGet();
                        t.f(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f.add(asyncCall);
                    }
                }
                z = m() > 0;
                I i2 = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((RealCall.AsyncCall) arrayList.get(i)).a(d());
        }
        return z;
    }

    public final synchronized int m() {
        return this.f.size() + this.g.size();
    }
}
