package i1;

import Z0.b1;
import Z0.e;
import Z0.j;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w {
    public final WeakHashMap a = new WeakHashMap();
    public final WeakHashMap b = new WeakHashMap();
    public final WeakHashMap c = new WeakHashMap();

    public final ClickableSpan a(e.d dVar) {
        WeakHashMap weakHashMap = this.c;
        Object obj = weakHashMap.get(dVar);
        if (obj == null) {
            obj = new n((Z0.j) dVar.g());
            weakHashMap.put(dVar, obj);
        }
        return (ClickableSpan) obj;
    }

    public final URLSpan b(e.d dVar) {
        WeakHashMap weakHashMap = this.b;
        Object obj = weakHashMap.get(dVar);
        if (obj == null) {
            obj = new URLSpan(((j.b) dVar.g()).c());
            weakHashMap.put(dVar, obj);
        }
        return (URLSpan) obj;
    }

    public final URLSpan c(b1 b1Var) {
        WeakHashMap weakHashMap = this.a;
        Object obj = weakHashMap.get(b1Var);
        if (obj == null) {
            obj = new URLSpan(b1Var.a());
            weakHashMap.put(b1Var, obj);
        }
        return (URLSpan) obj;
    }
}
