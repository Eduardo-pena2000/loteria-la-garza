package M2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class r {
    public final h a;
    public final int b;
    public final int c;
    public final float d;
    public final long e;

    public static final class b {
        public h a;
        public int b;
        public int c;
        public float d = 1.0f;
        public long e;

        public b(h hVar, int i, int i2) {
            this.a = hVar;
            this.b = i;
            this.c = i2;
        }

        public r a() {
            return new r(this.a, this.b, this.c, this.d, this.e, null);
        }

        public b b(float f) {
            this.d = f;
            return this;
        }
    }

    public /* synthetic */ r(h hVar, int i, int i2, float f, long j, a aVar) {
        this(hVar, i, i2, f, j);
    }

    public r(h hVar, int i, int i2, float f, long j) {
        P2.a.b(i > 0, "width must be positive, but is: " + i);
        P2.a.b(i2 > 0, "height must be positive, but is: " + i2);
        this.a = hVar;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = j;
    }
}
