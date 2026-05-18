package com.google.android.gms.internal.fido;

import java.util.Set;
import java.util.logging.Level;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzes extends zzei {
    private final zzdn zza;
    private final Level zzb;
    private final Set zzc;
    private final zzea zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(String str, @NullableDecl String str2, boolean z, zzdn zzdnVar, boolean z2, boolean z3) {
        super(str2);
        Level level = Level.ALL;
        Set zzd = zzeu.zzd();
        zzea zzb = zzeu.zzb();
        this.zza = zzdnVar;
        this.zzb = level;
        this.zzc = zzd;
        this.zzd = zzb;
    }
}
