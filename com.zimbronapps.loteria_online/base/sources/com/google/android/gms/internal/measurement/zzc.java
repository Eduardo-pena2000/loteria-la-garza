package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzc {
    final zzf zza;
    zzg zzb;
    final zzab zzc;
    private final zzz zzd;

    public zzc() {
        zzf zzfVar = new zzf();
        this.zza = zzfVar;
        this.zzb = zzfVar.zzb.zzc();
        this.zzc = new zzab();
        this.zzd = new zzz();
        zzfVar.zzd.zza("internal.registerCallback", new zzb(this));
        zzfVar.zzd.zza("internal.eventLogger", new zza(this));
    }

    public final void zza(String str, Callable callable) {
        this.zza.zzd.zza(str, callable);
    }

    public final boolean zzb(zzaa zzaaVar) throws zzd {
        try {
            zzab zzabVar = this.zzc;
            zzabVar.zzb(zzaaVar);
            this.zza.zzc.zze("runtime.counter", new zzah(Double.valueOf(0.0d)));
            this.zzd.zzb(this.zzb.zzc(), zzabVar);
            if (zzc()) {
                return true;
            }
            return zzd();
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean zzc() {
        zzab zzabVar = this.zzc;
        return !zzabVar.zzc().equals(zzabVar.zza());
    }

    public final boolean zzd() {
        return !this.zzc.zzf().isEmpty();
    }

    public final zzab zze() {
        return this.zzc;
    }

    public final void zzf(zzja zzjaVar) throws zzd {
        zzai zzaiVar;
        try {
            zzf zzfVar = this.zza;
            this.zzb = zzfVar.zzb.zzc();
            if (zzfVar.zza(this.zzb, (zzje[]) zzjaVar.zza().toArray(new zzje[0])) instanceof zzag) {
                throw new IllegalStateException("Program loading failed");
            }
            for (zziy zziyVar : zzjaVar.zzb().zza()) {
                List zzb = zziyVar.zzb();
                String zza = zziyVar.zza();
                Iterator it = zzb.iterator();
                while (it.hasNext()) {
                    zzao zza2 = zzfVar.zza(this.zzb, (zzje) it.next());
                    if (!(zza2 instanceof zzal)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    zzg zzgVar = this.zzb;
                    if (zzgVar.zzd(zza)) {
                        zzao zzh = zzgVar.zzh(zza);
                        if (!(zzh instanceof zzai)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(zza)));
                        }
                        zzaiVar = (zzai) zzh;
                    } else {
                        zzaiVar = null;
                    }
                    if (zzaiVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(zza)));
                    }
                    zzaiVar.zza(this.zzb, Collections.singletonList(zza2));
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final /* synthetic */ zzai zzg() {
        return new zzv(this.zzd);
    }
}
