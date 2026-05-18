package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zzgrp extends zzgqk {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = Integer.MAX_VALUE;

    public zzgrp(zzgrr zzgrrVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        int zzd;
        int i = this.zzc;
        while (true) {
            int i2 = this.zzc;
            if (i2 == -1) {
                zzb();
                return null;
            }
            int zzc = zzc(i2);
            if (zzc == -1) {
                zzc = this.zzb.length();
                this.zzc = -1;
                zzd = -1;
            } else {
                zzd = zzd(zzc);
                this.zzc = zzd;
            }
            if (zzd != i) {
                if (i < zzc) {
                    this.zzb.charAt(i);
                }
                if (i < zzc) {
                    this.zzb.charAt(zzc - 1);
                }
                int i3 = this.zzd;
                if (i3 == 1) {
                    CharSequence charSequence = this.zzb;
                    int length = charSequence.length();
                    this.zzc = -1;
                    if (length > i) {
                        charSequence.charAt(length - 1);
                    }
                    zzc = length;
                } else {
                    this.zzd = i3 - 1;
                }
                return this.zzb.subSequence(i, zzc).toString();
            }
            int i4 = zzd + 1;
            this.zzc = i4;
            if (i4 > this.zzb.length()) {
                this.zzc = -1;
            }
        }
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
