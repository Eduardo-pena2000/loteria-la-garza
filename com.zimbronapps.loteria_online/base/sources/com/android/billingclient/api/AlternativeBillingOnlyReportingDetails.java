package com.android.billingclient.api;

import org.json.JSONObject;

@zzf
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class AlternativeBillingOnlyReportingDetails {
    public final String a;

    public AlternativeBillingOnlyReportingDetails(String str) {
        this.a = new JSONObject(str).optString("externalTransactionToken");
    }

    public String getExternalTransactionToken() {
        return this.a;
    }
}
