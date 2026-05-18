package q5;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Vibrator;
import com.applovin.impl.E3;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class e {
    public final Vibrator a;

    public e(Vibrator vibrator) {
        this.a = vibrator;
    }

    public Vibrator a() {
        return this.a;
    }

    public void b(long j, int i) {
        if (this.a.hasVibrator()) {
            if (Build.VERSION.SDK_INT < 26) {
                this.a.vibrate(j);
            } else if (c.a(this.a)) {
                b.a(this.a, E3.a(j, i), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            } else {
                b.a(this.a, E3.a(j, -1), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            }
        }
    }

    public void c(List list, int i) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = ((Integer) list.get(i2)).intValue();
        }
        if (this.a.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 26) {
                b.a(this.a, a.a(jArr, i), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            } else {
                this.a.vibrate(jArr, i);
            }
        }
    }

    public void d(List list, int i, List list2) {
        int size = list.size();
        long[] jArr = new long[size];
        int size2 = list2.size();
        int[] iArr = new int[size2];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = ((Integer) list.get(i2)).intValue();
        }
        for (int i3 = 0; i3 < size2; i3++) {
            iArr[i3] = ((Integer) list2.get(i3)).intValue();
        }
        if (this.a.hasVibrator()) {
            if (Build.VERSION.SDK_INT < 26) {
                this.a.vibrate(jArr, i);
            } else if (c.a(this.a)) {
                b.a(this.a, d.a(jArr, iArr, i), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            } else {
                b.a(this.a, a.a(jArr, i), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            }
        }
    }
}
