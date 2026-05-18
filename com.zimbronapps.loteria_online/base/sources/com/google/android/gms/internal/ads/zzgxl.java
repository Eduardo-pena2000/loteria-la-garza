package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgxl extends zzgxc {
    private final File zza;

    public /* synthetic */ zzgxl(File file, byte[] bArr) {
        this.zza = file;
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 20);
        sb.append("Files.asByteSource(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ InputStream zza() throws IOException {
        return new FileInputStream(this.zza);
    }
}
