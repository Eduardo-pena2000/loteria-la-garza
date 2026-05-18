package xb;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface g extends L, ReadableByteChannel {
    int C0(A a);

    boolean exhausted();

    e getBuffer();

    void h0(e eVar, long j);

    InputStream inputStream();

    long m1(J j);

    g peek();

    byte readByte();

    byte[] readByteArray();

    byte[] readByteArray(long j);

    h readByteString(long j);

    long readDecimalLong();

    void readFully(byte[] bArr);

    long readHexadecimalUnsignedLong();

    int readInt();

    int readIntLe();

    long readLong();

    long readLongLe();

    short readShort();

    short readShortLe();

    String readString(Charset charset);

    String readUtf8(long j);

    String readUtf8LineStrict();

    String readUtf8LineStrict(long j);

    boolean request(long j);

    void require(long j);

    void skip(long j);
}
