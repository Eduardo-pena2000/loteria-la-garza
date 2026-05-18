package xb;

import java.nio.channels.WritableByteChannel;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface f extends J, WritableByteChannel {
    e buffer();

    f emit();

    f emitCompleteSegments();

    void flush();

    e getBuffer();

    f m0(h hVar);

    long p1(L l);

    f write(byte[] bArr);

    f write(byte[] bArr, int i, int i2);

    f writeByte(int i);

    f writeDecimalLong(long j);

    f writeHexadecimalUnsignedLong(long j);

    f writeInt(int i);

    f writeShort(int i);

    f writeUtf8(String str);
}
