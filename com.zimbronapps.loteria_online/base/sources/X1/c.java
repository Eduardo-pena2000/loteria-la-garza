package x1;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c implements Cloneable {
    public final char[] a;
    public long b = -1;
    public long c = Long.MAX_VALUE;
    public b d;
    public int e;

    public c(char[] cArr) {
        this.a = cArr;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c clone() {
        try {
            return (c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String b() {
        String str = new String(this.a);
        if (str.length() < 1) {
            return "";
        }
        long j = this.c;
        if (j != Long.MAX_VALUE) {
            long j2 = this.b;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.b;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public float c() {
        if (this instanceof e) {
            return ((e) this).c();
        }
        return Float.NaN;
    }

    public int e() {
        if (this instanceof e) {
            return ((e) this).e();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b == cVar.b && this.c == cVar.c && this.e == cVar.e && Arrays.equals(this.a, cVar.a)) {
            return Objects.equals(this.d, cVar.d);
        }
        return false;
    }

    public int f() {
        return this.e;
    }

    public String g() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public boolean h() {
        char[] cArr = this.a;
        return cArr != null && cArr.length >= 1;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.a) * 31;
        long j = this.b;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        b bVar = this.d;
        return ((i2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.e;
    }

    public void i(b bVar) {
        this.d = bVar;
    }

    public void j(long j) {
        if (this.c != Long.MAX_VALUE) {
            return;
        }
        this.c = j;
        if (g.a) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.l(this);
        }
    }

    public void k(long j) {
        this.b = j;
    }

    public String toString() {
        long j = this.b;
        long j2 = this.c;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.b + "-" + this.c + ")";
        }
        return g() + " (" + this.b + " : " + this.c + ") <<" + new String(this.a).substring((int) this.b, ((int) this.c) + 1) + ">>";
    }
}
