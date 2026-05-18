package T2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m {
    public final AudioManager a;
    public final a b;
    public b c;
    public M2.b d;
    public int f;
    public AudioFocusRequest h;
    public boolean i;
    public float g = 1.0f;
    public int e = 0;

    public class a implements AudioManager.OnAudioFocusChangeListener {
        public final Handler a;

        public a(Handler handler) {
            this.a = handler;
        }

        public static /* synthetic */ void a(a aVar, int i) {
            aVar.b(i);
        }

        public final /* synthetic */ void b(int i) {
            m.d(m.this, i);
        }

        public void onAudioFocusChange(int i) {
            this.a.post(new l(this, i));
        }
    }

    public interface b {
        void E(float f);

        void F(int i);
    }

    public m(Context context, Handler handler, b bVar) {
        this.a = (AudioManager) P2.a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.c = bVar;
        this.b = new a(handler);
    }

    public static /* synthetic */ void d(m mVar, int i) {
        mVar.h(i);
    }

    public static int e(M2.b bVar) {
        if (bVar == null) {
            return 0;
        }
        switch (bVar.c) {
            case 0:
                P2.o.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (bVar.a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                P2.o.h("AudioFocusManager", "Unidentified audio usage: " + bVar.c);
                return 0;
            case 16:
                return 4;
        }
    }

    public final void a() {
        this.a.abandonAudioFocus(this.b);
    }

    public final void b() {
        int i = this.e;
        if (i == 1 || i == 0) {
            return;
        }
        if (P2.K.a >= 26) {
            c();
        } else {
            a();
        }
    }

    public final void c() {
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest != null) {
            k.a(this.a, audioFocusRequest);
        }
    }

    public final void f(int i) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.F(i);
        }
    }

    public float g() {
        return this.g;
    }

    public final void h(int i) {
        if (i == -3 || i == -2) {
            if (i != -2 && !q()) {
                n(4);
                return;
            } else {
                f(0);
                n(3);
                return;
            }
        }
        if (i == -1) {
            f(-1);
            b();
            n(1);
        } else if (i == 1) {
            n(2);
            f(1);
        } else {
            P2.o.h("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    public void i() {
        this.c = null;
        b();
        n(0);
    }

    public final int j() {
        if (this.e == 2) {
            return 1;
        }
        if ((P2.K.a >= 26 ? l() : k()) == 1) {
            n(2);
            return 1;
        }
        n(1);
        return -1;
    }

    public final int k() {
        return this.a.requestAudioFocus(this.b, P2.K.k0(((M2.b) P2.a.e(this.d)).c), this.f);
    }

    public final int l() {
        AudioFocusRequest.Builder a2;
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest == null || this.i) {
            if (audioFocusRequest == null) {
                e.a();
                a2 = c.a(this.f);
            } else {
                e.a();
                a2 = d.a(this.h);
            }
            this.h = i.a(h.a(g.a(f.a(a2, ((M2.b) P2.a.e(this.d)).a().a), q()), this.b));
            this.i = false;
        }
        return j.a(this.a, this.h);
    }

    public void m(M2.b bVar) {
        if (P2.K.c(this.d, bVar)) {
            return;
        }
        this.d = bVar;
        int e = e(bVar);
        this.f = e;
        boolean z = true;
        if (e != 1 && e != 0) {
            z = false;
        }
        P2.a.b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void n(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        b bVar = this.c;
        if (bVar != null) {
            bVar.E(f);
        }
    }

    public final boolean o(int i) {
        return i != 1 && this.f == 1;
    }

    public int p(boolean z, int i) {
        if (!o(i)) {
            b();
            n(0);
            return 1;
        }
        if (z) {
            return j();
        }
        int i2 = this.e;
        if (i2 != 1) {
            return i2 != 3 ? 1 : 0;
        }
        return -1;
    }

    public final boolean q() {
        M2.b bVar = this.d;
        return bVar != null && bVar.a == 1;
    }
}
