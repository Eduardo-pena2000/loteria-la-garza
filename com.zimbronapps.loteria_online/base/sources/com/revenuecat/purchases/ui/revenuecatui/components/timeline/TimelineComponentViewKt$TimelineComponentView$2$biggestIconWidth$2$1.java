package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.SizeConstraintExtensionsKt;
import java.util.Iterator;
import kotlin.jvm.internal.u;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentViewKt$TimelineComponentView$2$biggestIconWidth$2$1 extends u implements a {
    final /* synthetic */ TimelineComponentState $timelineState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentViewKt$TimelineComponentView$2$biggestIconWidth$2$1(TimelineComponentState timelineComponentState) {
        super(0);
        this.$timelineState = timelineComponentState;
    }

    /* renamed from: invoke-lTKBWiU, reason: merged with bridge method [inline-methods] */
    public final h invoke() {
        Iterator it = this.$timelineState.getItems().iterator();
        if (!it.hasNext()) {
            return null;
        }
        h dpOrNull = SizeConstraintExtensionsKt.dpOrNull(((TimelineComponentState.ItemState) it.next()).getIcon().getSize().getWidth());
        Comparable d = h.d(dpOrNull != null ? dpOrNull.m() : h.g(0));
        while (it.hasNext()) {
            h dpOrNull2 = SizeConstraintExtensionsKt.dpOrNull(((TimelineComponentState.ItemState) it.next()).getIcon().getSize().getWidth());
            Comparable d2 = h.d(dpOrNull2 != null ? dpOrNull2.m() : h.g(0));
            if (d.compareTo(d2) < 0) {
                d = d2;
            }
        }
        return d;
    }
}
