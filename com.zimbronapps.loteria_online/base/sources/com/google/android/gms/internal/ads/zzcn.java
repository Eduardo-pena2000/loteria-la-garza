package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcn extends Exception {
    public zzcn(String str, zzcl zzclVar) {
        String valueOf = String.valueOf(zzclVar);
        StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
        sb.append(str);
        sb.append(" ");
        sb.append(valueOf);
        super(sb.toString());
    }
}
