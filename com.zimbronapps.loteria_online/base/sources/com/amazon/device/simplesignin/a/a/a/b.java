package com.amazon.device.simplesignin.a.a.a;

import android.os.RemoteException;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b extends c {
    private static final String b = "SSI_GetUserAndLinks";
    private static final String c = "1.0";
    private static final String d = "b";

    public b(a aVar, String str) {
        super(aVar, "SSI_GetUserAndLinks", "1.0");
        super.a("ssi_identityProviderName", str);
    }

    public void a(RequestStatus requestStatus) {
        if (RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) || RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            a(RequestStatus.FAILURE, null, null);
        } else {
            a(requestStatus, null, null);
        }
    }

    public boolean b(j jVar) throws RemoteException {
        Map b2 = jVar.b();
        if (!b2.containsKey("ssi_amazonDirectedId") || !b2.containsKey("ssi_links")) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str = (String) b2.get("ssi_amazonDirectedId");
        String str2 = (String) b2.get("ssi_links");
        if (str == null || str2 == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        List a = com.amazon.device.simplesignin.a.d.b.a(str, str2);
        if (a == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        a(RequestStatus.SUCCESSFUL, str, a);
        return true;
    }

    private void a(RequestStatus requestStatus, String str, List list) {
        d dVar = (d) j();
        GetUserAndLinksResponse getUserAndLinksResponse = new GetUserAndLinksResponse();
        getUserAndLinksResponse.setRequestId(dVar.e());
        getUserAndLinksResponse.setRequestStatus(requestStatus);
        getUserAndLinksResponse.setAmazonUserId(str);
        getUserAndLinksResponse.setLinks(list);
        super.a(getUserAndLinksResponse);
    }
}
