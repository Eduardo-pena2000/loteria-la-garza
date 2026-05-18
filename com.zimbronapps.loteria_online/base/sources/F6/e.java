package f6;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class e {
    public final String a;
    public final String b;

    public static final class a {
        public String a = "";
        public String b = "";

        public e a() {
            return new e(this, null);
        }

        public a b(String str) {
            this.b = str;
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }

        public final /* synthetic */ String d() {
            return this.a;
        }

        public final /* synthetic */ String e() {
            return this.b;
        }
    }

    public /* synthetic */ e(a aVar, byte[] bArr) {
        this.a = aVar.d();
        this.b = aVar.e();
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }
}
