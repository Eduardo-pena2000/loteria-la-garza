package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzeu extends zzei {
    private static final Set zza;
    private static final zzea zzb;
    private static final zzer zzc;
    private final String zzd;
    private final zzdn zze;
    private final Level zzf;
    private final Set zzg;
    private final zzea zzh;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new zzdk[]{zzdh.zza, zzdm.zza})));
        zza = unmodifiableSet;
        zzb = zzed.zza(unmodifiableSet).zzd();
        zzc = new zzer(null);
    }

    public /* synthetic */ zzeu(String str, String str2, boolean z, zzdn zzdnVar, Level level, Set set, zzea zzeaVar, zzet zzetVar) {
        super(str2);
        if (str2.length() > 23) {
            int i = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char charAt = str2.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str2 = str2.substring(i + 1);
        }
        String concat = "".concat(String.valueOf(str2));
        this.zzd = concat.substring(0, Math.min(concat.length(), 23));
        this.zze = zzdnVar;
        this.zzf = level;
        this.zzg = set;
        this.zzh = zzeaVar;
    }

    public static /* bridge */ /* synthetic */ zzea zzb() {
        return zzb;
    }

    public static zzer zzc() {
        return zzc;
    }

    public static /* bridge */ /* synthetic */ Set zzd() {
        return zza;
    }
}
