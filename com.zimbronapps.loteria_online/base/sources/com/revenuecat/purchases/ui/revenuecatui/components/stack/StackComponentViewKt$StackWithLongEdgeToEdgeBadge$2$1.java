package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import Da.D;
import M0.A;
import M0.C;
import M0.S;
import Qa.l;
import Qa.p;
import androidx.compose.ui.layout.q;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import j0.i;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1 extends u implements p {
    final /* synthetic */ StackComponentStyle $badgeStack;
    final /* synthetic */ p $clickHandler;
    final /* synthetic */ float $contentAlpha;
    final /* synthetic */ StackComponentState $stackState;
    final /* synthetic */ PaywallState.Loaded.Components $state;
    final /* synthetic */ boolean $topBadge;

    public static final class 1 extends u implements l {
        final /* synthetic */ q $backgroundPlaceable;
        final /* synthetic */ q $badgePlaceable;
        final /* synthetic */ q $stackPlaceable;
        final /* synthetic */ boolean $topBadge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(q qVar, boolean z, q qVar2, q qVar3) {
            super(1);
            this.$backgroundPlaceable = qVar;
            this.$topBadge = z;
            this.$badgePlaceable = qVar2;
            this.$stackPlaceable = qVar3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a layout) {
            t.g(layout, "$this$layout");
            q.a.Z(layout, this.$backgroundPlaceable, 0, 0, 0.0f, 4, (Object) null);
            if (this.$topBadge) {
                q.a.Z(layout, this.$badgePlaceable, 0, 0, 0.0f, 4, (Object) null);
                q.a.Z(layout, this.$stackPlaceable, 0, this.$badgePlaceable.P0(), 0.0f, 4, (Object) null);
                this.$stackPlaceable.P0();
                return;
            }
            q.a.Z(layout, this.$stackPlaceable, 0, 0, 0.0f, 4, (Object) null);
            q.a.Z(layout, this.$badgePlaceable, 0, this.$stackPlaceable.P0(), 0.0f, 4, (Object) null);
            this.$badgePlaceable.P0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1(StackComponentState stackComponentState, PaywallState.Loaded.Components components, p pVar, float f, StackComponentStyle stackComponentStyle, boolean z) {
        super(2);
        this.$stackState = stackComponentState;
        this.$state = components;
        this.$clickHandler = pVar;
        this.$contentAlpha = f;
        this.$badgeStack = stackComponentStyle;
        this.$topBadge = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke-0kLqBqw((S) obj, ((b) obj2).r());
    }

    public final C invoke-0kLqBqw(S SubcomposeLayout, long j) {
        t.g(SubcomposeLayout, "$this$SubcomposeLayout");
        q C0 = ((A) D.f0(SubcomposeLayout.Y("stack", i.b(-1349600991, true, new StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$stackMeasurable$1(this.$stackState, this.$state, this.$clickHandler, this.$contentAlpha))))).C0(j);
        q C02 = ((A) D.f0(SubcomposeLayout.Y("badge", i.b(1484438374, true, new StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$badgeMeasurable$1(this.$badgeStack, this.$state, this.$clickHandler))))).C0(j);
        int P0 = C02.P0();
        int W0 = C0.W0();
        int P02 = C0.P0() + P0;
        return androidx.compose.ui.layout.l.O0(SubcomposeLayout, W0, P02, (Map) null, new 1(((A) D.f0(SubcomposeLayout.Y("background", i.b(-1688443959, true, new StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1(this.$badgeStack, this.$stackState, this.$topBadge, C0))))).C0(b.b.c(W0, P02)), this.$topBadge, C02, C0), 4, (Object) null);
    }
}
