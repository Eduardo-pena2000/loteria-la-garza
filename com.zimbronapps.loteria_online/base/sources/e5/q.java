package e5;

import android.graphics.drawable.Drawable;
import c5.c;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q extends i {
    public final Drawable a;
    public final h b;
    public final V4.f c;
    public final c.b d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public /* synthetic */ q(Drawable drawable, h hVar, V4.f fVar, c.b bVar, String str, boolean z, boolean z2, int i, kotlin.jvm.internal.k kVar) {
        this(drawable, hVar, fVar, (i & 8) != 0 ? null : bVar, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }

    public Drawable a() {
        return this.a;
    }

    public h b() {
        return this.b;
    }

    public final V4.f c() {
        return this.c;
    }

    public final boolean d() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (t.c(a(), qVar.a()) && t.c(b(), qVar.b()) && this.c == qVar.c && t.c(this.d, qVar.d) && t.c(this.e, qVar.e) && this.f == qVar.f && this.g == qVar.g) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((a().hashCode() * 31) + b().hashCode()) * 31) + this.c.hashCode()) * 31;
        c.b bVar = this.d;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.e;
        return ((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.g);
    }

    public q(Drawable drawable, h hVar, V4.f fVar, c.b bVar, String str, boolean z, boolean z2) {
        super(null);
        this.a = drawable;
        this.b = hVar;
        this.c = fVar;
        this.d = bVar;
        this.e = str;
        this.f = z;
        this.g = z2;
    }
}
