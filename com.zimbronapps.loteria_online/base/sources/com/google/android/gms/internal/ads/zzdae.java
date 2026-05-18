package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdae implements U5.E {
    private final zzfjc zzc;
    private final zzfir zzd;
    private final E6.f zze;
    private final zzdxz zzf;
    private final ScheduledExecutorService zzg;
    private final Object zzb = new Object();
    final zzfpk zza = zzfpl.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    public zzdae(zzfjc zzfjcVar, zzfir zzfirVar, E6.f fVar, zzdxz zzdxzVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzfjcVar;
        this.zzd = zzfirVar;
        this.zze = fVar;
        this.zzf = zzdxzVar;
        this.zzg = scheduledExecutorService;
    }

    private final void zzn() {
        synchronized (this.zzb) {
            try {
                zzdxz zzdxzVar = this.zzf;
                String str = this.zzc.zzb.zzb.zzb;
                String encodeToString = Base64.encodeToString(((zzfpl) this.zza.zzbu()).zzaN(), 1);
                if (((Boolean) S5.D.c().zzd(zzbhe.zzop)).booleanValue()) {
                    zzdxy zza = zzdxzVar.zza();
                    zza.zzc("action", "pclma");
                    zza.zzc("pclmd", encodeToString);
                    zza.zzc("gqi", str);
                    zza.zzf();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzo(int i) {
        synchronized (this.zzb) {
            try {
                if (!this.zzi && this.zzh) {
                    zzfpk zzfpkVar = this.zza;
                    zzfoc zza = zzfod.zza();
                    zza.zzb(i);
                    zza.zza(this.zze.a());
                    zzfpkVar.zza((zzfod) zza.zzbu());
                    if (i == 10) {
                        zzn();
                        this.zzi = true;
                    }
                }
            } finally {
            }
        }
    }

    public final void zzdS() {
    }

    public final void zzdT(int i) {
    }

    public final void zzdo() {
        zzo(3);
    }

    public final void zzdp() {
        zzo(5);
    }

    public final void zzdq() {
        zzo(4);
    }

    public final void zzdv() {
        zzo(7);
    }

    public final void zzdw() {
        zzo(8);
    }

    public final void zzdx() {
        zzo(6);
    }

    public final void zzdy() {
        zzo(9);
    }

    public final void zzdz() {
        zzo(10);
    }

    public final void zzh() {
    }

    public final void zzl() {
        synchronized (this.zzb) {
            if (this.zzd.zzaE > 0 && !this.zzh) {
                this.zza.zzb(this.zze.a());
                this.zzh = true;
                this.zzg.schedule(new zzdad(this), this.zzd.zzaE, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            try {
                if (this.zzi) {
                    return;
                }
                this.zzi = true;
                zzn();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
