package o7;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.S;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class a extends com.google.android.gms.common.internal.i implements n7.e {
    public static final /* synthetic */ int e = 0;
    public final boolean a;
    public final com.google.android.gms.common.internal.f b;
    public final Bundle c;
    public final Integer d;

    public a(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.f fVar, Bundle bundle, h.b bVar, h.c cVar) {
        super(context, looper, 44, fVar, bVar, cVar);
        this.a = true;
        this.b = fVar;
        this.c = bundle;
        this.d = fVar.l();
    }

    public static Bundle e(com.google.android.gms.common.internal.f fVar) {
        fVar.k();
        Integer l = fVar.l();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", fVar.b());
        if (l != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", l.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    public final void a(f fVar) {
        t.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account d = this.b.d();
            ((g) getService()).q1(new j(1, new S(d, ((Integer) t.l(this.d)).intValue(), "<<default account>>".equals(d.name) ? p6.c.b(getContext()).c() : null)), fVar);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.O(new l(1, new v6.b(8, (PendingIntent) null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    public final void b() {
        connect(new d.d(this));
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.b.h())) {
            this.c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.b.h());
        }
        return this.c;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean requiresSignIn() {
        return this.a;
    }
}
