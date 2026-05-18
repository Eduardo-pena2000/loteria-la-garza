package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzatt extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzatt(zzats zzatsVar, zzatq zzatqVar, long j) {
        int i = (((((~2143124030) & 85005376) | 430547086) + ((2143124030 & 878451808) | 1894615585)) - (-2031609844)) ^ (1747844822 % 1617876982);
        Locale locale = Locale.US;
        Object[] objArr = new Object[i];
        objArr[0] = Long.valueOf(zzatsVar.zza());
        objArr[1] = Long.valueOf(zzatqVar.zza());
        int i2 = (((((~1434433518) & 1229726181) | 671269892) + ((1434433518 & 1096561121) | 546312716)) - 1772679974) ^ (1830539036 % 1290127955);
        Long valueOf = Long.valueOf(j);
        objArr[i2] = valueOf;
        super(String.format(locale, zzaui.zza("bk3t6gFTc30="), objArr));
        Optional.of(zzatqVar);
        Optional.of(valueOf);
    }

    public zzatt(zzats zzatsVar, Throwable th) {
        super(String.format(Locale.US, zzaui.zza("bk0="), new Object[]{Long.valueOf(zzatsVar.zza())}), th);
        Optional.empty();
        Optional.empty();
    }
}
