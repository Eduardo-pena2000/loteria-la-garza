package com.google.android.gms.internal.fido;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzgc extends zzge {
    final char[] zza;

    private zzgc(zzgb zzgbVar) {
        super(zzgbVar, null);
        this.zza = new char[512];
        zzbm.zzc(zzgb.zzd(zzgbVar).length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzgbVar.zza(i >>> 4);
            this.zza[i | 256] = zzgbVar.zza(i & 15);
        }
    }

    public final zzgf zza(zzgb zzgbVar, Character ch) {
        return new zzgc(zzgbVar);
    }

    public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzbm.zze(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            appendable.append(this.zza[i4]);
            appendable.append(this.zza[i4 | 256]);
        }
    }

    public zzgc(String str, String str2) {
        this(new zzgb("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
