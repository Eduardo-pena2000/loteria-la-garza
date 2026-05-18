// default package

import Sa.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public static final Bitmap a(Bitmap bitmap, Context context, float f, boolean z) {
        t.g(bitmap, "<this>");
        t.g(context, "context");
        if (f < 1.0f) {
            return bitmap;
        }
        double min = Math.min(f, 25.0d);
        Bitmap c = z ? c(bitmap) : bitmap;
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, c);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius((float) min);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        Bitmap.Config config = bitmap.getConfig();
        Bitmap createBitmap = config != null ? Bitmap.createBitmap(c.getWidth(), c.getHeight(), config) : null;
        createTyped.copyTo(createBitmap);
        createFromBitmap.destroy();
        createTyped.destroy();
        create2.destroy();
        create.destroy();
        return createBitmap == null ? c : createBitmap;
    }

    public static /* synthetic */ Bitmap b(Bitmap bitmap, Context context, float f, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return a(bitmap, context, f, z);
    }

    public static final Bitmap c(Bitmap bitmap) {
        float min = Math.min(400.0f / bitmap.getWidth(), 400.0f / bitmap.getHeight());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, c.d(bitmap.getWidth() * min), c.d(min * bitmap.getHeight()), true);
        t.f(createScaledBitmap, "createScaledBitmap(this, width, height, true)");
        return createScaledBitmap;
    }
}
