package com.revenuecat.purchases.ui.revenuecatui.components.image;

import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class PreviewParameters {
    private final FitMode fitMode;
    private final int imageHeight;
    private final int imageWidth;
    private final Size viewSize;

    public /* synthetic */ PreviewParameters(int i, int i2, Size size, FitMode fitMode, k kVar) {
        this(i, i2, size, fitMode);
    }

    public final FitMode getFitMode() {
        return this.fitMode;
    }

    public final int getImageHeight-pVg5ArA() {
        return this.imageHeight;
    }

    public final int getImageWidth-pVg5ArA() {
        return this.imageWidth;
    }

    public final Size getViewSize() {
        return this.viewSize;
    }

    private PreviewParameters(int i, int i2, Size viewSize, FitMode fitMode) {
        t.g(viewSize, "viewSize");
        t.g(fitMode, "fitMode");
        this.imageWidth = i;
        this.imageHeight = i2;
        this.viewSize = viewSize;
        this.fitMode = fitMode;
    }
}
