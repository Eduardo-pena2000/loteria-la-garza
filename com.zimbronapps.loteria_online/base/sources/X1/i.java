package x1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class i extends c {
    public i(char[] cArr) {
        super(cArr);
    }

    public static i l(String str) {
        i iVar = new i(str.toCharArray());
        iVar.k(0L);
        iVar.j(str.length() - 1);
        return iVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && b().equals(((i) obj).b())) {
            return true;
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
