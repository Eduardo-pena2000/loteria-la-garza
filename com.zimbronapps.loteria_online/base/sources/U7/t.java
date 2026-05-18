package U7;

import U7.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class t extends F.e.d.a.c {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public static final class b extends F.e.d.a.c.a {
        public String a;
        public int b;
        public int c;
        public boolean d;
        public byte e;

        public F.e.d.a.c a() {
            String str;
            if (this.e == 7 && (str = this.a) != null) {
                return new t(str, this.b, this.c, this.d, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" processName");
            }
            if ((this.e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.e.d.a.c.a b(boolean z) {
            this.d = z;
            this.e = (byte) (this.e | 4);
            return this;
        }

        public F.e.d.a.c.a c(int i) {
            this.c = i;
            this.e = (byte) (this.e | 2);
            return this;
        }

        public F.e.d.a.c.a d(int i) {
            this.b = i;
            this.e = (byte) (this.e | 1);
            return this;
        }

        public F.e.d.a.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ t(String str, int i, int i2, boolean z, a aVar) {
        this(str, i, i2, z);
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.c)) {
            return false;
        }
        F.e.d.a.c cVar = (F.e.d.a.c) obj;
        return this.a.equals(cVar.d()) && this.b == cVar.c() && this.c == cVar.b() && this.d == cVar.e();
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", defaultProcess=" + this.d + "}";
    }

    public t(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }
}
