package io.flutter.embedding.engine.renderer;

import android.media.ImageReader;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class j implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ FlutterRenderer.ImageReaderSurfaceProducer.b a;

    public /* synthetic */ j(FlutterRenderer.ImageReaderSurfaceProducer.b bVar) {
        this.a = bVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        FlutterRenderer.ImageReaderSurfaceProducer.b.a(this.a, imageReader);
    }
}
