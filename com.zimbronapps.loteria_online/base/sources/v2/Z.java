package V2;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class z {
    public final a a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static final class a {
        public final AudioTrack a;
        public final AudioTimestamp b = new AudioTimestamp();
        public long c;
        public long d;
        public long e;
        public boolean f;
        public long g;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }

        public void a() {
            this.f = true;
        }

        public long b() {
            return this.e;
        }

        public long c() {
            return this.b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.a.getTimestamp(this.b);
            if (timestamp) {
                long j = this.b.framePosition;
                long j2 = this.d;
                if (j2 > j) {
                    if (this.f) {
                        this.g += j2;
                        this.f = false;
                    } else {
                        this.c++;
                    }
                }
                this.d = j;
                this.e = j + this.g + (this.c << 32);
            }
            return timestamp;
        }
    }

    public z(AudioTrack audioTrack) {
        this.a = new a(audioTrack);
        h();
    }

    public void a() {
        if (this.b == 4) {
            h();
        }
    }

    public void b() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public long c() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.b();
        }
        return -1L;
    }

    public long d() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.c();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.b == 2;
    }

    public boolean f(long j) {
        a aVar = this.a;
        if (aVar == null || j - this.e < this.d) {
            return false;
        }
        this.e = j;
        boolean d = aVar.d();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (d) {
                        h();
                    }
                } else if (!d) {
                    h();
                }
            } else if (!d) {
                h();
            } else if (this.a.b() > this.f) {
                i(2);
            }
        } else if (d) {
            if (this.a.c() < this.c) {
                return false;
            }
            this.f = this.a.b();
            i(1);
        } else if (j - this.c > 500000) {
            i(3);
        }
        return d;
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.a != null) {
            i(0);
        }
    }

    public final void i(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (i == 1) {
            this.d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
