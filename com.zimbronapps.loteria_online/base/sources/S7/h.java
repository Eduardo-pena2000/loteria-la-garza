package s7;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class h {
    public final String a;

    public h(String str) {
        this.a = (String) m.j(str);
    }

    public static h f(char c) {
        return new h(String.valueOf(c));
    }

    public static h g(String str) {
        return new h(str);
    }

    public Appendable a(Appendable appendable, Iterator it) {
        m.j(appendable);
        if (it.hasNext()) {
            appendable.append(h(it.next()));
            while (it.hasNext()) {
                appendable.append(this.a);
                appendable.append(h(it.next()));
            }
        }
        return appendable;
    }

    public final StringBuilder b(StringBuilder sb, Iterable iterable) {
        return c(sb, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb, Iterator it) {
        try {
            a(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String d(Iterable iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator it) {
        return c(new StringBuilder(), it).toString();
    }

    public CharSequence h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
