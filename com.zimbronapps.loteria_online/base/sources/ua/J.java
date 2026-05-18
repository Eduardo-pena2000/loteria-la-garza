package ua;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class j extends i {
    public static final a b = new a(null);
    public final L a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final j a(List pigeonVar_list) {
            kotlin.jvm.internal.t.g(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformGoogleIdTokenCredential");
            return new j((L) obj);
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(L credential) {
        super(null);
        kotlin.jvm.internal.t.g(credential, "credential");
        this.a = credential;
    }

    public final List a() {
        return Da.u.e(this.a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return I.a.a(a(), ((j) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "GetCredentialSuccess(credential=" + this.a + ")";
    }
}
