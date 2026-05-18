package k7;

import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e extends M6 {
    public String d;
    public Set e;
    public Map f;
    public Long g;
    public Long h;

    public e(b7 b7Var) {
        super(b7Var);
    }

    public final boolean l() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x09b4, code lost:
    
        if (r13 != false) goto L482;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x086d A[PHI: r0 r13 r30
      0x086d: PHI (r0v140 java.util.Map) = (r0v142 java.util.Map), (r0v147 java.util.Map) binds: [B:127:0x0896, B:137:0x0869] A[DONT_GENERATE, DONT_INLINE]
      0x086d: PHI (r13v16 android.database.Cursor) = (r13v17 android.database.Cursor), (r13v18 android.database.Cursor) binds: [B:127:0x0896, B:137:0x0869] A[DONT_GENERATE, DONT_INLINE]
      0x086d: PHI (r30v8 java.util.Iterator) = (r30v9 java.util.Iterator), (r30v12 java.util.Iterator) binds: [B:127:0x0896, B:137:0x0869] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01aa A[Catch: all -> 0x01b8, SQLiteException -> 0x01bb, TRY_LEAVE, TryCatch #19 {all -> 0x01b8, blocks: (B:40:0x01a4, B:42:0x01aa, B:458:0x01c2, B:459:0x01c7, B:461:0x01d1, B:462:0x01e1, B:463:0x020d, B:476:0x01f0, B:479:0x0200, B:482:0x0206, B:470:0x0233), top: B:39:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x01c2 A[Catch: all -> 0x01b8, SQLiteException -> 0x01bb, TRY_ENTER, TryCatch #19 {all -> 0x01b8, blocks: (B:40:0x01a4, B:42:0x01aa, B:458:0x01c2, B:459:0x01c7, B:461:0x01d1, B:462:0x01e1, B:463:0x020d, B:476:0x01f0, B:479:0x0200, B:482:0x0206, B:470:0x0233), top: B:39:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x08b5  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m(java.lang.String r30, java.util.List r31, java.util.List r32, java.lang.Long r33, java.lang.Long r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 2674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.e.m(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }

    public final u7 n(Integer num) {
        if (this.f.containsKey(num)) {
            return (u7) this.f.get(num);
        }
        u7 u7Var = new u7(this, this.d, null);
        this.f.put(num, u7Var);
        return u7Var;
    }

    public final boolean o(int i, int i2) {
        u7 u7Var = (u7) this.f.get(Integer.valueOf(i));
        if (u7Var == null) {
            return false;
        }
        return u7Var.c().get(i2);
    }
}
