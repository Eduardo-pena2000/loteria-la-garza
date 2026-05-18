package com.google.android.gms.internal.fido;

import java.util.Collections;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfi {
    private static final Comparator zza = new zzfa();
    private static final Comparator zzb = new zzfb();
    private static final zzfi zzc = new zzfi(new zzfg(Collections.emptyList()));
    private final zzfg zzd;

    private zzfi(zzfg zzfgVar) {
        this.zzd = zzfgVar;
    }

    public static zzfi zza() {
        return zzc;
    }

    public static /* bridge */ /* synthetic */ Comparator zzb() {
        return zza;
    }

    public final boolean equals(@NullableDecl Object obj) {
        return (obj instanceof zzfi) && ((zzfi) obj).zzd.equals(this.zzd);
    }

    public final int hashCode() {
        return ~this.zzd.hashCode();
    }

    public final String toString() {
        return this.zzd.toString();
    }
}
