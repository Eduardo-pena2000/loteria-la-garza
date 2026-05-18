package com.google.android.gms.internal.firebase-auth-api;

import java.util.regex.Matcher;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzn extends zzm {
    private final Matcher zza;

    public zzn(Matcher matcher) {
        this.zza = (Matcher) zzu.zza(matcher);
    }

    public final int zza() {
        return this.zza.end();
    }

    public final int zzb() {
        return this.zza.start();
    }

    public final boolean zzc() {
        return this.zza.matches();
    }

    public final boolean zza(int i) {
        return this.zza.find(i);
    }
}
