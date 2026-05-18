package y5;

import java.util.Arrays;
import y5.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j extends t {
    public final long a;
    public final Integer b;
    public final p c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final w h;
    public final q i;

    public static final class b extends t.a {
        public Long a;
        public Integer b;
        public p c;
        public Long d;
        public byte[] e;
        public String f;
        public Long g;
        public w h;
        public q i;

        public t a() {
            String str = "";
            if (this.a == null) {
                str = " eventTimeMs";
            }
            if (this.d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.a.longValue(), this.b, this.c, this.d.longValue(), this.e, this.f, this.g.longValue(), this.h, this.i, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public t.a b(p pVar) {
            this.c = pVar;
            return this;
        }

        public t.a c(Integer num) {
            this.b = num;
            return this;
        }

        public t.a d(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public t.a e(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        public t.a f(q qVar) {
            this.i = qVar;
            return this;
        }

        public t.a g(w wVar) {
            this.h = wVar;
            return this;
        }

        public t.a h(byte[] bArr) {
            this.e = bArr;
            return this;
        }

        public t.a i(String str) {
            this.f = str;
            return this;
        }

        public t.a j(long j) {
            this.g = Long.valueOf(j);
            return this;
        }
    }

    public /* synthetic */ j(long j, Integer num, p pVar, long j2, byte[] bArr, String str, long j3, w wVar, q qVar, a aVar) {
        this(j, num, pVar, j2, bArr, str, j3, wVar, qVar);
    }

    public p b() {
        return this.c;
    }

    public Integer c() {
        return this.b;
    }

    public long d() {
        return this.a;
    }

    public long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.a == tVar.d() && ((num = this.b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.d == tVar.e()) {
            if (Arrays.equals(this.e, tVar instanceof j ? ((j) tVar).e : tVar.h()) && ((str = this.f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.g == tVar.j() && ((wVar = this.h) != null ? wVar.equals(tVar.g()) : tVar.g() == null)) {
                q qVar = this.i;
                if (qVar == null) {
                    if (tVar.f() == null) {
                        return true;
                    }
                } else if (qVar.equals(tVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    public q f() {
        return this.i;
    }

    public w g() {
        return this.h;
    }

    public byte[] h() {
        return this.e;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.c;
        int hashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j2 = this.d;
        int hashCode3 = (((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int hashCode4 = str == null ? 0 : str.hashCode();
        long j3 = this.g;
        int i2 = (((hashCode3 ^ hashCode4) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        w wVar = this.h;
        int hashCode5 = (i2 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.i;
        return hashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    public String i() {
        return this.f;
    }

    public long j() {
        return this.g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }

    public j(long j, Integer num, p pVar, long j2, byte[] bArr, String str, long j3, w wVar, q qVar) {
        this.a = j;
        this.b = num;
        this.c = pVar;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = wVar;
        this.i = qVar;
    }
}
