package com.revenuecat.purchases.ui.revenuecatui.data;

import X.l;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallViewModelFactory extends X.d {
    public static final int $stable = 8;
    private final l colorScheme;
    private final boolean isDarkMode;
    private final PaywallOptions options;
    private final boolean preview;
    private final ResourceProvider resourceProvider;
    private final Qa.l shouldDisplayBlock;

    public /* synthetic */ PaywallViewModelFactory(ResourceProvider resourceProvider, PaywallOptions paywallOptions, l lVar, boolean z, Qa.l lVar2, boolean z2, int i, k kVar) {
        this(resourceProvider, paywallOptions, lVar, z, lVar2, (i & 32) != 0 ? false : z2);
    }

    public V create(Class modelClass) {
        t.g(modelClass, "modelClass");
        return new PaywallViewModelImpl(this.resourceProvider, null, this.options, this.colorScheme, this.isDarkMode, this.shouldDisplayBlock, this.preview, null, 130, null);
    }

    public PaywallViewModelFactory(ResourceProvider resourceProvider, PaywallOptions options, l colorScheme, boolean z, Qa.l lVar, boolean z2) {
        t.g(resourceProvider, "resourceProvider");
        t.g(options, "options");
        t.g(colorScheme, "colorScheme");
        this.resourceProvider = resourceProvider;
        this.options = options;
        this.colorScheme = colorScheme;
        this.isDarkMode = z;
        this.shouldDisplayBlock = lVar;
        this.preview = z2;
    }
}
