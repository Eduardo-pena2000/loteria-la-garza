package com.android.billingclient.api;

import org.json.JSONObject;

@zzi
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class BillingConfig {
    public final String a;

    public BillingConfig(String str) {
        this.a = new JSONObject(str).optString("countryCode");
    }

    public String getCountryCode() {
        return this.a;
    }
}
