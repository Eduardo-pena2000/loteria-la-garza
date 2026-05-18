package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzejz {
    private final Context zza;
    private final W5.a zzb;
    private final zzfir zzc;
    private final zzcjl zzd;
    private final zzdxz zze;
    private zzfsv zzf;

    public zzejz(Context context, W5.a aVar, zzfir zzfirVar, zzcjl zzcjlVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = zzfirVar;
        this.zzd = zzcjlVar;
        this.zze = zzdxzVar;
    }

    public final synchronized boolean zza(boolean z) {
        zzcjl zzcjlVar;
        zzfir zzfirVar = this.zzc;
        if (zzfirVar.zzT) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzgj)).booleanValue()) {
                if (((Boolean) S5.D.c().zzd(zzbhe.zzgm)).booleanValue() && (zzcjlVar = this.zzd) != null) {
                    if (this.zzf != null) {
                        int i = o0.b;
                        W5.p.f("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!R5.t.y().zza(this.zza)) {
                        int i2 = o0.b;
                        W5.p.f("Unable to initialize omid.");
                        return false;
                    }
                    if (zzfirVar.zzV.zzb()) {
                        zzfsv zzi = R5.t.y().zzi(this.zzb, zzcjlVar.zzD(), true);
                        if (((Boolean) S5.D.c().zzd(zzbhe.zzgn)).booleanValue()) {
                            zzdxz zzdxzVar = this.zze;
                            String str = zzi != null ? "1" : "0";
                            zzdxy zza = zzdxzVar.zza();
                            zza.zzc("omid_js_session_success", str);
                            zza.zzd();
                        }
                        if (zzi == null) {
                            int i3 = o0.b;
                            W5.p.f("Unable to create javascript session service.");
                            return false;
                        }
                        int i4 = o0.b;
                        W5.p.e("Created omid javascript session service.");
                        this.zzf = zzi;
                        zzcjlVar.zzal(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized boolean zzb() {
        return this.zzf != null;
    }

    public final synchronized void zzc() {
        zzcjl zzcjlVar;
        try {
            zzfsv zzfsvVar = this.zzf;
            if (zzfsvVar == null || (zzcjlVar = this.zzd) == null) {
                return;
            }
            Iterator it = zzcjlVar.zzF().iterator();
            while (it.hasNext()) {
                R5.t.y().zzk(zzfsvVar, (View) it.next());
            }
            zzcjlVar.zze("onSdkLoaded", zzgui.zza());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd() {
        zzcjl zzcjlVar;
        if (this.zzf == null || (zzcjlVar = this.zzd) == null) {
            return;
        }
        zzcjlVar.zze("onSdkImpression", zzgui.zza());
    }

    public final synchronized void zze(zzfsu zzfsuVar) {
        zzcjl zzcjlVar;
        zzfsv zzfsvVar = this.zzf;
        if (zzfsvVar == null || (zzcjlVar = this.zzd) == null) {
            return;
        }
        R5.t.y().zzj(zzfsvVar, zzfsuVar);
        this.zzf = null;
        zzcjlVar.zzal(null);
    }

    public final synchronized void zzf(View view) {
        zzfsv zzfsvVar = this.zzf;
        if (zzfsvVar != null) {
            R5.t.y().zzk(zzfsvVar, view);
        }
    }
}
