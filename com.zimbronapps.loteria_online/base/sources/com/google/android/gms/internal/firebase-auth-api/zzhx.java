package com.google.android.gms.internal.firebase-auth-api;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhx extends zzhw {
    public zzhx(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    public final zzhu zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzhy(bArr, i);
    }

    public final /* bridge */ /* synthetic */ void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        super.zza(byteBuffer, bArr, bArr2, bArr3);
    }

    public final /* bridge */ /* synthetic */ byte[] zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.zza(byteBuffer, bArr, bArr2);
    }

    public final /* bridge */ /* synthetic */ byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return super.zza(bArr, bArr2, bArr3);
    }
}
