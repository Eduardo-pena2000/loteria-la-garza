package sa;

import android.graphics.drawable.ColorDrawable;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class c {
    public final ColorDrawable a;
    public final ColorDrawable b;
    public final a c;
    public final Double d;

    public c(ColorDrawable colorDrawable, ColorDrawable colorDrawable2, a aVar, Double d) {
        this.a = colorDrawable;
        this.b = colorDrawable2;
        this.c = aVar;
        this.d = d;
    }

    public ColorDrawable a() {
        return this.b;
    }

    public a b() {
        return this.c;
    }

    public Float c() {
        Double d = this.d;
        if (d == null) {
            return null;
        }
        return Float.valueOf(d.floatValue());
    }

    public ColorDrawable d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        ColorDrawable colorDrawable2 = this.a;
        return ((colorDrawable2 == null && cVar.a == null) || colorDrawable2.getColor() == cVar.a.getColor()) && (((colorDrawable = this.b) == null && cVar.b == null) || colorDrawable.getColor() == cVar.b.getColor()) && Objects.equals(this.d, cVar.d) && Objects.equals(this.c, cVar.c);
    }

    public int hashCode() {
        ColorDrawable colorDrawable = this.a;
        Integer valueOf = colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor());
        ColorDrawable colorDrawable2 = this.b;
        return Objects.hash(new Object[]{valueOf, colorDrawable2 != null ? Integer.valueOf(colorDrawable2.getColor()) : null, this.d, this.c});
    }
}
