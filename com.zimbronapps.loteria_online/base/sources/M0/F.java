package M0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface f {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final f b = new a();
        public static final f c = new e();
        public static final f d = new c();
        public static final f e = new d();
        public static final f f = new f();
        public static final i g = new i(1.0f);
        public static final f h = new b();

        public static final class a implements f {
            public long a(long j, long j2) {
                float a = g.a(j, j2);
                return P.a((Float.floatToRawIntBits(a) << 32) | (4294967295L & Float.floatToRawIntBits(a)));
            }
        }

        public static final class b implements f {
            public long a(long j, long j2) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                return P.a((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
            }
        }

        public static final class c implements f {
            public long a(long j, long j2) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                return P.a((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
            }
        }

        public static final class d implements f {
            public long a(long j, long j2) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                return P.a((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
            }
        }

        public static final class e implements f {
            public long a(long j, long j2) {
                float b = g.b(j, j2);
                return P.a((Float.floatToRawIntBits(b) << 32) | (4294967295L & Float.floatToRawIntBits(b)));
            }
        }

        public static final class f implements f {
            public long a(long j, long j2) {
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    return P.a((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
                }
                float b = g.b(j, j2);
                return P.a((Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(b) & 4294967295L));
            }
        }

        public final f a() {
            return b;
        }

        public final f b() {
            return c;
        }

        public final f c() {
            return f;
        }

        public final i d() {
            return g;
        }
    }

    long a(long j, long j2);
}
