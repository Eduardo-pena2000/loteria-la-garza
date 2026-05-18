package w6;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class e extends a {
    public boolean b;
    public ArrayList c;

    public e(DataHolder dataHolder) {
        super(dataHolder);
        this.b = false;
    }

    public String a() {
        return null;
    }

    public abstract Object b(int i, int i2);

    public abstract String c();

    public final int f(int i) {
        if (i >= 0 && i < this.c.size()) {
            return ((Integer) this.c.get(i)).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }

    public final void g() {
        synchronized (this) {
            try {
                if (!this.b) {
                    int count = ((DataHolder) t.l(this.a)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.c = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String c = c();
                        String R1 = this.a.R1(c, 0, this.a.S1(0));
                        for (int i = 1; i < count; i++) {
                            int S1 = this.a.S1(i);
                            String R12 = this.a.R1(c, i, S1);
                            if (R12 == null) {
                                throw new NullPointerException("Missing value for markerColumn: " + c + ", at row: " + i + ", for window: " + S1);
                            }
                            if (!R12.equals(R1)) {
                                this.c.add(Integer.valueOf(i));
                                R1 = R12;
                            }
                        }
                    }
                    this.b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object get(int i) {
        int intValue;
        int intValue2;
        g();
        int f = f(i);
        int i2 = 0;
        if (i >= 0 && i != this.c.size()) {
            if (i == this.c.size() - 1) {
                intValue = ((DataHolder) t.l(this.a)).getCount();
                intValue2 = ((Integer) this.c.get(i)).intValue();
            } else {
                intValue = ((Integer) this.c.get(i + 1)).intValue();
                intValue2 = ((Integer) this.c.get(i)).intValue();
            }
            int i3 = intValue - intValue2;
            if (i3 == 1) {
                int f2 = f(i);
                int S1 = ((DataHolder) t.l(this.a)).S1(f2);
                String a = a();
                if (a == null || this.a.R1(a, f2, S1) != null) {
                    i2 = 1;
                }
            } else {
                i2 = i3;
            }
        }
        return b(f, i2);
    }

    public int getCount() {
        g();
        return this.c.size();
    }
}
