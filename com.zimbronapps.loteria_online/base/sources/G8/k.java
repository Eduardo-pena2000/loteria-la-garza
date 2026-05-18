package G8;

import java.math.BigInteger;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class k extends f {
    public final Object a;

    public k(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean m(k kVar) {
        Object obj = kVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.a == null) {
            return kVar.a == null;
        }
        if (m(this) && m(kVar)) {
            return j().longValue() == kVar.j().longValue();
        }
        Object obj2 = this.a;
        if (!(obj2 instanceof Number) || !(kVar.a instanceof Number)) {
            return obj2.equals(kVar.a);
        }
        double doubleValue = j().doubleValue();
        double doubleValue2 = kVar.j().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (m(this)) {
            doubleToLongBits = j().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(j().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean i() {
        return l() ? ((Boolean) this.a).booleanValue() : Boolean.parseBoolean(k());
    }

    public Number j() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new I8.f((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public String k() {
        Object obj = this.a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (n()) {
            return j().toString();
        }
        if (l()) {
            return ((Boolean) this.a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.a.getClass());
    }

    public boolean l() {
        return this.a instanceof Boolean;
    }

    public boolean n() {
        return this.a instanceof Number;
    }

    public boolean o() {
        return this.a instanceof String;
    }

    public k(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public k(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }
}
