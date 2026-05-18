package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.properties.FontStyle;
import java.io.File;
import kotlin.jvm.internal.t;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DownloadedFont {
    private final File file;
    private final FontStyle style;
    private final int weight;

    public DownloadedFont(int i, FontStyle fontStyle, File file) {
        t.g(fontStyle, "style");
        t.g(file, "file");
        this.weight = i;
        this.style = fontStyle;
        this.file = file;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadedFont)) {
            return false;
        }
        DownloadedFont downloadedFont = (DownloadedFont) obj;
        return this.weight == downloadedFont.weight && this.style == downloadedFont.style && t.c(this.file, downloadedFont.file);
    }

    public final /* synthetic */ File getFile() {
        return this.file;
    }

    public final /* synthetic */ FontStyle getStyle() {
        return this.style;
    }

    public final /* synthetic */ int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((this.weight * 31) + this.style.hashCode()) * 31) + this.file.hashCode();
    }

    public String toString() {
        return "DownloadedFont(weight=" + this.weight + ", style=" + this.style + ", file=" + this.file + ')';
    }
}
