package com.google.android.gms.internal.ads;

import S5.l2;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzeng implements zzekg {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        return !TextUtils.isEmpty(zzfirVar.zzv.optString("pubid", ""));
    }

    public final x7.e zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        JSONObject jSONObject = zzfirVar.zzv;
        String optString = jSONObject.optString("pubid", "");
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        zzfjj zzfjjVar = new zzfjj();
        zzfjjVar.zzz(zzfjkVar);
        zzfjjVar.zzg(optString);
        zzfjjVar.zzy(true);
        l2 l2Var = zzfjkVar.zzd;
        Bundle zzd = zzd(l2Var.m);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = jSONObject.optString("mad_hac", (String) null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = jSONObject.optString("adJson", (String) null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = zzfirVar.zzD;
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            String optString4 = jSONObject2.optString(str, (String) null);
            if (str != null) {
                zzd2.putString(str, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        zzfjjVar.zza(new l2(l2Var.a, l2Var.b, zzd2, l2Var.d, l2Var.e, l2Var.f, l2Var.g, l2Var.h, l2Var.i, l2Var.j, l2Var.k, l2Var.l, zzd, l2Var.n, l2Var.o, l2Var.p, l2Var.q, l2Var.r, l2Var.s, l2Var.t, l2Var.u, l2Var.v, l2Var.w, l2Var.x, l2Var.y, l2Var.z, l2Var.A));
        zzfjk zzA = zzfjjVar.zzA();
        Bundle bundle = new Bundle();
        zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(zzfiuVar.zza));
        bundle2.putInt("refresh_interval", zzfiuVar.zzc);
        bundle2.putString("gws_query_id", zzfiuVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str2 = zzfjkVar.zzg;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str2);
        bundle3.putString("allocation_id", zzfirVar.zzw);
        bundle3.putString("ad_source_name", zzfirVar.zzF);
        bundle3.putStringArrayList("click_urls", new ArrayList(zzfirVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList(zzfirVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(zzfirVar.zzp));
        bundle3.putStringArrayList("fill_urls", new ArrayList(zzfirVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(zzfirVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(zzfirVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(zzfirVar.zzi));
        bundle3.putString("transaction_id", zzfirVar.zzj);
        bundle3.putString("valid_from_timestamp", zzfirVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzfirVar.zzP);
        bundle3.putString("recursive_server_response_data", zzfirVar.zzao);
        bundle3.putBoolean("is_analytics_logging_enabled", zzfirVar.zzW);
        zzcas zzcasVar = zzfirVar.zzl;
        if (zzcasVar != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzcasVar.zzb);
            bundle4.putString("rb_type", zzcasVar.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzA, bundle, zzfirVar, zzfjcVar);
    }

    public abstract x7.e zzc(zzfjk zzfjkVar, Bundle bundle, zzfir zzfirVar, zzfjc zzfjcVar);
}
