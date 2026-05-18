package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import Da.v;
import F.Y;
import F.n;
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
final class VerticalStackScopeImpl implements VerticalStackScope {
    private q columnContent;
    private final FlexDistribution distribution;
    private final q fillSpaceSpacer;
    private boolean hasAnyItemsWithFillHeight;
    private final SizeConstraint height;
    private final float spacing;

    public static final class 2 extends u implements q {
        final /* synthetic */ s $itemContent;
        final /* synthetic */ List $items;
        final /* synthetic */ VerticalStackScopeImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(List list, s sVar, VerticalStackScopeImpl verticalStackScopeImpl) {
            super(3);
            this.$items = list;
            this.$itemContent = sVar;
            this.this$0 = verticalStackScopeImpl;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((n) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(n nVar, m mVar, int i) {
            t.g(nVar, "$this$null");
            int i2 = (i & 6) == 0 ? i | (mVar.U(nVar) ? 4 : 2) : i;
            if ((i2 & 19) == 18 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(552023703, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.VerticalStackScopeImpl.items.<anonymous> (VerticalStack.kt:96)");
            }
            List list = this.$items;
            s sVar = this.$itemContent;
            VerticalStackScopeImpl verticalStackScopeImpl = this.this$0;
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    v.x();
                }
                ComponentStyle componentStyle = (ComponentStyle) obj;
                boolean z = i3 == list.size() - 1;
                sVar.invoke(nVar, Integer.valueOf(i3), componentStyle, mVar, Integer.valueOf(i2 & 14));
                mVar.V(-1867284347);
                if (StackComponentViewKt.getUsesAllAvailableSpace(VerticalStackScopeImpl.access$getDistribution$p(verticalStackScopeImpl)) && !z) {
                    Y.a(g.k(e.a, VerticalStackScopeImpl.access$getSpacing$p(verticalStackScopeImpl), 0.0f, 2, (Object) null), mVar, 0);
                    if (verticalStackScopeImpl.getShouldApplyFillSpacers()) {
                        VerticalStackScopeImpl.access$getFillSpaceSpacer$p(verticalStackScopeImpl).invoke(Float.valueOf(VerticalStackScopeImpl.access$getDistribution$p(verticalStackScopeImpl) == FlexDistribution.SPACE_AROUND ? 2.0f : 1.0f), mVar, 0);
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

    public /* synthetic */ VerticalStackScopeImpl(FlexDistribution flexDistribution, float f, q qVar, SizeConstraint sizeConstraint, k kVar) {
        this(flexDistribution, f, qVar, sizeConstraint);
    }

    public static final /* synthetic */ FlexDistribution access$getDistribution$p(VerticalStackScopeImpl verticalStackScopeImpl) {
        return verticalStackScopeImpl.distribution;
    }

    public static final /* synthetic */ q access$getFillSpaceSpacer$p(VerticalStackScopeImpl verticalStackScopeImpl) {
        return verticalStackScopeImpl.fillSpaceSpacer;
    }

    public static final /* synthetic */ float access$getSpacing$p(VerticalStackScopeImpl verticalStackScopeImpl) {
        return verticalStackScopeImpl.spacing;
    }

    public final q getColumnContent() {
        return this.columnContent;
    }

    public final boolean getShouldApplyFillSpacers() {
        return (t.c(this.height, SizeConstraint.Fit.INSTANCE) || this.hasAnyItemsWithFillHeight) ? false : true;
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
                } else if (t.c(((ComponentStyle) it.next()).getSize().getHeight(), SizeConstraint.Fill.INSTANCE)) {
                    z = true;
                    break;
                }
            }
        }
        this.hasAnyItemsWithFillHeight = z;
        this.columnContent = i.b(552023703, true, new 2(items, itemContent, this));
    }

    public final void setColumnContent(q qVar) {
        t.g(qVar, "<set-?>");
        this.columnContent = qVar;
    }

    private VerticalStackScopeImpl(FlexDistribution distribution, float f, q fillSpaceSpacer, SizeConstraint height) {
        t.g(distribution, "distribution");
        t.g(fillSpaceSpacer, "fillSpaceSpacer");
        t.g(height, "height");
        this.distribution = distribution;
        this.spacing = f;
        this.fillSpaceSpacer = fillSpaceSpacer;
        this.height = height;
        this.columnContent = ComposableSingletons$VerticalStackKt.INSTANCE.getLambda-1$revenuecatui_defaultsBc8Release();
    }
}
