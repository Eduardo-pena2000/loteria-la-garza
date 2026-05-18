package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.k7;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.R;

@SuppressLint({"ViewConstructor"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinOptionsView extends FrameLayout implements View.OnClickListener {
    private final AppLovinNativeAdImpl nativeAd;
    private final Uri privacyDestinationUri;
    private final com.applovin.impl.sdk.k sdk;

    public AppLovinOptionsView(AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.k kVar, Context context) {
        super(context);
        this.nativeAd = appLovinNativeAdImpl;
        this.sdk = kVar;
        this.privacyDestinationUri = appLovinNativeAdImpl.getPrivacyDestinationUri();
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Uri privacyIconUri = appLovinNativeAdImpl.getPrivacyIconUri();
        if (privacyIconUri != null) {
            ImageViewUtils.setImageUri(imageView, privacyIconUri, kVar);
        } else {
            imageView.setImageResource(R.drawable.applovin_ic_privacy_icon_layered_list);
        }
        addView(imageView);
        setOnClickListener(this);
    }

    public void destroy() {
        setOnClickListener((View.OnClickListener) null);
        removeAllViews();
    }

    public void onClick(View view) {
        if (this.nativeAd.isCustomTabsEnabled()) {
            this.sdk.z().a(this.privacyDestinationUri, this.nativeAd, this.sdk.u0());
        } else {
            k7.a(this.privacyDestinationUri, com.applovin.impl.sdk.k.o(), this.sdk);
        }
    }
}
