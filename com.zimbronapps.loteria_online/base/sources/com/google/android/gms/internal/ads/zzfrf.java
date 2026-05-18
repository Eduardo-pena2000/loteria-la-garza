package com.google.android.gms.internal.ads;

import S5.c1;
import android.content.Context;
import java.util.Locale;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfrf {
    private final zzdxz zza;

    public zzfrf(zzdxz zzdxzVar, Context context) {
        this.zza = zzdxzVar;
    }

    private final void zzt(String str, long j, String str2, String str3, L5.c cVar, int i, int i2, int i3, String str4) {
        zzdxy zza = this.zza.zza();
        zza.zzc("action", str);
        zza.zzc("pat", Long.toString(j));
        zza.zzc("ad_format", cVar.name().toLowerCase(Locale.ENGLISH));
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("pas", Integer.toString(i3));
        zza.zzc("pv", "2");
        zza.zzc("ad_unit_id", str3);
        zza.zzc("pid", str2);
        zza.zzd();
    }

    private final void zzu(String str, String str2, long j, int i, int i2, String str3, zzfrm zzfrmVar, String str4) {
        zzdxy zza = this.zza.zza();
        zza.zzc(str2, Long.toString(j));
        if (zzfrmVar != null) {
            zza.zzc("ad_unit_id", zzfrmVar.zza());
            zza.zzc("ad_format", zzfrmVar.zzb());
            zza.zzc("pid", zzfrmVar.zzc());
        }
        zza.zzc("action", str);
        if (str3 != null) {
            zza.zzc("gqi", str3);
        }
        if (i >= 0) {
            zza.zzc("max_ads", Integer.toString(i));
        }
        if (i2 >= 0) {
            zza.zzc("cache_size", Integer.toString(i2));
        }
        zza.zzc("pv", str4);
        zza.zzd();
    }

    private final void zzv(String str, long j, String str2, String str3, L5.c cVar, int i, int i2, int i3, int i4, int i5) {
        zzdxy zza = this.zza.zza();
        zza.zzc("action", str);
        zza.zzc("pat", Long.toString(j));
        zza.zzc("pid", str2);
        zza.zzc("ad_unit_id", str3);
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("tpcnt", Integer.toString(i4));
        zza.zzc("mpl", Integer.toString(i5));
        if (cVar != null) {
            zza.zzc("ad_format", cVar.name().toLowerCase(Locale.ENGLISH));
        }
        if (i3 > 0) {
            zza.zzc("nptr", Integer.toString(i3));
        }
        zza.zzd();
    }

    public final void zza(int i, long j, zzfrm zzfrmVar, String str) {
        zzdxy zza = this.zza.zza();
        zza.zzc("action", "start_preload");
        zza.zzc("sp_ts", Long.toString(j));
        zza.zzc("ad_format", zzfrmVar.zzb());
        zza.zzc("ad_unit_id", zzfrmVar.zza());
        zza.zzc("pid", zzfrmVar.zzc());
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("pv", str);
        zza.zzd();
    }

    public final void zzb(Map map, long j, String str) {
        zzdxy zza = this.zza.zza();
        zza.zzc("action", "start_preload");
        zza.zzc("sp_ts", Long.toString(j));
        zza.zzc("pv", "1");
        for (L5.c cVar : map.keySet()) {
            String valueOf = String.valueOf(cVar.name().toLowerCase(Locale.ENGLISH));
            zza.zzc(valueOf.concat("_count"), Integer.toString(((Integer) map.get(cVar)).intValue()));
        }
        zza.zzd();
    }

    public final void zzc(int i, int i2, long j, zzfrm zzfrmVar) {
        zzdxy zza = this.zza.zza();
        zza.zzc("action", "cache_resize");
        zza.zzc("cs_ts", Long.toString(j));
        zza.zzc("orig_ma", Integer.toString(i));
        zza.zzc("max_ads", Integer.toString(i2));
        zza.zzc("ad_format", zzfrmVar.zzb());
        zza.zzc("ad_unit_id", zzfrmVar.zza());
        zza.zzc("pid", zzfrmVar.zzc());
        zza.zzc("pv", "1");
        zza.zzd();
    }

    public final void zzd(int i, int i2, long j, Long l, String str, zzfrm zzfrmVar, String str2) {
        zzdxy zza = this.zza.zza();
        zza.zzc("plaac_ts", Long.toString(j));
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("action", "is_ad_available");
        if (zzfrmVar != null) {
            zza.zzc("ad_unit_id", zzfrmVar.zza());
            zza.zzc("pid", zzfrmVar.zzc());
            zza.zzc("ad_format", zzfrmVar.zzb());
        }
        if (l != null) {
            zza.zzc("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            zza.zzc("gqi", str);
        }
        zza.zzc("pv", str2);
        zza.zzd();
    }

    public final void zze(long j, String str) {
        zzu("poll_ad", "ppacwe_ts", j, -1, -1, null, null, "2");
    }

    public final void zzf(long j, zzfrm zzfrmVar, int i, int i2, String str) {
        zzu("poll_ad", "ppac_ts", j, i, i2, null, zzfrmVar, str);
    }

    public final void zzg(long j, int i, int i2, String str, zzfrm zzfrmVar, String str2) {
        zzu("poll_ad", "psvroc_ts", j, i, i2, str, zzfrmVar, str2);
    }

    public final void zzh(long j, int i, int i2, String str, zzfrm zzfrmVar, String str2) {
        zzdxy zza = this.zza.zza();
        zza.zzc("ppla_ts", Long.toString(j));
        zza.zzc("ad_format", zzfrmVar.zzb());
        zza.zzc("ad_unit_id", zzfrmVar.zza());
        zza.zzc("pid", zzfrmVar.zzc());
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("action", "poll_ad");
        if (str != null) {
            zza.zzc("gqi", str);
        }
        zza.zzc("pv", str2);
        zza.zzd();
    }

    public final void zzi(long j, String str, zzfrm zzfrmVar, int i, int i2, String str2) {
        zzu("paa", "pano_ts", j, i, i2, str, zzfrmVar, str2);
    }

    public final void zzj(long j, zzfrm zzfrmVar, int i, String str) {
        zzu("pae", "paeo_ts", j, i, 0, null, zzfrmVar, str);
    }

    public final void zzk(long j, zzfrm zzfrmVar, c1 c1Var, int i, int i2, String str) {
        zzdxy zza = this.zza.zza();
        zza.zzc("action", "pftla");
        zza.zzc("pftlat_ts", Long.toString(j));
        zza.zzc("pftlaec", Integer.toString(c1Var.a));
        zza.zzc("ad_format", zzfrmVar.zzb());
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("ad_unit_id", zzfrmVar.zza());
        zza.zzc("pid", zzfrmVar.zzc());
        zza.zzc("pv", str);
        zza.zzd();
    }

    public final void zzl(long j, L5.c cVar, int i) {
        zzt("pda", j, null, null, cVar, -1, -1, i, "2");
    }

    public final void zzm(long j, String str, String str2, L5.c cVar, int i, int i2) {
        zzt("pd", j, str, str2, cVar, i, i2, 1, "2");
    }

    public final void zzn(L5.c cVar, long j, int i) {
        zzt("pgcs", j, null, null, cVar, -1, -1, i, "2");
    }

    public final void zzo(long j, String str, String str2, L5.c cVar, int i, int i2) {
        zzt("pgc", j, str, str2, cVar, i, i2, 1, "2");
    }

    public final void zzp(int i, long j, String str, String str2, L5.c cVar, int i2) {
        zzt("pnav", j, str, str2, cVar, i2, i, 1, "2");
    }

    public final void zzq(long j, String str, String str2, L5.c cVar, int i, int i2, int i3, int i4) {
        zzv("acmpa", j, str, str2, cVar, i, i2, 0, i3, i4);
    }

    public final void zzr(long j, String str, String str2, L5.c cVar, int i, int i2, int i3, int i4, int i5) {
        zzv("acmpr", j, str, str2, cVar, i, i2, i3, i4, i5);
    }

    public final void zzs(long j, int i, int i2) {
        zzdxy zza = this.zza.zza();
        zza.zzc("action", "acmlr");
        zza.zzc("pat", Long.toString(j));
        zza.zzc("mpl", Integer.toString(i));
        zza.zzc("pas", Integer.toString(i2));
        zza.zzd();
    }
}
