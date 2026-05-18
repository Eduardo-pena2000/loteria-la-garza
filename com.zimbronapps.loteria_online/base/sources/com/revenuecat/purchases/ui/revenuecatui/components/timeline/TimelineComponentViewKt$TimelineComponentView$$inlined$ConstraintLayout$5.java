package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Ca.I;
import Ca.q;
import Da.D;
import F.L;
import F.Y;
import F.f;
import M0.B;
import O0.g;
import Qa.a;
import Qa.p;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.C0;
import b0.U1;
import b0.b0;
import b0.h2;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent.IconComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.OverlayKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.SizeConstraintExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.h;
import o0.e;
import t1.i;
import t1.l;
import t1.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5 extends u implements p {
    final /* synthetic */ C0 $contentTracker;
    final /* synthetic */ a $onHelpersChanged;
    final /* synthetic */ l $scope;
    final /* synthetic */ PaywallState.Loaded.Components $state$inlined;
    final /* synthetic */ TimelineComponentState $timelineState$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5(C0 c0, l lVar, a aVar, TimelineComponentState timelineComponentState, PaywallState.Loaded.Components components) {
        super(2);
        this.$contentTracker = c0;
        this.$scope = lVar;
        this.$onHelpersChanged = aVar;
        this.$timelineState$inlined = timelineComponentState;
        this.$state$inlined = components;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        float g;
        Iterator it;
        L a;
        int i2;
        List list;
        IconComponentStyle icon;
        Size size;
        SizeConstraint height;
        h dpOrNull;
        char c = 0;
        int i3 = 1;
        int i4 = 3;
        int i5 = 2;
        if ((i & 3) == 2 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(1200550679, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:454)");
        }
        this.$contentTracker.setValue(I.a);
        int h = this.$scope.h();
        this.$scope.i();
        l lVar = this.$scope;
        mVar.V(-425492318);
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        mVar.V(-290820944);
        Object C = mVar.C();
        if (C == m.a.a()) {
            C = U1.c(new TimelineComponentViewKt$TimelineComponentView$2$biggestIconWidth$2$1(this.$timelineState$inlined));
            mVar.t(C);
        }
        h2 h2Var = (h2) C;
        mVar.P();
        mVar.V(-290812056);
        for (TimelineComponentState.ItemState itemState : this.$timelineState$inlined.getItems()) {
            l.b m = lVar.m();
            x a2 = m.a();
            x b = m.b();
            x c2 = m.c();
            x d = m.d();
            x[] xVarArr = new x[i4];
            xVarArr[c] = a2;
            xVarArr[i3] = b;
            xVarArr[i5] = c2;
            i.b d2 = i.d(lVar, xVarArr, 0.0f, i5, (Object) null);
            x[] xVarArr2 = new x[i3];
            xVarArr2[c] = a2;
            i.c e = lVar.e(xVarArr2, h.g(this.$timelineState$inlined.getColumnGutter()));
            i.b bVar = (i.b) D.q0(arrayList);
            arrayList2.add(a2);
            int i6 = h;
            x[] xVarArr3 = new x[i3];
            xVarArr3[c] = d;
            arrayList.add(i.d(lVar, xVarArr3, 0.0f, i5, (Object) null));
            e.a aVar = e.a;
            e i7 = g.i(aVar, h.g(this.$timelineState$inlined.getItemSpacing()));
            mVar.V(-290795278);
            boolean U = mVar.U(d2);
            Object C2 = mVar.C();
            if (U || C2 == m.a.a()) {
                C2 = new TimelineComponentViewKt$TimelineComponentView$2$1$1(d2);
                mVar.t(C2);
            }
            mVar.P();
            Y.a(lVar.k(i7, d, (Qa.l) C2), mVar, 0);
            mVar.V(-290789187);
            boolean U2 = mVar.U(this.$timelineState$inlined) | mVar.U(bVar) | mVar.U(b) | mVar.U(c2);
            Object C3 = mVar.C();
            if (U2 || C3 == m.a.a()) {
                C3 = new TimelineComponentViewKt$TimelineComponentView$2$2$1(this.$timelineState$inlined, bVar, b, c2, h2Var);
                mVar.t(C3);
            }
            mVar.P();
            e k = lVar.k(aVar, a2, (Qa.l) C3);
            e.a aVar2 = o0.e.a;
            B h2 = f.h(aVar2.o(), false);
            int a3 = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = c.f(mVar, k);
            g.a aVar3 = O0.g.E8;
            a a4 = aVar3.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a4);
            } else {
                mVar.s();
            }
            m b2 = m2.b(mVar);
            m2.e(b2, h2, aVar3.e());
            m2.e(b2, r, aVar3.g());
            p b3 = aVar3.b();
            if (b2.f() || !t.c(b2.C(), Integer.valueOf(a3))) {
                b2.t(Integer.valueOf(a3));
                b2.J(Integer.valueOf(a3), b3);
            }
            m2.e(b2, f, aVar3.f());
            List list2 = arrayList;
            IconComponentViewKt.IconComponentView(itemState.getIcon(), this.$state$inlined, androidx.compose.foundation.layout.c.a.a(aVar, aVar2.m()), mVar, 0, 0);
            mVar.v();
            TextComponentStyle title = itemState.getTitle();
            PaywallState.Loaded.Components components = this.$state$inlined;
            mVar.V(-290754551);
            boolean U3 = mVar.U(this.$timelineState$inlined) | mVar.U(a2) | mVar.U(bVar) | mVar.U(e);
            Object C4 = mVar.C();
            if (U3 || C4 == m.a.a()) {
                C4 = new TimelineComponentViewKt$TimelineComponentView$2$4$1(this.$timelineState$inlined, a2, bVar, e);
                mVar.t(C4);
            }
            mVar.P();
            TextComponentViewKt.TextComponentView(title, components, lVar.k(aVar, b, (Qa.l) C4), mVar, 0, 0);
            TextComponentStyle description = itemState.getDescription();
            mVar.V(-290731404);
            if (description != null) {
                PaywallState.Loaded.Components components2 = this.$state$inlined;
                mVar.V(149597858);
                boolean U4 = mVar.U(b) | mVar.U(this.$timelineState$inlined);
                Object C5 = mVar.C();
                if (U4 || C5 == m.a.a()) {
                    C5 = new TimelineComponentViewKt$TimelineComponentView$2$5$1$1(b, this.$timelineState$inlined);
                    mVar.t(C5);
                }
                mVar.P();
                TextComponentViewKt.TextComponentView(description, components2, lVar.k(aVar, c2, (Qa.l) C5), mVar, 0, 0);
                I i8 = I.a;
            }
            mVar.P();
            arrayList = list2;
            h = i6;
            c = 0;
            i3 = 1;
            i4 = 3;
            i5 = 2;
        }
        int i9 = h;
        mVar.P();
        mVar.V(-290709150);
        Iterator it2 = this.$timelineState$inlined.getItems().iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            int i11 = i10 + 1;
            TimelineComponentState.ItemState itemState2 = (TimelineComponentState.ItemState) it2.next();
            boolean z = i10 == this.$timelineState$inlined.getItems().size() - 1;
            t1.f fVar = (t1.f) arrayList2.get(i10);
            t1.f fVar2 = (t1.f) D.i0(arrayList2, i11);
            TimelineComponentStyle.ConnectorStyle connector = itemState2.getConnector();
            mVar.V(-290701069);
            if (connector == null) {
                it = it2;
                i2 = i11;
                list = arrayList2;
            } else {
                t1.f l = lVar.l();
                Size size2 = itemState2.getIcon().getSize();
                mVar.V(149624325);
                boolean U5 = mVar.U(size2) | mVar.U(l);
                Object C6 = mVar.C();
                if (U5 || C6 == m.a.a()) {
                    SizeConstraint.Fixed height2 = itemState2.getIcon().getSize().getHeight();
                    float g2 = (height2 instanceof SizeConstraint.Fixed ? height2 : null) != null ? h.g(h.g(r10.getValue-pVg5ArA()) / 2) : h.g(0);
                    h access$TimelineComponentView$lambda$13$lambda$1 = TimelineComponentViewKt.access$TimelineComponentView$lambda$13$lambda$1(h2Var);
                    if (access$TimelineComponentView$lambda$13$lambda$1 != null) {
                        int m2 = (int) access$TimelineComponentView$lambda$13$lambda$1.m();
                        g = h.g(h.g(m2 - (itemState2.getConnector() != null ? r12.getWidth() : 0)) / 2);
                    } else {
                        g = h.g(0);
                    }
                    C6 = Ca.x.a(h.d(g), h.d(g2));
                    mVar.t(C6);
                }
                q qVar = (q) C6;
                mVar.P();
                TimelineComponentState.ItemState itemState3 = (TimelineComponentState.ItemState) D.i0(this.$timelineState$inlined.getItems(), i11);
                float g3 = h.g(((itemState3 == null || (icon = itemState3.getIcon()) == null || (size = icon.getSize()) == null || (height = size.getHeight()) == null || (dpOrNull = SizeConstraintExtensionsKt.dpOrNull(height)) == null) ? h.g(0) : dpOrNull.m()) / 2);
                e.a aVar4 = androidx.compose.ui.e.a;
                TimelineComponentStyle.ConnectorStyle connector2 = itemState2.getConnector();
                if (connector2 == null || (a = connector2.getMargin()) == null) {
                    it = it2;
                    a = androidx.compose.foundation.layout.f.a(h.g(0));
                } else {
                    it = it2;
                }
                i2 = i11;
                list = arrayList2;
                androidx.compose.ui.e a5 = o0.p.a(androidx.compose.foundation.layout.e.b(androidx.compose.foundation.layout.f.h(aVar4, a), 0.0f, ((h) qVar.d()).m(), 1, (Object) null), -1.0f);
                mVar.V(149657484);
                boolean U6 = mVar.U(qVar) | mVar.U(itemState2) | mVar.U(fVar) | mVar.a(z) | mVar.U(fVar2) | mVar.c(g3);
                Object C7 = mVar.C();
                if (U6 || C7 == m.a.a()) {
                    C7 = new TimelineComponentViewKt$TimelineComponentView$2$6$1$1(qVar, itemState2, fVar, z, fVar2, g3);
                    mVar.t(C7);
                }
                mVar.P();
                f.a(OverlayKt.overlay$default(lVar.k(a5, l, (Qa.l) C7), ColorStyleKt.getForCurrentTheme(connector.getColor(), mVar, 0), null, 2, null), mVar, 0);
                I i12 = I.a;
            }
            mVar.P();
            i10 = i2;
            it2 = it;
            arrayList2 = list;
        }
        mVar.P();
        mVar.P();
        if (this.$scope.h() != i9) {
            b0.g(this.$onHelpersChanged, mVar, 6);
        }
        if (w.L()) {
            w.T();
        }
    }
}
