package l0;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class y implements Set, Ra.f {
    public final G a;

    public y(G g) {
        this.a = g;
    }

    public final G a() {
        return this.a;
    }

    public int b() {
        return this.a.size();
    }

    public void clear() {
        this.a.clear();
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final /* bridge */ int size() {
        return b();
    }

    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    public Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.j.b(this, objArr);
    }
}
