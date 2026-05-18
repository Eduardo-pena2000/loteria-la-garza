package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhev extends zzhch {
    private final zzheu zza;
    private final String zzb;
    private final zzhet zzc;
    private final zzhch zzd;

    public /* synthetic */ zzhev(zzheu zzheuVar, String str, zzhet zzhetVar, zzhch zzhchVar, byte[] bArr) {
        this.zza = zzheuVar;
        this.zzb = str;
        this.zzc = zzhetVar;
        this.zzd = zzhchVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhev)) {
            return false;
        }
        zzhev zzhevVar = (zzhev) obj;
        return zzhevVar.zzc.equals(this.zzc) && zzhevVar.zzd.equals(this.zzd) && zzhevVar.zzb.equals(this.zzb) && zzhevVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzhev.class, this.zzb, this.zzc, this.zzd, this.zza});
    }

    public final String toString() {
        zzheu zzheuVar = this.zza;
        zzhch zzhchVar = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzhchVar);
        String valueOf3 = String.valueOf(zzheuVar);
        String str = this.zzb;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + valueOf2.length() + 11 + valueOf3.length() + 1);
        sb.append("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb.append(str);
        sb.append(", dekParsingStrategy: ");
        sb.append(valueOf);
        sb.append(", dekParametersForNewKeys: ");
        sb.append(valueOf2);
        sb.append(", variant: ");
        sb.append(valueOf3);
        sb.append(")");
        return sb.toString();
    }

    public final boolean zza() {
        return this.zza != zzheu.zzb;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzheu zzc() {
        return this.zza;
    }

    public final zzhch zzd() {
        return this.zzd;
    }
}
