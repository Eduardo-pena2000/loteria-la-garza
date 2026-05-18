package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.I;
import M0.A;
import M0.B;
import M0.C;
import O0.g;
import Qa.a;
import Qa.l;
import Qa.p;
import Qa.q;
import androidx.compose.animation.g;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import b0.B1;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.b0;
import b0.g1;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.paywalls.components.PaywallAnimation;
import com.revenuecat.purchases.paywalls.components.PaywallTransition;
import j0.i;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.b;
import n1.n;
import n1.o;
import n1.r;
import o0.e;
import y.e;
import y.f;
import z.D;
import z.F;
import z.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TransitionViewKt {

    public static final class 2 extends u implements q {
        final /* synthetic */ p $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(p pVar) {
            super(3);
            this.$content = pVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((f) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(f AnimatedVisibility, m mVar, int i) {
            t.g(AnimatedVisibility, "$this$AnimatedVisibility");
            if (w.L()) {
                w.U(1879822145, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.AnimatedVisibility.<anonymous> (TransitionView.kt:66)");
            }
            this.$content.invoke(mVar, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p $content;
        final /* synthetic */ PaywallTransition $this_AnimatedVisibility;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(PaywallTransition paywallTransition, p pVar, int i) {
            super(2);
            this.$this_AnimatedVisibility = paywallTransition;
            this.$content = pVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TransitionViewKt.access$AnimatedVisibility(this.$this_AnimatedVisibility, this.$content, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ p $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(p pVar) {
            super(2);
            this.$content = pVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(797485256, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.TransitionView.<anonymous> (TransitionView.kt:42)");
            }
            this.$content.invoke(mVar, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p $content;
        final /* synthetic */ PaywallTransition $transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(PaywallTransition paywallTransition, p pVar, int i) {
            super(2);
            this.$transition = paywallTransition;
            this.$content = pVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TransitionViewKt.TransitionView(this.$transition, this.$content, mVar, g1.a(this.$$changed | 1));
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaywallTransition.TransitionType.values().length];
            try {
                iArr[PaywallTransition.TransitionType.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaywallTransition.TransitionType.FADE_AND_SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaywallTransition.TransitionType.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaywallTransition.TransitionType.SLIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaywallAnimation.AnimationType.values().length];
            try {
                iArr2[PaywallAnimation.AnimationType.EASE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PaywallAnimation.AnimationType.EASE_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PaywallAnimation.AnimationType.EASE_IN_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PaywallAnimation.AnimationType.LINEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n.c(invoke-mHKZG7I(((r) obj).j()));
        }

        public final long invoke-mHKZG7I(long j) {
            return o.a(-180, 0);
        }
    }

    public static final class 1 extends u implements q {
        public static final 1 INSTANCE = new 1();

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

        public 1() {
            super(3);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke-3p2s80s((androidx.compose.ui.layout.l) obj, (A) obj2, ((b) obj3).r());
        }

        public final C invoke-3p2s80s(androidx.compose.ui.layout.l layout, A measurable, long j) {
            t.g(layout, "$this$layout");
            t.g(measurable, "measurable");
            androidx.compose.ui.layout.q C0 = measurable.C0(j);
            return androidx.compose.ui.layout.l.O0(layout, C0.W0(), C0.P0(), (Map) null, 1.INSTANCE, 4, (Object) null);
        }
    }

    private static final void AnimatedVisibility(PaywallTransition paywallTransition, p pVar, m mVar, int i) {
        int i2;
        m i3 = mVar.i(391884057);
        if ((i & 6) == 0) {
            i2 = (i3.E(paywallTransition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(pVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(391884057, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.AnimatedVisibility (TransitionView.kt:57)");
            }
            i3.V(1463461260);
            boolean U = i3.U(paywallTransition);
            Object C = i3.C();
            if (U || C == m.a.a()) {
                C = U1.i(Boolean.FALSE, (T1) null, 2, (Object) null);
                i3.t(C);
            }
            C0 c0 = (C0) C;
            i3.P();
            i3.V(1463463365);
            boolean U2 = i3.U(c0);
            Object C2 = i3.C();
            if (U2 || C2 == m.a.a()) {
                C2 = new TransitionViewKt$AnimatedVisibility$1$1(c0, null);
                i3.t(C2);
            }
            i3.P();
            b0.d(paywallTransition, (p) C2, i3, i2 & 14);
            e.e(AnimatedVisibility$lambda$3(c0), (androidx.compose.ui.e) null, enterTransition(paywallTransition), (g) null, (String) null, i.d(1879822145, true, new 2(pVar), i3, 54), i3, 196608, 26);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 3(paywallTransition, pVar, i));
        }
    }

    private static final boolean AnimatedVisibility$lambda$3(C0 c0) {
        return ((Boolean) c0.getValue()).booleanValue();
    }

    private static final void AnimatedVisibility$lambda$4(C0 c0, boolean z) {
        c0.setValue(Boolean.valueOf(z));
    }

    public static final void TransitionView(PaywallTransition paywallTransition, p content, m mVar, int i) {
        int i2;
        t.g(content, "content");
        m i3 = mVar.i(1753108978);
        if ((i & 6) == 0) {
            i2 = (i3.E(paywallTransition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(content) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(1753108978, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.TransitionView (TransitionView.kt:29)");
            }
            if (paywallTransition == null) {
                i3.V(1473784896);
                content.invoke(i3, Integer.valueOf((i2 >> 3) & 14));
                i3.P();
            } else {
                i3.V(1473826622);
                if (paywallTransition.getDisplacementStrategy() == PaywallTransition.DisplacementStrategy.GREEDY) {
                    i3.V(1473916429);
                    e.a aVar = androidx.compose.ui.e.a;
                    e.a aVar2 = o0.e.a;
                    B h = F.f.h(aVar2.o(), false);
                    int a = h.a(i3, 0);
                    b0.I r = i3.r();
                    androidx.compose.ui.e f = c.f(i3, aVar);
                    g.a aVar3 = O0.g.E8;
                    a a2 = aVar3.a();
                    if (i3.k() == null) {
                        h.d();
                    }
                    i3.I();
                    if (i3.f()) {
                        i3.p(a2);
                    } else {
                        i3.s();
                    }
                    m b = m2.b(i3);
                    m2.e(b, h, aVar3.e());
                    m2.e(b, r, aVar3.g());
                    p b2 = aVar3.b();
                    if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                        b.t(Integer.valueOf(a));
                        b.J(Integer.valueOf(a), b2);
                    }
                    m2.e(b, f, aVar3.f());
                    androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
                    androidx.compose.ui.e hidden = hidden(aVar);
                    B h2 = F.f.h(aVar2.o(), false);
                    int a3 = h.a(i3, 0);
                    b0.I r2 = i3.r();
                    androidx.compose.ui.e f2 = c.f(i3, hidden);
                    a a4 = aVar3.a();
                    if (i3.k() == null) {
                        h.d();
                    }
                    i3.I();
                    if (i3.f()) {
                        i3.p(a4);
                    } else {
                        i3.s();
                    }
                    m b3 = m2.b(i3);
                    m2.e(b3, h2, aVar3.e());
                    m2.e(b3, r2, aVar3.g());
                    p b4 = aVar3.b();
                    if (b3.f() || !t.c(b3.C(), Integer.valueOf(a3))) {
                        b3.t(Integer.valueOf(a3));
                        b3.J(Integer.valueOf(a3), b4);
                    }
                    m2.e(b3, f2, aVar3.f());
                    content.invoke(i3, Integer.valueOf((i2 >> 3) & 14));
                    i3.v();
                    AnimatedVisibility(paywallTransition, i.d(1120237739, true, new TransitionViewKt$TransitionView$1$2(content), i3, 54), i3, (i2 & 14) | 48);
                    i3.v();
                    i3.P();
                } else {
                    i3.V(1474120502);
                    AnimatedVisibility(paywallTransition, i.d(797485256, true, new 2(content), i3, 54), i3, (i2 & 14) | 48);
                    i3.P();
                }
                i3.P();
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 3(paywallTransition, content, i));
        }
    }

    public static final /* synthetic */ void access$AnimatedVisibility(PaywallTransition paywallTransition, p pVar, m mVar, int i) {
        AnimatedVisibility(paywallTransition, pVar, mVar, i);
    }

    public static final /* synthetic */ void access$AnimatedVisibility$lambda$4(C0 c0, boolean z) {
        AnimatedVisibility$lambda$4(c0, z);
    }

    private static final D easing(PaywallAnimation paywallAnimation) {
        D easing;
        return (paywallAnimation == null || (easing = getEasing(paywallAnimation)) == null) ? F.f() : easing;
    }

    private static final androidx.compose.animation.f enterTransition(PaywallTransition paywallTransition) {
        int msDuration;
        int i = WhenMappings.$EnumSwitchMapping$0[paywallTransition.getType().ordinal()];
        if (i == 1) {
            PaywallAnimation animation = paywallTransition.getAnimation();
            msDuration = animation != null ? animation.getMsDuration() : 300;
            PaywallAnimation animation2 = paywallTransition.getAnimation();
            return androidx.compose.animation.e.m(j.i(msDuration, animation2 != null ? animation2.getMsDelay() : 0, easing(paywallTransition.getAnimation())), 0.0f, 2, (Object) null);
        }
        if (i == 2) {
            PaywallAnimation animation3 = paywallTransition.getAnimation();
            int msDuration2 = animation3 != null ? animation3.getMsDuration() : 300;
            PaywallAnimation animation4 = paywallTransition.getAnimation();
            androidx.compose.animation.f m = androidx.compose.animation.e.m(j.i(msDuration2, animation4 != null ? animation4.getMsDelay() : 0, easing(paywallTransition.getAnimation())), 0.0f, 2, (Object) null);
            PaywallAnimation animation5 = paywallTransition.getAnimation();
            msDuration = animation5 != null ? animation5.getMsDuration() : 300;
            PaywallAnimation animation6 = paywallTransition.getAnimation();
            return m.c(androidx.compose.animation.e.q(j.i(msDuration, animation6 != null ? animation6.getMsDelay() : 0, easing(paywallTransition.getAnimation())), 0.0f, 0L, 6, (Object) null));
        }
        if (i == 3) {
            PaywallAnimation animation7 = paywallTransition.getAnimation();
            msDuration = animation7 != null ? animation7.getMsDuration() : 300;
            PaywallAnimation animation8 = paywallTransition.getAnimation();
            return androidx.compose.animation.e.q(j.i(msDuration, animation8 != null ? animation8.getMsDelay() : 0, easing(paywallTransition.getAnimation())), 0.0f, 0L, 6, (Object) null);
        }
        if (i != 4) {
            throw new Ca.o();
        }
        PaywallAnimation animation9 = paywallTransition.getAnimation();
        msDuration = animation9 != null ? animation9.getMsDuration() : 300;
        PaywallAnimation animation10 = paywallTransition.getAnimation();
        return androidx.compose.animation.e.v(j.i(msDuration, animation10 != null ? animation10.getMsDelay() : 0, easing(paywallTransition.getAnimation())), 1.INSTANCE);
    }

    private static final D getEasing(PaywallAnimation paywallAnimation) {
        int i = WhenMappings.$EnumSwitchMapping$1[paywallAnimation.getType().ordinal()];
        if (i == 1) {
            return F.d();
        }
        if (i == 2) {
            return F.c();
        }
        if (i == 3) {
            return F.f();
        }
        if (i == 4) {
            return F.e();
        }
        throw new Ca.o();
    }

    private static final androidx.compose.ui.e hidden(androidx.compose.ui.e eVar) {
        return androidx.compose.ui.layout.i.a(eVar, 1.INSTANCE);
    }
}
