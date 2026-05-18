package k7;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class l2 extends zzbm implements m2 {
    public l2() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(B6.CREATOR);
        zzbn.zzf(parcel);
        zze(createTypedArrayList);
        return true;
    }
}
