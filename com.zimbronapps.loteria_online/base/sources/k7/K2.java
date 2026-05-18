package k7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class k2 extends zzbl implements m2 {
    public k2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    public final void zze(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzd(2, zza);
    }
}
