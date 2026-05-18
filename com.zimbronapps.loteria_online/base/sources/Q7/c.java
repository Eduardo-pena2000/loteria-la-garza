package q7;

import Y1.H;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class c extends H {
    public static final b k = new b(null);
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Uri i;
    public final String j;

    public static final class a {
        public String a = "";
        public String b = "";
        public String c;
        public String d;
        public String e;
        public Uri f;
        public String g;

        public final c a() {
            return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }

        public final a b(String str) {
            this.c = str;
            return this;
        }

        public final a c(String str) {
            this.d = str;
            return this;
        }

        public final a d(String str) {
            this.e = str;
            return this;
        }

        public final a e(String str) {
            t.g(str, "id");
            this.a = str;
            return this;
        }

        public final a f(String str) {
            t.g(str, "idToken");
            this.b = str;
            return this;
        }

        public final a g(String str) {
            this.g = str;
            return this;
        }

        public final a h(Uri uri) {
            this.f = uri;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
        }

        public final c a(Bundle bundle) {
            t.g(bundle, "data");
            try {
                String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
                String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
                String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
                String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
                String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
                Uri parcelable = Build.VERSION.SDK_INT >= 33 ? (Uri) d.a(bundle, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
                String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
                t.d(string);
                t.d(string2);
                return new c(string, string2, string3, string4, string5, parcelable, string6);
            } catch (Exception e) {
                throw new e(e);
            }
        }
    }

    public c(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        t.g(str, "id");
        t.g(str2, "idToken");
        t.g(str, "id");
        t.g(str2, "idToken");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle);
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = uri;
        this.j = str6;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("idToken should not be empty");
        }
    }

    public static final c c(Bundle bundle) {
        return k.a(bundle);
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.g;
    }

    public final String f() {
        return this.h;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.e;
    }

    public final Uri i() {
        return this.i;
    }
}
