package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import w.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdd implements zzcl {
    private static final Map zza = new a();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    public static zzdd zza(Context context, String str, Runnable runnable) {
        zzdd zzddVar;
        if (zzcc.zzb()) {
            throw null;
        }
        synchronized (zzdd.class) {
            try {
                zzddVar = (zzdd) zza.get((Object) null);
                if (zzddVar == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzddVar;
    }

    public static synchronized void zzc() {
        synchronized (zzdd.class) {
            Map map = zza;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = ((zzdd) it.next()).zzb;
                throw null;
            }
            map.clear();
        }
    }

    public final Object zzb(String str) {
        throw null;
    }
}
