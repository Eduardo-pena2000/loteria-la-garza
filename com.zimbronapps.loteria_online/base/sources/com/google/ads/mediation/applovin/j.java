package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAppOpenAd;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j implements Y5.h, MaxAdListener {
    public final Y5.e a;
    public final d b;
    public final a c;
    public MaxAppOpenAd d;
    public Y5.i e;

    public j(Y5.e eVar, d dVar, a aVar) {
        t.g(eVar, "loadCallback");
        t.g(dVar, "appLovinInitializer");
        t.g(aVar, "appLovinAdFactory");
        this.a = eVar;
        this.b = dVar;
        this.c = aVar;
    }

    public static /* synthetic */ void a(j jVar, String str) {
        c(jVar, str);
    }

    public static final void c(j jVar, String str) {
        MaxAppOpenAd e = jVar.c.e(str);
        jVar.d = e;
        if (e != null) {
            e.setListener(jVar);
        }
        MaxAppOpenAd maxAppOpenAd = jVar.d;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.loadAd();
        }
    }

    public final void b(Y5.j jVar) {
        t.g(jVar, "appOpenAdConfiguration");
        Bundle d = jVar.d();
        t.f(d, "getServerParameters(...)");
        String string = d.getString("sdkKey");
        if (string == null || string.length() == 0) {
            this.a.onFailure(new L5.b(110, "Missing or invalid SDK Key.", "com.google.ads.mediation.applovin"));
            return;
        }
        String string2 = d.getString("ad_unit_id");
        if (string2 != null && string2.length() != 0) {
            this.b.b(jVar.b(), string, new i(this, string2));
        } else {
            this.a.onFailure(new L5.b(113, "Ad Unit ID is missing.", "com.google.ads.mediation.applovin"));
        }
    }

    public void onAdClicked(MaxAd maxAd) {
        t.g(maxAd, "ad");
        Y5.i iVar = this.e;
        if (iVar != null) {
            iVar.reportAdClicked();
        }
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        t.g(maxAd, "ad");
        t.g(maxError, "appLovinError");
        Y5.i iVar = this.e;
        if (iVar != null) {
            iVar.onAdFailedToShow(new L5.b(maxError.getCode(), maxError.getMessage(), "com.applovin.sdk"));
        }
    }

    public void onAdDisplayed(MaxAd maxAd) {
        t.g(maxAd, "ad");
        Y5.i iVar = this.e;
        if (iVar != null) {
            iVar.onAdOpened();
        }
        Y5.i iVar2 = this.e;
        if (iVar2 != null) {
            iVar2.reportAdImpression();
        }
    }

    public void onAdHidden(MaxAd maxAd) {
        t.g(maxAd, "ad");
        Y5.i iVar = this.e;
        if (iVar != null) {
            iVar.onAdClosed();
        }
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        t.g(str, "p0");
        t.g(maxError, "appLovinError");
        this.a.onFailure(new L5.b(maxError.getCode(), maxError.getMessage(), "com.applovin.sdk"));
    }

    public void onAdLoaded(MaxAd maxAd) {
        t.g(maxAd, "ad");
        this.e = (Y5.i) this.a.onSuccess(this);
    }

    public void showAd(Context context) {
        t.g(context, "context");
        MaxAppOpenAd maxAppOpenAd = this.d;
        if (maxAppOpenAd != null) {
            if (maxAppOpenAd == null || !maxAppOpenAd.isReady()) {
                Y5.i iVar = this.e;
                if (iVar != null) {
                    iVar.onAdFailedToShow(new L5.b(106, "Ad is not ready to be displayed", "com.google.ads.mediation.applovin"));
                    return;
                }
                return;
            }
            MaxAppOpenAd maxAppOpenAd2 = this.d;
            if (maxAppOpenAd2 != null) {
                maxAppOpenAd2.showAd();
            }
        }
    }
}
