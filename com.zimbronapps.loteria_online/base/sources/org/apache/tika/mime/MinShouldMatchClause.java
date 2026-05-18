package org.apache.tika.mime;

import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
class MinShouldMatchClause implements Clause {
    private final List clauses;
    private final int min;

    public MinShouldMatchClause(int i, List list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("clauses must be not null with size > 0");
        }
        if (i <= list.size()) {
            if (i > 0) {
                this.min = i;
                this.clauses = list;
                return;
            } else {
                throw new IllegalArgumentException("min cannot be <= 0: " + i);
            }
        }
        throw new IllegalArgumentException("min (" + i + ") cannot be > clauses.size (" + list.size() + ")");
    }

    public boolean eval(byte[] bArr) {
        Iterator it = this.clauses.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((Clause) it.next()).eval(bArr) && (i = i + 1) >= this.min) {
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
        return "minShouldMatch (min: " + this.min + ") " + String.valueOf(this.clauses);
    }
}
