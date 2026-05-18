package K9;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class f {
    public static final byte[] b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    public final b a;

    public static class a {
        public final ByteBuffer a;

        public a(byte[] bArr, int i) {
            this.a = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public short a(int i) {
            return this.a.getShort(i);
        }

        public int b(int i) {
            return this.a.getInt(i);
        }

        public int c() {
            return this.a.remaining();
        }

        public void d(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    public interface b {
        int a();

        int b(byte[] bArr, int i);

        short c();

        long skip(long j);
    }

    public static class c implements b {
        public final InputStream a;

        public c(InputStream inputStream) {
            this.a = inputStream;
        }

        public int a() {
            return ((this.a.read() << 8) & 65280) | (this.a.read() & 255);
        }

        public int b(byte[] bArr, int i) {
            int i2 = i;
            while (i2 > 0) {
                int read = this.a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        public short c() {
            return (short) (this.a.read() & 255);
        }

        public long skip(long j) {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.a.skip(j2);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    public f(InputStream inputStream) {
        this.a = new c(inputStream);
    }

    public static int a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0041 -> B:14:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r4, int r5, int r6, android.net.Uri r7, android.net.Uri r8) {
        /*
            java.lang.String r0 = "ImageHeaderParser"
            if (r4 != 0) goto La
            java.lang.String r4 = "context is null"
            android.util.Log.d(r0, r4)
            return
        La:
            r1 = 0
            android.content.ContentResolver r2 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            java.io.InputStream r7 = r2.openInputStream(r7)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            w2.a r2 = new w2.a     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d
            java.lang.String r3 = "rw"
            android.os.ParcelFileDescriptor r1 = r4.openFileDescriptor(r8, r3)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d
            w2.a r4 = new w2.a     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d
            java.io.FileDescriptor r8 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d
            f(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d
            if (r7 == 0) goto L3c
            r7.close()     // Catch: java.io.IOException -> L34
            goto L3c
        L34:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            android.util.Log.d(r0, r5, r4)
        L3c:
            r1.close()     // Catch: java.io.IOException -> L40
            goto L70
        L40:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            android.util.Log.d(r0, r5, r4)
            goto L70
        L49:
            r4 = move-exception
            r5 = r1
            r1 = r7
            goto L72
        L4d:
            r4 = move-exception
            r5 = r1
            r1 = r7
            goto L56
        L51:
            r4 = move-exception
            r5 = r1
            goto L72
        L54:
            r4 = move-exception
            r5 = r1
        L56:
            java.lang.String r6 = r4.getMessage()     // Catch: java.lang.Throwable -> L71
            android.util.Log.d(r0, r6, r4)     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L6b
            r1.close()     // Catch: java.io.IOException -> L63
            goto L6b
        L63:
            r4 = move-exception
            java.lang.String r6 = r4.getMessage()
            android.util.Log.d(r0, r6, r4)
        L6b:
            if (r5 == 0) goto L70
            r5.close()     // Catch: java.io.IOException -> L40
        L70:
            return
        L71:
            r4 = move-exception
        L72:
            if (r1 == 0) goto L80
            r1.close()     // Catch: java.io.IOException -> L78
            goto L80
        L78:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            android.util.Log.d(r0, r7, r6)
        L80:
            if (r5 == 0) goto L8e
            r5.close()     // Catch: java.io.IOException -> L86
            goto L8e
        L86:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            android.util.Log.d(r0, r6, r5)
        L8e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.f.b(android.content.Context, int, int, android.net.Uri, android.net.Uri):void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0027 -> B:11:0x003e). Please report as a decompilation issue!!! */
    public static void c(Context context, int i, int i2, Uri uri, String str) {
        if (context == null) {
            Log.d("ImageHeaderParser", "context is null");
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = context.getContentResolver().openInputStream(uri);
                    f(new w2.a(inputStream), new w2.a(str), i, i2);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    Log.d("ImageHeaderParser", e.getMessage(), e);
                    if (inputStream == null) {
                    } else {
                        inputStream.close();
                    }
                }
            } catch (IOException e2) {
                Log.d("ImageHeaderParser", e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Log.d("ImageHeaderParser", e3.getMessage(), e3);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0026 -> B:10:0x003d). Please report as a decompilation issue!!! */
    public static void d(Context context, w2.a aVar, int i, int i2, Uri uri) {
        if (context == null) {
            Log.d("ImageHeaderParser", "context is null");
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            try {
                try {
                    parcelFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
                    f(aVar, new w2.a(parcelFileDescriptor.getFileDescriptor()), i, i2);
                    parcelFileDescriptor.close();
                } catch (IOException e) {
                    Log.d("ImageHeaderParser", e.getMessage(), e);
                }
            } catch (IOException e2) {
                Log.d("ImageHeaderParser", e2.getMessage());
                if (parcelFileDescriptor == null) {
                } else {
                    parcelFileDescriptor.close();
                }
            }
        } catch (Throwable th) {
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e3) {
                    Log.d("ImageHeaderParser", e3.getMessage(), e3);
                }
            }
            throw th;
        }
    }

    public static void e(w2.a aVar, int i, int i2, String str) {
        try {
            f(aVar, new w2.a(str), i, i2);
        } catch (IOException e) {
            Log.d("ImageHeaderParser", e.getMessage());
        }
    }

    public static void f(w2.a aVar, w2.a aVar2, int i, int i2) {
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        for (int i3 = 0; i3 < 22; i3++) {
            String str = strArr[i3];
            String h = aVar.h(str);
            if (!TextUtils.isEmpty(h)) {
                aVar2.b0(str, h);
            }
        }
        aVar2.b0("ImageWidth", String.valueOf(i));
        aVar2.b0("ImageLength", String.valueOf(i2));
        aVar2.b0("Orientation", "0");
        aVar2.X();
    }

    public static boolean h(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    public static int k(a aVar) {
        ByteOrder byteOrder;
        short a2 = aVar.a(6);
        if (a2 == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (a2 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Unknown endianness = " + a2);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        aVar.d(byteOrder);
        int b2 = aVar.b(10) + 6;
        short a3 = aVar.a(b2);
        for (int i = 0; i < a3; i++) {
            int a4 = a(b2, i);
            short a5 = aVar.a(a4);
            if (a5 == 274) {
                short a6 = aVar.a(a4 + 2);
                if (a6 >= 1 && a6 <= 12) {
                    int b3 = aVar.b(a4 + 4);
                    if (b3 >= 0) {
                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                            Log.d("ImageHeaderParser", "Got tagIndex=" + i + " tagType=" + a5 + " formatCode=" + a6 + " componentCount=" + b3);
                        }
                        int i2 = b3 + c[a6];
                        if (i2 <= 4) {
                            int i3 = a4 + 8;
                            if (i3 >= 0 && i3 <= aVar.c()) {
                                if (i2 >= 0 && i2 + i3 <= aVar.c()) {
                                    return aVar.a(i3);
                                }
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    Log.d("ImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + a5);
                                }
                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                Log.d("ImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + a5);
                            }
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            Log.d("ImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + a6);
                        }
                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                        Log.d("ImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Got invalid format code = " + a6);
                }
            }
        }
        return -1;
    }

    public int g() {
        int a2 = this.a.a();
        if (h(a2)) {
            int j = j();
            if (j != -1) {
                return l(new byte[j], j);
            }
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Parser doesn't handle magic number: " + a2);
        }
        return -1;
    }

    public final boolean i(byte[] bArr, int i) {
        boolean z = bArr != null && i > b.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = b;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
        return z;
    }

    public final int j() {
        short c2;
        int a2;
        long j;
        long skip;
        do {
            short c3 = this.a.c();
            if (c3 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unknown segmentId=" + c3);
                }
                return -1;
            }
            c2 = this.a.c();
            if (c2 == 218) {
                return -1;
            }
            if (c2 == 217) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a2 = this.a.a() - 2;
            if (c2 == 225) {
                return a2;
            }
            j = a2;
            skip = this.a.skip(j);
        } while (skip == j);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + c2 + ", wanted to skip: " + a2 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    public final int l(byte[] bArr, int i) {
        int b2 = this.a.b(bArr, i);
        if (b2 == i) {
            if (i(bArr, i)) {
                return k(new a(bArr, i));
            }
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + b2);
        }
        return -1;
    }
}
