package Y4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g extends h {
    public final Drawable a;
    public final boolean b;
    public final V4.f c;

    public g(Drawable drawable, boolean z, V4.f fVar) {
        super(null);
        this.a = drawable;
        this.b = z;
        this.c = fVar;
    }

    public final V4.f a() {
        return this.c;
    }

    public final Drawable b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (t.c(this.a, gVar.a) && this.b == gVar.b && this.c == gVar.c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31) + this.c.hashCode();
    }
}
