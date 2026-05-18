package com.revenuecat.purchases.ui.revenuecatui.composables;

import X.E;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    public final SwitchColors colors-lRJcREg(ColorStyle colorStyle, ColorStyle colorStyle2, ColorStyle colorStyle3, long j, ColorStyle colorStyle4, ColorStyle colorStyle5, ColorStyle colorStyle6, long j2, ColorStyle colorStyle7, ColorStyle colorStyle8, ColorStyle colorStyle9, long j3, ColorStyle colorStyle10, ColorStyle colorStyle11, ColorStyle colorStyle12, long j4, m mVar, int i, int i2, int i3) {
        ColorStyle colorStyle13;
        long j5;
        ColorStyle colorStyle14;
        mVar.V(1279282675);
        ColorStyle colorStyle15 = (i3 & 1) != 0 ? ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(SwitchKt.access$getValue(SwitchTokens.INSTANCE.getSelectedHandleColor(), mVar, 6))) : colorStyle;
        ColorStyle colorStyle16 = (i3 & 2) != 0 ? ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(SwitchKt.access$getValue(SwitchTokens.INSTANCE.getSelectedTrackColor(), mVar, 6))) : colorStyle2;
        ColorStyle colorStyle17 = (i3 & 4) != 0 ? ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.i())) : colorStyle3;
        long access$getValue = (i3 & 8) != 0 ? SwitchKt.access$getValue(SwitchTokens.INSTANCE.getSelectedIconColor(), mVar, 6) : j;
        ColorStyle colorStyle18 = (i3 & 16) != 0 ? ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(SwitchKt.access$getValue(SwitchTokens.INSTANCE.getUnselectedHandleColor(), mVar, 6))) : colorStyle4;
        ColorStyle colorStyle19 = (i3 & 32) != 0 ? ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(SwitchKt.access$getValue(SwitchTokens.INSTANCE.getUnselectedTrackColor(), mVar, 6))) : colorStyle5;
        ColorStyle colorStyle20 = (i3 & 64) != 0 ? ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(SwitchKt.access$getValue(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), mVar, 6))) : colorStyle6;
        long access$getValue2 = (i3 & 128) != 0 ? SwitchKt.access$getValue(SwitchTokens.INSTANCE.getUnselectedIconColor(), mVar, 6) : j2;
        ColorStyle colorStyle21 = (i3 & 256) != 0 ? ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(s0.h(r0.q(SwitchKt.access$getValue(SwitchTokens.INSTANCE.getDisabledSelectedHandleColor(), mVar, 6), 1.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null), E.a.a(mVar, E.b).H()))) : colorStyle7;
        if ((i3 & 512) != 0) {
            colorStyle13 = colorStyle21;
            j5 = access$getValue2;
            colorStyle14 = ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(s0.h(r0.q(SwitchKt.access$getValue(SwitchTokens.INSTANCE.getDisabledSelectedTrackColor(), mVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), E.a.a(mVar, E.b).H())));
        } else {
            colorStyle13 = colorStyle21;
            j5 = access$getValue2;
            colorStyle14 = colorStyle8;
        }
        ColorStyle colorStyle22 = (i3 & 1024) != 0 ? ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.i())) : colorStyle9;
        long h = (i3 & 2048) != 0 ? s0.h(r0.q(SwitchKt.access$getValue(SwitchTokens.INSTANCE.getDisabledSelectedIconColor(), mVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), E.a.a(mVar, E.b).H()) : j3;
        ColorStyle colorStyle23 = (i3 & 4096) != 0 ? ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(s0.h(r0.q(SwitchKt.access$getValue(SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor(), mVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), E.a.a(mVar, E.b).H()))) : colorStyle10;
        ColorStyle colorStyle24 = (i3 & 8192) != 0 ? ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(s0.h(r0.q(SwitchKt.access$getValue(SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor(), mVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), E.a.a(mVar, E.b).H()))) : colorStyle11;
        ColorStyle colorStyle25 = (i3 & 16384) != 0 ? ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(s0.h(r0.q(SwitchKt.access$getValue(SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor(), mVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), E.a.a(mVar, E.b).H()))) : colorStyle12;
        long h2 = (i3 & 32768) != 0 ? s0.h(r0.q(SwitchKt.access$getValue(SwitchTokens.INSTANCE.getDisabledUnselectedIconColor(), mVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), E.a.a(mVar, E.b).H()) : j4;
        if (w.L()) {
            w.U(1279282675, i, i2, "com.revenuecat.purchases.ui.revenuecatui.composables.SwitchDefaults.colors (Switch.kt:172)");
        }
        SwitchColors switchColors = new SwitchColors(colorStyle15, colorStyle16, colorStyle17, access$getValue, colorStyle18, colorStyle19, colorStyle20, j5, colorStyle13, colorStyle14, colorStyle22, h, colorStyle23, colorStyle24, colorStyle25, h2, null);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return switchColors;
    }
}
