package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import ca.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class i extends SpannableStringBuilder {
    public int a = 0;
    public int b = 0;
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public String f;
    public String g;
    public int h;
    public int i;
    public int j;
    public int k;
    public BaseInputConnection l;

    public class a extends BaseInputConnection {
        public final /* synthetic */ Editable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, boolean z, Editable editable) {
            super(view, z);
            this.a = editable;
        }

        public Editable getEditable() {
            return this.a;
        }
    }

    public interface b {
        void b(boolean z, boolean z2, boolean z3);
    }

    public i(x.e eVar, View view) {
        this.l = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    public void a(b bVar) {
        if (this.b > 0) {
            Q9.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.a <= 0) {
            this.c.add(bVar);
        } else {
            Q9.b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.d.add(bVar);
        }
    }

    public void b() {
        this.a++;
        if (this.b > 0) {
            Q9.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.a != 1 || this.c.isEmpty()) {
            return;
        }
        this.g = toString();
        this.h = i();
        this.i = h();
        this.j = g();
        this.k = f();
    }

    public void c() {
        this.e.clear();
    }

    public void d() {
        int i = this.a;
        if (i == 0) {
            Q9.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i == 1) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                j((b) it.next(), true, true, true);
            }
            if (!this.c.isEmpty()) {
                Q9.b.f("ListenableEditingState", "didFinishBatchEdit with " + this.c.size() + " listener(s)");
                k(!toString().equals(this.g), (this.h == i() && this.i == h()) ? false : true, (this.j == g() && this.k == f()) ? false : true);
            }
        }
        this.c.addAll(this.d);
        this.d.clear();
        this.a--;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList(this.e);
        this.e.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public final void j(b bVar, boolean z, boolean z2, boolean z3) {
        this.b++;
        bVar.b(z, z2, z3);
        this.b--;
    }

    public final void k(boolean z, boolean z2, boolean z3) {
        if (z || z2 || z3) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                j((b) it.next(), z, z2, z3);
            }
        }
    }

    public void l(b bVar) {
        if (this.b > 0) {
            Q9.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.c.remove(bVar);
        if (this.a > 0) {
            this.d.remove(bVar);
        }
    }

    public void m(int i, int i2) {
        if (i < 0 || i >= i2) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.l.setComposingRegion(i, i2);
        }
    }

    public void n(x.e eVar) {
        b();
        replace(0, length(), eVar.a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.b, eVar.c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.d, eVar.e);
        c();
        d();
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        super.setSpan(obj, i, i2, i3);
        this.e.add(new n(toString(), i(), h(), g(), f()));
    }

    public String toString() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        boolean z;
        boolean z2;
        if (this.b > 0) {
            Q9.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String iVar = toString();
        int i5 = i2 - i;
        boolean z3 = i5 != i4 - i3;
        for (int i6 = 0; i6 < i5 && !z3; i6++) {
            z3 |= charAt(i + i6) != charSequence.charAt(i3 + i6);
        }
        if (z3) {
            this.f = null;
        }
        int i7 = i();
        int h = h();
        int g = g();
        int f = f();
        SpannableStringBuilder replace = super.replace(i, i2, charSequence, i3, i4);
        boolean z4 = z3;
        this.e.add(new n(iVar, i, i2, charSequence, i(), h(), g(), f()));
        if (this.a > 0) {
            return replace;
        }
        boolean z5 = (i() == i7 && h() == h) ? false : true;
        if (g() == g && f() == f) {
            z = z4;
            z2 = false;
        } else {
            z = z4;
            z2 = true;
        }
        k(z, z5, z2);
        return replace;
    }
}
