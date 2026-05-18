package com.google.android.gms.internal.ads;

import S5.s2;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzddu extends zzdhd implements zzdbz, zzdde {
    private final zzfir zzb;
    private final AtomicBoolean zzc;
    private final zzfjc zzd;

    public zzddu(Set set, zzfir zzfirVar, zzfjc zzfjcVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfirVar;
        this.zzd = zzfjcVar;
    }

    private final void zzb() {
        s2 s2Var;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzjb)).booleanValue() && this.zzc.compareAndSet(false, true) && (s2Var = this.zzb.zzae) != null && s2Var.a == 3) {
            zzs(new zzddt(s2Var));
        }
    }

    public final void zza(s2 s2Var) {
        if (b6.c.a(this.zzd) && this.zzb.zzaB) {
            zzs(new zzdds(s2Var));
        }
    }

    public final void zzdr() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }

    public final void zzl() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }
}
