package L5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public enum c {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);

    public final int a;

    c(int i) {
        this.a = i;
    }

    public static c a(int i) {
        for (c cVar : values()) {
            if (cVar.b() == i) {
                return cVar;
            }
        }
        return null;
    }

    public int b() {
        return this.a;
    }
}
