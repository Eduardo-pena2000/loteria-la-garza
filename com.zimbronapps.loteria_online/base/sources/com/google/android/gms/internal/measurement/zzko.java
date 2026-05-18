package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s7.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzko implements zzjv {
    private static final Map zza = new w.a();
    private final SharedPreferences zzb;
    private SharedPreferences.OnSharedPreferenceChangeListener zzc;
    private volatile Map zze;
    private final Object zzd = new Object();
    private final List zzf = new ArrayList();

    private zzko(SharedPreferences sharedPreferences, Runnable runnable) {
        this.zzb = sharedPreferences;
    }

    public static zzko zza(Context context, String str, Runnable runnable) {
        zzko zzkoVar;
        SharedPreferences zza2;
        if (zzjm.zza() && !str.startsWith("direct_boot:") && !zzjm.zzc(context)) {
            return null;
        }
        synchronized (zzko.class) {
            Map map = zza;
            zzkoVar = (zzko) map.get(str);
            if (zzkoVar == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (zzjm.zza()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        zza2 = zzcf.zza(context, str.substring(12), 0, zzcb.zza);
                    } else {
                        zza2 = zzcf.zza(context, str, 0, zzcb.zza);
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    zzkoVar = new zzko(zza2, runnable);
                    zzkn zzknVar = new zzkn(zzkoVar);
                    zzkoVar.zzc = zzknVar;
                    zzkoVar.zzb.registerOnSharedPreferenceChangeListener(zzknVar);
                    map.put(str, zzkoVar);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
            }
        }
        return zzkoVar;
    }

    public static synchronized void zzb() {
        synchronized (zzko.class) {
            try {
                Map map = zza;
                for (zzko zzkoVar : map.values()) {
                    zzkoVar.zzb.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) m.j(zzkoVar.zzc));
                }
                map.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzc(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zzd) {
            this.zze = null;
            zzkm.zzc();
        }
        synchronized (this) {
            try {
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzjs) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object zze(String str) {
        Map map = this.zze;
        if (map == null) {
            synchronized (this.zzd) {
                try {
                    map = this.zze;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map all = this.zzb.getAll();
                            this.zze = all;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
