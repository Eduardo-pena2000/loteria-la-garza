package lb;

import hb.D;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class g {
    public static final D a = new D("NO_OWNER");
    public static final D b = new D("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z) {
        return new f(z);
    }

    public static /* synthetic */ a b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return a(z);
    }

    public static final /* synthetic */ D c() {
        return a;
    }
}
