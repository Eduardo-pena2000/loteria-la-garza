package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhzu extends FilterInputStream {
    private int zza;

    public zzhzu(InputStream inputStream, int i) {
        super(inputStream);
        this.zza = i;
    }

    public final int available() throws IOException {
        return Math.min(super.available(), this.zza);
    }

    public final int read() throws IOException {
        if (this.zza <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.zza--;
        }
        return read;
    }

    public final long skip(long j) throws IOException {
        int skip = (int) super.skip(Math.min(j, this.zza));
        if (skip >= 0) {
            this.zza -= skip;
        }
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zza;
        if (i3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            this.zza -= read;
        }
        return read;
    }
}
