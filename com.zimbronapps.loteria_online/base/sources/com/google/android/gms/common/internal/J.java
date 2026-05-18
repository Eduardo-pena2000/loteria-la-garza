package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class j {
    public static final Object a = new Object();
    public static int b = 9;
    public static t0 c = null;
    public static HandlerThread d = null;
    public static Executor e = null;
    public static boolean f = false;

    public static j a(Context context) {
        synchronized (a) {
            try {
                if (c == null) {
                    c = new t0(context.getApplicationContext(), f ? b().getLooper() : context.getMainLooper(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static HandlerThread b() {
        synchronized (a) {
            try {
                HandlerThread handlerThread = d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", b);
                d = handlerThread2;
                handlerThread2.start();
                return d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract v6.b c(q0 q0Var, ServiceConnection serviceConnection, String str, Executor executor);

    public final void d(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        e(new q0(str, str2, 4225, z), serviceConnection, str3);
    }

    public abstract void e(q0 q0Var, ServiceConnection serviceConnection, String str);
}
