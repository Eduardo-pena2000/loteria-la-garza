package k7;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class w4 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ b5 b;

    public w4(b5 b5Var, long j) {
        this.a = j;
        Objects.requireNonNull(b5Var);
        this.b = b5Var;
    }

    public final void run() {
        b5 b5Var = this.b;
        b5Var.h();
        b5Var.j();
        q3 q3Var = b5Var.a;
        q3Var.a().v().a("Resetting analytics data (FE)");
        q3 q3Var2 = b5Var.a;
        w6 z = q3Var2.z();
        z.h();
        z.f.c();
        q3Var2.L().p();
        boolean z2 = !b5Var.a.g();
        Q2 x = q3Var.x();
        x.f.b(this.a);
        q3 q3Var3 = x.a;
        if (!TextUtils.isEmpty(q3Var3.x().w.a())) {
            x.w.b(null);
        }
        x.q.b(0L);
        x.r.b(0L);
        if (!q3Var3.w().L()) {
            x.y(z2);
        }
        x.x.b(null);
        x.y.b(0L);
        x.z.b(null);
        q3Var2.J().p();
        q3Var2.z().e.a();
        b5Var.s = z2;
        q3Var2.J().q(new AtomicReference());
    }
}
