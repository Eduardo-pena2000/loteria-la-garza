package S1;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class f implements e {
    public final Object[] a;
    public int b;

    public f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    public boolean a(Object obj) {
        t.g(obj, "instance");
        if (c(obj)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.b = i + 1;
        return true;
    }

    public Object b() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = this.a[i2];
        t.e(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.a[i2] = null;
        this.b--;
        return obj;
    }

    public final boolean c(Object obj) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] == obj) {
                return true;
            }
        }
        return false;
    }
}
