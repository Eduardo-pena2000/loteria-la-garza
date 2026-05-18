package kotlin.jvm.internal;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class f implements Xa.b, Serializable {
    public static final Object NO_RECEIVER = a.a();
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient Xa.b reflected;
    private final String signature;

    public static class a implements Serializable {
        public static final a a = new a();

        public static /* synthetic */ a a() {
            return a;
        }
    }

    public f(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public Xa.b compute() {
        Xa.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        Xa.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract Xa.b computeReflected();

    public List getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public Xa.e getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? P.c(cls) : P.b(cls);
    }

    public List getParameters() {
        return getReflected().getParameters();
    }

    public Xa.b getReflected() {
        Xa.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new Pa.b();
    }

    public Xa.n getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    public List getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public Xa.o getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
