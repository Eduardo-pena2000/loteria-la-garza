package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class c {
    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String valueOf = String.valueOf(Thread.currentThread());
        String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb = new StringBuilder(valueOf.length() + 56 + valueOf2.length() + 1);
        sb.append("checkMainThread: current thread ");
        sb.append(valueOf);
        sb.append(" IS NOT the main thread ");
        sb.append(valueOf2);
        sb.append("!");
        Log.e("Asserts", sb.toString());
        throw new IllegalStateException(str);
    }

    public static void b(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String valueOf = String.valueOf(Thread.currentThread());
        String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb = new StringBuilder(valueOf.length() + 55 + valueOf2.length() + 1);
        sb.append("checkNotMainThread: current thread ");
        sb.append(valueOf);
        sb.append(" IS the main thread ");
        sb.append(valueOf2);
        sb.append("!");
        Log.e("Asserts", sb.toString());
        throw new IllegalStateException(str);
    }

    public static void c(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
