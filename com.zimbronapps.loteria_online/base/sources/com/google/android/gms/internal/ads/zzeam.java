package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeam implements zzdin {
    private final Bundle zza = new Bundle();

    public final synchronized void zza(String str) {
        this.zza.putInt(str, 1);
    }

    public final synchronized void zzb(String str) {
        this.zza.putInt(str, 2);
    }

    public final synchronized void zzc(String str, String str2) {
        this.zza.putInt(str, 3);
    }

    public final void zzd(String str) {
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final synchronized Bundle zzg() {
        return new Bundle(this.zza);
    }
}
