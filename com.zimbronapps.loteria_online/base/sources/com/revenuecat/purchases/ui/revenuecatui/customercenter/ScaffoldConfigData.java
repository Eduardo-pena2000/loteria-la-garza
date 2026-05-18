package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class ScaffoldConfigData {
    private final CustomerCenterState.NavigationButtonType navigationButtonType;
    private final boolean shouldUseLargeTopBar;
    private final String title;

    public ScaffoldConfigData(String str, CustomerCenterState.NavigationButtonType navigationButtonType, boolean z) {
        t.g(navigationButtonType, "navigationButtonType");
        this.title = str;
        this.navigationButtonType = navigationButtonType;
        this.shouldUseLargeTopBar = z;
    }

    public static /* synthetic */ ScaffoldConfigData copy$default(ScaffoldConfigData scaffoldConfigData, String str, CustomerCenterState.NavigationButtonType navigationButtonType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scaffoldConfigData.title;
        }
        if ((i & 2) != 0) {
            navigationButtonType = scaffoldConfigData.navigationButtonType;
        }
        if ((i & 4) != 0) {
            z = scaffoldConfigData.shouldUseLargeTopBar;
        }
        return scaffoldConfigData.copy(str, navigationButtonType, z);
    }

    public final String component1() {
        return this.title;
    }

    public final CustomerCenterState.NavigationButtonType component2() {
        return this.navigationButtonType;
    }

    public final boolean component3() {
        return this.shouldUseLargeTopBar;
    }

    public final ScaffoldConfigData copy(String str, CustomerCenterState.NavigationButtonType navigationButtonType, boolean z) {
        t.g(navigationButtonType, "navigationButtonType");
        return new ScaffoldConfigData(str, navigationButtonType, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScaffoldConfigData)) {
            return false;
        }
        ScaffoldConfigData scaffoldConfigData = (ScaffoldConfigData) obj;
        return t.c(this.title, scaffoldConfigData.title) && this.navigationButtonType == scaffoldConfigData.navigationButtonType && this.shouldUseLargeTopBar == scaffoldConfigData.shouldUseLargeTopBar;
    }

    public final CustomerCenterState.NavigationButtonType getNavigationButtonType() {
        return this.navigationButtonType;
    }

    public final boolean getShouldUseLargeTopBar() {
        return this.shouldUseLargeTopBar;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.navigationButtonType.hashCode()) * 31) + Boolean.hashCode(this.shouldUseLargeTopBar);
    }

    public String toString() {
        return "ScaffoldConfigData(title=" + this.title + ", navigationButtonType=" + this.navigationButtonType + ", shouldUseLargeTopBar=" + this.shouldUseLargeTopBar + ')';
    }
}
