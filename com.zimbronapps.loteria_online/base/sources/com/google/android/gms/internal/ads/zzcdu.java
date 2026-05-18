package com.google.android.gms.internal.ads;

import V5.o0;
import V5.q0;
import V5.t0;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcdu {
    private final Object zza = new Object();
    private final t0 zzb;
    private final zzcdz zzc;
    private boolean zzd;
    private Context zze;
    private W5.a zzf;
    private String zzg;
    private zzbhj zzh;
    private zzdxz zzi;
    private Boolean zzj;
    private final AtomicInteger zzk;
    private final AtomicInteger zzl;
    private final zzcdt zzm;
    private final Object zzn;
    private x7.e zzo;
    private final AtomicBoolean zzp;

    public zzcdu() {
        t0 t0Var = new t0();
        this.zzb = t0Var;
        this.zzc = new zzcdz(S5.B.f(), t0Var);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = null;
        this.zzk = new AtomicInteger(0);
        this.zzl = new AtomicInteger(0);
        this.zzm = new zzcdt(null);
        this.zzn = new Object();
        this.zzp = new AtomicBoolean();
    }

    public final /* synthetic */ W5.a zzA() {
        return this.zzf;
    }

    public final /* synthetic */ zzbhj zzB() {
        return this.zzh;
    }

    public final /* synthetic */ AtomicBoolean zzC() {
        return this.zzp;
    }

    public final zzbhj zza() {
        zzbhj zzbhjVar;
        synchronized (this.zza) {
            zzbhjVar = this.zzh;
        }
        return zzbhjVar;
    }

    public final void zzb(Boolean bool) {
        synchronized (this.zza) {
            this.zzj = bool;
        }
    }

    public final Boolean zzc() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzj;
        }
        return bool;
    }

    public final void zzd() {
        this.zzm.zza();
    }

    public final void zze(Context context, W5.a aVar, zzdxz zzdxzVar) {
        zzbhj zzbhjVar;
        synchronized (this.zza) {
            try {
                if (!this.zzd) {
                    this.zze = context.getApplicationContext();
                    this.zzf = aVar;
                    R5.t.k().zzb(this.zzc);
                    this.zzb.zza(this.zze);
                    zzbyp.zzb(this.zze, this.zzf);
                    this.zzi = zzdxzVar;
                    R5.t.q();
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzcD)).booleanValue()) {
                        zzbhjVar = new zzbhj();
                    } else {
                        o0.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbhjVar = null;
                    }
                    this.zzh = zzbhjVar;
                    if (zzbhjVar != null) {
                        zzcel.zza(new zzcdq(this).zzb(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.zze;
                    if (E6.q.g()) {
                        if (((Boolean) S5.D.c().zzd(zzbhe.zzjJ)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzcdr(this));
                            } catch (RuntimeException e) {
                                int i = o0.b;
                                W5.p.g("Failed to register network callback", e);
                                this.zzp.set(true);
                            }
                        }
                    }
                    this.zzd = true;
                    zzq();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzpr)).booleanValue()) {
            return;
        }
        R5.t.g().R(context, aVar.a);
    }

    public final Resources zzf() {
        if (this.zzf.d) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzmq)).booleanValue()) {
                return W5.t.b(this.zze).getResources();
            }
            W5.t.b(this.zze).getResources();
            return null;
        } catch (W5.s e) {
            int i = o0.b;
            W5.p.g("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void zzg(Throwable th, String str) {
        zzbyp.zzb(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzh(Throwable th, String str) {
        zzbyp.zzb(this.zze, this.zzf).zzi(th, str, ((Double) zzbjn.zzf.zze()).floatValue());
    }

    public final void zzi(Throwable th, String str) {
        zzbyp.zzd(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzj() {
        this.zzk.incrementAndGet();
    }

    public final void zzk() {
        this.zzk.decrementAndGet();
    }

    public final int zzl() {
        return this.zzk.get();
    }

    public final void zzm() {
        this.zzl.incrementAndGet();
    }

    public final int zzn() {
        return this.zzl.get();
    }

    public final q0 zzo() {
        t0 t0Var;
        synchronized (this.zza) {
            t0Var = this.zzb;
        }
        return t0Var;
    }

    public final Context zzp() {
        return this.zze;
    }

    public final x7.e zzq() {
        if (this.zze != null) {
            if (!((Boolean) S5.D.c().zzd(zzbhe.zzdJ)).booleanValue()) {
                synchronized (this.zzn) {
                    try {
                        x7.e eVar = this.zzo;
                        if (eVar != null) {
                            return eVar;
                        }
                        x7.e submit = zzcei.zza.submit(new zzcds(this));
                        this.zzo = submit;
                        return submit;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zzgzo.zza(new ArrayList());
    }

    public final zzcdz zzr() {
        return this.zzc;
    }

    public final boolean zzs(Context context) {
        if (E6.q.g()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzjJ)).booleanValue()) {
                return this.zzp.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void zzt(String str) {
        this.zzg = str;
    }

    public final String zzu() {
        return this.zzg;
    }

    public final zzdxz zzv() {
        return this.zzi;
    }

    public final ActivityManager.MemoryInfo zzw() {
        return W5.g.n(this.zze);
    }

    public final /* synthetic */ ArrayList zzx() {
        Context zza = zzcae.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f = G6.e.a(zza).f(zza.getApplicationInfo().packageName, 4096);
            if (f.requestedPermissions != null && f.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = f.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((f.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final /* synthetic */ Object zzy() {
        return this.zza;
    }

    public final /* synthetic */ Context zzz() {
        return this.zze;
    }
}
