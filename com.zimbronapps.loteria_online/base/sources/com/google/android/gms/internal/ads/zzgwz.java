package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class zzgwz extends zzgxa {
    private volatile zzgxa zza;
    final zzgwv zzb;
    final Character zzc;

    public zzgwz(zzgwv zzgwvVar, Character ch) {
        this.zzb = zzgwvVar;
        boolean z = true;
        if (ch != null && zzgwvVar.zze('=')) {
            z = false;
        }
        zzgrc.zzf(z, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgwz) {
            zzgwz zzgwzVar = (zzgwz) obj;
            if (this.zzb.equals(zzgwzVar.zzb) && Objects.equals(this.zzc, zzgwzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzgwv zzgwvVar = this.zzb;
        sb.append(zzgwvVar);
        if (8 % zzgwvVar.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzgrc.zzo(0, i2, bArr.length);
        while (i3 < i2) {
            int i4 = this.zzb.zzd;
            zze(appendable, bArr, i3, Math.min(i4, i2 - i3));
            i3 += i4;
        }
    }

    public int zzb(byte[] bArr, CharSequence charSequence) throws zzgwy {
        int i;
        CharSequence zzg = zzg(charSequence);
        int length = zzg.length();
        zzgwv zzgwvVar = this.zzb;
        if (!zzgwvVar.zzb(length)) {
            int length2 = zzg.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length2);
            throw new zzgwy(sb.toString());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzg.length()) {
            long j = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = zzgwvVar.zzc;
                if (i4 >= i) {
                    break;
                }
                j <<= zzgwvVar.zzb;
                if (i2 + i4 < zzg.length()) {
                    j |= zzgwvVar.zzc(zzg.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = zzgwvVar.zzd;
            int i7 = i5 * zzgwvVar.zzb;
            int i8 = (i6 - 1) * 8;
            while (i8 >= (i6 * 8) - i7) {
                bArr[i3] = (byte) ((j >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    public zzgxa zzc(zzgwv zzgwvVar, Character ch) {
        return new zzgwz(zzgwvVar, ch);
    }

    public final int zzd(int i) {
        zzgwv zzgwvVar = this.zzb;
        return zzgwvVar.zzc * zzgxs.zzb(i, zzgwvVar.zzd, RoundingMode.CEILING);
    }

    public final void zze(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzgrc.zzo(i, i + i2, bArr.length);
        zzgwv zzgwvVar = this.zzb;
        int i3 = zzgwvVar.zzd;
        int i4 = 0;
        zzgrc.zza(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = zzgwvVar.zzb;
        while (i4 < i2 * 8) {
            appendable.append(zzgwvVar.zza(zzgwvVar.zza & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        if (this.zzc != null) {
            while (i4 < i3 * 8) {
                appendable.append('=');
                i4 += i7;
            }
        }
    }

    public final int zzf(int i) {
        return (int) (((this.zzb.zzb * i) + 7) / 8);
    }

    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final zzgxa zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    public final zzgxa zzi() {
        zzgxa zzgxaVar = this.zza;
        if (zzgxaVar == null) {
            zzgwv zzgwvVar = this.zzb;
            zzgwv zzd = zzgwvVar.zzd();
            zzgxaVar = zzd == zzgwvVar ? this : zzc(zzd, this.zzc);
            this.zza = zzgxaVar;
        }
        return zzgxaVar;
    }

    public zzgwz(String str, String str2, Character ch) {
        this(new zzgwv(str, str2.toCharArray()), ch);
    }
}
