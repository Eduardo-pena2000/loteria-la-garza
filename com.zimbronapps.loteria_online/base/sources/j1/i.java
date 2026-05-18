package J1;

import J1.h;
import android.graphics.Typeface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ h.e a;
    public final /* synthetic */ Typeface b;

    public /* synthetic */ i(h.e eVar, Typeface typeface) {
        this.a = eVar;
        this.b = typeface;
    }

    public final void run() {
        h.e.a(this.a, this.b);
    }
}
