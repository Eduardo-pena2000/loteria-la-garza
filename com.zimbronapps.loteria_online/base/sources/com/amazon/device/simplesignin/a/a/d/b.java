package com.amazon.device.simplesignin.a.a.d;

import android.app.Activity;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b extends c {
    private static final String d = a.class.getSimpleName();
    private static final String e = "SSI_ShowLoginSelection";
    private static final String f = "1.0";

    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b b;

    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a c;
    private final Map g;

    public class 1 implements com.amazon.a.a.n.a {
        final /* synthetic */ Intent a;

        public 1(Intent intent) {
            this.a = intent;
        }

        public void a() {
            try {
                Activity b = b.this.c.b();
                if (b == null) {
                    b = b.this.c.a();
                }
                com.amazon.device.simplesignin.a.d.a.a(b.p(), "ShowLoginSelection activity initiated through startActivity");
                b.startActivity(this.a);
            } catch (Exception e) {
                com.amazon.device.simplesignin.a.d.a.a(b.p(), "Exception when starting show login selection activity: " + e);
            }
        }
    }

    public b(a aVar, Map map) {
        super(aVar, "SSI_ShowLoginSelection", "1.0");
        this.g = map;
    }

    public static /* synthetic */ String p() {
        return d;
    }

    public void a(RequestStatus requestStatus) {
        d dVar = (d) j();
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        showLoginSelectionResponse.setRequestId(dVar.e());
        if (RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) || RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            showLoginSelectionResponse.setRequestStatus(RequestStatus.FAILURE);
        } else {
            showLoginSelectionResponse.setRequestStatus(requestStatus);
            super.a(showLoginSelectionResponse);
        }
    }

    public boolean b(j jVar) throws RemoteException {
        Map b = jVar.b();
        if (!b.containsKey("ssi_showLoginIntent")) {
            a(RequestStatus.FAILURE);
            return false;
        }
        Intent intent = (Intent) b.get("ssi_showLoginIntent");
        if (intent == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        intent.putExtra("ssi_LoginNamesMap", new HashMap(this.g));
        a(intent);
        return true;
    }

    private void a(Intent intent) {
        this.b.b(com.amazon.a.a.n.b.d.a, new 1(intent));
    }
}
