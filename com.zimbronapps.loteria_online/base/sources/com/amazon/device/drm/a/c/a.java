package com.amazon.device.drm.a.c;

import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a {
    private RequestId a;
    private LicenseResponse.RequestStatus b;

    public LicenseResponse a() {
        return new LicenseResponse(this);
    }

    public RequestId b() {
        return this.a;
    }

    public LicenseResponse.RequestStatus c() {
        return this.b;
    }

    public a a(RequestId requestId) {
        this.a = requestId;
        return this;
    }

    public a a(LicenseResponse.RequestStatus requestStatus) {
        this.b = requestStatus;
        return this;
    }
}
