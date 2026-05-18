package I0;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final List d = new ArrayList();
    public int e = -1;
    public int f = -1;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.b;
                long j = this.a;
                this.a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.b;
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.e && source == this.f) {
            return;
        }
        this.e = toolType;
        this.f = source;
        this.c.clear();
        this.b.clear();
    }

    public final E c(MotionEvent motionEvent, S s) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.b.clear();
            this.c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            this.c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        while (i < pointerCount) {
            this.d.add(d(s, motionEvent, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
            i++;
        }
        h(motionEvent);
        return new E(motionEvent.getEventTime(), this.d, motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final I0.F d(I0.S r34, android.view.MotionEvent r35, int r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.i.d(I0.S, android.view.MotionEvent, int, boolean):I0.F");
    }

    public final void e(int i) {
        this.c.delete(i);
        this.b.delete(i);
    }

    public final long f(int i) {
        long j;
        int indexOfKey = this.b.indexOfKey(i);
        if (indexOfKey >= 0) {
            j = this.b.valueAt(indexOfKey);
        } else {
            j = this.a;
            this.a = 1 + j;
            this.b.put(i, j);
        }
        return B.b(j);
    }

    public final boolean g(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    public final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.c.get(pointerId, false)) {
                this.b.delete(pointerId);
                this.c.delete(pointerId);
            }
        }
        if (this.b.size() > motionEvent.getPointerCount()) {
            for (int size = this.b.size() - 1; -1 < size; size--) {
                int keyAt = this.b.keyAt(size);
                if (!g(motionEvent, keyAt)) {
                    this.b.removeAt(size);
                    this.c.delete(keyAt);
                }
            }
        }
    }
}
