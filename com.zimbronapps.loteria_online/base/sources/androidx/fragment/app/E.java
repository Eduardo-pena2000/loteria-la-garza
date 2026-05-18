package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ f.a c;

    public /* synthetic */ e(ViewGroup viewGroup, View view, f.a aVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = aVar;
    }

    public final void run() {
        f.a.a.a(this.a, this.b, this.c);
    }
}
