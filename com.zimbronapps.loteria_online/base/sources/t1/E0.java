package T1;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e0 {

    public static final class a implements Ya.h {
        public final /* synthetic */ ViewGroup a;

        public a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        public Iterator iterator() {
            return e0.b(this.a);
        }
    }

    public static final class b implements Iterator, Ra.a {
        public int a;
        public final /* synthetic */ ViewGroup b;

        public b(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.b;
            int i = this.a;
            this.a = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.a < this.b.getChildCount();
        }

        public void remove() {
            ViewGroup viewGroup = this.b;
            int i = this.a - 1;
            this.a = i;
            viewGroup.removeViewAt(i);
        }
    }

    public static final Ya.h a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final Iterator b(ViewGroup viewGroup) {
        return new b(viewGroup);
    }
}
