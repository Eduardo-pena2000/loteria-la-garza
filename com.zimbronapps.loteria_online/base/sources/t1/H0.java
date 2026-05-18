package T1;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ l0 a;
    public final /* synthetic */ View b;

    public /* synthetic */ h0(l0 l0Var, View view) {
        this.a = l0Var;
        this.b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        i0.a(this.a, this.b, valueAnimator);
    }
}
