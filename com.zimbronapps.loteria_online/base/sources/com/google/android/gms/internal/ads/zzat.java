package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzat extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzat(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzat zza(String str, Throwable th) {
        return new zzat(str, th, true, 0);
    }

    public static zzat zzb(String str, Throwable th) {
        return new zzat(str, th, true, 1);
    }

    public static zzat zzc(String str) {
        return new zzat(str, null, false, 1);
    }

    public String getMessage() {
        String message = super/*java.lang.Throwable*/.getMessage();
        String concat = message != null ? message.concat(" ") : "";
        boolean z = this.zza;
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(concat.length() + 20 + String.valueOf(z).length() + 11 + String.valueOf(i).length() + 1);
        sb.append(concat);
        sb.append("{contentIsMalformed=");
        sb.append(z);
        sb.append(", dataType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
