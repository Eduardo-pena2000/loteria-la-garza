package o6;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import p6.o;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b extends com.google.android.gms.common.api.g {
    public static final h a = new h(null);
    public static int b = 1;

    public b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, j6.a.b, googleSignInOptions, new g.a.a().c(new com.google.android.gms.common.api.internal.a()).a());
    }

    public Task g() {
        return s.b(o.c(asGoogleApiClient(), getApplicationContext(), h() == 3));
    }

    public final synchronized int h() {
        int i;
        try {
            i = b;
            if (i == 1) {
                Context applicationContext = getApplicationContext();
                v6.g o = v6.g.o();
                int h = o.h(applicationContext, 12451000);
                if (h == 0) {
                    i = 4;
                    b = 4;
                } else if (o.b(applicationContext, h, null) != null || DynamiteModule.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    b = 2;
                } else {
                    i = 3;
                    b = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public Task signOut() {
        return s.b(o.b(asGoogleApiClient(), getApplicationContext(), h() == 3));
    }
}
