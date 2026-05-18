package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzct extends l implements p {
    Object zza;
    int zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzcv zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzcn zzg;
    final /* synthetic */ zzch zzh;
    final /* synthetic */ zzbi zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzct(zzcv zzcvVar, String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, e eVar) {
        super(2, eVar);
        this.zzd = zzcvVar;
        this.zze = str;
        this.zzf = j;
        this.zzg = zzcnVar;
        this.zzi = zzbiVar;
        this.zzh = zzchVar;
    }

    public final e create(Object obj, e eVar) {
        zzct zzctVar = new zzct(this.zzd, this.zze, this.zzf, this.zzg, this.zzi, this.zzh, eVar);
        zzctVar.zzc = obj;
        return zzctVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((zzek) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzcn zzcnVar;
        Object f = Ha.c.f();
        if (this.zzb != 0) {
            zzcnVar = (zzcn) this.zza;
            zzekVar = (zzek) this.zzc;
            t.b(obj);
        } else {
            t.b(obj);
            zzekVar = (zzek) this.zzc;
            zzdc zza = zzcv.zza(this.zzd, this.zze);
            if (zza != null) {
                return zza;
            }
            zzcv.zzc(this.zzd, this.zzf);
            zzcn zzcnVar2 = this.zzg;
            if (zzcnVar2 == null) {
                zzcnVar2 = zzcv.zze(this.zzd, this.zze, this.zzi, this.zzh, zzekVar);
            }
            long j = this.zzf;
            this.zzc = zzekVar;
            this.zza = zzcnVar2;
            this.zzb = 1;
            if (zzcnVar2.zzb(j, this) == f) {
                return f;
            }
            zzcnVar = zzcnVar2;
        }
        zzdc zzdcVar = new zzdc(zzcnVar, this.zze, this.zzi, zzekVar);
        zzcv.zzb(this.zzd, zzdcVar);
        return zzdcVar;
    }
}
