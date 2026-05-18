package Pb;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class t implements Vb.a {
    public final char a;
    public int b = 0;
    public LinkedList c = new LinkedList();

    public t(char c) {
        this.a = c;
    }

    public char a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public char c() {
        return this.a;
    }

    public int d(Vb.b bVar, Vb.b bVar2) {
        return f(bVar.length()).d(bVar, bVar2);
    }

    public void e(Vb.a aVar) {
        int b = aVar.b();
        ListIterator listIterator = this.c.listIterator();
        while (listIterator.hasNext()) {
            Vb.a aVar2 = (Vb.a) listIterator.next();
            int b2 = aVar2.b();
            if (b > b2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (b == b2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + b + "; conflicting processors: " + aVar2 + ", " + aVar);
            }
        }
        this.c.add(aVar);
        this.b = b;
    }

    public final Vb.a f(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            Vb.a aVar = (Vb.a) it.next();
            if (aVar.b() <= i) {
                return aVar;
            }
        }
        return (Vb.a) this.c.getFirst();
    }
}
