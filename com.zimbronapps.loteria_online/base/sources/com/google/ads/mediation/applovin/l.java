package com.google.ads.mediation.applovin;

import Y5.w;
import Y5.y;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.google.ads.mediation.applovin.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class l extends f implements w {
    public static final HashMap c = new HashMap();
    public String a;
    public boolean b;

    public class a implements d.b {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ Context b;

        public a(Bundle bundle, Context context) {
            this.a = bundle;
            this.b = context;
        }

        public void onInitializeSuccess() {
            l.b(l.this, AppLovinUtils.retrieveZoneId(this.a));
            l lVar = l.this;
            lVar.appLovinSdk = lVar.appLovinInitializer.c(this.b);
            String format = String.format("Requesting rewarded video for zone '%s'", new Object[]{l.a(l.this)});
            String str = f.TAG;
            Log.d(str, format);
            HashMap hashMap = l.c;
            if (hashMap.containsKey(l.a(l.this))) {
                L5.b bVar = new L5.b(105, "Cannot load multiple rewarded ads with the same Zone ID. Let the first ad finish loading before attempting to load another.", "com.google.ads.mediation.applovin");
                Log.e(str, bVar.toString());
                l.this.adLoadCallback.onFailure(bVar);
                return;
            }
            hashMap.put(l.a(l.this), new WeakReference(l.this));
            if (Objects.equals(l.a(l.this), "")) {
                l lVar2 = l.this;
                lVar2.incentivizedInterstitial = lVar2.appLovinAdFactory.b(lVar2.appLovinSdk);
            } else {
                l lVar3 = l.this;
                lVar3.incentivizedInterstitial = lVar3.appLovinAdFactory.c(l.a(lVar3), l.this.appLovinSdk);
            }
            l lVar4 = l.this;
            lVar4.incentivizedInterstitial.preload(lVar4);
        }
    }

    public l(Y5.e eVar, d dVar, com.google.ads.mediation.applovin.a aVar, g gVar) {
        super(eVar, dVar, aVar, gVar);
        this.b = false;
    }

    public static /* bridge */ /* synthetic */ String a(l lVar) {
        return lVar.a;
    }

    public static /* bridge */ /* synthetic */ void b(l lVar, String str) {
        lVar.a = str;
    }

    public void adHidden(AppLovinAd appLovinAd) {
        c.remove(this.a);
        super.adHidden(appLovinAd);
    }

    public void adReceived(AppLovinAd appLovinAd) {
        if (this.b) {
            c.remove(this.a);
        }
        super.adReceived(appLovinAd);
    }

    public void failedToReceiveAd(int i) {
        c.remove(this.a);
        super.failedToReceiveAd(i);
    }

    public void loadAd(y yVar) {
        Context b = yVar.b();
        Bundle d = yVar.d();
        String string = d.getString("sdkKey");
        if (TextUtils.isEmpty(string)) {
            L5.b bVar = new L5.b(110, "Missing or invalid SDK Key.", "com.applovin.sdk");
            Log.e(f.TAG, bVar.toString());
            this.adLoadCallback.onFailure(bVar);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled()) {
                this.b = true;
            }
            this.networkExtras = yVar.c();
            this.appLovinInitializer.b(b, string, new a(d, b));
        }
    }

    public void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        String str = this.a;
        if (str != null) {
            Log.d(f.TAG, String.format("Showing rewarded video for zone '%s'", new Object[]{str}));
        }
        if (this.incentivizedInterstitial.isAdReadyToDisplay()) {
            this.incentivizedInterstitial.show(context, this, this, this, this);
            return;
        }
        L5.b bVar = new L5.b(106, "Ad not ready to show.", "com.google.ads.mediation.applovin");
        Log.e(f.TAG, bVar.toString());
        this.rewardedAdCallback.onAdFailedToShow(bVar);
    }
}
