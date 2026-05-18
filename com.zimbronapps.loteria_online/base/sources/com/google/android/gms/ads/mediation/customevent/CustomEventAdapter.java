package com.google.android.gms.ads.mediation.customevent;

import L5.b;
import L5.h;
import W5.p;
import Y5.A;
import Y5.f;
import Y5.n;
import Y5.t;
import Y5.v;
import Z5.e;
import Z5.g;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final b e = new b(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");
    public View a;
    public CustomEventBanner b;
    public CustomEventInterstitial c;
    public CustomEventNative d;

    public static Object a(Class cls, String str) {
        try {
            if (str != null) {
                return cls.cast(Class.forName(str).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
            }
            throw null;
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            p.f(sb.toString());
            return null;
        }
    }

    public View getBannerView() {
        return this.a;
    }

    public void onDestroy() {
        CustomEventBanner customEventBanner = this.b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    public void onPause() {
        CustomEventBanner customEventBanner = this.b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    public void onResume() {
        CustomEventBanner customEventBanner = this.b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    public void requestBannerAd(Context context, n nVar, Bundle bundle, h hVar, f fVar, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) a(CustomEventBanner.class, bundle.getString("class_name"));
        this.b = customEventBanner;
        if (customEventBanner == null) {
            nVar.onAdFailedToLoad(this, e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventBanner customEventBanner2 = this.b;
        customEventBanner2.getClass();
        customEventBanner2.requestBannerAd(context, new e(this, nVar), bundle.getString("parameter"), hVar, fVar, bundle3);
    }

    public void requestInterstitialAd(Context context, t tVar, Bundle bundle, f fVar, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.c = customEventInterstitial;
        if (customEventInterstitial == null) {
            tVar.onAdFailedToLoad(this, e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventInterstitial customEventInterstitial2 = this.c;
        customEventInterstitial2.getClass();
        customEventInterstitial2.requestInterstitialAd(context, new Z5.f(this, this, tVar), bundle.getString("parameter"), fVar, bundle3);
    }

    public void requestNativeAd(Context context, v vVar, Bundle bundle, A a, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) a(CustomEventNative.class, bundle.getString("class_name"));
        this.d = customEventNative;
        if (customEventNative == null) {
            vVar.onAdFailedToLoad(this, e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventNative customEventNative2 = this.d;
        customEventNative2.getClass();
        customEventNative2.requestNativeAd(context, new g(this, vVar), bundle.getString("parameter"), a, bundle3);
    }

    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
