package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class l implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ FlutterRenderer.e a;

    public /* synthetic */ l(FlutterRenderer.e eVar) {
        this.a = eVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        FlutterRenderer.e.a(this.a, surfaceTexture);
    }
}
