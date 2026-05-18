package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfux extends zzfus {
    public zzfux(zzful zzfulVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfulVar, hashSet, jSONObject, j);
    }

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzful zzfulVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfud.zzg(jSONObject, zzfulVar.zzd())) {
            return null;
        }
        zzfulVar.zze(jSONObject);
        return jSONObject.toString();
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    public final void zza(String str) {
        zzfth zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfth.zza()) != null) {
            for (zzfsn zzfsnVar : zza.zze()) {
                if (((zzfus) this).zza.contains(zzfsnVar.zzh())) {
                    zzfsnVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
