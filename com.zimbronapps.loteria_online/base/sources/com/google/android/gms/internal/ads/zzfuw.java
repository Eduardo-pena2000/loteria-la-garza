package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfuw extends zzfus {
    public zzfuw(zzful zzfulVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfulVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfth zza = zzfth.zza();
        if (zza != null) {
            for (zzfsn zzfsnVar : zza.zze()) {
                if (((zzfus) this).zza.contains(zzfsnVar.zzh())) {
                    zzfsnVar.zzg().zzi(str, this.zzc);
                }
            }
        }
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
