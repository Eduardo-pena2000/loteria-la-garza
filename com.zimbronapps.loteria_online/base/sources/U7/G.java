package U7;

import U7.F;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g extends F.d.b {
    public final String a;
    public final byte[] b;

    public static final class b extends F.d.b.a {
        public String a;
        public byte[] b;

        public F.d.b a() {
            byte[] bArr;
            String str = this.a;
            if (str != null && (bArr = this.b) != null) {
                return new g(str, bArr, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" filename");
            }
            if (this.b == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.b = bArr;
            return this;
        }

        public F.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ g(String str, byte[] bArr, a aVar) {
        this(str, bArr);
    }

    public byte[] b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.d.b)) {
            return false;
        }
        F.d.b bVar = (F.d.b) obj;
        if (this.a.equals(bVar.c())) {
            if (Arrays.equals(this.b, bVar instanceof g ? ((g) bVar).b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }

    public g(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }
}
