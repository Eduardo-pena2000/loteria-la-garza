package com.google.protobuf;

import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class e {
    public static final ThreadLocal a = new ThreadLocal();
    public static final Class b;
    public static final long c;

    static {
        Class e = e("java.io.FileOutputStream");
        b = e;
        c = b(e);
    }

    public static byte[] a() {
        SoftReference softReference = (SoftReference) a.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    public static long b(Class cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (V.J()) {
                return V.M(cls.getDeclaredField("channel"));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static byte[] c(int i) {
        int max = Math.max(i, 1024);
        byte[] a2 = a();
        if (a2 == null || d(max, a2.length)) {
            a2 = new byte[max];
            if (max <= 16384) {
                f(a2);
            }
        }
        return a2;
    }

    public static boolean d(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    public static Class e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void f(byte[] bArr) {
        a.set(new SoftReference(bArr));
    }

    public static void g(ByteBuffer byteBuffer, OutputStream outputStream) {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!h(byteBuffer, outputStream)) {
                byte[] c2 = c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), c2.length);
                    byteBuffer.get(c2, 0, min);
                    outputStream.write(c2, 0, min);
                }
            }
            q.d(byteBuffer, position);
        } catch (Throwable th) {
            q.d(byteBuffer, position);
            throw th;
        }
    }

    public static boolean h(ByteBuffer byteBuffer, OutputStream outputStream) {
        WritableByteChannel writableByteChannel;
        long j = c;
        if (j < 0 || !b.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) V.H(outputStream, j);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
