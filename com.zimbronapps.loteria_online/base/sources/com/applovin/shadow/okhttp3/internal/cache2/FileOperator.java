package com.applovin.shadow.okhttp3.internal.cache2;

import com.applovin.shadow.okio.Buffer;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        t.g(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j, Buffer buffer, long j2) {
        t.g(buffer, "sink");
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferTo = this.fileChannel.transferTo(j, j2, buffer);
            j += transferTo;
            j2 -= transferTo;
        }
    }

    public final void write(long j, Buffer buffer, long j2) throws IOException {
        t.g(buffer, "source");
        if (j2 < 0 || j2 > buffer.size()) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferFrom = this.fileChannel.transferFrom(buffer, j, j2);
            j += transferFrom;
            j2 -= transferFrom;
        }
    }
}
