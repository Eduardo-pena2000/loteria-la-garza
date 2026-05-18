package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.privacy.consentFlow.TermsAndPrivacyPolicyFlowSettingsImpl;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class u0 implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {
    private final com.applovin.impl.sdk.k a;
    private final z0 b;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AppLovinSdkConfiguration.ConsentFlowUserGeography.values().length];
            a = iArr;
            try {
                iArr[AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b {
        private boolean a;
        private boolean b;
        private boolean c;
        private AppLovinCmpError d;
        private s0 e;

        public b() {
        }

        public static /* synthetic */ s0 a(b bVar) {
            return bVar.e;
        }

        public boolean b() {
            return this.a;
        }

        public void c() {
            this.c = true;
            this.a = true;
        }

        public void d() {
            this.b = true;
            this.a = true;
        }

        public b(s0 s0Var) {
            this.e = s0Var;
        }

        public boolean a() {
            return this.c;
        }

        public void a(AppLovinCmpError appLovinCmpError) {
            this.d = appLovinCmpError;
        }

        public void a(s0 s0Var) {
            this.e = s0Var;
        }
    }

    public interface c {
        void a(b bVar);
    }

    public u0(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = new z0(kVar);
        if (n7.k(com.applovin.impl.sdk.k.o())) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).subscribe(this, "start_sdk_consent_flow");
        }
    }

    public static TermsAndPrivacyPolicyFlowSettingsImpl a(Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("ConsentFlowManager", "Failed to get default Terms and Privacy Policy flow settings.");
            return new TermsAndPrivacyPolicyFlowSettingsImpl(false, false, AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, null, null);
        }
        String a2 = n7.a(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, (com.applovin.impl.sdk.k) null);
        JSONObject jSONObject = JsonUtils.getJSONObject(StringUtils.isValidString(a2) ? JsonUtils.jsonObjectFromJsonString(a2, new JSONObject()) : new JSONObject(), "consent_flow_settings", new JSONObject());
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", bool);
        Boolean bool3 = JsonUtils.getBoolean(jSONObject, "consent_flow_show_terms_and_privacy_policy_alert_in_gdpr", bool);
        String string = JsonUtils.getString(jSONObject, "consent_flow_debug_user_geography", "");
        String string2 = JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", null);
        Uri parse = URLUtil.isValidUrl(string2) ? Uri.parse(string2) : null;
        String string3 = JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", null);
        return new TermsAndPrivacyPolicyFlowSettingsImpl(bool2.booleanValue(), bool3.booleanValue(), a(string), URLUtil.isValidUrl(string3) ? Uri.parse(string3) : null, parse);
    }

    public static /* synthetic */ void c(Uri uri, DialogInterface dialogInterface, int i) {
        b(uri, dialogInterface, i);
    }

    public static /* synthetic */ void d(u0 u0Var, Uri uri, DialogInterface dialogInterface, int i) {
        u0Var.a(uri, dialogInterface, i);
    }

    public static /* synthetic */ void e(u0 u0Var, c cVar, b bVar) {
        u0Var.a(cVar, bVar);
    }

    public static /* synthetic */ void f(u0 u0Var, b bVar) {
        u0Var.a(bVar);
    }

    public static /* synthetic */ void g(u0 u0Var, Activity activity) {
        u0Var.a(activity);
    }

    public JSONObject b() {
        TermsAndPrivacyPolicyFlowSettingsImpl c2 = c();
        Uri privacyPolicyUri = c2.getPrivacyPolicyUri();
        Uri termsOfServiceUri = c2.getTermsOfServiceUri();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "enabled", String.valueOf(j()));
        JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : "");
        JsonUtils.putString(jSONObject, "terms_of_service_url", termsOfServiceUri != null ? termsOfServiceUri.toString() : "");
        return jSONObject;
    }

    public String getCommunicatorId() {
        return "consent_flow_manager";
    }

    public Uri h() {
        return c().getTermsOfServiceUri();
    }

    public boolean i() {
        return this.b.a();
    }

    public boolean j() {
        Map extraParameters = this.a.n0().getExtraParameters();
        return extraParameters.containsKey("consent_flow_enabled") ? Boolean.parseBoolean((String) extraParameters.get("consent_flow_enabled")) : c().isEnabled();
    }

    public boolean k() {
        if (n7.c(this.a)) {
            int i = a.a[d().ordinal()];
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
        }
        return this.a.v().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
    }

    public boolean l() {
        return this.a.n0().getExtraParameters().containsKey("terms_flow_settings");
    }

    public boolean m() {
        return c().shouldShowTermsAndPrivacyPolicyAlertInGdpr();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.b.a(this.a.u0(), new E6(this));
    }

    private TermsAndPrivacyPolicyFlowSettingsImpl c() {
        return (TermsAndPrivacyPolicyFlowSettingsImpl) this.a.n0().getTermsAndPrivacyPolicyFlowSettings();
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography d() {
        return c().getDebugUserGeography();
    }

    public String e() {
        Uri f = f();
        Uri h = h();
        StringBuilder sb = new StringBuilder();
        sb.append("\nConsent Flow Enabled - ");
        sb.append(j());
        sb.append("\nTerms of Service - ");
        if (h == null) {
            h = "undefined";
        }
        sb.append(h);
        sb.append("\nPrivacy Policy - ");
        if (f == null) {
            f = "undefined";
        }
        sb.append(f);
        return sb.toString();
    }

    public Uri f() {
        return c().getPrivacyPolicyUri();
    }

    public String g() {
        return "Migrate to the new Terms and Privacy Policy Flow by following these steps:\n\t1. Delete the 'terms_flow_settings' entry from your 'applovin_settings.xml' file.\n\t2. Follow the integration instructions in our documentation: " + a();
    }

    private void b(Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new D6(this, activity));
    }

    private static /* synthetic */ void b(Uri uri, DialogInterface dialogInterface, int i) {
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    public void a(Activity activity, c cVar) {
        if (!j()) {
            cVar.a(new b(new s0(s0.c, "Failed to start consent flow. Please make sure that the consent flow is enabled.")));
        } else if (c().getPrivacyPolicyUri() == null) {
            b(activity);
        } else {
            this.b.a(activity, new F6(this, cVar));
        }
    }

    private /* synthetic */ void a(c cVar, b bVar) {
        if (b.a(bVar) == null) {
            this.a.b(z4.t, Boolean.FALSE);
        }
        cVar.a(bVar);
    }

    private /* synthetic */ void a(b bVar) {
        if (b.a(bVar) == null) {
            this.a.b(z4.t, Boolean.FALSE);
        }
        AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).getMessagingService().publish(new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", this));
    }

    private static AppLovinSdkConfiguration.ConsentFlowUserGeography a(String str) {
        if ("gdpr".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        if ("other".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER;
        }
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    private /* synthetic */ void a(Activity activity) {
        Uri a2 = a();
        new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new B6(this, a2)).setNegativeButton("DISMISS", new C6(a2)).create().show();
    }

    private /* synthetic */ void a(Uri uri, DialogInterface dialogInterface, int i) {
        k7.a(uri, com.applovin.impl.sdk.k.o(), this.a);
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    private Uri a() {
        return Uri.parse((String) this.a.a(this.a.H0() ? x4.Z6 : x4.Y6));
    }
}
