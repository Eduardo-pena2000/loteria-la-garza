package W;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class v extends RippleDrawable {
    public static final a e = new a(null);
    public final boolean a;
    public r0 b;
    public Integer c;
    public boolean d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b {
        public static final b a = new b();

        public final void a(RippleDrawable rippleDrawable, int i) {
            rippleDrawable.setRadius(i);
        }
    }

    public v(boolean z) {
        super(ColorStateList.valueOf(-16777216), (Drawable) null, z ? new ColorDrawable(-1) : null);
        this.a = z;
    }

    public final long a(long j, float f) {
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        return r0.q(j, Wa.n.h(f, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long j, float f) {
        long a2 = a(j, f);
        r0 r0Var = this.b;
        if (r0Var == null ? false : r0.s(r0Var.A(), a2)) {
            return;
        }
        this.b = r0.m(a2);
        setColor(ColorStateList.valueOf(s0.k(a2)));
    }

    public final void c(int i) {
        Integer num = this.c;
        if (num != null && num.intValue() == i) {
            return;
        }
        this.c = Integer.valueOf(i);
        b.a.a(this, i);
    }

    public Rect getDirtyBounds() {
        if (!this.a) {
            this.d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.d = false;
        return dirtyBounds;
    }

    public boolean isProjected() {
        return this.d;
    }
}
