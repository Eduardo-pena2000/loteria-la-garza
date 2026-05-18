package com.amazon.device.simplesignin.a;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.amazon.a.a.o.f;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.SSIEvent;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c {
    private static String a = "c";
    private static final c b = new c();
    private static final IllegalStateException c = new IllegalStateException(String.format("%s. %s", new Object[]{"Simple Sign-In SDK not initialized", "To initialize and register responseHandler, call SimpleSignInService.registerResponseHandler()"}));
    private Context d;
    private ISimpleSignInResponseHandler e;
    private b f;

    private c() {
    }

    public static c a() {
        return b;
    }

    private boolean f() {
        return this.d != null;
    }

    private void g() {
        if (f()) {
            return;
        }
        com.amazon.device.simplesignin.a.d.a.b(a, "Simple Sign-In SDK not initialized.");
        throw c;
    }

    public String b() {
        if (f()) {
            return a.a().b(this.d) ? com.amazon.device.simplesignin.a.b.a.SANDBOX.name() : com.amazon.device.simplesignin.a.b.a.PRODUCTION.name();
        }
        com.amazon.device.simplesignin.a.d.a.b(a, "Application context not initialized, SDK mode is unknown.");
        return com.amazon.device.simplesignin.a.b.a.UNKNOWN.name();
    }

    public Context c() {
        return this.d;
    }

    public ISimpleSignInResponseHandler d() {
        return this.e;
    }

    public b e() {
        return this.f;
    }

    public void a(Context context, ISimpleSignInResponseHandler iSimpleSignInResponseHandler) {
        com.amazon.a.a.a(context.getApplicationContext());
        this.d = context;
        this.e = iSimpleSignInResponseHandler;
        this.f = a.a().a(context);
    }

    public RequestId a(String str) {
        g();
        f.a(str, "identityProviderName");
        RequestId requestId = new RequestId();
        this.f.a(requestId, str);
        return requestId;
    }

    private void b(LinkUserAccountRequest linkUserAccountRequest) {
        f.a(linkUserAccountRequest.getPartnerUserId(), "partnerUserId");
        f.a(linkUserAccountRequest.getIdentityProviderName(), "identityProviderName");
        f.a(linkUserAccountRequest.getLinkToken(), "linkToken");
        f.a(linkUserAccountRequest.getLinkToken().getToken(), "linkToken.token");
        f.a(linkUserAccountRequest.getLinkToken().getSchema(), "linkToken.schema");
        f.a(linkUserAccountRequest.getUserLoginName(), "userLoginName");
        f.a(linkUserAccountRequest.getLinkSigningKey(), "linkSigningKey");
    }

    public RequestId a(LinkUserAccountRequest linkUserAccountRequest) {
        g();
        b(linkUserAccountRequest);
        RequestId requestId = new RequestId();
        this.f.a(requestId, linkUserAccountRequest);
        return requestId;
    }

    public RequestId a(Map map) {
        g();
        if (!map.isEmpty()) {
            RequestId requestId = new RequestId();
            this.f.a(requestId, map);
            return requestId;
        }
        throw new IllegalArgumentException("loginNames must not be empty");
    }

    public RequestId a(SSIEventRequest sSIEventRequest) {
        g();
        if (sSIEventRequest.getEvent().equals(SSIEvent.LOGIN_FAILURE) && sSIEventRequest.getFailureReason() == null) {
            throw new IllegalArgumentException("failureReason must not be empty for login failure");
        }
        RequestId requestId = new RequestId();
        this.f.a(requestId, sSIEventRequest);
        Log.i(a, "Initiating record event with requestId : " + requestId.toString());
        return requestId;
    }

    public void a(Context context, Intent intent) {
        this.f.a(context, intent);
    }
}
