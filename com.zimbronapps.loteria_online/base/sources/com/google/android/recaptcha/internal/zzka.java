package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzka extends zzjr {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public /* synthetic */ zzka(MessageDigest messageDigest, int i, zzkb zzkbVar) {
        this.zza = messageDigest;
        this.zzb = i;
    }

    private final void zzc() {
        zzjf.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    public final void zza(byte[] bArr, int i, int i2) {
        zzc();
        this.zza.update(bArr, 0, i2);
    }

    public final zzjv zzb() {
        zzc();
        this.zzc = true;
        int i = this.zzb;
        if (i == this.zza.getDigestLength()) {
            byte[] digest = this.zza.digest();
            int i2 = zzjv.zzb;
            return new zzju(digest);
        }
        byte[] copyOf = Arrays.copyOf(this.zza.digest(), i);
        int i3 = zzjv.zzb;
        return new zzju(copyOf);
    }
}
