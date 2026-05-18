package y5;

import java.util.Arrays;
import y5.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g extends q {
    public final byte[] a;
    public final byte[] b;

    public static final class b extends q.a {
        public byte[] a;
        public byte[] b;

        public q a() {
            return new g(this.a, this.b, null);
        }

        public q.a b(byte[] bArr) {
            this.a = bArr;
            return this;
        }

        public q.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    public /* synthetic */ g(byte[] bArr, byte[] bArr2, a aVar) {
        this(bArr, bArr2);
    }

    public byte[] b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        boolean z = qVar instanceof g;
        if (Arrays.equals(this.a, z ? ((g) qVar).a : qVar.b())) {
            if (Arrays.equals(this.b, z ? ((g) qVar).b : qVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }

    public g(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }
}
