package T1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i0 {
    public final WeakReference a;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ j0 a;
        public final /* synthetic */ View b;

        public a(j0 j0Var, View view) {
            this.a = j0Var;
            this.b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    public i0(View view) {
        this.a = new WeakReference(view);
    }

    public static /* synthetic */ void a(l0 l0Var, View view, ValueAnimator valueAnimator) {
        e(l0Var, view, valueAnimator);
    }

    public static /* synthetic */ void e(l0 l0Var, View view, ValueAnimator valueAnimator) {
        l0Var.a(view);
    }

    public i0 b(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void c() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public i0 f(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public i0 g(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public i0 h(j0 j0Var) {
        View view = (View) this.a.get();
        if (view != null) {
            i(view, j0Var);
        }
        return this;
    }

    public final void i(View view, j0 j0Var) {
        if (j0Var != null) {
            view.animate().setListener(new a(j0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public i0 j(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public i0 k(l0 l0Var) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setUpdateListener(l0Var != null ? new h0(l0Var, view) : null);
        }
        return this;
    }

    public void l() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public i0 m(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
