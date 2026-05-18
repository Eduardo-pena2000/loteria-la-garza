package com.revenuecat.purchases.ui.revenuecatui.composables;

import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class SwitchTokens {
    public static final float DisabledSelectedHandleOpacity = 1.0f;
    private static final ColorSchemeKeyTokens DisabledSelectedIconColor;
    public static final float DisabledSelectedIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledSelectedTrackColor;
    public static final float DisabledTrackOpacity = 0.12f;
    private static final ColorSchemeKeyTokens DisabledUnselectedHandleColor;
    public static final float DisabledUnselectedHandleOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledUnselectedIconColor;
    public static final float DisabledUnselectedIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledUnselectedTrackColor;
    private static final ColorSchemeKeyTokens DisabledUnselectedTrackOutlineColor;
    private static final ShapeKeyTokens HandleShape;
    private static final float PressedHandleWidth;
    private static final ColorSchemeKeyTokens SelectedHandleColor;
    private static final float SelectedHandleWidth;
    private static final ColorSchemeKeyTokens SelectedIconColor;
    private static final ColorSchemeKeyTokens SelectedTrackColor;
    private static final float StateLayerSize;
    private static final float TrackHeight;
    private static final float TrackOutlineWidth;
    private static final ShapeKeyTokens TrackShape;
    private static final float TrackWidth;
    private static final ColorSchemeKeyTokens UnselectedFocusTrackOutlineColor;
    private static final ColorSchemeKeyTokens UnselectedHandleColor;
    private static final float UnselectedHandleWidth;
    private static final ColorSchemeKeyTokens UnselectedIconColor;
    private static final ColorSchemeKeyTokens UnselectedTrackColor;
    public static final SwitchTokens INSTANCE = new SwitchTokens();
    private static final ColorSchemeKeyTokens DisabledSelectedHandleColor = ColorSchemeKeyTokens.Surface;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledSelectedIconColor = colorSchemeKeyTokens;
        DisabledSelectedTrackColor = colorSchemeKeyTokens;
        DisabledUnselectedHandleColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.SurfaceContainerHighest;
        DisabledUnselectedIconColor = colorSchemeKeyTokens2;
        DisabledUnselectedTrackColor = colorSchemeKeyTokens2;
        DisabledUnselectedTrackOutlineColor = colorSchemeKeyTokens;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        HandleShape = shapeKeyTokens;
        PressedHandleWidth = h.g((float) 28.0d);
        SelectedHandleColor = ColorSchemeKeyTokens.OnPrimary;
        SelectedHandleWidth = h.g((float) 24.0d);
        SelectedIconColor = ColorSchemeKeyTokens.OnPrimaryContainer;
        SelectedTrackColor = ColorSchemeKeyTokens.Primary;
        StateLayerSize = h.g((float) 40.0d);
        TrackHeight = h.g((float) 32.0d);
        TrackOutlineWidth = h.g((float) 2.0d);
        TrackShape = shapeKeyTokens;
        TrackWidth = h.g((float) 52.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Outline;
        UnselectedFocusTrackOutlineColor = colorSchemeKeyTokens3;
        UnselectedHandleColor = colorSchemeKeyTokens3;
        UnselectedHandleWidth = h.g((float) 16.0d);
        UnselectedIconColor = colorSchemeKeyTokens2;
        UnselectedTrackColor = colorSchemeKeyTokens2;
    }

    private SwitchTokens() {
    }

    public final ColorSchemeKeyTokens getDisabledSelectedHandleColor() {
        return DisabledSelectedHandleColor;
    }

    public final ColorSchemeKeyTokens getDisabledSelectedIconColor() {
        return DisabledSelectedIconColor;
    }

    public final ColorSchemeKeyTokens getDisabledSelectedTrackColor() {
        return DisabledSelectedTrackColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedHandleColor() {
        return DisabledUnselectedHandleColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedIconColor() {
        return DisabledUnselectedIconColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedTrackColor() {
        return DisabledUnselectedTrackColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedTrackOutlineColor() {
        return DisabledUnselectedTrackOutlineColor;
    }

    public final ShapeKeyTokens getHandleShape() {
        return HandleShape;
    }

    public final float getPressedHandleWidth-D9Ej5fM() {
        return PressedHandleWidth;
    }

    public final ColorSchemeKeyTokens getSelectedHandleColor() {
        return SelectedHandleColor;
    }

    public final float getSelectedHandleWidth-D9Ej5fM() {
        return SelectedHandleWidth;
    }

    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return SelectedIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedTrackColor() {
        return SelectedTrackColor;
    }

    public final float getStateLayerSize-D9Ej5fM() {
        return StateLayerSize;
    }

    public final float getTrackHeight-D9Ej5fM() {
        return TrackHeight;
    }

    public final float getTrackOutlineWidth-D9Ej5fM() {
        return TrackOutlineWidth;
    }

    public final ShapeKeyTokens getTrackShape() {
        return TrackShape;
    }

    public final float getTrackWidth-D9Ej5fM() {
        return TrackWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusTrackOutlineColor() {
        return UnselectedFocusTrackOutlineColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHandleColor() {
        return UnselectedHandleColor;
    }

    public final float getUnselectedHandleWidth-D9Ej5fM() {
        return UnselectedHandleWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedIconColor() {
        return UnselectedIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedTrackColor() {
        return UnselectedTrackColor;
    }
}
