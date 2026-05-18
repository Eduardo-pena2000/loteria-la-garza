package androidx.recyclerview.widget;

import T1.Z;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c extends k {
    public static TimeInterpolator s;
    public ArrayList h = new ArrayList();
    public ArrayList i = new ArrayList();
    public ArrayList j = new ArrayList();
    public ArrayList k = new ArrayList();
    public ArrayList l = new ArrayList();
    public ArrayList m = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList o = new ArrayList();
    public ArrayList p = new ArrayList();
    public ArrayList q = new ArrayList();
    public ArrayList r = new ArrayList();

    public class a implements Runnable {
        public final /* synthetic */ ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public void run() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.a, jVar.b, jVar.c, jVar.d, jVar.e);
            }
            this.a.clear();
            c.this.m.remove(this.a);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        public void run() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.a.clear();
            c.this.n.remove(this.a);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        public void run() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.B) it.next());
            }
            this.a.clear();
            c.this.l.remove(this.a);
        }
    }

    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.B a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public d(RecyclerView.B b, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = b;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.b.setListener((Animator.AnimatorListener) null);
            this.c.setAlpha(1.0f);
            c.this.G(this.a);
            c.this.q.remove(this.a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.H(this.a);
        }
    }

    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.B a;
        public final /* synthetic */ View b;
        public final /* synthetic */ ViewPropertyAnimator c;

        public e(RecyclerView.B b, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = b;
            this.b = view;
            this.c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.c.setListener((Animator.AnimatorListener) null);
            c.this.A(this.a);
            c.this.o.remove(this.a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.B(this.a);
        }
    }

    public class f extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.B a;
        public final /* synthetic */ int b;
        public final /* synthetic */ View c;
        public final /* synthetic */ int d;
        public final /* synthetic */ ViewPropertyAnimator e;

        public f(RecyclerView.B b, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = b;
            this.b = i;
            this.c = view;
            this.d = i2;
            this.e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.b != 0) {
                this.c.setTranslationX(0.0f);
            }
            if (this.d != 0) {
                this.c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.e.setListener((Animator.AnimatorListener) null);
            c.this.E(this.a);
            c.this.p.remove(this.a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.F(this.a);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public final /* synthetic */ i a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.b.setListener((Animator.AnimatorListener) null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            c.this.C(this.a.a, true);
            c.this.r.remove(this.a.a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.a.a, true);
        }
    }

    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ i a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.b.setListener((Animator.AnimatorListener) null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            c.this.C(this.a.b, false);
            c.this.r.remove(this.a.b);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.a.b, false);
        }
    }

    public static class j {
        public RecyclerView.B a;
        public int b;
        public int c;
        public int d;
        public int e;

        public j(RecyclerView.B b, int i, int i2, int i3, int i4) {
            this.a = b;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public void Q(RecyclerView.B b2) {
        View view = b2.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.o.add(b2);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(b2, view, animate)).start();
    }

    public void R(i iVar) {
        RecyclerView.B b2 = iVar.a;
        View view = b2 == null ? null : b2.itemView;
        RecyclerView.B b3 = iVar.b;
        View view2 = b3 != null ? b3.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.r.add(iVar.a);
            duration.translationX(iVar.e - iVar.c);
            duration.translationY(iVar.f - iVar.d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.r.add(iVar.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    public void S(RecyclerView.B b2, int i2, int i3, int i4, int i5) {
        View view = b2.itemView;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.p.add(b2);
        animate.setDuration(n()).setListener(new f(b2, i6, view, i7, animate)).start();
    }

    public final void T(RecyclerView.B b2) {
        View view = b2.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.q.add(b2);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(b2, animate, view)).start();
    }

    public void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.B) list.get(size)).itemView.animate().cancel();
        }
    }

    public void V() {
        if (p()) {
            return;
        }
        i();
    }

    public final void W(List list, RecyclerView.B b2) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, b2) && iVar.a == null && iVar.b == null) {
                list.remove(iVar);
            }
        }
    }

    public final void X(i iVar) {
        RecyclerView.B b2 = iVar.a;
        if (b2 != null) {
            Y(iVar, b2);
        }
        RecyclerView.B b3 = iVar.b;
        if (b3 != null) {
            Y(iVar, b3);
        }
    }

    public final boolean Y(i iVar, RecyclerView.B b2) {
        boolean z = false;
        if (iVar.b == b2) {
            iVar.b = null;
        } else {
            if (iVar.a != b2) {
                return false;
            }
            iVar.a = null;
            z = true;
        }
        b2.itemView.setAlpha(1.0f);
        b2.itemView.setTranslationX(0.0f);
        b2.itemView.setTranslationY(0.0f);
        C(b2, z);
        return true;
    }

    public final void Z(RecyclerView.B b2) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        b2.itemView.animate().setInterpolator(s);
        j(b2);
    }

    public boolean g(RecyclerView.B b2, List list) {
        return !list.isEmpty() || super.g(b2, list);
    }

    public void j(RecyclerView.B b2) {
        View view = b2.itemView;
        view.animate().cancel();
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.j.get(size)).a == b2) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(b2);
                this.j.remove(size);
            }
        }
        W(this.k, b2);
        if (this.h.remove(b2)) {
            view.setAlpha(1.0f);
            G(b2);
        }
        if (this.i.remove(b2)) {
            view.setAlpha(1.0f);
            A(b2);
        }
        for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.n.get(size2);
            W(arrayList, b2);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        for (int size3 = this.m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).a == b2) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(b2);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.l.get(size5);
            if (arrayList3.remove(b2)) {
                view.setAlpha(1.0f);
                A(b2);
                if (arrayList3.isEmpty()) {
                    this.l.remove(size5);
                }
            }
        }
        this.q.remove(b2);
        this.o.remove(b2);
        this.r.remove(b2);
        this.p.remove(b2);
        V();
    }

    public void k() {
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.j.get(size);
            View view = jVar.a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.a);
            this.j.remove(size);
        }
        for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.B) this.h.get(size2));
            this.h.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.B b2 = (RecyclerView.B) this.i.get(size3);
            b2.itemView.setAlpha(1.0f);
            A(b2);
            this.i.remove(size3);
        }
        for (int size4 = this.k.size() - 1; size4 >= 0; size4--) {
            X((i) this.k.get(size4));
        }
        this.k.clear();
        if (p()) {
            for (int size5 = this.m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.B b3 = (RecyclerView.B) arrayList2.get(size8);
                    b3.itemView.setAlpha(1.0f);
                    A(b3);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.n.remove(arrayList3);
                    }
                }
            }
            U(this.q);
            U(this.p);
            U(this.o);
            U(this.r);
            i();
        }
    }

    public boolean p() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public void u() {
        boolean isEmpty = this.h.isEmpty();
        boolean isEmpty2 = this.j.isEmpty();
        boolean isEmpty3 = this.k.isEmpty();
        boolean isEmpty4 = this.i.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            T((RecyclerView.B) it.next());
        }
        this.h.clear();
        if (!isEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.j);
            this.m.add(arrayList);
            this.j.clear();
            a aVar = new a(arrayList);
            if (isEmpty) {
                aVar.run();
            } else {
                Z.Q(((j) arrayList.get(0)).a.itemView, aVar, o());
            }
        }
        if (!isEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.k);
            this.n.add(arrayList2);
            this.k.clear();
            b bVar = new b(arrayList2);
            if (isEmpty) {
                bVar.run();
            } else {
                Z.Q(((i) arrayList2.get(0)).a.itemView, bVar, o());
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.i);
        this.l.add(arrayList3);
        this.i.clear();
        c cVar = new c(arrayList3);
        if (isEmpty && isEmpty2 && isEmpty3) {
            cVar.run();
        } else {
            Z.Q(((RecyclerView.B) arrayList3.get(0)).itemView, cVar, (!isEmpty ? o() : 0L) + Math.max(!isEmpty2 ? n() : 0L, isEmpty3 ? 0L : m()));
        }
    }

    public boolean w(RecyclerView.B b2) {
        Z(b2);
        b2.itemView.setAlpha(0.0f);
        this.i.add(b2);
        return true;
    }

    public boolean x(RecyclerView.B b2, RecyclerView.B b3, int i2, int i3, int i4, int i5) {
        if (b2 == b3) {
            return y(b2, i2, i3, i4, i5);
        }
        float translationX = b2.itemView.getTranslationX();
        float translationY = b2.itemView.getTranslationY();
        float alpha = b2.itemView.getAlpha();
        Z(b2);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        b2.itemView.setTranslationX(translationX);
        b2.itemView.setTranslationY(translationY);
        b2.itemView.setAlpha(alpha);
        if (b3 != null) {
            Z(b3);
            b3.itemView.setTranslationX(-i6);
            b3.itemView.setTranslationY(-i7);
            b3.itemView.setAlpha(0.0f);
        }
        this.k.add(new i(b2, b3, i2, i3, i4, i5));
        return true;
    }

    public boolean y(RecyclerView.B b2, int i2, int i3, int i4, int i5) {
        View view = b2.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) b2.itemView.getTranslationY());
        Z(b2);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            E(b2);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.j.add(new j(b2, translationX, translationY, i4, i5));
        return true;
    }

    public boolean z(RecyclerView.B b2) {
        Z(b2);
        this.h.add(b2);
        return true;
    }

    public static class i {
        public RecyclerView.B a;
        public RecyclerView.B b;
        public int c;
        public int d;
        public int e;
        public int f;

        public i(RecyclerView.B b, RecyclerView.B b2) {
            this.a = b;
            this.b = b2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
        }

        public i(RecyclerView.B b, RecyclerView.B b2, int i, int i2, int i3, int i4) {
            this(b, b2);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }
    }
}
