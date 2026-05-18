package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzms {
    public static final zzms zza = new zzms(new zzmr());
    public final zzgup zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzi = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zzms(zzmr zzmrVar) {
        this.zzb = zzmrVar.zza();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzms) && this.zzb.equals(((zzms) obj).zzb);
    }

    public final int hashCode() {
        zzgup zzgupVar = this.zzb;
        Boolean bool = Boolean.TRUE;
        return Objects.hash(new Object[]{zzgupVar, null, null, bool, bool, bool, bool, bool});
    }
}
