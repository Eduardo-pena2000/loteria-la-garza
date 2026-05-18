package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzyo extends zzat {
    public final zzguf zzc;

    public zzyo(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.zzc = zzguf.zzq(list);
    }

    public final String getMessage() {
        zzguf zzgufVar = this.zzc;
        String message = super.getMessage();
        if (zzgufVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String valueOf = String.valueOf(zzgufVar);
        StringBuilder sb = new StringBuilder(length + 17 + valueOf.length());
        sb.append(message);
        sb.append("\nsniff failures: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
