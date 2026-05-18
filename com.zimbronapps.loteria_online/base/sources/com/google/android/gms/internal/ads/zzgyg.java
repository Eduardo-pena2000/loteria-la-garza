package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zzgyg extends zzgzf implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    x7.e zza;
    Class zzb;
    Object zzc;

    public zzgyg(x7.e eVar, Class cls, Object obj) {
        eVar.getClass();
        this.zza = eVar;
        this.zzb = cls;
        this.zzc = obj;
    }

    public final void run() {
        zzhaq zzhaqVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((zzhaqVar == null) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = zzhaqVar instanceof zzhaq ? zzhaqVar.zzl() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String valueOf = String.valueOf(zzhaqVar.getClass());
                String valueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 19 + valueOf2.length() + 16);
                sb.append("Future type ");
                sb.append(valueOf);
                sb.append(" threw ");
                sb.append(valueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object zzs = th == null ? zzgzo.zzs(zzhaqVar) : null;
        if (th == null) {
            zza(zzs);
            return;
        }
        if (!cls.isInstance(th)) {
            zzk(zzhaqVar);
            return;
        }
        try {
            Object zzf = zzf(obj, th);
            this.zzb = null;
            this.zzc = null;
            zze(zzf);
        } catch (Throwable th2) {
            try {
                zzhag.zza(th2);
                zzb(th2);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public final String zzd() {
        String str;
        x7.e eVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zzd2 = super.zzd();
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
        if (cls == null || obj == null) {
            if (zzd2 != null) {
                return str.concat(zzd2);
            }
            return null;
        }
        int length = str.length();
        String obj3 = cls.toString();
        int length2 = obj3.length();
        String obj4 = obj.toString();
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 13 + obj4.length() + 1);
        sb2.append(str);
        sb2.append("exceptionType=[");
        sb2.append(obj3);
        sb2.append("], fallback=[");
        sb2.append(obj4);
        sb2.append("]");
        return sb2.toString();
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Throwable th) throws Exception;
}
