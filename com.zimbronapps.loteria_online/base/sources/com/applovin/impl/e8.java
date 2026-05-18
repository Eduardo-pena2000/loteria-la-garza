package com.applovin.impl;

import android.app.Activity;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class e8 {

    public class a implements Animation.AnimationListener {
        final /* synthetic */ View a;
        final /* synthetic */ Runnable b;

        public a(View view, Runnable runnable) {
            this.a = view;
            this.b = runnable;
        }

        public void onAnimationEnd(Animation animation) {
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            this.a.setVisibility(0);
        }
    }

    public class b implements Animation.AnimationListener {
        final /* synthetic */ View a;
        final /* synthetic */ Runnable b;

        public b(View view, Runnable runnable) {
            this.a = view;
            this.b = runnable;
        }

        public void onAnimationEnd(Animation animation) {
            this.a.setVisibility(4);
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            this.a.setVisibility(0);
        }
    }

    public static void a(View view, long j, Runnable runnable) {
        view.setVisibility(4);
        view.bringToFront();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new a(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    public static /* synthetic */ WindowInsets b(com.applovin.impl.sdk.k kVar, View view, WindowInsets windowInsets) {
        return a(kVar, view, windowInsets);
    }

    public static void c(View view) {
        if (view == null) {
            return;
        }
        ViewGroup parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.removeView(view);
        }
    }

    public static boolean b(int i) {
        return i == 0;
    }

    public static void b(View view, long j, Runnable runnable) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new b(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    public static boolean a(int i, int i2) {
        return b(i) != b(i2);
    }

    public static Activity b(View view, com.applovin.impl.sdk.k kVar) {
        if (view == null) {
            return null;
        }
        for (int i = 0; i < 1000; i++) {
            try {
                Activity context = view.getContext();
                if (context instanceof Activity) {
                    return context;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("ViewUtils", "Encountered error while retrieving activity from view", th);
                }
            }
        }
        return null;
    }

    public static String a(int i) {
        if (i == 0) {
            return "VISIBLE";
        }
        if (i == 4) {
            return "INVISIBLE";
        }
        if (i == 8) {
            return "GONE";
        }
        return String.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] a(int r2, int r3, int r4) {
        /*
            if (r2 != 0) goto L7
            int[] r2 = new int[]{r3, r4}
            return r2
        L7:
            r0 = r2 & 119(0x77, float:1.67E-43)
            r1 = 119(0x77, float:1.67E-43)
            if (r0 != r1) goto L14
            r2 = 13
            int[] r2 = new int[]{r2}
            return r2
        L14:
            r0 = r2 & 112(0x70, float:1.57E-43)
            r1 = 112(0x70, float:1.57E-43)
            if (r0 != r1) goto L1b
            goto L33
        L1b:
            r0 = r2 & 48
            r1 = 48
            if (r0 != r1) goto L24
            r3 = 10
            goto L35
        L24:
            r0 = r2 & 80
            r1 = 80
            if (r0 != r1) goto L2d
            r3 = 12
            goto L35
        L2d:
            r0 = r2 & 16
            r1 = 16
            if (r0 != r1) goto L35
        L33:
            r3 = 15
        L35:
            r0 = r2 & 7
            r1 = 7
            if (r0 != r1) goto L3b
            goto L63
        L3b:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r2 & r0
            if (r1 != r0) goto L45
            r4 = 20
            goto L65
        L45:
            r0 = r2 & 3
            r1 = 3
            if (r0 != r1) goto L4d
            r4 = 9
            goto L65
        L4d:
            r0 = 8388613(0x800005, float:1.175495E-38)
            r1 = r2 & r0
            if (r1 != r0) goto L57
            r4 = 21
            goto L65
        L57:
            r0 = r2 & 5
            r1 = 5
            if (r0 != r1) goto L5f
            r4 = 11
            goto L65
        L5f:
            r0 = 1
            r2 = r2 & r0
            if (r2 != r0) goto L65
        L63:
            r4 = 14
        L65:
            int[] r2 = new int[]{r4, r3}
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.e8.a(int, int, int):int[]");
    }

    public static View b(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View findViewById = rootView.findViewById(16908290);
        return findViewById != null ? findViewById : rootView;
    }

    public static void a(View view, com.applovin.impl.sdk.k kVar) {
        if (view == null || kVar == null || !o0.b()) {
            return;
        }
        view.setOnApplyWindowInsetsListener(new O0(kVar));
    }

    private static /* synthetic */ WindowInsets a(com.applovin.impl.sdk.k kVar, View view, WindowInsets windowInsets) {
        Insets a2 = T1.R0.a(windowInsets, ((Integer) kVar.a(x4.u2)).intValue());
        view.setPadding(q.I.a(a2), q.J.a(a2), q.K.a(a2), q.L.a(a2));
        return T1.S0.a();
    }

    public static boolean a(View view, Activity activity) {
        if (activity != null && view != null) {
            Window window = activity.getWindow();
            if (window != null) {
                return a(view, window.getDecorView());
            }
            View findViewById = activity.findViewById(16908290);
            if (findViewById != null) {
                return a(view, findViewById.getRootView());
            }
        }
        return false;
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (a(view, viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String a(View view) {
        return view.getClass().getName() + '@' + Integer.toHexString(view.hashCode());
    }
}
