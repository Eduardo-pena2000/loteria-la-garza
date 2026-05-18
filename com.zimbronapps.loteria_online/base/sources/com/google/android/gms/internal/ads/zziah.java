package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zziah extends zziak {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    public zziah(byte[] bArr, int i, int i2) {
        super(null);
        zzian.zzC(i, i + i2, bArr.length);
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    public final byte zza(int i) {
        zzian.zzB(i, this.zzd);
        return this.zzb[this.zzc + i];
    }

    public final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzian zzd(int i, int i2) {
        int zzC = zzian.zzC(i, i2, this.zzd);
        return zzC == 0 ? zzian.zza : new zziah(this.zzb, this.zzc + i, zzC);
    }

    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, this.zzc + i, bArr, i2, i3);
    }

    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb, this.zzc, this.zzd).asReadOnlyBuffer();
    }

    public final void zzg(zziae zziaeVar) throws IOException {
        zziaeVar.zza(this.zzb, this.zzc, this.zzd);
    }

    public final String zzh(Charset charset) {
        return new String(this.zzb, this.zzc, this.zzd, charset);
    }

    public final boolean zzi() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        return zzier.zzb(bArr, i, this.zzd + i);
    }

    public final boolean zzj(zzian zzianVar) {
        return ((zzianVar instanceof zzial) || (zzianVar instanceof zziah)) ? zzk(zzianVar, 0, this.zzd) : zzianVar.zzj(this);
    }

    public final boolean zzk(zzian zzianVar, int i, int i2) {
        if (i2 > zzianVar.zzc()) {
            int i3 = this.zzd;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 18 + String.valueOf(i3).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = i + i2;
        if (i4 <= zzianVar.zzc()) {
            if (zzianVar instanceof zzial) {
                return zzian.zzD(this.zzb, this.zzc, ((zzial) zzianVar).zzn(), i, i2);
            }
            if (zzianVar instanceof zziah) {
                zziah zziahVar = (zziah) zzianVar;
                return zzian.zzD(this.zzb, this.zzc, zziahVar.zzb, zziahVar.zzc + i, i2);
            }
            zzian zzd = zzianVar.zzd(i, i4);
            int i5 = this.zzc;
            return zzd.equals(zzd(i5, i2 + i5));
        }
        int zzc = zzianVar.zzc();
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i2).length() + 2 + String.valueOf(zzc).length());
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(zzc);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final int zzl(int i, int i2, int i3) {
        return zzice.zzc(i, this.zzb, this.zzc + i2, i3);
    }

    public final zziaq zzm() {
        return zziaq.zzG(this.zzb, this.zzc, this.zzd, true);
    }

    public final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }

    public final /* synthetic */ int zzo() {
        return this.zzc;
    }
}
