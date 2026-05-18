package H6;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class u {
    public static final t d = new a(1, true, 256);
    public int a;
    public boolean b;
    public int c;

    public static class a implements t {
        public final int a;
        public final boolean b;
        public final int c;

        public a(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (aVar.a == this.a && aVar.b == this.b && aVar.c == this.c) {
                    return true;
                }
            }
            return false;
        }

        public final int getBatteryUsagePreference() {
            return this.c;
        }

        public final int getNetworkPreference() {
            return this.a;
        }

        public final int hashCode() {
            return com.google.android.gms.common.internal.r.c(Integer.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c));
        }

        public final boolean isRoamingAllowed() {
            return this.b;
        }

        public final String toString() {
            return String.format("NetworkPreference: %s, IsRoamingAllowed %s, BatteryUsagePreference %s", new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c)});
        }
    }

    public u(n nVar) {
        this.a = nVar.getNetworkTypePreference();
        this.b = nVar.isRoamingAllowed();
        this.c = nVar.getBatteryUsagePreference();
    }

    public t a() {
        return new a(this.a, this.b, this.c);
    }
}
