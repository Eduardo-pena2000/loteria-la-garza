package V9;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class b {
    public static void a(byte[] bArr, p pVar) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                pVar.e = new w2.a(byteArrayInputStream).i("Orientation", 1);
                byteArrayInputStream.close();
            } finally {
            }
        } catch (IOException e) {
            Q9.b.c("ExifMetadataReader", "Failed to read EXIF metadata", e);
        }
    }
}
