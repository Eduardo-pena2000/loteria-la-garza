package androidx.recyclerview.widget;

import T1.Z;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d extends RecyclerView.n implements RecyclerView.r {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.s C;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            d.this.p(500);
        }
    }

    public class b extends RecyclerView.s {
        public b() {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
            d.this.A(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    public class c extends AnimatorListenerAdapter {
        public boolean a = false;

        public c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
                return;
            }
            if (((Float) d.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.x(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.u();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.c.setAlpha(floatValue);
            d.this.d.setAlpha(floatValue);
            d.this.u();
        }
    }

    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        i(recyclerView);
    }

    public void A(int i, int i2) {
        int computeVerticalScrollRange = this.s.computeVerticalScrollRange();
        int i3 = this.r;
        this.t = computeVerticalScrollRange - i3 > 0 && i3 >= this.a;
        int computeHorizontalScrollRange = this.s.computeHorizontalScrollRange();
        int i4 = this.q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.a;
        this.u = z;
        boolean z2 = this.t;
        if (!z2 && !z) {
            if (this.v != 0) {
                x(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.l = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.u) {
            float f2 = i4;
            this.o = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.v;
        if (i5 == 0 || i5 == 1) {
            x(1);
        }
    }

    public final void B(float f) {
        int[] o = o();
        float max = Math.max(o[0], Math.min(o[1], f));
        if (Math.abs(this.l - max) < 2.0f) {
            return;
        }
        int w = w(this.m, max, o, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
        if (w != 0) {
            this.s.scrollBy(0, w);
        }
        this.m = max;
    }

    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean t = t(motionEvent.getX(), motionEvent.getY());
            boolean s = s(motionEvent.getX(), motionEvent.getY());
            if (t || s) {
                if (s) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (t) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                x(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            x(1);
            this.w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.v == 2) {
            z();
            if (this.w == 1) {
                q(motionEvent.getX());
            }
            if (this.w == 2) {
                B(motionEvent.getY());
            }
        }
    }

    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.v;
        if (i == 1) {
            boolean t = t(motionEvent.getX(), motionEvent.getY());
            boolean s = s(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!t && !s) {
                return false;
            }
            if (s) {
                this.w = 1;
                this.p = (int) motionEvent.getX();
            } else if (t) {
                this.w = 2;
                this.m = (int) motionEvent.getY();
            }
            x(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    public void c(boolean z) {
    }

    public void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            x(0);
        } else if (this.A != 0) {
            if (this.t) {
                m(canvas);
            }
            if (this.u) {
                l(canvas);
            }
        }
    }

    public void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            k();
        }
        this.s = recyclerView;
        if (recyclerView != null) {
            y();
        }
    }

    public final void j() {
        this.s.removeCallbacks(this.B);
    }

    public final void k() {
        this.s.T0(this);
        this.s.U0(this);
        this.s.V0(this.C);
        j();
    }

    public final void l(Canvas canvas) {
        int i = this.r;
        int i2 = this.i;
        int i3 = this.o;
        int i4 = this.n;
        this.g.setBounds(0, 0, i4, i2);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, i - i2);
        this.h.draw(canvas);
        canvas.translate(i3 - (i4 / 2), 0.0f);
        this.g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    public final void m(Canvas canvas) {
        int i = this.q;
        int i2 = this.e;
        int i3 = i - i2;
        int i4 = this.l;
        int i5 = this.k;
        int i6 = i4 - (i5 / 2);
        this.c.setBounds(0, 0, i2, i5);
        this.d.setBounds(0, 0, this.f, this.r);
        if (!r()) {
            canvas.translate(i3, 0.0f);
            this.d.draw(canvas);
            canvas.translate(0.0f, i6);
            this.c.draw(canvas);
            canvas.translate(-i3, -i6);
            return;
        }
        this.d.draw(canvas);
        canvas.translate(this.e, i6);
        canvas.scale(-1.0f, 1.0f);
        this.c.draw(canvas);
        canvas.scale(1.0f, 1.0f);
        canvas.translate(-this.e, -i6);
    }

    public final int[] n() {
        int[] iArr = this.y;
        int i = this.b;
        iArr[0] = i;
        iArr[1] = this.q - i;
        return iArr;
    }

    public final int[] o() {
        int[] iArr = this.x;
        int i = this.b;
        iArr[0] = i;
        iArr[1] = this.r - i;
        return iArr;
    }

    public void p(int i) {
        int i2 = this.A;
        if (i2 == 1) {
            this.z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.z.setDuration(i);
        this.z.start();
    }

    public final void q(float f) {
        int[] n = n();
        float max = Math.max(n[0], Math.min(n[1], f));
        if (Math.abs(this.o - max) < 2.0f) {
            return;
        }
        int w = w(this.p, max, n, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
        if (w != 0) {
            this.s.scrollBy(w, 0);
        }
        this.p = max;
    }

    public final boolean r() {
        return Z.t(this.s) == 1;
    }

    public boolean s(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean t(float f, float f2) {
        if (!r() ? f >= this.q - this.e : f <= this.e / 2) {
            int i = this.l;
            int i2 = this.k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    public void u() {
        this.s.invalidate();
    }

    public final void v(int i) {
        j();
        this.s.postDelayed(this.B, i);
    }

    public final int w(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    public void x(int i) {
        if (i == 2 && this.v != 2) {
            this.c.setState(D);
            j();
        }
        if (i == 0) {
            u();
        } else {
            z();
        }
        if (this.v == 2 && i != 2) {
            this.c.setState(E);
            v(1200);
        } else if (i == 1) {
            v(1500);
        }
        this.v = i;
    }

    public final void y() {
        this.s.g(this);
        this.s.i(this);
        this.s.j(this.C);
    }

    public void z() {
        int i = this.A;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }
}
