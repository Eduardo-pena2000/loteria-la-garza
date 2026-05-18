package v0;

import android.graphics.ColorFilter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b0 extends androidx.compose.ui.graphics.d {
    public final long c;
    public final int d;

    public /* synthetic */ b0(long j, int i, ColorFilter colorFilter, kotlin.jvm.internal.k kVar) {
        this(j, i, colorFilter);
    }

    public final int b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return r0.s(this.c, b0Var.c) && androidx.compose.ui.graphics.c.G(this.d, b0Var.d);
    }

    public int hashCode() {
        return (r0.y(this.c) * 31) + androidx.compose.ui.graphics.c.H(this.d);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + r0.z(this.c) + ", blendMode=" + androidx.compose.ui.graphics.c.I(this.d) + ')';
    }

    public /* synthetic */ b0(long j, int i, kotlin.jvm.internal.k kVar) {
        this(j, i);
    }

    public b0(long j, int i, ColorFilter colorFilter) {
        super(colorFilter);
        this.c = j;
        this.d = i;
    }

    public b0(long j, int i) {
        this(j, i, F.a(j, i), null);
    }
}
