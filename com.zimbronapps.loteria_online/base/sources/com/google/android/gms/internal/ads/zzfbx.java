package com.google.android.gms.internal.ads;

import V5.o0;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfbx implements zzfav {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzgah zzc;

    public zzfbx(AdvertisingIdClient.Info info, String str, zzgah zzgahVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzgahVar;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject h = V5.S.h((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    h.put("pdid", str);
                    h.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            h.put("rdid", info.getId());
            h.put("is_lat", info.isLimitAdTrackingEnabled());
            h.put("idtype", "adid");
            zzgah zzgahVar = this.zzc;
            if (zzgahVar.zzc()) {
                h.put("paidv1_id_android_3p", zzgahVar.zza());
                h.put("paidv1_creation_time_android_3p", zzgahVar.zzb());
            }
        } catch (JSONException e) {
            o0.l("Failed putting Ad ID.", e);
        }
    }
}
