package androidx.compose.ui.focus;

import G0.a;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.c;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.platform.AndroidComposeView;
import n1.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {
    public static final u0.h a(View view, View view2) {
        d.a aVar = d.a;
        view.getLocationInWindow(aVar.a());
        int i = aVar.a()[0];
        int i2 = aVar.a()[1];
        view2.getLocationInWindow(aVar.a());
        float f = i - aVar.a()[0];
        float f2 = i2 - aVar.a()[1];
        return new u0.h(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i) {
        c.a aVar = c.b;
        if (c.l(i, aVar.h())) {
            return 33;
        }
        if (c.l(i, aVar.a())) {
            return 130;
        }
        if (c.l(i, aVar.d())) {
            return 17;
        }
        if (c.l(i, aVar.g())) {
            return 66;
        }
        if (c.l(i, aVar.e())) {
            return 2;
        }
        return c.l(i, aVar.f()) ? 1 : null;
    }

    public static final c d(int i) {
        if (i == 1) {
            return c.i(c.b.f());
        }
        if (i == 2) {
            return c.i(c.b.e());
        }
        if (i == 17) {
            return c.i(c.b.d());
        }
        if (i == 33) {
            return c.i(c.b.h());
        }
        if (i == 66) {
            return c.i(c.b.g());
        }
        if (i != 130) {
            return null;
        }
        return c.i(c.b.a());
    }

    public static final c e(KeyEvent keyEvent) {
        long a = G0.d.a(keyEvent);
        a.a aVar = G0.a.b;
        if (G0.a.r(a, aVar.j())) {
            return c.i(c.b.f());
        }
        if (G0.a.r(a, aVar.i())) {
            return c.i(c.b.e());
        }
        if (G0.a.r(a, aVar.n())) {
            return c.i(G0.d.f(keyEvent) ? c.b.f() : c.b.e());
        }
        if (G0.a.r(a, aVar.e())) {
            return c.i(c.b.g());
        }
        if (G0.a.r(a, aVar.d())) {
            return c.i(c.b.d());
        }
        if (G0.a.r(a, aVar.f()) || G0.a.r(a, aVar.m())) {
            return c.i(c.b.h());
        }
        if (G0.a.r(a, aVar.c()) || G0.a.r(a, aVar.l())) {
            return c.i(c.b.a());
        }
        if (G0.a.r(a, aVar.b()) || G0.a.r(a, aVar.g()) || G0.a.r(a, aVar.k())) {
            return c.i(c.b.b());
        }
        if (G0.a.r(a, aVar.a()) || G0.a.r(a, aVar.h())) {
            return c.i(c.b.c());
        }
        return null;
    }

    public static final t f(int i) {
        if (i == 0) {
            return t.a;
        }
        if (i != 1) {
            return null;
        }
        return t.b;
    }
}
