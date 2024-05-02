package awt;

import doom.DoomMain;
import doom.event_t;
import doom.evtype_t;
import g.Signals;
import mochadoom.Engine;

public class EmbeddedSupport {

    private static Thread loopThread;
    private static boolean embedded = false;

    public static String titleText = "DOOM";
    public static String infoText = "Up:        Move Forward\n" +
            "Down:      Move Backward\n" +
            "Left:      Turn Left\n" +
            "Right:     Turn Right\n" +
            "Comma:     Strafe Left\n" +
            "Period:    Strafe Right\n" +
            "Control:   Fire\n" +
            "Space:     Use/Proceed\n" +
            "Tab:       Show/Hide Map\n" +
            "Shift:     Run\n" +
            "Alt:       Strafe\n" +
            "1..7:      Switch Weapon\n" +
            "Esc:       Menu";

    public static void setup(Engine.UpdateFrame updateFrame) {
        embedded = true;
        finish();
        loopThread = Engine.setupFX(updateFrame, "-iwad", "wads/doom1.wad");
    }

    public static void finish() {
        DoomMain.doFinish = true;
        try {
            if (loopThread != null) loopThread.join();
            loopThread = null;
        } catch (InterruptedException ignored) {
        }
    }

    public static boolean isEmbedded() {
        return embedded;
    }

    public static void postEventDOWN(int code) {
        switch (code) {
            case 38: //38
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_UP));
                break;
            case 37: // 37
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_LEFT));
                break;
            case 10: // 10
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_ENTER));
                break;
            case 39: // 39
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_RIGHT));
                break;
            case 40: // 40
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_DOWN));
                break;
            case 8: // 8
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_BACKSPACE));
                break;
            case 27: // 27
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_ESCAPE));
                break;
            case 17: // 17
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_LCTRL));
                break;
            case 18: // 18
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_LALT));
                break;
            case 16: // 16
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_LSHIFT));
                break;
            case 9: // 9
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_TAB));
                break;
            case 32: // 32
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_SPACE));
                break;
            case 48: // 48
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_0));
                break;
            case 49:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_1));
                break;
            case 50:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_2));
                break;
            case 51:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_3));
                break;
            case 52:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_4));
                break;
            case 53:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_5));
                break;
            case 54:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_6));
                break;
            case 55:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_7));
                break;
            case 56:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_8));
                break;
            case 57:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_9));
                break;
            case 44: // 44
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_COMMA));
                break;
            case 46: // 46
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_PERIOD));
                break;
            case 89: // 89
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_Y));
                break;
            case 78: // 78
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keydown, Signals.ScanCode.SC_N));
                break;
        }
    }

    public static void postEventUP(int code) {
        switch (code) {
            case 38: //38
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_UP));
                break;
            case 37: // 37
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_LEFT));
                break;
            case 10: // 10
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_ENTER));
                break;
            case 39: // 39
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_RIGHT));
                break;
            case 40: // 40
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_DOWN));
                break;
            case 8: // 8
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_BACKSPACE));
                break;
            case 27: // 27
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_ESCAPE));
                break;
            case 17: // 17
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_LCTRL));
                break;
            case 18: // 18
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_LALT));
                break;
            case 16: // 16
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_LSHIFT));
                break;
            case 9: // 9
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_TAB));
                break;
            case 32: // 32
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_SPACE));
                break;
            case 48: // 48
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_0));
                break;
            case 49:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_1));
                break;
            case 50:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_2));
                break;
            case 51:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_3));
                break;
            case 52:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_4));
                break;
            case 53:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_5));
                break;
            case 54:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_6));
                break;
            case 55:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_7));
                break;
            case 56:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_8));
                break;
            case 57:
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_9));
                break;
            case 44: // 44
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_COMMA));
                break;
            case 46: // 46
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_PERIOD));
                break;
            case 89: // 89
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_Y));
                break;
            case 78: // 78
                Engine.postEvent(new event_t.keyevent_t(evtype_t.ev_keyup, Signals.ScanCode.SC_N));
                break;
        }
    }

}
