package com.google.android.gms.internal.firebase-auth-api;

import B7.g;
import J7.A;
import J7.O;
import J7.P;
import J7.S;
import J7.W;
import J7.d0;
import J7.e;
import J7.h;
import J7.j;
import K7.M;
import K7.d;
import K7.i0;
import K7.o;
import K7.s0;
import K7.w;
import K7.x;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzacq extends zzafo {
    public zzacq(g gVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzaeo(gVar, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task zza(g gVar, String str, String str2) {
        return zza((zzacp) new zzacp(str, str2).zza(gVar));
    }

    public final Task zzb(g gVar, String str, String str2) {
        return zza((zzacs) new zzacs(str, str2).zza(gVar));
    }

    public final Task zzc(g gVar, String str, String str2) {
        return zza((zzacw) new zzacw(str, str2).zza(gVar));
    }

    public final Task zzd(g gVar, A a, String str, i0 i0Var) {
        return zza((zzaeg) new zzaeg(str).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zza(g gVar, String str, String str2, String str3) {
        return zza((zzacr) new zzacr(str, str2, str3).zza(gVar));
    }

    public final Task zzb(g gVar, A a, h hVar, String str, i0 i0Var) {
        return zza((zzadg) new zzadg(hVar, str).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zzc(g gVar, A a, h hVar, String str, i0 i0Var) {
        return zza((zzadf) new zzadf(hVar, str).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zza(g gVar, String str, String str2, String str3, String str4, s0 s0Var) {
        return zza((zzacu) new zzacu(str, str2, str3, str4).zza(gVar).zza(s0Var));
    }

    public final Task zzd(g gVar, String str, String str2) {
        return zza((zzaek) new zzaek(str, str2).zza(gVar));
    }

    public final Task zzb(g gVar, A a, j jVar, String str, i0 i0Var) {
        return zza((zzadh) new zzadh(jVar, str).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zzc(g gVar, A a, String str, i0 i0Var) {
        return zza((zzaed) new zzaed(str).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zza(A a, x xVar) {
        return zza((zzact) new zzact().zza(a).zza((Object) xVar).zza((w) xVar));
    }

    public final Task zza(g gVar, P p, A a, String str, s0 s0Var) {
        zzagb.zza();
        zzacv zzacvVar = new zzacv(p, a.zze(), str, null);
        zzacvVar.zza(gVar).zza(s0Var);
        return zza(zzacvVar);
    }

    public final Task zzb(g gVar, A a, String str, String str2, String str3, String str4, i0 i0Var) {
        return zza((zzadj) new zzadj(str, str2, str3, str4).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zza(g gVar, W w, A a, String str, String str2, s0 s0Var) {
        zzacv zzacvVar = new zzacv(w, a.zze(), str, str2);
        zzacvVar.zza(gVar).zza(s0Var);
        return zza(zzacvVar);
    }

    public final Task zzb(g gVar, A a, O o, String str, i0 i0Var) {
        zzagb.zza();
        return zza((zzadl) new zzadl(o, str).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zza(g gVar, A a, P p, String str, s0 s0Var) {
        zzagb.zza();
        zzacy zzacyVar = new zzacy(p, str, null);
        zzacyVar.zza(gVar).zza(s0Var);
        if (a != null) {
            zzacyVar.zza(a);
        }
        return zza(zzacyVar);
    }

    public final Task zzb(g gVar, String str, e eVar, String str2, String str3) {
        eVar.U1(6);
        return zza((zzadp) new zzadp(str, eVar, str2, str3, "sendSignInLinkToEmail").zza(gVar));
    }

    public final Task zza(g gVar, A a, W w, String str, String str2, s0 s0Var) {
        zzacy zzacyVar = new zzacy(w, str, str2);
        zzacyVar.zza(gVar).zza(s0Var);
        if (a != null) {
            zzacyVar.zza(a);
        }
        return zza(zzacyVar);
    }

    public final Task zzb(g gVar, String str, String str2, String str3, String str4, s0 s0Var) {
        return zza((zzadw) new zzadw(str, str2, str3, str4).zza(gVar).zza(s0Var));
    }

    public final Task zza(g gVar, A a, String str, i0 i0Var) {
        return zza((zzacx) new zzacx(str).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zzb(g gVar, A a, String str, i0 i0Var) {
        t.l(gVar);
        t.f(str);
        t.l(a);
        t.l(i0Var);
        List zzg = a.zzg();
        if ((zzg != null && !zzg.contains(str)) || a.S1()) {
            return Tasks.forException(zzaen.zza(new Status(17016, str)));
        }
        str.hashCode();
        if (!str.equals("password")) {
            return zza((zzaee) new zzaee(str).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
        }
        return zza((zzaeb) new zzaeb().zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zza() {
        return zza(new zzada());
    }

    public final Task zza(String str, String str2) {
        return zza(new zzacz(str, str2));
    }

    public final Task zza(g gVar, A a, h hVar, String str, i0 i0Var) {
        t.l(gVar);
        t.l(hVar);
        t.l(a);
        t.l(i0Var);
        List zzg = a.zzg();
        if (zzg != null && zzg.contains(hVar.M1())) {
            return Tasks.forException(zzaen.zza(new Status(17015)));
        }
        if (hVar instanceof j) {
            j jVar = (j) hVar;
            if (!jVar.zzf()) {
                return zza((zzadc) new zzadc(jVar, str).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
            }
            return zza((zzadd) new zzadd(jVar).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
        }
        if (hVar instanceof O) {
            zzagb.zza();
            return zza((zzade) new zzade((O) hVar).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
        }
        t.l(gVar);
        t.l(hVar);
        t.l(a);
        t.l(i0Var);
        return zza((zzadb) new zzadb(hVar).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zza(g gVar, A a, j jVar, String str, i0 i0Var) {
        return zza((zzadi) new zzadi(jVar, str).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zza(g gVar, A a, String str, String str2, String str3, String str4, i0 i0Var) {
        return zza((zzadk) new zzadk(str, str2, str3, str4).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zza(g gVar, A a, O o, String str, i0 i0Var) {
        zzagb.zza();
        return zza((zzadm) new zzadm(o, str).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zza(g gVar, A a, i0 i0Var) {
        return zza((zzado) new zzado().zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zza(String str, String str2, String str3, String str4) {
        return zza(new zzadn(str, str2, str3, str4));
    }

    public final Task zza(g gVar, e eVar, String str) {
        return zza((zzadq) new zzadq(str, eVar).zza(gVar));
    }

    public final Task zza(g gVar, String str, e eVar, String str2, String str3) {
        eVar.U1(1);
        return zza((zzadp) new zzadp(str, eVar, str2, str3, "sendPasswordResetEmail").zza(gVar));
    }

    public final Task zza(String str) {
        return zza(new zzads(str));
    }

    public final Task zza(g gVar, s0 s0Var, String str) {
        return zza((zzadr) new zzadr(str).zza(gVar).zza(s0Var));
    }

    public final Task zza(g gVar, h hVar, String str, s0 s0Var) {
        return zza((zzadu) new zzadu(hVar, str).zza(gVar).zza(s0Var));
    }

    public final Task zza(g gVar, String str, String str2, s0 s0Var) {
        return zza((zzadt) new zzadt(str, str2).zza(gVar).zza(s0Var));
    }

    public final Task zza(g gVar, j jVar, String str, s0 s0Var) {
        return zza((zzadv) new zzadv(jVar, str).zza(gVar).zza(s0Var));
    }

    public final Task zza(g gVar, O o, String str, s0 s0Var) {
        zzagb.zza();
        return zza((zzady) new zzady(o, str).zza(gVar).zza(s0Var));
    }

    public final Task zza(o oVar, String str, String str2, long j, boolean z, boolean z2, String str3, String str4, String str5, boolean z3, b.b bVar, Executor executor, Activity activity) {
        zzadx zzadxVar = new zzadx(oVar, str, str2, j, z, z2, str3, str4, str5, z3);
        zzadxVar.zza(bVar, activity, executor, str);
        return zza(zzadxVar);
    }

    public final Task zza(o oVar, String str) {
        return zza(new zzaea(oVar, str));
    }

    public final Task zza(o oVar, S s, String str, long j, boolean z, boolean z2, String str2, String str3, String str4, boolean z3, b.b bVar, Executor executor, Activity activity) {
        zzadz zzadzVar = new zzadz(s, t.f(oVar.zzc()), str, j, z, z2, str2, str3, str4, z3);
        zzadzVar.zza(bVar, activity, executor, s.b());
        return zza(zzadzVar);
    }

    public final Task zza(g gVar, A a, String str, String str2, i0 i0Var) {
        return zza((zzaec) new zzaec(a.zze(), str, str2).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zza(g gVar, A a, O o, i0 i0Var) {
        zzagb.zza();
        return zza((zzaef) new zzaef(o).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zza(g gVar, A a, d0 d0Var, i0 i0Var) {
        return zza((zzaei) new zzaei(d0Var).zza(gVar).zza(a).zza((Object) i0Var).zza((w) i0Var));
    }

    public final Task zza(String str, String str2, e eVar) {
        eVar.U1(7);
        return zza(new zzaeh(str, str2, eVar));
    }

    public static K7.h zza(g gVar, zzahk zzahkVar) {
        t.l(gVar);
        t.l(zzahkVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d(zzahkVar, "firebase"));
        List zzl = zzahkVar.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i = 0; i < zzl.size(); i++) {
                arrayList.add(new d((zzaib) zzl.get(i)));
            }
        }
        K7.h hVar = new K7.h(gVar, arrayList);
        hVar.r2(new K7.j(zzahkVar.zzb(), zzahkVar.zza()));
        hVar.s2(zzahkVar.zzn());
        hVar.q2(zzahkVar.zze());
        hVar.n2(M.b(zzahkVar.zzk()));
        hVar.l2(zzahkVar.zzd());
        return hVar;
    }

    public final void zza(g gVar, zzaij zzaijVar, b.b bVar, Activity activity, Executor executor) {
        zza((zzaej) new zzaej(zzaijVar).zza(gVar).zza(bVar, activity, executor, zzaijVar.zzd()));
    }
}
