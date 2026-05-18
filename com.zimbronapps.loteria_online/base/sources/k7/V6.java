package k7;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class v6 {
    public final /* synthetic */ w6 a;

    public v6(w6 w6Var) {
        Objects.requireNonNull(w6Var);
        this.a = w6Var;
    }

    public final void a() {
        w6 w6Var = this.a;
        w6Var.h();
        q3 q3Var = w6Var.a;
        if (q3Var.x().A(q3Var.e().a())) {
            q3Var.x().m.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                q3Var.a().w().a("Detected application was in foreground");
                c(q3Var.e().a(), false);
            }
        }
    }

    public final void b(long j, boolean z) {
        w6 w6Var = this.a;
        w6Var.h();
        w6Var.q();
        q3 q3Var = w6Var.a;
        if (q3Var.x().A(j)) {
            q3Var.x().m.b(true);
            w6Var.a.L().p();
        }
        q3Var.x().q.b(j);
        if (q3Var.x().m.a()) {
            c(j, z);
        }
    }

    public final void c(long j, boolean z) {
        w6 w6Var = this.a;
        w6Var.h();
        if (w6Var.a.g()) {
            q3 q3Var = w6Var.a;
            q3Var.x().q.b(j);
            q3Var.a().w().b("Session started, time", Long.valueOf(q3Var.e().b()));
            long j2 = j / 1000;
            q3 q3Var2 = w6Var.a;
            q3Var2.B().B("auto", "_sid", Long.valueOf(j2), j);
            q3Var.x().r.b(j2);
            q3Var.x().m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            q3Var2.B().u("auto", "_s", j, bundle);
            String a = q3Var.x().w.a();
            if (TextUtils.isEmpty(a)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", a);
            q3Var2.B().u("auto", "_ssr", j, bundle2);
        }
    }
}
