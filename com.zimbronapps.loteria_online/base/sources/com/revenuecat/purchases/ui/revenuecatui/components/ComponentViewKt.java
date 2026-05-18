package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.I;
import Ca.o;
import Qa.p;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent.IconComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.pkg.PackageComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.stickyfooter.StickyFooterComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CountdownComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.PackageComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StickyFooterComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlToggleComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabsComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.VideoComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlButtonViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlToggleViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class ComponentViewKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ p $onClick;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ ComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ComponentStyle componentStyle, PaywallState.Loaded.Components components, p pVar, e eVar, int i, int i2) {
            super(2);
            this.$style = componentStyle;
            this.$state = components;
            this.$onClick = pVar;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ComponentViewKt.ComponentView(this.$style, this.$state, this.$onClick, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final /* synthetic */ void ComponentView(ComponentStyle style, PaywallState.Loaded.Components state, p onClick, e eVar, m mVar, int i, int i2) {
        int i3;
        t.g(style, "style");
        t.g(state, "state");
        t.g(onClick, "onClick");
        m i4 = mVar.i(-294729441);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (i4.U(style) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= i4.U(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= i4.E(onClick) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= i4.U(eVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && i4.j()) {
            i4.M();
        } else {
            if (i5 != 0) {
                eVar = e.a;
            }
            if (w.L()) {
                w.U(-294729441, i3, -1, "com.revenuecat.purchases.ui.revenuecatui.components.ComponentView (ComponentView.kt:49)");
            }
            if (style instanceof StackComponentStyle) {
                i4.V(754737591);
                StackComponentViewKt.StackComponentView((StackComponentStyle) style, state, onClick, eVar, 0.0f, i4, i3 & 8176, 16);
                i4.P();
            } else if (style instanceof TextComponentStyle) {
                i4.V(754742742);
                TextComponentViewKt.TextComponentView((TextComponentStyle) style, state, eVar, i4, (i3 & 112) | ((i3 >> 3) & 896), 0);
                i4.P();
            } else if (style instanceof ImageComponentStyle) {
                i4.V(754746872);
                ImageComponentViewKt.ImageComponentView((ImageComponentStyle) style, state, eVar, i4, (i3 & 112) | ((i3 >> 3) & 896), 0);
                i4.P();
            } else if (style instanceof VideoComponentStyle) {
                i4.V(1922417707);
                VideoComponentViewKt.VideoComponentView((VideoComponentStyle) style, state, eVar, null, i4, (i3 & 112) | ((i3 >> 3) & 896), 8);
                i4.P();
            } else if (style instanceof ButtonComponentStyle) {
                i4.V(754755340);
                ButtonComponentViewKt.ButtonComponentView((ButtonComponentStyle) style, state, onClick, eVar, i4, i3 & 8176, 0);
                i4.P();
            } else if (style instanceof StickyFooterComponentStyle) {
                i4.V(754759454);
                StickyFooterComponentViewKt.StickyFooterComponentView((StickyFooterComponentStyle) style, state, onClick, eVar, i4, i3 & 8176, 0);
                i4.P();
            } else if (style instanceof PackageComponentStyle) {
                i4.V(754764953);
                PackageComponentViewKt.PackageComponentView((PackageComponentStyle) style, state, onClick, eVar, i4, i3 & 8176, 0);
                i4.P();
            } else if (style instanceof IconComponentStyle) {
                i4.V(754770135);
                IconComponentViewKt.IconComponentView((IconComponentStyle) style, state, eVar, i4, (i3 & 112) | ((i3 >> 3) & 896), 0);
                i4.P();
            } else if (style instanceof TimelineComponentStyle) {
                i4.V(754773403);
                TimelineComponentViewKt.TimelineComponentView((TimelineComponentStyle) style, state, eVar, i4, (i3 & 112) | ((i3 >> 3) & 896), 0);
                i4.P();
            } else if (style instanceof CarouselComponentStyle) {
                i4.V(754776858);
                CarouselComponentViewKt.CarouselComponentView((CarouselComponentStyle) style, state, onClick, eVar, i4, i3 & 8176, 0);
                i4.P();
            } else if (style instanceof TabsComponentStyle) {
                i4.V(754782134);
                TabsComponentViewKt.TabsComponentView((TabsComponentStyle) style, state, onClick, eVar, i4, i3 & 8176, 0);
                i4.P();
            } else if (style instanceof TabControlStyle.Buttons) {
                i4.V(754790045);
                StackComponentViewKt.StackComponentView(((TabControlStyle.Buttons) style).getStack(), state, onClick, eVar, 0.0f, i4, i3 & 8176, 16);
                i4.P();
            } else if (style instanceof TabControlStyle.Toggle) {
                i4.V(754798109);
                StackComponentViewKt.StackComponentView(((TabControlStyle.Toggle) style).getStack(), state, onClick, eVar, 0.0f, i4, i3 & 8176, 16);
                i4.P();
            } else if (style instanceof TabControlButtonComponentStyle) {
                i4.V(754803833);
                TabControlButtonViewKt.TabControlButtonView((TabControlButtonComponentStyle) style, state, eVar, i4, (i3 & 112) | ((i3 >> 3) & 896), 0);
                i4.P();
            } else if (style instanceof TabControlToggleComponentStyle) {
                i4.V(754808441);
                TabControlToggleViewKt.TabControlToggleView((TabControlToggleComponentStyle) style, state, eVar, i4, (i3 & 112) | ((i3 >> 3) & 896), 0);
                i4.P();
            } else {
                if (!(style instanceof CountdownComponentStyle)) {
                    i4.V(754634387);
                    i4.P();
                    throw new o();
                }
                i4.V(754812854);
                CountdownComponentViewKt.CountdownComponentView((CountdownComponentStyle) style, state, onClick, eVar, i4, i3 & 8176, 0);
                i4.P();
            }
            if (w.L()) {
                w.T();
            }
        }
        e eVar2 = eVar;
        B1 l = i4.l();
        if (l != null) {
            l.a(new 1(style, state, onClick, eVar2, i, i2));
        }
    }
}
