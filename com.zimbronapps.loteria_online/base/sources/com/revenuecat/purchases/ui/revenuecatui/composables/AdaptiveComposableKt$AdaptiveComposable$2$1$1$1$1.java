package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import M0.A;
import M0.C;
import Qa.l;
import Qa.q;
import androidx.compose.ui.layout.q;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l0.E;
import n1.b;
import n1.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdaptiveComposableKt$AdaptiveComposable$2$1$1$1$1 extends u implements q {
    final /* synthetic */ int $index;
    final /* synthetic */ E $viewSizes;

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final void invoke(q.a layout) {
            t.g(layout, "$this$layout");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaptiveComposableKt$AdaptiveComposable$2$1$1$1$1(E e, int i) {
        super(3);
        this.$viewSizes = e;
        this.$index = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke-3p2s80s((androidx.compose.ui.layout.l) obj, (A) obj2, ((b) obj3).r());
    }

    public final C invoke-3p2s80s(androidx.compose.ui.layout.l layout, A measurable, long j) {
        t.g(layout, "$this$layout");
        t.g(measurable, "measurable");
        if (((Number) this.$viewSizes.get(this.$index)).intValue() == 0) {
            this.$viewSizes.set(this.$index, Integer.valueOf(measurable.C0(c.b(0, 0, 0, 0, 15, (Object) null)).W0()));
        }
        return androidx.compose.ui.layout.l.O0(layout, 0, 0, (Map) null, 1.INSTANCE, 4, (Object) null);
    }
}
