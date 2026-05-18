package com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation;

import Qa.l;
import androidx.compose.animation.a;
import androidx.compose.animation.e;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import y.k;
import z.G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterAnimations {
    public static final int $stable = 0;
    public static final CustomerCenterAnimations INSTANCE = new CustomerCenterAnimations();

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final Integer invoke(int i) {
            return Integer.valueOf(-i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    public static final class 2 extends u implements l {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(1);
        }

        public final Integer invoke(int i) {
            return Integer.valueOf(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    public static final class 3 extends u implements l {
        public static final 3 INSTANCE = new 3();

        public 3() {
            super(1);
        }

        public final Integer invoke(int i) {
            return Integer.valueOf(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    public static final class 4 extends u implements l {
        public static final 4 INSTANCE = new 4();

        public 4() {
            super(1);
        }

        public final Integer invoke(int i) {
            return Integer.valueOf(-i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    private CustomerCenterAnimations() {
    }

    public final k getTransitionForNavigation(CustomerCenterDestination from, CustomerCenterDestination to, CustomerCenterNavigationState navigationState) {
        t.g(from, "from");
        t.g(to, "to");
        t.g(navigationState, "navigationState");
        return navigationState.isBackwardTransition(from, to) ? a.e(e.x((G) null, 1.INSTANCE, 1, (Object) null), e.C((G) null, 2.INSTANCE, 1, (Object) null)) : a.e(e.x((G) null, 3.INSTANCE, 1, (Object) null), e.C((G) null, 4.INSTANCE, 1, (Object) null));
    }
}
