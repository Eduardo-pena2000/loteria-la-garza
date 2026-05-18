package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgfz implements zzgfx {
    ClassLoader zza;
    private final Context zzb;
    private final ExecutorService zzc;
    private final zzgfe zzd;
    private final zzgfw zze;
    private final zzgoe zzf;
    private final Set zzh;
    private final long zzj;
    private final File zzk;
    private boolean zzl;
    private byte[] zzm;
    private final String zzg = "1764808731656";
    private final Map zzi = new HashMap();

    public zzgfz(Context context, ExecutorService executorService, zzgfe zzgfeVar, zzgfw zzgfwVar, File file, zzgoe zzgoeVar, long j, String str, String str2, String str3, Set set) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = zzgfeVar;
        this.zze = zzgfwVar;
        this.zzf = zzgoeVar;
        this.zzh = set;
        this.zzk = new File(file, "rbp");
        this.zzj = j;
    }

    private final void zze(File file, String str) {
        Closeable fileInputStream;
        if (new File(file.toString().concat("/1764808731656.tmp")).exists()) {
            return;
        }
        File file2 = new File(file.toString().concat("/1764808731656.dex"));
        if (file2.exists()) {
            long length = file2.length();
            if (length > 0) {
                byte[] bArr = new byte[(int) length];
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(file2);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    e = e;
                } catch (zzgfv e2) {
                    e = e2;
                }
                try {
                } catch (zzgfv e3) {
                    e = e3;
                    closeable = fileInputStream;
                    this.zzf.zzd(301, e);
                    zzh(closeable);
                    zzf(file2);
                    return;
                } catch (IOException e4) {
                    e = e4;
                    closeable = fileInputStream;
                    this.zzf.zzd(301, e);
                    zzh(closeable);
                    zzf(file2);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = fileInputStream;
                    zzh(closeable);
                    zzf(file2);
                    throw th;
                }
                if (fileInputStream.read(bArr) <= 0) {
                    zzh(fileInputStream);
                    zzf(file2);
                    return;
                }
                zzaxj zzg = zzaxk.zzg();
                byte[] bytes = Build.VERSION.SDK.getBytes();
                zzian zzianVar = zzian.zza;
                zzg.zzd(zzian.zzs(bytes, 0, bytes.length));
                byte[] bytes2 = "1764808731656".getBytes();
                zzg.zzc(zzian.zzs(bytes2, 0, bytes2.length));
                throw new zzgfv();
            }
        }
    }

    private static void zzf(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    private static void zzg(String str) {
        zzf(new File(str));
    }

    private static void zzh(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x026b: INVOKE (r0 I:com.google.android.gms.internal.ads.zzgoc) VIRTUAL call: com.google.android.gms.internal.ads.zzgoc.zzc():void A[Catch: all -> 0x0269, MD:():void (m), TRY_ENTER] (LINE:620), block:B:125:0x026b */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f8 A[Catch: all -> 0x0031, zzgcb -> 0x0034, TryCatch #18 {zzgcb -> 0x0034, all -> 0x0031, blocks: (B:5:0x0009, B:10:0x000f, B:12:0x0018, B:14:0x0027, B:17:0x003d, B:19:0x003f, B:22:0x009b, B:27:0x01d5, B:28:0x01ec, B:29:0x01f2, B:31:0x01f8, B:34:0x020e, B:39:0x021d, B:54:0x0222, B:55:0x0239, B:56:0x00d2, B:67:0x011f, B:78:0x019d, B:47:0x01a0, B:51:0x01b1, B:52:0x01b7, B:46:0x01ba, B:88:0x0077, B:94:0x0098, B:100:0x0242, B:103:0x023f, B:105:0x0243, B:106:0x0248, B:107:0x0249, B:108:0x024e, B:110:0x024f, B:111:0x0254, B:113:0x0255, B:114:0x025a), top: B:4:0x0009, outer: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zza() {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgfz.zza():void");
    }

    public final synchronized boolean zzb() {
        return this.zzl;
    }

    public final Method zzc(String str, String str2) {
        Future future = (Future) this.zzi.get(new Pair(str, str2));
        if (future == null) {
            this.zzf.zzb(302);
            return null;
        }
        try {
            return (Method) future.get(this.zzj, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            this.zzf.zzb(303);
            return null;
        } catch (InterruptedException | ExecutionException unused2) {
            this.zzf.zzb(304);
            return null;
        }
    }

    public final /* synthetic */ Method zzd(zzggb zzggbVar) {
        ClassLoader classLoader = this.zza;
        zzgfw zzgfwVar = this.zze;
        byte[] bArr = this.zzm;
        String str = zzggbVar.zza;
        String str2 = zzggbVar.zzb;
        try {
            return classLoader.loadClass(zzgfwVar.zzb(bArr, str)).getMethod(zzgfwVar.zzb(bArr, str2), zzggbVar.zzc);
        } catch (zzgfv | NoSuchMethodException | ClassNotFoundException | UnsupportedEncodingException | NullPointerException e) {
            throw new IllegalStateException(e);
        }
    }
}
