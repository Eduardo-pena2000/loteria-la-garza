package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhs extends zzhq {
    public final int zzc;

    public zzhs(int i, String str, IOException iOException, Map map, zzhf zzhfVar, byte[] bArr) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 15);
        sb.append("Response code: ");
        sb.append(i);
        super(sb.toString(), iOException, zzhfVar, 2004, 1);
        this.zzc = i;
    }
}
