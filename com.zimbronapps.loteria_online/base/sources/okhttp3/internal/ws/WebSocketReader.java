package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import xb.e;
import xb.g;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebSocketReader implements Closeable {
    public final boolean a;
    public final g b;
    public final FrameCallback c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    public int g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final e l;
    public final e m;
    public MessageInflater n;
    public final byte[] o;
    public final e.a p;

    public interface FrameCallback {
        void a(h hVar);

        void b(h hVar);

        void c(h hVar);

        void onReadClose(int i, String str);

        void onReadMessage(String str);
    }

    public WebSocketReader(boolean z, g source, FrameCallback frameCallback, boolean z2, boolean z3) {
        t.g(source, "source");
        t.g(frameCallback, "frameCallback");
        this.a = z;
        this.b = source;
        this.c = frameCallback;
        this.d = z2;
        this.e = z3;
        this.l = new e();
        this.m = new e();
        this.o = z ? null : new byte[4];
        this.p = z ? null : new e.a();
    }

    public final void a() {
        c();
        if (this.j) {
            b();
        } else {
            f();
        }
    }

    public final void b() {
        short s;
        String str;
        long j = this.h;
        if (j > 0) {
            this.b.h0(this.l, j);
            if (!this.a) {
                e eVar = this.l;
                e.a aVar = this.p;
                t.d(aVar);
                eVar.v(aVar);
                this.p.d(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.a;
                e.a aVar2 = this.p;
                byte[] bArr = this.o;
                t.d(bArr);
                webSocketProtocol.b(aVar2, bArr);
                this.p.close();
            }
        }
        switch (this.g) {
            case 8:
                long A = this.l.A();
                if (A == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (A != 0) {
                    s = this.l.readShort();
                    str = this.l.readUtf8();
                    String a = WebSocketProtocol.a.a(s);
                    if (a != null) {
                        throw new ProtocolException(a);
                    }
                } else {
                    s = 1005;
                    str = "";
                }
                this.c.onReadClose(s, str);
                this.f = true;
                return;
            case 9:
                this.c.a(this.l.y());
                return;
            case 10:
                this.c.c(this.l.y());
                return;
            default:
                throw new ProtocolException(t.o("Unknown control opcode: ", Util.R(this.g)));
        }
    }

    public final void c() {
        boolean z;
        if (this.f) {
            throw new IOException("closed");
        }
        long h = this.b.timeout().h();
        this.b.timeout().b();
        try {
            int d = Util.d(this.b.readByte(), 255);
            this.b.timeout().g(h, TimeUnit.NANOSECONDS);
            int i = d & 15;
            this.g = i;
            boolean z2 = (d & 128) != 0;
            this.i = z2;
            boolean z3 = (d & 8) != 0;
            this.j = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (d & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.d) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.k = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((d & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((d & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int d2 = Util.d(this.b.readByte(), 255);
            boolean z5 = (d2 & 128) != 0;
            if (z5 == this.a) {
                throw new ProtocolException(this.a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = d2 & 127;
            this.h = j;
            if (j == 126) {
                this.h = Util.e(this.b.readShort(), 65535);
            } else if (j == 127) {
                long readLong = this.b.readLong();
                this.h = readLong;
                if (readLong < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.S(this.h) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.j && this.h > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                g gVar = this.b;
                byte[] bArr = this.o;
                t.d(bArr);
                gVar.readFully(bArr);
            }
        } catch (Throwable th) {
            this.b.timeout().g(h, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    public void close() {
        MessageInflater messageInflater = this.n;
        if (messageInflater == null) {
            return;
        }
        messageInflater.close();
    }

    public final void d() {
        while (!this.f) {
            long j = this.h;
            if (j > 0) {
                this.b.h0(this.m, j);
                if (!this.a) {
                    e eVar = this.m;
                    e.a aVar = this.p;
                    t.d(aVar);
                    eVar.v(aVar);
                    this.p.d(this.m.A() - this.h);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.a;
                    e.a aVar2 = this.p;
                    byte[] bArr = this.o;
                    t.d(bArr);
                    webSocketProtocol.b(aVar2, bArr);
                    this.p.close();
                }
            }
            if (this.i) {
                return;
            }
            g();
            if (this.g != 0) {
                throw new ProtocolException(t.o("Expected continuation opcode. Got: ", Util.R(this.g)));
            }
        }
        throw new IOException("closed");
    }

    public final void f() {
        int i = this.g;
        if (i != 1 && i != 2) {
            throw new ProtocolException(t.o("Unknown opcode: ", Util.R(i)));
        }
        d();
        if (this.k) {
            MessageInflater messageInflater = this.n;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.e);
                this.n = messageInflater;
            }
            messageInflater.a(this.m);
        }
        if (i == 1) {
            this.c.onReadMessage(this.m.readUtf8());
        } else {
            this.c.b(this.m.y());
        }
    }

    public final void g() {
        while (!this.f) {
            c();
            if (!this.j) {
                return;
            } else {
                b();
            }
        }
    }
}
