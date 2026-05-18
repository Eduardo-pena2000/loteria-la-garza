package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Ca.I;
import Ga.e;
import Ia.f;
import Ia.l;
import Qa.p;
import android.content.Context;
import b0.C0;
import cb.O;
import java.util.List;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt$DefaultPaywallView$1$1", f = "DefaultPaywallView.kt", l = {100, 104}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultPaywallViewKt$DefaultPaywallView$1$1 extends l implements p {
    final /* synthetic */ C0 $appIconBitmap$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ C0 $prominentColors$delegate;
    final /* synthetic */ List $providedProminentColors;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaywallViewKt$DefaultPaywallView$1$1(List list, C0 c0, C0 c02, Context context, e eVar) {
        super(2, eVar);
        this.$providedProminentColors = list;
        this.$appIconBitmap$delegate = c0;
        this.$prominentColors$delegate = c02;
        this.$context = context;
    }

    public final e create(Object obj, e eVar) {
        return new DefaultPaywallViewKt$DefaultPaywallView$1$1(this.$providedProminentColors, this.$appIconBitmap$delegate, this.$prominentColors$delegate, this.$context, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((DefaultPaywallViewKt$DefaultPaywallView$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = Ha.c.f()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            Ca.t.b(r12)
            goto L67
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            java.lang.Object r1 = r11.L$0
            b0.C0 r1 = (b0.C0) r1
            Ca.t.b(r12)
            goto L43
        L22:
            Ca.t.b(r12)
            java.util.List r12 = r11.$providedProminentColors
            if (r12 != 0) goto L48
            b0.C0 r1 = r11.$prominentColors$delegate
            com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor r4 = com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor.INSTANCE
            b0.C0 r12 = r11.$appIconBitmap$delegate
            android.graphics.Bitmap r5 = com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt.access$DefaultPaywallView$lambda$3(r12)
            r11.L$0 = r1
            r11.label = r3
            r6 = 2
            r7 = 0
            r9 = 4
            r10 = 0
            r8 = r11
            java.lang.Object r12 = com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor.getProminentColorsFromBitmap$default(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L43
            return r0
        L43:
            java.util.List r12 = (java.util.List) r12
            com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt.access$DefaultPaywallView$lambda$7(r1, r12)
        L48:
            b0.C0 r12 = r11.$appIconBitmap$delegate
            android.graphics.Bitmap r12 = com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt.access$DefaultPaywallView$lambda$3(r12)
            if (r12 != 0) goto L6e
            cb.K r12 = cb.e0.a()
            com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt$DefaultPaywallView$1$1$bitmap$1 r1 = new com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt$DefaultPaywallView$1$1$bitmap$1
            android.content.Context r3 = r11.$context
            r4 = 0
            r1.<init>(r3, r4)
            r11.L$0 = r4
            r11.label = r2
            java.lang.Object r12 = cb.i.g(r12, r1, r11)
            if (r12 != r0) goto L67
            return r0
        L67:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            b0.C0 r0 = r11.$appIconBitmap$delegate
            com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt.access$DefaultPaywallView$lambda$4(r0, r12)
        L6e:
            Ca.I r12 = Ca.I.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt$DefaultPaywallView$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
