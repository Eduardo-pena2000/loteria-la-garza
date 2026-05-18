package M2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class t {
    public static final String c = P2.K.w0(0);
    public static final String d = P2.K.w0(1);
    public final String a;
    public final String b;

    public t(String str, String str2) {
        this.a = P2.K.M0(str);
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return P2.K.c(this.a, tVar.a) && P2.K.c(this.b, tVar.b);
    }

    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
