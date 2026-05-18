package kotlin.jvm.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class p extends f implements o, Xa.f {
    private final int arity;
    private final int flags;

    public p(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public Xa.b computeReflected() {
        return P.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return getName().equals(pVar.getName()) && getSignature().equals(pVar.getSignature()) && this.flags == pVar.flags && this.arity == pVar.arity && t.c(getBoundReceiver(), pVar.getBoundReceiver()) && t.c(getOwner(), pVar.getOwner());
        }
        if (obj instanceof Xa.f) {
            return obj.equals(compute());
        }
        return false;
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        Xa.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public Xa.f getReflected() {
        return (Xa.f) super.getReflected();
    }
}
