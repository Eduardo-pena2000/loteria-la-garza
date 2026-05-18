package s8;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class a0 {
    public static WeakReference d;
    public final SharedPreferences a;
    public X b;
    public final Executor c;

    public a0(SharedPreferences sharedPreferences, Executor executor) {
        this.c = executor;
        this.a = sharedPreferences;
    }

    public static synchronized a0 b(Context context, Executor executor) {
        a0 a0Var;
        synchronized (a0.class) {
            try {
                WeakReference weakReference = d;
                a0Var = weakReference != null ? (a0) weakReference.get() : null;
                if (a0Var == null) {
                    a0Var = new a0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    a0Var.d();
                    d = new WeakReference(a0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a0Var;
    }

    public synchronized boolean a(Z z) {
        return this.b.b(z.e());
    }

    public synchronized Z c() {
        return Z.a(this.b.f());
    }

    public final synchronized void d() {
        this.b = X.d(this.a, "topic_operation_queue", ",", this.c);
    }

    public synchronized boolean e(Z z) {
        return this.b.g(z.e());
    }
}
