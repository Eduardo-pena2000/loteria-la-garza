package I;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface e {

    public static final class a {
        public final int a;
        public final int b;
        public final Object c;

        public a(int i, int i2, Object obj) {
            this.a = i;
            this.b = i2;
            this.c = obj;
            if (i < 0) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i).toString());
            }
            if (i2 > 0) {
                return;
            }
            throw new IllegalArgumentException(("size should be >0, but was " + i2).toString());
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final Object c() {
            return this.c;
        }
    }

    void a(int i, int i2, Qa.l lVar);

    a get(int i);

    int getSize();
}
