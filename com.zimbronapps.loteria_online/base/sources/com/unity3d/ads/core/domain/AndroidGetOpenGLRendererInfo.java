package com.unity3d.ads.core.domain;

import Za.c;
import android.opengl.GLES20;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gl.EglCore;
import com.unity3d.ads.gl.OffscreenSurface;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetOpenGLRendererInfo implements GetOpenGLRendererInfo {
    private final SessionRepository sessionRepository;

    public AndroidGetOpenGLRendererInfo(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    public ByteString invoke() {
        if (!this.sessionRepository.getFeatureFlags().getOpenglGpuEnabled()) {
            ByteString empty = ByteString.empty();
            t.f(empty, "{\n            ByteString.empty()\n        }");
            return empty;
        }
        EglCore eglCore = new EglCore(null, 2);
        OffscreenSurface offscreenSurface = new OffscreenSurface(eglCore, 1, 1);
        offscreenSurface.makeCurrent();
        String renderer = GLES20.glGetString(7937);
        t.f(renderer, "renderer");
        byte[] bytes = renderer.getBytes(c.b);
        t.f(bytes, "this as java.lang.String).getBytes(charset)");
        ByteString copyFrom = ByteString.copyFrom(bytes);
        offscreenSurface.release();
        eglCore.release();
        t.f(copyFrom, "{\n            // We need…dererByteString\n        }");
        return copyFrom;
    }
}
