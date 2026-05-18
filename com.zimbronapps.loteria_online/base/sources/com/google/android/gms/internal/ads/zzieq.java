package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzieq extends Exception {
    public zzieq(int i, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32 + String.valueOf(i2).length());
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
        super(sb.toString());
    }
}
