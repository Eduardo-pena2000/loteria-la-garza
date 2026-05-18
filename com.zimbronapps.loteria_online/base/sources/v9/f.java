package V9;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ Bitmap a(ImageDecoder.Source source, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) {
        return ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
    }
}
