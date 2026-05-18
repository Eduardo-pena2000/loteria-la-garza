package T8;

import T8.a;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class d implements a {
    public final int[] a = new int[2];

    public JSONObject a(View view) {
        if (view == null) {
            return V8.c.c(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.a);
        int[] iArr = this.a;
        return V8.c.c(iArr[0], iArr[1], width, height);
    }

    public final void b(ViewGroup viewGroup, JSONObject jSONObject, a.a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    public final void c(ViewGroup viewGroup, JSONObject jSONObject, a.a aVar, boolean z) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                aVar.a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    public void a(View view, JSONObject jSONObject, a.a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                c(viewGroup, jSONObject, aVar, z2);
            } else {
                b(viewGroup, jSONObject, aVar, z2);
            }
        }
    }
}
