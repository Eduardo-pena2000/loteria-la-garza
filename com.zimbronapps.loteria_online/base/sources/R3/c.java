package R3;

import O2.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final g f;
    public final String[] g;
    public final String h;
    public final String i;
    public final c j;
    public final HashMap k;
    public final HashMap l;
    public List m;

    public c(String str, String str2, long j, long j2, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = gVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        this.h = (String) P2.a.e(str3);
        this.j = cVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static c c(String str, long j, long j2, g gVar, String[] strArr, String str2, String str3, c cVar) {
        return new c(str, null, j, j2, gVar, strArr, str2, str3, cVar);
    }

    public static c d(String str) {
        return new c(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public static SpannableStringBuilder k(String str, Map map) {
        if (!map.containsKey(str)) {
            a.b bVar = new a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) P2.a.e(((a.b) map.get(str)).e());
    }

    public void a(c cVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(cVar);
    }

    public final void b(Map map, a.b bVar, int i, int i2, int i3) {
        g f = f.f(this.f, this.g, map);
        SpannableStringBuilder e = bVar.e();
        if (e == null) {
            e = new SpannableStringBuilder();
            bVar.o(e);
        }
        SpannableStringBuilder spannableStringBuilder = e;
        if (f != null) {
            f.a(spannableStringBuilder, i, i2, f, this.j, map, i3);
            if ("p".equals(this.a)) {
                if (f.k() != Float.MAX_VALUE) {
                    bVar.m((f.k() * (-90.0f)) / 100.0f);
                }
                if (f.m() != null) {
                    bVar.p(f.m());
                }
                if (f.h() != null) {
                    bVar.j(f.h());
                }
            }
        }
    }

    public c f(int i) {
        List list = this.m;
        if (list != null) {
            return (c) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List h(long j, Map map, Map map2, Map map3) {
        ArrayList<Pair> arrayList = new ArrayList();
        n(j, this.h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j, false, this.h, treeMap);
        o(j, map, map2, this.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) P2.a.e((e) map2.get(pair.first));
                arrayList2.add(new a.b().f(decodeByteArray).k(eVar.b).l(0).h(eVar.c, 0).i(eVar.e).n(eVar.f).g(eVar.g).r(eVar.j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) P2.a.e((e) map2.get(entry.getKey()));
            a.b bVar = (a.b) entry.getValue();
            e((SpannableStringBuilder) P2.a.e(bVar.e()));
            bVar.h(eVar2.c, eVar2.d);
            bVar.i(eVar2.e);
            bVar.k(eVar2.b);
            bVar.n(eVar2.f);
            bVar.q(eVar2.i, eVar2.h);
            bVar.r(eVar2.j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public final void i(TreeSet treeSet, boolean z) {
        boolean equals = "p".equals(this.a);
        boolean equals2 = "div".equals(this.a);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((c) this.m.get(i)).i(treeSet, z || equals);
        }
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public String[] l() {
        return this.g;
    }

    public boolean m(long j) {
        long j2 = this.d;
        return (j2 == -9223372036854775807L && this.e == -9223372036854775807L) || (j2 <= j && this.e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.e) || (j2 <= j && j < this.e));
    }

    public final void n(long j, String str, List list) {
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (m(j) && "div".equals(this.a) && this.i != null) {
            list.add(new Pair(str, this.i));
            return;
        }
        for (int i = 0; i < g(); i++) {
            f(i).n(j, str, list);
        }
    }

    public final void o(long j, Map map, Map map2, String str, Map map3) {
        int i;
        if (m(j)) {
            String str2 = "".equals(this.h) ? str : this.h;
            Iterator it = this.l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int intValue = this.k.containsKey(str3) ? ((Integer) this.k.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    b(map, (a.b) P2.a.e((a.b) map3.get(str3)), intValue, intValue2, ((e) P2.a.e((e) map2.get(str2))).j);
                }
            }
            while (i < g()) {
                f(i).o(j, map, map2, str2, map3);
                i++;
            }
        }
    }

    public final void p(long j, boolean z, String str, Map map) {
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (this.c && z) {
            k(str, map).append((CharSequence) P2.a.e(this.b));
            return;
        }
        if ("br".equals(this.a) && z) {
            k(str, map).append('\n');
            return;
        }
        if (m(j)) {
            for (Map.Entry entry : map.entrySet()) {
                this.k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) P2.a.e(((a.b) entry.getValue()).e())).length()));
            }
            boolean equals = "p".equals(this.a);
            for (int i = 0; i < g(); i++) {
                f(i).p(j, z || equals, str, map);
            }
            if (equals) {
                f.c(k(str, map));
            }
            for (Map.Entry entry2 : map.entrySet()) {
                this.l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) P2.a.e(((a.b) entry2.getValue()).e())).length()));
            }
        }
    }
}
