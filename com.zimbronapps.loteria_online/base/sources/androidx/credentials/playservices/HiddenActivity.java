package androidx.credentials.playservices;

import Ca.I;
import Qa.l;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import d2.m;
import d2.n;
import d2.o;
import d2.p;
import d2.q;
import d2.r;
import d2.s;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l6.h;
import l6.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class HiddenActivity extends Activity {
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

    public static final class b extends u implements l {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(1);
            this.b = i;
        }

        public final void a(l6.d dVar) {
            try {
                HiddenActivity.j(HiddenActivity.this, true);
                HiddenActivity.this.startIntentSenderForResult(dVar.M1().getIntentSender(), this.b, (Intent) null, 0, 0, 0, (Bundle) null);
            } catch (IntentSender.SendIntentException e) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver i = HiddenActivity.i(hiddenActivity);
                t.d(i);
                HiddenActivity.k(hiddenActivity, i, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e.getMessage());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((l6.d) obj);
            return I.a;
        }
    }

    public static final class c extends u implements l {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(1);
            this.b = i;
        }

        public final void a(l6.l lVar) {
            try {
                HiddenActivity.j(HiddenActivity.this, true);
                HiddenActivity.this.startIntentSenderForResult(lVar.M1().getIntentSender(), this.b, (Intent) null, 0, 0, 0, (Bundle) null);
            } catch (IntentSender.SendIntentException e) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver i = HiddenActivity.i(hiddenActivity);
                t.d(i);
                HiddenActivity.k(hiddenActivity, i, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e.getMessage());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((l6.l) obj);
            return I.a;
        }
    }

    public static final class d extends u implements l {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(1);
            this.b = i;
        }

        public final void a(PendingIntent pendingIntent) {
            t.g(pendingIntent, "result");
            try {
                HiddenActivity.j(HiddenActivity.this, true);
                HiddenActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), this.b, (Intent) null, 0, 0, 0, (Bundle) null);
            } catch (IntentSender.SendIntentException e) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver i = HiddenActivity.i(hiddenActivity);
                t.d(i);
                HiddenActivity.k(hiddenActivity, i, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e.getMessage());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PendingIntent) obj);
            return I.a;
        }
    }

    public static final class e extends u implements l {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i) {
            super(1);
            this.b = i;
        }

        public final void a(PendingIntent pendingIntent) {
            try {
                HiddenActivity.j(HiddenActivity.this, true);
                HiddenActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), this.b, (Intent) null, 0, 0, 0, (Bundle) null);
            } catch (IntentSender.SendIntentException e) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver i = HiddenActivity.i(hiddenActivity);
                t.d(i);
                HiddenActivity.k(hiddenActivity, i, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e.getMessage());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PendingIntent) obj);
            return I.a;
        }
    }

    public static /* synthetic */ void a(HiddenActivity hiddenActivity, Exception exc) {
        n(hiddenActivity, exc);
    }

    public static /* synthetic */ void b(l lVar, Object obj) {
        p(lVar, obj);
    }

    public static /* synthetic */ void c(HiddenActivity hiddenActivity, Exception exc) {
        w(hiddenActivity, exc);
    }

    public static /* synthetic */ void d(l lVar, Object obj) {
        v(lVar, obj);
    }

    public static /* synthetic */ void e(l lVar, Object obj) {
        s(lVar, obj);
    }

    public static /* synthetic */ void f(HiddenActivity hiddenActivity, Exception exc) {
        t(hiddenActivity, exc);
    }

    public static /* synthetic */ void g(HiddenActivity hiddenActivity, Exception exc) {
        q(hiddenActivity, exc);
    }

    public static /* synthetic */ void h(l lVar, Object obj) {
        m(lVar, obj);
    }

    public static final /* synthetic */ ResultReceiver i(HiddenActivity hiddenActivity) {
        return hiddenActivity.a;
    }

    public static final /* synthetic */ void j(HiddenActivity hiddenActivity, boolean z) {
        hiddenActivity.b = z;
    }

    public static final /* synthetic */ void k(HiddenActivity hiddenActivity, ResultReceiver resultReceiver, String str, String str2) {
        hiddenActivity.y(resultReceiver, str, str2);
    }

    public static final void m(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void n(HiddenActivity hiddenActivity, Exception exc) {
        t.g(exc, "e");
        String str = ((exc instanceof com.google.android.gms.common.api.b) && e2.a.b.c().contains(Integer.valueOf(((com.google.android.gms.common.api.b) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver = hiddenActivity.a;
        t.d(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During begin sign in, failure response from one tap: " + exc.getMessage());
    }

    public static final void p(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void q(HiddenActivity hiddenActivity, Exception exc) {
        t.g(exc, "e");
        String str = ((exc instanceof com.google.android.gms.common.api.b) && e2.a.b.c().contains(Integer.valueOf(((com.google.android.gms.common.api.b) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
        ResultReceiver resultReceiver = hiddenActivity.a;
        t.d(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During save password, found password failure response from one tap " + exc.getMessage());
    }

    public static final void s(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void t(HiddenActivity hiddenActivity, Exception exc) {
        t.g(exc, "e");
        String str = ((exc instanceof com.google.android.gms.common.api.b) && e2.a.b.c().contains(Integer.valueOf(((com.google.android.gms.common.api.b) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
        ResultReceiver resultReceiver = hiddenActivity.a;
        t.d(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During create public key credential, fido registration failure: " + exc.getMessage());
    }

    public static final void v(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void w(HiddenActivity hiddenActivity, Exception exc) {
        t.g(exc, "e");
        String str = ((exc instanceof com.google.android.gms.common.api.b) && e2.a.b.c().contains(Integer.valueOf(((com.google.android.gms.common.api.b) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver = hiddenActivity.a;
        t.d(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
    }

    public final void l() {
        l6.c parcelableExtra = getIntent().getParcelableExtra("REQUEST_TYPE");
        if ((parcelableExtra != null ? i.c(this).beginSignIn(parcelableExtra).addOnSuccessListener(new r(new b(getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1)))).addOnFailureListener(new s(this)) : null) == null) {
            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    public final void o() {
        l6.k parcelableExtra = getIntent().getParcelableExtra("REQUEST_TYPE");
        if ((parcelableExtra != null ? i.b(this).savePassword(parcelableExtra).addOnSuccessListener(new n(new c(getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1)))).addOnFailureListener(new o(this)) : null) == null) {
            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
            finish();
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:140)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:35)
     */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver parcelableExtra = getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.a = parcelableExtra;
        if (parcelableExtra == null) {
            finish();
        }
        x(bundle);
        if (this.b) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        l();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        r();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        o();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        u();
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    public void onSaveInstanceState(Bundle bundle) {
        t.g(bundle, "outState");
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.b);
        super.onSaveInstanceState(bundle);
    }

    public final void r() {
        R6.u parcelableExtra = getIntent().getParcelableExtra("REQUEST_TYPE");
        if ((parcelableExtra != null ? P6.a.a(this).g(parcelableExtra).addOnSuccessListener(new d2.l(new d(getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1)))).addOnFailureListener(new m(this)) : null) == null) {
            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
            finish();
        }
    }

    public final void u() {
        h parcelableExtra = getIntent().getParcelableExtra("REQUEST_TYPE");
        if ((parcelableExtra != null ? i.c(this).getSignInIntent(parcelableExtra).addOnSuccessListener(new p(new e(getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1)))).addOnFailureListener(new q(this)) : null) == null) {
            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    public final void x(Bundle bundle) {
        if (bundle != null) {
            this.b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
    }

    public final void y(ResultReceiver resultReceiver, String str, String str2) {
        e2.a.b.d(resultReceiver, str, str2);
        finish();
    }
}
