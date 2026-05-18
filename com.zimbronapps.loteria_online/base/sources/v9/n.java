package V9;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class n {
    public static Bitmap a(Bitmap bitmap, int i) {
        if (bitmap == null || !c(i)) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        if (i == 2) {
            matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
        } else if (i == 7) {
            matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
        } else if (i == 4) {
            matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
        } else {
            if (i != 5) {
                return bitmap;
            }
            matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static byte[] b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        return bArr;
    }

    public static boolean c(int i) {
        switch (i) {
            case 1:
            case 3:
            case 6:
            case 8:
                break;
            case 2:
            case 4:
            case 5:
            case 7:
                break;
            default:
                Q9.b.b("ImageUtils", "Unknown EXIF orientation: " + i);
                break;
        }
        return false;
    }
}
