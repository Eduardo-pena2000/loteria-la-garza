package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfba {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfoo zzd;
    private final zzdxz zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzfba(Context context, Executor executor, Set set, zzfoo zzfooVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfooVar;
        this.zze = zzdxzVar;
    }

    public final x7.e zza(Object obj, Bundle bundle, boolean z) {
        zzfoe zzn = zzfoe.zzn(this.zza, 8);
        zzn.zza();
        Set<zzfax> set = this.zzb;
        ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbgv zzbgvVar = zzbhe.zznh;
        if (!((String) S5.D.c().zzd(zzbgvVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) S5.D.c().zzd(zzbgvVar)).split(","));
        }
        List list = arrayList2;
        this.zzf = R5.t.o().b();
        Bundle bundle2 = new Bundle();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcK)).booleanValue() && bundle != null) {
            long a = R5.t.o().a();
            if (obj instanceof zzdah) {
                bundle.putLong(zzdxh.zze.zza(), a);
            } else {
                bundle.putLong(zzdxh.zzh.zza(), a);
            }
        }
        for (zzfax zzfaxVar : set) {
            if (!list.contains(String.valueOf(zzfaxVar.zzb()))) {
                long b = R5.t.o().b();
                x7.e zza = zzfaxVar.zza();
                zza.addListener(new zzfay(this, b, zzfaxVar, bundle2), zzcei.zzg);
                arrayList.add(zza);
            }
        }
        x7.e zza2 = zzgzo.zzp(arrayList).zza(new zzfaz(arrayList, obj, z, bundle, bundle2), this.zzc);
        if (zzfor.zza()) {
            zzfon.zzd(zza2, this.zzd, zzn);
        }
        return zza2;
    }

    public final /* synthetic */ void zzb(long j, zzfax zzfaxVar, Bundle bundle) {
        long b = R5.t.o().b() - j;
        if (((Boolean) zzbjg.zza.zze()).booleanValue()) {
            String zza = zzgrt.zza(zzfaxVar.getClass().getCanonicalName());
            StringBuilder sb = new StringBuilder(zza.length() + 25 + String.valueOf(b).length());
            sb.append("Signal runtime (ms) : ");
            sb.append(zza);
            sb.append(" = ");
            sb.append(b);
            o0.k(sb.toString());
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcK)).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzcQ)).booleanValue()) {
                synchronized (this) {
                    int zzb = zzfaxVar.zzb();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzb).length() + 3);
                    sb2.append("sig");
                    sb2.append(zzb);
                    bundle.putLong(sb2.toString(), b);
                }
            }
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcI)).booleanValue()) {
            zzdxy zza2 = this.zze.zza();
            zza2.zzc("action", "lat_ms");
            zza2.zzc("lat_grp", "sig_lat_grp");
            zza2.zzc("lat_id", String.valueOf(zzfaxVar.zzb()));
            zza2.zzc("clat_ms", String.valueOf(b));
            if (((Boolean) S5.D.c().zzd(zzbhe.zzcJ)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zza2.zzc("seq_num", R5.t.l().zzr().zzm());
                synchronized (this) {
                    try {
                        if (this.zzg == this.zzb.size() && this.zzf != 0) {
                            this.zzg = 0;
                            String valueOf = String.valueOf(R5.t.o().b() - this.zzf);
                            if (zzfaxVar.zzb() <= 39 || zzfaxVar.zzb() >= 52) {
                                zza2.zzc("lat_clsg", valueOf);
                            } else {
                                zza2.zzc("lat_gmssg", valueOf);
                            }
                        }
                    } finally {
                    }
                }
            }
            zza2.zzh();
        }
    }
}
