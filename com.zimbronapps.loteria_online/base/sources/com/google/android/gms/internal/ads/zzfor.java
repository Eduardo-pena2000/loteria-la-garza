package com.google.android.gms.internal.ads;

import V5.F0;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfor implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final W5.a zzf;
    private int zzi;
    private final zzdvm zzj;
    private final List zzk;
    private final zzclx zzl;
    private final zzcac zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfov zzg = zzfoy.zzb();
    private String zzh = "";
    private boolean zzm = false;

    public zzfor(Context context, W5.a aVar, zzdvm zzdvmVar, zzehb zzehbVar, zzcac zzcacVar, zzclx zzclxVar) {
        this.zze = context;
        this.zzf = aVar;
        this.zzj = zzdvmVar;
        this.zzn = zzcacVar;
        this.zzl = zzclxVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkg)).booleanValue()) {
            this.zzk = F0.X();
        } else {
            this.zzk = zzguf.zzi();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbix.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbix.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                booleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final void run() {
        byte[] zzaN;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfov zzfovVar = this.zzg;
                            zzaN = ((zzfoy) zzfovVar.zzbm()).zzaN();
                            zzfovVar.zzc();
                        }
                        new zzeha(this.zze, this.zzf.a, this.zzn, Binder.getCallingUid(), null).zzb(new zzegy((String) S5.D.c().zzd(zzbhe.zzka), 60000, new HashMap(), zzaN, "application/x-protobuf", false));
                    } catch (Exception e) {
                        if ((e instanceof zzecr) && ((zzecr) e).zza() == 3) {
                            return;
                        }
                        R5.t.l().zzh(e, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzb(zzfoh zzfohVar) {
        zzcei.zza.submit(new zzfoq(this, zzfohVar));
    }

    public final /* synthetic */ void zzc(zzfoh zzfohVar) {
        synchronized (zzd) {
            try {
                if (!this.zzm) {
                    this.zzm = true;
                    if (zza()) {
                        try {
                            R5.t.g();
                            this.zzh = F0.g0(this.zze);
                        } catch (RuntimeException | RemoteException e) {
                            R5.t.l().zzg(e, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.zzi = v6.h.f().a(this.zze);
                        int intValue = ((Integer) S5.D.c().zzd(zzbhe.zzkb)).intValue();
                        if (((Boolean) S5.D.c().zzd(zzbhe.zznp)).booleanValue()) {
                            long j = intValue;
                            zzcei.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j2 = intValue;
                            zzcei.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                        }
                        if (((Boolean) S5.D.c().zzd(zzbhe.zzkh)).booleanValue()) {
                            this.zzl.zza();
                        }
                    }
                }
            } finally {
            }
        }
        if (zza() && zzfohVar != null) {
            synchronized (zzc) {
                try {
                    zzfov zzfovVar = this.zzg;
                    if (zzfovVar.zza() >= ((Integer) S5.D.c().zzd(zzbhe.zzkc)).intValue()) {
                        return;
                    }
                    zzfos zza2 = zzfou.zza();
                    zza2.zzv(zzfohVar.zzm());
                    zza2.zza(zzfohVar.zzb());
                    zza2.zzb(zzfohVar.zza());
                    zza2.zzw(3);
                    zza2.zzd(this.zzf.a);
                    zza2.zze(this.zzh);
                    zza2.zzf(Build.VERSION.RELEASE);
                    zza2.zzg(Build.VERSION.SDK_INT);
                    zza2.zzx(zzfohVar.zzo());
                    zza2.zzi(zzfohVar.zzc());
                    zza2.zzj(this.zzi);
                    zza2.zzy(zzfohVar.zzn());
                    zza2.zzk(zzfohVar.zzd());
                    zza2.zzl(zzfohVar.zze());
                    zza2.zzm(zzfohVar.zzf());
                    zza2.zzn(this.zzj.zzd(zzfohVar.zzf()));
                    zza2.zzo(zzfohVar.zzg());
                    zza2.zzs(zzfohVar.zzh());
                    zza2.zzr(zzfohVar.zzk());
                    zza2.zzp(zzfohVar.zzi());
                    zza2.zzq(zzfohVar.zzj());
                    zza2.zzc(zzfohVar.zzl());
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzkg)).booleanValue()) {
                        zza2.zzh(this.zzk);
                    }
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzkh)).booleanValue()) {
                        zzclx zzclxVar = this.zzl;
                        zziff zzd2 = zzclxVar.zzd();
                        String zzc2 = zzclxVar.zzc();
                        if (zzd2 != null) {
                            zza2.zzt(zzd2);
                        }
                        if (zzc2 != null) {
                            zza2.zzu(zzc2);
                        }
                    }
                    zzfow zza3 = zzfox.zza();
                    zza3.zza(zza2);
                    zzfovVar.zzb(zza3);
                } finally {
                }
            }
        }
    }
}
