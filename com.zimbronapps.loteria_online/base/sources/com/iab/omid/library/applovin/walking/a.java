package com.iab.omid.library.applovin.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class a {
    private final HashMap a = new HashMap();
    private final HashMap b = new HashMap();
    private final HashMap c = new HashMap();
    private final HashSet d = new HashSet();
    private final HashSet e = new HashSet();
    private final HashSet f = new HashSet();
    private final HashMap g = new HashMap();
    private final HashSet h = new HashSet();
    private final Map i = new WeakHashMap();
    private boolean j;

    public static class a {
        private final e a;
        private final ArrayList b = new ArrayList();

        public a(e eVar, String str) {
            this.a = eVar;
            a(str);
        }

        public e a() {
            return this.a;
        }

        public ArrayList b() {
            return this.b;
        }

        public void a(String str) {
            this.b.add(str);
        }
    }

    public View a(String str) {
        return (View) this.c.get(str);
    }

    public a b(View view) {
        a aVar = (a) this.b.get(view);
        if (aVar != null) {
            this.b.remove(view);
        }
        return aVar;
    }

    public String c(View view) {
        if (this.a.size() == 0) {
            return null;
        }
        String str = (String) this.a.get(view);
        if (str != null) {
            this.a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.d.contains(view) ? c.a : this.j ? c.b : c.c;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c c = com.iab.omid.library.applovin.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : c.a()) {
                View e = aVar.e();
                if (aVar.h()) {
                    String c2 = aVar.c();
                    if (e != null) {
                        boolean e2 = h.e(e);
                        if (e2) {
                            this.h.add(c2);
                        }
                        String a2 = a(e, e2);
                        if (a2 == null) {
                            this.e.add(c2);
                            this.a.put(e, c2);
                            a(aVar);
                        } else if (a2 != "noWindowFocus") {
                            this.f.add(c2);
                            this.c.put(c2, e);
                            this.g.put(c2, a2);
                        }
                    } else {
                        this.f.add(c2);
                        this.g.put(c2, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.i.remove(view);
            return Boolean.FALSE;
        }
        if (this.i.containsKey(view)) {
            return (Boolean) this.i.get(view);
        }
        Map map = this.i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return (String) this.g.get(str);
    }

    public HashSet c() {
        return this.e;
    }

    public void d() {
        this.j = true;
    }

    public boolean e(View view) {
        if (!this.i.containsKey(view)) {
            return true;
        }
        this.i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a2 = h.a(view);
            if (a2 != null) {
                return a2;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.d.addAll(hashSet);
        return null;
    }

    public HashSet b() {
        return this.f;
    }

    public boolean c(String str) {
        return this.h.contains(str);
    }

    public void a() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.j = false;
        this.h.clear();
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        Iterator it = aVar.f().iterator();
        while (it.hasNext()) {
            a((e) it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = (View) eVar.c().get();
        if (view == null) {
            return;
        }
        a aVar2 = (a) this.b.get(view);
        if (aVar2 != null) {
            aVar2.a(aVar.c());
        } else {
            this.b.put(view, new a(eVar, aVar.c()));
        }
    }
}
