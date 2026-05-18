package com.amazon.device.simplesignin.a.a.b;

import android.app.Activity;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.a.a.n.b.d;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b extends c {
    private static final String d = "SSI_LinkUserAccount";
    private static final String e = "1.0";
    private static final String f = "b";

    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b b;

    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a c;

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
                com.amazon.device.simplesignin.a.d.a.a(b.p(), "Consent activity is about to start: " + b);
                b.startActivity(this.a);
            } catch (Exception e) {
                com.amazon.device.simplesignin.a.d.a.a(b.p(), "Exception when starting consent activity: " + e);
            }
        }
    }

    public b(a aVar, LinkUserAccountRequest linkUserAccountRequest) {
        super(aVar, "SSI_LinkUserAccount", "1.0");
        super.a("ssi_partnerUserId", linkUserAccountRequest.getPartnerUserId());
        super.a("ssi_identityProviderName", linkUserAccountRequest.getIdentityProviderName());
        super.a("ssi_userLoginName", linkUserAccountRequest.getUserLoginName());
        super.a("ssi_accountLinkType", "AMAZON_MANAGED");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", linkUserAccountRequest.getLinkToken().getToken());
            jSONObject.put("schema", linkUserAccountRequest.getLinkToken().getSchema());
            super.a("ssi_linkToken", jSONObject.toString());
            super.a("ssi_linkSigningKey", linkUserAccountRequest.getLinkSigningKey());
        } catch (JSONException e2) {
            com.amazon.device.simplesignin.a.d.a.b(f, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e2);
        }
    }

    private void a(Intent intent) {
        this.b.b(d.a, new 1(intent));
    }

    public static /* synthetic */ String p() {
        return f;
    }

    public boolean b(j jVar) throws RemoteException {
        Map b = jVar.b();
        if (!b.containsKey("ssi_consentIntent") || b.get("ssi_consentIntent") == null) {
            return super.a(b);
        }
        a((Intent) b.get("ssi_consentIntent"));
        return true;
    }
}
