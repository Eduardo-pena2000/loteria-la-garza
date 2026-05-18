package com.amazon.c.a.a;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 0;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 8;
    public static final int g = 16;
    public static final int h = 32;
    static final /* synthetic */ boolean i = true;
    private static final int j = 76;
    private static final byte k = 61;
    private static final byte l = 10;
    private static final String m = "US-ASCII";
    private static final byte n = -5;
    private static final byte o = -1;
    private static final byte[] p = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] q = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] r = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] s = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] t = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] u = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    public static class a extends FilterInputStream {
        private boolean a;
        private int b;
        private byte[] c;
        private int d;
        private int e;
        private int f;
        private boolean g;
        private int h;
        private byte[] i;

        public a(InputStream inputStream) {
            this(inputStream, 0);
        }

        public int read() throws IOException {
            int read;
            if (this.b < 0) {
                if (this.a) {
                    byte[] bArr = new byte[3];
                    int i = 0;
                    for (int i2 = 0; i2 < 3; i2++) {
                        int read2 = ((FilterInputStream) this).in.read();
                        if (read2 < 0) {
                            break;
                        }
                        bArr[i2] = (byte) read2;
                        i++;
                    }
                    if (i <= 0) {
                        return -1;
                    }
                    c.a(bArr, 0, i, this.c, 0, this.h);
                    this.b = 0;
                    this.e = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int i3 = 0;
                    while (i3 < 4) {
                        do {
                            read = ((FilterInputStream) this).in.read();
                            if (read < 0) {
                                break;
                            }
                        } while (this.i[read & 127] <= -5);
                        if (read < 0) {
                            break;
                        }
                        bArr2[i3] = (byte) read;
                        i3++;
                    }
                    if (i3 != 4) {
                        if (i3 == 0) {
                            return -1;
                        }
                        throw new IOException("Improperly padded Base64 input.");
                    }
                    this.e = c.a(bArr2, 0, this.c, 0, this.h);
                    this.b = 0;
                }
            }
            int i4 = this.b;
            if (i4 < 0) {
                throw new IOException("Error in Base64 code reading stream.");
            }
            if (i4 >= this.e) {
                return -1;
            }
            if (this.a && this.g && this.f >= 76) {
                this.f = 0;
                return 10;
            }
            this.f++;
            byte[] bArr3 = this.c;
            int i5 = i4 + 1;
            this.b = i5;
            byte b = bArr3[i4];
            if (i5 >= this.d) {
                this.b = -1;
            }
            return b & 255;
        }

        public a(InputStream inputStream, int i) {
            super(inputStream);
            this.h = i;
            this.g = (i & 8) > 0;
            boolean z = (i & 1) > 0;
            this.a = z;
            int i2 = z ? 4 : 3;
            this.d = i2;
            this.c = new byte[i2];
            this.b = -1;
            this.f = 0;
            this.i = c.a(i);
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                int read = read();
                if (read >= 0) {
                    bArr[i + i3] = (byte) read;
                    i3++;
                } else if (i3 == 0) {
                    return -1;
                }
            }
            return i3;
        }
    }

    public static class b extends FilterOutputStream {
        private boolean a;
        private int b;
        private byte[] c;
        private int d;
        private int e;
        private boolean f;
        private byte[] g;
        private boolean h;
        private int i;
        private byte[] j;

        public b(OutputStream outputStream) {
            this(outputStream, 1);
        }

        public void a() throws IOException {
            int i = this.b;
            if (i > 0) {
                if (!this.a) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(c.a(this.g, this.c, i, this.i));
                this.b = 0;
            }
        }

        public void b() throws IOException {
            a();
            this.h = true;
        }

        public void c() {
            this.h = false;
        }

        public void close() throws IOException {
            a();
            super.close();
            this.c = null;
            ((FilterOutputStream) this).out = null;
        }

        public void write(int i) throws IOException {
            if (this.h) {
                ((FilterOutputStream) this).out.write(i);
                return;
            }
            if (!this.a) {
                byte b = this.j[i & 127];
                if (b <= -5) {
                    if (b != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr = this.c;
                int i2 = this.b;
                int i3 = i2 + 1;
                this.b = i3;
                bArr[i2] = (byte) i;
                if (i3 >= this.d) {
                    ((FilterOutputStream) this).out.write(this.g, 0, c.a(bArr, 0, this.g, 0, this.i));
                    this.b = 0;
                    return;
                }
                return;
            }
            byte[] bArr2 = this.c;
            int i4 = this.b;
            int i5 = i4 + 1;
            this.b = i5;
            bArr2[i4] = (byte) i;
            int i6 = this.d;
            if (i5 >= i6) {
                ((FilterOutputStream) this).out.write(c.a(this.g, bArr2, i6, this.i));
                int i7 = this.e + 4;
                this.e = i7;
                if (this.f && i7 >= 76) {
                    ((FilterOutputStream) this).out.write(10);
                    this.e = 0;
                }
                this.b = 0;
            }
        }

        public b(OutputStream outputStream, int i) {
            super(outputStream);
            this.f = (i & 8) != 0;
            boolean z = (i & 1) != 0;
            this.a = z;
            int i2 = z ? 3 : 4;
            this.d = i2;
            this.c = new byte[i2];
            this.b = 0;
            this.e = 0;
            this.h = false;
            this.g = new byte[4];
            this.i = i;
            this.j = c.a(i);
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.h) {
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }

    private c() {
    }

    public static /* synthetic */ int a(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        return b(bArr, i2, bArr2, i3, i4);
    }

    private static final byte[] b(int i2) {
        return (i2 & 16) == 16 ? r : (i2 & 32) == 32 ? t : p;
    }

    private static final byte[] c(int i2) {
        return (i2 & 16) == 16 ? s : (i2 & 32) == 32 ? u : q;
    }

    public static /* synthetic */ byte[] a(int i2) {
        return c(i2);
    }

    public static /* synthetic */ byte[] a(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) {
        return b(bArr, i2, i3, bArr2, i4, i5);
    }

    public static /* synthetic */ byte[] a(byte[] bArr, byte[] bArr2, int i2, int i3) {
        return b(bArr, bArr2, i2, i3);
    }

    private static byte[] b(byte[] bArr, byte[] bArr2, int i2, int i3) {
        b(bArr2, 0, i2, bArr, 0, i3);
        return bArr;
    }

    public static byte[] c(byte[] bArr) throws IOException {
        return c(bArr, 0, bArr.length, 0);
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            b(bArr2, bArr, min, 0);
            byteBuffer2.put(bArr2);
        }
    }

    private static byte[] b(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) {
        byte[] b2 = b(i5);
        int i6 = (i3 > 0 ? (bArr[i2] << 24) >>> 8 : 0) | (i3 > 1 ? (bArr[i2 + 1] << 24) >>> 16 : 0) | (i3 > 2 ? (bArr[i2 + 2] << 24) >>> 24 : 0);
        if (i3 == 1) {
            bArr2[i4] = b2[i6 >>> 18];
            bArr2[i4 + 1] = b2[(i6 >>> 12) & 63];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
            return bArr2;
        }
        if (i3 == 2) {
            bArr2[i4] = b2[i6 >>> 18];
            bArr2[i4 + 1] = b2[(i6 >>> 12) & 63];
            bArr2[i4 + 2] = b2[(i6 >>> 6) & 63];
            bArr2[i4 + 3] = 61;
            return bArr2;
        }
        if (i3 != 3) {
            return bArr2;
        }
        bArr2[i4] = b2[i6 >>> 18];
        bArr2[i4 + 1] = b2[(i6 >>> 12) & 63];
        bArr2[i4 + 2] = b2[(i6 >>> 6) & 63];
        bArr2[i4 + 3] = b2[i6 & 63];
        return bArr2;
    }

    public static byte[] c(byte[] bArr, int i2, int i3, int i4) throws IOException {
        int i5;
        if (bArr != null) {
            if (i2 < 0 || (i5 = i2 + i3) > bArr.length) {
                throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
            }
            if (i3 == 0) {
                return new byte[0];
            }
            if (i3 >= 4) {
                byte[] c2 = c(i4);
                byte[] bArr2 = new byte[(i3 * 3) / 4];
                byte[] bArr3 = new byte[4];
                int i6 = 0;
                int i7 = 0;
                while (i2 < i5) {
                    byte b2 = bArr[i2];
                    byte b3 = c2[b2 & 255];
                    if (b3 < -5) {
                        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", new Object[]{Integer.valueOf(bArr[i2] & 255), Integer.valueOf(i2)}));
                    }
                    if (b3 >= -1) {
                        int i8 = i6 + 1;
                        bArr3[i6] = b2;
                        if (i8 > 3) {
                            i7 += b(bArr3, 0, bArr2, i7, i4);
                            if (bArr[i2] == 61) {
                                break;
                            }
                            i6 = 0;
                        } else {
                            i6 = i8;
                        }
                    }
                    i2++;
                }
                byte[] bArr4 = new byte[i7];
                System.arraycopy(bArr2, 0, bArr4, 0, i7);
                return bArr4;
            }
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i3);
        }
        throw new NullPointerException("Cannot decode null source array.");
    }

    public static void a(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            b(bArr2, bArr, min, 0);
            for (int i2 = 0; i2 < 4; i2++) {
                charBuffer.put((char) (bArr2[i2] & 255));
            }
        }
    }

    public static String a(Serializable serializable) throws IOException {
        return a(serializable, 0);
    }

    public static byte[] b(byte[] bArr) {
        try {
            return b(bArr, 0, bArr.length, 0);
        } catch (IOException e2) {
            if (i) {
                return null;
            }
            throw new AssertionError("IOExceptions only come from GZipping, which is turned off: " + e2.getMessage());
        }
    }

    public static String a(Serializable serializable, int i2) throws IOException {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2;
        b bVar;
        ObjectOutputStream objectOutputStream3;
        if (serializable != null) {
            ObjectOutputStream objectOutputStream4 = null;
            try {
                objectOutputStream2 = new ByteArrayOutputStream();
                try {
                    bVar = new b(objectOutputStream2, i2 | 1);
                    try {
                        if ((i2 & 2) != 0) {
                            objectOutputStream = new GZIPOutputStream(bVar);
                            try {
                                objectOutputStream4 = new ObjectOutputStream(objectOutputStream);
                            } catch (IOException e2) {
                                e = e2;
                                objectOutputStream3 = objectOutputStream4;
                                objectOutputStream4 = objectOutputStream2;
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    ObjectOutputStream objectOutputStream5 = objectOutputStream3;
                                    objectOutputStream2 = objectOutputStream4;
                                    objectOutputStream4 = objectOutputStream5;
                                    try {
                                        objectOutputStream4.close();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        objectOutputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        bVar.close();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        objectOutputStream2.close();
                                        throw th;
                                    } catch (Exception unused4) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                objectOutputStream4.close();
                                objectOutputStream.close();
                                bVar.close();
                                objectOutputStream2.close();
                                throw th;
                            }
                        } else {
                            objectOutputStream4 = new ObjectOutputStream(bVar);
                            objectOutputStream = null;
                        }
                        objectOutputStream4.writeObject(serializable);
                        try {
                            objectOutputStream4.close();
                        } catch (Exception unused5) {
                        }
                        try {
                            objectOutputStream.close();
                        } catch (Exception unused6) {
                        }
                        try {
                            bVar.close();
                        } catch (Exception unused7) {
                        }
                        try {
                            objectOutputStream2.close();
                        } catch (Exception unused8) {
                        }
                        try {
                            return new String(objectOutputStream2.toByteArray(), "US-ASCII");
                        } catch (UnsupportedEncodingException unused9) {
                            return new String(objectOutputStream2.toByteArray());
                        }
                    } catch (IOException e3) {
                        e = e3;
                        objectOutputStream = objectOutputStream4;
                        objectOutputStream4 = objectOutputStream2;
                        objectOutputStream3 = objectOutputStream;
                    } catch (Throwable th3) {
                        th = th3;
                        objectOutputStream = objectOutputStream4;
                    }
                } catch (IOException e4) {
                    e = e4;
                    objectOutputStream = null;
                    bVar = null;
                    objectOutputStream4 = objectOutputStream2;
                    objectOutputStream3 = null;
                } catch (Throwable th4) {
                    th = th4;
                    objectOutputStream = null;
                    bVar = null;
                }
            } catch (IOException e5) {
                e = e5;
                objectOutputStream = null;
                objectOutputStream3 = null;
                bVar = null;
            } catch (Throwable th5) {
                th = th5;
                objectOutputStream = null;
                objectOutputStream2 = null;
                bVar = null;
            }
        } else {
            throw new NullPointerException("Cannot serialize a null object.");
        }
    }

    public static byte[] b(byte[] bArr, int i2, int i3, int i4) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        b bVar;
        GZIPOutputStream gZIPOutputStream2;
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i2);
        }
        if (i3 >= 0) {
            if (i2 + i3 > bArr.length) {
                throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(bArr.length)}));
            }
            if ((i4 & 2) != 0) {
                GZIPOutputStream gZIPOutputStream3 = null;
                try {
                    gZIPOutputStream = new ByteArrayOutputStream();
                    try {
                        bVar = new b(gZIPOutputStream, i4 | 1);
                        try {
                            gZIPOutputStream2 = new GZIPOutputStream(bVar);
                        } catch (IOException e2) {
                            e = e2;
                            gZIPOutputStream2 = null;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                gZIPOutputStream3.close();
                            } catch (Exception unused) {
                            }
                            try {
                                bVar.close();
                            } catch (Exception unused2) {
                            }
                            try {
                                gZIPOutputStream.close();
                                throw th;
                            } catch (Exception unused3) {
                                throw th;
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        bVar = null;
                        gZIPOutputStream2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    bVar = null;
                    gZIPOutputStream2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream = null;
                    bVar = null;
                }
                try {
                    gZIPOutputStream2.write(bArr, i2, i3);
                    gZIPOutputStream2.close();
                    try {
                        gZIPOutputStream2.close();
                    } catch (Exception unused4) {
                    }
                    try {
                        bVar.close();
                    } catch (Exception unused5) {
                    }
                    try {
                        gZIPOutputStream.close();
                    } catch (Exception unused6) {
                    }
                    return gZIPOutputStream.toByteArray();
                } catch (IOException e5) {
                    e = e5;
                    gZIPOutputStream3 = gZIPOutputStream;
                    try {
                        throw e;
                    } catch (Throwable th4) {
                        th = th4;
                        gZIPOutputStream = gZIPOutputStream3;
                        gZIPOutputStream3 = gZIPOutputStream2;
                        gZIPOutputStream3.close();
                        bVar.close();
                        gZIPOutputStream.close();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    gZIPOutputStream3 = gZIPOutputStream2;
                    gZIPOutputStream3.close();
                    bVar.close();
                    gZIPOutputStream.close();
                    throw th;
                }
            }
            boolean z = (i4 & 8) != 0;
            int i5 = ((i3 / 3) * 4) + (i3 % 3 > 0 ? 4 : 0);
            if (z) {
                i5 += i5 / 76;
            }
            int i6 = i5;
            byte[] bArr2 = new byte[i6];
            int i7 = i3 - 2;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < i7) {
                int i11 = i8;
                b(bArr, i8 + i2, 3, bArr2, i9, i4);
                int i12 = i10 + 4;
                if (!z || i12 < 76) {
                    i10 = i12;
                } else {
                    bArr2[i9 + 4] = 10;
                    i9++;
                    i10 = 0;
                }
                i8 = i11 + 3;
                i9 += 4;
            }
            int i13 = i8;
            if (i13 < i3) {
                b(bArr, i13 + i2, i3 - i13, bArr2, i9, i4);
                i9 += 4;
            }
            int i14 = i9;
            if (i14 > i6 - 1) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i14];
            System.arraycopy(bArr2, 0, bArr3, 0, i14);
            return bArr3;
        }
        throw new IllegalArgumentException("Cannot have length offset: " + i3);
    }

    public static String c(String str) throws IOException {
        InputStream inputStream = null;
        try {
            try {
                File file = new File(str);
                byte[] bArr = new byte[Math.max((int) ((file.length() * 1.4d) + 1.0d), 40)];
                InputStream aVar = new a(new BufferedInputStream(new FileInputStream(file)), 1);
                int i2 = 0;
                while (true) {
                    try {
                        int read = aVar.read(bArr, i2, 4096);
                        if (read < 0) {
                            break;
                        }
                        i2 += read;
                    } catch (IOException e2) {
                        inputStream = aVar;
                        throw e2;
                    } catch (Throwable th) {
                        th = th;
                        inputStream = aVar;
                        try {
                            inputStream.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                String str2 = new String(bArr, 0, i2, "US-ASCII");
                try {
                    aVar.close();
                } catch (Exception unused2) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            throw e3;
        }
    }

    public static void c(String str, String str2) throws IOException {
        OutputStream bufferedOutputStream;
        byte[] b2 = b(str);
        OutputStream outputStream = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(b2);
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e2) {
                outputStream = bufferedOutputStream;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                outputStream = bufferedOutputStream;
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e3) {
        }
    }

    public static String a(byte[] bArr) {
        String str;
        try {
            str = a(bArr, 0, bArr.length, 0);
        } catch (IOException e2) {
            if (!i) {
                throw new AssertionError(e2.getMessage());
            }
            str = null;
        }
        if (i || str != null) {
            return str;
        }
        throw new AssertionError();
    }

    public static String a(byte[] bArr, int i2) throws IOException {
        return a(bArr, 0, bArr.length, i2);
    }

    public static String a(byte[] bArr, int i2, int i3) {
        String str;
        try {
            str = a(bArr, i2, i3, 0);
        } catch (IOException e2) {
            if (!i) {
                throw new AssertionError(e2.getMessage());
            }
            str = null;
        }
        if (i || str != null) {
            return str;
        }
        throw new AssertionError();
    }

    public static String a(byte[] bArr, int i2, int i3, int i4) throws IOException {
        byte[] b2 = b(bArr, i2, i3, i4);
        try {
            return new String(b2, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(b2);
        }
    }

    private static int b(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        }
        if (bArr2 != null) {
            if (i2 >= 0 && (i5 = i2 + 3) < bArr.length) {
                if (i3 >= 0 && (i6 = i3 + 2) < bArr2.length) {
                    byte[] c2 = c(i4);
                    byte b2 = bArr[i2 + 2];
                    if (b2 == 61) {
                        bArr2[i3] = (byte) ((((c2[bArr[i2 + 1]] & 255) << 12) | ((c2[bArr[i2]] & 255) << 18)) >>> 16);
                        return 1;
                    }
                    byte b3 = bArr[i5];
                    if (b3 == 61) {
                        int i7 = ((c2[bArr[i2 + 1]] & 255) << 12) | ((c2[bArr[i2]] & 255) << 18) | ((c2[b2] & 255) << 6);
                        bArr2[i3] = (byte) (i7 >>> 16);
                        bArr2[i3 + 1] = (byte) (i7 >>> 8);
                        return 2;
                    }
                    int i8 = ((c2[bArr[i2 + 1]] & 255) << 12) | ((c2[bArr[i2]] & 255) << 18) | ((c2[b2] & 255) << 6) | (c2[b3] & 255);
                    bArr2[i3] = (byte) (i8 >> 16);
                    bArr2[i3 + 1] = (byte) (i8 >> 8);
                    bArr2[i6] = (byte) i8;
                    return 3;
                }
                throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", new Object[]{Integer.valueOf(bArr2.length), Integer.valueOf(i3)}));
            }
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2)}));
        }
        throw new NullPointerException("Destination array was null.");
    }

    public static byte[] a(String str) throws IOException {
        return a(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static byte[] a(String str, int i2) throws IOException {
        byte[] bytes;
        ByteArrayInputStream length;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        if (str != null) {
            try {
                bytes = str.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                bytes = str.getBytes();
            }
            byte[] c2 = c(bytes, 0, bytes.length, i2);
            boolean z = (i2 & 4) != 0;
            if (c2 != null && (length = c2.length) >= 4 && !z && 35615 == ((c2[0] & 255) | ((c2[1] << 8) & 65280))) {
                byte[] bArr = new byte[2048];
                ByteArrayOutputStream byteArrayOutputStream = null;
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(c2);
                            try {
                                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                while (true) {
                                    try {
                                        int read = gZIPInputStream.read(bArr);
                                        if (read < 0) {
                                            break;
                                        }
                                        byteArrayOutputStream2.write(bArr, 0, read);
                                    } catch (IOException e2) {
                                        e = e2;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayInputStream = byteArrayInputStream;
                                        try {
                                            e.printStackTrace();
                                            byteArrayOutputStream.close();
                                            length = byteArrayInputStream;
                                            gZIPInputStream.close();
                                            length.close();
                                            return c2;
                                        } catch (Throwable th) {
                                            th = th;
                                            try {
                                                byteArrayOutputStream.close();
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                gZIPInputStream.close();
                                            } catch (Exception unused3) {
                                            }
                                            try {
                                                byteArrayInputStream.close();
                                                throw th;
                                            } catch (Exception unused4) {
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayOutputStream.close();
                                        gZIPInputStream.close();
                                        byteArrayInputStream.close();
                                        throw th;
                                    }
                                }
                                c2 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                length = byteArrayInputStream;
                            } catch (IOException e3) {
                                e = e3;
                                gZIPInputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                gZIPInputStream = null;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            byteArrayInputStream = null;
                            gZIPInputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayInputStream = null;
                            gZIPInputStream = null;
                        }
                    } catch (Exception unused5) {
                    }
                } catch (IOException e5) {
                    e = e5;
                    byteArrayInputStream = null;
                    gZIPInputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayInputStream = null;
                    gZIPInputStream = null;
                }
                try {
                    gZIPInputStream.close();
                } catch (Exception unused6) {
                }
                try {
                    length.close();
                } catch (Exception unused7) {
                }
            }
            return c2;
        }
        throw new NullPointerException("Input string was null.");
    }

    public static byte[] b(String str) throws IOException {
        InputStream inputStream = null;
        try {
            try {
                File file = new File(str);
                if (file.length() <= 2147483647L) {
                    byte[] bArr = new byte[(int) file.length()];
                    InputStream aVar = new a(new BufferedInputStream(new FileInputStream(file)), 0);
                    int i2 = 0;
                    while (true) {
                        try {
                            int read = aVar.read(bArr, i2, 4096);
                            if (read < 0) {
                                break;
                            }
                            i2 += read;
                        } catch (IOException e2) {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            inputStream = aVar;
                            try {
                                inputStream.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    }
                    byte[] bArr2 = new byte[i2];
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                    try {
                        aVar.close();
                    } catch (Exception unused2) {
                    }
                    return bArr2;
                }
                throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            throw e3;
        }
    }

    public static void a(byte[] bArr, String str) throws IOException {
        b bVar;
        if (bArr != null) {
            b bVar2 = null;
            try {
                try {
                    bVar = new b(new FileOutputStream(str), 1);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    bVar.write(bArr);
                    try {
                        bVar.close();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } catch (IOException e2) {
                    bVar2 = bVar;
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = bVar;
                    try {
                        bVar2.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e3) {
                throw e3;
            }
        }
        throw new NullPointerException("Data to encode was null.");
    }

    public static void a(String str, String str2) throws IOException {
        b bVar;
        b bVar2 = null;
        try {
            try {
                bVar = new b(new FileOutputStream(str2), 0);
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bVar.write(str.getBytes("US-ASCII"));
            try {
                bVar.close();
            } catch (Exception unused) {
            }
        } catch (IOException e3) {
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            try {
                bVar2.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
    }

    public static void b(String str, String str2) throws IOException {
        OutputStream bufferedOutputStream;
        String c2 = c(str);
        OutputStream outputStream = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(c2.getBytes("US-ASCII"));
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e2) {
                outputStream = bufferedOutputStream;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                outputStream = bufferedOutputStream;
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e3) {
        }
    }
}
