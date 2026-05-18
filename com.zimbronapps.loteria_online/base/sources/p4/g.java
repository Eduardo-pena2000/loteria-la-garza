package P4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g {
    public final String a;
    public final int b;

    public g(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.b != gVar.b) {
            return false;
        }
        return this.a.equals(gVar.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
