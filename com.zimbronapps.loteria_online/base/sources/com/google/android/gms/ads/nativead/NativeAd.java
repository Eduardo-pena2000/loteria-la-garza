package com.google.android.gms.ads.nativead;

import L5.t;
import L5.z;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class NativeAd {

    public static abstract class a {
    }

    public static abstract class b {
        protected Map zza;

        public abstract Drawable getDrawable();
    }

    public interface c {
        void onNativeAdLoaded(NativeAd nativeAd);
    }

    public interface d {
    }

    public abstract void destroy();

    public abstract String getAdvertiser();

    public abstract String getBody();

    public abstract String getCallToAction();

    public abstract String getHeadline();

    public abstract b getIcon();

    public abstract z getResponseInfo();

    public abstract Double getStarRating();

    public abstract String getStore();

    public abstract void recordEvent(Bundle bundle);

    public abstract void setOnPaidEventListener(t tVar);

    public abstract Object zza();
}
