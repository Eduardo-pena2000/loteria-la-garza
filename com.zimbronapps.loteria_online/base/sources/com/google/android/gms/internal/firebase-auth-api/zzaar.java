package com.google.android.gms.internal.firebase-auth-api;

import J7.A0;
import J7.d0;
import J7.j;
import K7.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaar {
    private final zzaft zza;

    public zzaar(zzaft zzaftVar) {
        this.zza = (zzaft) t.l(zzaftVar);
    }

    public static /* bridge */ /* synthetic */ zzaft zza(zzaar zzaarVar) {
        return zzaarVar.zza;
    }

    public final void zzb(String str, String str2, zzael zzaelVar) {
        t.f(str);
        t.f(str2);
        t.l(zzaelVar);
        zza(str, new zzacj(this, str2, zzaelVar));
    }

    public final void zzc(String str, String str2, zzael zzaelVar) {
        t.f(str);
        t.f(str2);
        t.l(zzaelVar);
        zza(str, new zzacm(this, str2, zzaelVar));
    }

    public final void zzd(String str, String str2, zzael zzaelVar) {
        t.f(str);
        t.l(zzaelVar);
        this.zza.zza(new zzaic(str, null, str2), new zzabe(this, zzaelVar));
    }

    public final void zze(String str, String str2, zzael zzaelVar) {
        t.f(str);
        t.l(zzaelVar);
        this.zza.zza(new zzags(str, str2), new zzabc(this, zzaelVar));
    }

    public final void zzf(String str, zzael zzaelVar) {
        t.f(str);
        t.l(zzaelVar);
        zza(str, new zzabn(this, zzaelVar));
    }

    public static /* bridge */ /* synthetic */ void zza(zzaar zzaarVar, zzagx zzagxVar, zzael zzaelVar) {
        zzaarVar.zza(zzagxVar, zzaelVar);
    }

    public static /* bridge */ /* synthetic */ void zza(zzaar zzaarVar, zzahv zzahvVar, String str, String str2, Boolean bool, A0 a0, zzael zzaelVar, zzafs zzafsVar) {
        zzaarVar.zza(zzahvVar, null, str2, bool, null, zzaelVar, zzafsVar);
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzajd zzajdVar, zzael zzaelVar, zzafs zzafsVar) {
        Status a;
        if (zzajdVar.zzo()) {
            A0 zzb = zzajdVar.zzb();
            String zzc = zzajdVar.zzc();
            String zzj = zzajdVar.zzj();
            if (zzajdVar.zzm()) {
                a = new Status(17012);
            } else {
                a = q.a(zzajdVar.zzd());
            }
            zzaelVar.zza(new zzaap(a, zzb, zzc, zzj));
            return;
        }
        zzaarVar.zza(new zzahv(zzajdVar.zzi(), zzajdVar.zze(), Long.valueOf(zzajdVar.zza()), "Bearer"), zzajdVar.zzh(), zzajdVar.zzg(), Boolean.valueOf(zzajdVar.zzn()), zzajdVar.zzb(), zzaelVar, zzafsVar);
    }

    public final void zzf(String str, String str2, zzael zzaelVar) {
        t.f(str);
        t.f(str2);
        t.l(zzaelVar);
        zza(str2, new zzabq(this, str, zzaelVar));
    }

    private final void zzd(zzahm zzahmVar, zzael zzaelVar) {
        t.l(zzahmVar);
        t.l(zzaelVar);
        this.zza.zza(zzahmVar, new zzacf(this, zzaelVar));
    }

    public final void zzb(String str, zzael zzaelVar) {
        t.f(str);
        t.l(zzaelVar);
        this.zza.zza(new zzahj(str), new zzaau(this, zzaelVar));
    }

    public final void zzc(String str, zzael zzaelVar) {
        t.f(str);
        t.l(zzaelVar);
        zza(str, new zzacc(this, zzaelVar));
    }

    public final void zze(String str, zzael zzaelVar) {
        t.l(zzaelVar);
        this.zza.zza(new zzaim(str), new zzaci(this, zzaelVar));
    }

    public final void zzc(zzahm zzahmVar, zzael zzaelVar) {
        zzd(zzahmVar, zzaelVar);
    }

    public final void zzd(String str, zzael zzaelVar) {
        t.l(zzaelVar);
        this.zza.zza(str, new zzacg(this, zzaelVar));
    }

    public final void zzb(zzahm zzahmVar, zzael zzaelVar) {
        t.f(zzahmVar.zzc());
        t.l(zzaelVar);
        this.zza.zza(zzahmVar, new zzabb(this, zzaelVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzael zzaelVar) {
        t.f(str);
        t.f(str2);
        t.l(zzaelVar);
        this.zza.zza(new zzaje(str, str2, str3, str4), new zzaaw(this, zzaelVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzaim zzaimVar, zzafs zzafsVar) {
        t.l(zzaelVar);
        t.l(zzaimVar);
        t.l(zzafsVar);
        zzaarVar.zza.zza(zzaimVar, new zzabk(zzaarVar, zzaelVar, zzafsVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzahv zzahvVar, zzail zzailVar, zzafs zzafsVar) {
        t.l(zzaelVar);
        t.l(zzahvVar);
        t.l(zzailVar);
        t.l(zzafsVar);
        zzaarVar.zza.zza(new zzahi(zzahvVar.zzc()), new zzaax(zzaarVar, zzafsVar, zzaelVar, zzahvVar, zzailVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzahv zzahvVar, zzahk zzahkVar, zzail zzailVar, zzafs zzafsVar) {
        t.l(zzaelVar);
        t.l(zzahvVar);
        t.l(zzahkVar);
        t.l(zzailVar);
        t.l(zzafsVar);
        zzaarVar.zza.zza(zzailVar, new zzaba(zzaarVar, zzailVar, zzahkVar, zzaelVar, zzahvVar, zzafsVar));
    }

    public final void zza(String str, String str2, zzael zzaelVar) {
        t.f(str);
        t.l(zzaelVar);
        zzail zzailVar = new zzail();
        zzailVar.zze(str);
        zzailVar.zzh(str2);
        this.zza.zza(zzailVar, new zzacl(this, zzaelVar));
    }

    public final void zza(zzaic zzaicVar, zzael zzaelVar) {
        t.f(zzaicVar.zzb());
        t.l(zzaelVar);
        this.zza.zza(zzaicVar, new zzabg(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzael zzaelVar) {
        t.f(str);
        t.f(str2);
        t.l(zzaelVar);
        this.zza.zza(new zzaim(str, str2, null, str3, str4, null), new zzaat(this, zzaelVar));
    }

    public final void zza(String str, zzael zzaelVar) {
        t.f(str);
        t.l(zzaelVar);
        zza(str, new zzace(this, zzaelVar));
    }

    private final void zza(String str, zzafv zzafvVar) {
        t.l(zzafvVar);
        t.f(str);
        zzahv zzb = zzahv.zzb(str);
        if (zzb.zzg()) {
            zzafvVar.zza(zzb);
        } else {
            this.zza.zza(new zzahj(zzb.zzd()), new zzaco(this, zzafvVar));
        }
    }

    public final void zza(zzagz zzagzVar, String str, zzael zzaelVar) {
        t.l(zzagzVar);
        t.l(zzaelVar);
        zza(str, new zzabw(this, zzagzVar, zzaelVar));
    }

    public final void zza(zzahb zzahbVar, zzael zzaelVar) {
        t.l(zzahbVar);
        t.l(zzaelVar);
        this.zza.zza(zzahbVar, new zzaby(this, zzaelVar));
    }

    private final void zza(zzagx zzagxVar, zzael zzaelVar) {
        t.l(zzagxVar);
        t.l(zzaelVar);
        this.zza.zza(zzagxVar, new zzaay(this, zzaelVar));
    }

    private final void zza(zzahv zzahvVar, String str, String str2, Boolean bool, A0 a0, zzael zzaelVar, zzafs zzafsVar) {
        t.l(zzahvVar);
        t.l(zzafsVar);
        t.l(zzaelVar);
        this.zza.zza(new zzahi(zzahvVar.zzc()), new zzaaz(this, zzafsVar, str2, str, bool, a0, zzaelVar, zzahvVar));
    }

    public final void zza(zzaho zzahoVar, zzael zzaelVar) {
        t.l(zzahoVar);
        t.l(zzaelVar);
        this.zza.zza(zzahoVar, new zzabz(this, zzaelVar));
    }

    public final void zza(zzaht zzahtVar, zzael zzaelVar) {
        t.l(zzahtVar);
        t.l(zzaelVar);
        this.zza.zza(zzahtVar, new zzaca(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzael zzaelVar) {
        t.f(str);
        t.f(str2);
        t.f(str3);
        t.l(zzaelVar);
        zza(str3, new zzabh(this, str, str2, str4, str5, zzaelVar));
    }

    public final void zza(String str, zzajb zzajbVar, zzael zzaelVar) {
        t.f(str);
        t.l(zzajbVar);
        t.l(zzaelVar);
        zza(str, new zzabl(this, zzajbVar, zzaelVar));
    }

    public final void zza(String str, zzajg zzajgVar, zzael zzaelVar) {
        t.f(str);
        t.l(zzajgVar);
        t.l(zzaelVar);
        zza(str, new zzabj(this, zzajgVar, zzaelVar));
    }

    public final void zza(zzaie zzaieVar, zzael zzaelVar) {
        this.zza.zza(zzaieVar, new zzach(this, zzaelVar));
    }

    public final void zza(zzahm zzahmVar, zzael zzaelVar) {
        t.f(zzahmVar.zzd());
        t.l(zzaelVar);
        zzd(zzahmVar, zzaelVar);
    }

    public final void zza(zzaij zzaijVar, zzael zzaelVar) {
        t.f(zzaijVar.zzd());
        t.l(zzaelVar);
        this.zza.zza(zzaijVar, new zzabf(this, zzaelVar));
    }

    public final void zza(zzajb zzajbVar, zzael zzaelVar) {
        t.l(zzajbVar);
        t.l(zzaelVar);
        zzajbVar.zzb(true);
        this.zza.zza(zzajbVar, new zzabu(this, zzaelVar));
    }

    public final void zza(zzajc zzajcVar, zzael zzaelVar) {
        t.l(zzajcVar);
        t.l(zzaelVar);
        this.zza.zza(zzajcVar, new zzabd(this, zzaelVar));
    }

    public final void zza(j jVar, String str, zzael zzaelVar) {
        t.l(jVar);
        t.l(zzaelVar);
        if (jVar.zzg()) {
            zza(jVar.zzb(), new zzaav(this, jVar, str, zzaelVar));
        } else {
            zza(new zzagx(jVar, null, str), zzaelVar);
        }
    }

    public final void zza(zzajg zzajgVar, zzael zzaelVar) {
        t.l(zzajgVar);
        t.l(zzaelVar);
        this.zza.zza(zzajgVar, new zzabi(this, zzaelVar));
    }

    public final void zza(zzaio zzaioVar, zzael zzaelVar) {
        t.l(zzaioVar);
        t.l(zzaelVar);
        this.zza.zza(zzaioVar, new zzabt(this, zzaioVar, zzaelVar));
    }

    public final void zza(zzaiq zzaiqVar, zzael zzaelVar) {
        t.l(zzaiqVar);
        t.l(zzaelVar);
        this.zza.zza(zzaiqVar, new zzabx(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, zzael zzaelVar) {
        t.f(str);
        t.f(str2);
        t.l(zzaelVar);
        zza(str, new zzabs(this, str2, str3, zzaelVar));
    }

    public final void zza(String str, d0 d0Var, zzael zzaelVar) {
        t.f(str);
        t.l(d0Var);
        t.l(zzaelVar);
        zza(str, new zzack(this, d0Var, zzaelVar));
    }
}
