package z5;

import java.util.Arrays;
import java.util.Map;
import z5.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b extends i {
    public final String a;
    public final Integer b;
    public final h c;
    public final long d;
    public final long e;
    public final Map f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public static final class b extends i.a {
        public String a;
        public Integer b;
        public h c;
        public Long d;
        public Long e;
        public Map f;
        public Integer g;
        public String h;
        public byte[] i;
        public byte[] j;

        public i d() {
            String str = "";
            if (this.a == null) {
                str = " transportName";
            }
            if (this.c == null) {
                str = str + " encodedPayload";
            }
            if (this.d == null) {
                str = str + " eventMillis";
            }
            if (this.e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f, this.g, this.h, this.i, this.j, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public Map e() {
            Map map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        public i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f = map;
            return this;
        }

        public i.a g(Integer num) {
            this.b = num;
            return this;
        }

        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.c = hVar;
            return this;
        }

        public i.a i(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        public i.a j(byte[] bArr) {
            this.i = bArr;
            return this;
        }

        public i.a k(byte[] bArr) {
            this.j = bArr;
            return this;
        }

        public i.a l(Integer num) {
            this.g = num;
            return this;
        }

        public i.a m(String str) {
            this.h = str;
            return this;
        }

        public i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.a = str;
            return this;
        }

        public i.a o(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    public /* synthetic */ b(String str, Integer num, h hVar, long j, long j2, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2, a aVar) {
        this(str, num, hVar, j, j2, map, num2, str2, bArr, bArr2);
    }

    public Map c() {
        return this.f;
    }

    public Integer d() {
        return this.b;
    }

    public h e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a.equals(iVar.n()) && ((num = this.b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.c.equals(iVar.e()) && this.d == iVar.f() && this.e == iVar.o() && this.f.equals(iVar.c()) && ((num2 = this.g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
            boolean z = iVar instanceof b;
            if (Arrays.equals(this.i, z ? ((b) iVar).i : iVar.g())) {
                if (Arrays.equals(this.j, z ? ((b) iVar).j : iVar.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    public long f() {
        return this.d;
    }

    public byte[] g() {
        return this.i;
    }

    public byte[] h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int hashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public Integer l() {
        return this.g;
    }

    public String m() {
        return this.h;
    }

    public String n() {
        return this.a;
    }

    public long o() {
        return this.e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }

    public b(String str, Integer num, h hVar, long j, long j2, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = hVar;
        this.d = j;
        this.e = j2;
        this.f = map;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }
}
