package qb;

import Da.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a {
    public final String a;
    public List b;
    public final List c;
    public final Set d;
    public final List e;
    public final List f;
    public final List g;

    public a(String serialName) {
        t.g(serialName, "serialName");
        this.a = serialName;
        this.b = v.n();
        this.c = new ArrayList();
        this.d = new HashSet();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public static /* synthetic */ void b(a aVar, String str, e eVar, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = v.n();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        aVar.a(str, eVar, list, z);
    }

    public final void a(String elementName, e descriptor, List annotations, boolean z) {
        t.g(elementName, "elementName");
        t.g(descriptor, "descriptor");
        t.g(annotations, "annotations");
        if (this.d.add(elementName)) {
            this.c.add(elementName);
            this.e.add(descriptor);
            this.f.add(annotations);
            this.g.add(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.a).toString());
    }

    public final List c() {
        return this.b;
    }

    public final List d() {
        return this.f;
    }

    public final List e() {
        return this.e;
    }

    public final List f() {
        return this.c;
    }

    public final List g() {
        return this.g;
    }

    public final void h(List list) {
        t.g(list, "<set-?>");
        this.b = list;
    }
}
