package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zziao extends zziaq {
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zziao(byte[] bArr, int i, int i2, boolean z, byte[] bArr2) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zzf = bArr;
        this.zzg = i2 + i;
        this.zzi = i;
        this.zzj = i;
    }

    private final void zzN() {
        int i = this.zzg + this.zzh;
        this.zzg = i;
        int i2 = i - this.zzj;
        int i3 = this.zzl;
        if (i2 <= i3) {
            this.zzh = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzh = i4;
        this.zzg = i - i4;
    }

    public final void zzA(int i) {
        this.zzl = i;
        zzN();
    }

    public final boolean zzB() throws IOException {
        return this.zzi == this.zzg;
    }

    public final int zzC() {
        return this.zzi - this.zzj;
    }

    public final byte zzD() throws IOException {
        int i = this.zzi;
        if (i == this.zzg) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 1;
        return bArr[i];
    }

    public final void zzE(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (i <= i2 - i3) {
                this.zzi = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int zza() throws IOException {
        if (zzB()) {
            this.zzk = 0;
            return 0;
        }
        int zzu = zzu();
        this.zzk = zzu;
        if ((zzu >>> 3) != 0) {
            return zzu;
        }
        throw new zzicg("Protocol message contained an invalid tag (zero).");
    }

    public final void zzb(int i) throws zzicg {
        if (this.zzk != i) {
            throw new zzicg("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzc(int i) throws IOException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i3 < 10) {
                    if (zzD() < 0) {
                        i3++;
                    }
                }
                throw new zzicg("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.zzf;
                int i4 = this.zzi;
                this.zzi = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new zzicg("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            zzE(8);
            return true;
        }
        if (i2 == 2) {
            zzE(zzu());
            return true;
        }
        if (i2 == 3) {
            zzJ();
            zzb(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            zzI();
            return false;
        }
        if (i2 != 5) {
            throw new zzicf("Protocol message tag had invalid wire type.");
        }
        zzE(4);
        return true;
    }

    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    public final long zzf() throws IOException {
        return zzv();
    }

    public final long zzg() throws IOException {
        return zzv();
    }

    public final int zzh() throws IOException {
        return zzu();
    }

    public final long zzi() throws IOException {
        return zzy();
    }

    public final int zzj() throws IOException {
        return zzx();
    }

    public final boolean zzk() throws IOException {
        return zzv() != 0;
    }

    public final String zzl() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (zzu <= i - i2) {
                String str = new String(this.zzf, i2, zzu, zzice.zza);
                this.zzi += zzu;
                return str;
            }
        }
        if (zzu == 0) {
            return "";
        }
        if (zzu < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final String zzm() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (zzu <= i - i2) {
                String zze = zzier.zze(this.zzf, i2, zzu);
                this.zzi += zzu;
                return zze;
            }
        }
        if (zzu == 0) {
            return "";
        }
        if (zzu <= 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzian zzn() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (zzu <= i - i2) {
                zzian zzt = zzian.zzt(this.zzf, i2, zzu, false);
                this.zzi += zzu;
                return zzt;
            }
        }
        if (zzu == 0) {
            return zzian.zza;
        }
        if (zzu > 0) {
            int i3 = this.zzg;
            int i4 = this.zzi;
            if (zzu <= i3 - i4) {
                int i5 = zzu + i4;
                this.zzi = i5;
                byte[] copyOfRange = Arrays.copyOfRange(this.zzf, i4, i5);
                zzian zzianVar = zzian.zza;
                return new zzial(copyOfRange);
            }
        }
        if (zzu <= 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final int zzo() throws IOException {
        return zzu();
    }

    public final int zzp() throws IOException {
        return zzu();
    }

    public final int zzq() throws IOException {
        return zzx();
    }

    public final long zzr() throws IOException {
        return zzy();
    }

    public final int zzs() throws IOException {
        return zziaq.zzK(zzu());
    }

    public final long zzt() throws IOException {
        return zziaq.zzL(zzv());
    }

    public final int zzu() throws IOException {
        int i;
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            byte[] bArr = this.zzf;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzi = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.zzi = i5;
                return i;
            }
        }
        return (int) zzw();
    }

    public final long zzv() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.zzi;
        int i2 = this.zzg;
        if (i2 != i) {
            byte[] bArr = this.zzf;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzi = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = (bArr[i8] << 28) ^ i9;
                            if (j5 >= 0) {
                                j = j5 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j6 = (bArr[i6] << 35) ^ j5;
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j7 = j6 ^ (bArr[i4] << 42);
                                    if (j7 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j6 = j7 ^ (bArr[i10] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            j7 = j6 ^ (bArr[i4] << 56);
                                            if (j7 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                i4 = i + 10;
                                                long j8 = j7 ^ (bArr[i10] << 63);
                                                if (j8 >= 0) {
                                                    j = j8 ^ (-9151873028817141888L);
                                                }
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.zzi = i4;
                return j;
            }
        }
        return zzw();
    }

    public final long zzw() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzD() & 128) == 0) {
                return j;
            }
        }
        throw new zzicg("CodedInputStream encountered a malformed varint.");
    }

    public final int zzx() throws IOException {
        int i = this.zzi;
        if (this.zzg - i < 4) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long zzy() throws IOException {
        int i = this.zzi;
        if (this.zzg - i < 8) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 7] & 255) << 56) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final int zzz(int i) throws zzicg {
        if (i < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + (this.zzi - this.zzj);
        if (i2 < 0) {
            throw new zzicg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.zzl;
        if (i2 > i3) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i2;
        zzN();
        return i3;
    }
}
