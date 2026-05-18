package sb;

import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class s0 implements qb.e, l {
    public final qb.e a;
    public final String b;
    public final Set c;

    public s0(qb.e original) {
        kotlin.jvm.internal.t.g(original, "original");
        this.a = original;
        this.b = original.h() + '?';
        this.c = e0.a(original);
    }

    public Set a() {
        return this.c;
    }

    public boolean b() {
        return true;
    }

    public int c(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        return this.a.c(name);
    }

    public int d() {
        return this.a.d();
    }

    public String e(int i) {
        return this.a.e(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && kotlin.jvm.internal.t.c(this.a, ((s0) obj).a);
    }

    public List f(int i) {
        return this.a.f(i);
    }

    public qb.e g(int i) {
        return this.a.g(i);
    }

    public List getAnnotations() {
        return this.a.getAnnotations();
    }

    public qb.l getKind() {
        return this.a.getKind();
    }

    public String h() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode() * 31;
    }

    public boolean i(int i) {
        return this.a.i(i);
    }

    public boolean isInline() {
        return this.a.isInline();
    }

    public final qb.e j() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
