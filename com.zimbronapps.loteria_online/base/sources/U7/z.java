package U7;

import U7.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class z extends F.e.e {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public static final class b extends F.e.e.a {
        public int a;
        public String b;
        public String c;
        public boolean d;
        public byte e;

        public F.e.e a() {
            String str;
            String str2;
            if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
                return new z(this.a, str, str2, this.d, null);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.b == null) {
                sb.append(" version");
            }
            if (this.c == null) {
                sb.append(" buildVersion");
            }
            if ((this.e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.e.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.c = str;
            return this;
        }

        public F.e.e.a c(boolean z) {
            this.d = z;
            this.e = (byte) (this.e | 2);
            return this;
        }

        public F.e.e.a d(int i) {
            this.a = i;
            this.e = (byte) (this.e | 1);
            return this;
        }

        public F.e.e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.b = str;
            return this;
        }
    }

    public /* synthetic */ z(int i, String str, String str2, boolean z, a aVar) {
        this(i, str, str2, z);
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.e)) {
            return false;
        }
        F.e.e eVar = (F.e.e) obj;
        return this.a == eVar.c() && this.b.equals(eVar.d()) && this.c.equals(eVar.b()) && this.d == eVar.e();
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }

    public z(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
