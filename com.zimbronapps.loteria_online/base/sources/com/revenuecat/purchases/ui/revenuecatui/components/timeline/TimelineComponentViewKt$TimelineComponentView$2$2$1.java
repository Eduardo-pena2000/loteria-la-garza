package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Ca.I;
import Qa.l;
import b0.h2;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import kotlin.jvm.internal.u;
import t1.e;
import t1.f;
import t1.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentViewKt$TimelineComponentView$2$2$1 extends u implements l {
    final /* synthetic */ h2 $biggestIconWidth$delegate;
    final /* synthetic */ i.b $currentPreviousItem;
    final /* synthetic */ f $descriptionRef;
    final /* synthetic */ TimelineComponentState $timelineState;
    final /* synthetic */ f $titleRef;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimelineComponent.IconAlignment.values().length];
            try {
                iArr[TimelineComponent.IconAlignment.Title.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimelineComponent.IconAlignment.TitleAndDescription.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentViewKt$TimelineComponentView$2$2$1(TimelineComponentState timelineComponentState, i.b bVar, f fVar, f fVar2, h2 h2Var) {
        super(1);
        this.$timelineState = timelineComponentState;
        this.$currentPreviousItem = bVar;
        this.$titleRef = fVar;
        this.$descriptionRef = fVar2;
        this.$biggestIconWidth$delegate = h2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e) obj);
        return I.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke(t1.e r15) {
        /*
            r14 = this;
            java.lang.String r0 = "$this$constrainAs"
            kotlin.jvm.internal.t.g(r15, r0)
            com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentState r0 = r14.$timelineState
            com.revenuecat.purchases.paywalls.components.TimelineComponent$IconAlignment r0 = r0.getIconAlignment()
            int[] r1 = com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt$TimelineComponentView$2$2$1.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L50
            r1 = 2
            if (r0 == r1) goto L1a
            goto L7b
        L1a:
            t1.v r2 = r15.h()
            t1.f r0 = r14.$titleRef
            t1.i$b r3 = r0.e()
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            t1.v.b(r2, r3, r4, r5, r6, r7)
            t1.v r8 = r15.c()
            t1.f r0 = r14.$descriptionRef
            t1.i$b r9 = r0.b()
            r12 = 6
            r13 = 0
            r10 = 0
            r11 = 0
            t1.v.b(r8, r9, r10, r11, r12, r13)
            t1.E r0 = r15.g()
            t1.f r1 = r15.f()
            t1.i$c r1 = r1.d()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            t1.E.b(r0, r1, r2, r3, r4, r5)
            goto L7b
        L50:
            t1.v r6 = r15.h()
            t1.i$b r0 = r14.$currentPreviousItem
            if (r0 != 0) goto L60
            t1.f r0 = r15.f()
            t1.i$b r0 = r0.e()
        L60:
            r7 = r0
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            t1.v.b(r6, r7, r8, r9, r10, r11)
            t1.E r0 = r15.g()
            t1.f r1 = r15.f()
            t1.i$c r1 = r1.d()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            t1.E.b(r0, r1, r2, r3, r4, r5)
        L7b:
            b0.h2 r0 = r14.$biggestIconWidth$delegate
            n1.h r0 = com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt.access$TimelineComponentView$lambda$13$lambda$1(r0)
            if (r0 == 0) goto L8f
            float r0 = r0.m()
            t1.s$b r1 = t1.s.a
            t1.s r0 = r1.d(r0)
            if (r0 != 0) goto L95
        L8f:
            t1.s$b r0 = t1.s.a
            t1.s r0 = r0.c()
        L95:
            r15.m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt$TimelineComponentView$2$2$1.invoke(t1.e):void");
    }
}
