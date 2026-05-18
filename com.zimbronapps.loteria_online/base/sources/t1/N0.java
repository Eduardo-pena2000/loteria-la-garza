package T1;

import T1.A0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n0 {
    public e a;

    public static class c extends e {
        public static final Interpolator f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        public static final Interpolator g = new A2.a();
        public static final Interpolator h = new DecelerateInterpolator();

        public static class a implements View.OnApplyWindowInsetsListener {
            public final b a;
            public A0 b;

            public class a implements ValueAnimator.AnimatorUpdateListener {
                public final /* synthetic */ n0 a;
                public final /* synthetic */ A0 b;
                public final /* synthetic */ A0 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ View e;

                public a(n0 n0Var, A0 a0, A0 a02, int i, View view) {
                    this.a = n0Var;
                    this.b = a0;
                    this.c = a02;
                    this.d = i;
                    this.e = view;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.f(valueAnimator.getAnimatedFraction());
                    c.l(this.e, c.p(this.b, this.c, this.a.c(), this.d), Collections.singletonList(this.a));
                }
            }

            public class b extends AnimatorListenerAdapter {
                public final /* synthetic */ n0 a;
                public final /* synthetic */ View b;

                public b(n0 n0Var, View view) {
                    this.a = n0Var;
                    this.b = view;
                }

                public void onAnimationEnd(Animator animator) {
                    this.a.f(1.0f);
                    c.j(this.b, this.a);
                }
            }

            public class c implements Runnable {
                public final /* synthetic */ View a;
                public final /* synthetic */ n0 b;
                public final /* synthetic */ a c;
                public final /* synthetic */ ValueAnimator d;

                public c(View view, n0 n0Var, a aVar, ValueAnimator valueAnimator) {
                    this.a = view;
                    this.b = n0Var;
                    this.c = aVar;
                    this.d = valueAnimator;
                }

                public void run() {
                    c.m(this.a, this.b, this.c);
                    this.d.start();
                }
            }

            public a(View view, b bVar) {
                this.a = bVar;
                A0 x = Z.x(view);
                this.b = x != null ? new A0.a(x).a() : null;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.b = A0.y(windowInsets, view);
                    return c.n(view, windowInsets);
                }
                A0 y = A0.y(windowInsets, view);
                if (this.b == null) {
                    this.b = Z.x(view);
                }
                if (this.b == null) {
                    this.b = y;
                    return c.n(view, windowInsets);
                }
                b o = c.o(view);
                if (o != null && Objects.equals(o.a, windowInsets)) {
                    return c.n(view, windowInsets);
                }
                int f = c.f(y, this.b);
                if (f == 0) {
                    return c.n(view, windowInsets);
                }
                A0 a0 = this.b;
                n0 n0Var = new n0(f, c.h(f, y, a0), 160L);
                n0Var.f(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(n0Var.b());
                a g = c.g(y, a0, f);
                c.k(view, n0Var, windowInsets, false);
                duration.addUpdateListener(new a(n0Var, y, a0, f, view));
                duration.addListener(new b(n0Var, view));
                K.a(view, new c(view, n0Var, g, duration));
                this.b = y;
                return c.n(view, windowInsets);
            }
        }

        public c(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        public static int f(A0 a0, A0 a02) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!a0.f(i2).equals(a02.f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        public static a g(A0 a0, A0 a02, int i) {
            K1.b f2 = a0.f(i);
            K1.b f3 = a02.f(i);
            return new a(K1.b.b(Math.min(f2.a, f3.a), Math.min(f2.b, f3.b), Math.min(f2.c, f3.c), Math.min(f2.d, f3.d)), K1.b.b(Math.max(f2.a, f3.a), Math.max(f2.b, f3.b), Math.max(f2.c, f3.c), Math.max(f2.d, f3.d)));
        }

        public static Interpolator h(int i, A0 a0, A0 a02) {
            return (i & 8) != 0 ? a0.f(A0.l.d()).d > a02.f(A0.l.d()).d ? f : g : h;
        }

        public static View.OnApplyWindowInsetsListener i(View view, b bVar) {
            return new a(view, bVar);
        }

        public static void j(View view, n0 n0Var) {
            b o = o(view);
            if (o != null) {
                o.c(n0Var);
                if (o.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    j(viewGroup.getChildAt(i), n0Var);
                }
            }
        }

        public static void k(View view, n0 n0Var, WindowInsets windowInsets, boolean z) {
            b o = o(view);
            if (o != null) {
                o.a = windowInsets;
                if (!z) {
                    o.d(n0Var);
                    z = o.b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    k(viewGroup.getChildAt(i), n0Var, windowInsets, z);
                }
            }
        }

        public static void l(View view, A0 a0, List list) {
            b o = o(view);
            if (o != null) {
                a0 = o.e(a0, list);
                if (o.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    l(viewGroup.getChildAt(i), a0, list);
                }
            }
        }

        public static void m(View view, n0 n0Var, a aVar) {
            b o = o(view);
            if (o != null) {
                o.f(n0Var, aVar);
                if (o.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m(viewGroup.getChildAt(i), n0Var, aVar);
                }
            }
        }

        public static WindowInsets n(View view, WindowInsets windowInsets) {
            return view.getTag(F1.c.L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b o(View view) {
            Object tag = view.getTag(F1.c.S);
            if (tag instanceof a) {
                return ((a) tag).a;
            }
            return null;
        }

        public static A0 p(A0 a0, A0 a02, float f2, int i) {
            A0.a aVar = new A0.a(a0);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    aVar.b(i2, a0.f(i2));
                } else {
                    K1.b f3 = a0.f(i2);
                    K1.b f4 = a02.f(i2);
                    float f5 = 1.0f - f2;
                    aVar.b(i2, A0.o(f3, (int) (((f3.a - f4.a) * f5) + 0.5d), (int) (((f3.b - f4.b) * f5) + 0.5d), (int) (((f3.c - f4.c) * f5) + 0.5d), (int) (((f3.d - f4.d) * f5) + 0.5d)));
                }
            }
            return aVar.a();
        }

        public static void q(View view, b bVar) {
            Object tag = view.getTag(F1.c.L);
            if (bVar == null) {
                view.setTag(F1.c.S, (Object) null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener i = i(view, bVar);
            view.setTag(F1.c.S, i);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(i);
            }
        }
    }

    public static class e {
        public final int a;
        public float b;
        public final Interpolator c;
        public final long d;
        public float e;

        public e(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public float a() {
            return this.e;
        }

        public long b() {
            return this.d;
        }

        public float c() {
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
        }

        public int d() {
            return this.a;
        }

        public void e(float f) {
            this.b = f;
        }
    }

    public n0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(i, interpolator, j);
        } else {
            this.a = new c(i, interpolator, j);
        }
    }

    public static void e(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.i(view, bVar);
        } else {
            c.q(view, bVar);
        }
    }

    public static n0 g(WindowInsetsAnimation windowInsetsAnimation) {
        return new n0(windowInsetsAnimation);
    }

    public float a() {
        return this.a.a();
    }

    public long b() {
        return this.a.b();
    }

    public float c() {
        return this.a.c();
    }

    public int d() {
        return this.a.d();
    }

    public void f(float f) {
        this.a.e(f);
    }

    public static class d extends e {
        public final WindowInsetsAnimation f;

        public static class a extends WindowInsetsAnimation$Callback {
            public final b a;
            public List b;
            public ArrayList c;
            public final HashMap d;

            public a(b bVar) {
                super(bVar.b());
                this.d = new HashMap();
                this.a = bVar;
            }

            public final n0 a(WindowInsetsAnimation windowInsetsAnimation) {
                n0 n0Var = (n0) this.d.get(windowInsetsAnimation);
                if (n0Var != null) {
                    return n0Var;
                }
                n0 g = n0.g(windowInsetsAnimation);
                this.d.put(windowInsetsAnimation, g);
                return g;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.d(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a = y0.a(list.get(size));
                    n0 a2 = a(a);
                    a2.f(z0.a(a));
                    this.c.add(a2);
                }
                return this.a.e(A0.x(windowInsets), this.b).w();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.a.f(a(windowInsetsAnimation), a.e(bounds)).d();
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds f(a aVar) {
            u0.a();
            return t0.a(aVar.a().e(), aVar.b().e());
        }

        public static K1.b g(WindowInsetsAnimation.Bounds bounds) {
            return K1.b.d(w0.a(bounds));
        }

        public static K1.b h(WindowInsetsAnimation.Bounds bounds) {
            return K1.b.d(x0.a(bounds));
        }

        public static void i(View view, b bVar) {
            r0.a(view, bVar != null ? new a(bVar) : null);
        }

        public long b() {
            return o0.a(this.f);
        }

        public float c() {
            return q0.a(this.f);
        }

        public int d() {
            return v0.a(this.f);
        }

        public void e(float f) {
            p0.a(this.f, f);
        }

        public d(int i, Interpolator interpolator, long j) {
            this(s0.a(i, interpolator, j));
        }
    }

    public static final class a {
        public final K1.b a;
        public final K1.b b;

        public a(K1.b bVar, K1.b bVar2) {
            this.a = bVar;
            this.b = bVar2;
        }

        public static a e(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public K1.b a() {
            return this.a;
        }

        public K1.b b() {
            return this.b;
        }

        public a c(K1.b bVar) {
            return new a(A0.o(this.a, bVar.a, bVar.b, bVar.c, bVar.d), A0.o(this.b, bVar.a, bVar.b, bVar.c, bVar.d));
        }

        public WindowInsetsAnimation.Bounds d() {
            return d.f(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.a = d.h(bounds);
            this.b = d.g(bounds);
        }
    }

    public n0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(windowInsetsAnimation);
        }
    }

    public static abstract class b {
        public WindowInsets a;
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final int b() {
            return this.b;
        }

        public abstract A0 e(A0 a0, List list);

        public void c(n0 n0Var) {
        }

        public void d(n0 n0Var) {
        }

        public a f(n0 n0Var, a aVar) {
            return aVar;
        }
    }
}
