package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import cb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzea extends l implements Qa.l {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ x zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j, x xVar, e eVar) {
        super(1, eVar);
        this.zzc = zzecVar;
        this.zzd = j;
        this.zze = xVar;
    }

    public final e create(e eVar) {
        return new zzea(this.zzc, this.zzd, this.zze, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return create((e) obj).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        zzen zzenVar;
        zzbd e;
        zzen zzenVar2;
        Object f = Ha.c.f();
        int i = this.zzb;
        if (i == 0) {
            t.b(obj);
            zzen zzf = zzec.zzd(this.zzc).zzf(41);
            try {
                zzdt zzc = zzec.zzc(this.zzc);
                long j = this.zzd;
                this.zza = zzf;
                this.zzb = 1;
                Object zzo = zzc.zzo(j, this);
                if (zzo != f) {
                    zzenVar2 = zzf;
                    obj = zzo;
                }
                return f;
            } catch (zzbd e2) {
                zzenVar = zzf;
                e = e2;
                zzec.zzi(this.zzc, e);
                zzenVar.zzb(e);
                throw e;
            }
        }
        if (i != 1) {
            zzenVar = (zzen) this.zza;
            try {
                t.b(obj);
                zzenVar.zza();
                zzec.zzj(this.zzc, zzcm.zzb());
                return Ia.b.a(this.zze.o(I.a));
            } catch (zzbd e3) {
                e = e3;
                zzec.zzi(this.zzc, e);
                zzenVar.zzb(e);
                throw e;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            t.b(obj);
        } catch (zzbd e4) {
            e = e4;
            zzenVar = zzenVar2;
            zzec.zzi(this.zzc, e);
            zzenVar.zzb(e);
            throw e;
        }
        zzsc zzscVar = (zzsc) obj;
        zzec.zzh(this.zzc, zzscVar);
        zzdt zzc2 = zzec.zzc(this.zzc);
        long j2 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzc2.zzn(zzscVar, j2, this) != f) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            zzec.zzj(this.zzc, zzcm.zzb());
            return Ia.b.a(this.zze.o(I.a));
        }
        return f;
    }
}
