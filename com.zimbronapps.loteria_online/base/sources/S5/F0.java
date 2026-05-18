package S5;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class f0 extends zzbct implements g0 {
    public f0() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            W1 w1 = (W1) zzbcu.zzb(parcel, W1.CREATOR);
            zzbcu.zzh(parcel);
            W0(w1);
        } else {
            if (i != 2) {
                return false;
            }
            W1 w12 = (W1) zzbcu.zzb(parcel, W1.CREATOR);
            zzbcu.zzh(parcel);
            o1(w12);
        }
        parcel2.writeNoException();
        return true;
    }
}
