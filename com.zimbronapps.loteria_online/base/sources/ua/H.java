package ua;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class h {
    public static final a f = new a(null);
    public final boolean a;
    public final g b;
    public final String c;
    public final String d;
    public final String e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final h a(List pigeonVar_list) {
            kotlin.jvm.internal.t.g(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = pigeonVar_list.get(1);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestGoogleIdOptionParams");
            return new h(booleanValue, (g) obj2, (String) pigeonVar_list.get(2), (String) pigeonVar_list.get(3), (String) pigeonVar_list.get(4));
        }

        public a() {
        }
    }

    public h(boolean z, g googleIdOptionParams, String str, String str2, String str3) {
        kotlin.jvm.internal.t.g(googleIdOptionParams, "googleIdOptionParams");
        this.a = z;
        this.b = googleIdOptionParams;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final g a() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.c;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return I.a.a(f(), ((h) obj).f());
    }

    public final List f() {
        return Da.v.q(Boolean.valueOf(this.a), this.b, this.c, this.d, this.e);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return "GetCredentialRequestParams(useButtonFlow=" + this.a + ", googleIdOptionParams=" + this.b + ", serverClientId=" + this.c + ", hostedDomain=" + this.d + ", nonce=" + this.e + ")";
    }
}
