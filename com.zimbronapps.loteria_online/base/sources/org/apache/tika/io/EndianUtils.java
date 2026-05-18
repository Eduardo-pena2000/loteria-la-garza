package org.apache.tika.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.exception.TikaException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class EndianUtils {
    private static final int LONG_SIZE = 8;

    public static class BufferUnderrunException extends TikaException {
        private static final long serialVersionUID = 8358288231138076276L;

        public BufferUnderrunException() {
            super("Insufficient data left in stream for required read");
        }
    }

    public static int getIntBE(byte[] bArr) {
        return getIntBE(bArr, 0);
    }

    public static int getIntLE(byte[] bArr) {
        return getIntLE(bArr, 0);
    }

    public static long getLongLE(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = i + 7; i2 >= i; i2--) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static short getShortBE(byte[] bArr) {
        return getShortBE(bArr, 0);
    }

    public static short getShortLE(byte[] bArr) {
        return getShortLE(bArr, 0);
    }

    public static short getUByte(byte[] bArr, int i) {
        return (short) (bArr[i] & 255);
    }

    public static long getUIntBE(byte[] bArr) {
        return getUIntBE(bArr, 0);
    }

    public static long getUIntLE(byte[] bArr) {
        return getUIntLE(bArr, 0);
    }

    public static int getUShortBE(byte[] bArr) {
        return getUShortBE(bArr, 0);
    }

    public static int getUShortLE(byte[] bArr) {
        return getUShortLE(bArr, 0);
    }

    public static int readIntBE(InputStream inputStream) throws IOException, BufferUnderrunException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new BufferUnderrunException();
    }

    public static int readIntLE(InputStream inputStream) throws IOException, BufferUnderrunException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        throw new BufferUnderrunException();
    }

    public static int readIntME(InputStream inputStream) throws IOException, BufferUnderrunException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read2 << 24) + (read << 16) + (read4 << 8) + read3;
        }
        throw new BufferUnderrunException();
    }

    public static long readLongBE(InputStream inputStream) throws IOException, BufferUnderrunException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        int read5 = inputStream.read();
        int read6 = inputStream.read();
        int read7 = inputStream.read();
        int read8 = inputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new BufferUnderrunException();
    }

    public static long readLongLE(InputStream inputStream) throws IOException, BufferUnderrunException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        int read5 = inputStream.read();
        int read6 = inputStream.read();
        int read7 = inputStream.read();
        int read8 = inputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        throw new BufferUnderrunException();
    }

    public static short readShortBE(InputStream inputStream) throws IOException, BufferUnderrunException {
        return (short) readUShortBE(inputStream);
    }

    public static short readShortLE(InputStream inputStream) throws IOException, BufferUnderrunException {
        return (short) readUShortLE(inputStream);
    }

    public static long readUE7(InputStream inputStream) throws IOException {
        int read;
        long j = 0;
        int i = 0;
        while (true) {
            read = inputStream.read();
            if (read < 0) {
                break;
            }
            int i2 = i + 1;
            if (i >= 6) {
                break;
            }
            long j2 = j << 7;
            if ((read & 128) != 128) {
                j = j2 + read;
                break;
            }
            j = j2 + (read & 127);
            i = i2;
        }
        if (read >= 0) {
            return j;
        }
        throw new IOException("Buffer underun; expected one more byte");
    }

    public static long readUIntBE(InputStream inputStream) throws IOException, BufferUnderrunException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        if ((read | read2 | read3 | inputStream.read()) >= 0) {
            return ((read << 24) + (read2 << 16) + (read3 << 8) + r4) & 4294967295L;
        }
        throw new BufferUnderrunException();
    }

    public static long readUIntLE(InputStream inputStream) throws IOException, BufferUnderrunException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        if ((read | read2 | read3 | inputStream.read()) >= 0) {
            return ((r4 << 24) + (read3 << 16) + (read2 << 8) + read) & 4294967295L;
        }
        throw new BufferUnderrunException();
    }

    public static int readUShortBE(InputStream inputStream) throws IOException, BufferUnderrunException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if ((read | read2) >= 0) {
            return (read << 8) + read2;
        }
        throw new BufferUnderrunException();
    }

    public static int readUShortLE(InputStream inputStream) throws IOException, BufferUnderrunException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if ((read | read2) >= 0) {
            return (read2 << 8) + read;
        }
        throw new BufferUnderrunException();
    }

    public static int ubyteToInt(byte b) {
        return b & 255;
    }

    public static int getIntBE(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + (bArr[i + 3] & 255);
    }

    public static int getIntLE(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        return ((bArr[i + 3] & 255) << 24) + ((bArr[i + 2] & 255) << 16) + (i3 << 8) + i2;
    }

    public static short getShortBE(byte[] bArr, int i) {
        return (short) getUShortBE(bArr, i);
    }

    public static short getShortLE(byte[] bArr, int i) {
        return (short) getUShortLE(bArr, i);
    }

    public static long getUIntBE(byte[] bArr, int i) {
        return getIntBE(bArr, i) & 4294967295L;
    }

    public static long getUIntLE(byte[] bArr, int i) {
        return getIntLE(bArr, i) & 4294967295L;
    }

    public static int getUShortBE(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        return (i2 << 8) + (bArr[i + 1] & 255);
    }

    public static int getUShortLE(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
    }
}
