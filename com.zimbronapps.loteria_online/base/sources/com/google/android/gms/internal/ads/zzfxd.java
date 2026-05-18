package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfxd {
    final zzfxg zza;
    final boolean zzb;

    private zzfxd(zzfxg zzfxgVar) {
        this.zza = zzfxgVar;
        this.zzb = zzfxgVar != null;
    }

    public static zzfxd zzb(Context context, String str, String str2) {
        zzfxg zzfxeVar;
        try {
            try {
                try {
                    IBinder d = DynamiteModule.e(context, DynamiteModule.b, "com.google.android.gms.ads.dynamite").d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (d == null) {
                        zzfxeVar = null;
                    } else {
                        IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfxeVar = queryLocalInterface instanceof zzfxg ? (zzfxg) queryLocalInterface : new zzfxe(d);
                    }
                    zzfxeVar.zzj(N6.b.s1(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfxd(zzfxeVar);
                } catch (Exception e) {
                    throw new zzfwg(e);
                }
            } catch (zzfwg | RemoteException | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfxd(new zzfxh());
            }
        } catch (Exception e2) {
            throw new zzfwg(e2);
        }
    }

    public static zzfxd zzc() {
        zzfxh zzfxhVar = new zzfxh();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfxd(zzfxhVar);
    }

    public final zzfxc zza(byte[] bArr) {
        return new zzfxc(this, bArr, null);
    }
}
