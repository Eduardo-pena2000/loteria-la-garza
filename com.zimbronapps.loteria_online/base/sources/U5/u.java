package U5;

import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ v a;
    public final /* synthetic */ Drawable b;

    public /* synthetic */ u(v vVar, Drawable drawable) {
        this.a = vVar;
        this.b = drawable;
    }

    public final /* synthetic */ void run() {
        this.a.a.a.getWindow().setBackgroundDrawable(this.b);
    }
}
