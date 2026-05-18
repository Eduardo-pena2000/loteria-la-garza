package kotlin.jvm.internal;

import Xa.h;
import Xa.j;
import Xa.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class w extends A implements Xa.h {
    public w(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public Xa.b computeReflected() {
        return P.d(this);
    }

    public Object getDelegate() {
        return ((Xa.h) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ j.a getGetter() {
        getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ Xa.g getSetter() {
        getSetter();
        return null;
    }

    public Object invoke() {
        return get();
    }

    public k.a getGetter() {
        ((Xa.h) getReflected()).getGetter();
        return null;
    }

    public h.a getSetter() {
        ((Xa.h) getReflected()).getSetter();
        return null;
    }
}
