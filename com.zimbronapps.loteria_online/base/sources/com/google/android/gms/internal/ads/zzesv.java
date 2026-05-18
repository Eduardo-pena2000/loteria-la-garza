package com.google.android.gms.internal.ads;

import S5.l2;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzesv implements zzfav {
    final zzfjk zza;
    private final long zzb;
    private final long zzc;

    public zzesv(zzfjk zzfjkVar, long j, long j2) {
        this.zza = zzfjkVar;
        this.zzb = j;
        this.zzc = j2;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        zzfjk zzfjkVar = this.zza;
        l2 l2Var = zzfjkVar.zzd;
        bundle.putInt("http_timeout_millis", l2Var.w);
        bundle.putString("slotname", zzfjkVar.zzg);
        int i = zzfjkVar.zzp.zza;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j = this.zzb;
        bundle.putLong("start_signals_timestamp", j);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzoW)).booleanValue()) {
            bundle.putLong("tsi", j - this.zzc);
        }
        zzfjz.zzd(bundle, "is_sdk_preload", true, l2Var.zzc());
        zzfjz.zzb(bundle, "prefetch_type", "zenith_v2", l2Var.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j2 = l2Var.b;
        zzfjz.zzb(bundle, "cust_age", simpleDateFormat.format(new Date(j2)), j2 != -1);
        zzfjz.zzf(bundle, "extras", l2Var.c);
        int i3 = l2Var.d;
        zzfjz.zzc(bundle, "cust_gender", i3, i3 != -1);
        zzfjz.zzg(bundle, "kw", l2Var.e);
        int i4 = l2Var.g;
        zzfjz.zzc(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (l2Var.f) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", l2Var.y);
        int i5 = l2Var.a;
        zzfjz.zzc(bundle, "d_imp_hdr", 1, i5 >= 2 && l2Var.h);
        String str = l2Var.i;
        zzfjz.zzb(bundle, "ppid", str, i5 >= 2 && !TextUtils.isEmpty(str));
        Location location = l2Var.k;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        zzfjz.zze(bundle, "url", l2Var.l);
        zzfjz.zzg(bundle, "neighboring_content_urls", l2Var.v);
        zzfjz.zzf(bundle, "custom_targeting", l2Var.n);
        zzfjz.zzg(bundle, "category_exclusions", l2Var.o);
        zzfjz.zze(bundle, "request_agent", l2Var.p);
        zzfjz.zze(bundle, "request_pkg", l2Var.q);
        zzfjz.zzd(bundle, "is_designed_for_families", l2Var.r, i5 >= 7);
        if (i5 >= 8) {
            int i6 = l2Var.t;
            zzfjz.zzc(bundle, "tag_for_under_age_of_consent", i6, i6 != -1);
            zzfjz.zze(bundle, "max_ad_content_rating", l2Var.u);
        }
        Bundle bundle3 = zzfjkVar.zze;
        zzfjz.zzh(bundle, "plcs", Integer.valueOf(bundle3.getInt("plcs")));
        zzfjz.zzh(bundle, "plbs", Integer.valueOf(bundle3.getInt("plbs")));
        zzfjz.zze(bundle, "plid", bundle3.getString("plid"));
        zzfjz.zzc(bundle, "s2s_rr", 1, zzfjkVar.zzv && !(l2Var.s == null && l2Var.x == null));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzdah) obj).zzb;
        zzfjk zzfjkVar = this.zza;
        bundle.putString("slotname", zzfjkVar.zzg);
        l2 l2Var = zzfjkVar.zzd;
        if (l2Var.f) {
            bundle.putBoolean("test_request", true);
        }
        int i = l2Var.g;
        zzfjz.zzc(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (l2Var.a >= 8) {
            int i2 = l2Var.t;
            zzfjz.zzc(bundle, "tag_for_under_age_of_consent", i2, i2 != -1);
        }
        zzfjz.zze(bundle, "url", l2Var.l);
        zzfjz.zzg(bundle, "neighboring_content_urls", l2Var.v);
        Bundle bundle2 = l2Var.c;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) S5.D.c().zzd(zzbhe.zziA)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        zzfjz.zzf(bundle, "extras", bundle3);
    }
}
