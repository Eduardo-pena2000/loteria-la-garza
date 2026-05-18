package S5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e1 extends zzbcs implements g1 {
    public e1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public final float zzj() {
        throw null;
    }

    public final float zzk() {
        throw null;
    }

    public final void zzl(j1 j1Var) {
        Parcel zza = zza();
        zzbcu.zze(zza, j1Var);
        zzda(8, zza);
    }

    public final float zzm() {
        throw null;
    }

    public final j1 zzo() {
        j1 h1Var;
        Parcel zzcZ = zzcZ(11, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            h1Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            h1Var = queryLocalInterface instanceof j1 ? (j1) queryLocalInterface : new h1(readStrongBinder);
        }
        zzcZ.recycle();
        return h1Var;
    }
}
