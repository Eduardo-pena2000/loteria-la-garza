package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgri extends zzgrp {
    final /* synthetic */ zzgqq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgri(zzgrr zzgrrVar, CharSequence charSequence, zzgqq zzgqqVar) {
        super(zzgrrVar, charSequence);
        this.zza = zzgqqVar;
    }

    public final int zzc(int i) {
        CharSequence charSequence = ((zzgrp) this).zzb;
        int length = charSequence.length();
        zzgrc.zzn(i, length, "index");
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int zzd(int i) {
        return i + 1;
    }
}
