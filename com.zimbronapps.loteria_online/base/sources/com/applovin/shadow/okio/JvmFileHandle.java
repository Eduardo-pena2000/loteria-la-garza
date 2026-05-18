package com.applovin.shadow.okio;

import java.io.RandomAccessFile;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class JvmFileHandle extends FileHandle {
    private final RandomAccessFile randomAccessFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFileHandle(boolean z, RandomAccessFile randomAccessFile) {
        super(z);
        kotlin.jvm.internal.t.g(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }

    public synchronized void protectedClose() {
        this.randomAccessFile.close();
    }

    public synchronized void protectedFlush() {
        this.randomAccessFile.getFD().sync();
    }

    public synchronized int protectedRead(long j, byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.t.g(bArr, "array");
        this.randomAccessFile.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = this.randomAccessFile.read(bArr, i, i2 - i3);
            if (read != -1) {
                i3 += read;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    public synchronized void protectedResize(long j) {
        try {
            long size = size();
            long j2 = j - size;
            if (j2 > 0) {
                int i = (int) j2;
                protectedWrite(size, new byte[i], 0, i);
            } else {
                this.randomAccessFile.setLength(j);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long protectedSize() {
        return this.randomAccessFile.length();
    }

    public synchronized void protectedWrite(long j, byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.t.g(bArr, "array");
        this.randomAccessFile.seek(j);
        this.randomAccessFile.write(bArr, i, i2);
    }
}
