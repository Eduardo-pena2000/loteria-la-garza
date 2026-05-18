package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import F.h;
import P0.p0;
import Qa.p;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallModeKt;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallBackgroundKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration $templateConfiguration;
        final /* synthetic */ h $this_PaywallBackground;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(h hVar, TemplateConfiguration templateConfiguration, int i) {
            super(2);
            this.$this_PaywallBackground = hVar;
            this.$templateConfiguration = templateConfiguration;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PaywallBackgroundKt.PaywallBackground(this.$this_PaywallBackground, this.$templateConfiguration, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final void PaywallBackground(h hVar, TemplateConfiguration templateConfiguration, m mVar, int i) {
        int i2;
        t.g(hVar, "<this>");
        t.g(templateConfiguration, "templateConfiguration");
        m i3 = mVar.i(-1106841354);
        if ((i & 6) == 0) {
            i2 = (i3.U(hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(templateConfiguration) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-1106841354, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallBackground (PaywallBackground.kt:23)");
            }
            boolean z = false;
            boolean z2 = Build.VERSION.SDK_INT >= 31;
            boolean blurredBackgroundImage = templateConfiguration.getConfiguration().getBlurredBackgroundImage();
            float f = blurredBackgroundImage ? 0.7f : 1.0f;
            i3.V(1963318254);
            a aVar = (!blurredBackgroundImage || z2) ? null : new a((Context) i3.x(AndroidCompositionLocals_androidKt.g()), toFloatPx-8Feqmps(BackgroundUIConstants.INSTANCE.getBlurSize-D9Ej5fM(), i3, 6));
            i3.P();
            e c = hVar.c(e.a);
            if (blurredBackgroundImage && z2) {
                z = true;
            }
            e conditional = ModifierExtensionsKt.conditional(c, z, PaywallBackgroundKt$PaywallBackground$modifier$1.INSTANCE);
            if (t.c(templateConfiguration.getConfiguration().getImages().getBackground(), PaywallDataExtensionsKt.getDefaultBackgroundPlaceholder(PaywallData.Companion))) {
                i3.V(733877144);
                RemoteImageKt.LocalImage(R.drawable.default_background, conditional, BackgroundUIConstants.INSTANCE.getContentScale(), null, aVar, f, null, i3, 384, 72);
                i3.P();
            } else if (templateConfiguration.getImages().getBackgroundUri() != null) {
                i3.V(734225770);
                if (blurredBackgroundImage || PaywallModeKt.isFullScreen(templateConfiguration.getMode())) {
                    String uri = templateConfiguration.getImages().getBackgroundUri().toString();
                    t.f(uri, "templateConfiguration.im….backgroundUri.toString()");
                    RemoteImageKt.RemoteImage(uri, conditional, null, BackgroundUIConstants.INSTANCE.getContentScale(), null, aVar, f, null, i3, 3072, 148);
                }
                i3.P();
            } else {
                i3.V(734695699);
                i3.P();
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 1(hVar, templateConfiguration, i));
        }
    }

    private static final float toFloatPx-8Feqmps(float f, m mVar, int i) {
        mVar.V(452796480);
        if (w.L()) {
            w.U(452796480, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.toFloatPx (PaywallBackground.kt:73)");
        }
        float density = f * ((d) mVar.x(p0.e())).getDensity();
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return density;
    }
}
