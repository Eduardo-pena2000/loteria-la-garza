package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.b0;
import androidx.fragment.app.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f extends b0 {

    public static final class a extends b0.b {
        public final b d;

        public static final class a implements Animation.AnimationListener {
            public final /* synthetic */ b0.d a;
            public final /* synthetic */ ViewGroup b;
            public final /* synthetic */ View c;
            public final /* synthetic */ a d;

            public a(b0.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.a = dVar;
                this.b = viewGroup;
                this.c = view;
                this.d = aVar;
            }

            public static /* synthetic */ void a(ViewGroup viewGroup, View view, a aVar) {
                b(viewGroup, view, aVar);
            }

            public static final void b(ViewGroup viewGroup, View view, a aVar) {
                kotlin.jvm.internal.t.g(viewGroup, "$container");
                kotlin.jvm.internal.t.g(aVar, "this$0");
                viewGroup.endViewTransition(view);
                aVar.h().a().f(aVar);
            }

            public void onAnimationEnd(Animation animation) {
                kotlin.jvm.internal.t.g(animation, "animation");
                ViewGroup viewGroup = this.b;
                viewGroup.post(new androidx.fragment.app.e(viewGroup, this.c, this.d));
                if (J.N0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
                }
            }

            public void onAnimationRepeat(Animation animation) {
                kotlin.jvm.internal.t.g(animation, "animation");
            }

            public void onAnimationStart(Animation animation) {
                kotlin.jvm.internal.t.g(animation, "animation");
                if (J.N0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b bVar) {
            kotlin.jvm.internal.t.g(bVar, "animationInfo");
            this.d = bVar;
        }

        public void c(ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
            b0.d a2 = this.d.a();
            View view = a2.i().mView;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            this.d.a().f(this);
            if (J.N0(2)) {
                Log.v("FragmentManager", "Animation from operation " + a2 + " has been cancelled.");
            }
        }

        public void d(ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
            if (this.d.b()) {
                this.d.a().f(this);
                return;
            }
            Context context = viewGroup.getContext();
            b0.d a2 = this.d.a();
            View view = a2.i().mView;
            b bVar = this.d;
            kotlin.jvm.internal.t.f(context, "context");
            v.a c = bVar.c(context);
            if (c == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = c.a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (a2.h() != b0.d.b.REMOVED) {
                view.startAnimation(animation);
                this.d.a().f(this);
                return;
            }
            viewGroup.startViewTransition(view);
            v.b bVar2 = new v.b(animation, viewGroup, view);
            bVar2.setAnimationListener(new a(a2, viewGroup, view, this));
            view.startAnimation(bVar2);
            if (J.N0(2)) {
                Log.v("FragmentManager", "Animation from operation " + a2 + " has started.");
            }
        }

        public final b h() {
            return this.d;
        }
    }

    public static final class b extends f {
        public final boolean b;
        public boolean c;
        public v.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0.d dVar, boolean z) {
            super(dVar);
            kotlin.jvm.internal.t.g(dVar, "operation");
            this.b = z;
        }

        public final v.a c(Context context) {
            kotlin.jvm.internal.t.g(context, "context");
            if (this.c) {
                return this.d;
            }
            v.a b = v.b(context, a().i(), a().h() == b0.d.b.VISIBLE, this.b);
            this.d = b;
            this.c = true;
            return b;
        }
    }

    public static final class c extends b0.b {
        public final b d;
        public AnimatorSet e;

        public static final class a extends AnimatorListenerAdapter {
            public final /* synthetic */ ViewGroup a;
            public final /* synthetic */ View b;
            public final /* synthetic */ boolean c;
            public final /* synthetic */ b0.d d;
            public final /* synthetic */ c e;

            public a(ViewGroup viewGroup, View view, boolean z, b0.d dVar, c cVar) {
                this.a = viewGroup;
                this.b = view;
                this.c = z;
                this.d = dVar;
                this.e = cVar;
            }

            public void onAnimationEnd(Animator animator) {
                kotlin.jvm.internal.t.g(animator, "anim");
                this.a.endViewTransition(this.b);
                if (this.c) {
                    b0.d.b h = this.d.h();
                    View view = this.b;
                    kotlin.jvm.internal.t.f(view, "viewToAnimate");
                    h.b(view, this.a);
                }
                this.e.h().a().f(this.e);
                if (J.N0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.d + " has ended.");
                }
            }
        }

        public c(b bVar) {
            kotlin.jvm.internal.t.g(bVar, "animatorInfo");
            this.d = bVar;
        }

        public boolean b() {
            return true;
        }

        public void c(ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
            AnimatorSet animatorSet = this.e;
            if (animatorSet == null) {
                this.d.a().f(this);
                return;
            }
            b0.d a2 = this.d.a();
            if (!a2.n()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                e.a.a(animatorSet);
            }
            if (J.N0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(a2);
                sb.append(" has been canceled");
                sb.append(a2.n() ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }

        public void d(ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
            b0.d a2 = this.d.a();
            AnimatorSet animatorSet = this.e;
            if (animatorSet == null) {
                this.d.a().f(this);
                return;
            }
            animatorSet.start();
            if (J.N0(2)) {
                Log.v("FragmentManager", "Animator from operation " + a2 + " has started.");
            }
        }

        public void e(d.b bVar, ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(bVar, "backEvent");
            kotlin.jvm.internal.t.g(viewGroup, "container");
            b0.d a2 = this.d.a();
            AnimatorSet animatorSet = this.e;
            if (animatorSet == null) {
                this.d.a().f(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !a2.i().mTransitioning) {
                return;
            }
            if (J.N0(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + a2);
            }
            long a3 = d.a.a(animatorSet);
            long a4 = (long) (bVar.a() * a3);
            if (a4 == 0) {
                a4 = 1;
            }
            if (a4 == a3) {
                a4 = a3 - 1;
            }
            if (J.N0(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + a4 + " for Animator " + animatorSet + " on operation " + a2);
            }
            e.a.b(animatorSet, a4);
        }

        public void f(ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
            if (this.d.b()) {
                return;
            }
            Context context = viewGroup.getContext();
            b bVar = this.d;
            kotlin.jvm.internal.t.f(context, "context");
            v.a c = bVar.c(context);
            this.e = c != null ? c.b : null;
            b0.d a2 = this.d.a();
            p i = a2.i();
            boolean z = a2.h() == b0.d.b.GONE;
            View view = i.mView;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.e;
            if (animatorSet != null) {
                animatorSet.addListener(new a(viewGroup, view, z, a2, this));
            }
            AnimatorSet animatorSet2 = this.e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final b h() {
            return this.d;
        }
    }

    public static final class d {
        public static final d a = new d();

        public final long a(AnimatorSet animatorSet) {
            kotlin.jvm.internal.t.g(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    public static final class e {
        public static final e a = new e();

        public final void a(AnimatorSet animatorSet) {
            kotlin.jvm.internal.t.g(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j) {
            kotlin.jvm.internal.t.g(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j);
        }
    }

    public static class f {
        public final b0.d a;

        public f(b0.d dVar) {
            kotlin.jvm.internal.t.g(dVar, "operation");
            this.a = dVar;
        }

        public final b0.d a() {
            return this.a;
        }

        public final boolean b() {
            b0.d.b bVar;
            View view = this.a.i().mView;
            b0.d.b a = view != null ? b0.d.b.a.a(view) : null;
            b0.d.b h = this.a.h();
            return a == h || !(a == (bVar = b0.d.b.VISIBLE) || h == bVar);
        }
    }

    public static final class g extends b0.b {
        public final List d;
        public final b0.d e;
        public final b0.d f;
        public final W g;
        public final Object h;
        public final ArrayList i;
        public final ArrayList j;
        public final w.a k;
        public final ArrayList l;
        public final ArrayList m;
        public final w.a n;
        public final w.a o;
        public final boolean p;
        public final P1.e q;
        public Object r;

        public static final class a extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ ViewGroup b;
            public final /* synthetic */ Object c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.b = viewGroup;
                this.c = obj;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return Ca.I.a;
            }

            public final void invoke() {
                g.this.v().e(this.b, this.c);
            }
        }

        public static final class b extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ ViewGroup b;
            public final /* synthetic */ Object c;
            public final /* synthetic */ kotlin.jvm.internal.O d;

            public static final class a extends kotlin.jvm.internal.u implements Qa.a {
                public final /* synthetic */ g a;
                public final /* synthetic */ ViewGroup b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(g gVar, ViewGroup viewGroup) {
                    super(0);
                    this.a = gVar;
                    this.b = viewGroup;
                }

                public static /* synthetic */ void a(g gVar, ViewGroup viewGroup) {
                    b(gVar, viewGroup);
                }

                public static final void b(g gVar, ViewGroup viewGroup) {
                    kotlin.jvm.internal.t.g(gVar, "this$0");
                    kotlin.jvm.internal.t.g(viewGroup, "$container");
                    Iterator it = gVar.w().iterator();
                    while (it.hasNext()) {
                        b0.d a = ((h) it.next()).a();
                        View view = a.i().getView();
                        if (view != null) {
                            a.h().b(view, viewGroup);
                        }
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    invoke();
                    return Ca.I.a;
                }

                public final void invoke() {
                    if (J.N0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    W v = this.a.v();
                    Object s = this.a.s();
                    kotlin.jvm.internal.t.d(s);
                    v.d(s, new m(this.a, this.b));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ViewGroup viewGroup, Object obj, kotlin.jvm.internal.O o) {
                super(0);
                this.b = viewGroup;
                this.c = obj;
                this.d = o;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return Ca.I.a;
            }

            public final void invoke() {
                g gVar = g.this;
                gVar.C(gVar.v().j(this.b, this.c));
                boolean z = g.this.s() != null;
                Object obj = this.c;
                ViewGroup viewGroup = this.b;
                if (!z) {
                    throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
                }
                this.d.a = new a(g.this, viewGroup);
                if (J.N0(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + g.this.t() + " to " + g.this.u());
                }
            }
        }

        public g(List list, b0.d dVar, b0.d dVar2, W w, Object obj, ArrayList arrayList, ArrayList arrayList2, w.a aVar, ArrayList arrayList3, ArrayList arrayList4, w.a aVar2, w.a aVar3, boolean z) {
            kotlin.jvm.internal.t.g(list, "transitionInfos");
            kotlin.jvm.internal.t.g(w, "transitionImpl");
            kotlin.jvm.internal.t.g(arrayList, "sharedElementFirstOutViews");
            kotlin.jvm.internal.t.g(arrayList2, "sharedElementLastInViews");
            kotlin.jvm.internal.t.g(aVar, "sharedElementNameMapping");
            kotlin.jvm.internal.t.g(arrayList3, "enteringNames");
            kotlin.jvm.internal.t.g(arrayList4, "exitingNames");
            kotlin.jvm.internal.t.g(aVar2, "firstOutViews");
            kotlin.jvm.internal.t.g(aVar3, "lastInViews");
            this.d = list;
            this.e = dVar;
            this.f = dVar2;
            this.g = w;
            this.h = obj;
            this.i = arrayList;
            this.j = arrayList2;
            this.k = aVar;
            this.l = arrayList3;
            this.m = arrayList4;
            this.n = aVar2;
            this.o = aVar3;
            this.p = z;
            this.q = new P1.e();
        }

        public static final void A(b0.d dVar, g gVar) {
            kotlin.jvm.internal.t.g(dVar, "$operation");
            kotlin.jvm.internal.t.g(gVar, "this$0");
            if (J.N0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.f(gVar);
        }

        public static /* synthetic */ void h(b0.d dVar, b0.d dVar2, g gVar) {
            p(dVar, dVar2, gVar);
        }

        public static /* synthetic */ void i(W w, View view, Rect rect) {
            q(w, view, rect);
        }

        public static /* synthetic */ void j(ArrayList arrayList) {
            r(arrayList);
        }

        public static /* synthetic */ void k(kotlin.jvm.internal.O o) {
            z(o);
        }

        public static /* synthetic */ void l(b0.d dVar, g gVar) {
            y(dVar, gVar);
        }

        public static /* synthetic */ void m(b0.d dVar, g gVar) {
            A(dVar, gVar);
        }

        public static final void p(b0.d dVar, b0.d dVar2, g gVar) {
            kotlin.jvm.internal.t.g(gVar, "this$0");
            U.a(dVar.i(), dVar2.i(), gVar.p, gVar.o, false);
        }

        public static final void q(W w, View view, Rect rect) {
            kotlin.jvm.internal.t.g(w, "$impl");
            kotlin.jvm.internal.t.g(rect, "$lastInEpicenterRect");
            w.k(view, rect);
        }

        public static final void r(ArrayList arrayList) {
            kotlin.jvm.internal.t.g(arrayList, "$transitioningViews");
            U.d(arrayList, 4);
        }

        public static final void y(b0.d dVar, g gVar) {
            kotlin.jvm.internal.t.g(dVar, "$operation");
            kotlin.jvm.internal.t.g(gVar, "this$0");
            if (J.N0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.f(gVar);
        }

        public static final void z(kotlin.jvm.internal.O o) {
            kotlin.jvm.internal.t.g(o, "$seekCancelLambda");
            Qa.a aVar = (Qa.a) o.a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void B(ArrayList arrayList, ViewGroup viewGroup, Qa.a aVar) {
            U.d(arrayList, 4);
            ArrayList q = this.g.q(this.j);
            if (J.N0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    kotlin.jvm.internal.t.f(next, "sharedElementFirstOutViews");
                    View view = (View) next;
                    Log.v("FragmentManager", "View: " + view + " Name: " + T1.Z.z(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                Iterator it2 = this.j.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    kotlin.jvm.internal.t.f(next2, "sharedElementLastInViews");
                    View view2 = (View) next2;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + T1.Z.z(view2));
                }
            }
            aVar.invoke();
            this.g.y(viewGroup, this.i, this.j, q, this.k);
            U.d(arrayList, 0);
            this.g.A(this.h, this.i, this.j);
        }

        public final void C(Object obj) {
            this.r = obj;
        }

        public boolean b() {
            Object obj;
            if (this.g.m()) {
                List<h> list = this.d;
                if (list != null && list.isEmpty()) {
                    obj = this.h;
                    if (obj != null) {
                    }
                    return true;
                }
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.f() == null || !this.g.n(hVar.f())) {
                        break;
                    }
                }
                obj = this.h;
                if (obj != null || this.g.n(obj)) {
                    return true;
                }
            }
            return false;
        }

        public void c(ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
            this.q.a();
        }

        public void d(ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (h hVar : this.d) {
                    b0.d a2 = hVar.a();
                    if (J.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + a2);
                    }
                    hVar.a().f(this);
                }
                return;
            }
            Object obj = this.r;
            if (obj != null) {
                W w = this.g;
                kotlin.jvm.internal.t.d(obj);
                w.c(obj);
                if (J.N0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.e + " to " + this.f);
                    return;
                }
                return;
            }
            Ca.q o = o(viewGroup, this.f, this.e);
            ArrayList arrayList = (ArrayList) o.a();
            Object b2 = o.b();
            List list = this.d;
            ArrayList<b0.d> arrayList2 = new ArrayList(Da.w.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).a());
            }
            for (b0.d dVar : arrayList2) {
                this.g.w(dVar.i(), b2, this.q, new androidx.fragment.app.i(dVar, this));
            }
            B(arrayList, viewGroup, new a(viewGroup, b2));
            if (J.N0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.e + " to " + this.f);
            }
        }

        public void e(d.b bVar, ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(bVar, "backEvent");
            kotlin.jvm.internal.t.g(viewGroup, "container");
            Object obj = this.r;
            if (obj != null) {
                this.g.t(obj, bVar.a());
            }
        }

        public void f(ViewGroup viewGroup) {
            kotlin.jvm.internal.t.g(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    b0.d a2 = ((h) it.next()).a();
                    if (J.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + a2);
                    }
                }
                return;
            }
            if (x() && this.h != null && !b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.h + " between " + this.e + " and " + this.f + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (b() && x()) {
                kotlin.jvm.internal.O o = new kotlin.jvm.internal.O();
                Ca.q o2 = o(viewGroup, this.f, this.e);
                ArrayList arrayList = (ArrayList) o2.a();
                Object b2 = o2.b();
                List list = this.d;
                ArrayList<b0.d> arrayList2 = new ArrayList(Da.w.y(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h) it2.next()).a());
                }
                for (b0.d dVar : arrayList2) {
                    this.g.x(dVar.i(), b2, this.q, new androidx.fragment.app.g(o), new androidx.fragment.app.h(dVar, this));
                }
                B(arrayList, viewGroup, new b(viewGroup, b2, o));
            }
        }

        public final void n(ArrayList arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (T1.d0.a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    kotlin.jvm.internal.t.f(childAt, "child");
                    n(arrayList, childAt);
                }
            }
        }

        public final Ca.q o(ViewGroup viewGroup, b0.d dVar, b0.d dVar2) {
            b0.d dVar3 = dVar;
            View view = new View(viewGroup.getContext());
            Rect rect = new Rect();
            Iterator it = this.d.iterator();
            boolean z = false;
            View view2 = null;
            while (it.hasNext()) {
                if (((h) it.next()).g() && dVar2 != null && dVar3 != null && !this.k.isEmpty() && this.h != null) {
                    U.a(dVar.i(), dVar2.i(), this.p, this.n, true);
                    T1.K.a(viewGroup, new j(dVar3, dVar2, this));
                    this.i.addAll(this.n.values());
                    if (!this.m.isEmpty()) {
                        Object obj = this.m.get(0);
                        kotlin.jvm.internal.t.f(obj, "exitingNames[0]");
                        view2 = (View) this.n.get((String) obj);
                        this.g.v(this.h, view2);
                    }
                    this.j.addAll(this.o.values());
                    if (!this.l.isEmpty()) {
                        Object obj2 = this.l.get(0);
                        kotlin.jvm.internal.t.f(obj2, "enteringNames[0]");
                        View view3 = (View) this.o.get((String) obj2);
                        if (view3 != null) {
                            T1.K.a(viewGroup, new k(this.g, view3, rect));
                            z = true;
                        }
                    }
                    this.g.z(this.h, view, this.i);
                    W w = this.g;
                    Object obj3 = this.h;
                    w.s(obj3, null, null, null, null, obj3, this.j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.d.iterator();
            Object obj4 = null;
            Object obj5 = null;
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                b0.d a2 = hVar.a();
                Iterator it3 = it2;
                Object h = this.g.h(hVar.f());
                if (h != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Object obj6 = obj5;
                    View view4 = a2.i().mView;
                    Object obj7 = obj4;
                    kotlin.jvm.internal.t.f(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.h != null && (a2 == dVar2 || a2 == dVar3)) {
                        if (a2 == dVar2) {
                            arrayList2.removeAll(Da.D.Q0(this.i));
                        } else {
                            arrayList2.removeAll(Da.D.Q0(this.j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.g.a(h, view);
                    } else {
                        this.g.b(h, arrayList2);
                        this.g.s(h, h, arrayList2, null, null, null, null);
                        if (a2.h() == b0.d.b.GONE) {
                            a2.r(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(a2.i().mView);
                            this.g.r(h, a2.i().mView, arrayList3);
                            T1.K.a(viewGroup, new l(arrayList2));
                        }
                    }
                    if (a2.h() == b0.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z) {
                            this.g.u(h, rect);
                        }
                        if (J.N0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + h);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Object next = it4.next();
                                kotlin.jvm.internal.t.f(next, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) next));
                            }
                        }
                    } else {
                        this.g.v(h, view2);
                        if (J.N0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + h);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            Iterator it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                Object next2 = it5.next();
                                kotlin.jvm.internal.t.f(next2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) next2));
                            }
                        }
                    }
                    if (hVar.h()) {
                        obj4 = this.g.p(obj7, h, null);
                        dVar3 = dVar;
                        it2 = it3;
                        obj5 = obj6;
                    } else {
                        obj4 = obj7;
                        obj5 = this.g.p(obj6, h, null);
                        dVar3 = dVar;
                        it2 = it3;
                    }
                } else {
                    dVar3 = dVar;
                    it2 = it3;
                }
            }
            Object o = this.g.o(obj4, obj5, this.h);
            if (J.N0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + o);
            }
            return new Ca.q(arrayList, o);
        }

        public final Object s() {
            return this.r;
        }

        public final b0.d t() {
            return this.e;
        }

        public final b0.d u() {
            return this.f;
        }

        public final W v() {
            return this.g;
        }

        public final List w() {
            return this.d;
        }

        public final boolean x() {
            List list = this.d;
            if (list != null && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).a().i().mTransitioning) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class h extends f {
        public final Object b;
        public final boolean c;
        public final Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b0.d dVar, boolean z, boolean z2) {
            Object returnTransition;
            super(dVar);
            kotlin.jvm.internal.t.g(dVar, "operation");
            b0.d.b h = dVar.h();
            b0.d.b bVar = b0.d.b.VISIBLE;
            if (h == bVar) {
                p i = dVar.i();
                returnTransition = z ? i.getReenterTransition() : i.getEnterTransition();
            } else {
                p i2 = dVar.i();
                returnTransition = z ? i2.getReturnTransition() : i2.getExitTransition();
            }
            this.b = returnTransition;
            this.c = dVar.h() == bVar ? z ? dVar.i().getAllowReturnTransitionOverlap() : dVar.i().getAllowEnterTransitionOverlap() : true;
            this.d = z2 ? z ? dVar.i().getSharedElementReturnTransition() : dVar.i().getSharedElementEnterTransition() : null;
        }

        public final W c() {
            W d = d(this.b);
            W d2 = d(this.d);
            if (d == null || d2 == null || d == d2) {
                return d == null ? d2 : d;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().i() + " returned Transition " + this.b + " which uses a different Transition  type than its shared element transition " + this.d).toString());
        }

        public final W d(Object obj) {
            if (obj == null) {
                return null;
            }
            W w = U.b;
            if (w != null && w.g(obj)) {
                return w;
            }
            W w2 = U.c;
            if (w2 != null && w2.g(obj)) {
                return w2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().i() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final Object e() {
            return this.d;
        }

        public final Object f() {
            return this.b;
        }

        public final boolean g() {
            return this.d != null;
        }

        public final boolean h() {
            return this.c;
        }
    }

    public static final class i extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Collection a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Collection collection) {
            super(1);
            this.a = collection;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            kotlin.jvm.internal.t.g(entry, "entry");
            return Boolean.valueOf(Da.D.Y(this.a, T1.Z.z((View) entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ViewGroup viewGroup) {
        super(viewGroup);
        kotlin.jvm.internal.t.g(viewGroup, "container");
    }

    public static /* synthetic */ void C(f fVar, b0.d dVar) {
        E(fVar, dVar);
    }

    public static final void E(f fVar, b0.d dVar) {
        kotlin.jvm.internal.t.g(fVar, "this$0");
        kotlin.jvm.internal.t.g(dVar, "$operation");
        fVar.c(dVar);
    }

    public final void D(List list) {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Da.A.D(arrayList2, ((b) it.next()).a().g());
        }
        boolean isEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            Context context = t().getContext();
            b0.d a2 = bVar.a();
            kotlin.jvm.internal.t.f(context, "context");
            v.a c2 = bVar.c(context);
            if (c2 != null) {
                if (c2.b == null) {
                    arrayList.add(bVar);
                } else {
                    p i2 = a2.i();
                    if (a2.g().isEmpty()) {
                        if (a2.h() == b0.d.b.GONE) {
                            a2.r(false);
                        }
                        a2.b(new c(bVar));
                        z = true;
                    } else if (J.N0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + i2 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            b0.d a3 = bVar2.a();
            p i3 = a3.i();
            if (isEmpty) {
                if (!z) {
                    a3.b(new a(bVar2));
                } else if (J.N0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + i3 + " as Animations cannot run alongside Animators.");
                }
            } else if (J.N0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + i3 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void F(List list, boolean z, b0.d dVar, b0.d dVar2) {
        Object obj;
        W w;
        Iterator it;
        Ca.q a2;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!((h) obj2).b()) {
                arrayList.add(obj2);
            }
        }
        ArrayList<h> arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((h) obj3).c() != null) {
                arrayList2.add(obj3);
            }
        }
        W w2 = null;
        for (h hVar : arrayList2) {
            W c2 = hVar.c();
            if (w2 != null && c2 != w2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.a().i() + " returned Transition " + hVar.f() + " which uses a different Transition type than other Fragments.").toString());
            }
            w2 = c2;
        }
        if (w2 == null) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        w.a aVar = new w.a();
        Collection arrayList5 = new ArrayList();
        Collection arrayList6 = new ArrayList();
        w.a aVar2 = new w.a();
        w.a aVar3 = new w.a();
        Iterator it2 = arrayList2.iterator();
        Collection collection = arrayList5;
        Collection collection2 = arrayList6;
        loop3: while (true) {
            obj = null;
            while (it2.hasNext()) {
                h hVar2 = (h) it2.next();
                if (hVar2.g() && dVar != null && dVar2 != null) {
                    obj = w2.B(w2.h(hVar2.e()));
                    collection2 = dVar2.i().getSharedElementSourceNames();
                    kotlin.jvm.internal.t.f(collection2, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList sharedElementSourceNames = dVar.i().getSharedElementSourceNames();
                    kotlin.jvm.internal.t.f(sharedElementSourceNames, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList sharedElementTargetNames = dVar.i().getSharedElementTargetNames();
                    kotlin.jvm.internal.t.f(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    it = it2;
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = size;
                        int indexOf = collection2.indexOf(sharedElementTargetNames.get(i2));
                        ArrayList arrayList7 = sharedElementTargetNames;
                        if (indexOf != -1) {
                            collection2.set(indexOf, sharedElementSourceNames.get(i2));
                        }
                        i2++;
                        size = i3;
                        sharedElementTargetNames = arrayList7;
                    }
                    collection = dVar2.i().getSharedElementTargetNames();
                    kotlin.jvm.internal.t.f(collection, "lastIn.fragment.sharedElementTargetNames");
                    if (z) {
                        dVar.i().getEnterTransitionCallback();
                        dVar2.i().getExitTransitionCallback();
                        a2 = Ca.x.a((Object) null, (Object) null);
                    } else {
                        dVar.i().getExitTransitionCallback();
                        dVar2.i().getEnterTransitionCallback();
                        a2 = Ca.x.a((Object) null, (Object) null);
                    }
                    android.support.v4.media.session.b.a(a2.a());
                    android.support.v4.media.session.b.a(a2.b());
                    int size2 = collection2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj4 = collection2.get(i4);
                        int i5 = size2;
                        kotlin.jvm.internal.t.f(obj4, "exitingNames[i]");
                        Object obj5 = collection.get(i4);
                        kotlin.jvm.internal.t.f(obj5, "enteringNames[i]");
                        aVar.put((String) obj4, (String) obj5);
                        i4++;
                        size2 = i5;
                        w2 = w2;
                    }
                    w = w2;
                    if (J.N0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        for (Iterator it3 = collection.iterator(); it3.hasNext(); it3 = it3) {
                            Log.v("FragmentManager", "Name: " + ((String) it3.next()));
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for (Iterator it4 = collection2.iterator(); it4.hasNext(); it4 = it4) {
                            Log.v("FragmentManager", "Name: " + ((String) it4.next()));
                        }
                    }
                    View view = dVar.i().mView;
                    kotlin.jvm.internal.t.f(view, "firstOut.fragment.mView");
                    G(aVar2, view);
                    aVar2.r(collection2);
                    aVar.r((Collection) aVar2.keySet());
                    View view2 = dVar2.i().mView;
                    kotlin.jvm.internal.t.f(view2, "lastIn.fragment.mView");
                    G(aVar3, view2);
                    aVar3.r(collection);
                    aVar3.r(aVar.values());
                    U.c(aVar, aVar3);
                    Collection keySet = aVar.keySet();
                    kotlin.jvm.internal.t.f(keySet, "sharedElementNameMapping.keys");
                    H(aVar2, keySet);
                    Collection values = aVar.values();
                    kotlin.jvm.internal.t.f(values, "sharedElementNameMapping.values");
                    H(aVar3, values);
                    if (aVar.isEmpty()) {
                        break;
                    }
                } else {
                    w = w2;
                    it = it2;
                }
                it2 = it;
                w2 = w;
            }
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + dVar + " and " + dVar2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
            arrayList3.clear();
            arrayList4.clear();
            it2 = it;
            w2 = w;
        }
        W w3 = w2;
        if (obj == null) {
            if (arrayList2.isEmpty()) {
                return;
            }
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                if (((h) it5.next()).f() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList2, dVar, dVar2, w3, obj, arrayList3, arrayList4, aVar, collection, collection2, aVar2, aVar3, z);
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            ((h) it6.next()).a().b(gVar);
        }
    }

    public final void G(Map map, View view) {
        String z = T1.Z.z(view);
        if (z != null) {
            map.put(z, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    kotlin.jvm.internal.t.f(childAt, "child");
                    G(map, childAt);
                }
            }
        }
    }

    public final void H(w.a aVar, Collection collection) {
        Iterable entrySet = aVar.entrySet();
        kotlin.jvm.internal.t.f(entrySet, "entries");
        Da.A.N(entrySet, new i(collection));
    }

    public final void I(List list) {
        p i2 = ((b0.d) Da.D.p0(list)).i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0.d dVar = (b0.d) it.next();
            dVar.i().mAnimationInfo.c = i2.mAnimationInfo.c;
            dVar.i().mAnimationInfo.d = i2.mAnimationInfo.d;
            dVar.i().mAnimationInfo.e = i2.mAnimationInfo.e;
            dVar.i().mAnimationInfo.f = i2.mAnimationInfo.f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.util.List r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = "operations"
            kotlin.jvm.internal.t.g(r9, r0)
            java.util.Iterator r0 = r9.iterator()
        L9:
            boolean r1 = r0.hasNext()
            r2 = 0
            java.lang.String r3 = "operation.fragment.mView"
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            r4 = r1
            androidx.fragment.app.b0$d r4 = (androidx.fragment.app.b0.d) r4
            androidx.fragment.app.b0$d$b$a r5 = androidx.fragment.app.b0.d.b.a
            androidx.fragment.app.p r6 = r4.i()
            android.view.View r6 = r6.mView
            kotlin.jvm.internal.t.f(r6, r3)
            androidx.fragment.app.b0$d$b r5 = r5.a(r6)
            androidx.fragment.app.b0$d$b r6 = androidx.fragment.app.b0.d.b.VISIBLE
            if (r5 != r6) goto L9
            androidx.fragment.app.b0$d$b r4 = r4.h()
            if (r4 == r6) goto L9
            goto L34
        L33:
            r1 = r2
        L34:
            androidx.fragment.app.b0$d r1 = (androidx.fragment.app.b0.d) r1
            int r0 = r9.size()
            java.util.ListIterator r0 = r9.listIterator(r0)
        L3e:
            boolean r4 = r0.hasPrevious()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r0.previous()
            r5 = r4
            androidx.fragment.app.b0$d r5 = (androidx.fragment.app.b0.d) r5
            androidx.fragment.app.b0$d$b$a r6 = androidx.fragment.app.b0.d.b.a
            androidx.fragment.app.p r7 = r5.i()
            android.view.View r7 = r7.mView
            kotlin.jvm.internal.t.f(r7, r3)
            androidx.fragment.app.b0$d$b r6 = r6.a(r7)
            androidx.fragment.app.b0$d$b r7 = androidx.fragment.app.b0.d.b.VISIBLE
            if (r6 == r7) goto L3e
            androidx.fragment.app.b0$d$b r5 = r5.h()
            if (r5 != r7) goto L3e
            r2 = r4
        L65:
            androidx.fragment.app.b0$d r2 = (androidx.fragment.app.b0.d) r2
            r0 = 2
            boolean r0 = androidx.fragment.app.J.N0(r0)
            if (r0 == 0) goto L8c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Executing operations from "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = " to "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r0)
        L8c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r8.I(r9)
            java.util.Iterator r9 = r9.iterator()
        L9d:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto Lcd
            java.lang.Object r4 = r9.next()
            androidx.fragment.app.b0$d r4 = (androidx.fragment.app.b0.d) r4
            androidx.fragment.app.f$b r5 = new androidx.fragment.app.f$b
            r5.<init>(r4, r10)
            r0.add(r5)
            androidx.fragment.app.f$h r5 = new androidx.fragment.app.f$h
            r6 = 0
            r7 = 1
            if (r10 == 0) goto Lbb
            if (r4 != r1) goto Lbe
        Lb9:
            r6 = r7
            goto Lbe
        Lbb:
            if (r4 != r2) goto Lbe
            goto Lb9
        Lbe:
            r5.<init>(r4, r10, r6)
            r3.add(r5)
            androidx.fragment.app.d r5 = new androidx.fragment.app.d
            r5.<init>(r8, r4)
            r4.a(r5)
            goto L9d
        Lcd:
            r8.F(r3, r10, r1, r2)
            r8.D(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f.d(java.util.List, boolean):void");
    }
}
