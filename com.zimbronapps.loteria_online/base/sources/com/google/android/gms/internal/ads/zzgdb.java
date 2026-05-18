package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgdb extends zzgct {
    private final ExecutorService zzb;
    private final zzgda zzc;
    private final Function zzd;

    public zzgdb(File file, ExecutorService executorService, zzgda zzgdaVar, Function function) {
        super(file);
        this.zzb = executorService;
        this.zzc = zzgdaVar;
        this.zzd = function;
    }

    public final x7.e zzb() {
        return zzgzo.zzd(new zzgcy(this), this.zzb);
    }

    public final x7.e zzc(Object obj) {
        return zzgzo.zzd(new zzgcx(this, obj), this.zzb);
    }

    public final /* synthetic */ Object zzd() {
        Object apply;
        synchronized (this) {
            try {
                try {
                    InputStream fileInputStream = new FileInputStream(this.zza);
                    try {
                        apply = this.zzc.zzb(fileInputStream);
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused) {
                    apply = this.zzc.zzc();
                }
            } catch (zzgcw e) {
                apply = this.zzd.apply(e);
            } catch (IOException e2) {
                apply = this.zzd.apply(new zzgcw(e2));
            }
        }
        return apply;
    }

    public final /* synthetic */ Void zze(Object obj) {
        synchronized (this) {
            File file = this.zza;
            zzgxm.zzb(file);
            String parent = file.getParent();
            String name = file.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 5);
            sb.append(name);
            sb.append(".temp");
            File file2 = new File(parent, sb.toString());
            try {
                OutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    this.zzc.zza(obj, fileOutputStream);
                    fileOutputStream.close();
                    if (!file2.renameTo(this.zza)) {
                        throw new IOException("Failed to rename file.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                file2.delete();
                throw e;
            }
        }
        return null;
    }
}
