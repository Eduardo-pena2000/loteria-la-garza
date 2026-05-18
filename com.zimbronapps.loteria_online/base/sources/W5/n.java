package W5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n extends x {
    public final int a;
    public final int b;
    public final boolean c;

    public n(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.a == xVar.a() && this.b == xVar.b() && this.c == xVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.c ? 1237 : 1231) ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z).length() + 1);
        sb.append("OfflineAdConfig{impressionPrerequisite=");
        sb.append(i);
        sb.append(", clickPrerequisite=");
        sb.append(i2);
        sb.append(", notificationFlowEnabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
