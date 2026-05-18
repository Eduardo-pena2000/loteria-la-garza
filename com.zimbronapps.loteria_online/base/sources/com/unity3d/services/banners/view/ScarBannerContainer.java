package com.unity3d.services.banners.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.Utilities;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ScarBannerContainer extends RelativeLayout {
    private String _bannerAdId;

    public ScarBannerContainer(Context context, String str) {
        super(context);
        this._bannerAdId = str;
    }

    public static /* synthetic */ void a(ScarBannerContainer scarBannerContainer) {
        lambda$destroy$0(scarBannerContainer);
    }

    private static /* synthetic */ void lambda$destroy$0(ScarBannerContainer scarBannerContainer) {
        scarBannerContainer.removeAllViews();
        ViewGroup parent = scarBannerContainer.getParent();
        if (parent instanceof ViewGroup) {
            parent.removeView(scarBannerContainer);
        }
    }

    public void destroy() {
        Utilities.runOnUiThread(new a(this));
    }

    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        BannerBridge.didAttachScarBanner(this._bannerAdId);
    }

    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        BannerBridge.didDetachScarBanner(this._bannerAdId);
    }
}
