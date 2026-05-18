package k7;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class x4 implements Runnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ b5 b;

    public x4(b5 b5Var, Bundle bundle) {
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
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        com.google.android.gms.common.internal.t.f(string);
        com.google.android.gms.common.internal.t.f(string2);
        com.google.android.gms.common.internal.t.l(bundle.get("value"));
        if (!b5Var.a.g()) {
            b5Var.a.a().w().a("Conditional property not set since app measurement is disabled");
            return;
        }
        h7 h7Var = new h7(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            q3 q3Var = b5Var.a;
            I R = q3Var.C().R(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            b5Var.a.J().d0(new i(bundle.getString("app_id"), string2, h7Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), q3Var.C().R(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), R, bundle.getLong("time_to_live"), q3Var.C().R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
