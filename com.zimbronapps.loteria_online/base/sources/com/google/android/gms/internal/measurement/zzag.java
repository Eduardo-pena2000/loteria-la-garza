package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzag implements zzao {
    private final zzao zza;
    private final String zzb;

    public zzag() {
        this.zza = zzao.zzf;
        this.zzb = "return";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        return this.zzb.equals(zzagVar.zzb) && this.zza.equals(zzagVar.zza);
    }

    public final int hashCode() {
        return (this.zzb.hashCode() * 31) + this.zza.hashCode();
    }

    public final zzao zzb() {
        return this.zza;
    }

    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    public final zzao zzcA(String str, zzg zzgVar, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final Iterator zzf() {
        return null;
    }

    public final String zzg() {
        return this.zzb;
    }

    public final zzao zzt() {
        return new zzag(this.zzb, this.zza.zzt());
    }

    public zzag(String str) {
        this.zza = zzao.zzf;
        this.zzb = str;
    }

    public zzag(String str, zzao zzaoVar) {
        this.zza = zzaoVar;
        this.zzb = str;
    }
}
