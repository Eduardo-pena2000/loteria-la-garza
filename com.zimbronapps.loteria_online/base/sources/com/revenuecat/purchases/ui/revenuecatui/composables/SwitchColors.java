package com.revenuecat.purchases.ui.revenuecatui.composables;

import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SwitchColors {
    public static final int $stable = 0;
    private final ColorStyle checkedBorderColor;
    private final long checkedIconColor;
    private final ColorStyle checkedThumbColor;
    private final ColorStyle checkedTrackColor;
    private final ColorStyle disabledCheckedBorderColor;
    private final long disabledCheckedIconColor;
    private final ColorStyle disabledCheckedThumbColor;
    private final ColorStyle disabledCheckedTrackColor;
    private final ColorStyle disabledUncheckedBorderColor;
    private final long disabledUncheckedIconColor;
    private final ColorStyle disabledUncheckedThumbColor;
    private final ColorStyle disabledUncheckedTrackColor;
    private final ColorStyle uncheckedBorderColor;
    private final long uncheckedIconColor;
    private final ColorStyle uncheckedThumbColor;
    private final ColorStyle uncheckedTrackColor;

    public /* synthetic */ SwitchColors(ColorStyle colorStyle, ColorStyle colorStyle2, ColorStyle colorStyle3, long j, ColorStyle colorStyle4, ColorStyle colorStyle5, ColorStyle colorStyle6, long j2, ColorStyle colorStyle7, ColorStyle colorStyle8, ColorStyle colorStyle9, long j3, ColorStyle colorStyle10, ColorStyle colorStyle11, ColorStyle colorStyle12, long j4, k kVar) {
        this(colorStyle, colorStyle2, colorStyle3, j, colorStyle4, colorStyle5, colorStyle6, j2, colorStyle7, colorStyle8, colorStyle9, j3, colorStyle10, colorStyle11, colorStyle12, j4);
    }

    public final ColorStyle borderColor$revenuecatui_defaultsBc8Release(boolean z, boolean z2) {
        return z ? z2 ? this.checkedBorderColor : this.uncheckedBorderColor : z2 ? this.disabledCheckedBorderColor : this.disabledUncheckedBorderColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) obj;
        return t.c(this.checkedThumbColor, switchColors.checkedThumbColor) && t.c(this.checkedTrackColor, switchColors.checkedTrackColor) && t.c(this.checkedBorderColor, switchColors.checkedBorderColor) && r0.s(this.checkedIconColor, switchColors.checkedIconColor) && t.c(this.uncheckedThumbColor, switchColors.uncheckedThumbColor) && t.c(this.uncheckedTrackColor, switchColors.uncheckedTrackColor) && t.c(this.uncheckedBorderColor, switchColors.uncheckedBorderColor) && r0.s(this.uncheckedIconColor, switchColors.uncheckedIconColor) && t.c(this.disabledCheckedThumbColor, switchColors.disabledCheckedThumbColor) && t.c(this.disabledCheckedTrackColor, switchColors.disabledCheckedTrackColor) && t.c(this.disabledCheckedBorderColor, switchColors.disabledCheckedBorderColor) && r0.s(this.disabledCheckedIconColor, switchColors.disabledCheckedIconColor) && t.c(this.disabledUncheckedThumbColor, switchColors.disabledUncheckedThumbColor) && t.c(this.disabledUncheckedTrackColor, switchColors.disabledUncheckedTrackColor) && t.c(this.disabledUncheckedBorderColor, switchColors.disabledUncheckedBorderColor) && r0.s(this.disabledUncheckedIconColor, switchColors.disabledUncheckedIconColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.checkedThumbColor.hashCode() * 31) + this.checkedTrackColor.hashCode()) * 31) + this.checkedBorderColor.hashCode()) * 31) + r0.y(this.checkedIconColor)) * 31) + this.uncheckedThumbColor.hashCode()) * 31) + this.uncheckedTrackColor.hashCode()) * 31) + this.uncheckedBorderColor.hashCode()) * 31) + r0.y(this.uncheckedIconColor)) * 31) + this.disabledCheckedThumbColor.hashCode()) * 31) + this.disabledCheckedTrackColor.hashCode()) * 31) + this.disabledCheckedBorderColor.hashCode()) * 31) + r0.y(this.disabledCheckedIconColor)) * 31) + this.disabledUncheckedThumbColor.hashCode()) * 31) + this.disabledUncheckedTrackColor.hashCode()) * 31) + this.disabledUncheckedBorderColor.hashCode()) * 31) + r0.y(this.disabledUncheckedIconColor);
    }

    public final long iconColor-WaAFU9c$revenuecatui_defaultsBc8Release(boolean z, boolean z2) {
        return z ? z2 ? this.checkedIconColor : this.uncheckedIconColor : z2 ? this.disabledCheckedIconColor : this.disabledUncheckedIconColor;
    }

    public final ColorStyle thumbColor$revenuecatui_defaultsBc8Release(boolean z, boolean z2) {
        return z ? z2 ? this.checkedThumbColor : this.uncheckedThumbColor : z2 ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
    }

    public String toString() {
        return "SwitchColors(checkedThumbColor=" + this.checkedThumbColor + ", checkedTrackColor=" + this.checkedTrackColor + ", checkedBorderColor=" + this.checkedBorderColor + ", checkedIconColor=" + r0.z(this.checkedIconColor) + ", uncheckedThumbColor=" + this.uncheckedThumbColor + ", uncheckedTrackColor=" + this.uncheckedTrackColor + ", uncheckedBorderColor=" + this.uncheckedBorderColor + ", uncheckedIconColor=" + r0.z(this.uncheckedIconColor) + ", disabledCheckedThumbColor=" + this.disabledCheckedThumbColor + ", disabledCheckedTrackColor=" + this.disabledCheckedTrackColor + ", disabledCheckedBorderColor=" + this.disabledCheckedBorderColor + ", disabledCheckedIconColor=" + r0.z(this.disabledCheckedIconColor) + ", disabledUncheckedThumbColor=" + this.disabledUncheckedThumbColor + ", disabledUncheckedTrackColor=" + this.disabledUncheckedTrackColor + ", disabledUncheckedBorderColor=" + this.disabledUncheckedBorderColor + ", disabledUncheckedIconColor=" + r0.z(this.disabledUncheckedIconColor) + ')';
    }

    public final ColorStyle trackColor$revenuecatui_defaultsBc8Release(boolean z, boolean z2) {
        return z ? z2 ? this.checkedTrackColor : this.uncheckedTrackColor : z2 ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
    }

    private SwitchColors(ColorStyle checkedThumbColor, ColorStyle checkedTrackColor, ColorStyle checkedBorderColor, long j, ColorStyle uncheckedThumbColor, ColorStyle uncheckedTrackColor, ColorStyle uncheckedBorderColor, long j2, ColorStyle disabledCheckedThumbColor, ColorStyle disabledCheckedTrackColor, ColorStyle disabledCheckedBorderColor, long j3, ColorStyle disabledUncheckedThumbColor, ColorStyle disabledUncheckedTrackColor, ColorStyle disabledUncheckedBorderColor, long j4) {
        t.g(checkedThumbColor, "checkedThumbColor");
        t.g(checkedTrackColor, "checkedTrackColor");
        t.g(checkedBorderColor, "checkedBorderColor");
        t.g(uncheckedThumbColor, "uncheckedThumbColor");
        t.g(uncheckedTrackColor, "uncheckedTrackColor");
        t.g(uncheckedBorderColor, "uncheckedBorderColor");
        t.g(disabledCheckedThumbColor, "disabledCheckedThumbColor");
        t.g(disabledCheckedTrackColor, "disabledCheckedTrackColor");
        t.g(disabledCheckedBorderColor, "disabledCheckedBorderColor");
        t.g(disabledUncheckedThumbColor, "disabledUncheckedThumbColor");
        t.g(disabledUncheckedTrackColor, "disabledUncheckedTrackColor");
        t.g(disabledUncheckedBorderColor, "disabledUncheckedBorderColor");
        this.checkedThumbColor = checkedThumbColor;
        this.checkedTrackColor = checkedTrackColor;
        this.checkedBorderColor = checkedBorderColor;
        this.checkedIconColor = j;
        this.uncheckedThumbColor = uncheckedThumbColor;
        this.uncheckedTrackColor = uncheckedTrackColor;
        this.uncheckedBorderColor = uncheckedBorderColor;
        this.uncheckedIconColor = j2;
        this.disabledCheckedThumbColor = disabledCheckedThumbColor;
        this.disabledCheckedTrackColor = disabledCheckedTrackColor;
        this.disabledCheckedBorderColor = disabledCheckedBorderColor;
        this.disabledCheckedIconColor = j3;
        this.disabledUncheckedThumbColor = disabledUncheckedThumbColor;
        this.disabledUncheckedTrackColor = disabledUncheckedTrackColor;
        this.disabledUncheckedBorderColor = disabledUncheckedBorderColor;
        this.disabledUncheckedIconColor = j4;
    }
}
