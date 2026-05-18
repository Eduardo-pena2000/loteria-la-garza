package com.android.billingclient.api;

import org.json.JSONObject;

@zzh
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class ExternalOfferReportingDetails {
    public final String a;

    public ExternalOfferReportingDetails(String str) {
        this.a = new JSONObject(str).optString("externalTransactionToken");
    }

    public String getExternalTransactionToken() {
        return this.a;
    }
}
