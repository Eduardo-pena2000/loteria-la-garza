package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzafw {
    public final zzafz zza;
    public final zzafz zzb;

    public zzafw(zzafz zzafzVar, zzafz zzafzVar2) {
        this.zza = zzafzVar;
        this.zzb = zzafzVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafw.class == obj.getClass()) {
            zzafw zzafwVar = (zzafw) obj;
            if (this.zza.equals(zzafwVar.zza) && this.zzb.equals(zzafwVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzafz zzafzVar = this.zza;
        zzafz zzafzVar2 = this.zzb;
        String obj = zzafzVar.toString();
        String concat = zzafzVar.equals(zzafzVar2) ? "" : ", ".concat(zzafzVar2.toString());
        StringBuilder sb = new StringBuilder(obj.length() + 1 + concat.length() + 1);
        sb.append("[");
        sb.append(obj);
        sb.append(concat);
        sb.append("]");
        return sb.toString();
    }
}
