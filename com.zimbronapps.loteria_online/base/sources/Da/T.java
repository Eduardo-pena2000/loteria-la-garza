package Da;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class t implements Iterator, Ra.a {
    public abstract char a();

    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
