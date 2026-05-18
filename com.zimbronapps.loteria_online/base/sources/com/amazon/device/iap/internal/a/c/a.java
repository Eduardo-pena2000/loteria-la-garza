package com.amazon.device.iap.internal.a.c;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import com.amazon.device.iap.model.UserDataResponse;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a extends com.amazon.device.iap.internal.a.c {
    public a(RequestId requestId, UserDataRequest userDataRequest) {
        super(requestId);
        d dVar = new d(this, userDataRequest);
        dVar.b(new c(this));
        a((h) dVar);
    }

    public void b() {
        a((UserDataResponse) a().b());
    }

    public void c() {
        UserDataResponse userDataResponse = (UserDataResponse) a().b();
        if (userDataResponse == null) {
            userDataResponse = new UserDataResponseBuilder().setRequestId(d()).setRequestStatus(UserDataResponse.RequestStatus.FAILED).build();
        }
        a(userDataResponse);
    }
}
