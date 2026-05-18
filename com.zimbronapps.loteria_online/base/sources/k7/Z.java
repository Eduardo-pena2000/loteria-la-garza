package k7;

import android.os.Handler;
import com.google.android.gms.internal.measurement.zzcn;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class z {
    public static volatile Handler d;
    public final V3 a;
    public final Runnable b;
    public volatile long c;

    public z(V3 v3) {
        com.google.android.gms.common.internal.t.l(v3);
        this.a = v3;
        this.b = new y(this, v3);
    }

    public abstract void a();

    public final void b(long j) {
        d();
        if (j >= 0) {
            V3 v3 = this.a;
            this.c = v3.e().a();
            if (f().postDelayed(this.b, j)) {
                return;
            }
            v3.a().o().b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean c() {
        return this.c != 0;
    }

    public final void d() {
        this.c = 0L;
        f().removeCallbacks(this.b);
    }

    public final /* synthetic */ void e(long j) {
        this.c = 0L;
    }

    public final Handler f() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (z.class) {
            try {
                if (d == null) {
                    d = new zzcn(this.a.d().getMainLooper());
                }
                handler = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
