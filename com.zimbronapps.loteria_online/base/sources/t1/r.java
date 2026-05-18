package T1;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r {
    public final DisplayCutout a;

    public static class a {
        public static List a(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public static class b {
        public static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public r(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public static r g(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new r(displayCutout);
    }

    public List a() {
        return Build.VERSION.SDK_INT >= 28 ? a.a(this.a) : Collections.emptyList();
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(this.a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.a);
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return S1.c.a(this.a, ((r) obj).a);
    }

    public K1.b f() {
        return Build.VERSION.SDK_INT >= 30 ? K1.b.d(b.a(this.a)) : K1.b.e;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return q.a(displayCutout);
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
