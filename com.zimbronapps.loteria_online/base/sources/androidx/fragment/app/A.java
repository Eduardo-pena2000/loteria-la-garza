package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.J;
import androidx.fragment.app.T;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a extends T implements J.n {
    public final J t;
    public boolean u;
    public int v;
    public boolean w;

    public a(J j) {
        super(j.y0(), j.A0() != null ? j.A0().f().getClassLoader() : null);
        this.v = -1;
        this.w = false;
        this.t = j;
    }

    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (J.N0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.i) {
            return true;
        }
        this.t.j(this);
        return true;
    }

    public int f() {
        return o(false);
    }

    public int g() {
        return o(true);
    }

    public void h() {
        j();
        this.t.g0(this, false);
    }

    public void i() {
        j();
        this.t.g0(this, true);
    }

    public void k(int i, p pVar, String str, int i2) {
        super.k(i, pVar, str, i2);
        pVar.mFragmentManager = this.t;
    }

    public T l(p pVar) {
        J j = pVar.mFragmentManager;
        if (j == null || j == this.t) {
            return super.l(pVar);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + pVar.toString() + " is already attached to a FragmentManager.");
    }

    public void n(int i) {
        if (this.i) {
            if (J.N0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                T.a aVar = (T.a) this.c.get(i2);
                p pVar = aVar.b;
                if (pVar != null) {
                    pVar.mBackStackNesting += i;
                    if (J.N0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public int o(boolean z) {
        if (this.u) {
            throw new IllegalStateException("commit already called");
        }
        if (J.N0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new Y("FragmentManager"));
            p("  ", printWriter);
            printWriter.close();
        }
        this.u = true;
        if (this.i) {
            this.v = this.t.n();
        } else {
            this.v = -1;
        }
        this.t.d0(this, z);
        return this.v;
    }

    public void p(String str, PrintWriter printWriter) {
        q(str, printWriter, true);
    }

    public void q(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        if (this.c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            T.a aVar = (T.a) this.c.get(i);
            switch (aVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.b);
            if (z) {
                if (aVar.d != 0 || aVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.e));
                }
                if (aVar.f != 0 || aVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.g));
                }
            }
        }
    }

    public void r() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            T.a aVar = (T.a) this.c.get(i);
            p pVar = aVar.b;
            if (pVar != null) {
                pVar.mBeingSaved = this.w;
                pVar.setPopDirection(false);
                pVar.setNextTransition(this.h);
                pVar.setSharedElementNames(this.p, this.q);
            }
            switch (aVar.a) {
                case 1:
                    pVar.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.w1(pVar, false);
                    this.t.k(pVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    pVar.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.o1(pVar);
                    break;
                case 4:
                    pVar.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.K0(pVar);
                    break;
                case 5:
                    pVar.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.w1(pVar, false);
                    this.t.C1(pVar);
                    break;
                case 6:
                    pVar.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.B(pVar);
                    break;
                case 7:
                    pVar.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.w1(pVar, false);
                    this.t.p(pVar);
                    break;
                case 8:
                    this.t.A1(pVar);
                    break;
                case 9:
                    this.t.A1(null);
                    break;
                case 10:
                    this.t.z1(pVar, aVar.i);
                    break;
            }
        }
    }

    public void s() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            T.a aVar = (T.a) this.c.get(size);
            p pVar = aVar.b;
            if (pVar != null) {
                pVar.mBeingSaved = this.w;
                pVar.setPopDirection(true);
                pVar.setNextTransition(J.t1(this.h));
                pVar.setSharedElementNames(this.q, this.p);
            }
            switch (aVar.a) {
                case 1:
                    pVar.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.w1(pVar, true);
                    this.t.o1(pVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    pVar.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.k(pVar);
                    break;
                case 4:
                    pVar.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.C1(pVar);
                    break;
                case 5:
                    pVar.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.w1(pVar, true);
                    this.t.K0(pVar);
                    break;
                case 6:
                    pVar.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.p(pVar);
                    break;
                case 7:
                    pVar.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.w1(pVar, true);
                    this.t.B(pVar);
                    break;
                case 8:
                    this.t.A1(null);
                    break;
                case 9:
                    this.t.A1(pVar);
                    break;
                case 10:
                    this.t.z1(pVar, aVar.h);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.fragment.app.p t(java.util.ArrayList r17, androidx.fragment.app.p r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList r5 = r0.c
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList r5 = r0.c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.T$a r5 = (androidx.fragment.app.T.a) r5
            int r6 = r5.a
            r7 = 1
            if (r6 == r7) goto Lb6
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L5a
            if (r6 == r10) goto L43
            r8 = 6
            if (r6 == r8) goto L43
            r8 = 7
            if (r6 == r8) goto Lb6
            r8 = 8
            if (r6 == r8) goto L31
            goto Lbb
        L31:
            java.util.ArrayList r6 = r0.c
            androidx.fragment.app.T$a r8 = new androidx.fragment.app.T$a
            r8.<init>(r11, r3, r7)
            r6.add(r4, r8)
            r5.c = r7
            int r4 = r4 + 1
            androidx.fragment.app.p r3 = r5.b
            goto Lbb
        L43:
            androidx.fragment.app.p r6 = r5.b
            r1.remove(r6)
            androidx.fragment.app.p r5 = r5.b
            if (r5 != r3) goto Lbb
            java.util.ArrayList r3 = r0.c
            androidx.fragment.app.T$a r6 = new androidx.fragment.app.T$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbb
        L5a:
            androidx.fragment.app.p r6 = r5.b
            int r8 = r6.mContainerId
            int r12 = r17.size()
            int r12 = r12 - r7
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.p r14 = (androidx.fragment.app.p) r14
            int r15 = r14.mContainerId
            if (r15 != r8) goto La1
            if (r14 != r6) goto L74
            r13 = r7
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList r3 = r0.c
            androidx.fragment.app.T$a r15 = new androidx.fragment.app.T$a
            r15.<init>(r11, r14, r7)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            androidx.fragment.app.T$a r15 = new androidx.fragment.app.T$a
            r15.<init>(r10, r14, r7)
            int r2 = r5.d
            r15.d = r2
            int r2 = r5.f
            r15.f = r2
            int r2 = r5.e
            r15.e = r2
            int r2 = r5.g
            r15.g = r2
            java.util.ArrayList r2 = r0.c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList r2 = r0.c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.a = r7
            r5.c = r7
            r1.add(r6)
            goto Lbb
        Lb6:
            androidx.fragment.app.p r2 = r5.b
            r1.add(r2)
        Lbb:
            int r4 = r4 + r7
            goto L7
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.t(java.util.ArrayList, androidx.fragment.app.p):androidx.fragment.app.p");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    public String u() {
        return this.k;
    }

    public void v() {
        if (this.s != null) {
            for (int i = 0; i < this.s.size(); i++) {
                ((Runnable) this.s.get(i)).run();
            }
            this.s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.fragment.app.p w(java.util.ArrayList r6, androidx.fragment.app.p r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList r2 = r5.c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.T$a r2 = (androidx.fragment.app.T.a) r2
            int r3 = r2.a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.k$b r3 = r2.h
            r2.i = r3
            goto L32
        L22:
            androidx.fragment.app.p r7 = r2.b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.p r2 = r2.b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.p r2 = r2.b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.w(java.util.ArrayList, androidx.fragment.app.p):androidx.fragment.app.p");
    }
}
