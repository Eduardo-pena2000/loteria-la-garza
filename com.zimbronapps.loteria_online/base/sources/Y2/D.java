package y2;

import android.view.ViewGroup;
import androidx.fragment.app.p;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d extends m {
    public final ViewGroup b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, ViewGroup viewGroup) {
        super(pVar, "Attempting to use <fragment> tag to add fragment " + pVar + " to container " + viewGroup);
        t.g(pVar, "fragment");
        this.b = viewGroup;
    }
}
