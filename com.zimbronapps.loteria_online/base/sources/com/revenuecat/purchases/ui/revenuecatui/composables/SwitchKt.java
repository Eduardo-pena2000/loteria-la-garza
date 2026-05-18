package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Ca.o;
import E.k;
import E.m;
import F.f;
import M.i;
import M0.B;
import O0.g;
import Qa.a;
import Qa.l;
import Qa.p;
import X.E;
import X.P;
import X.X;
import X.s;
import androidx.compose.foundation.d;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.B1;
import b0.H;
import b0.c1;
import b0.g1;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.h;
import o0.e;
import v0.E1;
import z.D;
import z.d0;
import z.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SwitchKt {
    private static final r0 AnimationSpec;
    private static final d0 SnapSpec;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDiameter;
    private static final float ThumbPadding;
    private static final float UncheckedThumbDiameter;

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ SwitchColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ m $interactionSource;
        final /* synthetic */ e $modifier;
        final /* synthetic */ l $onCheckedChange;
        final /* synthetic */ p $thumbContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(boolean z, l lVar, e eVar, p pVar, boolean z2, SwitchColors switchColors, m mVar, int i, int i2) {
            super(2);
            this.$checked = z;
            this.$onCheckedChange = lVar;
            this.$modifier = eVar;
            this.$thumbContent = pVar;
            this.$enabled = z2;
            this.$colors = switchColors;
            this.$interactionSource = mVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            SwitchKt.Switch(this.$checked, this.$onCheckedChange, this.$modifier, this.$thumbContent, this.$enabled, this.$colors, this.$interactionSource, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ SwitchColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ k $interactionSource;
        final /* synthetic */ e $modifier;
        final /* synthetic */ p $thumbContent;
        final /* synthetic */ E1 $thumbShape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(e eVar, boolean z, boolean z2, SwitchColors switchColors, p pVar, k kVar, E1 e1, int i) {
            super(2);
            this.$modifier = eVar;
            this.$checked = z;
            this.$enabled = z2;
            this.$colors = switchColors;
            this.$thumbContent = pVar;
            this.$interactionSource = kVar;
            this.$thumbShape = e1;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            SwitchKt.access$SwitchImpl(this.$modifier, this.$checked, this.$enabled, this.$colors, this.$thumbContent, this.$interactionSource, this.$thumbShape, mVar, g1.a(this.$$changed | 1));
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            try {
                iArr[ShapeKeyTokens.CornerFull.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr2[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ColorSchemeKeyTokens.OnSurface.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ColorSchemeKeyTokens.Outline.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ColorSchemeKeyTokens.Primary.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ColorSchemeKeyTokens.Surface.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        float f = switchTokens.getSelectedHandleWidth-D9Ej5fM();
        ThumbDiameter = f;
        UncheckedThumbDiameter = switchTokens.getUnselectedHandleWidth-D9Ej5fM();
        SwitchWidth = switchTokens.getTrackWidth-D9Ej5fM();
        float f2 = switchTokens.getTrackHeight-D9Ej5fM();
        SwitchHeight = f2;
        ThumbPadding = h.g(h.g(f2 - f) / 2);
        SnapSpec = new d0(0, 1, (kotlin.jvm.internal.k) null);
        AnimationSpec = new r0(100, 0, (D) null, 6, (kotlin.jvm.internal.k) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Switch(boolean r36, Qa.l r37, androidx.compose.ui.e r38, Qa.p r39, boolean r40, com.revenuecat.purchases.ui.revenuecatui.composables.SwitchColors r41, E.m r42, b0.m r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.SwitchKt.Switch(boolean, Qa.l, androidx.compose.ui.e, Qa.p, boolean, com.revenuecat.purchases.ui.revenuecatui.composables.SwitchColors, E.m, b0.m, int, int):void");
    }

    private static final void SwitchImpl(e eVar, boolean z, boolean z2, SwitchColors switchColors, p pVar, k kVar, E1 e1, b0.m mVar, int i) {
        int i2;
        b0.m i3 = mVar.i(871043204);
        if ((i & 6) == 0) {
            i2 = (i3.U(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.a(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i3.U(switchColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i3.E(pVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= i3.U(kVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= i3.U(e1) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(871043204, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.SwitchImpl (Switch.kt:256)");
            }
            ColorStyle trackColor$revenuecatui_defaultsBc8Release = switchColors.trackColor$revenuecatui_defaultsBc8Release(z2, z);
            ColorStyle thumbColor$revenuecatui_defaultsBc8Release = switchColors.thumbColor$revenuecatui_defaultsBc8Release(z2, z);
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            E1 value = getValue(switchTokens.getTrackShape(), i3, 6);
            e background = BackgroundKt.background(BorderKt.border-ziNgDLE(eVar, switchTokens.getTrackOutlineWidth-D9Ej5fM(), switchColors.borderColor$revenuecatui_defaultsBc8Release(z2, z), value), trackColor$revenuecatui_defaultsBc8Release, value);
            e.a aVar = o0.e.a;
            B h = f.h(aVar.o(), false);
            int a = b0.h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = c.f(i3, background);
            g.a aVar2 = g.E8;
            a a2 = aVar2.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a2);
            } else {
                i3.s();
            }
            b0.m b = m2.b(i3);
            m2.e(b, h, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar2.f());
            androidx.compose.ui.e background2 = BackgroundKt.background(d.b(androidx.compose.foundation.layout.c.a.a(androidx.compose.ui.e.a, aVar.h()).then(new ThumbElement(kVar, z)), kVar, P.c(false, h.g(switchTokens.getStateLayerSize-D9Ej5fM() / 2), 0L, 4, (Object) null)), thumbColor$revenuecatui_defaultsBc8Release, e1);
            B h2 = f.h(aVar.e(), false);
            int a3 = b0.h.a(i3, 0);
            b0.I r2 = i3.r();
            androidx.compose.ui.e f2 = c.f(i3, background2);
            a a4 = aVar2.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a4);
            } else {
                i3.s();
            }
            b0.m b3 = m2.b(i3);
            m2.e(b3, h2, aVar2.e());
            m2.e(b3, r2, aVar2.g());
            p b4 = aVar2.b();
            if (b3.f() || !t.c(b3.C(), Integer.valueOf(a3))) {
                b3.t(Integer.valueOf(a3));
                b3.J(Integer.valueOf(a3), b4);
            }
            m2.e(b3, f2, aVar2.f());
            i3.V(-1860834223);
            if (pVar != null) {
                H.c(s.a().d(v0.r0.m(switchColors.iconColor-WaAFU9c$revenuecatui_defaultsBc8Release(z2, z))), pVar, i3, c1.i | ((i2 >> 9) & 112));
            }
            i3.P();
            i3.v();
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(eVar, z, z2, switchColors, pVar, kVar, e1, i));
        }
    }

    public static final /* synthetic */ void access$SwitchImpl(androidx.compose.ui.e eVar, boolean z, boolean z2, SwitchColors switchColors, p pVar, k kVar, E1 e1, b0.m mVar, int i) {
        SwitchImpl(eVar, z, z2, switchColors, pVar, kVar, e1, mVar, i);
    }

    public static final /* synthetic */ r0 access$getAnimationSpec$p() {
        return AnimationSpec;
    }

    public static final /* synthetic */ d0 access$getSnapSpec$p() {
        return SnapSpec;
    }

    public static final /* synthetic */ float access$getSwitchHeight$p() {
        return SwitchHeight;
    }

    public static final /* synthetic */ float access$getSwitchWidth$p() {
        return SwitchWidth;
    }

    public static final /* synthetic */ float access$getThumbDiameter$p() {
        return ThumbDiameter;
    }

    public static final /* synthetic */ float access$getThumbPadding$p() {
        return ThumbPadding;
    }

    public static final /* synthetic */ float access$getUncheckedThumbDiameter$p() {
        return UncheckedThumbDiameter;
    }

    public static final /* synthetic */ long access$getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, b0.m mVar, int i) {
        return getValue(colorSchemeKeyTokens, mVar, i);
    }

    private static final E1 fromToken(X x, ShapeKeyTokens shapeKeyTokens) {
        if (WhenMappings.$EnumSwitchMapping$0[shapeKeyTokens.ordinal()] == 1) {
            return i.g();
        }
        throw new o();
    }

    private static final E1 getValue(ShapeKeyTokens shapeKeyTokens, b0.m mVar, int i) {
        if (w.L()) {
            w.U(2130513227, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.<get-value> (Switch.kt:464)");
        }
        E1 fromToken = fromToken(E.a.b(mVar, E.b), shapeKeyTokens);
        if (w.L()) {
            w.T();
        }
        return fromToken;
    }

    private static final long getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, b0.m mVar, int i) {
        if (w.L()) {
            w.U(-323273324, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.<get-value> (Switch.kt:468)");
        }
        long fromToken = fromToken(E.a.a(mVar, E.b), colorSchemeKeyTokens);
        if (w.L()) {
            w.T();
        }
        return fromToken;
    }

    private static final long fromToken(X.l lVar, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$1[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return lVar.s();
            case 2:
                return lVar.t();
            case 3:
                return lVar.w();
            case 4:
                return lVar.A();
            case 5:
                return lVar.C();
            case 6:
                return lVar.H();
            case 7:
                return lVar.L();
            default:
                throw new o();
        }
    }
}
