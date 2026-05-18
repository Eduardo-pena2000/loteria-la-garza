package k7;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class o2 extends zzbm implements p2 {
    public o2() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        K6 k6 = (K6) zzbn.zzb(parcel, K6.CREATOR);
        zzbn.zzf(parcel);
        p1(k6);
        return true;
    }
}
