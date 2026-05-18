package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgaz {
    private final zzgdf zza;
    private final zzgeg zzb;
    private final zzgmz zzc;
    private final zzgoe zzd;
    private final zzgcl zze;
    private final long zzf;
    private final zzika zzg;
    private final long zzh;
    private final long zzi = System.currentTimeMillis();
    private final boolean zzj;
    private final long zzk;

    public zzgaz(zzgdf zzgdfVar, zzgeg zzgegVar, zzgmz zzgmzVar, zzgoe zzgoeVar, zzgcl zzgclVar, zzika zzikaVar, zzgbf zzgbfVar) {
        this.zza = zzgdfVar;
        this.zzb = zzgegVar;
        this.zzc = zzgmzVar;
        this.zzd = zzgoeVar;
        this.zze = zzgclVar;
        this.zzf = zzgbfVar.zzh();
        this.zzg = zzikaVar;
        this.zzh = zzgbfVar.zzg();
        this.zzj = zzgbfVar.zzq();
        this.zzk = zzgbfVar.zzp();
    }

    public final x7.e zza() {
        return this.zza.zza();
    }

    public final String zzb(Context context) {
        String str;
        boolean z = false;
        if (this.zzj) {
            if (System.currentTimeMillis() - this.zzi <= this.zzk) {
                z = true;
            }
        }
        zzgoc zza = this.zzd.zza(3);
        try {
            try {
                try {
                    zza.zza();
                    str = (String) zzgzo.zzj(this.zza.zzb(), new zzgay(this, context), zzhaf.zza()).get(z ? this.zzh : this.zzf, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    if (z) {
                        str = ((zzghi) this.zzg.zzb()).zza(true, this.zzi);
                    } else {
                        this.zzd.zzb(56);
                        str = Integer.toString(17);
                    }
                } catch (Throwable th) {
                    zza.zzb(th);
                    throw th;
                }
            } catch (ExecutionException e) {
                e = e;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                zza.zzb(e);
                str = Integer.toString(3);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                zza.zzb(e2);
                str = "";
            }
            zza.zzc();
            this.zze.zzb();
            return str;
        } catch (Throwable th2) {
            zza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    public final String zzc(Context context, String str, View view, Activity activity) {
        String str2;
        zzgoc zza = this.zzd.zza(4);
        try {
            try {
                try {
                    try {
                        zza.zza();
                        str2 = (String) zzgzo.zzj(this.zza.zzb(), new zzgaw(this, context, null, view, activity), zzhaf.zza()).get(this.zzf, TimeUnit.MILLISECONDS);
                    } catch (Throwable th) {
                        zza.zzb(th);
                        throw th;
                    }
                } catch (ExecutionException e) {
                    e = e;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zza.zzb(e);
                    str2 = Integer.toString(3);
                }
            } catch (TimeoutException unused) {
                this.zzd.zzb(57);
                str2 = Integer.toString(17);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                zza.zzb(e2);
                str2 = "";
            }
            zza.zzc();
            this.zze.zzb();
            return str2;
        } catch (Throwable th2) {
            zza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    public final String zzd(Context context, String str, View view, Activity activity) {
        String str2;
        zzgoc zza = this.zzd.zza(5);
        try {
            try {
                try {
                    try {
                        zza.zza();
                        str2 = (String) zzgzo.zzj(this.zza.zzb(), new zzgax(this, context, str, view, null), zzhaf.zza()).get(this.zzf, TimeUnit.MILLISECONDS);
                    } catch (Throwable th) {
                        zza.zzb(th);
                        throw th;
                    }
                } catch (ExecutionException e) {
                    e = e;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zza.zzb(e);
                    str2 = Integer.toString(3);
                }
            } catch (TimeoutException unused) {
                this.zzd.zzb(58);
                str2 = Integer.toString(17);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                zza.zzb(e2);
                str2 = "";
            }
            zza.zzc();
            this.zze.zzb();
            return str2;
        } catch (Throwable th2) {
            zza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    public final /* synthetic */ x7.e zzg(Context context, Void r2) {
        return this.zzb.zzb(context);
    }

    public final /* synthetic */ x7.e zzh(Context context, String str, View view, Activity activity, Void r5) {
        return this.zzb.zzc(context, null, view, activity);
    }

    public final /* synthetic */ x7.e zzi(Context context, String str, View view, Activity activity, Void r5) {
        return this.zzb.zzd(context, str, view, null);
    }

    public final int zzj() {
        return this.zzb.zzh();
    }
}
