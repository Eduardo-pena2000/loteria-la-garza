package P0;

import W0.h;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e1 {
    public static final c1 a(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((c1) list.get(i2)).d() == i) {
                return (c1) list.get(i2);
            }
        }
        return null;
    }

    public static final Float b(W0.m mVar) {
        Qa.l a;
        ArrayList arrayList = new ArrayList();
        W0.a aVar = (W0.a) W0.n.a(mVar, W0.l.a.h());
        if (aVar == null || (a = aVar.a()) == null || !((Boolean) a.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final Z0.T0 c(W0.m mVar) {
        Qa.l a;
        ArrayList arrayList = new ArrayList();
        W0.a aVar = (W0.a) W0.n.a(mVar, W0.l.a.i());
        if (aVar == null || (a = aVar.a()) == null || !((Boolean) a.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Z0.T0) arrayList.get(0);
    }

    public static final View d(T t, int i) {
        Object obj;
        Iterator it = t.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((O0.J) ((Map.Entry) obj).getKey()).y() == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (q1.b) entry.getValue();
        }
        return null;
    }

    public static final String e(int i) {
        h.a aVar = W0.h.b;
        if (W0.h.m(i, aVar.a())) {
            return "android.widget.Button";
        }
        if (W0.h.m(i, aVar.c())) {
            return "android.widget.CheckBox";
        }
        if (W0.h.m(i, aVar.f())) {
            return "android.widget.RadioButton";
        }
        if (W0.h.m(i, aVar.e())) {
            return "android.widget.ImageView";
        }
        if (W0.h.m(i, aVar.d())) {
            return "android.widget.Spinner";
        }
        if (W0.h.m(i, aVar.i())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
