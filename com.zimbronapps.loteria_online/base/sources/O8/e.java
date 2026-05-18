package o8;

import java.util.concurrent.TimeUnit;
import m8.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class e {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final p a = p.c();
    public long b;
    public int c;

    public static boolean c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    public static boolean d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    public final synchronized long a(int i) {
        if (c(i)) {
            return (long) Math.min(Math.pow(2.0d, this.c) + this.a.e(), e);
        }
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.c     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            m8.p r0 = r4.a     // Catch: java.lang.Throwable -> L14
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L14
            long r2 = r4.b     // Catch: java.lang.Throwable -> L14
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L12
            goto L16
        L12:
            r0 = 0
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 1
        L17:
            monitor-exit(r4)
            return r0
        L19:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.e.b():boolean");
    }

    public final synchronized void e() {
        this.c = 0;
    }

    public synchronized void f(int i) {
        if (d(i)) {
            e();
            return;
        }
        this.c++;
        this.b = this.a.a() + a(i);
    }
}
