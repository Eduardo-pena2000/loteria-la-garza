package androidx.lifecycle;

import androidx.lifecycle.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements o {
    public final DefaultLifecycleObserver a;
    public final o b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.a.values().length];
            try {
                iArr[k.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public e(DefaultLifecycleObserver defaultLifecycleObserver, o oVar) {
        kotlin.jvm.internal.t.g(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.a = defaultLifecycleObserver;
        this.b = oVar;
    }

    public void onStateChanged(r rVar, k.a aVar) {
        kotlin.jvm.internal.t.g(rVar, "source");
        kotlin.jvm.internal.t.g(aVar, "event");
        switch (a.a[aVar.ordinal()]) {
            case 1:
                this.a.onCreate(rVar);
                break;
            case 2:
                this.a.onStart(rVar);
                break;
            case 3:
                this.a.onResume(rVar);
                break;
            case 4:
                this.a.onPause(rVar);
                break;
            case 5:
                this.a.onStop(rVar);
                break;
            case 6:
                this.a.onDestroy(rVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new Ca.o();
        }
        o oVar = this.b;
        if (oVar != null) {
            oVar.onStateChanged(rVar, aVar);
        }
    }
}
