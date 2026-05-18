package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzig extends IllegalStateException {
    public zzig(int i, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21 + String.valueOf(i2).length() + 1);
        sb.append("Buffer too small (");
        sb.append(i);
        sb.append(" < ");
        sb.append(i2);
        sb.append(")");
        super(sb.toString());
    }
}
