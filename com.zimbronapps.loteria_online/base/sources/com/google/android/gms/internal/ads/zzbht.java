package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbht {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbht(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbhq zzf() {
        return new zzbhq(R5.t.o().b(), null, null);
    }

    public final void zza(zzbht zzbhtVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbhq zzbhqVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbhq(j, strArr[0], zzbhqVar));
        }
        return true;
    }

    public final zzbhs zzc() {
        zzbhs zzbhsVar;
        boolean booleanValue = ((Boolean) S5.D.c().zzd(zzbhe.zzcw)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            try {
                List<zzbhq> list = this.zza;
                for (zzbhq zzbhqVar : list) {
                    long zza = zzbhqVar.zza();
                    String zzb = zzbhqVar.zzb();
                    zzbhq zzc = zzbhqVar.zzc();
                    if (zzc != null && zza > 0) {
                        long zza2 = zza - zzc.zza();
                        sb.append(zzb);
                        sb.append('.');
                        sb.append(zza2);
                        sb.append(',');
                        if (booleanValue) {
                            if (hashMap.containsKey(Long.valueOf(zzc.zza()))) {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzc.zza()));
                                sb2.append('+');
                                sb2.append(zzb);
                            } else {
                                hashMap.put(Long.valueOf(zzc.zza()), new StringBuilder(zzb));
                            }
                        }
                    }
                }
                list.clear();
                String str = null;
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(R5.t.o().a() + (((Long) entry.getKey()).longValue() - R5.t.o().b()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str = sb3.toString();
                }
                zzbhsVar = new zzbhs(sb.toString(), str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbhsVar;
    }

    public final void zzd(String str, String str2) {
        zzbhj zza;
        if (TextUtils.isEmpty(str2) || (zza = R5.t.l().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbhp zzd = zza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzd.zza((String) map.get(str), str2));
        }
    }

    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            R5.t.l().zza();
            map = this.zzb;
        }
        return map;
    }
}
