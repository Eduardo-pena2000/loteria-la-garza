package com.revenuecat.purchases.common;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PlatformInfo {
    private final String flavor;
    private final String version;

    public PlatformInfo(String str, String str2) {
        t.g(str, "flavor");
        this.flavor = str;
        this.version = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformInfo)) {
            return false;
        }
        PlatformInfo platformInfo = (PlatformInfo) obj;
        return t.c(this.flavor, platformInfo.flavor) && t.c(this.version, platformInfo.version);
    }

    public final String getFlavor() {
        return this.flavor;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = this.flavor.hashCode() * 31;
        String str = this.version;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PlatformInfo(flavor=" + this.flavor + ", version=" + this.version + ')';
    }
}
