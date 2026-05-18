package com.applovin.shadow.okio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class NioFileSystemFileHandle extends FileHandle {
    private final FileChannel fileChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioFileSystemFileHandle(boolean z, FileChannel fileChannel) {
        super(z);
        kotlin.jvm.internal.t.g(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public synchronized void protectedClose() {
        this.fileChannel.close();
    }

    public synchronized void protectedFlush() {
        this.fileChannel.force(true);
    }

    public synchronized int protectedRead(long j, byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.t.g(bArr, "array");
        this.fileChannel.position(j);
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = this.fileChannel.read(wrap);
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
                this.fileChannel.truncate(j);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long protectedSize() {
        return this.fileChannel.size();
    }

    public synchronized void protectedWrite(long j, byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.t.g(bArr, "array");
        this.fileChannel.position(j);
        this.fileChannel.write(ByteBuffer.wrap(bArr, i, i2));
    }
}
