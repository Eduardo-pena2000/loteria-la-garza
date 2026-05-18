package S5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class a1 extends zzbcs implements d1 {
    public a1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public final String zze() {
        Parcel zzcZ = zzcZ(1, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzf() {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final List zzg() {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList createTypedArrayList = zzcZ.createTypedArrayList(u2.CREATOR);
        zzcZ.recycle();
        return createTypedArrayList;
    }

    public final u2 zzh() {
        Parcel zzcZ = zzcZ(4, zza());
        u2 u2Var = (u2) zzbcu.zzb(zzcZ, u2.CREATOR);
        zzcZ.recycle();
        return u2Var;
    }

    public final Bundle zzi() {
        Parcel zzcZ = zzcZ(5, zza());
        Bundle zzb = zzbcu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return zzb;
    }

    public final String zzj() {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }
}
