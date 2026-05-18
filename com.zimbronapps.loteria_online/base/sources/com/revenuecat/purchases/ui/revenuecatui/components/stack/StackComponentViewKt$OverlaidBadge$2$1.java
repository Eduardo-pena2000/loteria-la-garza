package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import M0.A;
import M0.C;
import Qa.l;
import Qa.q;
import androidx.compose.ui.layout.q;
import com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentViewKt$OverlaidBadge$2$1 extends u implements q {
    final /* synthetic */ TwoDimensionalAlignment $alignment;
    final /* synthetic */ Float $mainStackBorderWidthPx;

    public static final class 1 extends u implements l {
        final /* synthetic */ TwoDimensionalAlignment $alignment;
        final /* synthetic */ Float $mainStackBorderWidthPx;
        final /* synthetic */ androidx.compose.ui.layout.q $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(androidx.compose.ui.layout.q qVar, TwoDimensionalAlignment twoDimensionalAlignment, Float f) {
            super(1);
            this.$placeable = qVar;
            this.$alignment = twoDimensionalAlignment;
            this.$mainStackBorderWidthPx = f;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a layout) {
            t.g(layout, "$this$layout");
            androidx.compose.ui.layout.q qVar = this.$placeable;
            int P0 = qVar.P0();
            TwoDimensionalAlignment twoDimensionalAlignment = this.$alignment;
            Float f = this.$mainStackBorderWidthPx;
            q.a.Z(layout, qVar, 0, StackComponentViewKt.access$getOverlaidBadgeOffsetY(P0, twoDimensionalAlignment, f != null ? f.floatValue() : 0.0f), 0.0f, 4, (Object) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentViewKt$OverlaidBadge$2$1(TwoDimensionalAlignment twoDimensionalAlignment, Float f) {
        super(3);
        this.$alignment = twoDimensionalAlignment;
        this.$mainStackBorderWidthPx = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke-3p2s80s((androidx.compose.ui.layout.l) obj, (A) obj2, ((b) obj3).r());
    }

    public final C invoke-3p2s80s(androidx.compose.ui.layout.l layout, A measurable, long j) {
        t.g(layout, "$this$layout");
        t.g(measurable, "measurable");
        androidx.compose.ui.layout.q C0 = measurable.C0(j);
        return androidx.compose.ui.layout.l.O0(layout, C0.W0(), C0.P0(), (Map) null, new 1(C0, this.$alignment, this.$mainStackBorderWidthPx), 4, (Object) null);
    }
}
