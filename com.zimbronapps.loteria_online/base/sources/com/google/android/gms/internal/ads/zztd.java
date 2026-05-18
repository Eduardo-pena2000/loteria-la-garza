package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zztd extends zzcp {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzq(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == zzd) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public final void zzd(ByteBuffer byteBuffer) {
        ByteBuffer zzk;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.zzb.zzd;
        if (i2 == 2) {
            zzk = zzk(i + i);
            while (position < limit) {
                zzq(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), zzk);
                position += 2;
            }
        } else if (i2 == 1342177280) {
            zzk = zzk((i / 3) * 4);
            while (position < limit) {
                zzq(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), zzk);
                position += 3;
            }
        } else if (i2 == 1610612736) {
            zzk = zzk(i);
            while (position < limit) {
                int i3 = byteBuffer.get(position + 3) & 255;
                int i4 = (byteBuffer.get(position + 2) & 255) << 8;
                zzq(i3 | i4 | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), zzk);
                position += 4;
            }
        } else if (i2 == 21) {
            zzk = zzk((i / 3) * 4);
            while (position < limit) {
                zzq(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), zzk);
                position += 3;
            }
        } else {
            if (i2 != 22) {
                throw new IllegalStateException();
            }
            zzk = zzk(i);
            while (position < limit) {
                int i5 = byteBuffer.get(position) & 255;
                int i6 = (byteBuffer.get(position + 1) & 255) << 8;
                zzq(i5 | i6 | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), zzk);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        zzk.flip();
    }

    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int i = zzclVar.zzd;
        String str = zzfj.zza;
        if (i != 21 && i != 1342177280 && i != 22 && i != 1610612736) {
            if (i == 4) {
                return zzcl.zza;
            }
            if (i != 2) {
                throw new zzcn("Unhandled input format:", zzclVar);
            }
        }
        return new zzcl(zzclVar.zzb, zzclVar.zzc, 4);
    }
}
