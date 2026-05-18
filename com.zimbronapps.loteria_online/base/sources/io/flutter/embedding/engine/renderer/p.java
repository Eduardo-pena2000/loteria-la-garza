package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class p implements TextureRegistry.SurfaceProducer, TextureRegistry.GLTextureConsumer {
    public final long a;
    public int b;
    public int c;
    public boolean d;
    public Surface e;
    public final TextureRegistry.SurfaceTextureEntry f;
    public final Handler g;
    public final FlutterJNI h;

    public p(long j, Handler handler, FlutterJNI flutterJNI, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        this.a = j;
        this.g = handler;
        this.h = flutterJNI;
        this.f = surfaceTextureEntry;
    }

    public Surface a(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    public void finalize() {
        try {
            if (this.d) {
                return;
            }
            release();
            this.g.post(new FlutterRenderer.f(this.a, this.h));
        } finally {
            super.finalize();
        }
    }

    public Surface getForcedNewSurface() {
        this.e = null;
        return getSurface();
    }

    public int getHeight() {
        return this.c;
    }

    public Surface getSurface() {
        Surface surface = this.e;
        if (surface == null || !surface.isValid()) {
            this.e = a(this.f.surfaceTexture());
        }
        return this.e;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.f.surfaceTexture();
    }

    public int getWidth() {
        return this.b;
    }

    public boolean handlesCropAndRotation() {
        return true;
    }

    public long id() {
        return this.a;
    }

    public void release() {
        this.f.release();
        this.e.release();
        this.e = null;
        this.d = true;
    }

    public void scheduleFrame() {
        this.h.markTextureFrameAvailable(this.a);
    }

    public void setCallback(TextureRegistry.SurfaceProducer.a aVar) {
    }

    public void setSize(int i, int i2) {
        this.b = i;
        this.c = i2;
        getSurfaceTexture().setDefaultBufferSize(i, i2);
    }
}
