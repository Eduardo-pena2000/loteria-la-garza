package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zziw extends zzau {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzv zzf;
    public final int zzg;
    public final zzwk zzh;
    final boolean zzi;

    private zziw(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, null, false);
    }

    public static zziw zza(IOException iOException, int i) {
        return new zziw(0, iOException, i);
    }

    public static zziw zzb(Throwable th, String str, int i, zzv zzvVar, int i2, zzwk zzwkVar, boolean z, int i3) {
        return new zziw(1, th, null, i3, str, i, zzvVar, zzvVar == null ? 4 : i2, zzwkVar, z);
    }

    public static zziw zzc(RuntimeException runtimeException, int i) {
        return new zziw(2, runtimeException, i);
    }

    public final zziw zzd(zzwk zzwkVar) {
        String message = getMessage();
        String str = zzfj.zza;
        return new zziw(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzwkVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zziw(int i, Throwable th, String str, int i2, String str2, int i3, zzv zzvVar, int i4, zzwk zzwkVar, boolean z) {
        String str3;
        String str4;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
        } else {
            String valueOf = String.valueOf(zzvVar);
            String str5 = zzfj.zza;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + String.valueOf(i3).length() + 9 + valueOf.length() + 19 + str4.length());
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(valueOf);
            sb.append(", format_supported=");
            sb.append(str4);
            str3 = sb.toString();
        }
        this(TextUtils.isEmpty((CharSequence) null) ? str3 : str3.concat(": null"), th, i2, i, str2, i3, zzvVar, i4, zzwkVar, SystemClock.elapsedRealtime(), z);
    }

    private zziw(String str, Throwable th, int i, int i2, String str2, int i3, zzv zzvVar, int i4, zzwk zzwkVar, long j, boolean z) {
        int i5;
        boolean z2;
        super(str, th, i, Bundle.EMPTY, j);
        if (z) {
            i5 = i2;
            if (i5 == 1) {
                i5 = 1;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            i5 = i2;
            z2 = true;
        }
        zzgrc.zza(z2);
        zzgrc.zza(th != null);
        this.zzc = i5;
        this.zzd = str2;
        this.zze = i3;
        this.zzf = zzvVar;
        this.zzg = i4;
        this.zzh = zzwkVar;
        this.zzi = z;
    }
}
