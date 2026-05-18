package androidx.compose.ui.draganddrop;

import Qa.q;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.e;
import java.util.Iterator;
import r0.c;
import r0.d;
import r0.f;
import w.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener, c {
    public final q a;
    public final d b = new d(null, null, 3, null);
    public final b c = new b(0, 1, null);
    public final e d = new AndroidDragAndDropManager$modifier$1(this);

    public AndroidDragAndDropManager(q qVar) {
        this.a = qVar;
    }

    public static final /* synthetic */ d c(AndroidDragAndDropManager androidDragAndDropManager) {
        return androidDragAndDropManager.b;
    }

    public void a(f fVar) {
        this.c.add(fVar);
    }

    public boolean b(f fVar) {
        return this.c.contains(fVar);
    }

    public e d() {
        return this.d;
    }

    public boolean onDrag(View view, DragEvent dragEvent) {
        r0.b bVar = new r0.b(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean E1 = this.b.E1(bVar);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).P(bVar);
                }
                break;
            case 2:
                this.b.K(bVar);
                break;
            case 4:
                this.b.A0(bVar);
                this.c.clear();
                break;
            case 5:
                this.b.q1(bVar);
                break;
            case 6:
                this.b.T(bVar);
                break;
        }
        return false;
    }
}
