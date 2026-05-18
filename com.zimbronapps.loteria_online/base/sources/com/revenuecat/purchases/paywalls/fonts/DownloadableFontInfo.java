package com.revenuecat.purchases.paywalls.fonts;

import com.revenuecat.purchases.paywalls.components.properties.FontStyle;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DownloadableFontInfo {
    private final String expectedMd5;
    private final String family;
    private final FontStyle style;
    private final String url;
    private final int weight;

    public DownloadableFontInfo(String str, String str2, String str3, int i, FontStyle fontStyle) {
        t.g(str, "url");
        t.g(str2, "expectedMd5");
        t.g(str3, "family");
        t.g(fontStyle, "style");
        this.url = str;
        this.expectedMd5 = str2;
        this.family = str3;
        this.weight = i;
        this.style = fontStyle;
    }

    public static /* synthetic */ DownloadableFontInfo copy$default(DownloadableFontInfo downloadableFontInfo, String str, String str2, String str3, int i, FontStyle fontStyle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = downloadableFontInfo.url;
        }
        if ((i2 & 2) != 0) {
            str2 = downloadableFontInfo.expectedMd5;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = downloadableFontInfo.family;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = downloadableFontInfo.weight;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            fontStyle = downloadableFontInfo.style;
        }
        return downloadableFontInfo.copy(str, str4, str5, i3, fontStyle);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.expectedMd5;
    }

    public final String component3() {
        return this.family;
    }

    public final int component4() {
        return this.weight;
    }

    public final FontStyle component5() {
        return this.style;
    }

    public final DownloadableFontInfo copy(String str, String str2, String str3, int i, FontStyle fontStyle) {
        t.g(str, "url");
        t.g(str2, "expectedMd5");
        t.g(str3, "family");
        t.g(fontStyle, "style");
        return new DownloadableFontInfo(str, str2, str3, i, fontStyle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadableFontInfo)) {
            return false;
        }
        DownloadableFontInfo downloadableFontInfo = (DownloadableFontInfo) obj;
        return t.c(this.url, downloadableFontInfo.url) && t.c(this.expectedMd5, downloadableFontInfo.expectedMd5) && t.c(this.family, downloadableFontInfo.family) && this.weight == downloadableFontInfo.weight && this.style == downloadableFontInfo.style;
    }

    public final /* synthetic */ String getExpectedMd5() {
        return this.expectedMd5;
    }

    public final /* synthetic */ String getFamily() {
        return this.family;
    }

    public final /* synthetic */ FontStyle getStyle() {
        return this.style;
    }

    public final /* synthetic */ String getUrl() {
        return this.url;
    }

    public final /* synthetic */ int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((this.url.hashCode() * 31) + this.expectedMd5.hashCode()) * 31) + this.family.hashCode()) * 31) + Integer.hashCode(this.weight)) * 31) + this.style.hashCode();
    }

    public String toString() {
        return "DownloadableFontInfo(url=" + this.url + ", expectedMd5=" + this.expectedMd5 + ", family=" + this.family + ", weight=" + this.weight + ", style=" + this.style + ')';
    }
}
