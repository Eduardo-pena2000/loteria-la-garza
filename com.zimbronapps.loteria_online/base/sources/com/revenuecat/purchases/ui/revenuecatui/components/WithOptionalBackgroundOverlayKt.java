package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.I;
import F.h;
import Qa.p;
import Qa.q;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WithOptionalBackgroundOverlayKt {

    public static final class 1 extends u implements q {
        final /* synthetic */ p $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(p pVar) {
            super(3);
            this.$content = pVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((h) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(h ViewWithVideoBackground, m mVar, int i) {
            t.g(ViewWithVideoBackground, "$this$ViewWithVideoBackground");
            if ((i & 17) == 16 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(340035564, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.WithOptionalBackgroundOverlay.<anonymous> (WithOptionalBackgroundOverlay.kt:27)");
            }
            this.$content.invoke(mVar, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BackgroundStyle $background;
        final /* synthetic */ p $content;
        final /* synthetic */ e $modifier;
        final /* synthetic */ E1 $shape;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(PaywallState.Loaded.Components components, BackgroundStyle backgroundStyle, e eVar, E1 e1, p pVar, int i, int i2) {
            super(2);
            this.$state = components;
            this.$background = backgroundStyle;
            this.$modifier = eVar;
            this.$shape = e1;
            this.$content = pVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            WithOptionalBackgroundOverlayKt.WithOptionalBackgroundOverlay(this.$state, this.$background, this.$modifier, this.$shape, this.$content, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void WithOptionalBackgroundOverlay(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r17, com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle r18, androidx.compose.ui.e r19, v0.E1 r20, Qa.p r21, b0.m r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.WithOptionalBackgroundOverlayKt.WithOptionalBackgroundOverlay(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle, androidx.compose.ui.e, v0.E1, Qa.p, b0.m, int, int):void");
    }
}
