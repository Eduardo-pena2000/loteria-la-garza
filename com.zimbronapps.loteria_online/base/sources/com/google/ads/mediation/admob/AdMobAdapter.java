package com.google.ads.mediation.admob;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.ads.mediation.AbstractAdViewAdapter;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class AdMobAdapter extends AbstractAdViewAdapter {
    static final String AD_JSON_PARAMETER = "adJson";
    static final String AD_PARAMETER = "_ad";
    static final String HOUSE_ADS_PARAMETER = "mad_hac";
    public static final String NEW_BUNDLE = "_newBundle";

    public Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle.getBoolean("_newBundle")) {
            bundle = new Bundle(bundle);
        }
        bundle.putInt("gw", 1);
        bundle.putString("mad_hac", bundle2.getString("mad_hac"));
        if (!TextUtils.isEmpty(bundle2.getString("adJson"))) {
            bundle.putString("_ad", bundle2.getString("adJson"));
        }
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}
