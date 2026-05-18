package k7;

import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class j3 implements Runnable {
    public final /* synthetic */ zzcu a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public j3(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar) {
        this.a = zzcuVar;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.b = appMeasurementDynamiteService;
    }

    public final void run() {
        this.b.a.J().r(this.a);
    }
}
