package Tb;

import Sb.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class g {
    public final List a = new ArrayList();

    public static g b() {
        return new g();
    }

    public static g g(f fVar) {
        g gVar = new g();
        gVar.a(fVar);
        return gVar;
    }

    public static g h(List list) {
        g gVar = new g();
        gVar.a.addAll(list);
        return gVar;
    }

    public void a(f fVar) {
        this.a.add(fVar);
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.a.size(); i++) {
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(((f) this.a.get(i)).a());
        }
        return sb.toString();
    }

    public List d() {
        return this.a;
    }

    public List e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            x b = ((f) it.next()).b();
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public boolean f() {
        return this.a.isEmpty();
    }
}
