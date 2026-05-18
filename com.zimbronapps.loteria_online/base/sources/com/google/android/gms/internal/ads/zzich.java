package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzich extends InputStream {
    private Iterator zza;
    private ByteBuffer zzb;
    private int zzc = 0;
    private int zzd;
    private int zze;
    private boolean zzf;
    private byte[] zzg;
    private int zzh;
    private long zzi;

    public zzich(Iterable iterable) {
        this.zza = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzc++;
        }
        this.zzd = -1;
        if (zza()) {
            return;
        }
        this.zzb = zzice.zzc;
        this.zze = 0;
        this.zzi = 0L;
    }

    private final boolean zza() {
        ByteBuffer byteBuffer;
        do {
            this.zzd++;
            if (!this.zza.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) this.zza.next();
            this.zzb = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.zze = this.zzb.position();
        if (this.zzb.hasArray()) {
            this.zzf = true;
            this.zzg = this.zzb.array();
            this.zzh = this.zzb.arrayOffset();
        } else {
            this.zzf = false;
            this.zzi = zziem.zzr(this.zzb);
            this.zzg = null;
        }
        return true;
    }

    private final void zzb(int i) {
        int i2 = this.zze + i;
        this.zze = i2;
        if (i2 == this.zzb.limit()) {
            zza();
        }
    }

    public final int read() throws IOException {
        if (this.zzd == this.zzc) {
            return -1;
        }
        if (this.zzf) {
            int i = this.zzg[this.zze + this.zzh] & 255;
            zzb(1);
            return i;
        }
        int zzq = zziem.zzq(this.zze + this.zzi) & 255;
        zzb(1);
        return zzq;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.zzd == this.zzc) {
            return -1;
        }
        int limit = this.zzb.limit();
        int i3 = this.zze;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.zzf) {
            System.arraycopy(this.zzg, i3 + this.zzh, bArr, i, i2);
            zzb(i2);
        } else {
            int position = this.zzb.position();
            this.zzb.position(this.zze);
            this.zzb.get(bArr, i, i2);
            this.zzb.position(position);
            zzb(i2);
        }
        return i2;
    }
}
