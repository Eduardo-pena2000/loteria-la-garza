package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ FlutterRenderer.ImageReaderSurfaceProducer a;

    public /* synthetic */ i(FlutterRenderer.ImageReaderSurfaceProducer imageReaderSurfaceProducer) {
        this.a = imageReaderSurfaceProducer;
    }

    public final void run() {
        FlutterRenderer.ImageReaderSurfaceProducer.a(this.a);
    }
}
