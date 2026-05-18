package com.unity3d.ads.core.data.model;

import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebViewConfiguration {
    private final List additionalFiles;
    private final String entryPoint;
    private final String type;
    private final int version;

    public WebViewConfiguration(int i, String entryPoint, List additionalFiles, String type) {
        t.g(entryPoint, "entryPoint");
        t.g(additionalFiles, "additionalFiles");
        t.g(type, "type");
        this.version = i;
        this.entryPoint = entryPoint;
        this.additionalFiles = additionalFiles;
        this.type = type;
    }

    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i, String str, List list, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = webViewConfiguration.version;
        }
        if ((i2 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i2 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        if ((i2 & 8) != 0) {
            str2 = webViewConfiguration.type;
        }
        return webViewConfiguration.copy(i, str, list, str2);
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.entryPoint;
    }

    public final List component3() {
        return this.additionalFiles;
    }

    public final String component4() {
        return this.type;
    }

    public final WebViewConfiguration copy(int i, String entryPoint, List additionalFiles, String type) {
        t.g(entryPoint, "entryPoint");
        t.g(additionalFiles, "additionalFiles");
        t.g(type, "type");
        return new WebViewConfiguration(i, entryPoint, additionalFiles, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewConfiguration)) {
            return false;
        }
        WebViewConfiguration webViewConfiguration = (WebViewConfiguration) obj;
        return this.version == webViewConfiguration.version && t.c(this.entryPoint, webViewConfiguration.entryPoint) && t.c(this.additionalFiles, webViewConfiguration.additionalFiles) && t.c(this.type, webViewConfiguration.type);
    }

    public final List getAdditionalFiles() {
        return this.additionalFiles;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.version) * 31) + this.entryPoint.hashCode()) * 31) + this.additionalFiles.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "WebViewConfiguration(version=" + this.version + ", entryPoint=" + this.entryPoint + ", additionalFiles=" + this.additionalFiles + ", type=" + this.type + ')';
    }
}
