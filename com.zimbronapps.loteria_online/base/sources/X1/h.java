package x1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class h extends Exception {
    public final String a;
    public final int b;
    public final String c;

    public h(String str, c cVar) {
        super(str);
        this.a = str;
        if (cVar != null) {
            this.c = cVar.g();
            this.b = cVar.f();
        } else {
            this.c = "unknown";
            this.b = 0;
        }
    }

    public String a() {
        return this.a + " (" + this.c + " at line " + this.b + ")";
    }

    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
