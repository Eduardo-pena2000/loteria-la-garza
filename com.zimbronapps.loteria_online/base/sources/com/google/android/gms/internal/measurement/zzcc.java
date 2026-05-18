package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import t7.P;
import t7.U;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcc implements SharedPreferences.Editor {
    boolean zza;
    final Set zzb;
    final Map zzc;
    final /* synthetic */ zzcd zzd;

    public /* synthetic */ zzcc(zzcd zzcdVar, byte[] bArr) {
        Objects.requireNonNull(zzcdVar);
        this.zzd = zzcdVar;
        this.zza = false;
        this.zzb = new HashSet();
        this.zzc = new HashMap();
    }

    private final void zza(String str, Object obj) {
        if (obj != null) {
            this.zzc.put(str, obj);
        } else {
            remove(str);
        }
    }

    public final void apply() {
        commit();
    }

    public final SharedPreferences.Editor clear() {
        this.zza = true;
        return this;
    }

    public final boolean commit() {
        if (this.zza) {
            this.zzd.zza().clear();
        }
        zzcd zzcdVar = this.zzd;
        Set set = this.zzb;
        zzcdVar.zza().keySet().removeAll(set);
        Map map = this.zzc;
        for (Map.Entry entry : map.entrySet()) {
            zzcdVar.zza().put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : zzcdVar.zzb()) {
            U a = P.k(set, map.keySet()).a();
            while (a.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(zzcdVar, (String) a.next());
            }
        }
        return (!this.zza && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        zza(str, Boolean.valueOf(z));
        return this;
    }

    public final SharedPreferences.Editor putFloat(String str, float f) {
        zza(str, Float.valueOf(f));
        return this;
    }

    public final SharedPreferences.Editor putInt(String str, int i) {
        zza(str, Integer.valueOf(i));
        return this;
    }

    public final SharedPreferences.Editor putLong(String str, long j) {
        zza(str, Long.valueOf(j));
        return this;
    }

    public final SharedPreferences.Editor putString(String str, String str2) {
        zza(str, str2);
        return this;
    }

    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        zza(str, set);
        return this;
    }

    public final SharedPreferences.Editor remove(String str) {
        this.zzb.add(str);
        return this;
    }
}
