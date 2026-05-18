package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b0 {
    public static final a f = new a(null);
    public final ViewGroup a;
    public final List b;
    public final List c;
    public boolean d;
    public boolean e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final b0 a(ViewGroup viewGroup, J j) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
            kotlin.jvm.internal.t.g(j, "fragmentManager");
            c0 F0 = j.F0();
            kotlin.jvm.internal.t.f(F0, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, F0);
        }

        public final b0 b(ViewGroup viewGroup, c0 c0Var) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
            kotlin.jvm.internal.t.g(c0Var, "factory");
            Object tag = viewGroup.getTag(x2.b.b);
            if (tag instanceof b0) {
                return (b0) tag;
            }
            b0 a = c0Var.a(viewGroup);
            kotlin.jvm.internal.t.f(a, "factory.createController(container)");
            viewGroup.setTag(x2.b.b, a);
            return a;
        }

        public a() {
        }
    }

    public static class b {
        public final boolean a;
        public boolean b;
        public boolean c;

        public final void a(ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
            if (!this.c) {
                c(viewGroup);
            }
            this.c = true;
        }

        public boolean b() {
            return this.a;
        }

        public abstract void c(ViewGroup viewGroup);

        public abstract void d(ViewGroup viewGroup);

        public void e(d.b bVar, ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(bVar, "backEvent");
            kotlin.jvm.internal.t.g(viewGroup, "container");
        }

        public void f(ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
        }

        public final void g(ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
            if (!this.b) {
                f(viewGroup);
            }
            this.b = true;
        }
    }

    public static final class c extends d {
        public final Q l;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(d.b bVar, d.a aVar, Q q) {
            kotlin.jvm.internal.t.g(bVar, "finalState");
            kotlin.jvm.internal.t.g(aVar, "lifecycleImpact");
            kotlin.jvm.internal.t.g(q, "fragmentStateManager");
            p k = q.k();
            kotlin.jvm.internal.t.f(k, "fragmentStateManager.fragment");
            super(bVar, aVar, k);
            this.l = q;
        }

        public void e() {
            super.e();
            i().mTransitioning = false;
            this.l.m();
        }

        public void q() {
            if (o()) {
                return;
            }
            super.q();
            if (j() != d.a.ADDING) {
                if (j() == d.a.REMOVING) {
                    p k = this.l.k();
                    kotlin.jvm.internal.t.f(k, "fragmentStateManager.fragment");
                    View requireView = k.requireView();
                    kotlin.jvm.internal.t.f(requireView, "fragment.requireView()");
                    if (J.N0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView.findFocus() + " on view " + requireView + " for Fragment " + k);
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            p k2 = this.l.k();
            kotlin.jvm.internal.t.f(k2, "fragmentStateManager.fragment");
            View findFocus = k2.mView.findFocus();
            if (findFocus != null) {
                k2.setFocusedView(findFocus);
                if (J.N0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k2);
                }
            }
            View requireView2 = i().requireView();
            kotlin.jvm.internal.t.f(requireView2, "this.fragment.requireView()");
            if (requireView2.getParent() == null) {
                this.l.b();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(k2.getPostOnViewCreatedAlpha());
        }
    }

    public static class d {
        public b a;
        public a b;
        public final p c;
        public final List d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public final List j;
        public final List k;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static final a a = new a(null);

            public static final class a {
                public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                    this();
                }

                public final b a(View view) {
                    kotlin.jvm.internal.t.g(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i) {
                    if (i == 0) {
                        return b.VISIBLE;
                    }
                    if (i == 4) {
                        return b.INVISIBLE;
                    }
                    if (i == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i);
                }

                public a() {
                }
            }

            public /* synthetic */ class b {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    a = iArr;
                }
            }

            public static final b c(int i) {
                return a.b(i);
            }

            public final void b(View view, ViewGroup viewGroup) {
                kotlin.jvm.internal.t.g(view, "view");
                kotlin.jvm.internal.t.g(viewGroup, "container");
                int i = b.a[ordinal()];
                if (i == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        if (J.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                        }
                        viewGroup2.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (J.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (J.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                        }
                        viewGroup.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i == 3) {
                    if (J.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i != 4) {
                    return;
                }
                if (J.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public /* synthetic */ class c {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public d(b bVar, a aVar, p pVar) {
            kotlin.jvm.internal.t.g(bVar, "finalState");
            kotlin.jvm.internal.t.g(aVar, "lifecycleImpact");
            kotlin.jvm.internal.t.g(pVar, "fragment");
            this.a = bVar;
            this.b = aVar;
            this.c = pVar;
            this.d = new ArrayList();
            this.i = true;
            ArrayList arrayList = new ArrayList();
            this.j = arrayList;
            this.k = arrayList;
        }

        public final void a(Runnable runnable) {
            kotlin.jvm.internal.t.g(runnable, "listener");
            this.d.add(runnable);
        }

        public final void b(b bVar) {
            kotlin.jvm.internal.t.g(bVar, "effect");
            this.j.add(bVar);
        }

        public final void c(ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
            this.h = false;
            if (this.e) {
                return;
            }
            this.e = true;
            if (this.j.isEmpty()) {
                e();
                return;
            }
            Iterator it = Da.D.L0(this.k).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(viewGroup);
            }
        }

        public final void d(ViewGroup viewGroup, boolean z) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
            if (this.e) {
                return;
            }
            if (z) {
                this.g = true;
            }
            c(viewGroup);
        }

        public void e() {
            this.h = false;
            if (this.f) {
                return;
            }
            if (J.N0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(b bVar) {
            kotlin.jvm.internal.t.g(bVar, "effect");
            if (this.j.remove(bVar) && this.j.isEmpty()) {
                e();
            }
        }

        public final List g() {
            return this.k;
        }

        public final b h() {
            return this.a;
        }

        public final p i() {
            return this.c;
        }

        public final a j() {
            return this.b;
        }

        public final boolean k() {
            return this.i;
        }

        public final boolean l() {
            return this.e;
        }

        public final boolean m() {
            return this.f;
        }

        public final boolean n() {
            return this.g;
        }

        public final boolean o() {
            return this.h;
        }

        public final void p(b bVar, a aVar) {
            kotlin.jvm.internal.t.g(bVar, "finalState");
            kotlin.jvm.internal.t.g(aVar, "lifecycleImpact");
            int i = c.a[aVar.ordinal()];
            if (i == 1) {
                if (this.a == b.REMOVED) {
                    if (J.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                    }
                    this.a = b.VISIBLE;
                    this.b = a.ADDING;
                    this.i = true;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (J.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
                }
                this.a = b.REMOVED;
                this.b = a.REMOVING;
                this.i = true;
                return;
            }
            if (i == 3 && this.a != b.REMOVED) {
                if (J.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> " + bVar + '.');
                }
                this.a = bVar;
            }
        }

        public void q() {
            this.h = true;
        }

        public final void r(boolean z) {
            this.i = z;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.a + " lifecycleImpact = " + this.b + " fragment = " + this.c + '}';
        }
    }

    public /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public b0(ViewGroup viewGroup) {
        kotlin.jvm.internal.t.g(viewGroup, "container");
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static /* synthetic */ void a(b0 b0Var, c cVar) {
        h(b0Var, cVar);
    }

    public static /* synthetic */ void b(b0 b0Var, c cVar) {
        i(b0Var, cVar);
    }

    public static final void h(b0 b0Var, c cVar) {
        kotlin.jvm.internal.t.g(b0Var, "this$0");
        kotlin.jvm.internal.t.g(cVar, "$operation");
        if (b0Var.b.contains(cVar)) {
            d.b h = cVar.h();
            View view = cVar.i().mView;
            kotlin.jvm.internal.t.f(view, "operation.fragment.mView");
            h.b(view, b0Var.a);
        }
    }

    public static final void i(b0 b0Var, c cVar) {
        kotlin.jvm.internal.t.g(b0Var, "this$0");
        kotlin.jvm.internal.t.g(cVar, "$operation");
        b0Var.b.remove(cVar);
        b0Var.c.remove(cVar);
    }

    public static final b0 u(ViewGroup viewGroup, J j) {
        return f.a(viewGroup, j);
    }

    public static final b0 v(ViewGroup viewGroup, c0 c0Var) {
        return f.b(viewGroup, c0Var);
    }

    public final void A() {
        for (d dVar : this.b) {
            if (dVar.j() == d.a.ADDING) {
                View requireView = dVar.i().requireView();
                kotlin.jvm.internal.t.f(requireView, "fragment.requireView()");
                dVar.p(d.b.a.b(requireView.getVisibility()), d.a.NONE);
            }
        }
    }

    public final void B(boolean z) {
        this.d = z;
    }

    public final void c(d dVar) {
        kotlin.jvm.internal.t.g(dVar, "operation");
        if (dVar.k()) {
            d.b h = dVar.h();
            View requireView = dVar.i().requireView();
            kotlin.jvm.internal.t.f(requireView, "operation.fragment.requireView()");
            h.b(requireView, this.a);
            dVar.r(false);
        }
    }

    public abstract void d(List list, boolean z);

    public void e(List list) {
        kotlin.jvm.internal.t.g(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Da.A.D(arrayList, ((d) it.next()).g());
        }
        List L0 = Da.D.L0(Da.D.Q0(arrayList));
        int size = L0.size();
        for (int i = 0; i < size; i++) {
            ((b) L0.get(i)).d(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c((d) list.get(i2));
        }
        List L02 = Da.D.L0(list);
        int size3 = L02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            d dVar = (d) L02.get(i3);
            if (dVar.g().isEmpty()) {
                dVar.e();
            }
        }
    }

    public final void f() {
        if (J.N0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        z(this.c);
        e(this.c);
    }

    public final void g(d.b bVar, d.a aVar, Q q) {
        synchronized (this.b) {
            try {
                p k = q.k();
                kotlin.jvm.internal.t.f(k, "fragmentStateManager.fragment");
                d o = o(k);
                if (o == null) {
                    if (q.k().mTransitioning) {
                        p k2 = q.k();
                        kotlin.jvm.internal.t.f(k2, "fragmentStateManager.fragment");
                        o = p(k2);
                    } else {
                        o = null;
                    }
                }
                if (o != null) {
                    o.p(bVar, aVar);
                    return;
                }
                c cVar = new c(bVar, aVar, q);
                this.b.add(cVar);
                cVar.a(new Z(this, cVar));
                cVar.a(new a0(this, cVar));
                Ca.I i = Ca.I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(d.b bVar, Q q) {
        kotlin.jvm.internal.t.g(bVar, "finalState");
        kotlin.jvm.internal.t.g(q, "fragmentStateManager");
        if (J.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + q.k());
        }
        g(bVar, d.a.ADDING, q);
    }

    public final void k(Q q) {
        kotlin.jvm.internal.t.g(q, "fragmentStateManager");
        if (J.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + q.k());
        }
        g(d.b.GONE, d.a.NONE, q);
    }

    public final void l(Q q) {
        kotlin.jvm.internal.t.g(q, "fragmentStateManager");
        if (J.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + q.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, q);
    }

    public final void m(Q q) {
        kotlin.jvm.internal.t.g(q, "fragmentStateManager");
        if (J.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + q.k());
        }
        g(d.b.VISIBLE, d.a.NONE, q);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b0.n():void");
    }

    public final d o(p pVar) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (kotlin.jvm.internal.t.c(dVar.i(), pVar) && !dVar.l()) {
                break;
            }
        }
        return (d) obj;
    }

    public final d p(p pVar) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (kotlin.jvm.internal.t.c(dVar.i(), pVar) && !dVar.l()) {
                break;
            }
        }
        return (d) obj;
    }

    public final void q() {
        if (J.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                A();
                z(this.b);
                for (d dVar : Da.D.O0(this.c)) {
                    if (J.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.a);
                }
                for (d dVar2 : Da.D.O0(this.b)) {
                    if (J.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.a);
                }
                Ca.I i = Ca.I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (this.e) {
            if (J.N0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.e = false;
            n();
        }
    }

    public final d.a s(Q q) {
        kotlin.jvm.internal.t.g(q, "fragmentStateManager");
        p k = q.k();
        kotlin.jvm.internal.t.f(k, "fragmentStateManager.fragment");
        d o = o(k);
        d.a j = o != null ? o.j() : null;
        d p = p(k);
        d.a j2 = p != null ? p.j() : null;
        int i = j == null ? -1 : e.a[j.ordinal()];
        return (i == -1 || i == 1) ? j2 : j;
    }

    public final ViewGroup t() {
        return this.a;
    }

    public final boolean w() {
        return !this.b.isEmpty();
    }

    public final void x() {
        Object obj;
        synchronized (this.b) {
            try {
                A();
                List list = this.b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    d dVar = (d) obj;
                    d.b.a aVar = d.b.a;
                    View view = dVar.i().mView;
                    kotlin.jvm.internal.t.f(view, "operation.fragment.mView");
                    d.b a2 = aVar.a(view);
                    d.b h = dVar.h();
                    d.b bVar = d.b.VISIBLE;
                    if (h == bVar && a2 != bVar) {
                        break;
                    }
                }
                d dVar2 = (d) obj;
                p i = dVar2 != null ? dVar2.i() : null;
                this.e = i != null ? i.isPostponed() : false;
                Ca.I i2 = Ca.I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(d.b bVar) {
        kotlin.jvm.internal.t.g(bVar, "backEvent");
        if (J.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + bVar.a());
        }
        List list = this.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Da.A.D(arrayList, ((d) it.next()).g());
        }
        List L0 = Da.D.L0(Da.D.Q0(arrayList));
        int size = L0.size();
        for (int i = 0; i < size; i++) {
            ((b) L0.get(i)).e(bVar, this.a);
        }
    }

    public final void z(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((d) list.get(i)).q();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Da.A.D(arrayList, ((d) it.next()).g());
        }
        List L0 = Da.D.L0(Da.D.Q0(arrayList));
        int size2 = L0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((b) L0.get(i2)).g(this.a);
        }
    }
}
