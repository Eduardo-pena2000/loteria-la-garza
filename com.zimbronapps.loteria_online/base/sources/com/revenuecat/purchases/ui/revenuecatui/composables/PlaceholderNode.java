package com.revenuecat.purchases.ui.revenuecatui.composables;

import O0.t;
import androidx.compose.ui.e;
import x0.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class PlaceholderNode extends e.c implements t {
    private Placeholder placeholder;

    public PlaceholderNode(Placeholder placeholder) {
        kotlin.jvm.internal.t.g(placeholder, "placeholder");
        this.placeholder = placeholder;
    }

    public void draw(c cVar) {
        kotlin.jvm.internal.t.g(cVar, "<this>");
        this.placeholder.draw$revenuecatui_defaultsBc8Release(cVar);
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }

    public /* bridge */ /* synthetic */ void onDensityChange() {
        super/*O0.j*/.onDensityChange();
    }

    public /* bridge */ /* synthetic */ void onLayoutDirectionChange() {
        super/*O0.j*/.onLayoutDirectionChange();
    }

    public /* bridge */ /* synthetic */ void onMeasureResultChanged() {
        super.onMeasureResultChanged();
    }

    public final void setPlaceholder(Placeholder placeholder) {
        kotlin.jvm.internal.t.g(placeholder, "<set-?>");
        this.placeholder = placeholder;
    }
}
