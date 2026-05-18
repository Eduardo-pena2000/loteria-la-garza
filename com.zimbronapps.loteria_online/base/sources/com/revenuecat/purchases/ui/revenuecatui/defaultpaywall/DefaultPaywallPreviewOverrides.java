package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultPaywallPreviewOverrides {
    public static final int $stable = 8;
    private final Bitmap appIconBitmap;
    private final String appName;
    private final Boolean isDebugBuild;
    private final List prominentColors;

    public DefaultPaywallPreviewOverrides() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DefaultPaywallPreviewOverrides copy$default(DefaultPaywallPreviewOverrides defaultPaywallPreviewOverrides, String str, Bitmap bitmap, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultPaywallPreviewOverrides.appName;
        }
        if ((i & 2) != 0) {
            bitmap = defaultPaywallPreviewOverrides.appIconBitmap;
        }
        if ((i & 4) != 0) {
            list = defaultPaywallPreviewOverrides.prominentColors;
        }
        if ((i & 8) != 0) {
            bool = defaultPaywallPreviewOverrides.isDebugBuild;
        }
        return defaultPaywallPreviewOverrides.copy(str, bitmap, list, bool);
    }

    public final String component1() {
        return this.appName;
    }

    public final Bitmap component2() {
        return this.appIconBitmap;
    }

    public final List component3() {
        return this.prominentColors;
    }

    public final Boolean component4() {
        return this.isDebugBuild;
    }

    public final DefaultPaywallPreviewOverrides copy(String str, Bitmap bitmap, List list, Boolean bool) {
        return new DefaultPaywallPreviewOverrides(str, bitmap, list, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultPaywallPreviewOverrides)) {
            return false;
        }
        DefaultPaywallPreviewOverrides defaultPaywallPreviewOverrides = (DefaultPaywallPreviewOverrides) obj;
        return t.c(this.appName, defaultPaywallPreviewOverrides.appName) && t.c(this.appIconBitmap, defaultPaywallPreviewOverrides.appIconBitmap) && t.c(this.prominentColors, defaultPaywallPreviewOverrides.prominentColors) && t.c(this.isDebugBuild, defaultPaywallPreviewOverrides.isDebugBuild);
    }

    public final Bitmap getAppIconBitmap() {
        return this.appIconBitmap;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final List getProminentColors() {
        return this.prominentColors;
    }

    public int hashCode() {
        String str = this.appName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Bitmap bitmap = this.appIconBitmap;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        List list = this.prominentColors;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isDebugBuild;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isDebugBuild() {
        return this.isDebugBuild;
    }

    public String toString() {
        return "DefaultPaywallPreviewOverrides(appName=" + this.appName + ", appIconBitmap=" + this.appIconBitmap + ", prominentColors=" + this.prominentColors + ", isDebugBuild=" + this.isDebugBuild + ')';
    }

    public DefaultPaywallPreviewOverrides(String str, Bitmap bitmap, List list, Boolean bool) {
        this.appName = str;
        this.appIconBitmap = bitmap;
        this.prominentColors = list;
        this.isDebugBuild = bool;
    }

    public /* synthetic */ DefaultPaywallPreviewOverrides(String str, Bitmap bitmap, List list, Boolean bool, int i, k kVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bitmap, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : bool);
    }
}
