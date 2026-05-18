package w8;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class u {
    public final long a;
    public final long b;

    public static class b {
        public long a = 60;
        public long b = com.google.firebase.remoteconfig.internal.c.j;

        public static /* synthetic */ long a(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ long b(b bVar) {
            return bVar.b;
        }

        public u c() {
            return new u(this, null);
        }

        public b d(long j) {
            if (j < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j)}));
            }
            this.a = j;
            return this;
        }

        public b e(long j) {
            if (j >= 0) {
                this.b = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    public /* synthetic */ u(b bVar, a aVar) {
        this(bVar);
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public u(b bVar) {
        this.a = b.a(bVar);
        this.b = b.b(bVar);
    }
}
