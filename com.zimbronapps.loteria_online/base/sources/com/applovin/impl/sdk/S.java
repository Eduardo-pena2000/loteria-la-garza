package com.applovin.impl.sdk;

import com.applovin.impl.sdk.d;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class s implements d.a {
    public final /* synthetic */ AppLovinAdServiceImpl a;
    public final /* synthetic */ AppLovinAdLoadListener b;
    public final /* synthetic */ JSONObject c;
    public final /* synthetic */ com.applovin.impl.u d;

    public /* synthetic */ s(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinAdLoadListener appLovinAdLoadListener, JSONObject jSONObject, com.applovin.impl.u uVar) {
        this.a = appLovinAdServiceImpl;
        this.b = appLovinAdLoadListener;
        this.c = jSONObject;
        this.d = uVar;
    }

    public final void a(com.applovin.impl.sdk.ad.b bVar) {
        AppLovinAdServiceImpl.a(this.a, this.b, this.c, this.d, bVar);
    }
}
