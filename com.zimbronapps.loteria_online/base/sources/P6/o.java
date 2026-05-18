package p6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class o {
    public static final A6.a a = new A6.a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static com.google.android.gms.common.api.i b(com.google.android.gms.common.api.h hVar, Context context, boolean z) {
        a.a("Signing out", new Object[0]);
        d(context);
        return z ? com.google.android.gms.common.api.j.b(Status.f, hVar) : hVar.b(new k(hVar));
    }

    public static com.google.android.gms.common.api.i c(com.google.android.gms.common.api.h hVar, Context context, boolean z) {
        a.a("Revoking access", new Object[0]);
        String e = c.b(context).e();
        d(context);
        return z ? f.a(e) : hVar.b(new m(hVar));
    }

    public static void d(Context context) {
        p.a(context).b();
        Iterator it = com.google.android.gms.common.api.h.c().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.h) it.next()).i();
        }
        com.google.android.gms.common.api.internal.g.a();
    }
}
