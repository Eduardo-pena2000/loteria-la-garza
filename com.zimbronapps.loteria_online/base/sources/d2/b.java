package D2;

import Ca.q;
import Ca.x;
import Da.S;
import P1.d;
import android.os.Bundle;
import fb.z;
import j4.f;
import j4.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final f.b e;

    public b(Map map) {
        t.g(map, "initialState");
        this.a = S.C(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new a(this);
    }

    public static /* synthetic */ Bundle a(b bVar) {
        return c(bVar);
    }

    public static final Bundle c(b bVar) {
        q[] qVarArr;
        for (Map.Entry entry : S.z(bVar.d).entrySet()) {
            bVar.d((String) entry.getKey(), ((z) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : S.z(bVar.b).entrySet()) {
            bVar.d((String) entry2.getKey(), ((f.b) entry2.getValue()).a());
        }
        Map map = bVar.a;
        if (map.isEmpty()) {
            qVarArr = new q[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(x.a((String) entry3.getKey(), entry3.getValue()));
            }
            qVarArr = (q[]) arrayList.toArray(new q[0]);
        }
        Bundle a = d.a((q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        j.a(a);
        return a;
    }

    public final f.b b() {
        return this.e;
    }

    public final void d(String str, Object obj) {
        t.g(str, "key");
        this.a.put(str, obj);
        z zVar = (z) this.c.get(str);
        if (zVar != null) {
            zVar.setValue(obj);
        }
        z zVar2 = (z) this.d.get(str);
        if (zVar2 != null) {
            zVar2.setValue(obj);
        }
    }

    public /* synthetic */ b(Map map, int i, k kVar) {
        this((i & 1) != 0 ? S.h() : map);
    }
}
