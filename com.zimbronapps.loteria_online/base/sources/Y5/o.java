package y5;

import y5.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(y5.a aVar);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        public final int a;

        b(int i) {
            this.a = i;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract y5.a b();

    public abstract b c();
}
