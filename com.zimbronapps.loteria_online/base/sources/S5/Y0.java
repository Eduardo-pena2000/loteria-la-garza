package S5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbtt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class y0 extends zzbct implements z0 {
    public y0() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static z0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof z0 ? (z0) queryLocalInterface : new x0(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            G1 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzbcu.zzd(parcel2, liteSdkVersion);
        } else {
            if (i != 2) {
                return false;
            }
            zzbtt adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzbcu.zze(parcel2, adapterCreator);
        }
        return true;
    }
}
