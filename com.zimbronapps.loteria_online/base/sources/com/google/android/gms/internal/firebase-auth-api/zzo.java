package com.google.android.gms.internal.firebase-auth-api;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzo extends zzl implements Serializable {
    private final Pattern zza;

    public zzo(Pattern pattern) {
        this.zza = (Pattern) zzu.zza(pattern);
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final zzm zza(CharSequence charSequence) {
        return new zzn(this.zza.matcher(charSequence));
    }
}
