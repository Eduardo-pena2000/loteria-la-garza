package com.unity3d.ads.beta;

import android.app.Activity;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RewardedAd {
    public static final Companion Companion = new Companion(null);
    private final AdObject adObject;
    private final LoadOptions loadOptions;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final void load(LoadOptions options, LoadListener listener) {
            t.g(options, "options");
            t.g(listener, "listener");
        }

        private Companion() {
        }
    }

    public RewardedAd(AdObject adObject, LoadOptions loadOptions) {
        t.g(adObject, "adObject");
        t.g(loadOptions, "loadOptions");
        this.adObject = adObject;
        this.loadOptions = loadOptions;
    }

    public static final void load(LoadOptions loadOptions, LoadListener loadListener) {
        Companion.load(loadOptions, loadListener);
    }

    public static /* synthetic */ void show$default(RewardedAd rewardedAd, Activity activity, ShowOptions showOptions, RewardedShowListener rewardedShowListener, int i, Object obj) {
        if ((i & 2) != 0) {
            showOptions = null;
        }
        rewardedAd.show(activity, showOptions, rewardedShowListener);
    }

    public final void show(Activity activity, ShowOptions showOptions, RewardedShowListener listener) {
        t.g(activity, "activity");
        t.g(listener, "listener");
    }
}
