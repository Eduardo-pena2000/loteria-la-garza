package C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface d {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final z.i b = z.j.h(0.0f, 0.0f, null, 7, null);
        public static final d c = new a();

        public static final class a implements d {
        }

        public final float a(float f, float f2, float f3) {
            float f4 = f2 + f;
            if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
                return 0.0f;
            }
            float f5 = f4 - f3;
            return Math.abs(f) < Math.abs(f5) ? f : f5;
        }

        public final d b() {
            return c;
        }

        public final z.i c() {
            return b;
        }
    }

    default float a(float f, float f2, float f3) {
        return a.a(f, f2, f3);
    }

    default z.i b() {
        return a.c();
    }
}
