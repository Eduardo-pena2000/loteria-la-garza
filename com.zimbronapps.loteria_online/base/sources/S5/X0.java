package S5;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbtt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class x0 extends zzbcs implements z0 {
    public x0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public final zzbtt getAdapterCreator() {
        Parcel zzcZ = zzcZ(2, zza());
        zzbtt zzf = zzbts.zzf(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzf;
    }

    public final G1 getLiteSdkVersion() {
        Parcel zzcZ = zzcZ(1, zza());
        G1 g1 = (G1) zzbcu.zzb(zzcZ, G1.CREATOR);
        zzcZ.recycle();
        return g1;
    }
}
