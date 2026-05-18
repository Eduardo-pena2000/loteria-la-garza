package com.amazon.device.iap.internal.a.c;

import android.os.RemoteException;
import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataRequest;
import com.amazon.device.iap.model.UserDataResponse;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d extends b {
    private static final String d = "d";

    public d(com.amazon.device.iap.internal.a.c cVar, UserDataRequest userDataRequest) {
        super(cVar, "2.0");
        if (userDataRequest != null) {
            a("UserDataRequest.fetchLWAConsentStatus", Boolean.valueOf(userDataRequest.getFetchLWAConsentStatus()));
        }
    }

    public boolean b(j jVar) throws RemoteException, com.amazon.a.a.d.b {
        String str = d;
        com.amazon.device.iap.internal.util.b.a(str, "onResult: result = " + jVar);
        Map b = jVar.b();
        com.amazon.device.iap.internal.util.b.a(str, "data: " + b);
        String str2 = (String) b.get("userId");
        String str3 = (String) b.get("marketplace");
        String str4 = (String) b.get("UserDataResponse.LWAConsentStatus");
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        if (f.a(str2) || f.a(str3)) {
            cVar.a().a(new UserDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(UserDataResponse.RequestStatus.FAILED).build());
            return false;
        }
        UserData build = new UserDataBuilder().setUserId(str2).setMarketplace(str3).setLWAConsentStatus(str4).build();
        UserDataResponse build2 = new UserDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(UserDataResponse.RequestStatus.SUCCESSFUL).setUserData(build).build();
        cVar.a().a("userId", build.getUserId());
        cVar.a().a(build2);
        return true;
    }
}
