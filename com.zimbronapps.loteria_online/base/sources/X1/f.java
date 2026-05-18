package x1;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class f extends b implements Iterable {

    public static class a implements Iterator {
        public f a;
        public int b = 0;

        public a(f fVar) {
            this.a = fVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d next() {
            d dVar = (d) this.a.f.get(this.b);
            this.b++;
            return dVar;
        }

        public boolean hasNext() {
            return this.b < this.a.size();
        }
    }

    public f(char[] cArr) {
        super(cArr);
    }

    /* renamed from: I, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public f m() {
        return (f) super.clone();
    }

    public Iterator iterator() {
        return new a(this);
    }
}
