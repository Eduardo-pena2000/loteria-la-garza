package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class t0 extends j {
    public final HashMap g = new HashMap();
    public final Context h;
    public volatile Handler i;
    public final s0 j;
    public final D6.a k;
    public final long l;
    public final long m;
    public volatile Executor n;

    public t0(Context context, Looper looper, Executor executor) {
        s0 s0Var = new s0(this, null);
        this.j = s0Var;
        this.h = context.getApplicationContext();
        this.i = new zzg(looper, s0Var);
        this.k = D6.a.b();
        this.l = 5000L;
        this.m = 300000L;
        this.n = executor;
    }

    public final v6.b c(q0 q0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        v6.b bVar;
        t.m(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.g;
        synchronized (hashMap) {
            try {
                r0 r0Var = (r0) hashMap.get(q0Var);
                if (executor == null) {
                    executor = this.n;
                }
                if (r0Var == null) {
                    r0Var = new r0(this, q0Var);
                    r0Var.b(serviceConnection, serviceConnection, str);
                    bVar = r0Var.j(str, executor);
                    hashMap.put(q0Var, r0Var);
                } else {
                    this.i.removeMessages(0, q0Var);
                    if (r0Var.f(serviceConnection)) {
                        String obj = q0Var.toString();
                        StringBuilder sb = new StringBuilder(obj.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(obj);
                        throw new IllegalStateException(sb.toString());
                    }
                    r0Var.b(serviceConnection, serviceConnection, str);
                    int e = r0Var.e();
                    if (e == 1) {
                        serviceConnection.onServiceConnected(r0Var.i(), r0Var.h());
                    } else if (e == 2) {
                        bVar = r0Var.j(str, executor);
                    }
                    bVar = null;
                }
                if (r0Var.d()) {
                    return v6.b.f;
                }
                if (bVar == null) {
                    bVar = new v6.b(-1);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(q0 q0Var, ServiceConnection serviceConnection, String str) {
        t.m(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.g;
        synchronized (hashMap) {
            try {
                r0 r0Var = (r0) hashMap.get(q0Var);
                if (r0Var == null) {
                    String obj = q0Var.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
                if (!r0Var.f(serviceConnection)) {
                    String obj2 = q0Var.toString();
                    StringBuilder sb2 = new StringBuilder(obj2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(obj2);
                    throw new IllegalStateException(sb2.toString());
                }
                r0Var.c(serviceConnection, str);
                if (r0Var.g()) {
                    this.i.sendMessageDelayed(this.i.obtainMessage(0, q0Var), this.l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ HashMap f() {
        return this.g;
    }

    public final /* synthetic */ Context g() {
        return this.h;
    }

    public final /* synthetic */ Handler h() {
        return this.i;
    }

    public final /* synthetic */ D6.a i() {
        return this.k;
    }

    public final /* synthetic */ long j() {
        return this.m;
    }
}
