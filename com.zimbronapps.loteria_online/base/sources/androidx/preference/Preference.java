package androidx.preference;

import J1.k;
import X3.c;
import X3.e;
import X3.g;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class Preference implements Comparable {
    public List A;
    public b B;
    public final View.OnClickListener C;
    public final Context a;
    public int b;
    public int c;
    public CharSequence d;
    public CharSequence e;
    public int f;
    public String g;
    public Intent h;
    public String i;
    public boolean j;
    public boolean k;
    public boolean l;
    public String m;
    public Object n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            Preference.this.z(view);
        }
    }

    public interface b {
        CharSequence a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.b = Integer.MAX_VALUE;
        this.c = 0;
        this.j = true;
        this.k = true;
        this.l = true;
        this.o = true;
        this.p = true;
        this.q = true;
        this.r = true;
        this.s = true;
        this.u = true;
        this.x = true;
        this.y = e.a;
        this.C = new a();
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.I, i, i2);
        this.f = k.l(obtainStyledAttributes, g.g0, g.J, 0);
        this.g = k.m(obtainStyledAttributes, g.j0, g.P);
        this.d = k.n(obtainStyledAttributes, g.r0, g.N);
        this.e = k.n(obtainStyledAttributes, g.q0, g.Q);
        this.b = k.d(obtainStyledAttributes, g.l0, g.R, Integer.MAX_VALUE);
        this.i = k.m(obtainStyledAttributes, g.f0, g.W);
        this.y = k.l(obtainStyledAttributes, g.k0, g.M, e.a);
        this.z = k.l(obtainStyledAttributes, g.s0, g.S, 0);
        this.j = k.b(obtainStyledAttributes, g.e0, g.L, true);
        this.k = k.b(obtainStyledAttributes, g.n0, g.O, true);
        this.l = k.b(obtainStyledAttributes, g.m0, g.K, true);
        this.m = k.m(obtainStyledAttributes, g.c0, g.T);
        int i3 = g.Z;
        this.r = k.b(obtainStyledAttributes, i3, i3, this.k);
        int i4 = g.a0;
        this.s = k.b(obtainStyledAttributes, i4, i4, this.k);
        if (obtainStyledAttributes.hasValue(g.b0)) {
            this.n = w(obtainStyledAttributes, g.b0);
        } else if (obtainStyledAttributes.hasValue(g.U)) {
            this.n = w(obtainStyledAttributes, g.U);
        }
        this.x = k.b(obtainStyledAttributes, g.o0, g.V, true);
        boolean hasValue = obtainStyledAttributes.hasValue(g.p0);
        this.t = hasValue;
        if (hasValue) {
            this.u = k.b(obtainStyledAttributes, g.p0, g.X, true);
        }
        this.v = k.b(obtainStyledAttributes, g.h0, g.Y, false);
        int i5 = g.i0;
        this.q = k.b(obtainStyledAttributes, i5, i5, true);
        int i6 = g.d0;
        this.w = k.b(obtainStyledAttributes, i6, i6, false);
        obtainStyledAttributes.recycle();
    }

    public boolean A(boolean z) {
        if (!F()) {
            return false;
        }
        if (z == g(!z)) {
            return true;
        }
        k();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public boolean B(int i) {
        if (!F()) {
            return false;
        }
        if (i == h(~i)) {
            return true;
        }
        k();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public boolean C(String str) {
        if (!F()) {
            return false;
        }
        Object obj = null;
        if (TextUtils.equals(str, i(null))) {
            return true;
        }
        k();
        obj.getClass();
        throw null;
    }

    public final void D(b bVar) {
        this.B = bVar;
        s();
    }

    public boolean E() {
        return !q();
    }

    public boolean F() {
        return false;
    }

    public boolean a(Object obj) {
        return true;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i = this.b;
        int i2 = preference.b;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.d;
        CharSequence charSequence2 = preference.d;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.d.toString());
    }

    public Context c() {
        return this.a;
    }

    public StringBuilder d() {
        StringBuilder sb = new StringBuilder();
        CharSequence o = o();
        if (!TextUtils.isEmpty(o)) {
            sb.append(o);
            sb.append(' ');
        }
        CharSequence m = m();
        if (!TextUtils.isEmpty(m)) {
            sb.append(m);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String e() {
        return this.i;
    }

    public Intent f() {
        return this.h;
    }

    public boolean g(boolean z) {
        if (!F()) {
            return z;
        }
        k();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public int h(int i) {
        if (!F()) {
            return i;
        }
        k();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public String i(String str) {
        if (!F()) {
            return str;
        }
        k();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public X3.a k() {
        return null;
    }

    public X3.b l() {
        return null;
    }

    public CharSequence m() {
        return n() != null ? n().a(this) : this.e;
    }

    public final b n() {
        return this.B;
    }

    public CharSequence o() {
        return this.d;
    }

    public boolean p() {
        return !TextUtils.isEmpty(this.g);
    }

    public boolean q() {
        return this.j && this.o && this.p;
    }

    public boolean r() {
        return this.k;
    }

    public void s() {
    }

    public void t(boolean z) {
        List list = this.A;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).v(this, z);
        }
    }

    public String toString() {
        return d().toString();
    }

    public void u() {
    }

    public void v(Preference preference, boolean z) {
        if (this.o == z) {
            this.o = !z;
            t(E());
            s();
        }
    }

    public Object w(TypedArray typedArray, int i) {
        return null;
    }

    public void x(Preference preference, boolean z) {
        if (this.p == z) {
            this.p = !z;
            t(E());
            s();
        }
    }

    public void y() {
        if (q() && r()) {
            u();
            l();
            if (this.h != null) {
                c().startActivity(this.h);
            }
        }
    }

    public void z(View view) {
        y();
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.g, 16842894));
    }
}
