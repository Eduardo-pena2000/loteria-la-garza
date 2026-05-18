package k7;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class u6 {
    public long a;
    public long b;
    public final z c;
    public final /* synthetic */ w6 d;

    public u6(w6 w6Var) {
        Objects.requireNonNull(w6Var);
        this.d = w6Var;
        this.c = new s6(this, w6Var.a);
        long b = w6Var.a.e().b();
        this.a = b;
        this.b = b;
    }

    public final void a(long j) {
        this.d.h();
        this.c.d();
        this.a = j;
        this.b = j;
    }

    public final void b(long j) {
        this.c.d();
    }

    public final void c() {
        this.c.d();
        long b = this.d.a.e().b();
        this.a = b;
        this.b = b;
    }

    public final boolean d(boolean z, boolean z2, long j) {
        w6 w6Var = this.d;
        w6Var.h();
        w6Var.j();
        if (w6Var.a.g()) {
            q3 q3Var = w6Var.a;
            q3Var.x().q.b(q3Var.e().a());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            w6Var.a.a().w().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        q3 q3Var2 = w6Var.a;
        q3Var2.a().w().b("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !q3Var2.w().N();
        q3 q3Var3 = w6Var.a;
        l7.k0(q3Var3.I().q(z3), bundle, true);
        if (!z2) {
            q3Var3.B().t("auto", "_e", bundle);
        }
        this.a = j;
        z zVar = this.c;
        zVar.d();
        zVar.b(((Long) f2.r0.b(null)).longValue());
        return true;
    }
}
