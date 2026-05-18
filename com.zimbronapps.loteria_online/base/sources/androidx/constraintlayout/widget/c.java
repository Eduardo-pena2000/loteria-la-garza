package androidx.constraintlayout.widget;

import B1.i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c extends View {
    public int[] a;
    public int b;
    public Context c;
    public i d;
    public boolean e;
    public String f;
    public String g;
    public View[] h;
    public HashMap i;

    public c(Context context) {
        super(context);
        this.a = new int[32];
        this.e = false;
        this.h = null;
        this.i = new HashMap();
        this.c = context;
        g(null);
    }

    public final void a(String str) {
        if (str == null || str.length() == 0 || this.c == null) {
            return;
        }
        String trim = str.trim();
        int f = f(trim);
        if (f != 0) {
            this.i.put(Integer.valueOf(f), trim);
            b(f);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.b + 1;
        int[] iArr = this.a;
        if (i2 > iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.a;
        int i3 = this.b;
        iArr2[i3] = i;
        this.b = i3 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.b layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(layoutParams.c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public void d(ConstraintLayout constraintLayout) {
    }

    public final int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object h = constraintLayout.h(0, str);
            if (h instanceof Integer) {
                i = ((Integer) h).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = e(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = E1.c.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.c.getResources().getIdentifier(str, "id", this.c.getPackageName()) : i;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, E1.d.V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == E1.d.f1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f = string;
                    setIds(string);
                } else if (index == E1.d.g1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.b);
    }

    public abstract void h(B1.e eVar, boolean z);

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
        String str;
        int e;
        if (isInEditMode()) {
            setIds(this.f);
        }
        i iVar = this.d;
        if (iVar == null) {
            return;
        }
        iVar.c();
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            View p = constraintLayout.p(i2);
            if (p == null && (e = e(constraintLayout, (str = (String) this.i.get(Integer.valueOf(i2))))) != 0) {
                this.a[i] = e;
                this.i.put(Integer.valueOf(e), str);
                p = constraintLayout.p(e);
            }
            if (p != null) {
                this.d.a(constraintLayout.q(p));
            }
        }
        this.d.b(constraintLayout.c);
    }

    public void m() {
        if (this.d == null) {
            return;
        }
        ConstraintLayout.b layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            layoutParams.v0 = (B1.e) this.d;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                c(str.substring(i));
                return;
            } else {
                c(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f = null;
        this.b = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f == null) {
            b(i);
        }
    }
}
