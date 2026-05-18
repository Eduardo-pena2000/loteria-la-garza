package com.unity3d.ads.beta;

import com.unity3d.ads.core.data.model.AdObject;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BannerAd {
    public static final Companion Companion = new Companion(null);
    private final AdObject adObject;
    private final BannerLoadOptions loadOptions;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final void load(BannerLoadOptions options, LoadListener listener) {
            t.g(options, "options");
            t.g(listener, "listener");
        }

        private Companion() {
        }
    }

    public BannerAd(AdObject adObject, BannerLoadOptions loadOptions) {
        t.g(adObject, "adObject");
        t.g(loadOptions, "loadOptions");
        this.adObject = adObject;
        this.loadOptions = loadOptions;
    }

    public static final void load(BannerLoadOptions bannerLoadOptions, LoadListener loadListener) {
        Companion.load(bannerLoadOptions, loadListener);
    }
}
