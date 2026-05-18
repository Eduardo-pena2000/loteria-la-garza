package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
interface zzjv {
    static Object zzh(zzju zzjuVar) {
        try {
            return zzjuVar.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzjuVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    Object zze(String str);
}
