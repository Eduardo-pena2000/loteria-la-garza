package androidx.credentials.playservices;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class IdentityCredentialApiHiddenActivity extends Activity {
    public static final a c = new a(null);
    public ResultReceiver a;
    public boolean b;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            this.b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            e2.a.b.e(resultReceiver, i, i2, intent);
        }
        this.b = false;
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        ResultReceiver parcelableExtra = getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.a = parcelableExtra;
        if (parcelableExtra == null) {
            finish();
        }
        a(bundle);
        if (this.b) {
            return;
        }
        PendingIntent parcelableExtra2 = getIntent().getParcelableExtra("EXTRA_GET_CREDENTIAL_INTENT");
        if (parcelableExtra2 != null) {
            startIntentSenderForResult(parcelableExtra2.getIntentSender(), e2.a.b.a(), (Intent) null, 0, 0, 0, (Bundle) null);
            return;
        }
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            e2.a.b.d(resultReceiver, "GET_UNKNOWN", "Internal error");
        }
        finish();
    }

    public void onSaveInstanceState(Bundle bundle) {
        t.g(bundle, "outState");
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.b);
        super.onSaveInstanceState(bundle);
    }
}
