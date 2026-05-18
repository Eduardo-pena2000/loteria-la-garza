package S5;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e0 extends zzbcs implements g0 {
    public e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    public final void W0(W1 w1) {
        Parcel zza = zza();
        zzbcu.zzc(zza, w1);
        zzda(1, zza);
    }

    public final void o1(W1 w1) {
        Parcel zza = zza();
        zzbcu.zzc(zza, w1);
        zzda(2, zza);
    }
}
