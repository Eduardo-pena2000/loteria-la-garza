package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgoa implements zzgnb, zzgdd {
    static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private final Context zzb;
    private final ExecutorService zzc;
    private final String[] zzd;
    private long zze = 0;
    private long zzf = 0;
    private long zzg = -1;
    private boolean zzh = false;

    public zzgoa(Context context, zzgao zzgaoVar, ExecutorService executorService, String[] strArr) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = strArr;
    }

    public final x7.e zza() {
        return Build.VERSION.SDK_INT < 30 ? zzgzo.zzb() : zzgzo.zze(new zzgnz(this), this.zzc);
    }

    public final void zzb(Map map) {
        long j;
        long j2;
        zze();
        synchronized (this) {
            try {
                j = this.zzh ? this.zzf - this.zze : -1L;
            } finally {
            }
        }
        map.put("vs", Long.valueOf(j));
        synchronized (this) {
            j2 = this.zzg;
            this.zzg = -1L;
        }
        map.put("vf", Long.valueOf(j2));
    }

    public final void zzc(Map map, Context context, View view) {
        zze();
    }

    public final void zzd(Map map) {
        zze();
    }

    public final void zze() {
        synchronized (this) {
            try {
                if (this.zzh) {
                    this.zzf = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzf() {
        zzgny zzgnyVar = new zzgny(this);
        try {
            Object systemService = this.zzb.getSystemService("appops");
            if (systemService == null) {
                throw null;
            }
            n.a((AppOpsManager) systemService, this.zzd, this.zzc, zzgnyVar);
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void zzg(long j) {
        this.zze = j;
    }

    public final /* synthetic */ long zzh() {
        return this.zzf;
    }

    public final /* synthetic */ void zzi(long j) {
        this.zzg = j;
    }

    public final /* synthetic */ void zzj(boolean z) {
        this.zzh = z;
    }
}
