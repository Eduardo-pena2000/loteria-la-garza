package com.revenuecat.purchases.ui.revenuecatui.customercenter.composables;

import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SettingsButtonConfig {
    public static final int $stable = 0;
    private final boolean enabled;
    private final boolean loading;

    public SettingsButtonConfig() {
        this(false, false, 3, null);
    }

    public static /* synthetic */ SettingsButtonConfig copy$default(SettingsButtonConfig settingsButtonConfig, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = settingsButtonConfig.enabled;
        }
        if ((i & 2) != 0) {
            z2 = settingsButtonConfig.loading;
        }
        return settingsButtonConfig.copy(z, z2);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component2() {
        return this.loading;
    }

    public final SettingsButtonConfig copy(boolean z, boolean z2) {
        return new SettingsButtonConfig(z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsButtonConfig)) {
            return false;
        }
        SettingsButtonConfig settingsButtonConfig = (SettingsButtonConfig) obj;
        return this.enabled == settingsButtonConfig.enabled && this.loading == settingsButtonConfig.loading;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.enabled) * 31) + Boolean.hashCode(this.loading);
    }

    public String toString() {
        return "SettingsButtonConfig(enabled=" + this.enabled + ", loading=" + this.loading + ')';
    }

    public SettingsButtonConfig(boolean z, boolean z2) {
        this.enabled = z;
        this.loading = z2;
    }

    public /* synthetic */ SettingsButtonConfig(boolean z, boolean z2, int i, k kVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2);
    }
}
