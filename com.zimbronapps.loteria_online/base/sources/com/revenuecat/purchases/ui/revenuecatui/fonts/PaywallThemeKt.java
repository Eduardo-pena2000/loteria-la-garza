package com.revenuecat.purchases.ui.revenuecatui.fonts;

import Ca.I;
import Qa.p;
import X.E;
import X.F;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.extensions.TypographyExtensionsKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallThemeKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p $content;
        final /* synthetic */ FontProvider $fontProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(FontProvider fontProvider, p pVar, int i) {
            super(2);
            this.$fontProvider = fontProvider;
            this.$content = pVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PaywallThemeKt.PaywallTheme(this.$fontProvider, this.$content, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final void PaywallTheme(FontProvider fontProvider, p content, m mVar, int i) {
        int i2;
        t.g(content, "content");
        m i3 = mVar.i(1433874321);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? i3.U(fontProvider) : i3.E(fontProvider) ? 4 : 2) | i;
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
                w.U(1433874321, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallTheme (PaywallTheme.kt:10)");
            }
            if (fontProvider == null) {
                i3.V(1090937919);
                content.invoke(i3, Integer.valueOf((i2 >> 3) & 14));
                i3.P();
            } else {
                i3.V(1090975739);
                E e = E.a;
                int i4 = E.b;
                F.a(e.a(i3, i4), e.b(i3, i4), TypographyExtensionsKt.copyWithFontProvider(e.c(i3, i4), fontProvider), content, i3, (i2 << 6) & 7168, 0);
                i3.P();
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 1(fontProvider, content, i));
        }
    }
}
