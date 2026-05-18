package androidx.fragment.app;

import androidx.fragment.app.b0;
import androidx.fragment.app.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ b0.d a;
    public final /* synthetic */ b0.d b;
    public final /* synthetic */ f.g c;

    public /* synthetic */ j(b0.d dVar, b0.d dVar2, f.g gVar) {
        this.a = dVar;
        this.b = dVar2;
        this.c = gVar;
    }

    public final void run() {
        f.g.h(this.a, this.b, this.c);
    }
}
