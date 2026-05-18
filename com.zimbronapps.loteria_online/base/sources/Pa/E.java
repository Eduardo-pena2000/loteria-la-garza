package pa;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class e extends k {
    public ViewGroup h;
    public int i;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight != e.e(e.this)) {
                e eVar = e.this;
                eVar.b.s(eVar.a, measuredHeight);
            }
            e.f(e.this, measuredHeight);
        }
    }

    public e(int i, pa.a aVar, String str, j jVar, d dVar) {
        super(i, aVar, str, Collections.singletonList(new n(L5.h.p)), jVar, dVar);
        this.i = -1;
    }

    public static /* synthetic */ int e(e eVar) {
        return eVar.i;
    }

    public static /* synthetic */ int f(e eVar, int i) {
        eVar.i = i;
        return i;
    }

    public void a() {
        M5.b bVar = this.g;
        if (bVar != null) {
            bVar.a();
            this.g = null;
        }
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.h = null;
        }
    }

    public io.flutter.plugin.platform.i b() {
        if (this.g == null) {
            return null;
        }
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            return new C(viewGroup);
        }
        ScrollView g = g();
        if (g == null) {
            return null;
        }
        g.setClipChildren(false);
        g.setVerticalScrollBarEnabled(false);
        g.setHorizontalScrollBarEnabled(false);
        this.h = g;
        g.addView(this.g);
        return new C(this.g);
    }

    public ScrollView g() {
        if (this.b.f() != null) {
            return new ScrollView(this.b.f());
        }
        Log.e("FluidAdManagerBannerAd", "Tried to create container view before plugin is attached to an activity.");
        return null;
    }

    public void onAdLoaded() {
        M5.b bVar = this.g;
        if (bVar != null) {
            bVar.addOnLayoutChangeListener(new a());
            this.b.m(this.a, this.g.getResponseInfo());
        }
    }
}
