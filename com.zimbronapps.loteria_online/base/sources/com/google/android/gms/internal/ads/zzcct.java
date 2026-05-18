package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcct implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzccw zza;
    private final String zzb;

    public zzcct(zzccw zzccwVar, String str) {
        Objects.requireNonNull(zzccwVar);
        this.zza = zzccwVar;
        this.zzb = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzccw zzccwVar = this.zza;
        synchronized (zzccwVar) {
            try {
                Iterator it = zzccwVar.zzd().iterator();
                while (it.hasNext()) {
                    ((zzccu) it.next()).zza(sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
