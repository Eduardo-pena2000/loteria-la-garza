package Y9;

import android.content.Context;
import io.flutter.plugin.platform.k;
import io.flutter.view.TextureRegistry;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface a {

    public interface a {
        String a(String str);
    }

    public static class b {
        public final Context a;
        public final io.flutter.embedding.engine.a b;
        public final da.b c;
        public final TextureRegistry d;
        public final k e;
        public final a f;
        public final io.flutter.embedding.engine.b g;

        public b(Context context, io.flutter.embedding.engine.a aVar, da.b bVar, TextureRegistry textureRegistry, k kVar, a aVar2, io.flutter.embedding.engine.b bVar2) {
            this.a = context;
            this.b = aVar;
            this.c = bVar;
            this.d = textureRegistry;
            this.e = kVar;
            this.f = aVar2;
            this.g = bVar2;
        }

        public Context a() {
            return this.a;
        }

        public da.b b() {
            return this.c;
        }

        public a c() {
            return this.f;
        }

        public io.flutter.embedding.engine.a d() {
            return this.b;
        }

        public k e() {
            return this.e;
        }
    }

    void onAttachedToEngine(b bVar);

    void onDetachedFromEngine(b bVar);
}
