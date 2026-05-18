package com.amazon.device.simplesignin.a.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.a.c;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b implements com.amazon.device.simplesignin.a.b {
    private static final String a = "b";
    private static final String b = "com.amazon.sdktestclient";
    private static final String c = "com.amazon.sdktestclient.command.CommandBroker";

    public class 1 implements Runnable {
        final /* synthetic */ Object a;
        final /* synthetic */ ISimpleSignInResponseHandler b;

        public 1(Object obj, ISimpleSignInResponseHandler iSimpleSignInResponseHandler) {
            this.a = obj;
            this.b = iSimpleSignInResponseHandler;
        }

        public void run() {
            try {
                Object obj = this.a;
                if (obj instanceof GetUserAndLinksResponse) {
                    this.b.onGetUserAndLinksResponse((GetUserAndLinksResponse) obj);
                } else if (obj instanceof LinkUserAccountResponse) {
                    this.b.onLinkUserAccountResponse((LinkUserAccountResponse) obj);
                } else if (obj instanceof ShowLoginSelectionResponse) {
                    this.b.onShowLoginSelectionResponse((ShowLoginSelectionResponse) obj);
                } else if (obj instanceof RecordMetricsEventResponse) {
                    this.b.onRecordMetricsEventResponse((RecordMetricsEventResponse) obj);
                } else {
                    Log.e(b.a(), "Unknown response type:" + this.a.getClass().getName());
                }
            } catch (Exception e) {
                Log.e(b.a(), "Error in sendResponse: " + e);
            }
        }
    }

    public static /* synthetic */ String a() {
        return a;
    }

    private RecordMetricsEventResponse b(Intent intent) {
        RecordMetricsEventResponse recordMetricsEventResponse = new RecordMetricsEventResponse();
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("recordMetricsEventOutput"));
            recordMetricsEventResponse.setRequestId(new RequestId(jSONObject.getString("requestId")));
            RequestStatus valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            recordMetricsEventResponse.setRequestStatus(valueOf);
            RequestStatus.SUCCESSFUL.equals(valueOf);
            return recordMetricsEventResponse;
        } catch (JSONException e) {
            Log.e(a, "Exception while parsing RecordMetricsEvent response", e);
            return recordMetricsEventResponse;
        }
    }

    private LinkUserAccountResponse c(Intent intent) {
        JSONObject jSONObject;
        RequestStatus valueOf;
        LinkUserAccountResponse linkUserAccountResponse = new LinkUserAccountResponse();
        try {
            String stringExtra = intent.getStringExtra("linkUserAccountOutput");
            Log.i(a, "SimpleSignInService : linkUserAccountOutput " + stringExtra);
            jSONObject = new JSONObject(stringExtra);
            linkUserAccountResponse.setRequestId(new RequestId(jSONObject.getString("requestId")));
            valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            linkUserAccountResponse.setRequestStatus(valueOf);
        } catch (JSONException e) {
            Log.e(a, "Exception while parsing LinkUserAccount response", e);
        }
        if (!RequestStatus.SUCCESSFUL.equals(valueOf)) {
            return linkUserAccountResponse;
        }
        String string = jSONObject.getString("ssi_successCode");
        if (!LinkUserAccountResponse.SuccessCode.ConsentDenied.equals(LinkUserAccountResponse.SuccessCode.valueOf(string))) {
            linkUserAccountResponse.setLinkId(jSONObject.getString("ssi_linkId"));
        }
        linkUserAccountResponse.setSuccessCode(LinkUserAccountResponse.SuccessCode.valueOf(string));
        return linkUserAccountResponse;
    }

    private ShowLoginSelectionResponse d(Intent intent) {
        JSONObject jSONObject;
        RequestStatus valueOf;
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        try {
            String stringExtra = intent.getStringExtra("showLoginSelectionOutput");
            Log.i(a, "SimpleSignInService : loginSelectionOutput " + stringExtra);
            jSONObject = new JSONObject(stringExtra);
            showLoginSelectionResponse.setRequestId(new RequestId(jSONObject.getString("requestId")));
            valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            showLoginSelectionResponse.setRequestStatus(valueOf);
        } catch (JSONException e) {
            Log.e(a, "Exception while parsing LinkUserAccount response", e);
            showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.ManualSignIn);
        }
        if (!RequestStatus.SUCCESSFUL.equals(valueOf)) {
            return showLoginSelectionResponse;
        }
        String string = jSONObject.getString("ssi_userSelection");
        ShowLoginSelectionResponse.UserSelection userSelection = ShowLoginSelectionResponse.UserSelection.LoginSelected;
        if (!userSelection.name().equals(string)) {
            showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.ManualSignIn);
            return showLoginSelectionResponse;
        }
        String string2 = jSONObject.getString("ssi_selectedId");
        if (string2 != null) {
            showLoginSelectionResponse.setUserSelection(userSelection);
            showLoginSelectionResponse.setLinkId(string2);
        }
        return showLoginSelectionResponse;
    }

    public void a(RequestId requestId, String str) {
        Log.i(a, "Handling getUserAndLinks sandbox request.");
        Context c2 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", requestId);
            jSONObject.put("packageName", c2.getPackageName());
            jSONObject.put("sdkVersion", "1.0.0");
            jSONObject.put("ssi_identityProviderName", str);
            Bundle bundle = new Bundle();
            bundle.putString("getUserAndLinksInput", jSONObject.toString());
            Intent a2 = a("com.amazon.testclient.simplesignin.getUserAndLinks");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            c2.startService(a2);
        } catch (JSONException unused) {
            Log.e(a, "Error in preparing getUserAndLinksInput.");
        }
    }

    public void a(RequestId requestId, LinkUserAccountRequest linkUserAccountRequest) {
        Log.i(a, "Handling linkUserAccount sandbox request.");
        Context c2 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", requestId);
            jSONObject.put("packageName", c2.getPackageName());
            jSONObject.put("sdkVersion", "1.0.0");
            jSONObject.put("ssi_partnerUserId", linkUserAccountRequest.getPartnerUserId());
            jSONObject.put("ssi_identityProviderName", linkUserAccountRequest.getIdentityProviderName());
            jSONObject.put("ssi_userLoginName", linkUserAccountRequest.getUserLoginName());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("token", linkUserAccountRequest.getLinkToken().getToken());
            jSONObject2.put("schema", linkUserAccountRequest.getLinkToken().getSchema());
            jSONObject.put("ssi_linkToken", jSONObject2.toString());
            jSONObject.put("ssi_linkSigningKey", linkUserAccountRequest.getLinkSigningKey());
            Bundle bundle = new Bundle();
            bundle.putString("linkUserAccountInput", jSONObject.toString());
            Intent a2 = a("com.amazon.testclient.simplesignin.linkUserAccount");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            c2.startService(a2);
        } catch (JSONException e) {
            Log.e(a, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e);
        }
    }

    public void a(RequestId requestId, Map map) {
        Log.i(a, "Handling showLoginSelection sandbox request.");
        Context c2 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", requestId);
            jSONObject.put("packageName", c2.getPackageName());
            jSONObject.put("sdkVersion", "1.0.0");
            Intent a2 = a("com.amazon.testclient.simplesignin.showLoginSelection");
            a2.putExtra("showLoginSelectionInput", jSONObject.toString());
            a2.putExtra("ssi_LoginNamesMap", new HashMap(map));
            a2.addFlags(268435456);
            c2.startService(a2);
        } catch (JSONException e) {
            Log.e(a, "Unable to create showLoginSelection Input");
            throw new IllegalStateException("Unable to create showLoginSelection input json", e);
        }
    }

    public void a(RequestId requestId, SSIEventRequest sSIEventRequest) {
        Context c2 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ssi_metrics_event", sSIEventRequest.getEvent().toString());
            jSONObject.put("ssi_metrics_event_timestamp", sSIEventRequest.getEpochTimestamp());
            if (sSIEventRequest.getFailureReason() != null) {
                jSONObject.put("ssi_metrics_event_failure_reason", sSIEventRequest.getFailureReason().toString());
            }
            Intent a2 = a("com.amazon.testclient.simplesignin.recordmetricsevent");
            a2.addFlags(268435456);
            c2.startService(a2);
        } catch (JSONException e) {
            Log.e(a, "Error in preparing recordMetricEventInput for requestId: " + requestId, e);
        }
    }

    public void a(Context context, Intent intent) {
        intent.setComponent(new ComponentName("com.amazon.sdktestclient", "com.amazon.sdktestclient.command.CommandBroker"));
        try {
            String string = intent.getExtras().getString("responseType");
            if ("com.amazon.testclient.simplesignin.getUserAndLinks".equals(string)) {
                a(a(intent));
            } else if ("com.amazon.testclient.simplesignin.linkUserAccount".equals(string)) {
                a(c(intent));
            } else if ("com.amazon.testclient.simplesignin.showLoginSelection".equals(string)) {
                a(d(intent));
            } else if ("com.amazon.testclient.simplesignin.recordmetricsevent".equals(string)) {
                a(b(intent));
            } else {
                Log.d(a, "Unknown response type received.");
            }
        } catch (Exception e) {
            Log.e(a, "Error handling response.", e);
        }
    }

    private GetUserAndLinksResponse a(Intent intent) {
        JSONObject jSONObject;
        RequestStatus valueOf;
        GetUserAndLinksResponse getUserAndLinksResponse = new GetUserAndLinksResponse();
        try {
            jSONObject = new JSONObject(intent.getStringExtra("getUserAndLinksOutput"));
            getUserAndLinksResponse.setRequestId(new RequestId(jSONObject.getString("requestId")));
            valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            getUserAndLinksResponse.setRequestStatus(valueOf);
        } catch (JSONException e) {
            Log.e(a, "Exception while parsing GetUserAndLinks response", e);
        }
        if (!RequestStatus.SUCCESSFUL.equals(valueOf)) {
            return getUserAndLinksResponse;
        }
        String string = jSONObject.getString("ssi_amazonDirectedId");
        getUserAndLinksResponse.setAmazonUserId(string);
        getUserAndLinksResponse.setLinks(com.amazon.device.simplesignin.a.d.b.a(string, jSONObject.getString("ssi_links")));
        return getUserAndLinksResponse;
    }

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName("com.amazon.sdktestclient", "com.amazon.sdktestclient.command.CommandBroker"));
        return intent;
    }

    private void a(Object obj) {
        Context c2 = c.a().c();
        ISimpleSignInResponseHandler d = c.a().d();
        if (c2 != null && obj != null) {
            new Handler(c2.getMainLooper()).post(new 1(obj, d));
            return;
        }
        Log.i(a, "ISimpleSignInResponseHandler is not set. Dropping response: " + obj);
    }
}
