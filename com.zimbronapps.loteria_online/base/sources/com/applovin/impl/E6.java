package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class e6 extends i5 implements m2 {
    private final JSONObject g;
    private final u h;
    private final AppLovinAdLoadListener i;
    private final boolean j;

    public e6(JSONObject jSONObject, u uVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(jSONObject, uVar, false, appLovinAdLoadListener, kVar);
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", "undefined");
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Starting task for AppLovin ad...");
            }
            this.a.q0().a(new j6(jSONObject, this.g, this, this.a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Starting task for VAST ad...");
            }
            this.a.q0().a(h6.a(jSONObject, this.g, this, this.a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b(this.b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(-800, "Unknown ad type: " + string));
    }

    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.i;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.j || !(appLovinAd instanceof com.applovin.impl.sdk.ad.b)) {
            return;
        }
        this.a.g().a(d2.A, (com.applovin.impl.sdk.ad.b) appLovinAd);
    }

    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new AppLovinError(i, ""));
    }

    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.i;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof m2) {
            ((m2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.j) {
            return;
        }
        this.a.g().a(d2.B, this.h, appLovinError);
    }

    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.g, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.k(this.b, "No ads were returned from the server");
            }
            n7.a(this.h.e(), this.h.d(), this.g, this.a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }

    public e6(JSONObject jSONObject, u uVar, boolean z, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessAdResponse", kVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.g = jSONObject;
        this.h = uVar;
        this.i = appLovinAdLoadListener;
        this.j = z;
    }
}
