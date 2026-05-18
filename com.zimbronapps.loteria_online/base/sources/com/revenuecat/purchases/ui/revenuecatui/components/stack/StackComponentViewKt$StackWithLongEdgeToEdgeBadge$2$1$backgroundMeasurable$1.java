package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import Ca.o;
import M.c;
import M.h;
import P0.p0;
import Qa.p;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import kotlin.jvm.internal.u;
import n1.d;
import v0.E1;
import v0.t1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1 extends u implements p {
    final /* synthetic */ StackComponentStyle $badgeStack;
    final /* synthetic */ q $stackPlaceable;
    final /* synthetic */ StackComponentState $stackState;
    final /* synthetic */ boolean $topBadge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1(StackComponentStyle stackComponentStyle, StackComponentState stackComponentState, boolean z, q qVar) {
        super(2);
        this.$badgeStack = stackComponentStyle;
        this.$stackState = stackComponentState;
        this.$topBadge = z;
        this.$stackPlaceable = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        E1 hVar;
        E1 a;
        E1 e1;
        if ((i & 3) == 2 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(-1688443959, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackWithLongEdgeToEdgeBadge.<anonymous>.<anonymous>.<anonymous> (StackComponentView.kt:249)");
        }
        BackgroundStyles background = this.$badgeStack.getBackground();
        mVar.V(-712013242);
        BackgroundStyle rememberBackgroundStyle = background == null ? null : BackgroundStyleKt.rememberBackgroundStyle(background, mVar, 0);
        mVar.P();
        BorderStyles border = this.$badgeStack.getBorder();
        mVar.V(-712010114);
        BorderStyle rememberBorderStyle = border == null ? null : BorderStyleKt.rememberBorderStyle(border, mVar, 0);
        mVar.P();
        ShadowStyles shadow = this.$badgeStack.getShadow();
        mVar.V(-712007234);
        ShadowStyle rememberShadowStyle = shadow == null ? null : ShadowStyleKt.rememberShadowStyle(shadow, mVar, 0);
        mVar.P();
        CornerRadiuses.Dp cornerRadiuses = this.$badgeStack.getShape().getCornerRadiuses();
        if (cornerRadiuses instanceof CornerRadiuses.Percentage) {
            mVar.V(-597179452);
            h shape = ShapeKt.toShape(this.$badgeStack.getShape());
            h hVar2 = shape instanceof h ? shape : null;
            if (hVar2 == null) {
                e1 = null;
            } else {
                q qVar = this.$stackPlaceable;
                e1 = new h(StackComponentViewKt.access$makeAbsolute(hVar2.g(), qVar, (d) mVar.x(p0.e())), StackComponentViewKt.access$makeAbsolute(hVar2.f(), qVar, (d) mVar.x(p0.e())), StackComponentViewKt.access$makeAbsolute(hVar2.d(), qVar, (d) mVar.x(p0.e())), StackComponentViewKt.access$makeAbsolute(hVar2.e(), qVar, (d) mVar.x(p0.e())));
            }
            if (e1 == null) {
                e1 = t1.a();
            }
            mVar.P();
        } else {
            if (!(cornerRadiuses instanceof CornerRadiuses.Dp)) {
                mVar.V(-712373002);
                mVar.P();
                throw new o();
            }
            mVar.V(-596387247);
            CornerRadiuses.Dp cornerRadiuses2 = this.$stackState.getShape().getCornerRadiuses();
            if (cornerRadiuses2 instanceof CornerRadiuses.Dp) {
                if (this.$topBadge) {
                    CornerRadiuses.Dp dp = cornerRadiuses;
                    CornerRadiuses.Dp dp2 = cornerRadiuses2;
                    a = ShapeKt.toShape((Shape) new Shape.Rectangle(new CornerRadiuses.Dp(dp.getTopLeading(), dp.getTopTrailing(), dp2.getBottomLeading(), dp2.getBottomTrailing())));
                } else {
                    CornerRadiuses.Dp dp3 = cornerRadiuses2;
                    CornerRadiuses.Dp dp4 = cornerRadiuses;
                    a = ShapeKt.toShape((Shape) new Shape.Rectangle(new CornerRadiuses.Dp(dp3.getTopLeading(), dp3.getTopTrailing(), dp4.getBottomLeading(), dp4.getBottomTrailing())));
                }
            } else {
                if (!(cornerRadiuses2 instanceof CornerRadiuses.Percentage)) {
                    throw new o();
                }
                h shape2 = ShapeKt.toShape(this.$stackState.getShape());
                h hVar3 = shape2 instanceof h ? shape2 : null;
                if (hVar3 == null) {
                    hVar = null;
                } else {
                    boolean z = this.$topBadge;
                    q qVar2 = this.$stackPlaceable;
                    if (z) {
                        mVar.V(-15533247);
                        CornerRadiuses.Dp dp5 = cornerRadiuses;
                        hVar = new h(c.c(n1.h.g((float) dp5.getTopLeading())), c.c(n1.h.g((float) dp5.getTopTrailing())), StackComponentViewKt.access$makeAbsolute(hVar3.d(), qVar2, (d) mVar.x(p0.e())), StackComponentViewKt.access$makeAbsolute(hVar3.e(), qVar2, (d) mVar.x(p0.e())));
                        mVar.P();
                    } else {
                        mVar.V(-14694108);
                        CornerRadiuses.Dp dp6 = cornerRadiuses;
                        hVar = new h(StackComponentViewKt.access$makeAbsolute(hVar3.g(), qVar2, (d) mVar.x(p0.e())), StackComponentViewKt.access$makeAbsolute(hVar3.f(), qVar2, (d) mVar.x(p0.e())), c.c(n1.h.g((float) dp6.getBottomTrailing())), c.c(n1.h.g((float) dp6.getBottomLeading())));
                        mVar.P();
                    }
                }
                if (hVar != null) {
                    e1 = hVar;
                    mVar.P();
                } else {
                    a = t1.a();
                }
            }
            e1 = a;
            mVar.P();
        }
        mVar.V(-711875803);
        boolean U = mVar.U(this.$badgeStack) | mVar.U(rememberBackgroundStyle) | mVar.U(rememberBorderStyle) | mVar.U(rememberShadowStyle);
        StackComponentStyle stackComponentStyle = this.$badgeStack;
        Object C = mVar.C();
        if (U || C == m.a.a()) {
            C = ModifierExtensionsKt.applyIfNotNull(ModifierExtensionsKt.applyIfNotNull(ModifierExtensionsKt.applyIfNotNull(f.h(e.a, stackComponentStyle.getMargin()), rememberBackgroundStyle, new StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1$backgroundModifier$1$1(e1)), e1, StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1$backgroundModifier$1$2.INSTANCE), rememberBorderStyle, new StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1$backgroundModifier$1$3(stackComponentStyle));
            mVar.t(C);
        }
        mVar.P();
        F.f.a(g.f(e.a, 0.0f, 1, (Object) null).then((e) C), mVar, 0);
        if (w.L()) {
            w.T();
        }
    }
}
