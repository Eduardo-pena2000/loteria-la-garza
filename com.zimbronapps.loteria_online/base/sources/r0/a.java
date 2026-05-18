package R0;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import u0.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a extends ActionMode.Callback2 {
    public final c a;

    public a(c cVar) {
        this.a = cVar;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.a.d(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.a.e(actionMode, menu);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.a.f();
    }

    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        h c = this.a.c();
        if (rect != null) {
            rect.set((int) c.i(), (int) c.l(), (int) c.j(), (int) c.e());
        }
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.a.g(actionMode, menu);
    }
}
