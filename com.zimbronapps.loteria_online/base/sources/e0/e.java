package e0;

import Qa.l;
import java.util.Collection;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface e extends c, b {

    public interface a extends List, Collection, Ra.b, Ra.d {
        e build();
    }

    e G(int i);

    e add(int i, Object obj);

    e add(Object obj);

    e addAll(Collection collection);

    e b1(l lVar);

    a d();

    e remove(Object obj);

    e removeAll(Collection collection);

    e set(int i, Object obj);
}
