package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzqb extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzqb(int i, boolean z) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("AudioOutput write failed: ");
        sb.append(i);
        super(sb.toString());
        this.zzb = z;
        this.zza = i;
    }
}
