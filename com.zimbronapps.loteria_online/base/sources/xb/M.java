package xb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class m extends l {
    public final l e;

    public m(l delegate) {
        kotlin.jvm.internal.t.g(delegate, "delegate");
        this.e = delegate;
    }

    public J b(C file, boolean z) {
        kotlin.jvm.internal.t.g(file, "file");
        return this.e.b(r(file, "appendingSink", "file"), z);
    }

    public void c(C source, C target) {
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(target, "target");
        this.e.c(r(source, "atomicMove", "source"), r(target, "atomicMove", "target"));
    }

    public void g(C dir, boolean z) {
        kotlin.jvm.internal.t.g(dir, "dir");
        this.e.g(r(dir, "createDirectory", "dir"), z);
    }

    public void i(C path, boolean z) {
        kotlin.jvm.internal.t.g(path, "path");
        this.e.i(r(path, "delete", "path"), z);
    }

    public List k(C dir) {
        kotlin.jvm.internal.t.g(dir, "dir");
        List k = this.e.k(r(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = k.iterator();
        while (it.hasNext()) {
            arrayList.add(s((C) it.next(), "list"));
        }
        Da.z.B(arrayList);
        return arrayList;
    }

    public k m(C path) {
        kotlin.jvm.internal.t.g(path, "path");
        k m = this.e.m(r(path, "metadataOrNull", "path"));
        if (m == null) {
            return null;
        }
        return m.e() == null ? m : k.b(m, false, false, s(m.e(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    public j n(C file) {
        kotlin.jvm.internal.t.g(file, "file");
        return this.e.n(r(file, "openReadOnly", "file"));
    }

    public J p(C file, boolean z) {
        kotlin.jvm.internal.t.g(file, "file");
        return this.e.p(r(file, "sink", "file"), z);
    }

    public L q(C file) {
        kotlin.jvm.internal.t.g(file, "file");
        return this.e.q(r(file, "source", "file"));
    }

    public C r(C path, String functionName, String parameterName) {
        kotlin.jvm.internal.t.g(path, "path");
        kotlin.jvm.internal.t.g(functionName, "functionName");
        kotlin.jvm.internal.t.g(parameterName, "parameterName");
        return path;
    }

    public C s(C path, String functionName) {
        kotlin.jvm.internal.t.g(path, "path");
        kotlin.jvm.internal.t.g(functionName, "functionName");
        return path;
    }

    public String toString() {
        return kotlin.jvm.internal.P.b(getClass()).e() + '(' + this.e + ')';
    }
}
