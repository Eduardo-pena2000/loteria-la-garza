package com.iab.omid.library.applovin.processor;

import android.view.View;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class c implements a {
    private final a a;

    public c(a aVar) {
        this.a = aVar;
    }

    public ArrayList a() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        com.iab.omid.library.applovin.internal.c c = com.iab.omid.library.applovin.internal.c.c();
        if (c != null) {
            Collection a = c.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a.size() * 2) + 3);
            Iterator it = a.iterator();
            while (it.hasNext()) {
                View e = ((com.iab.omid.library.applovin.adsession.a) it.next()).e();
                if (e != null && h.g(e) && (rootView = e.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float d = h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.d((View) arrayList.get(size - 1)) > d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    public JSONObject a(View view) {
        JSONObject a = com.iab.omid.library.applovin.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.applovin.utils.c.a(a, e.a());
        return a;
    }

    public void a(View view, JSONObject jSONObject, a.a aVar, boolean z, boolean z2) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            aVar.a((View) it.next(), this.a, jSONObject, z2);
        }
    }
}
