package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zzgyn extends zzgzf implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    x7.e zza;
    Object zzb;

    public zzgyn(x7.e eVar, Object obj) {
        eVar.getClass();
        this.zza = eVar;
        this.zzb = obj;
    }

    public final void run() {
        x7.e eVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (eVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (eVar.isCancelled()) {
            zzk(eVar);
            return;
        }
        try {
            try {
                Object zzf = zzf(obj, zzgzo.zzs(eVar));
                this.zzb = null;
                zze(zzf);
            } catch (Throwable th) {
                try {
                    zzhag.zza(th);
                    zzb(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e) {
            zzb(e.getCause());
        } catch (Error e2) {
            zzb(e2);
        } catch (Exception e3) {
            zzb(e3);
        }
    }

    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public final String zzd() {
        String str;
        x7.e eVar = this.zza;
        Object obj = this.zzb;
        String zzd = super.zzd();
        if (eVar != null) {
            String obj2 = eVar.toString();
            StringBuilder sb = new StringBuilder(obj2.length() + 16);
            sb.append("inputFuture=[");
            sb.append(obj2);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (obj == null) {
            if (zzd != null) {
                return str.concat(zzd);
            }
            return null;
        }
        int length = str.length();
        String obj3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(length + 10 + obj3.length() + 1);
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(obj3);
        sb2.append("]");
        return sb2.toString();
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Object obj2) throws Exception;
}
