package V4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g {
    public final Drawable a;
    public final boolean b;

    public g(Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
    }

    public final Drawable a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (t.c(this.a, gVar.a) && this.b == gVar.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
    }
}
