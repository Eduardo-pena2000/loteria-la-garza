package com.google.android.gms.internal.ads;

import S5.l2;
import V5.q0;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcdz implements zzbdy {
    final zzcdw zza;
    private final q0 zze;
    private final Object zzd = new Object();
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzcdx zzf = new zzcdx();

    public zzcdz(String str, q0 q0Var) {
        this.zza = new zzcdw(str, q0Var);
        this.zze = q0Var;
    }

    public final void zza(boolean z) {
        long a = R5.t.o().a();
        if (!z) {
            q0 q0Var = this.zze;
            q0Var.zzl(a);
            q0Var.j(this.zza.zzd);
            return;
        }
        q0 q0Var2 = this.zze;
        if (a - q0Var2.zzm() > ((Long) S5.D.c().zzd(zzbhe.zzbB)).longValue()) {
            this.zza.zzd = -1;
        } else {
            this.zza.zzd = q0Var2.zzo();
        }
        this.zzg = true;
    }

    public final void zzb(zzcdo zzcdoVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzcdoVar);
        }
    }

    public final void zzc(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final void zzd() {
        synchronized (this.zzd) {
            this.zza.zza();
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zzf(l2 l2Var, long j) {
        synchronized (this.zzd) {
            this.zza.zze(l2Var, j);
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zzg();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final int zzj() {
        int zzd;
        synchronized (this.zzd) {
            zzd = this.zza.zzd();
        }
        return zzd;
    }

    public final zzcdo zzk(E6.f fVar, String str) {
        return new zzcdo(fVar, this, this.zzf.zza(), str);
    }

    public final boolean zzl() {
        return this.zzg;
    }

    public final String zzm() {
        return this.zzf.zzb();
    }

    public final zzcdv zzn(Set set, String str) {
        return this.zza.zzi(set, str);
    }

    public final Bundle zzo(Context context, zzfks zzfksVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            HashSet hashSet2 = this.zzb;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zza.zzh(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzcdo) it2.next()).zzi());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzfksVar.zzb(hashSet);
        return bundle;
    }
}
