package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class r0 implements ServiceConnection, u0 {
    public final Map a;
    public int b;
    public boolean c;
    public IBinder d;
    public final q0 e;
    public ComponentName f;
    public final /* synthetic */ t0 g;

    public r0(t0 t0Var, q0 q0Var) {
        Objects.requireNonNull(t0Var);
        this.g = t0Var;
        this.e = q0Var;
        this.a = new HashMap();
        this.b = 2;
    }

    public final void a(String str) {
        q0 q0Var = this.e;
        t0 t0Var = this.g;
        t0Var.h().removeMessages(1, q0Var);
        t0Var.i().c(t0Var.g(), this);
        this.c = false;
        this.b = 2;
    }

    public final void b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void c(ServiceConnection serviceConnection, String str) {
        this.a.remove(serviceConnection);
    }

    public final boolean d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.a.isEmpty();
    }

    public final IBinder h() {
        return this.d;
    }

    public final ComponentName i() {
        return this.f;
    }

    public final /* synthetic */ v6.b j(String str, Executor executor) {
        v6.b bVar;
        try {
            Intent a = e0.a(this.g.g(), this.e);
            this.b = 3;
            StrictMode.VmPolicy a2 = E6.B.a();
            try {
                t0 t0Var = this.g;
                D6.a i = t0Var.i();
                Context g = t0Var.g();
                q0 q0Var = this.e;
                boolean d = i.d(g, str, a, this, 4225, executor);
                this.c = d;
                if (d) {
                    t0Var.h().sendMessageDelayed(t0Var.h().obtainMessage(1, q0Var), t0Var.j());
                    bVar = v6.b.f;
                } else {
                    this.b = 2;
                    try {
                        t0Var.i().c(t0Var.g(), this);
                    } catch (IllegalArgumentException unused) {
                    }
                    bVar = new v6.b(16);
                }
                return bVar;
            } finally {
                StrictMode.setVmPolicy(a2);
            }
        } catch (c0 e) {
            return e.a;
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        t0 t0Var = this.g;
        synchronized (t0Var.f()) {
            try {
                t0Var.h().removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        t0 t0Var = this.g;
        synchronized (t0Var.f()) {
            try {
                t0Var.h().removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
