package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.u;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import p6.p;
import p6.x;

@KeepName
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class SignInHubActivity extends u {
    public static boolean k = false;
    public boolean f = false;
    public SignInConfiguration g;
    public boolean h;
    public int i;
    public Intent j;

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final /* synthetic */ int m0() {
        return this.i;
    }

    public final /* synthetic */ Intent n0() {
        return this.j;
    }

    public final void o0(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.g);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            q0(17);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.f) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.M1() != null) {
                GoogleSignInAccount M1 = signInAccount.M1();
                if (M1 == null) {
                    Log.e("AuthSignInClient", "Google account is null");
                    q0(12500);
                    return;
                }
                p.a(this).c(this.g.M1(), M1);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", M1);
                this.h = true;
                this.i = i2;
                this.j = intent;
                p0();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                q0(intExtra);
                return;
            }
        }
        q0(8);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            q0(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            q0(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.g = signInConfiguration;
        if (bundle == null) {
            if (k) {
                setResult(0);
                q0(12502);
                return;
            } else {
                k = true;
                o0(action);
                return;
            }
        }
        boolean z = bundle.getBoolean("signingInGoogleApiClients");
        this.h = z;
        if (z) {
            this.i = bundle.getInt("signInResultCode");
            Intent parcelable = bundle.getParcelable("signInResultData");
            if (parcelable != null) {
                this.j = parcelable;
                p0();
            } else {
                Log.e("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        k = false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super/*d.j*/.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.h);
        if (this.h) {
            bundle.putInt("signInResultCode", this.i);
            bundle.putParcelable("signInResultData", this.j);
        }
    }

    public final void p0() {
        c0().c(0, (Bundle) null, new x(this, null));
        k = false;
    }

    public final void q0(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        k = false;
    }
}
