package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class m {
    public static volatile m b;
    public static final m c = new m(true);
    public final Map a = Collections.emptyMap();

    public static final class a {
        public final Object a;
        public final int b;

        public a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    public m(boolean z) {
    }

    public static m b() {
        if (W.d) {
            return c;
        }
        m mVar = b;
        if (mVar == null) {
            synchronized (m.class) {
                try {
                    mVar = b;
                    if (mVar == null) {
                        mVar = l.a();
                        b = mVar;
                    }
                } finally {
                }
            }
        }
        return mVar;
    }

    public t.c a(K k, int i) {
        android.support.v4.media.session.b.a(this.a.get(new a(k, i)));
        return null;
    }
}
