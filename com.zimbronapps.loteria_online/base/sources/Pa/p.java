package pa;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class p {
    public final b a;
    public final String b;
    public final Number c;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdapterStatus.State.values().length];
            a = iArr;
            try {
                iArr[AdapterStatus.State.NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AdapterStatus.State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        NOT_READY,
        READY
    }

    public p(b bVar, String str, Number number) {
        this.a = bVar;
        this.b = str;
        this.c = number;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.a == pVar.a && this.b.equals(pVar.b)) {
            return this.c.equals(pVar.c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public p(AdapterStatus adapterStatus) {
        int i = a.a[adapterStatus.getInitializationState().ordinal()];
        if (i == 1) {
            this.a = b.NOT_READY;
        } else if (i == 2) {
            this.a = b.READY;
        } else {
            throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{adapterStatus.getInitializationState()}));
        }
        this.b = adapterStatus.getDescription();
        this.c = Integer.valueOf(adapterStatus.getLatency());
    }
}
