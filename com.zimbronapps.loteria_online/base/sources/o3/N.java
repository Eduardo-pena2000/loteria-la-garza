package o3;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n {
    public final int a;
    public final int b;
    public final String c;

    public n(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public static n a(P2.z zVar) {
        String str;
        zVar.U(2);
        int G = zVar.G();
        int i = G >> 1;
        int G2 = ((zVar.G() >> 3) & 31) | ((G & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(G2 >= 10 ? "." : ".0");
        sb.append(G2);
        return new n(i, G2, sb.toString());
    }
}
