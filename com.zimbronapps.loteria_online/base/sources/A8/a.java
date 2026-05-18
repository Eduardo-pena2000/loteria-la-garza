package a8;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class a implements d {
    public final int a;
    public final d[] b;
    public final b c;

    public a(int i, d... dVarArr) {
        this.a = i;
        this.b = dVarArr;
        this.c = new b(i);
    }

    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.b) {
            if (stackTraceElementArr2.length <= this.a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.a ? this.c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
