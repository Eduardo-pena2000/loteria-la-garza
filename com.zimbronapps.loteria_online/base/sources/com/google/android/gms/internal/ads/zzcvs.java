package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcvs implements zzdct, zzdbz {
    private final Context zza;
    private final zzcjl zzb;
    private final zzfir zzc;
    private final W5.a zzd;
    private zzekb zze;
    private boolean zzf;
    private final zzejz zzg;

    public zzcvs(Context context, zzcjl zzcjlVar, zzfir zzfirVar, W5.a aVar, zzejz zzejzVar) {
        this.zza = context;
        this.zzb = zzcjlVar;
        this.zzc = zzfirVar;
        this.zzd = aVar;
        this.zzg = zzejzVar;
    }

    private final synchronized void zza() {
        zzcjl zzcjlVar;
        zzejy zzejyVar;
        zzejx zzejxVar;
        try {
            zzfir zzfirVar = this.zzc;
            if (zzfirVar.zzT && (zzcjlVar = this.zzb) != null) {
                if (R5.t.y().zza(this.zza)) {
                    W5.a aVar = this.zzd;
                    int i = aVar.b;
                    int i2 = aVar.c;
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
                    sb.append(i);
                    sb.append(".");
                    sb.append(i2);
                    String sb2 = sb.toString();
                    zzfjn zzfjnVar = zzfirVar.zzV;
                    String zza = zzfjnVar.zza();
                    if (zzfjnVar.zzc() == 1) {
                        zzejxVar = zzejx.VIDEO;
                        zzejyVar = zzejy.DEFINED_BY_JAVASCRIPT;
                    } else {
                        int i3 = zzfirVar.zze;
                        zzejx zzejxVar2 = zzejx.HTML_DISPLAY;
                        zzejyVar = i3 == 1 ? zzejy.ONE_PIXEL : zzejy.BEGIN_TO_RENDER;
                        zzejxVar = zzejxVar2;
                    }
                    zzekb zzc = R5.t.y().zzc(sb2, zzcjlVar.zzD(), "", "javascript", zza, zzejyVar, zzejxVar, zzfirVar.zzal);
                    this.zze = zzc;
                    if (zzc != null) {
                        zzfsj zza2 = zzc.zza();
                        if (((Boolean) S5.D.c().zzd(zzbhe.zzgl)).booleanValue()) {
                            R5.t.y().zzh(zza2, zzcjlVar.zzD());
                            Iterator it = zzcjlVar.zzF().iterator();
                            while (it.hasNext()) {
                                R5.t.y().zzg(zza2, (View) it.next());
                            }
                        } else {
                            R5.t.y().zzh(zza2, zzcjlVar.zzE());
                        }
                        zzcjlVar.zzak(this.zze);
                        R5.t.y().zze(zza2);
                        this.zzf = true;
                        zzcjlVar.zze("onSdkLoaded", new w.a());
                    }
                }
            }
        } finally {
        }
    }

    private final boolean zzb() {
        return ((Boolean) S5.D.c().zzd(zzbhe.zzgm)).booleanValue() && this.zzg.zzb();
    }

    public final synchronized void zzdr() {
        zzcjl zzcjlVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcjlVar = this.zzb) == null) {
            return;
        }
        zzcjlVar.zze("onSdkImpression", new w.a());
    }

    public final synchronized void zzg() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
