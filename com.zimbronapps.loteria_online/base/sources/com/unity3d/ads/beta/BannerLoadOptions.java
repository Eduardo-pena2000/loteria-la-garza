package com.unity3d.ads.beta;

import Ca.q;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BannerLoadOptions {
    private final String adMarkup;
    private final q bannerSize;
    private final Map extras;
    private final BannerShowListener listener;
    private final String placementId;

    public static final class Builder {
        private String adMarkup;
        private final q bannerSize;
        private Map extras;
        private BannerShowListener listener;
        private final String placementId;

        public Builder(String placementId, q bannerSize) {
            t.g(placementId, "placementId");
            t.g(bannerSize, "bannerSize");
            this.placementId = placementId;
            this.bannerSize = bannerSize;
        }

        public final BannerLoadOptions build() {
            return new BannerLoadOptions(this.placementId, this.bannerSize, this.adMarkup, this.extras, this.listener);
        }

        public final Builder withAdMarkup(String adMarkup) {
            t.g(adMarkup, "adMarkup");
            this.adMarkup = adMarkup;
            return this;
        }

        public final Builder withExtras(Map extras) {
            t.g(extras, "extras");
            this.extras = extras;
            return this;
        }

        public final Builder withListener(BannerShowListener listener) {
            t.g(listener, "listener");
            this.listener = listener;
            return this;
        }
    }

    public BannerLoadOptions(String placementId, q bannerSize, String str, Map map, BannerShowListener bannerShowListener) {
        t.g(placementId, "placementId");
        t.g(bannerSize, "bannerSize");
        this.placementId = placementId;
        this.bannerSize = bannerSize;
        this.adMarkup = str;
        this.extras = map;
        this.listener = bannerShowListener;
    }

    public final String getAdMarkup() {
        return this.adMarkup;
    }

    public final q getBannerSize() {
        return this.bannerSize;
    }

    public final Map getExtras() {
        return this.extras;
    }

    public final BannerShowListener getListener() {
        return this.listener;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public /* synthetic */ BannerLoadOptions(String str, q qVar, String str2, Map map, BannerShowListener bannerShowListener, int i, k kVar) {
        this(str, qVar, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : bannerShowListener);
    }
}
