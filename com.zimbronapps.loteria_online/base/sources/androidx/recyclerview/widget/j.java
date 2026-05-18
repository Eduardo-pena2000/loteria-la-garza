package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j {
    public static int a(RecyclerView.y yVar, h hVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.I() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.f0(view) - oVar.f0(view2)) + 1;
        }
        return Math.min(hVar.n(), hVar.d(view2) - hVar.g(view));
    }

    public static int b(RecyclerView.y yVar, h hVar, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.I() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (yVar.b() - Math.max(oVar.f0(view), oVar.f0(view2))) - 1) : Math.max(0, Math.min(oVar.f0(view), oVar.f0(view2)));
        if (z) {
            return Math.round((max * (Math.abs(hVar.d(view2) - hVar.g(view)) / (Math.abs(oVar.f0(view) - oVar.f0(view2)) + 1))) + (hVar.m() - hVar.g(view)));
        }
        return max;
    }

    public static int c(RecyclerView.y yVar, h hVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.I() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return yVar.b();
        }
        return (int) (((hVar.d(view2) - hVar.g(view)) / (Math.abs(oVar.f0(view) - oVar.f0(view2)) + 1)) * yVar.b());
    }
}
