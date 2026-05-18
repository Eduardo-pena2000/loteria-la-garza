package com.revenuecat.purchases.ui.revenuecatui.customercenter.composables;

import Ca.I;
import F.V;
import Qa.a;
import Qa.l;
import Qa.p;
import Qa.q;
import X.E;
import X.L;
import X.m0;
import Z0.G;
import Z0.Y0;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import d1.H;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import l1.s;
import n1.h;
import v0.C1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class SettingsButtonKt {

    public static final class 1 extends u implements q {
        final /* synthetic */ SettingsButtonConfig $config;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, SettingsButtonConfig settingsButtonConfig) {
            super(3);
            this.$title = str;
            this.$config = settingsButtonConfig;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((V) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(V Button, m mVar, int i) {
            t.g(Button, "$this$Button");
            if ((i & 17) == 16 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(1433762825, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButton.<anonymous> (SettingsButton.kt:52)");
            }
            SettingsButtonKt.access$ButtonContent-XO-JAsU(this.$title, this.$config.getLoading(), E.a.a(mVar, E.b).s(), mVar, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements q {
        final /* synthetic */ SettingsButtonConfig $config;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, SettingsButtonConfig settingsButtonConfig) {
            super(3);
            this.$title = str;
            this.$config = settingsButtonConfig;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((V) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(V OutlinedButton, m mVar, int i) {
            t.g(OutlinedButton, "$this$OutlinedButton");
            if ((i & 17) == 16 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(397195892, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButton.<anonymous> (SettingsButton.kt:70)");
            }
            SettingsButtonKt.access$ButtonContent-XO-JAsU(this.$title, this.$config.getLoading(), E.a.a(mVar, E.b).C(), mVar, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ SettingsButtonConfig $config;
        final /* synthetic */ e $modifier;
        final /* synthetic */ a $onClick;
        final /* synthetic */ SettingsButtonStyle $style;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(String str, a aVar, SettingsButtonConfig settingsButtonConfig, e eVar, SettingsButtonStyle settingsButtonStyle, int i, int i2) {
            super(2);
            this.$title = str;
            this.$onClick = aVar;
            this.$config = settingsButtonConfig;
            this.$modifier = eVar;
            this.$style = settingsButtonStyle;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            SettingsButtonKt.SettingsButton(this.$title, this.$onClick, this.$config, this.$modifier, this.$style, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            SettingsButtonKt.access$SettingsButtonDisabled_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            SettingsButtonKt.access$SettingsButtonLoading_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            SettingsButtonKt.access$SettingsButtonOutlinedLoading_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            SettingsButtonKt.access$SettingsButtonOutlined_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            SettingsButtonKt.access$SettingsButton_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettingsButtonStyle.values().length];
            try {
                iArr[SettingsButtonStyle.FILLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SettingsButtonStyle.OUTLINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void ButtonContent-XO-JAsU(String str, boolean z, long j, m mVar, int i) {
        int i2;
        m i3 = mVar.i(483726370);
        if ((i & 6) == 0) {
            i2 = (i3.U(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.e(j) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(483726370, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.ButtonContent (SettingsButton.kt:85)");
            }
            if (z) {
                i3.V(-945467054);
                L.a(g.r(e.a, h.g(20)), j, h.g(2), 0L, 0, i3, ((i2 >> 3) & 112) | 390, 24);
                i3.P();
            } else {
                i3.V(-945298848);
                m0.b(str, (e) null, 0L, 0L, (H) null, (d1.L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, Y0.e(E.a.c(i3, E.b).b(), 0L, 0L, d1.L.b.f(), (H) null, (d1.I) null, (d1.u) null, (String) null, 0L, (l1.a) null, (l1.q) null, (h1.e) null, 0L, (k) null, (C1) null, (x0.g) null, 0, 0, 0L, (s) null, (G) null, (l1.h) null, 0, 0, (l1.u) null, 16777211, (Object) null), i3, i2 & 14, 0, 65534);
                i3.P();
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new SettingsButtonKt$ButtonContent$1(str, z, j, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void SettingsButton(java.lang.String r32, Qa.a r33, com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonConfig r34, androidx.compose.ui.e r35, com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonStyle r36, b0.m r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt.SettingsButton(java.lang.String, Qa.a, com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonConfig, androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonStyle, b0.m, int, int):void");
    }

    private static final void SettingsButtonDisabled_Preview(m mVar, int i) {
        m i2 = mVar.i(-1257236177);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1257236177, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonDisabled_Preview (SettingsButton.kt:147)");
            }
            SettingsButton("Restore purchases", 1.INSTANCE, new SettingsButtonConfig(false, false, 2, null), null, null, i2, 54, 24);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void SettingsButtonLoading_Preview(m mVar, int i) {
        m i2 = mVar.i(-1692829163);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1692829163, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonLoading_Preview (SettingsButton.kt:126)");
            }
            SettingsButton("Restore purchases", 1.INSTANCE, new SettingsButtonConfig(false, true, 1, null), null, null, i2, 54, 24);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void SettingsButtonOutlinedLoading_Preview(m mVar, int i) {
        m i2 = mVar.i(-919118185);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-919118185, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonOutlinedLoading_Preview (SettingsButton.kt:136)");
            }
            SettingsButtonStyle settingsButtonStyle = SettingsButtonStyle.OUTLINED;
            SettingsButton("Restore purchases", 1.INSTANCE, new SettingsButtonConfig(false, true, 1, null), null, settingsButtonStyle, i2, 24630, 8);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void SettingsButtonOutlined_Preview(m mVar, int i) {
        m i2 = mVar.i(1472127241);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1472127241, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonOutlined_Preview (SettingsButton.kt:115)");
            }
            SettingsButtonStyle settingsButtonStyle = SettingsButtonStyle.OUTLINED;
            SettingsButton("Restore purchases", 1.INSTANCE, new SettingsButtonConfig(false, false, 3, null), null, settingsButtonStyle, i2, 24630, 8);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void SettingsButton_Preview(m mVar, int i) {
        m i2 = mVar.i(-745433269);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-745433269, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButton_Preview (SettingsButton.kt:104)");
            }
            SettingsButtonStyle settingsButtonStyle = SettingsButtonStyle.FILLED;
            SettingsButton("Cancel subscription", 1.INSTANCE, new SettingsButtonConfig(false, false, 3, null), null, settingsButtonStyle, i2, 24630, 8);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final /* synthetic */ void access$ButtonContent-XO-JAsU(String str, boolean z, long j, m mVar, int i) {
        ButtonContent-XO-JAsU(str, z, j, mVar, i);
    }

    public static final /* synthetic */ void access$SettingsButtonDisabled_Preview(m mVar, int i) {
        SettingsButtonDisabled_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$SettingsButtonLoading_Preview(m mVar, int i) {
        SettingsButtonLoading_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$SettingsButtonOutlinedLoading_Preview(m mVar, int i) {
        SettingsButtonOutlinedLoading_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$SettingsButtonOutlined_Preview(m mVar, int i) {
        SettingsButtonOutlined_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$SettingsButton_Preview(m mVar, int i) {
        SettingsButton_Preview(mVar, i);
    }
}
