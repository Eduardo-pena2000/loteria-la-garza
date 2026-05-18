package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.RemoteException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzepb implements zzeki {
    private final zzeqf zza;
    private final zzdvp zzb;

    public zzepb(zzeqf zzeqfVar, zzdvp zzdvpVar) {
        this.zza = zzeqfVar;
        this.zzb = zzdvpVar;
    }

    public final zzekj zza(String str, JSONObject jSONObject) throws zzfjr {
        zzbvs zzbvsVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzck)).booleanValue()) {
            try {
                zzbvsVar = this.zzb.zzb(str);
            } catch (RemoteException e) {
                int i = o0.b;
                W5.p.d("Coundn't create RTB adapter: ", e);
                zzbvsVar = null;
            }
        } else {
            zzbvsVar = this.zza.zzb(str);
        }
        if (zzbvsVar == null) {
            return null;
        }
        return new zzekj(zzbvsVar, new zzelv(), str);
    }
}
