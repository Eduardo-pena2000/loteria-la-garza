package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzazb {
    protected volatile Boolean zzb;
    private final zzbak zzc;
    private static final ConditionVariable zzd = new ConditionVariable();
    protected static volatile zzfxd zza = null;
    private static volatile Random zze = null;

    public zzazb(zzbak zzbakVar) {
        this.zzc = zzbakVar;
        zzbakVar.zzd().execute(new zzaza(this));
    }

    public static /* synthetic */ ConditionVariable zzc() {
        return zzd;
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zze == null) {
                synchronized (zzazb.class) {
                    try {
                        if (zze == null) {
                            zze = new Random();
                        }
                    } finally {
                    }
                }
            }
            return zze.nextInt();
        }
    }

    public final void zza(int i, int i2, long j, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzavm zza2 = zzavq.zza();
            zza2.zza(this.zzc.zza.getPackageName());
            zza2.zzb(j);
            if (str != null) {
                zza2.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zza2.zzc(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            zzfxc zza3 = zza.zza(((zzavq) zza2.zzbu()).zzaN());
            zza3.zzc(i);
            if (i2 != -1) {
                zza3.zzb(i2);
            }
            zza3.zza();
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ zzbak zzb() {
        return this.zzc;
    }
}
