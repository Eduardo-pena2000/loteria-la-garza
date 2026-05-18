package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzevl implements zzfax {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(Boolean.FALSE);
    private final E6.f zzc;
    private final Executor zzd;
    private final zzfax zze;
    private final long zzf;
    private final zzdxz zzg;

    public zzevl(zzfax zzfaxVar, long j, E6.f fVar, Executor executor, zzdxz zzdxzVar) {
        this.zzc = fVar;
        this.zze = zzfaxVar;
        this.zzf = j;
        this.zzd = executor;
        this.zzg = zzdxzVar;
    }

    public final x7.e zza() {
        zzevi zzeviVar;
        zzevi zzeviVar2;
        if (((Boolean) S5.D.c().zzd(zzbhe.zznk)).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zznj)).booleanValue() && !((Boolean) this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcei.zzd;
                zzevk zzevkVar = new zzevk(this);
                long j = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(zzevkVar, j, j, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.zza;
                    zzeviVar = (zzevi) atomicReference.get();
                    if (zzeviVar == null) {
                        zzevi zzeviVar3 = new zzevi(this.zze.zza(), this.zzf, this.zzc);
                        atomicReference.set(zzeviVar3);
                        return zzeviVar3.zza;
                    }
                    if (!((Boolean) this.zzb.get()).booleanValue() && zzeviVar.zza()) {
                        x7.e eVar = zzeviVar.zza;
                        zzfax zzfaxVar = this.zze;
                        zzeviVar2 = new zzevi(zzfaxVar.zza(), this.zzf, this.zzc);
                        this.zza.set(zzeviVar2);
                        if (((Boolean) S5.D.c().zzd(zzbhe.zznl)).booleanValue()) {
                            if (((Boolean) S5.D.c().zzd(zzbhe.zznm)).booleanValue()) {
                                zzdxy zza = this.zzg.zza();
                                zza.zzc("action", "scs");
                                zza.zzc("sid", String.valueOf(zzfaxVar.zzb()));
                                zza.zzd();
                            }
                            return eVar;
                        }
                        zzeviVar = zzeviVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.zza;
            zzeviVar = (zzevi) atomicReference2.get();
            if (zzeviVar == null || zzeviVar.zza()) {
                zzfax zzfaxVar2 = this.zze;
                zzeviVar2 = new zzevi(zzfaxVar2.zza(), this.zzf, this.zzc);
                atomicReference2.set(zzeviVar2);
                zzeviVar = zzeviVar2;
            }
        }
        return zzeviVar.zza;
    }

    public final int zzb() {
        return this.zze.zzb();
    }

    public final /* synthetic */ void zzc() {
        this.zzd.execute(new zzevj(this));
    }

    public final /* synthetic */ void zzd() {
        this.zza.set(new zzevi(this.zze.zza(), this.zzf, this.zzc));
    }
}
