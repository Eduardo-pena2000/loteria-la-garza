package p6;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c {
    public static final Lock c = new ReentrantLock();
    public static c d;
    public final Lock a = new ReentrantLock();
    public final SharedPreferences b;

    public c(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        com.google.android.gms.common.internal.t.l(context);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new c(context.getApplicationContext());
            }
            c cVar = d;
            lock.unlock();
            return cVar;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    public static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.a.lock();
        try {
            this.b.edit().clear().apply();
        } finally {
            this.a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String g;
        String g2 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = g(i("googleSignInAccount", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.V1(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions d() {
        String g;
        String g2 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = g(i("googleSignInOptions", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.V1(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        com.google.android.gms.common.internal.t.l(googleSignInAccount);
        com.google.android.gms.common.internal.t.l(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.W1());
        com.google.android.gms.common.internal.t.l(googleSignInAccount);
        com.google.android.gms.common.internal.t.l(googleSignInOptions);
        String W1 = googleSignInAccount.W1();
        h(i("googleSignInAccount", W1), googleSignInAccount.X1());
        h(i("googleSignInOptions", W1), googleSignInOptions.Z1());
    }

    public final String g(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, (String) null);
        } finally {
            this.a.unlock();
        }
    }

    public final void h(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }
}
