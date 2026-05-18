package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.d2;
import com.applovin.impl.k0;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a {
    private final k a;
    private final o b;
    private ConsentForm c;
    private int d;

    public interface a {
        void onFlowHidden(Bundle bundle);

        void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(Bundle bundle);

        void onFlowShowFailed(CmpErrorImpl cmpErrorImpl);
    }

    public a(k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(k.o());
        a("Initializing with SDK Version: " + b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    public static /* synthetic */ void a(a aVar, a aVar2, FormError formError) {
        aVar.a(aVar2, formError);
    }

    public static /* synthetic */ void b(a aVar, Activity activity, a aVar2) {
        aVar.a(activity, aVar2);
    }

    public static /* synthetic */ void c(a aVar, a aVar2, FormError formError, FormError formError2) {
        aVar.a(aVar2, formError, formError2);
    }

    public static /* synthetic */ void d(a aVar, FormError formError, k0 k0Var, a aVar2) {
        aVar.a(formError, k0Var, aVar2);
    }

    public static /* synthetic */ void e(a aVar, a aVar2, ConsentForm consentForm) {
        aVar.a(aVar2, consentForm);
    }

    public static /* synthetic */ void f(a aVar, k0 k0Var, a aVar2, FormError formError) {
        aVar.a(k0Var, aVar2, formError);
    }

    public static /* synthetic */ void g(a aVar, a aVar2, FormError formError, k0 k0Var, ConsentForm consentForm) {
        aVar.a(aVar2, formError, k0Var, consentForm);
    }

    public static /* synthetic */ void h(a aVar, a aVar2, FormError formError) {
        aVar.b(aVar2, formError);
    }

    public void a() {
        if (this.c != null) {
            this.c = null;
        }
        this.d = 0;
    }

    public String b() {
        return null;
    }

    public void c() {
        a("Resetting consent information");
        UserMessagingPlatform.getConsentInformation(k.o()).reset();
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    private /* synthetic */ void b(a aVar, FormError formError) {
        b("Failed to request consent info with error: " + formError.getMessage());
        aVar.onFlowLoadFailed(a(formError, "Consent info update failed"));
    }

    private boolean c(String str) {
        if (!this.a.c(x4.c7).contains(str)) {
            return false;
        }
        Integer num = (Integer) this.a.a(x4.b7);
        return num.intValue() < 0 || this.d < num.intValue();
    }

    public void a(Activity activity, k0 k0Var, a aVar) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (n7.c(this.a) && k0Var.a() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(StringUtils.emptyIfNull((String) this.a.n0().getExtraParameters().get("google_test_device_hashed_id"))).build());
        }
        UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new b(this, activity, aVar), new c(this, aVar));
    }

    public void b(Activity activity, k0 k0Var, a aVar) {
        if (this.c == null) {
            b("Failed to show - not ready yet");
            aVar.onFlowShowFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
        } else {
            a("Showing consent form...");
            this.c.show(activity, new h(this, k0Var, aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(FormError formError, k0 k0Var, a aVar) {
        a("Retrying to load and show consent form...");
        this.d++;
        UserMessagingPlatform.loadConsentForm(k.o(), new f(this, aVar, formError, k0Var), new g(this, aVar, formError));
    }

    private void b(String str) {
        if (o.a()) {
            this.b.b("GoogleCmpAdapter", str);
        }
    }

    private /* synthetic */ void a(Activity activity, a aVar) {
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
        boolean isConsentFormAvailable = consentInformation.isConsentFormAvailable();
        int consentStatus = consentInformation.getConsentStatus();
        a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + isConsentFormAvailable);
        if (!isConsentFormAvailable) {
            b("Failed to load form.");
            aVar.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
            return;
        }
        if (consentStatus != 2) {
            b("Failed to load with consent status: " + consentStatus);
            aVar.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_NOT_REQUIRED, "Consent form not required for consent status: " + consentStatus));
            return;
        }
        a("Successfully requested consent info");
        a("Loading consent form...");
        UserMessagingPlatform.loadConsentForm(activity, new d(this, aVar), new e(this, aVar));
    }

    private /* synthetic */ void a(a aVar, ConsentForm consentForm) {
        a("Successfully loaded consent form");
        this.c = consentForm;
        aVar.onFlowLoaded(null);
    }

    private /* synthetic */ void a(a aVar, FormError formError) {
        b("Failed to load with error: " + formError.getMessage());
        aVar.onFlowLoadFailed(a(formError, "Consent form load failed"));
    }

    private /* synthetic */ void a(k0 k0Var, a aVar, FormError formError) {
        if (formError != null) {
            String valueOf = String.valueOf(formError.getErrorCode());
            String message = formError.getMessage();
            Map hashMap = new HashMap(2);
            hashMap.put("error_code", valueOf);
            hashMap.put("error_message", message);
            this.a.D().a(d2.O0, "googleConsentFormDismissed", hashMap);
            if (c(valueOf)) {
                a("Consent form was dismissed due to error: " + message);
                AppLovinSdkUtils.runOnUiThread(new i(this, formError, k0Var, aVar));
                return;
            }
            b("Failed to show with error: " + message);
            aVar.onFlowShowFailed(a(formError, "Consent form show failed"));
            return;
        }
        a("Consent form finished showing");
        aVar.onFlowHidden(null);
    }

    private /* synthetic */ void a(a aVar, FormError formError, k0 k0Var, ConsentForm consentForm) {
        a("Successfully re-loaded consent form");
        this.c = consentForm;
        Activity u0 = this.a.u0();
        if (u0 == null) {
            aVar.onFlowShowFailed(a(formError, "Consent form show failed"));
        } else {
            b(u0, k0Var, aVar);
        }
    }

    private /* synthetic */ void a(a aVar, FormError formError, FormError formError2) {
        b("Retry to load failed with error: " + formError2.getMessage());
        aVar.onFlowShowFailed(a(formError, "Consent form show failed"));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.applovin.impl.privacy.cmp.CmpErrorImpl a(com.google.android.ump.FormError r4, java.lang.String r5) {
        /*
            r3 = this;
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.UNSPECIFIED
            int r1 = r4.getErrorCode()
            r2 = 1
            if (r1 == r2) goto L16
            r2 = 2
            if (r1 == r2) goto L16
            r2 = 3
            if (r1 == r2) goto L13
            r2 = 4
            if (r1 == r2) goto L16
            goto L18
        L13:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.INTEGRATION_ERROR
            goto L18
        L16:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.FORM_UNAVAILABLE
        L18:
            com.applovin.impl.privacy.cmp.CmpErrorImpl r1 = new com.applovin.impl.privacy.cmp.CmpErrorImpl
            int r2 = r4.getErrorCode()
            java.lang.String r4 = r4.getMessage()
            r1.<init>(r0, r5, r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.privacy.cmp.a.a(com.google.android.ump.FormError, java.lang.String):com.applovin.impl.privacy.cmp.CmpErrorImpl");
    }

    private void a(String str) {
        if (o.a()) {
            this.b.a("GoogleCmpAdapter", str);
        }
    }
}
