package S5;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class i1 extends zzbct implements j1 {
    public i1() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zze();
        } else if (i == 2) {
            zzf();
        } else if (i == 3) {
            zzg();
        } else if (i == 4) {
            zzh();
        } else {
            if (i != 5) {
                return false;
            }
            boolean zza = zzbcu.zza(parcel);
            zzbcu.zzh(parcel);
            K(zza);
        }
        parcel2.writeNoException();
        return true;
    }
}
