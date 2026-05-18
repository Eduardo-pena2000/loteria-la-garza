package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media.AudioAttributesCompat;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a {
    public static final AudioAttributesCompat g = new AudioAttributesCompat.a().d(1).a();
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final AudioAttributesCompat d;
    public final boolean e;
    public final Object f;

    public static class a {
        public static AudioFocusRequest a(int i, AudioAttributes audioAttributes, boolean z, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    public static final class b {
        public int a;
        public AudioManager.OnAudioFocusChangeListener b;
        public Handler c;
        public AudioAttributesCompat d = a.g;
        public boolean e;

        public b(int i) {
            d(i);
        }

        public static boolean b(int i) {
            return i == 1 || i == 2 || i == 3 || i == 4;
        }

        public a a() {
            if (this.b != null) {
                return new a(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b c(AudioAttributesCompat audioAttributesCompat) {
            if (audioAttributesCompat == null) {
                throw new NullPointerException("Illegal null AudioAttributes");
            }
            this.d = audioAttributesCompat;
            return this;
        }

        public b d(int i) {
            if (b(i)) {
                this.a = i;
                return this;
            }
            throw new IllegalArgumentException("Illegal audio focus gain type " + i);
        }

        public b e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return f(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        public b f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            if (onAudioFocusChangeListener == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            }
            if (handler == null) {
                throw new IllegalArgumentException("Handler must not be null");
            }
            this.b = onAudioFocusChangeListener;
            this.c = handler;
            return this;
        }

        public b g(boolean z) {
            this.e = z;
            return this;
        }
    }

    public static class c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {
        public final Handler a;
        public final AudioManager.OnAudioFocusChangeListener b;

        public c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.b = onAudioFocusChangeListener;
            this.a = new Handler(handler.getLooper(), this);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 2782386) {
                return false;
            }
            this.b.onAudioFocusChange(message.arg1);
            return true;
        }

        public void onAudioFocusChange(int i) {
            Handler handler = this.a;
            handler.sendMessage(Message.obtain(handler, 2782386, i, 0));
        }
    }

    public a(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = audioAttributesCompat;
        this.e = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.b = onAudioFocusChangeListener;
        } else {
            this.b = new c(onAudioFocusChangeListener, handler);
        }
        if (i2 >= 26) {
            this.f = a.a(i, a(), z, this.b, handler);
        } else {
            this.f = null;
        }
    }

    public AudioAttributes a() {
        AudioAttributesCompat audioAttributesCompat = this.d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.d();
        }
        return null;
    }

    public AudioAttributesCompat b() {
        return this.d;
    }

    public AudioFocusRequest c() {
        return L2.a.a(this.f);
    }

    public int d() {
        return this.a;
    }

    public AudioManager.OnAudioFocusChangeListener e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.e == aVar.e && S1.c.a(this.b, aVar.b) && S1.c.a(this.c, aVar.c) && S1.c.a(this.d, aVar.d);
    }

    public int hashCode() {
        return S1.c.b(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
