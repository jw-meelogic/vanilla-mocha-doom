# Configuration file

The Doom configuration file is a text file which holds settings set by setup.exe and from inside the game and its menus.
The file is normally named `default.cfg`, but the `-config` command line parameter can be used to specify an alternate file to use.

The file takes the format of a list of configuration settings, with each line of the form: `<name> <value>`

## Settings

### Display

* `screenblocks`
  Controls the screensize, ranging from 3–11. A value of 10 gives a fullscreen window with the status bar, while 11 gives fullscreen without status bar. The default value is 9.
* `detaillevel`
  Boolean value which controls the resolution of the screen. The logic here is inverted: 0 is high resolution, while 1 is low resolution.
* `usegamma`
  Gamma correction setting. This ranges from 0–4, with 0 representing no gamma correction, while 4 gives maximum gamma correction. The default value is 0.

### Joystick

* `use_joystick`
  Boolean value used to control whether the joystick is enabled. Default is 0 (off).
* `joyb_fire`
  Joystick button used to make the player attack.
* `joyb_use`
  Joystick button used to make the player "use" (activate switches, open doors, etc).
* `joyb_speed`
  Joystick button used to make the player run. Can also be used to activate always run.
* `joyb_strafe`
  Joystick button used to make the player strafe.

### Keyboard

* `key_right`
  Keyboard scan code of the key used to turn the player to the right.
* `key_left`
  Keyboard scan code of the key used to turn the player to the left.
* `key_up`
  Keyboard scan code of the key used to move the player forward.
* `key_down`
  Keyboard scan code of the key used to move the player backwards.
* `key_strafeleft`
  Keyboard scan code of the key used to make the player strafe left.
* `key_straferight`
  Keyboard scan code of the key used to make the player strafe right.
* `key_fire`
  Keyboard scan code of the key used to make the player attack.
* `key_use`
  Keyboard scan code of the "use" key (key used to open doors, activate switches, etc).
* `key_strafe`
  Keyboard scan code of the key used to make the player strafe rather than turn.
* `key_speed`
  Keyboard scan code of the key used to make the player run.

### Mouse

* `use_mouse`
  Boolean value used to control whether the mouse is enabled. Default is 1 (on).
* `mouseb_fire`
  Mouse button used to make the player attack.
* `mouseb_strafe`
  Mouse button used to make the player strafe.
* `mouseb_forward`
  Mouse button used to make the player move forward.
* `mouse_sensitivity`
  Numerical value storing the value of the mouse sensitivity setting. The default value is "5".

### Sound

* `sfx_volume`
  The volume of sound effects, ranging from 0–15. The default is 8.
* `music_volume`
  The volume of the background music, ranging from 0–15. The default is 8.
* `snd_channels`
  The number of sound channels to use. The default is 3.
* `snd_musicdevice`
  Numeric value indicating which kind of music card is installed.
  0 None
  2 Adlib
  3 Sound Blaster
  4 Pro Audio Spectrum
  5 Gravis UltraSound
  6 WaveBlaster
  7 Sound Canvas
  8 General MIDI
  9 Soud Blaster AWE32
* `snd_sfxdevice`
  Numeric value indicating which kind of card to use for sound effects.
  0  None
  1  PC Speaker
  2  Sound Blaster
  3  Pro Audio Spectrum
  4  Gravis UltraSound
* `snd_sbport`
  I/O Port to use to access the soundblaster card.
* `snd_sbirq`
  IRQ to use to access the soundblaster card.
* `snd_sbdma`
  DMA channel to use when accessing the soundblaster card.
* `snd_mport`
  I/O Port to use to access the music card.

### Other

* `show_messages`
  Boolean value which controls whether messages are displayed in the heads up display. The default is 1 (on)
* `chatmacro0`
  Multiplayer chat macro sent when alt+0 is pressed.
* `chatmacro1`
  Multiplayer chat macro sent when alt+1 is pressed.
* `chatmacro2`
  Multiplayer chat macro sent when alt+2 is pressed.
* `chatmacro3`
  Multiplayer chat macro sent when alt+3 is pressed.
* `chatmacro4`
  Multiplayer chat macro sent when alt+4 is pressed.
* `chatmacro5`
  Multiplayer chat macro sent when alt+5 is pressed.
* `chatmacro6`
  Multiplayer chat macro sent when alt+6 is pressed.
* `chatmacro7`
  Multiplayer chat macro sent when alt+7 is pressed.
* `chatmacro8`
  Multiplayer chat macro sent when alt+8 is pressed.
* `chatmacro9`
  Multiplayer chat macro sent when alt+9 is pressed.

### Additional settings

The `joyb_speed` setting can be set to 29 to make the player always run in most Doom versions and Doom engine games. Originally it was discovered that setting the value to 31 would produce the effect, but that value does not work on the engines of some games, such as Final Doom, Heretic, and Strife. Doom v1.0 is noteworthy in that neither 29 nor 31 enables autorun; the only currently known working value is 2029.

The configuration file can be used to set the mouse sensitivity above the regular maximum of 9, though note that setting it to a value higher than 30 will make the game terminate upon entering the options menu.

The configuration file can be rearranged and comments added; however, the game will overwrite any such changes on exit. The file can be made read-only to avoid this problem.
