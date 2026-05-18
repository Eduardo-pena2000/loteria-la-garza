package k7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class v5 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ n7 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zzcu e;
    public final /* synthetic */ e6 f;

    public v5(e6 e6Var, String str, String str2, n7 n7Var, boolean z, zzcu zzcuVar) {
        this.a = str;
        this.b = str2;
        this.c = n7Var;
        this.d = z;
        this.e = zzcuVar;
        Objects.requireNonNull(e6Var);
        this.f = e6Var;
    }

    public final void run() {
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            e6 e6Var = this.f;
            j2 N = e6Var.N();
            if (N == null) {
                q3 q3Var = e6Var.a;
                q3Var.a().o().c("Failed to get user properties; not connected to service", this.a, this.b);
                q3Var.C().f0(this.e, bundle2);
                return;
            }
            n7 n7Var = this.c;
            com.google.android.gms.common.internal.t.l(n7Var);
            List<h7> c0 = N.c0(this.a, this.b, this.d, n7Var);
            String[] strArr = l7.i;
            bundle = new Bundle();
            if (c0 != null) {
                for (h7 h7Var : c0) {
                    String str = h7Var.e;
                    if (str != null) {
                        bundle.putString(h7Var.b, str);
                    } else {
                        Long l = h7Var.d;
                        if (l != null) {
                            bundle.putLong(h7Var.b, l.longValue());
                        } else {
                            Double d = h7Var.g;
                            if (d != null) {
                                bundle.putDouble(h7Var.b, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    e6Var.J();
                    q3 q3Var2 = e6Var.a;
                    q3Var2.C().f0(this.e, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    this.f.a.a().o().c("Failed to get user properties; remote exception", this.a, e);
                    e6 e6Var2 = this.f;
                    e6Var2.a.C().f0(this.e, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                e6 e6Var3 = this.f;
                e6Var3.a.C().f0(this.e, bundle2);
                throw th;
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            e6 e6Var32 = this.f;
            e6Var32.a.C().f0(this.e, bundle2);
            throw th;
        }
    }
}
