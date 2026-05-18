package V9;

import android.graphics.BitmapFactory;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a {
    public static void a(byte[] bArr, p pVar) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            pVar.d = options.outMimeType;
            pVar.f = options.outHeight;
            pVar.g = options.outWidth;
        } catch (Exception e) {
            Q9.b.c("BitmapMetadataReader", "Failed to decode image for mime type", e);
        }
    }
}
