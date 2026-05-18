package com.google.firebase.auth.internal;

import B7.g;
import E6.a;
import E6.i;
import E6.l;
import K7.I;
import K7.N;
import K7.h0;
import K7.j0;
import K7.q;
import K7.v0;
import K7.x0;
import K7.y0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.u;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zza;
import com.google.android.gms.internal.firebase-auth-api.zzaeq;
import com.google.android.gms.internal.firebase-auth-api.zzaer;
import com.google.android.gms.internal.firebase-auth-api.zzaes;
import com.google.android.gms.internal.firebase-auth-api.zzagi;
import com.google.android.gms.internal.firebase-auth-api.zzagl;
import com.google.android.gms.internal.firebase-auth-api.zzajb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import l8.b;
import org.json.JSONException;
import org.json.JSONObject;
import v.d;
import y6.e;

@KeepName
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class GenericIdpActivity extends u implements zzaes {
    public static long g;
    public static final j0 h = j0.f();
    public boolean f = false;

    public static String n0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(str, string);
                }
            }
        } catch (JSONException unused) {
            Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
        }
        return jSONObject.toString();
    }

    public static /* synthetic */ void p0(GenericIdpActivity genericIdpActivity, String str, Task task) {
        if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaer.zzb(genericIdpActivity, str);
            return;
        }
        List queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            d a = new d.d().a();
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
            a.a(genericIdpActivity, (Uri) task.getResult());
        } else {
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            genericIdpActivity.startActivity(intent);
        }
    }

    public final Uri.Builder m0(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        String n0 = n0(intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS"));
        String uuid = UUID.randomUUID().toString();
        String zza = zzaer.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str3 = join;
        v0.a().e(getApplicationContext(), str, uuid, zza, action, stringExtra2, stringExtra3, stringExtra4);
        String b = x0.a(getApplicationContext(), g.p(stringExtra4).s()).b();
        if (TextUtils.isEmpty(b)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            o0(q.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (zza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b);
        if (!TextUtils.isEmpty(str3)) {
            builder.appendQueryParameter("scopes", str3);
        }
        if (!TextUtils.isEmpty(n0)) {
            builder.appendQueryParameter("customParameters", n0);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    public final void o0(Status status) {
        g = 0L;
        this.f = false;
        Intent intent = new Intent();
        h0.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (q0(intent)) {
            h.a(this);
        } else {
            N.b(getApplicationContext(), status);
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            r0();
            return;
        }
        long a = i.c().a();
        if (a - g < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        g = a;
        if (bundle != null) {
            this.f = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    public void onNewIntent(Intent intent) {
        super/*d.j*/.onNewIntent(intent);
        setIntent(intent);
    }

    public void onResume() {
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f) {
                r0();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = l.b(a.a(this, packageName)).toLowerCase(Locale.US);
                g p = g.p(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(p);
                if (zzagl.zza(p)) {
                    zza(m0(Uri.parse(zzagl.zza(p.r().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.u0());
                } else {
                    new zzaeq(packageName, lowerCase, getIntent(), p, this).executeOnExecutor(firebaseAuth.z0(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e));
                zzaer.zzb(this, packageName);
            }
            this.f = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            o0(h0.b(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            r0();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        y0 b = v0.a().b(this, packageName2, stringExtra2);
        if (b == null) {
            r0();
        }
        if (booleanExtra) {
            stringExtra = x0.a(getApplicationContext(), g.p(b.a()).s()).c(stringExtra);
        }
        zzajb zzajbVar = new zzajb(b, stringExtra);
        String e2 = b.e();
        String b2 = b.b();
        zzajbVar.zzb(e2);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(b2) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(b2) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(b2)) {
            Log.e("GenericIdpActivity", "unsupported operation: " + b2);
            r0();
            return;
        }
        g = 0L;
        this.f = false;
        Intent intent2 = new Intent();
        e.e(zzajbVar, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", b2);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (q0(intent2)) {
            h.a(this);
        } else {
            N.c(getApplicationContext(), zzajbVar, b2, e2);
        }
        finish();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*d.j*/.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f);
    }

    public final boolean q0(Intent intent) {
        return K2.a.b(this).d(intent);
    }

    public final void r0() {
        g = 0L;
        this.f = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (q0(intent)) {
            h.a(this);
        } else {
            N.b(this, q.a("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    public final Context zza() {
        return getApplicationContext();
    }

    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return m0(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    public final String zza(String str) {
        String zza = zzagi.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza)) {
            return zzagl.zzb(str);
        }
        Log.e("GenericIdpActivity", "Found hermetic configuration for identityToolkit URL: " + zza);
        return zza;
    }

    public final HttpURLConnection zza(URL url) {
        try {
            return zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    public final void zza(String str, Status status) {
        if (status == null) {
            r0();
        } else {
            o0(status);
        }
    }

    public final void zza(Uri uri, String str, b bVar) {
        android.support.v4.media.session.b.a(bVar.get());
        Tasks.forResult(uri).addOnCompleteListener(new I(this, str));
    }
}
