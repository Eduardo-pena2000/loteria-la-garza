package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhjn extends zzhbp {
    private final String zza;
    private final zzhqy zzb;

    public /* synthetic */ zzhjn(String str, zzhqy zzhqyVar, byte[] bArr) {
        this.zza = str;
        this.zzb = zzhqyVar;
    }

    public final String toString() {
        String str = this.zza;
        int ordinal = this.zzb.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", new Object[]{str, ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK"});
    }

    public final boolean zza() {
        return this.zzb != zzhqy.zzd;
    }
}
