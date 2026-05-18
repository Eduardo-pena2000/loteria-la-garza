package com.google.android.gms.internal.measurement;

import android.content.Context;
import s7.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzjn extends zzkh {
    private final Context zza;
    private final s zzb;

    public zzjn(Context context, s sVar) {
        this.zza = context;
        this.zzb = sVar;
    }

    public final boolean equals(Object obj) {
        s sVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkh) {
            zzkh zzkhVar = (zzkh) obj;
            if (this.zza.equals(zzkhVar.zza()) && ((sVar = this.zzb) != null ? sVar.equals(zzkhVar.zzb()) : zzkhVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        s sVar = this.zzb;
        return (hashCode * 1000003) ^ (sVar == null ? 0 : sVar.hashCode());
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        sb.append("FlagsContext{context=");
        sb.append(obj);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final Context zza() {
        return this.zza;
    }

    public final s zzb() {
        return this.zzb;
    }
}
