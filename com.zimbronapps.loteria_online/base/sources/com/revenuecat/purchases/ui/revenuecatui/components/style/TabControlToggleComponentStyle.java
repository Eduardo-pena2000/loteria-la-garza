package com.revenuecat.purchases.ui.revenuecatui.components.style;

import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TabControlToggleComponentStyle implements ComponentStyle {
    public static final int $stable = 0;
    private final Size size;
    private final ColorStyles thumbColorOff;
    private final ColorStyles thumbColorOn;
    private final ColorStyles trackColorOff;
    private final ColorStyles trackColorOn;
    private final boolean visible;

    public TabControlToggleComponentStyle(ColorStyles thumbColorOn, ColorStyles thumbColorOff, ColorStyles trackColorOn, ColorStyles trackColorOff) {
        t.g(thumbColorOn, "thumbColorOn");
        t.g(thumbColorOff, "thumbColorOff");
        t.g(trackColorOn, "trackColorOn");
        t.g(trackColorOff, "trackColorOff");
        this.thumbColorOn = thumbColorOn;
        this.thumbColorOff = thumbColorOff;
        this.trackColorOn = trackColorOn;
        this.trackColorOff = trackColorOff;
        this.visible = true;
        SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
        this.size = new Size(fit, fit);
    }

    public Size getSize() {
        return this.size;
    }

    public final /* synthetic */ ColorStyles getThumbColorOff() {
        return this.thumbColorOff;
    }

    public final /* synthetic */ ColorStyles getThumbColorOn() {
        return this.thumbColorOn;
    }

    public final /* synthetic */ ColorStyles getTrackColorOff() {
        return this.trackColorOff;
    }

    public final /* synthetic */ ColorStyles getTrackColorOn() {
        return this.trackColorOn;
    }

    public boolean getVisible() {
        return this.visible;
    }
}
