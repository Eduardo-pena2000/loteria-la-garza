package com.google.android.gms.auth.api.identity;

import com.google.android.gms.auth.api.identity.ClearTokenRequest;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class a extends ClearTokenRequest.a {
    public String a;
    public String b;

    public a() {
    }

    public final ClearTokenRequest a() {
        if (this.a != null) {
            return new ClearTokenRequest(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: token");
    }

    public final ClearTokenRequest.a b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.a = str;
        return this;
    }

    public final ClearTokenRequest.a c(String str) {
        this.b = str;
        return this;
    }

    public a(ClearTokenRequest clearTokenRequest) {
        this.a = clearTokenRequest.N1();
        this.b = clearTokenRequest.O1();
    }
}
