package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgkc implements zzgjf {
    private final zzgmu zza;
    private final zzgmg zzb;
    private final ExecutorService zzc;
    private final zzgmz zzd;
    private final zzgoe zze;
    private final Object zzf = new Object();
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private zzgkb zzj;

    public zzgkc(zzikv zzikvVar, zzgmu zzgmuVar, zzgmg zzgmgVar, zzgmz zzgmzVar, zzgoe zzgoeVar, zzgbf zzgbfVar, ExecutorService executorService) {
        this.zza = zzgmuVar;
        this.zzb = zzgmgVar;
        this.zzc = executorService;
        this.zzd = zzgmzVar;
        this.zze = zzgoeVar;
        this.zzg = zzgbfVar.zzb();
        this.zzh = zzgbfVar.zzk();
        this.zzi = zzgbfVar.zzj();
    }

    private final String zzq(Map map) throws zzatt, zzatp {
        String zzb;
        zzgoe zzgoeVar = this.zze;
        try {
            zzgoeVar.zza(20110).zza();
            synchronized (this.zzf) {
                try {
                    zzgkb zzgkbVar = this.zzj;
                    if (zzgkbVar == null) {
                        zzgoeVar.zzb(20109);
                        zzb = "";
                    } else {
                        zzb = zzgkbVar.zzb(map);
                    }
                } finally {
                }
            }
            return zzb;
        } finally {
        }
    }

    public final String zza() {
        synchronized (this.zzf) {
            try {
                zzgkb zzgkbVar = this.zzj;
                if (zzgkbVar == null) {
                    return "3.825731049.-1";
                }
                return zzgkbVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final x7.e zzb() {
        zzgzg zzw = zzgzg.zzw(this.zzb.zzb());
        zzgka zzgkaVar = zzgka.zza;
        ExecutorService executorService = this.zzc;
        return (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzw, Throwable.class, zzgkaVar, executorService), new zzgjs(this), executorService);
    }

    public final x7.e zzc(Context context) {
        return zzgzo.zzd(new zzgjt(this, context), this.zzc);
    }

    public final x7.e zzd(Context context, String str, View view, Activity activity) {
        return zzgzo.zzd(new zzgju(this, context, null, view, activity), this.zzc);
    }

    public final x7.e zze(Context context, String str, View view, Activity activity) {
        return zzgzo.zzd(new zzgjv(this, context, str, view, null), this.zzc);
    }

    public final void zzf(InputEvent inputEvent) {
        try {
            synchronized (this.zzf) {
                try {
                    zzgkb zzgkbVar = this.zzj;
                    if (zzgkbVar != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("evt", inputEvent);
                        zzgkbVar.zzc(hashMap);
                    } else {
                        this.zze.zzb(20105);
                    }
                } finally {
                }
            }
        } catch (zzatp | zzatt e) {
            this.zze.zzd(20104, e);
        }
    }

    public final int zzg() {
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgkc.zzh(java.util.Map):void");
    }

    public final /* synthetic */ x7.e zzi(zzgdu zzgduVar) {
        if (this.zza.zzb(zzgduVar)) {
            return zzgzo.zzk(this.zzb.zze(), new zzgjw(this), zzhaf.zza());
        }
        this.zze.zzb(20103);
        throw new zzgjg(1);
    }

    public final /* synthetic */ String zzj(Context context) {
        HashMap hashMap = new HashMap();
        this.zze.zzf(20106, new zzgjx(this, hashMap, context));
        String zzq = zzq(hashMap);
        hashMap.clear();
        return zzq;
    }

    public final /* synthetic */ String zzk(Context context, String str, View view, Activity activity) {
        HashMap hashMap = new HashMap();
        this.zze.zzf(20106, new zzgjy(this, hashMap, context, view, activity, null));
        String zzq = zzq(hashMap);
        hashMap.clear();
        return zzq;
    }

    public final /* synthetic */ String zzl(Context context, String str, View view, Activity activity) {
        HashMap hashMap = new HashMap();
        this.zze.zzf(20106, new zzgjz(this, hashMap, context, view, null, str));
        String zzq = zzq(hashMap);
        hashMap.clear();
        return zzq;
    }

    public final /* synthetic */ Void zzm(byte[] bArr) {
        zzatr zzc = zzgkf.zzc();
        zzgoc zza = this.zze.zza(20102);
        try {
            try {
                zza.zza();
                synchronized (this.zzf) {
                    this.zzj = zzgkb.zza(zzc, bArr);
                }
                zza.zzc();
                return null;
            } catch (zzatp e) {
                e = e;
                zza.zzb(e);
                throw new zzgjg(2, e);
            } catch (zzatt e2) {
                e = e2;
                zza.zzb(e);
                throw new zzgjg(2, e);
            } catch (Throwable th) {
                zza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zza.zzc();
            throw th2;
        }
    }

    public final /* synthetic */ void zzn(Map map, Context context) {
        map.putAll(this.zzd.zzb());
        zzh(map);
        map.put("f", "q");
        map.put("ctx", context);
    }

    public final /* synthetic */ void zzo(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzc(context, view));
        zzh(map);
        map.put("f", "v");
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", activity);
        map.put("bds", (Object) null);
    }

    public final /* synthetic */ void zzp(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzd());
        zzh(map);
        map.put("f", "c");
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", (Object) null);
        map.put("bds", str);
    }
}
