package T8;

import Q8.l;
import T8.a;
import V8.e;
import V8.h;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class c implements a {
    public final a a;

    public c(a aVar) {
        this.a = aVar;
    }

    public JSONObject a(View view) {
        JSONObject c = V8.c.c(0, 0, 0, 0);
        V8.c.e(c, e.a());
        return c;
    }

    public ArrayList b() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        S8.c e = S8.c.e();
        if (e != null) {
            Collection a = e.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a.size() * 2) + 3);
            Iterator it = a.iterator();
            while (it.hasNext()) {
                View h = ((l) it.next()).h();
                if (h != null && h.e(h) && (rootView = h.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c((View) arrayList.get(size - 1)) > c) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    public void a(View view, JSONObject jSONObject, a.a aVar, boolean z, boolean z2) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            aVar.a((View) it.next(), this.a, jSONObject, z2);
        }
    }
}
