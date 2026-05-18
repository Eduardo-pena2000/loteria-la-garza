package U1;

import U1.y;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class v {
    public static int d;
    public final AccessibilityNodeInfo a;
    public int b = -1;
    public int c = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a d = new a(1, null);
        public static final a e = new a(2, null);
        public static final a f = new a(4, null);
        public static final a g = new a(8, null);
        public static final a h = new a(16, null);
        public static final a i = new a(32, null);
        public static final a j = new a(64, null);
        public static final a k = new a(128, null);
        public static final a l = new a(256, null, y.b.class);
        public static final a m = new a(512, null, y.b.class);
        public static final a n = new a(1024, null, y.c.class);
        public static final a o = new a(2048, null, y.c.class);
        public static final a p = new a(4096, null);
        public static final a q = new a(8192, null);
        public static final a r = new a(16384, null);
        public static final a s = new a(32768, null);
        public static final a t = new a(65536, null);
        public static final a u = new a(131072, null, y.g.class);
        public static final a v = new a(262144, null);
        public static final a w = new a(524288, null);
        public static final a x = new a(1048576, null);
        public static final a y = new a(2097152, null, y.h.class);
        public static final a z;
        public final Object a;
        public final int b;
        public final Class c;

        static {
            int i2 = Build.VERSION.SDK_INT;
            z = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, y.e.class);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            F = new a(i2 >= 29 ? i.a() : null, 16908358, null, null, null);
            G = new a(i2 >= 29 ? p.a() : null, 16908359, null, null, null);
            H = new a(i2 >= 29 ? q.a() : null, 16908360, null, null, null);
            I = new a(i2 >= 29 ? r.a() : null, 16908361, null, null, null);
            J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, y.f.class);
            L = new a(i2 >= 26 ? s.a() : null, 16908354, null, null, y.d.class);
            M = new a(i2 >= 28 ? t.a() : null, 16908356, null, null, null);
            N = new a(i2 >= 28 ? u.a() : null, 16908357, null, null, null);
            O = new a(i2 >= 30 ? j.a() : null, 16908362, null, null, null);
            P = new a(i2 >= 30 ? k.a() : null, 16908372, null, null, null);
            Q = new a(i2 >= 32 ? l.a() : null, 16908373, null, null, null);
            R = new a(i2 >= 32 ? m.a() : null, 16908374, null, null, null);
            S = new a(i2 >= 32 ? n.a() : null, 16908375, null, null, null);
            T = new a(i2 >= 33 ? o.a() : null, 16908376, null, null, null);
            U = new a(i2 >= 34 ? d.a() : null, 16908382, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getLabel();
        }

        public boolean c(View view, Bundle bundle) {
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.a;
            return obj2 == null ? aVar.a == null : obj2.equals(aVar.a);
        }

        public int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String j2 = v.j(this.b);
            if (j2.equals("ACTION_UNKNOWN") && b() != null) {
                j2 = b().toString();
            }
            sb.append(j2);
            return sb.toString();
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i2, CharSequence charSequence, Class cls) {
            this(null, i2, charSequence, null, cls);
        }

        public a(Object obj, int i2, CharSequence charSequence, y yVar, Class cls) {
            this.b = i2;
            if (obj == null) {
                this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.a = obj;
            }
            this.c = cls;
        }
    }

    public static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    public static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    public static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void e(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }
    }

    public static class e {
        public final Object a;

        public e(Object obj) {
            this.a = obj;
        }

        public static e a(int i, int i2, boolean z, int i3) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    public static class f {
        public final Object a;

        public f(Object obj) {
            this.a = obj;
        }

        public static f a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public static class g {
        public final Object a;

        public g(Object obj) {
            this.a = obj;
        }

        public static g a(int i, float f, float f2, float f3) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }
    }

    public v(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static v T0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new v(accessibilityNodeInfo);
    }

    public static v W() {
        return T0(AccessibilityNodeInfo.obtain());
    }

    public static String j(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908382:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public CharSequence A() {
        if (!E()) {
            return this.a.getText();
        }
        List h = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List h2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List h3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List h4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        for (int i = 0; i < h.size(); i++) {
            spannableString.setSpan(new U1.a(((Integer) h4.get(i)).intValue(), this, t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) h.get(i)).intValue(), ((Integer) h2.get(i)).intValue(), ((Integer) h3.get(i)).intValue());
        }
        return spannableString;
    }

    public void A0(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public CharSequence B() {
        return Build.VERSION.SDK_INT >= 28 ? U1.g.a(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void B0(View view, int i) {
        this.b = i;
        this.a.setParent(view, i);
    }

    public String C() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.a) : this.a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void C0(boolean z) {
        this.a.setPassword(z);
    }

    public String D() {
        return this.a.getViewIdResourceName();
    }

    public void D0(g gVar) {
        this.a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.a);
    }

    public final boolean E() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void E0(CharSequence charSequence) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final int F(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = d;
        d = i2 + 1;
        return i2;
    }

    public void F0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            U1.d.a(this.a, z);
        } else {
            c0(1, z);
        }
    }

    public boolean G() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.a) : k(64);
    }

    public void G0(boolean z) {
        this.a.setScrollable(z);
    }

    public boolean H() {
        return this.a.isCheckable();
    }

    public void H0(boolean z) {
        this.a.setSelected(z);
    }

    public boolean I() {
        return this.a.isChecked();
    }

    public void I0(View view, int i) {
        this.c = i;
        this.a.setSource(view, i);
    }

    public boolean J() {
        return this.a.isClickable();
    }

    public void J0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.a, charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean K() {
        return this.a.isContextClickable();
    }

    public void K0(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean L() {
        return this.a.isEnabled();
    }

    public void L0(int i, int i2) {
        this.a.setTextSelection(i, i2);
    }

    public boolean M() {
        return this.a.isFocusable();
    }

    public void M0(View view) {
        this.a.setTraversalAfter(view);
    }

    public boolean N() {
        return this.a.isFocused();
    }

    public void N0(View view, int i) {
        this.a.setTraversalAfter(view, i);
    }

    public boolean O() {
        return k(67108864);
    }

    public void O0(View view) {
        this.a.setTraversalBefore(view);
    }

    public boolean P() {
        return this.a.isImportantForAccessibility();
    }

    public void P0(View view, int i) {
        this.a.setTraversalBefore(view, i);
    }

    public boolean Q() {
        return this.a.isLongClickable();
    }

    public void Q0(String str) {
        this.a.setViewIdResourceName(str);
    }

    public boolean R() {
        return this.a.isPassword();
    }

    public void R0(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public boolean S() {
        return this.a.isScrollable();
    }

    public AccessibilityNodeInfo S0() {
        return this.a;
    }

    public boolean T() {
        return this.a.isSelected();
    }

    public boolean U() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.a) : k(8388608);
    }

    public boolean V() {
        return this.a.isVisibleToUser();
    }

    public boolean X(int i, Bundle bundle) {
        return this.a.performAction(i, bundle);
    }

    public final void Y(View view) {
        SparseArray y = y(view);
        if (y != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < y.size(); i++) {
                if (((WeakReference) y.valueAt(i)).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                y.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    public void Z(boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.e(this.a, z);
        } else {
            c0(64, z);
        }
    }

    public void a(int i) {
        this.a.addAction(i);
    }

    public void a0(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public void b(a aVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
    }

    public void b0(List list) {
        if (Build.VERSION.SDK_INT >= 26) {
            h.a(this.a, list);
        }
    }

    public void c(View view) {
        this.a.addChild(view);
    }

    public final void c0(int i, boolean z) {
        Bundle t = t();
        if (t != null) {
            int i2 = t.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            t.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public void d(View view, int i) {
        this.a.addChild(view, i);
    }

    public void d0(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    public void e0(boolean z) {
        this.a.setCheckable(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (vVar.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(vVar.a)) {
            return false;
        }
        return this.c == vVar.c && this.b == vVar.b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            Y(view);
            ClickableSpan[] p = p(charSequence);
            if (p == null || p.length <= 0) {
                return;
            }
            t().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", F1.c.a);
            SparseArray w = w(view);
            for (int i = 0; i < p.length; i++) {
                int F = F(p[i], w);
                w.put(F, new WeakReference(p[i]));
                e(p[i], (Spanned) charSequence, F);
            }
        }
    }

    public void f0(boolean z) {
        this.a.setChecked(z);
    }

    public final void g() {
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public void g0(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final List h(String str) {
        ArrayList integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void h0(boolean z) {
        this.a.setClickable(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List i() {
        List actionList = this.a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new a(actionList.get(i)));
        }
        return arrayList;
    }

    public void i0(Object obj) {
        this.a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).a);
    }

    public void j0(Object obj) {
        this.a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).a);
    }

    public final boolean k(int i) {
        Bundle t = t();
        return t != null && (t.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public void k0(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public void l(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public void l0(boolean z) {
        this.a.setContentInvalid(z);
    }

    public void m(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public void m0(int i) {
        this.a.setDrawingOrder(i);
    }

    public void n(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.a, rect);
            return;
        }
        Rect parcelable = this.a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (parcelable != null) {
            rect.set(parcelable.left, parcelable.top, parcelable.right, parcelable.bottom);
        }
    }

    public void n0(boolean z) {
        this.a.setEditable(z);
    }

    public CharSequence o() {
        return this.a.getClassName();
    }

    public void o0(boolean z) {
        this.a.setEnabled(z);
    }

    public void p0(CharSequence charSequence) {
        this.a.setError(charSequence);
    }

    public CharSequence q() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void q0(boolean z) {
        this.a.setFocusable(z);
    }

    public CharSequence r() {
        return this.a.getContentDescription();
    }

    public void r0(boolean z) {
        this.a.setFocused(z);
    }

    public CharSequence s() {
        return this.a.getError();
    }

    public void s0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            U1.f.a(this.a, z);
        } else {
            c0(2, z);
        }
    }

    public Bundle t() {
        return this.a.getExtras();
    }

    public void t0(boolean z) {
        this.a.setImportantForAccessibility(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb.append("; boundsInParent: " + rect);
        m(rect);
        sb.append("; boundsInScreen: " + rect);
        n(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(x());
        sb.append("; className: ");
        sb.append(o());
        sb.append("; text: ");
        sb.append(A());
        sb.append("; error: ");
        sb.append(s());
        sb.append("; maxTextLength: ");
        sb.append(u());
        sb.append("; stateDescription: ");
        sb.append(z());
        sb.append("; contentDescription: ");
        sb.append(r());
        sb.append("; tooltipText: ");
        sb.append(B());
        sb.append("; viewIdResName: ");
        sb.append(D());
        sb.append("; uniqueId: ");
        sb.append(C());
        sb.append("; checkable: ");
        sb.append(H());
        sb.append("; checked: ");
        sb.append(I());
        sb.append("; focusable: ");
        sb.append(M());
        sb.append("; focused: ");
        sb.append(N());
        sb.append("; selected: ");
        sb.append(T());
        sb.append("; clickable: ");
        sb.append(J());
        sb.append("; longClickable: ");
        sb.append(Q());
        sb.append("; contextClickable: ");
        sb.append(K());
        sb.append("; enabled: ");
        sb.append(L());
        sb.append("; password: ");
        sb.append(R());
        sb.append("; scrollable: " + S());
        sb.append("; containerTitle: ");
        sb.append(q());
        sb.append("; granularScrollingSupported: ");
        sb.append(O());
        sb.append("; importantForAccessibility: ");
        sb.append(P());
        sb.append("; visible: ");
        sb.append(V());
        sb.append("; isTextSelectable: ");
        sb.append(U());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(G());
        sb.append("; [");
        List i = i();
        for (int i2 = 0; i2 < i.size(); i2++) {
            a aVar = (a) i.get(i2);
            String j = j(aVar.a());
            if (j.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                j = aVar.b().toString();
            }
            sb.append(j);
            if (i2 != i.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int u() {
        return this.a.getMaxTextLength();
    }

    public void u0(int i) {
        this.a.setLiveRegion(i);
    }

    public int v() {
        return this.a.getMovementGranularities();
    }

    public void v0(boolean z) {
        this.a.setLongClickable(z);
    }

    public final SparseArray w(View view) {
        SparseArray y = y(view);
        if (y != null) {
            return y;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(F1.c.I, sparseArray);
        return sparseArray;
    }

    public void w0(int i) {
        this.a.setMaxTextLength(i);
    }

    public CharSequence x() {
        return this.a.getPackageName();
    }

    public void x0(int i) {
        this.a.setMovementGranularities(i);
    }

    public final SparseArray y(View view) {
        return (SparseArray) view.getTag(F1.c.I);
    }

    public void y0(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public CharSequence z() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void z0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            U1.e.a(this.a, charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }
}
