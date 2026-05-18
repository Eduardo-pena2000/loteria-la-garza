package y2;

import android.view.ViewGroup;
import androidx.fragment.app.p;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n extends m {
    public final ViewGroup b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, ViewGroup viewGroup) {
        super(pVar, "Attempting to add fragment " + pVar + " to container " + viewGroup + " which is not a FragmentContainerView");
        t.g(pVar, "fragment");
        t.g(viewGroup, "container");
        this.b = viewGroup;
    }
}
