package com.applovin.shadow.okhttp3;

import Ca.I;
import Ca.e;
import Da.D;
import Da.w;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.connection.RealCall;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque readyAsyncCalls;
    private final ArrayDeque runningAsyncCalls;
    private final ArrayDeque runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque();
        this.runningAsyncCalls = new ArrayDeque();
        this.runningSyncCalls = new ArrayDeque();
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String str) {
        Iterator it = this.runningAsyncCalls.iterator();
        while (it.hasNext()) {
            RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
            if (t.c(asyncCall.getHost(), str)) {
                return asyncCall;
            }
        }
        Iterator it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            RealCall.AsyncCall asyncCall2 = (RealCall.AsyncCall) it2.next();
            if (t.c(asyncCall2.getHost(), str)) {
                return asyncCall2;
            }
        }
        return null;
    }

    private final void finished(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.idleCallback;
            I i = I.a;
        }
        if (promoteAndExecute() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean promoteAndExecute() {
        int i;
        boolean z;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.readyAsyncCalls.iterator();
                t.f(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    }
                    if (asyncCall.getCallsPerHost().get() < this.maxRequestsPerHost) {
                        it.remove();
                        asyncCall.getCallsPerHost().incrementAndGet();
                        t.f(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.runningAsyncCalls.add(asyncCall);
                    }
                }
                z = runningCallsCount() > 0;
                I i2 = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((RealCall.AsyncCall) arrayList.get(i)).executeOn(executorService());
        }
        return z;
    }

    @e
    public final ExecutorService -deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        try {
            Iterator it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                ((RealCall.AsyncCall) it.next()).getCall().cancel();
            }
            Iterator it2 = this.runningAsyncCalls.iterator();
            while (it2.hasNext()) {
                ((RealCall.AsyncCall) it2.next()).getCall().cancel();
            }
            Iterator it3 = this.runningSyncCalls.iterator();
            while (it3.hasNext()) {
                ((RealCall) it3.next()).cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void enqueue$okhttp(RealCall.AsyncCall asyncCall) {
        RealCall.AsyncCall findExistingCallWithHost;
        t.g(asyncCall, "call");
        synchronized (this) {
            try {
                this.readyAsyncCalls.add(asyncCall);
                if (!asyncCall.getCall().getForWebSocket() && (findExistingCallWithHost = findExistingCallWithHost(asyncCall.getHost())) != null) {
                    asyncCall.reuseCallsPerHostFrom(findExistingCallWithHost);
                }
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        promoteAndExecute();
    }

    public final synchronized void executed$okhttp(RealCall realCall) {
        t.g(realCall, "call");
        this.runningSyncCalls.add(realCall);
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        try {
            if (this.executorServiceOrNull == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory(Util.okHttpName + " Dispatcher", false));
            }
            executorService = this.executorServiceOrNull;
            t.d(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void finished$okhttp(RealCall.AsyncCall asyncCall) {
        t.g(asyncCall, "call");
        asyncCall.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, asyncCall);
    }

    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized List queuedCalls() {
        List unmodifiableList;
        try {
            ArrayDeque arrayDeque = this.readyAsyncCalls;
            ArrayList arrayList = new ArrayList(w.y(arrayDeque, 10));
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
            t.f(unmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        } catch (Throwable th) {
            throw th;
        }
        return unmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized List runningCalls() {
        List unmodifiableList;
        try {
            ArrayDeque arrayDeque = this.runningSyncCalls;
            ArrayDeque arrayDeque2 = this.runningAsyncCalls;
            ArrayList arrayList = new ArrayList(w.y(arrayDeque2, 10));
            Iterator it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
            }
            unmodifiableList = Collections.unmodifiableList(D.v0(arrayDeque, arrayList));
            t.f(unmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        } catch (Throwable th) {
            throw th;
        }
        return unmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(("max < 1: " + i).toString());
        }
        synchronized (this) {
            this.maxRequests = i;
            I i2 = I.a;
        }
        promoteAndExecute();
    }

    public final void setMaxRequestsPerHost(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(("max < 1: " + i).toString());
        }
        synchronized (this) {
            this.maxRequestsPerHost = i;
            I i2 = I.a;
        }
        promoteAndExecute();
    }

    public final void finished$okhttp(RealCall realCall) {
        t.g(realCall, "call");
        finished(this.runningSyncCalls, realCall);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher(ExecutorService executorService) {
        this();
        t.g(executorService, "executorService");
        this.executorServiceOrNull = executorService;
    }
}
