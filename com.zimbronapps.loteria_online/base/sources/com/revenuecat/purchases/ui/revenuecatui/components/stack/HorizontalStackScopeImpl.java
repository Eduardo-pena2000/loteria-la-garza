package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import Da.v;
import F.V;
import F.Y;
import Qa.q;
import Qa.s;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import j0.i;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class HorizontalStackScopeImpl implements HorizontalStackScope {
    private final FlexDistribution distribution;
    private final q fillSpaceSpacer;
    private boolean hasAnyItemsWithFillWidth;
    private q rowContent;
    private final float spacing;
    private final SizeConstraint width;

    public static final class 2 extends u implements q {
        final /* synthetic */ s $itemContent;
        final /* synthetic */ List $items;
        final /* synthetic */ HorizontalStackScopeImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(List list, s sVar, HorizontalStackScopeImpl horizontalStackScopeImpl) {
            super(3);
            this.$items = list;
            this.$itemContent = sVar;
            this.this$0 = horizontalStackScopeImpl;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((V) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(V v, m mVar, int i) {
            t.g(v, "$this$null");
            int i2 = (i & 6) == 0 ? i | (mVar.U(v) ? 4 : 2) : i;
            if ((i2 & 19) == 18 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(1239185597, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.HorizontalStackScopeImpl.items.<anonymous> (HorizontalStack.kt:96)");
            }
            List list = this.$items;
            s sVar = this.$itemContent;
            HorizontalStackScopeImpl horizontalStackScopeImpl = this.this$0;
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    v.x();
                }
                ComponentStyle componentStyle = (ComponentStyle) obj;
                boolean z = i3 == list.size() - 1;
                sVar.invoke(v, Integer.valueOf(i3), componentStyle, mVar, Integer.valueOf(i2 & 14));
                mVar.V(-855017870);
                if (StackComponentViewKt.getUsesAllAvailableSpace(HorizontalStackScopeImpl.access$getDistribution$p(horizontalStackScopeImpl)) && !z) {
                    Y.a(g.x(e.a, HorizontalStackScopeImpl.access$getSpacing$p(horizontalStackScopeImpl), 0.0f, 2, (Object) null), mVar, 0);
                    if (horizontalStackScopeImpl.getShouldApplyFillSpacers()) {
                        HorizontalStackScopeImpl.access$getFillSpaceSpacer$p(horizontalStackScopeImpl).invoke(Float.valueOf(HorizontalStackScopeImpl.access$getDistribution$p(horizontalStackScopeImpl) == FlexDistribution.SPACE_AROUND ? 2.0f : 1.0f), mVar, 0);
                    }
                }
                mVar.P();
                i3 = i4;
            }
            if (w.L()) {
                w.T();
            }
        }
    }

    public /* synthetic */ HorizontalStackScopeImpl(FlexDistribution flexDistribution, float f, q qVar, SizeConstraint sizeConstraint, k kVar) {
        this(flexDistribution, f, qVar, sizeConstraint);
    }

    public static final /* synthetic */ FlexDistribution access$getDistribution$p(HorizontalStackScopeImpl horizontalStackScopeImpl) {
        return horizontalStackScopeImpl.distribution;
    }

    public static final /* synthetic */ q access$getFillSpaceSpacer$p(HorizontalStackScopeImpl horizontalStackScopeImpl) {
        return horizontalStackScopeImpl.fillSpaceSpacer;
    }

    public static final /* synthetic */ float access$getSpacing$p(HorizontalStackScopeImpl horizontalStackScopeImpl) {
        return horizontalStackScopeImpl.spacing;
    }

    public final q getRowContent() {
        return this.rowContent;
    }

    public final boolean getShouldApplyFillSpacers() {
        return (t.c(this.width, SizeConstraint.Fit.INSTANCE) || this.hasAnyItemsWithFillWidth) ? false : true;
    }

    public void items(List items, s itemContent) {
        t.g(items, "items");
        t.g(itemContent, "itemContent");
        boolean z = false;
        if (items == null || !items.isEmpty()) {
            Iterator it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (t.c(((ComponentStyle) it.next()).getSize().getWidth(), SizeConstraint.Fill.INSTANCE)) {
                    z = true;
                    break;
                }
            }
        }
        this.hasAnyItemsWithFillWidth = z;
        this.rowContent = i.b(1239185597, true, new 2(items, itemContent, this));
    }

    public final void setRowContent(q qVar) {
        t.g(qVar, "<set-?>");
        this.rowContent = qVar;
    }

    private HorizontalStackScopeImpl(FlexDistribution distribution, float f, q fillSpaceSpacer, SizeConstraint width) {
        t.g(distribution, "distribution");
        t.g(fillSpaceSpacer, "fillSpaceSpacer");
        t.g(width, "width");
        this.distribution = distribution;
        this.spacing = f;
        this.fillSpaceSpacer = fillSpaceSpacer;
        this.width = width;
        this.rowContent = ComposableSingletons$HorizontalStackKt.INSTANCE.getLambda-1$revenuecatui_defaultsBc8Release();
    }
}
