package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zztc extends zzcp {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zztc() {
        byte[] bArr = zzfj.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final void zzs(boolean z) {
        int i;
        int i2;
        int i3 = this.zzk;
        int length = this.zzi.length;
        if (i3 != length) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.zzh == 0) {
            if (z) {
                zzu(i3, 3);
                i2 = i3;
            } else {
                zzgrc.zzi(i3 >= (length >> 1));
                i2 = this.zzi.length >> 1;
                zzu(i2, 0);
            }
            i = i2;
        } else {
            int i4 = length >> 1;
            int i5 = i3 - i4;
            if (z) {
                int zzt = zzt(i5) + (this.zzi.length >> 1);
                zzu(zzt, 2);
                int i6 = i4 + i5;
                i = zzt;
                i2 = i6;
            } else {
                int zzt2 = zzt(i5);
                zzu(zzt2, 1);
                i = zzt2;
                i2 = i5;
            }
        }
        if (i2 % this.zzd != 0) {
            throw new IllegalStateException(zzgrt.zzd("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(i2)));
        }
        zzgrc.zzi(i3 >= i);
        this.zzk -= i2;
        int i7 = this.zzj + i2;
        this.zzj = i7;
        this.zzj = i7 % this.zzi.length;
        this.zzh = this.zzh + (i / this.zzd);
        this.zzg += (i2 - i) / r2;
    }

    private final int zzt(int i) {
        int zzw = ((zzw(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        zzgrc.zzi(zzw >= 0);
        int min = (int) Math.min((i * 0.2f) + 0.5f, zzw);
        int i2 = this.zzd;
        return (min / i2) * i2;
    }

    private final void zzu(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        zzgrc.zza(this.zzk >= i);
        if (i2 == 2) {
            int i4 = this.zzj;
            int i5 = this.zzk;
            int i6 = i4 + i5;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i, this.zzl, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    System.arraycopy(bArr, i7 - i, this.zzl, 0, i);
                } else {
                    int i8 = i - i7;
                    System.arraycopy(bArr, length - i8, this.zzl, 0, i8);
                    System.arraycopy(this.zzi, 0, this.zzl, i8, i7);
                }
            }
        } else {
            int i9 = this.zzj;
            int i10 = i9 + i;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i10 <= length2) {
                System.arraycopy(bArr2, i9, this.zzl, 0, i);
            } else {
                int i11 = length2 - i9;
                System.arraycopy(bArr2, i9, this.zzl, 0, i11);
                System.arraycopy(this.zzi, 0, this.zzl, i11, i - i11);
            }
        }
        zzgrc.zzd(i % this.zzd == 0, "sizeToOutput is not aligned to frame size: %s", i);
        zzgrc.zzi(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        zzgrc.zzd(i % this.zzd == 0, "byteOutput size is not aligned to frame size %s", i);
        if (i2 != 3) {
            for (int i12 = 0; i12 < i; i12 += 2) {
                int i13 = i12 + 1;
                int zzv = zzv(bArr3[i13], bArr3[i12]);
                if (i2 == 0) {
                    i3 = ((((i12 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i12) / (i - 1)) / 1000);
                    }
                }
                int i14 = (zzv * i3) / 100;
                if (i14 >= 32767) {
                    bArr3[i12] = -1;
                    bArr3[i13] = Byte.MAX_VALUE;
                } else if (i14 <= -32768) {
                    bArr3[i12] = 0;
                    bArr3[i13] = Byte.MIN_VALUE;
                } else {
                    bArr3[i12] = (byte) (i14 & 255);
                    bArr3[i13] = (byte) (i14 >> 8);
                }
            }
        }
        zzk(i).put(bArr3, 0, i).flip();
    }

    private static int zzv(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    private final int zzw(long j) {
        return (int) ((j * this.zzb.zzb) / 1000000);
    }

    private static final boolean zzx(byte b, byte b2) {
        return Math.abs(zzv(b, b2)) > 1024;
    }

    public final boolean zzc() {
        return super.zzc() && this.zze;
    }

    public final void zzd(ByteBuffer byteBuffer) {
        int limit;
        int i;
        int position;
        while (byteBuffer.hasRemaining() && !zzl()) {
            if (this.zzf != 0) {
                zzgrc.zzi(this.zzj < this.zzi.length);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i2 = this.zzd;
                            limit = i2 * (position2 / i2);
                            break;
                        }
                        position2 += 2;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i3 = this.zzj;
                int i4 = this.zzk;
                int i5 = i3 + i4;
                int length = this.zzi.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int min = Math.min(position3, i);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.zzi, i5, min);
                int i6 = this.zzk + min;
                this.zzk = i6;
                zzgrc.zzi(i6 <= this.zzi.length);
                boolean z = limit < limit2 && position3 < i;
                zzs(z);
                if (z) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.zzi.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(limit4), byteBuffer.get(limit4 - 1))) {
                            int i7 = this.zzd;
                            position = ((limit4 / i7) * i7) + i7;
                            break;
                        }
                        limit4 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    zzk(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        if (zzclVar.zzd == 2) {
            return zzclVar.zzb == -1 ? zzcl.zza : zzclVar;
        }
        throw new zzcn("Unhandled input format:", zzclVar);
    }

    public final void zzn() {
        if (this.zzk > 0) {
            zzs(true);
            this.zzh = 0;
        }
    }

    public final void zzo() {
        if (zzc()) {
            int i = this.zzb.zzc;
            this.zzd = i + i;
            int zzw = zzw(100000L) / 2;
            int i2 = this.zzd;
            int i3 = (zzw / i2) * i2;
            int i4 = i3 + i3;
            if (this.zzi.length != i4) {
                this.zzi = new byte[i4];
                this.zzl = new byte[i4];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    public final void zzp() {
        this.zze = false;
        byte[] bArr = zzfj.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final void zzq(boolean z) {
        this.zze = z;
    }

    public final long zzr() {
        return this.zzg;
    }
}
