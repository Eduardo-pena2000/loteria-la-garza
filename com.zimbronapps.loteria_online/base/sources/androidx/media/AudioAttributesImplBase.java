package androidx.media;

import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int a;
    public int b;
    public int c;
    public int d;

    public static class a implements AudioAttributesImpl.a {
        public int a = 0;
        public int b = 0;
        public int c = 0;
        public int d = -1;

        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.b, this.c, this.a, this.d);
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a c(int i) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
                this.b = i;
            } else {
                this.b = 0;
            }
            return this;
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(int i) {
            this.c = (i & 1023) | this.c;
            return this;
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.a = i;
                    return this;
                case 16:
                    this.a = 12;
                    return this;
                default:
                    this.a = 0;
                    return this;
            }
        }
    }

    public AudioAttributesImplBase() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
    }

    public int a() {
        int i = this.d;
        return i != -1 ? i : AudioAttributesCompat.c(false, this.c, this.a);
    }

    public Object b() {
        return null;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        int i = this.c;
        int a2 = a();
        if (a2 == 6) {
            i |= 4;
        } else if (a2 == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.b == audioAttributesImplBase.c() && this.c == audioAttributesImplBase.d() && this.a == audioAttributesImplBase.e() && this.d == audioAttributesImplBase.d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.e(this.a));
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }

    public AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.a = i3;
        this.d = i4;
    }
}
