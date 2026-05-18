package P0;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class z0 {

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ View a;
        public final /* synthetic */ View b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, View view2) {
            super(1);
            this.a = view;
            this.b = view2;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View view) {
            return Boolean.valueOf(z0.c(this.a, view, view.getNextFocusForwardId()) == this.b);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(1);
            this.a = i;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View view) {
            return Boolean.valueOf(view.getId() == this.a);
        }
    }

    public static final /* synthetic */ void a(View view, ArrayList arrayList, int i) {
        d(view, arrayList, i);
    }

    public static final /* synthetic */ View b(View view, View view2, int i) {
        return f(view, view2, i);
    }

    public static final /* synthetic */ View c(View view, View view2, int i) {
        return i(view, view2, i);
    }

    public static final void d(View view, ArrayList arrayList, int i) {
        if (Build.VERSION.SDK_INT < 26) {
            e(view, arrayList, view.isInTouchMode());
        } else {
            view.addFocusables(arrayList, i, view.isInTouchMode() ? 1 : 0);
        }
    }

    public static final void e(View view, ArrayList arrayList, boolean z) {
        boolean z2 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z2) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z3 = viewGroup.getDescendantFocusability() == 131072;
        if (z2 && z3) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i = 0; i < childCount; i++) {
                viewArr[i] = viewGroup.getChildAt(i);
            }
            C0.a.d(viewArr, viewGroup, viewGroup.getLayoutDirection() == 1);
            for (int i2 = 0; i2 < childCount; i2++) {
                e(viewArr[i2], arrayList, z);
            }
        }
        if (z2 && !z3 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    public static final View f(View view, View view2, int i) {
        int nextFocusForwardId;
        if (i == 1) {
            if (view.getId() == -1) {
                return null;
            }
            return g(view2, view, new a(view2, view));
        }
        if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return i(view2, view, nextFocusForwardId);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.view.View g(android.view.View r4, android.view.View r5, Qa.l r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            android.view.View r1 = h(r5, r6, r1)
            if (r1 != 0) goto L1d
            if (r5 != r4) goto Lb
            goto L1d
        Lb:
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L1c
            boolean r2 = r1 instanceof android.view.View
            if (r2 != 0) goto L16
            goto L1c
        L16:
            android.view.View r1 = (android.view.View) r1
            r3 = r1
            r1 = r5
            r5 = r3
            goto L2
        L1c:
            return r0
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.z0.g(android.view.View, android.view.View, Qa.l):android.view.View");
    }

    public static final View h(View view, Qa.l lVar, View view2) {
        View h;
        if (((Boolean) lVar.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (h = h(childAt, lVar, view2)) != null) {
                return h;
            }
        }
        return null;
    }

    public static final View i(View view, View view2, int i) {
        return g(view, view2, new b(i));
    }
}
