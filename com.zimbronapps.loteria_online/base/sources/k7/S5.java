package k7;

import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class s5 implements Runnable {
    public final /* synthetic */ zzcu a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ AppMeasurementDynamiteService d;

    public s5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, String str, String str2) {
        this.a = zzcuVar;
        this.b = str;
        this.c = str2;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.d = appMeasurementDynamiteService;
    }

    public final void run() {
        this.d.a.J().f0(this.a, this.b, this.c);
    }
}
