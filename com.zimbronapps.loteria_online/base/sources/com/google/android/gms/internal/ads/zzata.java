package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzata extends ByteArrayOutputStream {
    private final zzasp zza;

    public zzata(zzasp zzaspVar, int i) {
        this.zza = zzaspVar;
        ((ByteArrayOutputStream) this).buf = zzaspVar.zza(Math.max(i, 256));
    }

    private final void zza(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        zzasp zzaspVar = this.zza;
        int i3 = i2 + i;
        byte[] zza = zzaspVar.zza(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, zza, 0, ((ByteArrayOutputStream) this).count);
        zzaspVar.zzb(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = zza;
    }

    public final void close() throws IOException {
        this.zza.zzb(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zzb(((ByteArrayOutputStream) this).buf);
    }

    public final synchronized void write(int i) {
        zza(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        zza(i2);
        super.write(bArr, i, i2);
    }
}
