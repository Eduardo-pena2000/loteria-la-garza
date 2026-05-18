package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ f.g a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ m(f.g gVar, ViewGroup viewGroup) {
        this.a = gVar;
        this.b = viewGroup;
    }

    public final void run() {
        f.g.b.a.a(this.a, this.b);
    }
}
