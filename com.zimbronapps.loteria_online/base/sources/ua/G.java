package ua;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class g {
    public static final a c = new a(null);
    public final boolean a;
    public final boolean b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final g a(List pigeonVar_list) {
            kotlin.jvm.internal.t.g(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = pigeonVar_list.get(1);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            return new g(booleanValue, ((Boolean) obj2).booleanValue());
        }

        public a() {
        }
    }

    public g(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final List c() {
        return Da.v.q(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return I.a.a(c(), ((g) obj).c());
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return "GetCredentialRequestGoogleIdOptionParams(filterToAuthorized=" + this.a + ", autoSelectEnabled=" + this.b + ")";
    }
}
