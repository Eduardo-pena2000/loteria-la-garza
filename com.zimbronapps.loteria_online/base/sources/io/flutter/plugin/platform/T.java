package io.flutter.plugin.platform;

import ca.o;
import io.flutter.plugin.platform.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ u.a a;
    public final /* synthetic */ Z b;
    public final /* synthetic */ float c;
    public final /* synthetic */ o.b d;

    public /* synthetic */ t(u.a aVar, Z z, float f, o.b bVar) {
        this.a = aVar;
        this.b = z;
        this.c = f;
        this.d = bVar;
    }

    public final void run() {
        u.a.f(this.a, this.b, this.c, this.d);
    }
}
