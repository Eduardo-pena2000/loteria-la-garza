package com.google.android.gms.internal.ads;

import S5.g1;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbva extends zzbuh {
    private final Y5.C zza;

    public zzbva(Y5.C c) {
        this.zza = c;
    }

    public final float zzA() {
        return this.zza.g();
    }

    public final float zzB() {
        return this.zza.f();
    }

    public final void zzC() {
        this.zza.a();
    }

    public final String zze() {
        return this.zza.i();
    }

    public final List zzf() {
        List<O5.d> k = this.zza.k();
        ArrayList arrayList = new ArrayList();
        if (k != null) {
            for (O5.d dVar : k) {
                arrayList.add(new zzbkd(dVar.getDrawable(), dVar.getUri(), dVar.getScale(), dVar.zza(), dVar.zzb(), null));
            }
        }
        return arrayList;
    }

    public final String zzg() {
        return this.zza.d();
    }

    public final zzbks zzh() {
        O5.d j = this.zza.j();
        if (j != null) {
            return new zzbkd(j.getDrawable(), j.getUri(), j.getScale(), j.zza(), j.zzb(), null);
        }
        return null;
    }

    public final String zzi() {
        return this.zza.e();
    }

    public final String zzj() {
        return this.zza.c();
    }

    public final double zzk() {
        Y5.C c = this.zza;
        if (c.p() != null) {
            return c.p().doubleValue();
        }
        return -1.0d;
    }

    public final String zzl() {
        return this.zza.q();
    }

    public final String zzm() {
        return this.zza.o();
    }

    public final g1 zzn() {
        Y5.C c = this.zza;
        if (c.J() != null) {
            return c.J().c();
        }
        return null;
    }

    public final zzbkl zzo() {
        return null;
    }

    public final N6.a zzp() {
        View b = this.zza.b();
        if (b == null) {
            return null;
        }
        return N6.b.s1(b);
    }

    public final N6.a zzq() {
        View K = this.zza.K();
        if (K == null) {
            return null;
        }
        return N6.b.s1(K);
    }

    public final N6.a zzr() {
        Object L = this.zza.L();
        if (L == null) {
            return null;
        }
        return N6.b.s1(L);
    }

    public final Bundle zzs() {
        return this.zza.h();
    }

    public final boolean zzt() {
        return this.zza.n();
    }

    public final boolean zzu() {
        return this.zza.m();
    }

    public final void zzv() {
        this.zza.t();
    }

    public final void zzw(N6.a aVar) {
        this.zza.r((View) N6.b.r1(aVar));
    }

    public final void zzx(N6.a aVar, N6.a aVar2, N6.a aVar3) {
        Map map = (HashMap) N6.b.r1(aVar2);
        Map map2 = (HashMap) N6.b.r1(aVar3);
        this.zza.F((View) N6.b.r1(aVar), map, map2);
    }

    public final void zzy(N6.a aVar) {
        this.zza.G((View) N6.b.r1(aVar));
    }

    public final float zzz() {
        return this.zza.l();
    }
}
