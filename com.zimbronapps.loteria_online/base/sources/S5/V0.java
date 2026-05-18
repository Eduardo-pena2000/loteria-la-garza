package S5;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class v0 extends zzbct implements w0 {
    public v0() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            c1 c1Var = (c1) zzbcu.zzb(parcel, c1.CREATOR);
            zzbcu.zzh(parcel);
            h0(c1Var);
        } else if (i == 2) {
            zzc();
        } else if (i == 3) {
            zzd();
        } else if (i == 4) {
            zze();
        } else {
            if (i != 5) {
                return false;
            }
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
