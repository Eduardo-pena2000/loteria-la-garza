package K9;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class i extends StateListDrawable {
    public int a;

    public i(Drawable drawable, int i) {
        this.a = i;
        addState(new int[]{16842913}, drawable);
        addState(new int[0], drawable);
    }

    public boolean isStateful() {
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (i == 16842913) {
                z = true;
            }
        }
        if (z) {
            super/*android.graphics.drawable.Drawable*/.setColorFilter(this.a, PorterDuff.Mode.SRC_ATOP);
        } else {
            super/*android.graphics.drawable.Drawable*/.clearColorFilter();
        }
        return super.onStateChange(iArr);
    }
}
