package com.amazon.device.simplesignin.a.a.b;

import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class c extends com.amazon.device.simplesignin.a.a.c {
    public c(d dVar, String str, String str2) {
        super(dVar, str, str2);
    }

    public void a(RequestStatus requestStatus) {
        a(requestStatus, null, null);
    }

    public void a(RequestStatus requestStatus, String str, LinkUserAccountResponse.SuccessCode successCode) {
        d dVar = (d) j();
        LinkUserAccountResponse linkUserAccountResponse = new LinkUserAccountResponse();
        linkUserAccountResponse.setRequestId(dVar.e());
        linkUserAccountResponse.setRequestStatus(requestStatus);
        linkUserAccountResponse.setLinkId(str);
        linkUserAccountResponse.setSuccessCode(successCode);
        super.a(linkUserAccountResponse);
    }

    public boolean a(Map map) {
        if (!map.containsKey("ssi_successCode")) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str = (String) map.get("ssi_successCode");
        if (str == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str2 = (!map.containsKey("ssi_linkId") || map.get("ssi_linkId") == null) ? null : (String) map.get("ssi_linkId");
        if (map.containsKey("ssi_link") && map.get("ssi_link") != null) {
            str2 = com.amazon.device.simplesignin.a.d.b.a((String) map.get("ssi_link"));
        }
        a(RequestStatus.SUCCESSFUL, str2, LinkUserAccountResponse.SuccessCode.valueOf(str));
        return true;
    }
}
