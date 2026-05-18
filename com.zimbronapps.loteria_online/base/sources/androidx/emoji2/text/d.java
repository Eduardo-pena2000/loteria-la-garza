package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.c;
import androidx.emoji2.text.f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import t2.h;
import t2.i;
import t2.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d {
    public final c.j a;
    public final androidx.emoji2.text.f b;
    public c.e c;
    public final boolean d;
    public final int[] e;

    public static final class a {
        public static int a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }

        public static int b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                        i++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    public static class b implements c {
        public k a;
        public final c.j b;

        public b(k kVar, c.j jVar) {
            this.a = kVar;
            this.b = jVar;
        }

        public boolean a(CharSequence charSequence, int i, int i2, i iVar) {
            if (iVar.k()) {
                return true;
            }
            if (this.a == null) {
                this.a = new k(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.a.setSpan(this.b.a(iVar), i, i2, 33);
            return true;
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public k b() {
            return this.a;
        }
    }

    public interface c {
        boolean a(CharSequence charSequence, int i, int i2, i iVar);

        Object b();
    }

    public static class d implements c {
        public final int a;
        public int b = -1;
        public int c = -1;

        public d(int i) {
            this.a = i;
        }

        public boolean a(CharSequence charSequence, int i, int i2, i iVar) {
            int i3 = this.a;
            if (i > i3 || i3 >= i2) {
                return i2 <= i3;
            }
            this.b = i;
            this.c = i2;
            return false;
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d b() {
            return this;
        }
    }

    public static class e implements c {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public boolean a(CharSequence charSequence, int i, int i2, i iVar) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
                return true;
            }
            iVar.l(true);
            return false;
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b() {
            return this;
        }
    }

    public static final class f {
        public int a = 1;
        public final f.a b;
        public f.a c;
        public f.a d;
        public int e;
        public int f;
        public final boolean g;
        public final int[] h;

        public f(f.a aVar, boolean z, int[] iArr) {
            this.b = aVar;
            this.c = aVar;
            this.g = z;
            this.h = iArr;
        }

        public static boolean d(int i) {
            return i == 65039;
        }

        public static boolean f(int i) {
            return i == 65038;
        }

        public int a(int i) {
            f.a a = this.c.a(i);
            int i2 = 2;
            if (this.a != 2) {
                if (a == null) {
                    i2 = g();
                } else {
                    this.a = 2;
                    this.c = a;
                    this.f = 1;
                }
            } else if (a != null) {
                this.c = a;
                this.f++;
            } else if (f(i)) {
                i2 = g();
            } else if (!d(i)) {
                if (this.c.b() != null) {
                    i2 = 3;
                    if (this.f != 1) {
                        this.d = this.c;
                        g();
                    } else if (h()) {
                        this.d = this.c;
                        g();
                    } else {
                        i2 = g();
                    }
                } else {
                    i2 = g();
                }
            }
            this.e = i;
            return i2;
        }

        public i b() {
            return this.c.b();
        }

        public i c() {
            return this.d.b();
        }

        public boolean e() {
            return this.a == 2 && this.c.b() != null && (this.f > 1 || h());
        }

        public final int g() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.c.b().j() || d(this.e)) {
                return true;
            }
            if (this.g) {
                if (this.h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.h, this.c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(androidx.emoji2.text.f fVar, c.j jVar, c.e eVar, boolean z, int[] iArr, Set set) {
        this.a = jVar;
        this.b = fVar;
        this.c = eVar;
        this.d = z;
        this.e = iArr;
        i(set);
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        t2.e[] eVarArr;
        if (h(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!g(selectionStart, selectionEnd) && (eVarArr = (t2.e[]) editable.getSpans(selectionStart, selectionEnd, t2.e.class)) != null && eVarArr.length > 0) {
            for (t2.e eVar : eVarArr) {
                int spanStart = editable.getSpanStart(eVar);
                int spanEnd = editable.getSpanEnd(eVar);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                max = a.a(editable, selectionStart, Math.max(i, 0));
                min = a.b(editable, selectionEnd, Math.max(i2, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i, 0);
                min = Math.min(selectionEnd + i2, editable.length());
            }
            t2.e[] eVarArr = (t2.e[]) editable.getSpans(max, min, t2.e.class);
            if (eVarArr != null && eVarArr.length > 0) {
                for (t2.e eVar : eVarArr) {
                    int spanStart = editable.getSpanStart(eVar);
                    int spanEnd = editable.getSpanEnd(eVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean e(Editable editable, int i, KeyEvent keyEvent) {
        if (!(i != 67 ? i != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static boolean g(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public static boolean h(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public int b(CharSequence charSequence, int i) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            t2.e[] eVarArr = (t2.e[]) spanned.getSpans(i, i + 1, t2.e.class);
            if (eVarArr.length > 0) {
                return spanned.getSpanEnd(eVarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new d(i))).c;
    }

    public int c(CharSequence charSequence, int i) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            t2.e[] eVarArr = (t2.e[]) spanned.getSpans(i, i + 1, t2.e.class);
            if (eVarArr.length > 0) {
                return spanned.getSpanStart(eVarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new d(i))).b;
    }

    public final boolean f(CharSequence charSequence, int i, int i2, i iVar) {
        if (iVar.d() == 0) {
            iVar.m(this.c.a(charSequence, i, i2, iVar.h()));
        }
        return iVar.d() == 2;
    }

    public final void i(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            k(str, 0, str.length(), 1, true, new e(str));
        }
    }

    public CharSequence j(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        k kVar;
        t2.e[] eVarArr;
        boolean z2 = charSequence instanceof h;
        if (z2) {
            ((h) charSequence).a();
        }
        if (!z2) {
            try {
                kVar = charSequence instanceof Spannable ? new k((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, t2.e.class) > i2) ? null : new k(charSequence);
            } finally {
                if (z2) {
                    ((h) charSequence).d();
                }
            }
        }
        if (kVar != null && (eVarArr = (t2.e[]) kVar.getSpans(i, i2, t2.e.class)) != null && eVarArr.length > 0) {
            for (t2.e eVar : eVarArr) {
                int spanStart = kVar.getSpanStart(eVar);
                int spanEnd = kVar.getSpanEnd(eVar);
                if (spanStart != i2) {
                    kVar.removeSpan(eVar);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        int i4 = i2;
        if (i != i4 && i < charSequence.length()) {
            if (i3 != Integer.MAX_VALUE && kVar != null) {
                i3 -= ((t2.e[]) kVar.getSpans(0, kVar.length(), t2.e.class)).length;
            }
            k kVar2 = (k) k(charSequence, i, i4, i3, z, new b(kVar, this.a));
            if (kVar2 == null) {
                if (z2) {
                    ((h) charSequence).d();
                }
                return charSequence;
            }
            Spannable b2 = kVar2.b();
            if (z2) {
                ((h) charSequence).d();
            }
            return b2;
        }
        return charSequence;
    }

    public final Object k(CharSequence charSequence, int i, int i2, int i3, boolean z, c cVar) {
        int i4;
        f fVar = new f(this.b.f(), this.d, this.e);
        int i5 = 0;
        boolean z2 = true;
        int codePointAt = Character.codePointAt(charSequence, i);
        loop0: while (true) {
            i4 = i;
            while (i < i2 && i5 < i3 && z2) {
                int a2 = fVar.a(codePointAt);
                if (a2 == 1) {
                    i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                    if (i4 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i4);
                    }
                    i = i4;
                } else if (a2 == 2) {
                    i += Character.charCount(codePointAt);
                    if (i < i2) {
                        codePointAt = Character.codePointAt(charSequence, i);
                    }
                } else if (a2 == 3) {
                    if (z || !f(charSequence, i4, i, fVar.c())) {
                        z2 = cVar.a(charSequence, i4, i, fVar.c());
                        i5++;
                    }
                }
            }
        }
        if (fVar.e() && i5 < i3 && z2 && (z || !f(charSequence, i4, i, fVar.b()))) {
            cVar.a(charSequence, i4, i, fVar.b());
        }
        return cVar.b();
    }
}
