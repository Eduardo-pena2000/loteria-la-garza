package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import n1.h;
import n1.w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterUIConstants {
    public static final int $stable = 0;
    private static final float ContentUnavailableIconSize;
    private static final float ContentUnavailableViewPaddingHorizontal;
    private static final float ContentUnavailableViewPaddingText;
    private static final float ContentUnavailableViewPaddingVertical;
    public static final CustomerCenterUIConstants INSTANCE = new CustomerCenterUIConstants();
    private static final float ManagementViewHorizontalPadding;
    private static final float ManagementViewSpacer;
    private static final float ManagementViewTitleTopPadding;
    private static final float PaddingMedium;
    private static final float PaddingSmall;
    private static final float PaddingTiny;
    private static final float PaddingXL;
    public static final float SettingsRowMainTextAlpha = 1.0f;
    private static final long SettingsRowMainTextSize;
    public static final float SettingsRowSupportingTextAlpha = 0.6f;
    private static final long SettingsRowSupportingTextSize;
    private static final float SubscriptionViewHorizontalSpace;
    private static final float SubscriptionViewIconSize;
    private static final float SubscriptionViewRowHeight;

    static {
        float g = h.g(4);
        PaddingTiny = g;
        float g2 = h.g(8);
        PaddingSmall = g2;
        float f = 16;
        float g3 = h.g(f);
        PaddingMedium = g3;
        float g4 = h.g(32);
        PaddingXL = g4;
        ManagementViewTitleTopPadding = h.g(64);
        SettingsRowMainTextSize = w.f(20);
        SettingsRowSupportingTextSize = w.f(14);
        SubscriptionViewRowHeight = h.g(60);
        SubscriptionViewHorizontalSpace = g2;
        float f2 = 24;
        SubscriptionViewIconSize = h.g(f2);
        ContentUnavailableViewPaddingHorizontal = h.g(f);
        ContentUnavailableViewPaddingVertical = h.g(20);
        ContentUnavailableViewPaddingText = g;
        ContentUnavailableIconSize = h.g(f2);
        ManagementViewHorizontalPadding = g3;
        ManagementViewSpacer = g4;
    }

    private CustomerCenterUIConstants() {
    }

    public final float getContentUnavailableIconSize-D9Ej5fM() {
        return ContentUnavailableIconSize;
    }

    public final float getContentUnavailableViewPaddingHorizontal-D9Ej5fM() {
        return ContentUnavailableViewPaddingHorizontal;
    }

    public final float getContentUnavailableViewPaddingText-D9Ej5fM() {
        return ContentUnavailableViewPaddingText;
    }

    public final float getContentUnavailableViewPaddingVertical-D9Ej5fM() {
        return ContentUnavailableViewPaddingVertical;
    }

    public final float getManagementViewHorizontalPadding-D9Ej5fM() {
        return ManagementViewHorizontalPadding;
    }

    public final float getManagementViewSpacer-D9Ej5fM() {
        return ManagementViewSpacer;
    }

    public final float getManagementViewTitleTopPadding-D9Ej5fM() {
        return ManagementViewTitleTopPadding;
    }

    public final long getSettingsRowMainTextSize-XSAIIZE() {
        return SettingsRowMainTextSize;
    }

    public final long getSettingsRowSupportingTextSize-XSAIIZE() {
        return SettingsRowSupportingTextSize;
    }

    public final float getSubscriptionViewHorizontalSpace-D9Ej5fM() {
        return SubscriptionViewHorizontalSpace;
    }

    public final float getSubscriptionViewIconSize-D9Ej5fM() {
        return SubscriptionViewIconSize;
    }

    public final float getSubscriptionViewRowHeight-D9Ej5fM() {
        return SubscriptionViewRowHeight;
    }
}
