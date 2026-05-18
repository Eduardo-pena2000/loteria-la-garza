package W5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class o extends y {
    public final int a;
    public final int b;
    public final double c;
    public final boolean d;

    public o(int i, int i2, double d, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = d;
        this.d = z;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.a == yVar.a() && this.b == yVar.b() && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(yVar.c()) && this.d == yVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.c;
        return ((((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32))) ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003)) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        double d = this.c;
        int length3 = String.valueOf(d).length();
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z).length() + 1);
        sb.append("PingStrategy{maxAttempts=");
        sb.append(i);
        sb.append(", initialBackoffMs=");
        sb.append(i2);
        sb.append(", backoffMultiplier=");
        sb.append(d);
        sb.append(", bufferAfterMaxAttempts=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
