package W6;

import android.os.Parcel;
import com.google.android.gms.internal.games_v2.zzaf;
import com.google.android.gms.internal.games_v2.zzb;
import com.google.android.gms.internal.games_v2.zzc;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class n extends zzb implements o {
    public n() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1001) {
            return false;
        }
        zzaf zzb = zzb();
        parcel2.writeNoException();
        int i3 = zzc.zza;
        parcel2.writeInt(1);
        zzb.writeToParcel(parcel2, 1);
        return true;
    }
}
