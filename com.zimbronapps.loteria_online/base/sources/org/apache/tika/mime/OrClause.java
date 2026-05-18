package org.apache.tika.mime;

import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
class OrClause implements Clause {
    private final List clauses;

    public OrClause(List list) {
        this.clauses = list;
    }

    public boolean eval(byte[] bArr) {
        Iterator it = this.clauses.iterator();
        while (it.hasNext()) {
            if (((Clause) it.next()).eval(bArr)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        Iterator it = this.clauses.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = Math.max(i, ((Clause) it.next()).size());
        }
        return i;
    }

    public String toString() {
        return "or" + String.valueOf(this.clauses);
    }
}
