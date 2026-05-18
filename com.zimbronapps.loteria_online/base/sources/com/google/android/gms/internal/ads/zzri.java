package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzri extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzv zzc;

    public zzri(int i, zzv zzvVar, boolean z) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25);
        sb.append("AudioTrack write failed: ");
        sb.append(i);
        super(sb.toString());
        this.zzb = z;
        this.zza = i;
        this.zzc = zzvVar;
    }
}
