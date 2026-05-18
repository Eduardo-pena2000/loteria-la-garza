package com.revenuecat.purchases.ui.revenuecatui;

import n1.h;
import z.F;
import z.i;
import z.j;
import z.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UIConstant {
    public static final int defaultAnimationDurationMillis = 200;
    private static final float defaultHorizontalPadding;
    private static final float defaultVerticalSpacing;
    public static final float halfWeight = 0.5f;
    public static final float purchaseInProgressButtonOpacity = 0.4f;
    public static final UIConstant INSTANCE = new UIConstant();
    private static final float defaultCornerRadius = h.g(20);
    private static final float defaultPackageCornerRadius = h.g(16);
    private static final float defaultPackageBorderWidth = h.g((float) 1.5d);
    private static final i defaultColorAnimation = j.j(300, 0, F.e(), 2, (Object) null);
    private static final float iconButtonSize = h.g(48);
    public static final int $stable = 8;

    static {
        float f = 12;
        defaultHorizontalPadding = h.g(f);
        defaultVerticalSpacing = h.g(f);
    }

    private UIConstant() {
    }

    public final r0 defaultAnimation() {
        return j.j(200, 0, F.f(), 2, (Object) null);
    }

    public final i getDefaultColorAnimation() {
        return defaultColorAnimation;
    }

    public final float getDefaultCornerRadius-D9Ej5fM() {
        return defaultCornerRadius;
    }

    public final float getDefaultHorizontalPadding-D9Ej5fM() {
        return defaultHorizontalPadding;
    }

    public final float getDefaultPackageBorderWidth-D9Ej5fM() {
        return defaultPackageBorderWidth;
    }

    public final float getDefaultPackageCornerRadius-D9Ej5fM() {
        return defaultPackageCornerRadius;
    }

    public final float getDefaultVerticalSpacing-D9Ej5fM() {
        return defaultVerticalSpacing;
    }

    public final float getIconButtonSize-D9Ej5fM() {
        return iconButtonSize;
    }
}
