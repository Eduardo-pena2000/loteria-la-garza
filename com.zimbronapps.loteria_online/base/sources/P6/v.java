package p6;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class v extends q {
    public final Context a;

    public v(Context context) {
        this.a = context;
    }

    public final void j() {
        q1();
        Context context = this.a;
        c b = c.b(context);
        GoogleSignInAccount c = b.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.l;
        if (c != null) {
            googleSignInOptions = b.d();
        }
        o6.b a = com.google.android.gms.auth.api.signin.a.a(context, googleSignInOptions);
        if (c != null) {
            a.g();
        } else {
            a.signOut();
        }
    }

    public final void p() {
        q1();
        p.a(this.a).b();
    }

    public final void q1() {
        if (E6.w.a(this.a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }
}
