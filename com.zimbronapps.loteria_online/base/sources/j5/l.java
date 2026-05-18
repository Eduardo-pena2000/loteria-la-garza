package j5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l {
    public static final l a = new l();

    public final Bitmap a(Drawable drawable, Bitmap.Config config, f5.h hVar, f5.g gVar, boolean z) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z, bitmap, hVar, gVar)) {
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int o = j.o(mutate);
        if (o <= 0) {
            o = 512;
        }
        int i = j.i(mutate);
        int i2 = i > 0 ? i : 512;
        double c = V4.h.c(o, i2, f5.b.a(hVar) ? o : j.z(hVar.b(), gVar), f5.b.a(hVar) ? i2 : j.z(hVar.a(), gVar), gVar);
        int c2 = Sa.c.c(o * c);
        int c3 = Sa.c.c(c * i2);
        Bitmap createBitmap = Bitmap.createBitmap(c2, c3, a.e(config));
        kotlin.jvm.internal.t.f(createBitmap, "createBitmap(width, height, config)");
        Rect bounds = mutate.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        mutate.setBounds(0, 0, c2, c3);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    public final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == a.e(config);
    }

    public final boolean c(boolean z, Bitmap bitmap, f5.h hVar, f5.g gVar) {
        if (z) {
            return true;
        }
        return V4.h.c(bitmap.getWidth(), bitmap.getHeight(), f5.b.a(hVar) ? bitmap.getWidth() : j.z(hVar.b(), gVar), f5.b.a(hVar) ? bitmap.getHeight() : j.z(hVar.a(), gVar), gVar) == 1.0d;
    }
}
