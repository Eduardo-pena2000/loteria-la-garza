package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeny implements zzgyw {
    private final zzfnu zza;
    private final zzdbh zzb;
    private final zzfqg zzc;
    private final zzfqk zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcwi zzg;
    private final zzenr zzh;
    private final zzekl zzi;
    private final Context zzj;
    private final zzfoo zzk;
    private final zzenb zzl;
    private final zzdxt zzm;

    public zzeny(Context context, zzfnu zzfnuVar, zzenr zzenrVar, zzdbh zzdbhVar, zzfqg zzfqgVar, zzfqk zzfqkVar, zzcwi zzcwiVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzekl zzeklVar, zzfoo zzfooVar, zzenb zzenbVar, zzdxt zzdxtVar) {
        this.zzj = context;
        this.zza = zzfnuVar;
        this.zzh = zzenrVar;
        this.zzb = zzdbhVar;
        this.zzc = zzfqgVar;
        this.zzd = zzfqkVar;
        this.zzg = zzcwiVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeklVar;
        this.zzk = zzfooVar;
        this.zzl = zzenbVar;
        this.zzm = zzdxtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String zzb(com.google.android.gms.internal.ads.zzfjc r5) {
        /*
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzgA
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.zzfjb r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfiu r5 = r5.zzb
            int r2 = r5.zzf
            if (r2 == 0) goto L61
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.zzbgv r2 = com.google.android.gms.internal.ads.zzbhe.zzgz
            com.google.android.gms.internal.ads.zzbhc r3 = S5.D.c()
            java.lang.Object r2 = r3.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L61
            goto L62
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L62
        L45:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 35
            r1.<init>(r0)
            java.lang.String r0 = "Received error HTTP response code: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L62
        L61:
            r1 = r0
        L62:
            com.google.android.gms.internal.ads.zzfit r5 = r5.zzj
            if (r5 == 0) goto L6b
            java.lang.String r5 = r5.zza()
            return r5
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeny.zzb(com.google.android.gms.internal.ads.zzfjc):java.lang.String");
    }

    public final /* synthetic */ x7.e zza(Object obj) throws Exception {
        int i;
        Bundle bundle;
        zzfjc zzfjcVar = (zzfjc) obj;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzfjcVar.zzb.zzd) != null) {
            this.zzm.zze().putAll(bundle);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcL)).booleanValue()) {
            this.zzm.zze().putLong(zzdxh.RENDERING_START.zza(), R5.t.o().a());
        }
        String zzb = zzb(zzfjcVar);
        zzekl zzeklVar = this.zzi;
        zzfjb zzfjbVar = zzfjcVar.zzb;
        zzfiu zzfiuVar = zzfjbVar.zzb;
        zzeklVar.zza(zzfiuVar);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzjE)).booleanValue() && (i = zzfiuVar.zzf) != 0 && (i < 200 || i >= 300)) {
            return zzgzo.zzc(new zzenv(3, zzb));
        }
        String str = zzfiuVar.zzq;
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzev)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfir zzfirVar : zzfjbVar.zza) {
                zzeklVar.zzb(zzfirVar);
                Iterator it = zzfirVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzeklVar.zze(zzfirVar, 0L, zzfkm.zzd(1, null, null));
                        break;
                    }
                    zzekg zza = this.zzg.zza(zzfirVar.zzb, (String) it.next());
                    if (zza == null || !zza.zza(zzfjcVar, zzfirVar)) {
                    }
                }
            }
        } else {
            zzeklVar.zzc(str, zzfjbVar.zza);
        }
        zzdbh zzdbhVar = this.zzb;
        zzcrz zzcrzVar = new zzcrz(zzfjcVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzdbhVar.zzq(zzcrzVar, executor);
        if (zzfiuVar.zzr > 1) {
            return this.zzl.zza(zzfjcVar);
        }
        String zzb2 = zzb(zzfjcVar);
        zzfnu zzfnuVar = this.zza;
        zzfno zzfnoVar = zzfno.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfnuVar);
        zzfnb zzi = zzfnf.zza(zzgzo.zzc(new zzenv(3, zzb2)), zzfnoVar, zzfnuVar).zzi();
        zzenr zzenrVar = this.zzh;
        zzenrVar.zza();
        int i2 = 0;
        for (zzfir zzfirVar2 : zzfjbVar.zza) {
            Iterator it2 = zzfirVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                zzekg zza2 = this.zzg.zza(zzfirVar2.zzb, str2);
                if (zza2 != null && zza2.zza(zzfjcVar, zzfirVar2)) {
                    zzfnl zza3 = zzfnuVar.zza(zzfno.RENDER_CONFIG_WATERFALL, zzi);
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i2);
                    sb.append("-");
                    sb.append(str2);
                    zzi = zza3.zza(sb.toString()).zzg(Throwable.class, new zzenx(this, zzfirVar2, zzfjcVar, zza2)).zzi();
                    break;
                }
            }
            i2++;
        }
        zzi.addListener(new zzenw(zzenrVar), executor);
        return zzi;
    }

    public final /* synthetic */ x7.e zzc(zzfir zzfirVar, zzfjc zzfjcVar, zzekg zzekgVar, Throwable th) {
        zzfoe zzn = zzfoe.zzn(this.zzj, 12);
        zzn.zzi(zzfirVar.zzE);
        zzn.zza();
        x7.e zzi = zzgzo.zzi(zzekgVar.zzb(zzfjcVar, zzfirVar), zzfirVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfjcVar, zzfirVar, zzi, this.zzc);
        zzfon.zzd(zzi, this.zzk, zzn);
        return zzi;
    }
}
