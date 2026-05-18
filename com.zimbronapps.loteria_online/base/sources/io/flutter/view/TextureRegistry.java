package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;
import androidx.annotation.Keep;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface TextureRegistry {

    @Keep
    public interface GLTextureConsumer {
        SurfaceTexture getSurfaceTexture();
    }

    @Keep
    public interface ImageConsumer {
        Image acquireLatestImage();
    }

    @Keep
    public interface ImageTextureEntry {
        /* synthetic */ long id();

        void pushImage(Image image);

        /* synthetic */ void release();
    }

    @Keep
    public interface SurfaceProducer {

        public interface a {
        }

        Surface getForcedNewSurface();

        int getHeight();

        Surface getSurface();

        int getWidth();

        boolean handlesCropAndRotation();

        /* synthetic */ long id();

        /* synthetic */ void release();

        void scheduleFrame();

        void setCallback(a aVar);

        void setSize(int i, int i2);
    }

    @Keep
    public interface SurfaceTextureEntry {
        /* synthetic */ long id();

        /* synthetic */ void release();

        default void setOnFrameConsumedListener(a aVar) {
        }

        default void setOnTrimMemoryListener(b bVar) {
        }

        SurfaceTexture surfaceTexture();
    }

    public interface a {
    }

    public interface b {
        void onTrimMemory(int i);
    }

    public enum c {
        manual,
        resetInBackground
    }

    SurfaceProducer a(c cVar);

    ImageTextureEntry b();

    SurfaceTextureEntry c();
}
