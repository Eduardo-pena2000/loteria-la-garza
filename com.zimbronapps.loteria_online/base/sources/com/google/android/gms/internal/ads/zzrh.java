package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzrh extends Exception {
    public zzrh(long j, long j2) {
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 63 + String.valueOf(j).length());
        sb.append("Unexpected audio track timestamp discontinuity: expected ");
        sb.append(j2);
        sb.append(", got ");
        sb.append(j);
        super(sb.toString());
    }
}
