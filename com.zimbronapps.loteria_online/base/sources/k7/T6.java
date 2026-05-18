package k7;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcx;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class t6 implements Runnable {
    public final /* synthetic */ AppMeasurementDynamiteService a;
    public final /* synthetic */ zzcx b;

    public /* synthetic */ t6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcx zzcxVar) {
        this.a = appMeasurementDynamiteService;
        this.b = zzcxVar;
    }

    public final /* synthetic */ void run() {
        try {
            this.b.zze();
        } catch (RemoteException e) {
            ((q3) com.google.android.gms.common.internal.t.l(this.a.a)).a().r().b("Failed to call IDynamiteUploadBatchesCallback", e);
        }
    }
}
