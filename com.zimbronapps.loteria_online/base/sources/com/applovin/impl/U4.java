package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class u4 {
    private static final byte[] a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};
    private static final byte[] b;

    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);

        private final int a;

        a(int i) {
            this.a = i;
        }

        public int b() {
            return this.a;
        }

        public static a a(int i) {
            return i == 0 ? DEFAULT : i == 1 ? V2 : DEFAULT;
        }
    }

    static {
        byte[] bArr = new byte[32];
        b = bArr;
        System.arraycopy(new byte[]{18, 12, 28, 20, 17, 23, 26, 9, 21, 3, 14, 29, 4, 0, 2, 7, 10, 29, 6, 20, 1}, 0, bArr, 0, 21);
    }

    public static byte[] a(String str, long j, a aVar, String str2, com.applovin.impl.sdk.k kVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() >= 86) {
            return TextUtils.isEmpty(str) ? new byte[0] : a.NONE == aVar ? str.getBytes() : a.V2 == aVar ? a(str, j, false, str2, kVar) : a(str, j, str2, kVar);
        }
        throw new IllegalArgumentException("SDK key is too short");
    }

    public static String b(String str, long j, a aVar, String str2, com.applovin.impl.sdk.k kVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() < 86) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (TextUtils.isEmpty(str) || a.NONE == aVar) {
            return str;
        }
        byte[] a2 = a.V2 == aVar ? a(str, j, true, str2, kVar) : a(str, j, str2, kVar);
        if (a2 != null) {
            return new String(a2);
        }
        return null;
    }

    private static int c(byte[] bArr, String str, com.applovin.impl.sdk.k kVar) {
        int a2;
        int i;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (a2 = a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = a(b, kVar).getBytes();
        int i2 = a2 + 1;
        int length = bytes.length + i2;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i = length + 55) || bArr[i] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i2, bytes.length + i2), bytes)) {
            return 0;
        }
        int i3 = length + 56;
        if (length + 64 > bArr.length) {
            return 0;
        }
        return i3;
    }

    private static byte[] a(String str, long j, String str2, com.applovin.impl.sdk.k kVar) {
        char c = ' ';
        try {
            String substring = str2.substring(32);
            String substring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes("UTF-8");
            byte[] a2 = a(substring2, a, kVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j & 255)) ^ a2[0]);
            byteArrayOutputStream.write(((byte) ((j >> 8) & 255)) ^ a2[1]);
            byteArrayOutputStream.write(((byte) ((j >> 16) & 255)) ^ a2[2]);
            byteArrayOutputStream.write(((byte) ((j >> 24) & 255)) ^ a2[3]);
            byteArrayOutputStream.write(((byte) ((j >> 32) & 255)) ^ a2[4]);
            byteArrayOutputStream.write(((byte) ((j >> 40) & 255)) ^ a2[5]);
            byteArrayOutputStream.write(((byte) ((j >> 48) & 255)) ^ a2[6]);
            byteArrayOutputStream.write(((byte) ((j >> 56) & 255)) ^ a2[7]);
            int i = 0;
            while (i < bytes.length) {
                long j2 = j + i;
                long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                long j5 = j4 ^ (j4 >> c);
                String str3 = substring;
                byteArrayOutputStream.write((byte) (((i >= bytes.length ? (byte) 0 : bytes[i]) ^ a2[i % a2.length]) ^ (j5 & 255)));
                byteArrayOutputStream.write((byte) ((a2[r4 % a2.length] ^ (i + 1 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j5 >> 8) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r4 % a2.length] ^ (i + 2 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j5 >> 16) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r4 % a2.length] ^ (i + 3 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j5 >> 24) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r4 % a2.length] ^ (i + 4 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j5 >> 32) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r4 % a2.length] ^ (i + 5 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j5 >> 40) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r4 % a2.length] ^ (i + 6 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j5 >> 48) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r4 % a2.length] ^ (i + 7 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j5 >> 56) & 255)));
                i += 8;
                substring = str3;
                c = ' ';
            }
            String str4 = substring;
            String c2 = c(byteArrayOutputStream.toByteArray());
            return ("1:" + a(a, kVar) + ":" + str4 + ":" + c2).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            kVar.D().a("AppLovinSdk", "encode", e);
            return null;
        }
    }

    public static String b(byte[] bArr, String str, com.applovin.impl.sdk.k kVar) {
        if (str != null) {
            if (str.length() < 86) {
                throw new IllegalArgumentException("SDK key is too short");
            }
            if (bArr == null) {
                return null;
            }
            if (bArr.length == 0) {
                return "";
            }
            a b2 = b(bArr);
            if (a.NONE == b2) {
                return new String(bArr);
            }
            if (b2 == a.V2) {
                return a(bArr, str, kVar);
            }
            return a(new String(bArr), str, kVar);
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static String c(byte[] bArr) {
        return a(Base64.encode(bArr, 2));
    }

    public static a b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char c = (char) bArr[0];
            if (c == '2') {
                return a.V2;
            }
            if (c == '{') {
                return a.NONE;
            }
            return a.DEFAULT;
        }
        return a.NONE;
    }

    private static byte[] b(String str) {
        return Base64.decode(a(str), 0);
    }

    private static byte[] a(String str, long j, boolean z, String str2, com.applovin.impl.sdk.k kVar) {
        ByteBuffer allocate;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            String substring = str2.substring(32);
            String substring2 = str2.substring(0, 32);
            byte[] bArr = b;
            byte[] a2 = a(substring2, bArr, kVar);
            long c = n7.c(a2) ^ j;
            byte[] bytes2 = String.format("2:%s:%s:", new Object[]{a(bArr, kVar), substring}).getBytes();
            ByteBuffer allocate2 = ByteBuffer.allocate(16);
            allocate2.order(ByteOrder.LITTLE_ENDIAN);
            allocate2.putLong(length);
            allocate2.putLong(c);
            allocate2.flip();
            byte[] a3 = a(n7.a(bytes), j, a2);
            if (z) {
                byte[] bytes3 = c(allocate2.array()).getBytes();
                byte[] bytes4 = c(a3).getBytes();
                allocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                allocate.put(bytes2);
                allocate.put(bytes3);
                allocate.put(bytes4);
            } else {
                allocate = ByteBuffer.allocate(bytes2.length + allocate2.remaining() + a3.length);
                allocate.put(bytes2);
                allocate.put(allocate2);
                allocate.put(a3);
            }
            allocate.flip();
            return allocate.array();
        } catch (IOException e) {
            kVar.D().a("AppLovinSdk", "encode2", e);
            return null;
        } catch (UnsupportedEncodingException e2) {
            kVar.D().a("AppLovinSdk", "encode2", e2);
            throw new RuntimeException("UTF-8 encoding not found", e2);
        }
    }

    private static byte[] a(byte[] bArr, long j, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        long j2 = j;
        for (int i = 0; i < bArr.length; i++) {
            if (i % 8 == 0) {
                long j3 = i + j;
                long j4 = (j3 ^ (j3 >>> 33)) * (-4417276706812531889L);
                long j5 = (j4 ^ (j4 >>> 29)) * (-8796714831421723037L);
                j2 = j5 ^ (j5 >>> 32);
            }
            byte b2 = copyOf[i];
            copyOf[i] = (byte) (b2 ^ (((j2 >> (r4 * 8)) & 255) ^ bArr2[i % bArr2.length]));
        }
        return copyOf;
    }

    private static String a(String str, String str2, com.applovin.impl.sdk.k kVar) {
        String str3;
        String[] split = str.split(":");
        char c = 0;
        try {
            try {
                if (!"1".equals(split[0])) {
                    return null;
                }
                try {
                    if (split.length != 4) {
                        return null;
                    }
                    String str4 = split[1];
                    String str5 = split[2];
                    byte[] b2 = b(split[3]);
                    if (!str2.endsWith(str5)) {
                        return null;
                    }
                    byte[] bArr = a;
                    if (!a(bArr, kVar).equals(str4)) {
                        return null;
                    }
                    char c2 = ' ';
                    byte[] a2 = a(str2.substring(0, 32), bArr, kVar);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b2);
                    char c3 = '\b';
                    long read = (((byteArrayInputStream.read() ^ a2[1]) & 255) << 8) | ((byteArrayInputStream.read() ^ a2[0]) & 255) | (((byteArrayInputStream.read() ^ a2[2]) & 255) << 16) | (((byteArrayInputStream.read() ^ a2[3]) & 255) << 24) | (((byteArrayInputStream.read() ^ a2[4]) & 255) << 32) | (((byteArrayInputStream.read() ^ a2[5]) & 255) << 40) | (((byteArrayInputStream.read() ^ a2[6]) & 255) << 48) | (((byteArrayInputStream.read() ^ a2[7]) & 255) << 56);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[8];
                    int read2 = byteArrayInputStream.read(bArr2);
                    int i = 0;
                    while (read2 >= 0) {
                        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                        long j = i + read;
                        long j2 = (j ^ (j >> 33)) * (-4417276706812531889L);
                        long j3 = (j2 ^ (j2 >> 29)) * (-8796714831421723037L);
                        long j4 = j3 ^ (j3 >> c2);
                        byteArrayOutputStream.write((byte) ((bArr2[c] ^ a2[i % a2.length]) ^ (j4 & 255)));
                        byteArrayOutputStream.write((byte) ((a2[(i + 1) % a2.length] ^ bArr2[1]) ^ ((j4 >> c3) & 255)));
                        byteArrayOutputStream.write((byte) ((a2[(i + 2) % a2.length] ^ bArr2[2]) ^ ((j4 >> 16) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[3] ^ a2[(i + 3) % a2.length]) ^ ((j4 >> 24) & 255)));
                        byteArrayOutputStream.write((byte) ((a2[(i + 4) % a2.length] ^ bArr2[4]) ^ ((j4 >> 32) & 255)));
                        byteArrayOutputStream.write((byte) ((a2[(i + 5) % a2.length] ^ bArr2[5]) ^ ((j4 >> 40) & 255)));
                        byteArrayOutputStream.write((byte) ((a2[(i + 6) % a2.length] ^ bArr2[6]) ^ ((j4 >> 48) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[7] ^ a2[(i + 7) % a2.length]) ^ ((j4 >> 56) & 255)));
                        i += 8;
                        byteArrayInputStream = byteArrayInputStream2;
                        read2 = byteArrayInputStream2.read(bArr2);
                        read = read;
                        c3 = '\b';
                        c = 0;
                        c2 = ' ';
                    }
                    return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
                } catch (IOException e) {
                    e = e;
                    str3 = null;
                    com.applovin.impl.sdk.o.b("AppLovinSdk", "Failed to read bytes", e);
                    kVar.D().a("AppLovinSdk", "decode", e);
                    return str3;
                }
            } catch (IOException e2) {
                e = e2;
                str3 = null;
            }
        } catch (UnsupportedEncodingException e3) {
            kVar.D().a("AppLovinSdk", "decode", e3);
            throw new RuntimeException("UTF-8 encoding not found", e3);
        }
    }

    private static String a(byte[] bArr, String str, com.applovin.impl.sdk.k kVar) {
        try {
            int c = c(bArr, str, kVar);
            if (c == 0) {
                return null;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, c, bArr.length);
            if (copyOfRange.length < 16) {
                return null;
            }
            long a2 = n7.a(copyOfRange, 8);
            byte[] a3 = a(str.substring(0, 32), b, kVar);
            return new String(n7.d(a(Arrays.copyOfRange(copyOfRange, 16, copyOfRange.length), a2 ^ n7.c(a3), a3)), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            kVar.D().a("AppLovinSdk", "decode2", e);
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (IOException e2) {
            com.applovin.impl.sdk.o.b("AppLovinSdk", "Failed to ungzip decode", e2);
            kVar.D().a("AppLovinSdk", "decode2", e2);
            return null;
        }
    }

    private static int a(byte[] bArr, byte b2) {
        if (bArr != null && bArr.length != 0) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] == b2) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static byte[] a(String str, byte[] bArr, com.applovin.impl.sdk.k kVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            kVar.D().a("AppLovinSdk", "SHA256", e);
            throw new RuntimeException("SHA-256 algorithm not found", e);
        }
    }

    private static String a(byte[] bArr, com.applovin.impl.sdk.k kVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            kVar.D().a("AppLovinSdk", "SHA1", e);
            throw new RuntimeException("SHA-1 algorithm not found", e);
        }
    }

    private static String a(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', '=');
    }

    private static String a(byte[] bArr) {
        return new String(bArr, "UTF-8").replace('+', '-').replace('/', '_').replace('=', '*');
    }
}
