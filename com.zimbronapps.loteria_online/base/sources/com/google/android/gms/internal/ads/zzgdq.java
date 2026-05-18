package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgdq implements zzgdh, zzgdd, zzgdw {
    private static final zzifd zza;
    private final Context zzb;
    private final zzgcl zzc;
    private final ExecutorService zzd;
    private final zzgce zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private final double zzj;
    private final String zzk;
    private final long zzl;
    private final AtomicBoolean zzm = new AtomicBoolean(false);
    private final Object zzn = new Object();
    private final Object zzo = new Object();
    private final Object zzp = new Object();
    private final zzavj zzq = zzavk.zza();
    private final List zzr = new ArrayList();
    private boolean zzs = false;
    private final HashMap zzt = new HashMap();

    static {
        zzifc zzc = zzifd.zzc();
        zzc.zza(17);
        zza = (zzifd) zzc.zzbm();
    }

    public zzgdq(Context context, zzgcl zzgclVar, ExecutorService executorService, zzgce zzgceVar, Random random, String str, long j, long j2, double d, String str2, long j3) {
        this.zzb = context;
        this.zzc = zzgclVar;
        this.zzd = executorService;
        this.zze = zzgceVar;
        this.zzg = str;
        this.zzh = j;
        this.zzi = j2;
        this.zzj = d;
        this.zzk = str2;
        this.zzl = j3;
        this.zzf = random.nextDouble() < d;
    }

    public final x7.e zza() {
        return zzgzo.zze(new zzgdo(this), this.zzd);
    }

    public final void zzb(int i, long j, Throwable th, String str) {
        long longValue;
        if (this.zzf) {
            synchronized (this.zzo) {
                try {
                    List list = this.zzr;
                    synchronized (this.zzp) {
                        try {
                            HashMap hashMap = this.zzt;
                            Integer valueOf = Integer.valueOf(i);
                            Long l = (Long) hashMap.get(valueOf);
                            if (l == null) {
                                l = 0L;
                            }
                            longValue = l.longValue() + 1;
                            hashMap.put(valueOf, Long.valueOf(longValue));
                        } finally {
                        }
                    }
                    list.add(new zzgdn(i, j, th, str, longValue));
                    if (!this.zzs) {
                        this.zzs = true;
                        this.zzc.zza(new zzgdp(this), this.zzi);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void zzc(zzgdv zzgdvVar) {
        synchronized (this.zzn) {
            this.zzq.zzj(zzgdvVar.zza());
        }
    }

    public final void zzd() {
        zzavj zzavjVar;
        zzguf zzq;
        String str;
        synchronized (this.zzn) {
            zzavjVar = (zzavj) this.zzq.zzbk();
        }
        synchronized (this.zzo) {
            List list = this.zzr;
            zzq = zzguf.zzq(list);
            list.clear();
            this.zzs = false;
        }
        int size = zzq.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            zzgdn zzgdnVar = (zzgdn) zzq.get(i);
            if (i2 >= this.zzh) {
                zze((zzavk) zzavjVar.zzbm());
                zzavjVar.zzb();
                i2 = 0;
            }
            zzawb zza2 = zzawc.zza();
            zza2.zza(zzgdnVar.zza);
            zza2.zzb(zzgdnVar.zzb);
            zza2.zze(zzgdnVar.zze);
            String str2 = zzgdnVar.zzd;
            if (str2 != null) {
                zza2.zzf(str2);
            }
            Throwable th = zzgdnVar.zzc;
            zza2.zzg(th == null ? 2 : 3);
            if (th != null) {
                zza2.zzc(th.getClass().getName());
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th.printStackTrace(printWriter);
                            str = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                        } catch (Throwable th2) {
                            try {
                                printWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            stringWriter.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (IOException unused) {
                    str = "";
                }
                zza2.zzd(str);
            }
            zzavjVar.zza((zzawc) zza2.zzbm());
            i++;
            i2++;
        }
        if (i2 > 0) {
            zze((zzavk) zzavjVar.zzbm());
            zzavjVar.zzb();
        }
    }

    public final void zze(zzavk zzavkVar) {
        try {
            zzgdl zza2 = zzgdm.zza();
            zza2.zzb(zza);
            zzgdj zza3 = zzgdk.zza();
            zza3.zza(zzavkVar);
            zza2.zza((zzgdk) zza3.zzbm());
            this.zze.zzb(this.zzg, ((zzgdm) zza2.zzbm()).zzaN(), "application/x-protobuf");
        } catch (RuntimeException unused) {
        }
    }

    public final /* synthetic */ void zzf() {
        int i;
        if (!this.zzf || this.zzm.getAndSet(true)) {
            return;
        }
        Context context = this.zzb;
        String str = this.zzk;
        double d = this.zzj;
        long j = this.zzl;
        Locale locale = Locale.getDefault();
        zzavj zza2 = zzavk.zza();
        zza2.zzc(Build.VERSION.SDK_INT);
        zza2.zzd(Build.MODEL);
        zza2.zze(locale.getLanguage());
        zza2.zzf(locale.getCountry());
        zza2.zzi(str);
        zza2.zzg(context.getPackageName());
        zza2.zzl(j);
        if (d > 0.0d) {
            zza2.zzk((int) (1.0d / d));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            zza2.zzh(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            zza2.zzm(i);
        } catch (RuntimeException unused2) {
        }
        zzavk zzavkVar = (zzavk) zza2.zzbm();
        synchronized (this.zzn) {
            this.zzq.zzbo(zzavkVar);
        }
    }
}
