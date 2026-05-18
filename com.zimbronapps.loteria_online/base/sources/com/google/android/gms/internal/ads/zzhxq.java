package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhxq implements zzhnp {
    final zzhnp zza;
    final zzhnp zzb;

    public /* synthetic */ zzhxq(zzhnp zzhnpVar, zzhnp zzhnpVar2, byte[] bArr) {
        this.zza = zzhnpVar;
        this.zzb = zzhnpVar2;
    }

    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        return bArr.length <= 64 ? this.zza.zza(bArr, i) : this.zzb.zza(bArr, i);
    }
}
