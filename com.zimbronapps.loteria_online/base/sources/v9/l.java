package V9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class l extends k {
    public l() {
        super(null);
    }

    public Bitmap a(ByteBuffer byteBuffer, p pVar) {
        Bitmap a = super.a(byteBuffer, pVar);
        return a != null ? a : d(byteBuffer, pVar);
    }

    public Bitmap d(ByteBuffer byteBuffer, p pVar) {
        byte[] b = n.b(byteBuffer);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b, 0, b.length, options);
        if (pVar.c == 0) {
            return n.a(decodeByteArray, pVar.e);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(pVar.c);
        Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
        decodeByteArray.recycle();
        return n.a(createBitmap, pVar.e);
    }
}
