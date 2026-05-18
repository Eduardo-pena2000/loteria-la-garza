package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;
import cb.a1;
import cb.c1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdg extends l implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j, zzsp zzspVar, e eVar) {
        super(2, eVar);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzspVar;
    }

    public final e create(Object obj, e eVar) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        zzen zzenVar;
        zzbd e;
        a1 e2;
        Exception e3;
        Object f = Ha.c.f();
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                t.b(obj);
            } catch (a1 e4) {
                e2 = e4;
                zzbd zzb = zzdt.zzb(this.zzc, e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
                zzenVar.zzb(zzb);
                throw zzb;
            } catch (zzbd e5) {
                e = e5;
                zzbd zzb2 = zzdt.zzb(this.zzc, e, e);
                zzenVar.zzb(zzb2);
                throw zzb2;
            } catch (Exception e6) {
                e3 = e6;
                zzbd zzb3 = zzdt.zzb(this.zzc, e3, new zzbd(zzbb.zzc, zzba.zzZ, e3.getMessage()));
                zzenVar.zzb(zzb3);
                throw zzb3;
            }
        } else {
            t.b(obj);
            zzen zzf = zzdt.zzf(this.zzc, this.zzd).zzf(28);
            try {
                long j = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzf, null);
                this.zza = zzf;
                this.zzb = 1;
                Object c = c1.c(j, zzdfVar, this);
                if (c == f) {
                    return f;
                }
                zzenVar = zzf;
                obj = c;
            } catch (Exception e7) {
                zzenVar = zzf;
                e3 = e7;
                zzbd zzb32 = zzdt.zzb(this.zzc, e3, new zzbd(zzbb.zzc, zzba.zzZ, e3.getMessage()));
                zzenVar.zzb(zzb32);
                throw zzb32;
            } catch (a1 e8) {
                zzenVar = zzf;
                e2 = e8;
                zzbd zzb4 = zzdt.zzb(this.zzc, e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
                zzenVar.zzb(zzb4);
                throw zzb4;
            } catch (zzbd e9) {
                zzenVar = zzf;
                e = e9;
                zzbd zzb22 = zzdt.zzb(this.zzc, e, e);
                zzenVar.zzb(zzb22);
                throw zzb22;
            }
        }
        return (zzsr) obj;
    }
}
