package ua;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class e extends i {
    public static final a d = new a(null);
    public final f a;
    public final String b;
    public final String c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final e a(List pigeonVar_list) {
            kotlin.jvm.internal.t.g(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialFailureType");
            return new e((f) obj, (String) pigeonVar_list.get(1), (String) pigeonVar_list.get(2));
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f type, String str, String str2) {
        super(null);
        kotlin.jvm.internal.t.g(type, "type");
        this.a = type;
        this.b = str;
        this.c = str2;
    }

    public final List a() {
        return Da.v.q(this.a, this.b, this.c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return I.a.a(a(), ((e) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "GetCredentialFailure(type=" + this.a + ", message=" + this.b + ", details=" + this.c + ")";
    }
}
