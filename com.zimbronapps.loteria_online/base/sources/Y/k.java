package y;

import b0.W0;
import b0.z0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k {
    public final androidx.compose.animation.f a;
    public final androidx.compose.animation.g b;
    public final z0 c;
    public A d;

    public k(androidx.compose.animation.f fVar, androidx.compose.animation.g gVar, float f, A a) {
        this.a = fVar;
        this.b = gVar;
        this.c = W0.a(f);
        this.d = a;
    }

    public final androidx.compose.animation.g a() {
        return this.b;
    }

    public final A b() {
        return this.d;
    }

    public final androidx.compose.animation.f c() {
        return this.a;
    }

    public final float d() {
        return this.c.b();
    }

    public /* synthetic */ k(androidx.compose.animation.f fVar, androidx.compose.animation.g gVar, float f, A a, int i, kotlin.jvm.internal.k kVar) {
        this(fVar, gVar, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? androidx.compose.animation.a.d(false, null, 3, null) : a);
    }
}
