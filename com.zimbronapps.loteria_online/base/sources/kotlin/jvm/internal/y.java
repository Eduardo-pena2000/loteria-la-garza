package kotlin.jvm.internal;

import Xa.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class y extends A implements Xa.i {
    public y(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public Xa.b computeReflected() {
        return P.e(this);
    }

    public Object getDelegate(Object obj) {
        return ((Xa.i) getReflected()).getDelegate(obj);
    }

    public l.a getGetter() {
        ((Xa.i) getReflected()).getGetter();
        return null;
    }

    public Object invoke(Object obj) {
        return get(obj);
    }
}
