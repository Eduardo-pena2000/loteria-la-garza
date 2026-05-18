package com.google.android.gms.internal.consent_sdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
abstract class zzdn extends zzdc {
    final CharSequence zza;
    int zzb = 0;
    int zzc = Integer.MAX_VALUE;

    public zzdn(zzdo zzdoVar, CharSequence charSequence) {
        this.zza = charSequence;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i = this.zzb;
        while (true) {
            int i2 = this.zzb;
            if (i2 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i2);
            if (zzd == -1) {
                zzd = this.zza.length();
                this.zzb = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zzb = zzc;
            }
            if (zzc != i) {
                if (i < zzd) {
                    this.zza.charAt(i);
                }
                if (i < zzd) {
                    this.zza.charAt(zzd - 1);
                }
                int i3 = this.zzc;
                if (i3 == 1) {
                    CharSequence charSequence = this.zza;
                    int length = charSequence.length();
                    this.zzb = -1;
                    if (length > i) {
                        charSequence.charAt(length - 1);
                    }
                    zzd = length;
                } else {
                    this.zzc = i3 - 1;
                }
                return this.zza.subSequence(i, zzd).toString();
            }
            int i4 = zzc + 1;
            this.zzb = i4;
            if (i4 > this.zza.length()) {
                this.zzb = -1;
            }
        }
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
