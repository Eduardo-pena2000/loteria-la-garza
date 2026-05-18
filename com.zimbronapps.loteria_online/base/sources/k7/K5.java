package k7;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum k5 {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    public final int a;

    k5(int i) {
        this.a = i;
    }

    public static k5 a(int i) {
        for (k5 k5Var : values()) {
            if (k5Var.a == i) {
                return k5Var;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.a;
    }
}
