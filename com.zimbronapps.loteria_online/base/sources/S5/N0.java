package S5;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n0 extends zzbcs implements p0 {
    public n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public final void zzb(String str, String str2) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzda(1, zza);
    }
}
