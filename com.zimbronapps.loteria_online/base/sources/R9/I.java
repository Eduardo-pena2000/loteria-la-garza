package r9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import da.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class i {
    public static Boolean n;
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final Context e;
    public n h;
    public SQLiteDatabase i;
    public Integer l;
    public final List f = new ArrayList();
    public final Map g = new HashMap();
    public int j = 0;
    public int k = 0;
    public int m = 0;

    public i(Context context, String str, int i, boolean z, int i2) {
        this.e = context;
        this.b = str;
        this.a = z;
        this.c = i;
        this.d = i2;
    }

    public static /* synthetic */ Cursor G(C c, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        c.a(sQLiteQuery);
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static /* synthetic */ void a(i iVar, t9.e eVar) {
        iVar.L(eVar);
    }

    public static /* synthetic */ void b(i iVar) {
        iVar.Q();
    }

    public static /* synthetic */ void c(i iVar, t9.e eVar) {
        iVar.I(eVar);
    }

    public static /* synthetic */ void d(i iVar, t9.e eVar) {
        iVar.K(eVar);
    }

    public static /* synthetic */ void e(i iVar, t9.e eVar) {
        iVar.H(eVar);
    }

    public static /* synthetic */ Cursor f(C c, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return G(c, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static /* synthetic */ void g(i iVar, t9.e eVar) {
        iVar.J(eVar);
    }

    public static boolean i(Context context, String str, boolean z) {
        try {
            String packageName = context.getPackageName();
            return (Build.VERSION.SDK_INT >= 33 ? com.google.android.recaptcha.internal.b.a(context.getPackageManager(), packageName, com.google.android.recaptcha.internal.a.a(128L)) : y(context, packageName, 128)).metaData.getBoolean(str, z);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean j(Context context) {
        return i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    public static void o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    public static boolean x(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static ApplicationInfo y(Context context, String str, int i) {
        return context.getPackageManager().getApplicationInfo(str, i);
    }

    public String A() {
        return "[" + B() + "] ";
    }

    public String B() {
        Thread currentThread = Thread.currentThread();
        return this.c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    public SQLiteDatabase C() {
        return this.i;
    }

    public void D(Exception exc, t9.e eVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            eVar.b("sqlite_error", "open_failed " + this.b, null);
            return;
        }
        if (exc instanceof SQLException) {
            eVar.b("sqlite_error", exc.getMessage(), t9.h.a(eVar));
        } else {
            eVar.b("sqlite_error", exc.getMessage(), t9.h.a(eVar));
        }
    }

    public void E(t9.e eVar) {
        S(eVar, new e(this, eVar));
    }

    public synchronized boolean F() {
        return this.j > 0;
    }

    public final /* synthetic */ void H(t9.e eVar) {
        Boolean f = eVar.f();
        boolean z = Boolean.TRUE.equals(f) && eVar.d();
        if (z) {
            int i = this.k + 1;
            this.k = i;
            this.l = Integer.valueOf(i);
        }
        if (!w(eVar)) {
            if (z) {
                this.l = null;
            }
        } else if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put("transactionId", this.l);
            eVar.a(hashMap);
        } else {
            if (Boolean.FALSE.equals(f)) {
                this.l = null;
            }
            eVar.a(null);
        }
    }

    public void M() {
        if (n == null) {
            Boolean valueOf = Boolean.valueOf(j(this.e));
            n = valueOf;
            if (valueOf.booleanValue() && q.c(this.d)) {
                Log.d("Sqflite", A() + "[sqflite] WAL enabled");
            }
        }
        this.i = SQLiteDatabase.openDatabase(this.b, (SQLiteDatabase.CursorFactory) null, n.booleanValue() ? 805306368 : 268435456);
    }

    public void N() {
        this.i = SQLiteDatabase.openDatabase(this.b, (SQLiteDatabase.CursorFactory) null, 1, new a());
    }

    public void O(t9.e eVar) {
        S(eVar, new c(this, eVar));
    }

    public void P(t9.e eVar) {
        S(eVar, new b(this, eVar));
    }

    public final void Q() {
        while (!this.f.isEmpty() && this.l == null) {
            ((t9.g) this.f.get(0)).a();
            this.f.remove(0);
        }
    }

    public void R(t9.e eVar) {
        S(eVar, new d(this, eVar));
    }

    public final void S(t9.e eVar, Runnable runnable) {
        Integer transactionId = eVar.getTransactionId();
        Integer num = this.l;
        if (num == null) {
            runnable.run();
            return;
        }
        if (transactionId == null || !(transactionId.equals(num) || transactionId.intValue() == -1)) {
            this.f.add(new t9.g(eVar, runnable));
            return;
        }
        runnable.run();
        if (this.l != null || this.f.isEmpty()) {
            return;
        }
        this.h.b(this, new h(this));
    }

    public void h(da.i iVar, j.d dVar) {
        t9.c cVar;
        String i;
        t9.d dVar2 = new t9.d(iVar, dVar);
        boolean h = dVar2.h();
        boolean k = dVar2.k();
        List list = (List) dVar2.c("operations");
        List arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cVar = new t9.c((Map) it.next(), h);
            i = cVar.i();
            i.hashCode();
            switch (i) {
                case "execute":
                    if (p(cVar)) {
                        cVar.s(arrayList);
                        break;
                    } else if (!k) {
                        cVar.q(dVar);
                        return;
                    } else {
                        cVar.r(arrayList);
                        break;
                    }
                case "insert":
                    if (I(cVar)) {
                        cVar.s(arrayList);
                        break;
                    } else if (!k) {
                        cVar.q(dVar);
                        return;
                    } else {
                        cVar.r(arrayList);
                        break;
                    }
                case "update":
                    if (L(cVar)) {
                        cVar.s(arrayList);
                        break;
                    } else if (!k) {
                        cVar.q(dVar);
                        return;
                    } else {
                        cVar.r(arrayList);
                        break;
                    }
                case "query":
                    if (J(cVar)) {
                        cVar.s(arrayList);
                        break;
                    } else if (!k) {
                        cVar.q(dVar);
                        return;
                    } else {
                        cVar.r(arrayList);
                        break;
                    }
                default:
                    dVar.b("bad_param", "Batch method '" + i + "' not supported", null);
                    return;
            }
        }
        if (h) {
            dVar.a(null);
        } else {
            dVar.a(arrayList);
        }
    }

    public void k() {
        if (!this.g.isEmpty() && q.b(this.d)) {
            Log.d("Sqflite", A() + this.g.size() + " cursor(s) are left opened");
        }
        this.i.close();
    }

    public final void l(int i) {
        s sVar = (s) this.g.get(Integer.valueOf(i));
        if (sVar != null) {
            m(sVar);
        }
    }

    public final void m(s sVar) {
        try {
            int i = sVar.a;
            if (q.c(this.d)) {
                Log.d("Sqflite", A() + "closing cursor " + i);
            }
            this.g.remove(Integer.valueOf(i));
            sVar.c.close();
        } catch (Exception unused) {
        }
    }

    public final Map n(Cursor cursor, Integer num) {
        Map map = null;
        int i = 0;
        List list = null;
        while (cursor.moveToNext()) {
            if (map == null) {
                List arrayList = new ArrayList();
                Map hashMap = new HashMap();
                i = cursor.getColumnCount();
                hashMap.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap.put("rows", arrayList);
                list = arrayList;
                map = hashMap;
            }
            list.add(D.a(cursor, i));
            if (num != null && list.size() >= num.intValue()) {
                break;
            }
        }
        return map == null ? new HashMap() : map;
    }

    public final boolean p(t9.e eVar) {
        if (!w(eVar)) {
            return false;
        }
        eVar.a(null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(t9.e r10) {
        /*
            r9 = this;
            boolean r0 = r9.w(r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r10.h()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
            r10.a(r2)
            return r3
        L14:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r9.C()     // Catch: java.lang.Throwable -> Lc0 java.lang.Exception -> Lc2
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> Lc0 java.lang.Exception -> Lc2
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L9f
            int r5 = r0.getCount()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r5 <= 0) goto L9f
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r5 == 0) goto L9f
            int r5 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r5 != 0) goto L6d
            int r5 = r9.d     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            boolean r5 = r9.q.b(r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r5 == 0) goto L66
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.<init>()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = r9.A()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            long r6 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            android.util.Log.d(r4, r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            goto L66
        L61:
            r10 = move-exception
            r2 = r0
            goto Lcf
        L64:
            r2 = move-exception
            goto Lc6
        L66:
            r10.a(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r0.close()
            return r3
        L6d:
            long r5 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            int r2 = r9.d     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            boolean r2 = r9.q.b(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r2 == 0) goto L94
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r2.<init>()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r7 = r9.A()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r2.append(r7)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r7 = "inserted "
            r2.append(r7)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r2.append(r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            android.util.Log.d(r4, r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
        L94:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r10.a(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r0.close()
            return r3
        L9f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.<init>()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = r9.A()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            android.util.Log.e(r4, r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r10.a(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r0 == 0) goto Lbf
            r0.close()
        Lbf:
            return r3
        Lc0:
            r10 = move-exception
            goto Lcf
        Lc2:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        Lc6:
            r9.D(r2, r10)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto Lce
            r0.close()
        Lce:
            return r1
        Lcf:
            if (r2 == 0) goto Ld4
            r2.close()
        Ld4:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.i.I(t9.e):boolean");
    }

    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final boolean J(t9.e eVar) {
        Cursor cursor;
        Integer num = (Integer) eVar.c("cursorPageSize");
        C g = eVar.g();
        if (q.b(this.d)) {
            Log.d("Sqflite", A() + g);
        }
        s sVar = null;
        try {
            cursor = z().rawQueryWithFactory(new g(g), g.c(), r9.a.a, (String) null);
            try {
                try {
                    Map n2 = n(cursor, num);
                    if (num != null && !cursor.isLast() && !cursor.isAfterLast()) {
                        int i = this.m + 1;
                        this.m = i;
                        n2.put("cursorId", Integer.valueOf(i));
                        s sVar2 = new s(i, num.intValue(), cursor);
                        try {
                            this.g.put(Integer.valueOf(i), sVar2);
                            sVar = sVar2;
                        } catch (Exception e) {
                            e = e;
                            sVar = sVar2;
                            D(e, eVar);
                            if (sVar != null) {
                                m(sVar);
                            }
                            if (sVar != null || cursor == null) {
                                return false;
                            }
                            cursor.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            sVar = sVar2;
                            if (sVar == null && cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    eVar.a(n2);
                    if (sVar == null && cursor != null) {
                        cursor.close();
                    }
                    return true;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final boolean K(t9.e eVar) {
        boolean z;
        Integer num = (Integer) eVar.c("cursorId");
        int intValue = num.intValue();
        boolean equals = Boolean.TRUE.equals(eVar.c("cancel"));
        if (q.c(this.d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(A());
            sb.append("cursor ");
            sb.append(intValue);
            sb.append(equals ? " cancel" : " next");
            Log.d("Sqflite", sb.toString());
        }
        s sVar = null;
        if (equals) {
            l(intValue);
            eVar.a(null);
            return true;
        }
        s sVar2 = (s) this.g.get(num);
        int i = 0;
        try {
            try {
                if (sVar2 == null) {
                    throw new IllegalStateException("Cursor " + intValue + " not found");
                }
                Cursor cursor = sVar2.c;
                Map n2 = n(cursor, Integer.valueOf(sVar2.b));
                z = (cursor.isLast() || cursor.isAfterLast()) ? false : true;
                if (z) {
                    try {
                        n2.put("cursorId", num);
                    } catch (Exception e) {
                        e = e;
                        D(e, eVar);
                        if (sVar2 != null) {
                            m(sVar2);
                        } else {
                            sVar = sVar2;
                        }
                        if (!z && sVar != null) {
                            m(sVar);
                        }
                        return false;
                    }
                }
                eVar.a(n2);
                if (!z) {
                    m(sVar2);
                }
                return true;
            } catch (Throwable th) {
                th = th;
                i = intValue;
                if (i == 0 && sVar2 != null) {
                    m(sVar2);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            if (i == 0) {
                m(sVar2);
            }
            throw th;
        }
    }

    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final boolean L(t9.e eVar) {
        if (!w(eVar)) {
            return false;
        }
        Cursor cursor = null;
        if (eVar.h()) {
            eVar.a(null);
            return true;
        }
        try {
            try {
                Cursor rawQuery = C().rawQuery("SELECT changes()", (String[]) null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i = rawQuery.getInt(0);
                            if (q.b(this.d)) {
                                Log.d("Sqflite", A() + "changed " + i);
                            }
                            eVar.a(Integer.valueOf(i));
                            rawQuery.close();
                            return true;
                        }
                    } catch (Exception e) {
                        e = e;
                        cursor = rawQuery;
                        D(e, eVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", A() + "fail to read changes for Update/Delete");
                eVar.a(null);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public synchronized void u(Boolean bool) {
        try {
            if (Boolean.TRUE.equals(bool)) {
                this.j++;
            } else if (Boolean.FALSE.equals(bool)) {
                this.j--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void v(t9.e eVar) {
        S(eVar, new f(this, eVar));
    }

    public final boolean w(t9.e eVar) {
        C g = eVar.g();
        if (q.b(this.d)) {
            Log.d("Sqflite", A() + g);
        }
        Boolean f = eVar.f();
        try {
            C().execSQL(g.c(), g.d());
            u(f);
            return true;
        } catch (Exception e) {
            D(e, eVar);
            return false;
        }
    }

    public SQLiteDatabase z() {
        return this.i;
    }

    public class a implements DatabaseErrorHandler {
        public a() {
        }

        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }
}
