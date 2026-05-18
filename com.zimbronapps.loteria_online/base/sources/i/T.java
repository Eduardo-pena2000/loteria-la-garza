package I;

import androidx.compose.ui.layout.A;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t implements androidx.compose.ui.layout.A {
    public final p a;
    public final Map b = new LinkedHashMap();

    public t(p pVar) {
        this.a = pVar;
    }

    public void a(A.a aVar) {
        this.b.clear();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            Object c = this.a.c(it.next());
            Integer num = (Integer) this.b.get(c);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                this.b.put(c, Integer.valueOf(intValue + 1));
            }
        }
    }

    public boolean b(Object obj, Object obj2) {
        return kotlin.jvm.internal.t.c(this.a.c(obj), this.a.c(obj2));
    }
}
