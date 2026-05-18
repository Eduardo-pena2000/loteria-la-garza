package io.flutter.plugin.platform;

import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.view.TextureRegistry;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b implements m {
    public TextureRegistry.ImageTextureEntry a;
    public ImageReader b;
    public int c = 0;
    public int d = 0;
    public final Handler e = new Handler();
    public final ImageReader.OnImageAvailableListener f = new a();

    public class a implements ImageReader.OnImageAvailableListener {
        public a() {
        }

        public void onImageAvailable(ImageReader imageReader) {
            Image image;
            try {
                image = imageReader.acquireLatestImage();
            } catch (IllegalStateException e) {
                Q9.b.b("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e);
                image = null;
            }
            if (image == null) {
                return;
            }
            b.b(b.this).pushImage(image);
        }
    }

    public b(TextureRegistry.ImageTextureEntry imageTextureEntry) {
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.a = imageTextureEntry;
    }

    public static /* synthetic */ TextureRegistry.ImageTextureEntry b(b bVar) {
        return bVar.a;
    }

    public void a(int i, int i2) {
        if (this.b != null && this.c == i && this.d == i2) {
            return;
        }
        c();
        this.c = i;
        this.d = i2;
        this.b = d();
    }

    public final void c() {
        if (this.b != null) {
            this.a.pushImage(null);
            this.b.close();
            this.b = null;
        }
    }

    public ImageReader d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return f();
        }
        if (i >= 29) {
            return e();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public ImageReader e() {
        ImageReader a2 = R9.l.a(this.c, this.d, 34, 4, 256L);
        a2.setOnImageAvailableListener(this.f, this.e);
        return a2;
    }

    public ImageReader f() {
        io.flutter.embedding.engine.renderer.h.a();
        ImageReader.Builder a2 = io.flutter.embedding.engine.renderer.g.a(this.c, this.d);
        io.flutter.embedding.engine.renderer.a.a(a2, 4);
        io.flutter.embedding.engine.renderer.b.a(a2, 34);
        io.flutter.embedding.engine.renderer.c.a(a2, 256L);
        ImageReader a3 = io.flutter.embedding.engine.renderer.d.a(a2);
        a3.setOnImageAvailableListener(this.f, this.e);
        return a3;
    }

    public int getHeight() {
        return this.d;
    }

    public long getId() {
        return this.a.id();
    }

    public Surface getSurface() {
        return this.b.getSurface();
    }

    public int getWidth() {
        return this.c;
    }

    public void release() {
        c();
        this.a = null;
    }
}
