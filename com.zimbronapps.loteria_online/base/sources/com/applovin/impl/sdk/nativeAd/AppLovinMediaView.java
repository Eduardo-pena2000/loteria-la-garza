package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.R;

@SuppressLint({"ViewConstructor"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinMediaView extends FrameLayout {
    protected final ImageView imageView;
    protected final com.applovin.impl.sdk.o logger;
    protected final AppLovinNativeAdImpl nativeAd;
    protected final com.applovin.impl.sdk.k sdk;

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.k kVar, Context context) {
        super(context);
        setBackgroundColor(-16777216);
        this.nativeAd = appLovinNativeAdImpl;
        this.sdk = kVar;
        this.logger = kVar.O();
        LayoutInflater.from(context).inflate(R.layout.applovin_native_ad_media_view, this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        o7 vastAd = appLovinNativeAdImpl.getVastAd();
        Uri l0 = vastAd != null ? vastAd.l0() : null;
        if (mainImageUri == null && l0 == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) kVar.a(x4.F2)).booleanValue()) {
            setOnTouchListener(new AppLovinTouchToClickListener(kVar, x4.g0, context, appLovinNativeAdImpl));
        } else {
            setOnClickListener(appLovinNativeAdImpl);
        }
        ImageView findViewById = findViewById(R.id.image_view);
        this.imageView = findViewById;
        if (mainImageUri != null) {
            ImageViewUtils.setAndDownscaleImageUri(findViewById, mainImageUri);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener((View.OnClickListener) null);
        setOnTouchListener((View.OnTouchListener) null);
        removeAllViews();
    }
}
