# Configuration

## Command-line parameters

In general, Mocha Doom supports all of the standard vanilla/DOS Doom command-line
parameters, plus some of its own. Here's the documentation for some that might
be useful:

* `-config`:
  Specify an alternate configuration file to use (default is `default.cfg`).
* `-fullscreen`:
  Can also be specified in the `default.cfg` file with the: `fullscreen true` setting.
  It will attempt switching to a fullscreen mode compatible with the current 
  resolution, or the closest available reported by the host OS.
  NOTE: Windows users might have to disable the Direct3D pipeline
  with the `-Dsun.java2d.d3d=false` JVM parameter for this to work.
* `-truecolor`:
  Uses the all-new truecolor renderering mode, an enhancement that combines the
  oldschool renderer's look with true 24-bit depth colormaps and lighting.
* `-hicolor`:
  Uses the all-new hicolor renderering mode, an enhancement that restores the
  look and feel of the historical Doom v0.4 Alpha's HiColor mode,
  with 15-bit color depth and lighting.
* `-oldawtevents`:
  Forces using the older awt event handling system.
  Use it only if the new default one gives you trouble.
* `-novert [disable]`:
  By default, vertical mouse movement for the player will
  be disabled, unless you use the `-novert disable` command.
* `-grabmouse`:
  Forces a more aggressive way of keeping the mouse
  confined in the game window. Only used with `-oldawtevents`,
  where it's turned OFF by default. Otherwise, it's not effective.
* `-multiply <n>`:
  Multiplies the base resolution by n times. Acceptable
  values are 1-5. Base resolution is 320x200, default is `-multiply 3`
  unless overriden. Has priority over `-height` and `-width`
* `-width <x>`:
  Specifies window width to use e.g. `-width 640`.
  For now, this will be forbily set to the closest multiple
  of the base width, which is 320 pixels, so actual values 
  are only 320, 640, 960, etc. with a maximum of 5 times 
  the base width.
* `-height <y>`:
  Similar to `-width`, but operates on height. Base height
  is 200 pixels, so actual values are only 200, 400, 600,
  etc. If both are used, the one which yield the largest
  scaling will be used (scaling is isotropic).
* `-file <file1> [file2] ...`:
  Used to append PWADs. Can accept multiple files and 
  quoted names in a row, except names starting with '-' and '+'.
* `-iwad <iwad_file>`:
  Allows specifying which IWAD to use
* `-millis`:
  Uses system  millisecond accuracy for the timer.
  Default is nanosecond accuracy, but you may wish 
  to change it if you get timing issues e.g. with
  certain older AMD Athlon 64 X2 CPUs.
* `-fasttic`:
  Plays as fast as possible without cancelling adaptiveness, by using an as fast
  as possible timer. Useless unless you want to greatly speed up game time or something.
* `-serialrender`:
  Selects the (default) serial rendering code. This is OK for most machines.
* `-parallelrenderer [m] [n]`:
  Selects the parallel rendering code, which can be up to 100% 
  faster on multicore machines, depending on the scene being 
  rendered. The optional parameters m and n specify the number 
  of wall and floor rendering threads to use.
  The default values are 2 and 1 respectively.
* `-fastdemo <demolump>`:
  Plays an external demo lump as fast as possible, skipping
  frames if not necessary.
* `-timedemo <demolump>`:
  Plays an external demo lump as fast as possible but by rendering every frame.
* `-playdemo <demolump>`:
  Plays back an external demo at normal speed.
* `-record <demolump>`:
  Records a demo. These demos are generally not very compatible
  with other ports in most cases, even though they are in vanilla
  Doom format, so use at your own risk.
* `-nosound`:
  Entirely shuts off sound and music.
* `-nosfx`:
  Disables sound effects.
* `-nomusic`:
  Disables music
* `-audiolines`:
  Uses a multithreaded, AudioLine based sound effects driver.
* `-clipsounds`:
  Uses a Clip-based sound effects driver.
* `-speakersound`:
  PC speaker emulation (uses default sound driver)
* `+map <ExMy> or <MAPxy>`:
  Warps to the specified Episode and Mission (e.g. E1M9) or
  game map (for Doom II, e.g. MAP31).

NOTE: Demo lumps are automatically appended a `.lmp` extension upon loading/saving.
DO NOT SPECIFY IT YOURSELF, otherwise it will result in a load error.

## Configuration file

The Doom configuration file is a text file which holds settings set by `setup.exe` and from inside the game and its menus.
The file is normally named `default.cfg`, but the `-config` command line parameter can be used to specify an alternate file to use.

The file takes the format of a list of configuration settings, with each line of the form: `<name> <value>`

### Settings

#### Display

* `screenblocks`:
  Controls the screensize, ranging from 3–11. A value of 10 gives a fullscreen window with the status bar, while 11 gives fullscreen without status bar. The default value is 9.
* `detaillevel`:
  Boolean value which controls the resolution of the screen. The logic here is inverted: 0 is high resolution, while 1 is low resolution.
* `usegamma`:
  Gamma correction setting. This ranges from 0–4, with 0 representing no gamma correction, while 4 gives maximum gamma correction. The default value is 0.

#### Joystick

* `use_joystick`:
  Boolean value used to control whether the joystick is enabled. Default is 0 (off).
* `joyb_fire`:
  Joystick button used to make the player attack.
* `joyb_use`:
  Joystick button used to make the player "use" (activate switches, open doors, etc).
* `joyb_speed`:
  Joystick button used to make the player run. Can also be used to activate always run.
* `joyb_strafe`:
  Joystick button used to make the player strafe.

#### Keyboard

* `key_right`:
  Keyboard scan code of the key used to turn the player to the right.
* `key_left`:
  Keyboard scan code of the key used to turn the player to the left.
* `key_up`:
  Keyboard scan code of the key used to move the player forward.
* `key_down`:
  Keyboard scan code of the key used to move the player backwards.
* `key_strafeleft`:
  Keyboard scan code of the key used to make the player strafe left.
* `key_straferight`:
  Keyboard scan code of the key used to make the player strafe right.
* `key_fire`:
  Keyboard scan code of the key used to make the player attack.
* `key_use`:
  Keyboard scan code of the "use" key (key used to open doors, activate switches, etc).
* `key_strafe`:
  Keyboard scan code of the key used to make the player strafe rather than turn.
* `key_speed`:
  Keyboard scan code of the key used to make the player run.

#### Mouse

* `use_mouse`:
  Boolean value used to control whether the mouse is enabled. Default is 1 (on).
* `mouseb_fire`:
  Mouse button used to make the player attack.
* `mouseb_strafe`:
  Mouse button used to make the player strafe.
* `mouseb_forward`:
  Mouse button used to make the player move forward.
* `mouse_sensitivity`:
  Numerical value storing the value of the mouse sensitivity setting. The default value is "5".

#### Sound

* `sfx_volume`:
  The volume of sound effects, ranging from 0–15. The default is 8.
* `music_volume`:
  The volume of the background music, ranging from 0–15. The default is 8.
* `snd_channels`:
  The number of sound channels to use. The default is 3.
* `snd_musicdevice`:
  Numeric value indicating which kind of music card is installed:
  (0) None
  (2) Adlib
  (3) Sound Blaster
  (4) Pro Audio Spectrum
  (5) Gravis UltraSound
  (6) WaveBlaster
  (7) Sound Canvas
  (8) General MIDI
  (9) Soud Blaster AWE32
* `snd_sfxdevice`:
  Numeric value indicating which kind of card to use for sound effects:
  (0) None
  (1) PC Speaker
  (2) Sound Blaster
  (3) Pro Audio Spectrum
  (4) Gravis UltraSound
* `snd_sbport`:
  I/O Port to use to access the soundblaster card.
* `snd_sbirq`:
  IRQ to use to access the soundblaster card.
* `snd_sbdma`:
  DMA channel to use when accessing the soundblaster card.
* `snd_mport`:
  I/O Port to use to access the music card.

#### Other

* `show_messages`:
  Boolean value which controls whether messages are displayed in the heads up display. The default is 1 (on)
* `chatmacro0`:
  Multiplayer chat macro sent when alt+0 is pressed.
* `chatmacro1`:
  Multiplayer chat macro sent when alt+1 is pressed.
* `chatmacro2`:
  Multiplayer chat macro sent when alt+2 is pressed.
* `chatmacro3`:
  Multiplayer chat macro sent when alt+3 is pressed.
* `chatmacro4`:
  Multiplayer chat macro sent when alt+4 is pressed.
* `chatmacro5`:
  Multiplayer chat macro sent when alt+5 is pressed.
* `chatmacro6`:
  Multiplayer chat macro sent when alt+6 is pressed.
* `chatmacro7`:
  Multiplayer chat macro sent when alt+7 is pressed.
* `chatmacro8`:
  Multiplayer chat macro sent when alt+8 is pressed.
* `chatmacro9`:
  Multiplayer chat macro sent when alt+9 is pressed.

### Additional settings

The `joyb_speed` setting can be set to 29 to make the player always run in most Doom versions and Doom engine games.
Originally it was discovered that setting the value to 31 would produce the effect, but that value does not work on the engines of some games,
such as Final Doom, Heretic, and Strife.
Doom v1.0 is noteworthy in that neither 29 nor 31 enables autorun; the only currently known working value is 2029.

The configuration file can be used to set the mouse sensitivity above the regular maximum of 9,
though note that setting it to a value higher than 30 will make the game terminate upon entering the options menu.

The configuration file can be rearranged and comments added; however, the game will overwrite any such changes on exit.
The file can be made read-only to avoid this problem.

