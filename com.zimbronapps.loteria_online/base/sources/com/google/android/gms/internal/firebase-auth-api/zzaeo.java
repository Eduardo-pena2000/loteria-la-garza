package com.google.android.gms.internal.firebase-auth-api;

import A6.a;
import B7.g;
import J7.I;
import J7.O;
import J7.P;
import J7.W;
import J7.Z;
import J7.d0;
import android.content.Context;
import com.google.android.gms.common.internal.t;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaeo {
    private static final a zza = new a("FirebaseAuth", new String[]{"FirebaseAuthFallback:"});
    private final zzaar zzb;
    private final zzagc zzc;

    public zzaeo(g gVar, ScheduledExecutorService scheduledExecutorService) {
        t.l(gVar);
        Context m = gVar.m();
        t.l(m);
        this.zzb = new zzaar(new zzafb(gVar, zzafc.zza()));
        this.zzc = new zzagc(m, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzaem zzaemVar) {
        t.f(str);
        t.l(zzaemVar);
        this.zzb.zza(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, String str2, zzaem zzaemVar) {
        t.f(str);
        t.f(str2);
        t.l(zzaemVar);
        this.zzb.zzb(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzc(String str, String str2, zzaem zzaemVar) {
        t.f(str);
        t.f(str2);
        t.l(zzaemVar);
        this.zzb.zzc(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzd(String str, String str2, zzaem zzaemVar) {
        t.f(str);
        t.l(zzaemVar);
        this.zzb.zzd(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zze(String str, String str2, zzaem zzaemVar) {
        t.f(str);
        this.zzb.zze(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzf(String str, String str2, zzaem zzaemVar) {
        t.f(str);
        t.f(str2);
        t.l(zzaemVar);
        this.zzb.zzf(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zze(String str, zzaem zzaemVar) {
        t.f(str);
        t.l(zzaemVar);
        this.zzb.zzf(str, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaic zzaicVar, zzaem zzaemVar) {
        t.l(zzaicVar);
        t.f(zzaicVar.zzb());
        t.l(zzaemVar);
        this.zzb.zza(zzaicVar, new zzael(zzaemVar, zza));
    }

    public final void zzd(String str, zzaem zzaemVar) {
        t.l(zzaemVar);
        this.zzb.zze(str, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, zzaem zzaemVar) {
        t.f(str);
        t.l(zzaemVar);
        this.zzb.zzb(str, new zzael(zzaemVar, zza));
    }

    public final void zzc(String str, zzaem zzaemVar) {
        t.f(str);
        t.l(zzaemVar);
        this.zzb.zzc(str, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzaem zzaemVar) {
        t.f(str);
        t.f(str2);
        t.l(zzaemVar);
        this.zzb.zza(str, str2, str3, str4, new zzael(zzaemVar, zza));
    }

    public final void zzb(zzahm zzahmVar, zzaem zzaemVar) {
        t.l(zzahmVar);
        t.f(zzahmVar.zzc());
        t.l(zzaemVar);
        this.zzb.zzb(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zzc(zzahm zzahmVar, zzaem zzaemVar) {
        t.l(zzahmVar);
        this.zzb.zzc(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, zzaem zzaemVar) {
        t.f(str);
        t.l(zzaemVar);
        this.zzb.zza(str, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzaem zzaemVar) {
        t.f(str);
        t.f(str2);
        t.l(zzaemVar);
        t.l(zzaemVar);
        this.zzb.zzb(str, str2, str3, str4, new zzael(zzaemVar, zza));
    }

    public final void zza(I i, String str, String str2, String str3, zzaem zzaemVar) {
        zzagz zza2;
        t.l(i);
        t.g(str, "cachedTokenState should not be empty.");
        t.l(zzaemVar);
        if (i instanceof P) {
            O a = ((P) i).a();
            zza2 = zzahd.zza(str, (String) t.l(a.zzc()), (String) t.l(a.P1()), str2, str3);
        } else if (i instanceof W) {
            W w = (W) i;
            zza2 = zzahf.zza(str, t.f(str2), t.f(((Z) t.l(w.a())).c()), t.f(w.c()), str3);
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        this.zzb.zza(zza2, str, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, I i, String str2, zzaem zzaemVar) {
        t.f(str);
        t.l(i);
        t.l(zzaemVar);
        if (i instanceof P) {
            O a = ((P) i).a();
            this.zzb.zza(zzahc.zza(str, (String) t.l(a.zzc()), (String) t.l(a.P1()), str2), new zzael(zzaemVar, zza));
        } else {
            if (i instanceof W) {
                W w = (W) i;
                this.zzb.zza(zzahe.zza(str, t.f(w.c()), str2, t.f(w.b())), new zzael(zzaemVar, zza));
                return;
            }
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
    }

    public final void zza(zzaho zzahoVar, zzaem zzaemVar) {
        t.l(zzahoVar);
        this.zzb.zza(zzahoVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaht zzahtVar, zzaem zzaemVar) {
        t.l(zzahtVar);
        this.zzb.zza(zzahtVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzaem zzaemVar) {
        t.f(str);
        t.f(str2);
        t.f(str3);
        t.l(zzaemVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, zzajb zzajbVar, zzaem zzaemVar) {
        t.f(str);
        t.l(zzajbVar);
        t.l(zzaemVar);
        this.zzb.zza(str, zzajbVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzahz zzahzVar, zzaem zzaemVar) {
        t.l(zzaemVar);
        t.l(zzahzVar);
        this.zzb.zza(t.f(zzahzVar.zzb()), zzahzVar.zza(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzaie zzaieVar, zzaem zzaemVar) {
        t.l(zzaieVar);
        this.zzb.zza(zzaieVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzahm zzahmVar, zzaem zzaemVar) {
        t.l(zzahmVar);
        t.f(zzahmVar.zzd());
        t.l(zzaemVar);
        this.zzb.zza(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaij zzaijVar, zzaem zzaemVar) {
        t.l(zzaemVar);
        t.l(zzaijVar);
        String zzd = zzaijVar.zzd();
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(zzd)) {
            if (zzaijVar.zze()) {
                this.zzc.zzb(zzd);
            } else {
                this.zzc.zzb(zzaelVar, zzd);
                return;
            }
        }
        long zzb = zzaijVar.zzb();
        boolean zzf = zzaijVar.zzf();
        if (zza(zzb, zzf)) {
            zzaijVar.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(zzd, zzaelVar, zzb, zzf);
        this.zzb.zza(zzaijVar, this.zzc.zza(zzaelVar, zzd));
    }

    public final void zza(zzain zzainVar, zzaem zzaemVar) {
        t.l(zzainVar);
        t.l(zzaemVar);
        this.zzb.zzd(zzainVar.zza(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzajb zzajbVar, zzaem zzaemVar) {
        t.l(zzajbVar);
        t.l(zzaemVar);
        this.zzb.zza(zzajbVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzajc zzajcVar, zzaem zzaemVar) {
        t.l(zzajcVar);
        t.l(zzaemVar);
        this.zzb.zza(zzajcVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzagx zzagxVar, zzaem zzaemVar) {
        t.l(zzaemVar);
        t.l(zzagxVar.zzb());
        this.zzb.zza(zzagxVar.zzb(), zzagxVar.zzc(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzaan zzaanVar, zzaem zzaemVar) {
        t.l(zzaemVar);
        t.l(zzaanVar);
        this.zzb.zza(zzafw.zza((O) t.l(zzaanVar.zza())), new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j, boolean z, boolean z2, String str4, String str5, String str6, boolean z3, zzaem zzaemVar) {
        t.g(str, "idToken should not be empty.");
        t.l(zzaemVar);
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(str2)) {
            if (z) {
                this.zzc.zzb(str2);
            } else {
                this.zzc.zzb(zzaelVar, str2);
                return;
            }
        }
        zzais zza2 = zzais.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j, z3)) {
            zza2.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzaelVar, j, z3);
        this.zzb.zza(zza2, this.zzc.zza(zzaelVar, str2));
    }

    public final void zza(zzaaq zzaaqVar, zzaem zzaemVar) {
        t.l(zzaaqVar);
        t.l(zzaemVar);
        String z = zzaaqVar.zzb().z();
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(z)) {
            if (zzaaqVar.zzh()) {
                this.zzc.zzb(z);
            } else {
                this.zzc.zzb(zzaelVar, z);
                return;
            }
        }
        long zza2 = zzaaqVar.zza();
        boolean zzi = zzaaqVar.zzi();
        zzaiq zza3 = zzaiq.zza(zzaaqVar.zze(), zzaaqVar.zzb().b(), zzaaqVar.zzb().z(), zzaaqVar.zzd(), zzaaqVar.zzg(), zzaaqVar.zzf(), zzaaqVar.zzc());
        if (zza(zza2, zzi)) {
            zza3.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(z, zzaelVar, zza2, zzi);
        this.zzb.zza(zza3, this.zzc.zza(zzaelVar, z));
    }

    public final void zza(zzaiu zzaiuVar, zzaem zzaemVar) {
        this.zzb.zza(zzaiuVar, new zzael((zzaem) t.l(zzaemVar), zza));
    }

    public final void zza(String str, String str2, String str3, zzaem zzaemVar) {
        t.g(str, "cachedTokenState should not be empty.");
        t.g(str2, "uid should not be empty.");
        t.l(zzaemVar);
        this.zzb.zza(str, str2, str3, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, d0 d0Var, zzaem zzaemVar) {
        t.f(str);
        t.l(d0Var);
        t.l(zzaemVar);
        this.zzb.zza(str, d0Var, new zzael(zzaemVar, zza));
    }

    private static boolean zza(long j, boolean z) {
        if (j > 0 && z) {
            return true;
        }
        zza.h("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
