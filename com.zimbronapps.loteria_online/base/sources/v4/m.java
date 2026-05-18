package V4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m {
    public static final m a = new m();
    public static final Paint b = new Paint(3);

    public final j a(String str, xb.g gVar, l lVar) {
        if (!n.c(lVar, str)) {
            return j.d;
        }
        w2.a aVar = new w2.a(new k(gVar.peek().inputStream()));
        return new j(aVar.C(), aVar.r());
    }

    public final Bitmap b(Bitmap bitmap, j jVar) {
        Bitmap createBitmap;
        if (!jVar.b() && !n.a(jVar)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (jVar.b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (n.a(jVar)) {
            matrix.postRotate(jVar.a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f = rectF.left;
        if (f != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f, -rectF.top);
        }
        if (n.b(jVar)) {
            createBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), j5.a.c(bitmap));
            t.f(createBitmap, "createBitmap(width, height, config)");
        } else {
            createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), j5.a.c(bitmap));
            t.f(createBitmap, "createBitmap(width, height, config)");
        }
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, b);
        bitmap.recycle();
        return createBitmap;
    }
}
