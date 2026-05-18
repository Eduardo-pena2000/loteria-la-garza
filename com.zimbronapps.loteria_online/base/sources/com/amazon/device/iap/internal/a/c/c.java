package com.amazon.device.iap.internal.a.c;

import android.os.RemoteException;
import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c extends b {
    private static final String d = "c";

    public c(com.amazon.device.iap.internal.a.c cVar) {
        super(cVar, "1.0");
    }

    public boolean b(j jVar) throws RemoteException, com.amazon.a.a.d.b {
        String str = d;
        com.amazon.device.iap.internal.util.b.a(str, "onSuccessInternal: result = " + jVar);
        Map b = jVar.b();
        com.amazon.device.iap.internal.util.b.a(str, "data: " + b);
        String str2 = (String) b.get("userId");
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        if (f.a(str2)) {
            cVar.a().a(new UserDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(UserDataResponse.RequestStatus.FAILED).build());
            return false;
        }
        UserData build = new UserDataBuilder().setUserId(str2).setMarketplace(b.c).build();
        UserDataResponse build2 = new UserDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(UserDataResponse.RequestStatus.SUCCESSFUL).setUserData(build).build();
        cVar.a().a("userId", build.getUserId());
        cVar.a().a(build2);
        return true;
    }
}
