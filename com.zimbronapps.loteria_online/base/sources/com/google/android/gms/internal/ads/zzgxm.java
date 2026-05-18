package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgxm {
    public static void zza(byte[] bArr, File file) throws IOException {
        zzgxb zzgxbVar = new zzgxb();
        file.getClass();
        zzgup zzp = zzgup.zzp(new zzgxj[0]);
        bArr.getClass();
        FileOutputStream zza = zzgxk.zza(file, zzp, zzgxbVar);
        try {
            zza.write(bArr);
            zza.close();
        } catch (Throwable th) {
            try {
                zza.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void zzb(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void zzc(File file, File file2) throws IOException {
        file.getClass();
        file2.getClass();
        zzgrc.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        zzgrc.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        zzgxl zzgxlVar = new zzgxl(file, null);
        zzgxb zzgxbVar = new zzgxb();
        zzgup zzp = zzgup.zzp(new zzgxj[0]);
        zzgxi zza = zzgxi.zza();
        try {
            InputStream zza2 = zzgxlVar.zza();
            zza.zzb(zza2);
            FileOutputStream zza3 = zzgxk.zza(file2, zzp, zzgxbVar);
            zza.zzb(zza3);
            int i = zzgxf.zza;
            byte[] bArr = new byte[8192];
            while (true) {
                int read = zza2.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    zza3.write(bArr, 0, read);
                }
            }
            zza.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th) {
            try {
                throw zza.zzc(th);
            } catch (Throwable th2) {
                zza.close();
                throw th2;
            }
        }
    }
}
