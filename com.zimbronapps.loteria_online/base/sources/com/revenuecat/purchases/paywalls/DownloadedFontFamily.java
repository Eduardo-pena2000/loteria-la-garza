package com.revenuecat.purchases.paywalls;

import Da.v;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DownloadedFontFamily {
    private final String family;
    private final List fonts;

    public DownloadedFontFamily(String str, List list) {
        t.g(str, "family");
        t.g(list, "fonts");
        this.family = str;
        this.fonts = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadedFontFamily)) {
            return false;
        }
        DownloadedFontFamily downloadedFontFamily = (DownloadedFontFamily) obj;
        return t.c(this.family, downloadedFontFamily.family) && t.c(this.fonts, downloadedFontFamily.fonts);
    }

    public final /* synthetic */ String getFamily() {
        return this.family;
    }

    public final /* synthetic */ List getFonts() {
        return this.fonts;
    }

    public int hashCode() {
        return (this.family.hashCode() * 31) + this.fonts.hashCode();
    }

    public String toString() {
        return "DownloadedFontFamily(family=" + this.family + ", fonts=" + this.fonts + ')';
    }

    public /* synthetic */ DownloadedFontFamily(String str, List list, int i, k kVar) {
        this(str, (i & 2) != 0 ? v.n() : list);
    }
}
