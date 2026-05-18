package k7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzbn;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class n2 extends zzbl implements p2 {
    public n2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    public final void p1(K6 k6) {
        Parcel zza = zza();
        zzbn.zzc(zza, k6);
        zzd(2, zza);
    }
}
