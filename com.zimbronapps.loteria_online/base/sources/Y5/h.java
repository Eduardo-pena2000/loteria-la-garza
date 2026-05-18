package y5;

import y5.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h extends r {
    public final Integer a;

    public static final class b extends r.a {
        public Integer a;

        public r a() {
            return new h(this.a, null);
        }

        public r.a b(Integer num) {
            this.a = num;
            return this;
        }
    }

    public /* synthetic */ h(Integer num, a aVar) {
        this(num);
    }

    public Integer b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.a;
        Integer b2 = ((r) obj).b();
        return num == null ? b2 == null : num.equals(b2);
    }

    public int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }

    public h(Integer num) {
        this.a = num;
    }
}
