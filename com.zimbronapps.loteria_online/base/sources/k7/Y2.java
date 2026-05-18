package k7;

import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class y2 {
    public static y2 d;
    public final q3 a;
    public final com.google.android.gms.common.internal.z b;
    public final AtomicLong c = new AtomicLong(-1);

    public y2(Context context, q3 q3Var) {
        this.b = com.google.android.gms.common.internal.y.b(context, com.google.android.gms.common.internal.A.a().b("measurement:api").a());
        this.a = q3Var;
    }

    public static y2 a(q3 q3Var) {
        if (d == null) {
            d = new y2(q3Var.d(), q3Var);
        }
        return d;
    }

    public final synchronized void b(int i, int i2, long j, long j2, int i3) {
        long b = this.a.e().b();
        AtomicLong atomicLong = this.c;
        if (atomicLong.get() != -1 && b - atomicLong.get() <= 1800000) {
            return;
        }
        this.b.a(new com.google.android.gms.common.internal.x(0, Arrays.asList(new com.google.android.gms.common.internal.q[]{new com.google.android.gms.common.internal.q(36301, i2, 0, j, j2, (String) null, (String) null, 0, i3)}))).addOnFailureListener(new x2(this, b));
    }

    public final /* synthetic */ void c(long j, Exception exc) {
        this.c.set(j);
    }
}
