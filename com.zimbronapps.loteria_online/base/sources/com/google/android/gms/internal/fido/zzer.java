package com.google.android.gms.internal.fido;

import java.util.Set;
import java.util.logging.Level;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzer implements zzek {
    private final String zza;
    private final zzdn zzb;
    private final Level zzc;
    private final Set zzd;
    private final zzea zze;

    private zzer(String str, boolean z, zzdn zzdnVar, Level level, boolean z2, Set set, zzea zzeaVar) {
        this.zza = "";
        this.zzb = zzdnVar;
        this.zzc = level;
        this.zzd = set;
        this.zze = zzeaVar;
    }

    public final zzdp zza(String str) {
        return new zzeu(this.zza, str, true, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzer zzb(boolean z) {
        Set set = this.zzd;
        zzea zzeaVar = this.zze;
        return new zzer(this.zza, true, this.zzb, Level.OFF, false, set, zzeaVar);
    }

    private zzer() {
        this("", true, zzdo.NO_OP, Level.ALL, false, zzeu.zzd(), zzeu.zzb());
    }

    public /* synthetic */ zzer(zzeq zzeqVar) {
        this("", true, zzdo.NO_OP, Level.ALL, false, zzeu.zzd(), zzeu.zzb());
    }
}
