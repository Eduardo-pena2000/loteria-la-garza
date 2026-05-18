package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfqk {
    private final Context zza;
    private final Executor zzb;
    private final zzgzz zzc;
    private final W5.v zzd;
    private final zzfqc zze;
    private final zzfor zzf;
    private final zzclx zzg;

    public zzfqk(Context context, Executor executor, zzgzz zzgzzVar, W5.v vVar, zzfqc zzfqcVar, zzfor zzforVar, zzclx zzclxVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgzzVar;
        this.zzd = vVar;
        this.zze = zzfqcVar;
        this.zzf = zzforVar;
        this.zzg = zzclxVar;
    }

    public final void zza(List list, W5.w wVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), wVar, null, null);
        }
    }

    public final void zzb(String str, W5.w wVar, zzfoo zzfooVar, zzddu zzdduVar) {
        x7.e submit;
        zzfoe zzfoeVar = null;
        if (zzfor.zza() && ((Boolean) zzbix.zzd.zze()).booleanValue()) {
            zzfoeVar = zzfoe.zzn(this.zza, 14);
            zzfoeVar.zza();
        }
        if (wVar != null) {
            submit = new zzfqb(wVar.a(), this.zzd, this.zzc, this.zze, this.zzg).zza(str);
        } else {
            submit = this.zzc.submit(new zzfqj(this, str));
        }
        zzgzo.zzr(submit, new zzfqi(this, zzfoeVar, zzfooVar, zzdduVar), this.zzb);
    }

    public final /* synthetic */ W5.u zzc(String str) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzkk)).booleanValue() || (!R5.t.g().V(str) && !R5.t.g().W(str))) {
            return this.zzd.b(str, null);
        }
        String zzb = this.zzg.zzb();
        Map hashMap = new HashMap();
        if (zzb != null) {
            hashMap.put((String) S5.D.c().zzd(zzbhe.zzkl), zzb);
        }
        return this.zzd.b(str, hashMap);
    }

    public final /* synthetic */ W5.v zzd() {
        return this.zzd;
    }

    public final /* synthetic */ zzfor zze() {
        return this.zzf;
    }
}
