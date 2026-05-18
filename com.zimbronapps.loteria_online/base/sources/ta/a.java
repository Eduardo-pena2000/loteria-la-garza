package Ta;

import Xa.j;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a implements b {
    public Object a;

    public a(Object obj) {
        this.a = obj;
    }

    public Object a(Object obj, j property) {
        t.g(property, "property");
        return this.a;
    }

    public abstract void b(j jVar, Object obj, Object obj2);

    public boolean c(j property, Object obj, Object obj2) {
        t.g(property, "property");
        return true;
    }

    public void d(Object obj, j property, Object obj2) {
        t.g(property, "property");
        Object obj3 = this.a;
        if (c(property, obj3, obj2)) {
            this.a = obj2;
            b(property, obj3, obj2);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.a + ')';
    }
}
