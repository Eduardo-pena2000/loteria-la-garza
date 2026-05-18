package com.google.android.gms.internal.measurement;

import E6.f;
import E6.i;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k7.e3;
import k7.e4;
import k7.f4;
import k7.l5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfb {
    private static volatile zzfb zzc;
    protected final ExecutorService zzb;
    private final j7.a zze;
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private final String zzi;
    private volatile zzcr zzj;
    private final String zzd = "FA";
    protected final f zza = i.c();

    public zzfb(Context context, Bundle bundle) {
        zzcm.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzed(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzb = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zze = new j7.a(this);
        this.zzf = new ArrayList();
        try {
            if (l5.a(context, "google_app_id", e3.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzfb.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.zzi = null;
                    this.zzh = true;
                    Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.zzi = "fa";
        zzM(new zzdr(this, context, bundle));
        Application applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            Log.w(this.zzd, "Unable to register lifecycle notifications. Application null.");
        } else {
            applicationContext.registerActivityLifecycleCallbacks(new zzfa(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzS, reason: merged with bridge method [inline-methods] */
    public final void zzM(zzeq zzeqVar) {
        this.zzb.execute(zzeqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzT, reason: merged with bridge method [inline-methods] */
    public final void zzN(Exception exc, boolean z, boolean z2) {
        this.zzh |= z;
        if (z) {
            Log.w(this.zzd, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            zzD(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.zzd, "Error with data collection. Data lost.", exc);
    }

    private final void zzU(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        zzM(new zzep(this, l, str, str2, bundle, z, z2));
    }

    public static zzfb zza(Context context, Bundle bundle) {
        t.l(context);
        if (zzc == null) {
            synchronized (zzfb.class) {
                try {
                    if (zzc == null) {
                        zzc = new zzfb(context, bundle);
                    }
                } finally {
                }
            }
        }
        return zzc;
    }

    public final String zzA() {
        zzco zzcoVar = new zzco();
        zzM(new zzdz(this, zzcoVar));
        return zzcoVar.zzc(500L);
    }

    public final String zzB() {
        zzco zzcoVar = new zzco();
        zzM(new zzea(this, zzcoVar));
        return zzcoVar.zzc(500L);
    }

    public final Map zzC(String str, String str2, boolean z) {
        zzco zzcoVar = new zzco();
        zzM(new zzeb(this, str, str2, z, zzcoVar));
        Bundle zze = zzcoVar.zze(5000L);
        if (zze == null || zze.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(zze.size());
        for (String str3 : zze.keySet()) {
            Object obj = zze.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void zzD(int i, String str, Object obj, Object obj2, Object obj3) {
        zzM(new zzec(this, false, 5, str, obj, null, null));
    }

    public final Bundle zzE(Bundle bundle, boolean z) {
        zzco zzcoVar = new zzco();
        zzM(new zzee(this, bundle, zzcoVar));
        if (z) {
            return zzcoVar.zze(5000L);
        }
        return null;
    }

    public final int zzF(String str) {
        zzco zzcoVar = new zzco();
        zzM(new zzef(this, str, zzcoVar));
        Integer num = (Integer) zzco.zzf(zzcoVar.zze(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String zzG() {
        zzco zzcoVar = new zzco();
        zzM(new zzeg(this, zzcoVar));
        return zzcoVar.zzc(120000L);
    }

    public final Long zzH() {
        zzco zzcoVar = new zzco();
        zzM(new zzeh(this, zzcoVar));
        return zzcoVar.zzd(120000L);
    }

    public final String zzI() {
        return this.zzi;
    }

    public final Object zzJ(int i) {
        zzco zzcoVar = new zzco();
        zzM(new zzei(this, zzcoVar, i));
        return zzco.zzf(zzcoVar.zze(15000L), Object.class);
    }

    public final void zzK(boolean z) {
        zzM(new zzej(this, z));
    }

    public final void zzL(Bundle bundle) {
        zzM(new zzek(this, bundle));
    }

    public final /* synthetic */ String zzO() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzP() {
        return this.zzh;
    }

    public final /* synthetic */ zzcr zzQ() {
        return this.zzj;
    }

    public final /* synthetic */ void zzR(zzcr zzcrVar) {
        this.zzj = zzcrVar;
    }

    public final j7.a zzb() {
        return this.zze;
    }

    public final zzcr zzc(Context context, boolean z) {
        try {
            return zzcq.asInterface(DynamiteModule.e(context, z ? DynamiteModule.e : DynamiteModule.c, "com.google.android.gms.measurement.dynamite").d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e) {
            zzN(e, true, false);
            return null;
        }
    }

    public final void zzd(e4 e4Var) {
        zzer zzerVar = new zzer(e4Var);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzerVar);
                return;
            } catch (RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.zzd, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        zzM(new zzel(this, zzerVar));
    }

    public final void zze(Intent intent) {
        zzM(new zzem(this, intent));
    }

    public final void zzf(f4 f4Var) {
        t.l(f4Var);
        List list = this.zzf;
        synchronized (list) {
            for (int i = 0; i < list.size(); i++) {
                try {
                    if (f4Var.equals(((Pair) list.get(i)).first)) {
                        Log.w(this.zzd, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzes zzesVar = new zzes(f4Var);
            list.add(new Pair(f4Var, zzesVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzesVar);
                    return;
                } catch (RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzd, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzM(new zzen(this, zzesVar));
        }
    }

    public final void zzg(f4 f4Var) {
        Pair pair;
        t.l(f4Var);
        List list = this.zzf;
        synchronized (list) {
            int i = 0;
            while (true) {
                try {
                    if (i >= list.size()) {
                        pair = null;
                        break;
                    } else {
                        if (f4Var.equals(((Pair) list.get(i)).first)) {
                            pair = (Pair) list.get(i);
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                Log.w(this.zzd, "OnEventListener had not been registered.");
                return;
            }
            list.remove(pair);
            zzes zzesVar = (zzes) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzesVar);
                    return;
                } catch (RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzd, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzM(new zzeo(this, zzesVar));
        }
    }

    public final void zzh(String str, Bundle bundle) {
        zzU(null, str, bundle, false, true, null);
    }

    public final void zzi(String str, String str2, Bundle bundle) {
        zzU(str, str2, bundle, true, true, null);
    }

    public final void zzj(String str, String str2, Bundle bundle, long j) {
        zzU(str, str2, bundle, true, false, Long.valueOf(j));
    }

    public final void zzk(String str, String str2, Object obj, boolean z) {
        zzM(new zzdh(this, str, str2, obj, z));
    }

    public final void zzl(Bundle bundle) {
        zzM(new zzdi(this, bundle));
    }

    public final void zzm(String str, String str2, Bundle bundle) {
        zzM(new zzdj(this, str, str2, bundle));
    }

    public final List zzn(String str, String str2) {
        zzco zzcoVar = new zzco();
        zzM(new zzdk(this, str, str2, zzcoVar));
        List list = (List) zzco.zzf(zzcoVar.zze(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final void zzo(String str) {
        zzM(new zzdl(this, str));
    }

    public final void zzp(zzdf zzdfVar, String str, String str2) {
        zzM(new zzdm(this, zzdfVar, str, str2));
    }

    public final void zzq(Boolean bool) {
        zzM(new zzdn(this, bool));
    }

    public final void zzr(Bundle bundle) {
        zzM(new zzdo(this, bundle));
    }

    public final void zzs() {
        zzM(new zzdp(this));
    }

    public final void zzt(long j) {
        zzM(new zzdq(this, j));
    }

    public final void zzu(String str) {
        zzM(new zzds(this, str));
    }

    public final void zzv(String str) {
        zzM(new zzdt(this, str));
    }

    public final void zzw(Runnable runnable) {
        zzM(new zzdv(this, runnable));
    }

    public final String zzx() {
        zzco zzcoVar = new zzco();
        zzM(new zzdw(this, zzcoVar));
        return zzcoVar.zzc(500L);
    }

    public final String zzy() {
        zzco zzcoVar = new zzco();
        zzM(new zzdx(this, zzcoVar));
        return zzcoVar.zzc(50L);
    }

    public final long zzz() {
        zzco zzcoVar = new zzco();
        zzM(new zzdy(this, zzcoVar));
        Long zzd = zzcoVar.zzd(500L);
        if (zzd != null) {
            return zzd.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.zza.a()).nextLong();
        int i = this.zzg + 1;
        this.zzg = i;
        return nextLong + i;
    }
}
