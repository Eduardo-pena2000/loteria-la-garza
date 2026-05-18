package io.flutter.view;

import io.flutter.view.j;
import java.util.function.Predicate;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class h implements Predicate {
    public final /* synthetic */ j.k a;

    public /* synthetic */ h(j.k kVar) {
        this.a = kVar;
    }

    public final boolean test(Object obj) {
        return j.a(this.a, (j.k) obj);
    }
}
