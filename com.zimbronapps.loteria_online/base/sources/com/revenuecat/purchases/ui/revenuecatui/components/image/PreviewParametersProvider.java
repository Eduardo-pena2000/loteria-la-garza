package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Ya.h;
import Ya.o;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import kotlin.jvm.internal.k;
import m1.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class PreviewParametersProvider implements a {
    private final h values;

    public PreviewParametersProvider() {
        Size size = new Size(new SizeConstraint.Fixed(200, (k) null), new SizeConstraint.Fixed(200, (k) null));
        FitMode fitMode = FitMode.FILL;
        PreviewParameters previewParameters = new PreviewParameters(100, 100, size, fitMode, null);
        Size size2 = new Size(new SizeConstraint.Fixed(200, (k) null), new SizeConstraint.Fixed(200, (k) null));
        FitMode fitMode2 = FitMode.FIT;
        PreviewParameters previewParameters2 = new PreviewParameters(100, 100, size2, fitMode2, null);
        PreviewParameters previewParameters3 = new PreviewParameters(100, 100, new Size(new SizeConstraint.Fixed(200, (k) null), new SizeConstraint.Fixed(50, (k) null)), fitMode, null);
        PreviewParameters previewParameters4 = new PreviewParameters(100, 100, new Size(new SizeConstraint.Fixed(200, (k) null), new SizeConstraint.Fixed(50, (k) null)), fitMode2, null);
        PreviewParameters previewParameters5 = new PreviewParameters(100, 100, new Size(new SizeConstraint.Fixed(50, (k) null), new SizeConstraint.Fixed(200, (k) null)), fitMode, null);
        PreviewParameters previewParameters6 = new PreviewParameters(100, 100, new Size(new SizeConstraint.Fixed(50, (k) null), new SizeConstraint.Fixed(200, (k) null)), fitMode2, null);
        SizeConstraint.Fixed fixed = new SizeConstraint.Fixed(72, (k) null);
        SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
        PreviewParameters previewParameters7 = new PreviewParameters(100, 100, new Size(fixed, fit), fitMode, null);
        PreviewParameters previewParameters8 = new PreviewParameters(100, 100, new Size(fit, new SizeConstraint.Fixed(72, (k) null)), fitMode, null);
        SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
        this.values = o.m(previewParameters, previewParameters2, previewParameters3, previewParameters4, previewParameters5, previewParameters6, previewParameters7, previewParameters8, new PreviewParameters(1909, 1306, new Size(fill, fit), fitMode2, null), new PreviewParameters(1306, 1909, new Size(fit, fill), fitMode2, null));
    }

    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public h getValues() {
        return this.values;
    }
}
