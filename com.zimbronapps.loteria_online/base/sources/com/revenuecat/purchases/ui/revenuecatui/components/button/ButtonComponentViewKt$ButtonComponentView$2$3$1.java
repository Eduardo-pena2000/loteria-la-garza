package com.revenuecat.purchases.ui.revenuecatui.components.button;

import Ca.I;
import M0.A;
import M0.B;
import M0.C;
import M0.m;
import Qa.l;
import Sa.c;
import androidx.compose.ui.layout.q;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ButtonComponentViewKt$ButtonComponentView$2$3$1 implements B {
    final /* synthetic */ float $marginBottom;
    final /* synthetic */ float $marginEnd;
    final /* synthetic */ float $marginStart;
    final /* synthetic */ float $marginTop;

    public static final class 1 extends u implements l {
        final /* synthetic */ float $marginStartPx;
        final /* synthetic */ float $marginTopPx;
        final /* synthetic */ q $progress;
        final /* synthetic */ q $stack;
        final /* synthetic */ float $stackHeightMinusMargin;
        final /* synthetic */ float $stackWidthMinusMargin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(q qVar, q qVar2, float f, float f2, float f3, float f4) {
            super(1);
            this.$stack = qVar;
            this.$progress = qVar2;
            this.$marginStartPx = f;
            this.$stackWidthMinusMargin = f2;
            this.$marginTopPx = f3;
            this.$stackHeightMinusMargin = f4;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a layout) {
            t.g(layout, "$this$layout");
            q.a.Z(layout, this.$stack, 0, 0, 0.0f, 4, (Object) null);
            q.a.Z(layout, this.$progress, ((int) this.$marginStartPx) + c.d((this.$stackWidthMinusMargin / 2.0f) - (r2.W0() / 2.0f)), ((int) this.$marginTopPx) + c.d((this.$stackHeightMinusMargin / 2.0f) - (this.$progress.P0() / 2.0f)), 0.0f, 4, (Object) null);
        }
    }

    public ButtonComponentViewKt$ButtonComponentView$2$3$1(float f, float f2, float f3, float f4) {
        this.$marginStart = f;
        this.$marginEnd = f2;
        this.$marginTop = f3;
        this.$marginBottom = f4;
    }

    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(m mVar, List list, int i) {
        return super.maxIntrinsicHeight(mVar, list, i);
    }

    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(m mVar, List list, int i) {
        return super.maxIntrinsicWidth(mVar, list, i);
    }

    public final C measure-3p2s80s(androidx.compose.ui.layout.l Layout, List measurables, long j) {
        t.g(Layout, "$this$Layout");
        t.g(measurables, "measurables");
        q C0 = ((A) measurables.get(0)).C0(j);
        float j1 = Layout.j1(this.$marginStart);
        float j12 = Layout.j1(this.$marginEnd);
        float j13 = Layout.j1(this.$marginTop);
        float j14 = Layout.j1(this.$marginBottom);
        int access$progressSize = ButtonComponentViewKt.access$progressSize(Layout, C0.W0(), C0.P0(), j1, j12, j13, j14);
        q C02 = ((A) measurables.get(1)).C0(n1.c.a(access$progressSize, access$progressSize, access$progressSize, access$progressSize));
        int W0 = C0.W0();
        int P0 = C0.P0();
        return androidx.compose.ui.layout.l.O0(Layout, W0, P0, (Map) null, new 1(C0, C02, j1, (W0 - j1) - j12, j13, (P0 - j13) - j14), 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ int minIntrinsicHeight(m mVar, List list, int i) {
        return super.minIntrinsicHeight(mVar, list, i);
    }

    public /* bridge */ /* synthetic */ int minIntrinsicWidth(m mVar, List list, int i) {
        return super.minIntrinsicWidth(mVar, list, i);
    }
}
