package com.amazon.device.iap.internal.b;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
class c {
    private static final String a = "KEY_TIMESTAMP";
    private static final String b = "KEY_REQUEST_ID";
    private static final String c = "KEY_USER_ID";
    private static final String d = "KEY_RECEIPT_STRING";
    private final String e;
    private final String f;
    private final long g;
    private final String h;

    public c(String str, String str2, String str3, long j) {
        this.e = str;
        this.f = str2;
        this.h = str3;
        this.g = j;
    }

    public String a() {
        return this.e;
    }

    public String b() {
        return this.h;
    }

    public String c() {
        return this.f;
    }

    public long d() {
        return this.g;
    }

    public String e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("KEY_USER_ID", this.e);
        jSONObject.put("KEY_RECEIPT_STRING", this.f);
        jSONObject.put("KEY_REQUEST_ID", this.h);
        jSONObject.put("KEY_TIMESTAMP", this.g);
        return jSONObject.toString();
    }

    public static c a(String str) throws b {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString("KEY_USER_ID"), jSONObject.getString("KEY_RECEIPT_STRING"), jSONObject.getString("KEY_REQUEST_ID"), jSONObject.getLong("KEY_TIMESTAMP"));
        } catch (Throwable th) {
            throw new b("Input invalid for PendingReceipt Object:" + str, th);
        }
    }
}
