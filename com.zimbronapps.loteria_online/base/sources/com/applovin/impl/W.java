package com.applovin.impl;

import android.content.Context;
import com.amazon.aps.ads.Aps;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class w implements DTBAdCallback {
    private final MaxAdFormat a;
    private final a b;
    private DTBAdRequest c;

    public interface a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public w(x xVar, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this(Arrays.asList(new DTBAdSize[]{xVar.a()}), maxAdFormat, context, aVar);
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.c;
        if (dTBAdRequest == null) {
            this.b.onAdLoadFailed(null, this.a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.b.onAdLoadFailed(adError, this.a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.b.onAdResponseLoaded(dTBAdResponse, this.a);
    }

    public w(List list, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this.a = maxAdFormat;
        this.b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i = 0; i < list.size(); i++) {
                Object obj = list.get(i);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i] = (DTBAdSize) obj;
                }
            }
            if (n7.a(Aps.getSdkVersion(), "10.0.0") >= 0) {
                Class cls = Class.forName("com.amazon.aps.ads.model.ApsAdNetwork");
                Class cls2 = Class.forName("com.amazon.device.ads.DTBAdNetworkInfo");
                this.c = (DTBAdRequest) DTBAdRequest.class.getConstructor(new Class[]{Context.class, cls2}).newInstance(new Object[]{context.getApplicationContext(), cls2.getConstructor(new Class[]{cls}).newInstance(new Object[]{cls.getField("MAX").get((Object) null)})});
            } else {
                this.c = (DTBAdRequest) DTBAdRequest.class.getConstructor((Class[]) null).newInstance((Object[]) null);
            }
            this.c.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }
}
