package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgxk {
    public static final FileOutputStream zza(File file, zzgup zzgupVar, zzgxb zzgxbVar) throws IOException {
        return new FileOutputStream(file, zzgupVar.contains(zzgxj.APPEND));
    }
}
