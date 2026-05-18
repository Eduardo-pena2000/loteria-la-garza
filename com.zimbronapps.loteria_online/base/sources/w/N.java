package W;

import E.o;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n extends View {
    public static final a f = new a(null);
    public static final int g = 8;
    public static final int[] h = {16842919, 16842910};
    public static final int[] i = new int[0];
    public v a;
    public Boolean b;
    public Long c;
    public Runnable d;
    public Qa.a e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public n(Context context) {
        super(context);
    }

    public static /* synthetic */ void a(n nVar) {
        setRippleState$lambda$2(nVar);
    }

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.c;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? h : i;
            v vVar = this.a;
            if (vVar != null) {
                vVar.setState(iArr);
            }
        } else {
            m mVar = new m(this);
            this.d = mVar;
            postDelayed(mVar, 50L);
        }
        this.c = Long.valueOf(currentAnimationTimeMillis);
    }

    private static final void setRippleState$lambda$2(n nVar) {
        v vVar = nVar.a;
        if (vVar != null) {
            vVar.setState(i);
        }
        nVar.d = null;
    }

    public final void b(o.b bVar, boolean z, long j, int i2, long j2, float f2, Qa.a aVar) {
        if (this.a == null || !kotlin.jvm.internal.t.c(Boolean.valueOf(z), this.b)) {
            c(z);
            this.b = Boolean.valueOf(z);
        }
        v vVar = this.a;
        kotlin.jvm.internal.t.d(vVar);
        this.e = aVar;
        vVar.c(i2);
        f(j, j2, f2);
        if (z) {
            vVar.setHotspot(u0.f.m(bVar.a()), u0.f.n(bVar.a()));
        } else {
            vVar.setHotspot(vVar.getBounds().centerX(), vVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c(boolean z) {
        v vVar = new v(z);
        setBackground(vVar);
        this.a = vVar;
    }

    public final void d() {
        this.e = null;
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.d;
            kotlin.jvm.internal.t.d(runnable2);
            runnable2.run();
        } else {
            v vVar = this.a;
            if (vVar != null) {
                vVar.setState(i);
            }
        }
        v vVar2 = this.a;
        if (vVar2 == null) {
            return;
        }
        vVar2.setVisible(false, false);
        unscheduleDrawable(vVar2);
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j, long j2, float f2) {
        v vVar = this.a;
        if (vVar == null) {
            return;
        }
        vVar.b(j2, f2);
        Rect rect = new Rect(0, 0, Sa.c.d(u0.l.i(j)), Sa.c.d(u0.l.g(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        vVar.setBounds(rect);
    }

    public void invalidateDrawable(Drawable drawable) {
        Qa.a aVar = this.e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void refreshDrawableState() {
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}
