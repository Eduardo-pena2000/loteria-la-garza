package com.applovin.shadow.okhttp3.internal.ws;

import Na.c;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.DeflaterSink;
import com.applovin.shadow.okio.Sink;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class MessageDeflater implements Closeable {
    private final Buffer deflatedBytes;
    private final Deflater deflater;
    private final DeflaterSink deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        Buffer buffer = new Buffer();
        this.deflatedBytes = buffer;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((Sink) buffer, deflater);
    }

    private final boolean endsWith(Buffer buffer, ByteString byteString) {
        return buffer.rangeEquals(buffer.size() - byteString.size(), byteString);
    }

    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(Buffer buffer) throws IOException {
        t.g(buffer, "buffer");
        if (this.deflatedBytes.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.size());
        this.deflaterSink.flush();
        if (endsWith(this.deflatedBytes, MessageDeflaterKt.access$getEMPTY_DEFLATE_BLOCK$p())) {
            long size = this.deflatedBytes.size() - 4;
            Buffer.UnsafeCursor readAndWriteUnsafe$default = Buffer.readAndWriteUnsafe$default(this.deflatedBytes, null, 1, null);
            try {
                readAndWriteUnsafe$default.resizeBuffer(size);
                c.a(readAndWriteUnsafe$default, (Throwable) null);
            } finally {
            }
        } else {
            this.deflatedBytes.writeByte(0);
        }
        Buffer buffer2 = this.deflatedBytes;
        buffer.write(buffer2, buffer2.size());
    }
}
