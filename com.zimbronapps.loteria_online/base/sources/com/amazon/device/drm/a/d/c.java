package com.amazon.device.drm.a.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.a.a.o.f;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.a.d;
import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c implements com.amazon.device.drm.a.c {
    private static final String a = "c";
    private static final String b = "com.amazon.sdktestclient";
    private static final String c = "com.amazon.sdktestclient.command.CommandBroker";

    public class 1 implements Runnable {
        final /* synthetic */ Object a;
        final /* synthetic */ LicensingListener b;

        public 1(Object obj, LicensingListener licensingListener) {
            this.a = obj;
            this.b = licensingListener;
        }

        public void run() {
            try {
                Object obj = this.a;
                if (obj instanceof LicenseResponse) {
                    this.b.onLicenseCommandResponse((LicenseResponse) obj);
                } else {
                    com.amazon.device.drm.a.e.b.b(c.a(), "Unknown response type:" + this.a.getClass().getName());
                }
            } catch (Exception e) {
                com.amazon.device.drm.a.e.b.b(c.a(), "Error in sendResponse: " + e);
            }
        }
    }

    public static /* synthetic */ String a() {
        return a;
    }

    public void a(RequestId requestId) {
        com.amazon.device.drm.a.e.b.a(a, "sendGetLicenseRequest");
        try {
            Context c2 = d.d().c();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", requestId);
            jSONObject.put("packageName", c2.getPackageName());
            jSONObject.put("sdkVersion", "2.9.0.0");
            bundle.putString("getLicenseInput", jSONObject.toString());
            Intent a2 = a("com.amazon.testclient.drm.getLicense");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            c2.startService(a2);
        } catch (JSONException unused) {
            com.amazon.device.drm.a.e.b.b(a, "Error in sendGetUserDataRequest.");
        }
    }

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName("com.amazon.sdktestclient", "com.amazon.sdktestclient.command.CommandBroker"));
        return intent;
    }

    public void a(Context context, Intent intent) {
        com.amazon.device.drm.a.e.b.a(a, "handleResponse");
        intent.setComponent(new ComponentName("com.amazon.sdktestclient", "com.amazon.sdktestclient.command.CommandBroker"));
        try {
            if (intent.getExtras().getString("responseType").equalsIgnoreCase("com.amazon.testclient.drm.getLicense")) {
                a(a(intent));
            }
        } catch (Exception e) {
            Log.e(a, "Error handling response.", e);
        }
    }

    private LicenseResponse a(Intent intent) {
        RequestId requestId;
        LicenseResponse.RequestStatus requestStatus = LicenseResponse.RequestStatus.UNKNOWN_ERROR;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("getLicenseOutput"));
            requestStatus = LicenseResponse.RequestStatus.valueOf(jSONObject.optString("status"));
            requestId = RequestId.fromString(jSONObject.optString("requestId"));
        } catch (Exception e) {
            Log.e(a, "Error parsing getLicense response", e);
            requestId = null;
        }
        return new com.amazon.device.drm.a.c.a().a(requestId).a(requestStatus).a();
    }

    public void a(Object obj) {
        f.a(obj, "response");
        Context c2 = d.d().c();
        LicensingListener b2 = d.d().b();
        if (c2 != null && b2 != null) {
            new Handler(c2.getMainLooper()).post(new 1(obj, b2));
            return;
        }
        com.amazon.device.drm.a.e.b.a(a, "LicensingListener is not set. Dropping response: " + obj);
    }
}
