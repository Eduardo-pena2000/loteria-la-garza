package q7;

import Y1.L;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class a extends L {
    public static final b p = new b(null);
    public final String i;
    public final String j;
    public final boolean k;
    public final String l;
    public final List m;
    public final boolean n;
    public final boolean o;

    public static final class a {
        public String b;
        public String c;
        public boolean e;
        public boolean f;
        public List g;
        public String a = "";
        public boolean d = true;

        public final a a() {
            return new a(this.a, this.c, this.d, this.b, this.g, this.e, this.f);
        }

        public final a b(boolean z) {
            this.f = z;
            return this;
        }

        public final a c(boolean z) {
            this.d = z;
            return this;
        }

        public final a d(String str) {
            this.c = str;
            return this;
        }

        public final a e(String str) {
            t.g(str, "serverClientId");
            if (str.length() <= 0) {
                throw new IllegalArgumentException("serverClientId should not be empty");
            }
            this.a = str;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
        }

        public static final Bundle a(String str, String str2, boolean z, String str3, List list, boolean z2, boolean z3) {
            t.g(str, "serverClientId");
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", str);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", str2);
            bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", z);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", str3);
            bundle.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", list == null ? null : new ArrayList(list));
            bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", z2);
            bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", z3);
            return bundle;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, boolean z, String str3, List list, boolean z2, boolean z3) {
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", b.a(str, str2, z, str3, list, z2, z3), b.a(str, str2, z, str3, list, z2, z3), true, z3, (Set) null, 500, 32, (k) null);
        t.g(str, "serverClientId");
        this.i = str;
        this.j = str2;
        this.k = z;
        this.l = str3;
        this.m = list;
        this.n = z2;
        this.o = z3;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
        if (z && z2) {
            throw new IllegalArgumentException("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true;  the Verified Phone Number feature only works in sign-ups.");
        }
    }

    public final boolean f() {
        return this.o;
    }

    public final boolean g() {
        return this.k;
    }

    public final List h() {
        return this.m;
    }

    public final String i() {
        return this.l;
    }

    public final String j() {
        return this.j;
    }

    public final boolean k() {
        return this.n;
    }

    public final String l() {
        return this.i;
    }
}
