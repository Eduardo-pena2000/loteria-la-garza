package io.flutter.plugin.platform;

import io.flutter.plugin.platform.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ g.b a;
    public final /* synthetic */ int b;

    public /* synthetic */ h(g.b bVar, int i) {
        this.a = bVar;
        this.b = i;
    }

    public final void run() {
        g.b.a(this.a, this.b);
    }
}
