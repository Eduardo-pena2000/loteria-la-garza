package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfrm {
    private final String zza;
    private final L5.c zzb;
    private final String zzc;

    public /* synthetic */ zzfrm(zzfrl zzfrlVar, byte[] bArr) {
        this.zza = zzfrlVar.zzb();
        this.zzb = zzfrlVar.zzc();
        this.zzc = zzfrlVar.zzd();
    }

    public final boolean equals(Object obj) {
        L5.c cVar;
        L5.c cVar2;
        if (obj instanceof zzfrm) {
            zzfrm zzfrmVar = (zzfrm) obj;
            if (this.zza.equals(zzfrmVar.zza) && (cVar = this.zzb) != null && (cVar2 = zzfrmVar.zzb) != null && cVar.equals(cVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        L5.c cVar = this.zzb;
        return cVar == null ? "unknown" : cVar.name().toLowerCase(Locale.ENGLISH);
    }

    public final String zzc() {
        return this.zzc;
    }
}
