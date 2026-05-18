package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ FlutterRenderer.e a;

    public /* synthetic */ k(FlutterRenderer.e eVar) {
        this.a = eVar;
    }

    public final void run() {
        FlutterRenderer.e.b(this.a);
    }
}
