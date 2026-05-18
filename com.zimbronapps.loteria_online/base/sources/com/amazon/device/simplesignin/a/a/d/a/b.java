package com.amazon.device.simplesignin.a.a.d.a;

import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class b extends c {
    private static final String b = "SSI_LoginSelectionResponse";
    private static final String c = "1.0";

    public b(a aVar) {
        super(aVar, "SSI_LoginSelectionResponse", "1.0");
    }

    public void a(RequestStatus requestStatus) {
        if (RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) || RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            a(RequestStatus.FAILURE, null, null);
        } else {
            a(requestStatus, null, null);
        }
    }

    public boolean b(j jVar) throws Exception {
        Map b2 = jVar.b();
        if (!b2.containsKey("ssi_userSelection")) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str = (String) b2.get("ssi_userSelection");
        if (str == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str2 = (String) b2.get("ssi_selectedId");
        ShowLoginSelectionResponse.UserSelection userSelection = ShowLoginSelectionResponse.UserSelection.LoginSelected;
        if (!userSelection.name().equals(str) || str2 == null) {
            a(RequestStatus.SUCCESSFUL, null, ShowLoginSelectionResponse.UserSelection.ManualSignIn);
            return true;
        }
        a(RequestStatus.SUCCESSFUL, str2, userSelection);
        return true;
    }

    private void a(RequestStatus requestStatus, String str, ShowLoginSelectionResponse.UserSelection userSelection) {
        d dVar = (d) j();
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        showLoginSelectionResponse.setRequestId(dVar.e());
        showLoginSelectionResponse.setRequestStatus(requestStatus);
        showLoginSelectionResponse.setUserSelection(userSelection);
        showLoginSelectionResponse.setLinkId(str);
        super.a(showLoginSelectionResponse);
    }
}
