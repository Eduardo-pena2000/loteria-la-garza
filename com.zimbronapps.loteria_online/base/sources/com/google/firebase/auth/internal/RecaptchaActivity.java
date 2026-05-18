package com.google.firebase.auth.internal;

import B7.g;
import E6.i;
import E6.l;
import K2.a;
import K7.N;
import K7.P;
import K7.h0;
import K7.j0;
import K7.q;
import K7.v0;
import K7.x0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zza;
import com.google.android.gms.internal.firebase-auth-api.zzaeq;
import com.google.android.gms.internal.firebase-auth-api.zzaer;
import com.google.android.gms.internal.firebase-auth-api.zzaes;
import com.google.android.gms.internal.firebase-auth-api.zzafd;
import com.google.android.gms.internal.firebase-auth-api.zzagi;
import com.google.android.gms.internal.firebase-auth-api.zzagl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import l8.b;
import v.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class RecaptchaActivity extends u implements zzaes {
    public static final String g = "RecaptchaActivity";
    public static long h;
    public static final j0 i = j0.f();
    public boolean f = false;

    private final Uri.Builder m0(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        g p = g.p(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(p);
        v0.a().d(getApplicationContext(), str, uuid, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String b = x0.a(getApplicationContext(), p.s()).b();
        if (TextUtils.isEmpty(b)) {
            Log.e(g, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            n0(q.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.m()) ? firebaseAuth.m() : zzafd.zza()).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b);
        return builder;
    }

    private final void n0(Status status) {
        h = 0L;
        this.f = false;
        Intent intent = new Intent();
        h0.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        p0(intent);
        i.a(this);
        finish();
    }

    public static /* synthetic */ void o0(RecaptchaActivity recaptchaActivity, String str, Task task) {
        if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e(g, "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaer.zzb(recaptchaActivity, str);
            return;
        }
        List queryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            d a = new d.d().a();
            a.a.addFlags(1073741824);
            a.a.addFlags(268435456);
            a.a(recaptchaActivity, (Uri) task.getResult());
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
        intent.putExtra("com.android.browser.application_id", str);
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        recaptchaActivity.startActivity(intent);
    }

    private final boolean p0(Intent intent) {
        return a.b(this).d(intent);
    }

    private final void q0() {
        h = 0L;
        this.f = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        p0(intent);
        i.a(this);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e(g, "Could not do operation - unknown action: " + action);
            q0();
            return;
        }
        long a = i.c().a();
        if (a - h < 30000) {
            Log.e(g, "Could not start operation - already in progress");
            return;
        }
        h = a;
        if (bundle != null) {
            this.f = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
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
                q0();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = l.b(E6.a.a(this, packageName)).toLowerCase(Locale.US);
                g p = g.p(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(p);
                if (zzagl.zza(p)) {
                    zza(m0(Uri.parse(zzagl.zza(p.r().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.u0());
                } else {
                    new zzaeq(packageName, lowerCase, intent, p, this).executeOnExecutor(firebaseAuth.z0(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(g, "Could not get package signature: " + packageName + " " + String.valueOf(e));
                zzaer.zzb(this, packageName);
            }
            this.f = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            n0(h0.b(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            q0();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        String g2 = v0.a().g(getApplicationContext(), getPackageName(), intent2.getStringExtra("eventId"));
        if (TextUtils.isEmpty(g2)) {
            Log.e(g, "Failed to find registration for this event - failing to prevent session injection.");
            n0(q.a("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = x0.a(getApplicationContext(), g.p(g2).s()).c(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        h = 0L;
        this.f = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (p0(intent3)) {
            i.a(this);
        } else {
            N.f(getApplicationContext(), queryParameter, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        }
        finish();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*d.j*/.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f);
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
        Log.e(g, "Found hermetic configuration for identityToolkit URL: " + zza);
        return zza;
    }

    public final HttpURLConnection zza(URL url) {
        try {
            return zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzaes.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    public final void zza(String str, Status status) {
        if (status == null) {
            q0();
        } else {
            n0(status);
        }
    }

    public final void zza(Uri uri, String str, b bVar) {
        android.support.v4.media.session.b.a(bVar.get());
        Tasks.forResult(uri).addOnCompleteListener(new P(this, str));
    }
}
