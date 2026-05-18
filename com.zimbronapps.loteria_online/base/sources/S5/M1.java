package S5;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m1 {
    public String g;
    public String i;
    public String j;
    public boolean l;
    public String m;
    public long o;
    public final HashSet a = new HashSet();
    public final Bundle b = new Bundle();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final Bundle e = new Bundle();
    public final HashSet f = new HashSet();
    public final List h = new ArrayList();
    public int k = -1;
    public int n = 60000;

    public final /* synthetic */ HashSet A() {
        return this.f;
    }

    public final /* synthetic */ String B() {
        return this.g;
    }

    public final /* synthetic */ List C() {
        return this.h;
    }

    public final /* synthetic */ String D() {
        return this.i;
    }

    public final /* synthetic */ String a() {
        return this.j;
    }

    public final /* synthetic */ int b() {
        return this.k;
    }

    public final /* synthetic */ boolean c() {
        return this.l;
    }

    public final /* synthetic */ String d() {
        return this.m;
    }

    public final /* synthetic */ int e() {
        return this.n;
    }

    public final /* synthetic */ long f() {
        return this.o;
    }

    public final void g(String str) {
        this.a.add(str);
    }

    public final void h(Bundle bundle) {
        this.b.putAll(bundle);
    }

    public final void i(Class cls, Bundle bundle) {
        this.b.putBundle(cls.getName(), bundle);
    }

    public final void j(String str) {
        this.d.add(str);
    }

    public final void k(String str) {
        this.d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void l(String str) {
        this.g = str;
    }

    public final void m(List list) {
        List list2 = this.h;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                W5.p.f("neighboring content URL should not be null or empty");
            } else {
                list2.add(str);
            }
        }
    }

    public final void n(String str) {
        this.i = str;
    }

    public final void o(String str) {
        this.j = str;
    }

    public final void p(boolean z) {
        this.k = z ? 1 : 0;
    }

    public final void q(String str, String str2) {
        this.e.putString(str, str2);
    }

    public final void r(String str) {
        this.f.add(str);
    }

    public final void s(boolean z) {
        this.l = z;
    }

    public final void t(String str) {
        this.m = str;
    }

    public final void u(int i) {
        this.n = i;
    }

    public final /* synthetic */ HashSet v() {
        return this.a;
    }

    public final /* synthetic */ Bundle w() {
        return this.b;
    }

    public final /* synthetic */ HashMap x() {
        return this.c;
    }

    public final /* synthetic */ HashSet y() {
        return this.d;
    }

    public final /* synthetic */ Bundle z() {
        return this.e;
    }
}
