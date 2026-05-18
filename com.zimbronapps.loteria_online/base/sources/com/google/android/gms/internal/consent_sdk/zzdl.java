package com.google.android.gms.internal.consent_sdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdl extends zzdn {
    public zzdl(zzdo zzdoVar, CharSequence charSequence, zzdh zzdhVar) {
        super(zzdoVar, charSequence);
    }

    public final int zzc(int i) {
        return i + 1;
    }

    public final int zzd(int i) {
        CharSequence charSequence = ((zzdn) this).zza;
        int length = charSequence.length();
        zzdj.zzb(i, length, "index");
        while (i < length) {
            if (charSequence.charAt(i) == ',') {
                return i;
            }
            i++;
        }
        return -1;
    }
}
