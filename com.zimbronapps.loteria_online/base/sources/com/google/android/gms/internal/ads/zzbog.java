package com.google.android.gms.internal.ads;

import V5.o0;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbog {
    public static final zzboh zza = zzbof.zza;
    public static final zzboh zzb = zzbnw.zza;
    public static final zzboh zzc = zzbnx.zza;
    public static final zzboh zzd = new zzbno();
    public static final zzboh zze = new zzbnp();
    public static final zzboh zzf = zzboc.zza;
    public static final zzboh zzg = new zzbnq();
    public static final zzboh zzh = new zzbnr();
    public static final zzboh zzi = zzbod.zza;
    public static final zzboh zzj = new zzbns();
    public static final zzboh zzk = new zzbnt();
    public static final zzboh zzl = new zzchf();
    public static final zzboh zzm = new zzchg();
    public static final zzboh zzn = new zzbna();
    public static final zzboy zzo = new zzboy();
    public static final zzboh zzp = new zzbnu();
    public static final zzboh zzq = new zzbnv();
    public static final zzboh zzr = new zzbnb();
    public static final zzboh zzs = new zzbnc();
    public static final zzboh zzt = new zzbnd();
    public static final zzboh zzu = new zzbne();
    public static final zzboh zzv = new zzbnf();
    public static final zzboh zzw = new zzbng();
    public static final zzboh zzx = new zzbnh();
    public static final zzboh zzy = new zzbni();
    public static final zzboh zzz = new zzbnj();
    public static final zzboh zzA = new zzbnk();
    public static final zzboh zzB = new zzbnm();
    public static final zzboh zzC = new zzbnn();

    public static x7.e zza(zzcjl zzcjlVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzazh zzS = zzcjlVar.zzS();
            zzfjo zzT = zzcjlVar.zzT();
            if (!((Boolean) S5.D.c().zzd(zzbhe.zznv)).booleanValue() || zzT == null) {
                if (zzS != null && zzS.zza(parse)) {
                    parse = zzS.zzd(parse, zzcjlVar.getContext(), zzcjlVar.zzE(), zzcjlVar.zzj());
                }
            } else if (zzS != null && zzS.zza(parse)) {
                parse = zzT.zza(parse, zzcjlVar.getContext(), zzcjlVar.zzE(), zzcjlVar.zzj());
            }
        } catch (zzazi unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i = o0.b;
            W5.p.f(concat);
        }
        Map hashMap = new HashMap();
        if (zzcjlVar.zzC() != null) {
            hashMap = zzcjlVar.zzC().zzaw;
        }
        String zzb2 = zzccs.zzb(parse, zzcjlVar.getContext(), hashMap);
        long longValue = ((Long) zzbjd.zze.zze()).longValue();
        if (longValue <= 0 || longValue > 254715000) {
            return zzgzo.zza(zzb2);
        }
        zzgzg zzw2 = zzgzg.zzw(zzcjlVar.zzaF());
        zzbny zzbnyVar = zzbny.zza;
        zzgzy zzgzyVar = zzcei.zzg;
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzg(zzw2, Throwable.class, zzbnyVar, zzgzyVar), new zzbnz(zzb2), zzgzyVar), Throwable.class, new zzboa(zzb2), zzgzyVar);
    }

    public static zzboh zzb(zzdjm zzdjmVar, zzcrv zzcrvVar) {
        return new zzbob(zzdjmVar, zzcrvVar);
    }

    public static void zzc(Map map, zzdjm zzdjmVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmi)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    public static /* synthetic */ void zzd(zzckx zzckxVar, Map map) {
        zze(zzckxVar, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzckx r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbog.zze(com.google.android.gms.internal.ads.zzckx, java.util.Map):void");
    }
}
