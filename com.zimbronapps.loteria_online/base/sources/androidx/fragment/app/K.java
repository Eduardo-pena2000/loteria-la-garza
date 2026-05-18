package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ W a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Rect c;

    public /* synthetic */ k(W w, View view, Rect rect) {
        this.a = w;
        this.b = view;
        this.c = rect;
    }

    public final void run() {
        f.g.i(this.a, this.b, this.c);
    }
}
