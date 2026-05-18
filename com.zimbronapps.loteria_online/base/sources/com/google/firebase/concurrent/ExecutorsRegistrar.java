package com.google.firebase.concurrent;

import H7.a;
import L7.E;
import L7.c;
import L7.d;
import L7.w;
import M7.B;
import M7.b;
import M7.o;
import M7.q;
import M7.r;
import M7.s;
import M7.t;
import M7.u;
import M7.v;
import M7.x;
import M7.y;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final w a = new w(new r());
    public static final w b = new w(new s());
    public static final w c = new w(new t());
    public static final w d = new w(new u());

    public static /* synthetic */ ScheduledExecutorService a(d dVar) {
        return n(dVar);
    }

    public static /* synthetic */ ScheduledExecutorService b() {
        return s();
    }

    public static /* synthetic */ ScheduledExecutorService c() {
        return q();
    }

    public static /* synthetic */ Executor d(d dVar) {
        return o(dVar);
    }

    public static /* synthetic */ ScheduledExecutorService e(d dVar) {
        return m(dVar);
    }

    public static /* synthetic */ ScheduledExecutorService f() {
        return p();
    }

    public static /* synthetic */ ScheduledExecutorService g(d dVar) {
        return l(dVar);
    }

    public static /* synthetic */ ScheduledExecutorService h() {
        return r();
    }

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i >= 26) {
            q.a(detectNetwork);
        }
        return detectNetwork.penaltyLog().build();
    }

    public static ThreadFactory j(String str, int i) {
        return new b(str, i, null);
    }

    public static ThreadFactory k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i, threadPolicy);
    }

    public static /* synthetic */ ScheduledExecutorService l(d dVar) {
        return (ScheduledExecutorService) a.get();
    }

    public static /* synthetic */ ScheduledExecutorService m(d dVar) {
        return (ScheduledExecutorService) c.get();
    }

    public static /* synthetic */ ScheduledExecutorService n(d dVar) {
        return (ScheduledExecutorService) b.get();
    }

    public static /* synthetic */ Executor o(d dVar) {
        return B.a;
    }

    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    public static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) d.get());
    }

    public List getComponents() {
        return Arrays.asList(new c[]{c.d(E.a(a.class, ScheduledExecutorService.class), E.a(a.class, ExecutorService.class), E.a(a.class, Executor.class)).f(new v()).d(), c.d(E.a(H7.b.class, ScheduledExecutorService.class), E.a(H7.b.class, ExecutorService.class), E.a(H7.b.class, Executor.class)).f(new M7.w()).d(), c.d(E.a(H7.c.class, ScheduledExecutorService.class), E.a(H7.c.class, ExecutorService.class), E.a(H7.c.class, Executor.class)).f(new x()).d(), c.c(E.a(H7.d.class, Executor.class)).f(new y()).d()});
    }
}
