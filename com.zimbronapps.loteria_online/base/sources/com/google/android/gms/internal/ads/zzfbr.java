package com.google.android.gms.internal.ads;

import V5.q0;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfbr implements zzfax {
    private final q0 zza;
    private final Context zzb;
    private final zzgzy zzc;
    private final ScheduledExecutorService zzd;
    private final zzeke zze;
    private final zzfjk zzf;
    private final W5.a zzg;

    public zzfbr(q0 q0Var, Context context, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzeke zzekeVar, zzfjk zzfjkVar, W5.a aVar) {
        this.zza = q0Var;
        this.zzb = context;
        this.zzc = zzgzyVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzekeVar;
        this.zzf = zzfjkVar;
        this.zzg = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x7.e zza() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzlR
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lfb
            V5.q0 r0 = r5.zza
            boolean r0 = r0.zzz()
            if (r0 == 0) goto Lfb
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzlV
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzfjk r0 = r5.zzf
            L5.y$b r1 = L5.y.b.d
            int r1 = r1.a()
            S5.l2 r0 = r0.zzd
            int r0 = r0.y
            if (r0 == r1) goto Lfb
        L3a:
            W5.a r0 = r5.zzg
            int r0 = r0.c
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzlP
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto Lfb
            int r0 = android.os.Build.VERSION.SDK_INT
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzlQ
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto Lfb
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzlN
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L77
            goto La0
        L77:
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzlO
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L8a
            goto Lfb
        L8a:
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.content.Context r1 = r5.zzb
            java.lang.String r1 = r1.getPackageName()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lfb
        La0:
            com.google.android.gms.internal.ads.zzeke r0 = r5.zze     // Catch: java.lang.Exception -> Lc1
            r1 = 0
            x7.e r0 = r0.zza(r1)     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzlT     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()     // Catch: java.lang.Exception -> Lc1
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Exception -> Lc1
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> Lc1
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Lc1
            long r1 = (long) r1     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.ScheduledExecutorService r4 = r5.zzd     // Catch: java.lang.Exception -> Lc1
            x7.e r0 = com.google.android.gms.internal.ads.zzgzo.zzi(r0, r1, r3, r4)     // Catch: java.lang.Exception -> Lc1
            goto Lc6
        Lc1:
            r0 = move-exception
            x7.e r0 = com.google.android.gms.internal.ads.zzgzo.zzc(r0)
        Lc6:
            com.google.android.gms.internal.ads.zzgzy r1 = r5.zzc
            com.google.android.gms.internal.ads.zzgzg r0 = com.google.android.gms.internal.ads.zzgzg.zzw(r0)
            com.google.android.gms.internal.ads.zzfbq r2 = com.google.android.gms.internal.ads.zzfbq.zza
            x7.e r0 = com.google.android.gms.internal.ads.zzgzo.zzj(r0, r2, r1)
            com.google.android.gms.internal.ads.zzgzg r0 = (com.google.android.gms.internal.ads.zzgzg) r0
            com.google.android.gms.internal.ads.zzfbo r2 = new com.google.android.gms.internal.ads.zzfbo
            r2.<init>(r5)
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            x7.e r0 = com.google.android.gms.internal.ads.zzgzo.zzh(r0, r3, r2, r1)
            com.google.android.gms.internal.ads.zzgzg r0 = (com.google.android.gms.internal.ads.zzgzg) r0
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzlT
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.zzd
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            x7.e r0 = com.google.android.gms.internal.ads.zzgzo.zzi(r0, r1, r4, r3)
            return r0
        Lfb:
            com.google.android.gms.internal.ads.zzfbs r0 = new com.google.android.gms.internal.ads.zzfbs
            r1 = -1
            r2 = 0
            java.lang.String r3 = ""
            r0.<init>(r3, r1, r2)
            x7.e r0 = com.google.android.gms.internal.ads.zzgzo.zza(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbr.zza():x7.e");
    }

    public final int zzb() {
        return 56;
    }

    public final /* synthetic */ x7.e zzc(Throwable th) {
        this.zzc.zza(new zzfbp(th));
        return zzgzo.zza(th instanceof SecurityException ? new zzfbs("", 2, null) : th instanceof IllegalStateException ? new zzfbs("", 3, null) : th instanceof IllegalArgumentException ? new zzfbs("", 4, null) : th instanceof TimeoutException ? new zzfbs("", 5, null) : new zzfbs("", 0, null));
    }
}
