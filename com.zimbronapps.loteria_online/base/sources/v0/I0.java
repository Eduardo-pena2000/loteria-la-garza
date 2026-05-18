package v0;

import android.graphics.Shader;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i0 {

    public static final class a extends A1 {
        public final /* synthetic */ Shader a;

        public a(Shader shader) {
            this.a = shader;
        }

        public Shader createShader-uvyYCjk(long j) {
            return this.a;
        }
    }

    public static final A1 a(Shader shader) {
        return new a(shader);
    }
}
