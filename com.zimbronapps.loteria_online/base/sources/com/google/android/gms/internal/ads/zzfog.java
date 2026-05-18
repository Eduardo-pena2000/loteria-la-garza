package com.google.android.gms.internal.ads;

import S5.c1;
import V5.V0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfog implements zzfoe {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfot zzj = zzfot.zzb;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    public zzfog(Context context, int i) {
        this.zza = context;
        this.zzp = i;
    }

    public final /* synthetic */ long zzA() {
        return this.zzb;
    }

    public final /* synthetic */ long zzB() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    public final /* synthetic */ int zzD() {
        return this.zze;
    }

    public final /* synthetic */ String zzE() {
        return this.zzf;
    }

    public final /* synthetic */ String zzF() {
        return this.zzg;
    }

    public final /* synthetic */ String zzG() {
        return this.zzh;
    }

    public final /* synthetic */ String zzH() {
        return this.zzi;
    }

    public final /* synthetic */ zzfot zzI() {
        return this.zzj;
    }

    public final /* synthetic */ String zzJ() {
        return this.zzk;
    }

    public final /* synthetic */ String zzK() {
        return this.zzl;
    }

    public final /* synthetic */ String zzL() {
        return this.zzm;
    }

    public final synchronized zzfog zzM(int i) {
        this.zzq = i;
        return this;
    }

    public final /* synthetic */ int zzN() {
        return this.zzp;
    }

    public final /* synthetic */ int zzO() {
        return this.zzq;
    }

    public final /* synthetic */ int zzP() {
        return this.zzr;
    }

    public final /* bridge */ /* synthetic */ zzfoe zza() {
        zzq();
        return this;
    }

    public final synchronized boolean zzb() {
        return this.zzo;
    }

    public final /* bridge */ /* synthetic */ zzfoe zzc() {
        zzr();
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfoe zzd(boolean z) {
        zzs(z);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfoe zze(String str) {
        zzt(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfoe zzf(zzfot zzfotVar) {
        zzu(zzfotVar);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfoe zzg(zzfjb zzfjbVar) {
        zzv(zzfjbVar);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfoe zzh(c1 c1Var) {
        zzw(c1Var);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfoe zzi(String str) {
        zzx(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfoe zzj(Throwable th) {
        zzy(th);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfoe zzk(String str) {
        zzz(str);
        return this;
    }

    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    public final synchronized zzfoh zzm() {
        try {
            if (this.zzn) {
                return null;
            }
            this.zzn = true;
            if (!this.zzo) {
                zzq();
            }
            if (this.zzc < 0) {
                zzr();
            }
            return new zzfoh(this, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ zzfoe zzp(int i) {
        zzM(i);
        return this;
    }

    public final synchronized zzfog zzq() {
        Configuration configuration;
        V0 j = R5.t.j();
        Context context = this.zza;
        this.zze = j.k(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i;
        this.zzb = R5.t.o().b();
        this.zzo = true;
        return this;
    }

    public final synchronized zzfog zzr() {
        this.zzc = R5.t.o().b();
        return this;
    }

    public final synchronized zzfog zzs(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfog zzt(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfog zzu(zzfot zzfotVar) {
        this.zzj = zzfotVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r2.zzg = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzfog zzv(com.google.android.gms.internal.ads.zzfjb r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfiu r0 = r3.zzb     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> Le
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L10
            r2.zzf = r0     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r3 = move-exception
            goto L2e
        L10:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Le
        L16:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.internal.ads.zzfir r0 = (com.google.android.gms.internal.ads.zzfir) r0     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.zzab     // Catch: java.lang.Throwable -> Le
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L16
            r2.zzg = r0     // Catch: java.lang.Throwable -> Le
        L2c:
            monitor-exit(r2)
            return r2
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfog.zzv(com.google.android.gms.internal.ads.zzfjb):com.google.android.gms.internal.ads.zzfog");
    }

    public final synchronized zzfog zzw(c1 c1Var) {
        try {
            zzday zzdayVar = c1Var.e;
            if (zzdayVar != null) {
                zzday zzdayVar2 = zzdayVar;
                String zzk = zzdayVar2.zzk();
                if (!TextUtils.isEmpty(zzk)) {
                    this.zzf = zzk;
                }
                String zzf = zzdayVar2.zzf();
                if (!TextUtils.isEmpty(zzf)) {
                    this.zzg = zzf;
                }
            }
        } finally {
        }
        return this;
    }

    public final synchronized zzfog zzx(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfog zzy(Throwable th) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkf)).booleanValue()) {
            this.zzl = zzbyp.zzf(th);
            this.zzk = (String) zzgrr.zza(zzgqq.zzc('\n')).zzd(zzbyp.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfog zzz(String str) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkf)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }
}
