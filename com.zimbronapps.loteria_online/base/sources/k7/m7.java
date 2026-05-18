package k7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class m7 implements f4 {
    public final zzda a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public m7(AppMeasurementDynamiteService appMeasurementDynamiteService, zzda zzdaVar) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.b = appMeasurementDynamiteService;
        this.a = zzdaVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            q3 q3Var = this.b.a;
            if (q3Var != null) {
                q3Var.a().r().b("Event listener threw exception", e);
            }
        }
    }
}
