package k7;

import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class p4 implements Runnable {
    public final /* synthetic */ zzcu a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ AppMeasurementDynamiteService e;

    public p4(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, String str, String str2, boolean z) {
        this.a = zzcuVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.e = appMeasurementDynamiteService;
    }

    public final void run() {
        this.e.a.J().h0(this.a, this.b, this.c, this.d);
    }
}
