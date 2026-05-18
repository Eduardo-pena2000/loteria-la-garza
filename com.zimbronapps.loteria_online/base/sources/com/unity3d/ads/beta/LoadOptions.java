package com.unity3d.ads.beta;

import Da.S;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LoadOptions {
    private final String adMarkup;
    private final Map extras;
    private final String placementId;

    public static final class Builder {
        private String adMarkup;
        private final Map extras;
        private final String placementId;

        public Builder(String placementId) {
            t.g(placementId, "placementId");
            this.placementId = placementId;
            this.extras = new LinkedHashMap();
        }

        public final LoadOptions build() {
            return new LoadOptions(this.placementId, this.adMarkup, this.extras);
        }

        public final Builder withAdMarkup(String adMarkup) {
            t.g(adMarkup, "adMarkup");
            this.adMarkup = adMarkup;
            return this;
        }

        public final Builder withExtras(Map extras) {
            t.g(extras, "extras");
            this.extras.putAll(extras);
            return this;
        }
    }

    public LoadOptions(String placementId, String str, Map extras) {
        t.g(placementId, "placementId");
        t.g(extras, "extras");
        this.placementId = placementId;
        this.adMarkup = str;
        this.extras = extras;
    }

    public final String getAdMarkup() {
        return this.adMarkup;
    }

    public final Map getExtras() {
        return this.extras;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public /* synthetic */ LoadOptions(String str, String str2, Map map, int i, k kVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? S.h() : map);
    }
}
