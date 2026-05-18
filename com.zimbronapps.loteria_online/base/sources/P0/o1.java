package P0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o1 implements Ya.h {
    public final List a = new ArrayList();

    public final void c(String str, Object obj) {
        this.a.add(new n1(str, obj));
    }

    public Iterator iterator() {
        return this.a.iterator();
    }
}
