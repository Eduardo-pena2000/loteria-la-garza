package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zztb {
    private static final byte[] zza = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer zzc = zzco.zza;
    private int zze = 0;
    private int zzd = 2;

    private static final void zzc(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(zzgyd.zza(i2));
    }

    public final void zza(zzih zzihVar, List list) {
        int i;
        ByteBuffer byteBuffer = zzihVar.zzc;
        byteBuffer.getClass();
        if (byteBuffer.limit() - zzihVar.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.zzd == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer2 = zzihVar.zzc;
        int position = byteBuffer2.position();
        int limit = byteBuffer2.limit();
        int i2 = limit - position;
        int i3 = (i2 + 255) / 255;
        int i4 = i3 + 27 + i2;
        if (this.zzd == 2) {
            i = bArr != null ? bArr.length + 28 : 47;
            i4 += i + 44;
        } else {
            i = 0;
        }
        if (this.zzc.capacity() < i4) {
            this.zzc = ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zzc.clear();
        }
        ByteBuffer byteBuffer3 = this.zzc;
        if (this.zzd == 2) {
            if (bArr != null) {
                zzc(byteBuffer3, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer3.put(zzgyd.zza(length));
                byteBuffer3.put(bArr);
                int i5 = length + 28;
                byteBuffer3.putInt(22, zzfj.zzG(byteBuffer3.array(), byteBuffer3.arrayOffset(), i5, 0));
                byteBuffer3.position(i5);
            } else {
                byteBuffer3.put(zza);
            }
            byteBuffer3.put(zzb);
        }
        int zzc = this.zze + zzafu.zzc(byteBuffer2);
        this.zze = zzc;
        zzc(byteBuffer3, zzc, this.zzd, i3, false);
        for (int i6 = 0; i6 < i3; i6++) {
            if (i2 >= 255) {
                byteBuffer3.put((byte) -1);
                i2 -= 255;
            } else {
                byteBuffer3.put((byte) i2);
                i2 = 0;
            }
        }
        while (position < limit) {
            byteBuffer3.put(byteBuffer2.get(position));
            position++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        if (this.zzd == 2) {
            byteBuffer3.putInt(i + 66, zzfj.zzG(byteBuffer3.array(), byteBuffer3.arrayOffset() + i + 44, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, zzfj.zzG(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.zzd++;
        this.zzc = byteBuffer3;
        zzihVar.zza();
        zzihVar.zzj(this.zzc.remaining());
        zzihVar.zzc.put(this.zzc);
        zzihVar.zzl();
    }

    public final void zzb() {
        this.zzc = zzco.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
