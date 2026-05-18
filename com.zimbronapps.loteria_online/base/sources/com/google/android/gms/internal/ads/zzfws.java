package com.google.android.gms.internal.ads;

import android.os.Build;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfws {
    public static File zza(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(zzc(str, file), str2);
    }

    public static boolean zzb(File file, byte[] bArr) {
        Closeable closeable = null;
        try {
            Closeable fileOutputStream = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                E6.m.b(fileOutputStream);
                return true;
            } catch (IOException unused) {
                closeable = fileOutputStream;
                E6.m.b(closeable);
                return false;
            } catch (Throwable th) {
                th = th;
                closeable = fileOutputStream;
                E6.m.b(closeable);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static File zzc(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        zzd(file2, false);
        return file2;
    }

    public static File zzd(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean zze(File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (int i = 0; i < listFiles.length; i++) {
                File file2 = listFiles[i];
                z = file2 != null && zze(file2) && z;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }
}
