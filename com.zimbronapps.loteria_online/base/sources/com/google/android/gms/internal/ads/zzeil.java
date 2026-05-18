package com.google.android.gms.internal.ads;

import android.app.Activity;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzeil extends zzejh {
    private final Activity zza;
    private final U5.z zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzeil(Activity activity, U5.z zVar, String str, String str2, byte[] bArr) {
        this.zza = activity;
        this.zzb = zVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        U5.z zVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzejh) {
            zzejh zzejhVar = (zzejh) obj;
            if (this.zza.equals(zzejhVar.zza()) && ((zVar = this.zzb) != null ? zVar.equals(zzejhVar.zzb()) : zzejhVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzejhVar.zzc()) : zzejhVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzejhVar.zzd()) : zzejhVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        U5.z zVar = this.zzb;
        int hashCode2 = ((hashCode * 1000003) ^ (zVar == null ? 0 : zVar.hashCode())) * 1000003;
        String str = this.zzc;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzb);
        int length2 = valueOf.length();
        String str = this.zzc;
        int length3 = String.valueOf(str).length();
        String str2 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        sb.append("OfflineUtilsParams{activity=");
        sb.append(obj);
        sb.append(", adOverlay=");
        sb.append(valueOf);
        sb.append(", gwsQueryId=");
        sb.append(str);
        sb.append(", uri=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final Activity zza() {
        return this.zza;
    }

    public final U5.z zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
