package S5;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h0 extends zzbcs implements i0 {
    public h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    public final void E(String str, d1 d1Var) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zze(zza, d1Var);
        zzda(1, zza);
    }

    public final void n1(String str, c1 c1Var) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zzc(zza, c1Var);
        zzda(3, zza);
    }

    public final void zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(2, zza);
    }
}
