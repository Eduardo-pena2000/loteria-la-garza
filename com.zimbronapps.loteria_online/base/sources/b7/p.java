package B7;

import E6.v;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class p {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public static final class b {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;

        public p a() {
            return new p(this.b, this.a, this.c, this.d, this.e, this.f, this.g, null);
        }

        public b b(String str) {
            this.a = t.g(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.b = t.g(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.c = str;
            return this;
        }

        public b e(String str) {
            this.d = str;
            return this;
        }

        public b f(String str) {
            this.e = str;
            return this;
        }

        public b g(String str) {
            this.g = str;
            return this;
        }

        public b h(String str) {
            this.f = str;
            return this;
        }
    }

    public /* synthetic */ p(String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this(str, str2, str3, str4, str5, str6, str7);
    }

    public static p a(Context context) {
        w wVar = new w(context);
        String a2 = wVar.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new p(a2, wVar.a("google_api_key"), wVar.a("firebase_database_url"), wVar.a("ga_trackingId"), wVar.a("gcm_defaultSenderId"), wVar.a("google_storage_bucket"), wVar.a("project_id"));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return com.google.android.gms.common.internal.r.b(this.b, pVar.b) && com.google.android.gms.common.internal.r.b(this.a, pVar.a) && com.google.android.gms.common.internal.r.b(this.c, pVar.c) && com.google.android.gms.common.internal.r.b(this.d, pVar.d) && com.google.android.gms.common.internal.r.b(this.e, pVar.e) && com.google.android.gms.common.internal.r.b(this.f, pVar.f) && com.google.android.gms.common.internal.r.b(this.g, pVar.g);
    }

    public String f() {
        return this.e;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.f;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public String toString() {
        return com.google.android.gms.common.internal.r.d(this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).a("projectId", this.g).toString();
    }

    public p(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        t.p(!v.b(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }
}
