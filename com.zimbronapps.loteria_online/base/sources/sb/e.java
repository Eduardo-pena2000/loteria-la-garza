package sb;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class e extends q {
    public final qb.e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ob.b element) {
        super(element);
        kotlin.jvm.internal.t.g(element, "element");
        this.b = new d(element.getDescriptor());
    }

    public qb.e getDescriptor() {
        return this.b;
    }

    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        kotlin.jvm.internal.t.g(arrayList, "<this>");
        return arrayList.size();
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i) {
        kotlin.jvm.internal.t.g(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList arrayList, int i, Object obj) {
        kotlin.jvm.internal.t.g(arrayList, "<this>");
        arrayList.add(i, obj);
    }

    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList k(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public List l(ArrayList arrayList) {
        kotlin.jvm.internal.t.g(arrayList, "<this>");
        return arrayList;
    }
}
