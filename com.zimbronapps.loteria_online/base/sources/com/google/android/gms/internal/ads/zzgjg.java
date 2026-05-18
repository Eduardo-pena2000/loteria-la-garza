package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgjg extends RuntimeException {
    public zzgjg() {
        this(0);
    }

    public zzgjg(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 3);
        sb.append("r: ");
        sb.append(i);
        super(sb.toString());
    }

    public zzgjg(int i, Throwable th) {
        super("r: 2", th);
    }
}
