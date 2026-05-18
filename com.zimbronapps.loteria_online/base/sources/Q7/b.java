package q7;

import Y1.L;
import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class b extends L {
    public static final b l = new b(null);
    public final String i;
    public final String j;
    public final String k;

    public static final class a {
        public final String a;
        public String b;
        public String c;

        public a(String str) {
            t.g(str, "serverClientId");
            this.a = str;
        }

        public final b a() {
            return new b(this.a, this.b, this.c);
        }

        public final a b(String str) {
            t.g(str, "hostedDomainFilter");
            this.b = str;
            return this;
        }

        public final a c(String str) {
            this.c = str;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
        }

        public static final Bundle a(String str, String str2, String str3, boolean z) {
            t.g(str, "serverClientId");
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", str);
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", str3);
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", str2);
            bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
            return bundle;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, String str3) {
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", b.a(str, str2, str3, true), b.a(str, str2, str3, true), true, true, (Set) null, 32, (k) null);
        t.g(str, "serverClientId");
        this.i = str;
        this.j = str2;
        this.k = str3;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
    }

    public final String f() {
        return this.j;
    }

    public final String g() {
        return this.k;
    }

    public final String h() {
        return this.i;
    }
}
