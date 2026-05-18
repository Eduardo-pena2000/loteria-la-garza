package androidx.compose.ui.platform;

import P0.y0;
import P0.z0;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.focus.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import kotlin.jvm.internal.t;
import v0.s1;
import w.K;
import w.P;
import w.Q;
import w.U;
import w.d0;
import w.f0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public static final b f = new b(null);
    public static final int g = 8;
    public static final a h = new a();
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final c d = new c(new y0(this));
    public final ArrayList e = new ArrayList();

    public static final class a extends ThreadLocal {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h initialValue() {
            return new h();
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final h a() {
            Object obj = h.b().get();
            t.d(obj);
            return (h) obj;
        }

        public b() {
        }
    }

    public static final class c implements Comparator {
        public final a a;
        public final P b = d0.b();
        public final Q c = f0.b();
        public final P d = d0.b();
        public final K e = U.b();
        public View f;

        public interface a {
            View a(View view, View view2);
        }

        public c(a aVar) {
            this.a = aVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            if (view == view2) {
                return 0;
            }
            if (view == null) {
                return -1;
            }
            if (view2 == null) {
                return 1;
            }
            View view3 = (View) this.d.e(view);
            View view4 = (View) this.d.e(view2);
            if (view3 == view4 && view3 != null) {
                if (view == view3) {
                    return -1;
                }
                return (view2 == view3 || this.b.e(view) == null) ? 1 : -1;
            }
            if (view3 != null) {
                view = view3;
            }
            if (view4 != null) {
                view2 = view4;
            }
            if (view3 == null && view4 == null) {
                return 0;
            }
            return this.e.c(view) < this.e.c(view2) ? -1 : 1;
        }

        public final void b() {
            this.f = null;
            this.d.k();
            this.c.m();
            this.e.j();
            this.b.k();
        }

        public final void c(ArrayList arrayList, View view) {
            this.f = view;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.e.u((View) arrayList.get(i), i);
            }
            int size2 = arrayList.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i2 = size2 - 1;
                    View view2 = (View) arrayList.get(size2);
                    View a2 = this.a.a(view, view2);
                    if (a2 != null && this.e.a(a2)) {
                        this.b.x(view2, a2);
                        this.c.h(a2);
                    }
                    if (i2 < 0) {
                        break;
                    } else {
                        size2 = i2;
                    }
                }
            }
            int size3 = arrayList.size() - 1;
            if (size3 < 0) {
                return;
            }
            while (true) {
                int i3 = size3 - 1;
                View view3 = (View) arrayList.get(size3);
                if (((View) this.b.e(view3)) != null && !this.c.a(view3)) {
                    d(view3);
                }
                if (i3 < 0) {
                    return;
                } else {
                    size3 = i3;
                }
            }
        }

        public final void d(View view) {
            View view2 = view;
            while (view != null) {
                View view3 = (View) this.d.e(view);
                if (view3 != null) {
                    if (view3 == view2) {
                        return;
                    }
                    view = view2;
                    view2 = view3;
                }
                this.d.x(view, view2);
                view = (View) this.b.e(view);
            }
        }
    }

    public static /* synthetic */ View a(h hVar, View view, View view2) {
        return p(hVar, view, view2);
    }

    public static final /* synthetic */ a b() {
        return h;
    }

    public static final View p(h hVar, View view, View view2) {
        if (hVar.m(view2.getNextFocusForwardId())) {
            return z0.b(view2, view, 2);
        }
        return null;
    }

    public final View c(ViewGroup viewGroup, Rect rect, int i) {
        ViewGroup j = j(viewGroup, null);
        ArrayList arrayList = this.e;
        try {
            arrayList.clear();
            z0.a(j, arrayList, i);
            if (arrayList.isEmpty()) {
                return null;
            }
            return e(j, null, rect, i, arrayList);
        } finally {
            arrayList.clear();
        }
    }

    public final View d(ViewGroup viewGroup, View view, int i) {
        ViewGroup j = j(viewGroup, view);
        View i2 = i(j, view, i);
        if (i2 != null) {
            return i2;
        }
        ArrayList arrayList = this.e;
        try {
            arrayList.clear();
            z0.a(j, arrayList, i);
            if (!arrayList.isEmpty()) {
                i2 = e(j, view, null, i, arrayList);
            }
            return i2;
        } finally {
            arrayList.clear();
        }
    }

    public final View e(ViewGroup viewGroup, View view, Rect rect, int i, ArrayList arrayList) {
        Rect rect2 = this.a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i != 1) {
            if (i != 2) {
                if (i == 17 || i == 33) {
                    n(viewGroup, rect2);
                } else if (i == 66 || i == 130) {
                    o(viewGroup, rect2);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                n(viewGroup, rect2);
            } else {
                o(viewGroup, rect2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            o(viewGroup, rect2);
        } else {
            n(viewGroup, rect2);
        }
        if (i == 1 || i == 2) {
            return h(arrayList, viewGroup, view, i);
        }
        if (i == 17 || i == 33 || i == 66 || i == 130) {
            return g(viewGroup, view, rect2, arrayList, i);
        }
        throw new IllegalArgumentException("Unknown direction: " + i);
    }

    public final View f(ViewGroup viewGroup, Rect rect, int i) {
        this.a.set(rect);
        return c(viewGroup, this.a, i);
    }

    public final View g(ViewGroup viewGroup, View view, Rect rect, ArrayList arrayList, int i) {
        this.b.set(rect);
        if (i == 17) {
            this.b.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            this.b.offset(0, rect.height() + 1);
        } else if (i == 66) {
            this.b.offset((-rect.width()) - 1, 0);
        } else if (i == 130) {
            this.b.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = (View) arrayList.get(i2);
            if (!t.c(view3, view) && !t.c(view3, viewGroup)) {
                view3.getFocusedRect(this.c);
                viewGroup.offsetDescendantRectToMyCoords(view3, this.c);
                u0.h e = s1.e(this.c);
                u0.h e2 = s1.e(this.b);
                u0.h e3 = s1.e(rect);
                androidx.compose.ui.focus.c d = androidx.compose.ui.focus.e.d(i);
                if (s.m(e, e2, e3, d != null ? d.o() : androidx.compose.ui.focus.c.b.e())) {
                    this.b.set(this.c);
                    view2 = view3;
                }
            }
        }
        return view2;
    }

    public final View h(ArrayList arrayList, ViewGroup viewGroup, View view, int i) {
        try {
            this.d.c(arrayList, viewGroup);
            Collections.sort(arrayList, this.d);
            this.d.b();
            int size = arrayList.size();
            View view2 = null;
            if (size < 2) {
                return null;
            }
            if (i == 1) {
                view2 = l(view, arrayList, size);
            } else if (i == 2) {
                view2 = k(view, arrayList, size);
            } else if (i == 17 || i == 33 || i == 66 || i == 130) {
                view2 = g(viewGroup, view, this.a, arrayList, i);
            }
            return view2 == null ? (View) arrayList.get(size - 1) : view2;
        } catch (Throwable th) {
            this.d.b();
            throw th;
        }
    }

    public final View i(ViewGroup viewGroup, View view, int i) {
        View b2 = z0.b(view, viewGroup, i);
        boolean z = true;
        View view2 = b2;
        while (b2 != null) {
            if (b2.isFocusable() && b2.getVisibility() == 0 && (!b2.isInTouchMode() || b2.isFocusableInTouchMode())) {
                return b2;
            }
            b2 = z0.b(b2, viewGroup, i);
            boolean z2 = !z;
            if (!z) {
                view2 = view2 != null ? z0.b(view2, viewGroup, i) : null;
                if (view2 == b2) {
                    break;
                }
            }
            z = z2;
        }
        return null;
    }

    public final ViewGroup j(ViewGroup viewGroup, View view) {
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = null;
            while (parent instanceof ViewGroup) {
                if (parent == viewGroup) {
                    return viewGroup2 == null ? viewGroup : viewGroup2;
                }
                ViewGroup viewGroup3 = (ViewGroup) parent;
                if (viewGroup3.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                    viewGroup2 = viewGroup3;
                }
                parent = viewGroup3.getParent();
            }
        }
        return viewGroup;
    }

    public final View k(View view, ArrayList arrayList, int i) {
        int lastIndexOf;
        int i2;
        if (i < 2) {
            return null;
        }
        return (view == null || (lastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i2 = lastIndexOf + 1) >= i) ? (View) arrayList.get(0) : (View) arrayList.get(i2);
    }

    public final View l(View view, ArrayList arrayList, int i) {
        int indexOf;
        if (i < 2) {
            return null;
        }
        return (view == null || (indexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(i - 1) : (View) arrayList.get(indexOf - 1);
    }

    public final boolean m(int i) {
        return (i == 0 || i == -1) ? false : true;
    }

    public final void n(ViewGroup viewGroup, Rect rect) {
        int scrollY = viewGroup.getScrollY() + viewGroup.getHeight();
        int scrollX = viewGroup.getScrollX() + viewGroup.getWidth();
        rect.set(scrollX, scrollY, scrollX, scrollY);
    }

    public final void o(ViewGroup viewGroup, Rect rect) {
        int scrollY = viewGroup.getScrollY();
        int scrollX = viewGroup.getScrollX();
        rect.set(scrollX, scrollY, scrollX, scrollY);
    }
}
