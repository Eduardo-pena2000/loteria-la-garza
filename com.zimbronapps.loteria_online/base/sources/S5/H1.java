package S5;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h1 extends zzbcs implements j1 {
    public h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void K(boolean z) {
        Parcel zza = zza();
        int i = zzbcu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(5, zza);
    }

    public final void zze() {
        zzda(1, zza());
    }

    public final void zzf() {
        zzda(2, zza());
    }

    public final void zzg() {
        zzda(3, zza());
    }

    public final void zzh() {
        zzda(4, zza());
    }
}
