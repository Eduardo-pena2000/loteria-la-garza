package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.l;
import Ca.m;
import z.M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PlaceholderDefaults {
    public static final PlaceholderDefaults INSTANCE = new PlaceholderDefaults();
    private static final l fadeAnimationSpec$delegate = m.b(PlaceholderDefaults$fadeAnimationSpec$2.INSTANCE);
    public static final int $stable = 8;

    private PlaceholderDefaults() {
    }

    public final M getFadeAnimationSpec() {
        return (M) fadeAnimationSpec$delegate.getValue();
    }
}
