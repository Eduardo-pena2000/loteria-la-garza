package org.apache.tika.mime;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
class AndClause implements Clause {
    private final Clause[] clauses;

    public AndClause(Clause... clauseArr) {
        this.clauses = clauseArr;
    }

    public boolean eval(byte[] bArr) {
        for (Clause clause : this.clauses) {
            if (!clause.eval(bArr)) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        int i = 0;
        for (Clause clause : this.clauses) {
            i += clause.size();
        }
        return i;
    }

    public String toString() {
        return "and" + Arrays.toString(this.clauses);
    }
}
