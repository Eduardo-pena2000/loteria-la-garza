package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkConfiguration;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class k0 {
    private final AppLovinSdkConfiguration.ConsentFlowUserGeography a;

    public k0(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.a = consentFlowUserGeography;
    }

    public boolean a(Object obj) {
        return obj instanceof k0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (!k0Var.a(this)) {
            return false;
        }
        AppLovinSdkConfiguration.ConsentFlowUserGeography a = a();
        AppLovinSdkConfiguration.ConsentFlowUserGeography a2 = k0Var.a();
        return a != null ? a.equals(a2) : a2 == null;
    }

    public int hashCode() {
        AppLovinSdkConfiguration.ConsentFlowUserGeography a = a();
        return (a == null ? 43 : a.hashCode()) + 59;
    }

    public String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + a() + ")";
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography a() {
        return this.a;
    }
}
