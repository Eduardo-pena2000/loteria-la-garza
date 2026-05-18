package k7;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class z5 implements Runnable {
    public final /* synthetic */ n7 a;
    public final /* synthetic */ e6 b;

    public z5(e6 e6Var, n7 n7Var) {
        this.a = n7Var;
        Objects.requireNonNull(e6Var);
        this.b = e6Var;
    }

    public final void run() {
        e6 e6Var = this.b;
        j2 N = e6Var.N();
        if (N == null) {
            e6Var.a.a().o().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            n7 n7Var = this.a;
            com.google.android.gms.common.internal.t.l(n7Var);
            N.Y(n7Var);
        } catch (RemoteException e) {
            this.b.a.a().o().b("Failed to reset data on the service: remote exception", e);
        }
        this.b.J();
    }
}
