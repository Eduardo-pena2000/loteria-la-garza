package e5;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f extends i {
    public final Drawable a;
    public final h b;
    public final Throwable c;

    public f(Drawable drawable, h hVar, Throwable th) {
        super(null);
        this.a = drawable;
        this.b = hVar;
        this.c = th;
    }

    public Drawable a() {
        return this.a;
    }

    public h b() {
        return this.b;
    }

    public final Throwable c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (t.c(a(), fVar.a()) && t.c(b(), fVar.b()) && t.c(this.c, fVar.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Drawable a = a();
        return ((((a != null ? a.hashCode() : 0) * 31) + b().hashCode()) * 31) + this.c.hashCode();
    }
}
