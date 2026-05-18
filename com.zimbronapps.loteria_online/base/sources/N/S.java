package N;

import android.view.KeyEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s {
    public static final r a = new c(a(b.a));

    public static final class a implements r {
        public final /* synthetic */ Qa.l a;

        public a(Qa.l lVar) {
            this.a = lVar;
        }

        public p a(KeyEvent keyEvent) {
            if (((Boolean) this.a.invoke(G0.b.a(keyEvent))).booleanValue() && G0.d.f(keyEvent)) {
                if (G0.a.r(G0.d.a(keyEvent), B.a.x())) {
                    return p.REDO;
                }
                return null;
            }
            if (((Boolean) this.a.invoke(G0.b.a(keyEvent))).booleanValue()) {
                long a = G0.d.a(keyEvent);
                B b = B.a;
                if (G0.a.r(a, b.d()) ? true : G0.a.r(a, b.n())) {
                    return p.COPY;
                }
                if (G0.a.r(a, b.u())) {
                    return p.PASTE;
                }
                if (G0.a.r(a, b.v())) {
                    return p.CUT;
                }
                if (G0.a.r(a, b.a())) {
                    return p.SELECT_ALL;
                }
                if (G0.a.r(a, b.w())) {
                    return p.REDO;
                }
                if (G0.a.r(a, b.x())) {
                    return p.UNDO;
                }
                return null;
            }
            if (G0.d.e(keyEvent)) {
                return null;
            }
            if (G0.d.f(keyEvent)) {
                long a2 = G0.d.a(keyEvent);
                B b2 = B.a;
                if (G0.a.r(a2, b2.i())) {
                    return p.SELECT_LEFT_CHAR;
                }
                if (G0.a.r(a2, b2.j())) {
                    return p.SELECT_RIGHT_CHAR;
                }
                if (G0.a.r(a2, b2.k())) {
                    return p.SELECT_UP;
                }
                if (G0.a.r(a2, b2.h())) {
                    return p.SELECT_DOWN;
                }
                if (G0.a.r(a2, b2.r())) {
                    return p.SELECT_PAGE_UP;
                }
                if (G0.a.r(a2, b2.q())) {
                    return p.SELECT_PAGE_DOWN;
                }
                if (G0.a.r(a2, b2.p())) {
                    return p.SELECT_LINE_START;
                }
                if (G0.a.r(a2, b2.o())) {
                    return p.SELECT_LINE_END;
                }
                if (G0.a.r(a2, b2.n())) {
                    return p.PASTE;
                }
                return null;
            }
            long a3 = G0.d.a(keyEvent);
            B b3 = B.a;
            if (G0.a.r(a3, b3.i())) {
                return p.LEFT_CHAR;
            }
            if (G0.a.r(a3, b3.j())) {
                return p.RIGHT_CHAR;
            }
            if (G0.a.r(a3, b3.k())) {
                return p.UP;
            }
            if (G0.a.r(a3, b3.h())) {
                return p.DOWN;
            }
            if (G0.a.r(a3, b3.r())) {
                return p.PAGE_UP;
            }
            if (G0.a.r(a3, b3.q())) {
                return p.PAGE_DOWN;
            }
            if (G0.a.r(a3, b3.p())) {
                return p.LINE_START;
            }
            if (G0.a.r(a3, b3.o())) {
                return p.LINE_END;
            }
            if (G0.a.r(a3, b3.l())) {
                return p.NEW_LINE;
            }
            if (G0.a.r(a3, b3.c())) {
                return p.DELETE_PREV_CHAR;
            }
            if (G0.a.r(a3, b3.g())) {
                return p.DELETE_NEXT_CHAR;
            }
            if (G0.a.r(a3, b3.s())) {
                return p.PASTE;
            }
            if (G0.a.r(a3, b3.f())) {
                return p.CUT;
            }
            if (G0.a.r(a3, b3.e())) {
                return p.COPY;
            }
            if (G0.a.r(a3, b3.t())) {
                return p.TAB;
            }
            return null;
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.F {
        public static final b a = new b();

        public b() {
            super(G0.d.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);
        }

        public Object get(Object obj) {
            return Boolean.valueOf(G0.d.e(((G0.b) obj).f()));
        }
    }

    public static final class c implements r {
        public final /* synthetic */ r a;

        public c(r rVar) {
            this.a = rVar;
        }

        public p a(KeyEvent keyEvent) {
            p pVar = null;
            if (G0.d.f(keyEvent) && G0.d.e(keyEvent)) {
                long a = G0.d.a(keyEvent);
                B b = B.a;
                if (G0.a.r(a, b.i())) {
                    pVar = p.SELECT_LEFT_WORD;
                } else if (G0.a.r(a, b.j())) {
                    pVar = p.SELECT_RIGHT_WORD;
                } else if (G0.a.r(a, b.k())) {
                    pVar = p.SELECT_PREV_PARAGRAPH;
                } else if (G0.a.r(a, b.h())) {
                    pVar = p.SELECT_NEXT_PARAGRAPH;
                }
            } else if (G0.d.e(keyEvent)) {
                long a2 = G0.d.a(keyEvent);
                B b2 = B.a;
                if (G0.a.r(a2, b2.i())) {
                    pVar = p.LEFT_WORD;
                } else if (G0.a.r(a2, b2.j())) {
                    pVar = p.RIGHT_WORD;
                } else if (G0.a.r(a2, b2.k())) {
                    pVar = p.PREV_PARAGRAPH;
                } else if (G0.a.r(a2, b2.h())) {
                    pVar = p.NEXT_PARAGRAPH;
                } else if (G0.a.r(a2, b2.m())) {
                    pVar = p.DELETE_PREV_CHAR;
                } else if (G0.a.r(a2, b2.g())) {
                    pVar = p.DELETE_NEXT_WORD;
                } else if (G0.a.r(a2, b2.c())) {
                    pVar = p.DELETE_PREV_WORD;
                } else if (G0.a.r(a2, b2.b())) {
                    pVar = p.DESELECT;
                }
            } else if (G0.d.f(keyEvent)) {
                long a3 = G0.d.a(keyEvent);
                B b3 = B.a;
                if (G0.a.r(a3, b3.p())) {
                    pVar = p.SELECT_LINE_LEFT;
                } else if (G0.a.r(a3, b3.o())) {
                    pVar = p.SELECT_LINE_RIGHT;
                }
            } else if (G0.d.d(keyEvent)) {
                long a4 = G0.d.a(keyEvent);
                B b4 = B.a;
                if (G0.a.r(a4, b4.c())) {
                    pVar = p.DELETE_FROM_LINE_START;
                } else if (G0.a.r(a4, b4.g())) {
                    pVar = p.DELETE_TO_LINE_END;
                }
            }
            return pVar == null ? this.a.a(keyEvent) : pVar;
        }
    }

    public static final r a(Qa.l lVar) {
        return new a(lVar);
    }

    public static final r b() {
        return a;
    }
}
