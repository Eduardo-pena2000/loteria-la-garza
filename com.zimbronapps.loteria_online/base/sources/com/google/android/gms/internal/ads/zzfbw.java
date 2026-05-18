package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfbw implements zzfax {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzcdm zzg;

    public zzfbw(zzcdm zzcdmVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzcdmVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    public final x7.e zza() {
        zzgzg zzw = zzgzg.zzw(this.zzg.zza(this.zza, this.zzd));
        zzfbv zzfbvVar = new zzfbv(this);
        Executor executor = this.zzc;
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzi((zzgzg) zzgzo.zzk(zzw, zzfbvVar, executor), ((Long) S5.D.c().zzd(zzbhe.zzbC)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfbu(this), executor);
    }

    public final int zzb() {
        return 40;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfbx zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzgah r0 = new com.google.android.gms.internal.ads.zzgah
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L1c
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzdW
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2f
            goto L6b
        L1c:
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzdX
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2f
            goto L6b
        L2f:
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.zzgal r1 = com.google.android.gms.internal.ads.zzgal.zzh(r0)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.String r2 = r8.getId()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzec     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.zzbhc r4 = S5.D.c()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.Object r0 = r4.zzd(r0)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            boolean r6 = r7.zzf     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.zzgah r0 = r1.zzj(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            goto L6b
        L5a:
            r0 = move-exception
            goto L5d
        L5c:
            r0 = move-exception
        L5d:
            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
            com.google.android.gms.internal.ads.zzcdu r2 = R5.t.l()
            r2.zzg(r0, r1)
            com.google.android.gms.internal.ads.zzgah r0 = new com.google.android.gms.internal.ads.zzgah
            r0.<init>()
        L6b:
            com.google.android.gms.internal.ads.zzfbx r1 = new com.google.android.gms.internal.ads.zzfbx
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbw.zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.google.android.gms.internal.ads.zzfbx");
    }

    public final /* synthetic */ zzfbx zzd(Throwable th) {
        S5.B.a();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzfbx(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzgah());
    }
}
