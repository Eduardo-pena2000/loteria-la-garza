package k7;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class y4 implements Runnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ b5 b;

    public y4(b5 b5Var, Bundle bundle) {
        this.a = bundle;
        Objects.requireNonNull(b5Var);
        this.b = b5Var;
    }

    public final void run() {
        b5 b5Var = this.b;
        b5Var.h();
        b5Var.j();
        Bundle bundle = this.a;
        com.google.android.gms.common.internal.t.l(bundle);
        String f = com.google.android.gms.common.internal.t.f(bundle.getString("name"));
        if (!b5Var.a.g()) {
            b5Var.a.a().w().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            b5Var.a.J().d0(new i(bundle.getString("app_id"), "", new h7(f, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), b5Var.a.C().R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
